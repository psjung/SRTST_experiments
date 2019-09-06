package com.sleepycat.je.txn; 
import java.nio.ByteBuffer; 
import java.util.HashMap; 
import java.util.HashSet; 
import java.util.Iterator; 
import java.util.Map; 
import java.util.Set; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.transaction.xa.XAResource; 
import javax.transaction.xa.Xid; 
import com.sleepycat.je.Database; 
import com.sleepycat.je.DatabaseException; 
import com.sleepycat.je.DbInternal; 
import com.sleepycat.je.LockStats; 
import com.sleepycat.je.RunRecoveryException; 
import com.sleepycat.je.TransactionConfig; 
import com.sleepycat.je.dbi.CursorImpl; 
import com.sleepycat.je.dbi.DatabaseId; 
import com.sleepycat.je.dbi.DatabaseImpl; 
import com.sleepycat.je.dbi.EnvironmentImpl; 
import com.sleepycat.je.dbi.MemoryBudget; 
import com.sleepycat.je.log.LogManager; 
import com.sleepycat.je.log.LogReadable; 
import com.sleepycat.je.log.LogUtils; 
import com.sleepycat.je.log.LogWritable; 
import com.sleepycat.je.log.entry.LNLogEntry; 
import com.sleepycat.je.recovery.RecoveryManager; 
import com.sleepycat.je.tree.LN; 
import com.sleepycat.je.tree.TreeLocation; 
import com.sleepycat.je.utilint.DbLsn; 
import com.sleepycat.je.utilint.Tracer; 
import de.ovgu.cide.jakutil.*; 
public   class  Txn  extends Locker  implements LogWritable, LogReadable {
	
  public static final byte TXN_NOSYNC=0;

	
  public static final byte TXN_WRITE_NOSYNC=1;

	
  public static final byte TXN_SYNC=2;

	
  private static final String DEBUG_NAME=Txn.class.getName();

	
  private byte txnState;

	
  private CursorImpl cursorSet;

	
  private static final byte USABLE=0;

	
  private static final byte CLOSED=1;

	
  private static final byte ONLY_ABORTABLE=2;

	
  private static final byte STATE_BITS=3;

	
  private static final byte IS_PREPARED=4;

	
  private static final byte XA_SUSPENDED=8;

	
  private Set readLocks;

	
  private Map writeInfo;

	
  private Map undoDatabases;

	
  private long lastLoggedLsn=DbLsn.NULL_LSN;

	
  private long firstLoggedLsn=DbLsn.NULL_LSN;

	
  private byte defaultFlushSyncBehavior;

	
  private boolean serializableIsolation;

	
  private boolean readCommittedIsolation;

	
  private int inMemorySize;

	
  public static int ACCUMULATED_LIMIT=10000;

	
  /** 
 * Create a transaction from Environment.txnBegin.
 */
  public Txn(  EnvironmentImpl envImpl,  TransactionConfig config) throws DatabaseException {
    super(envImpl,config.getReadUncommitted(),config.getNoWait());
    init(envImpl,config);
  }

	
  public Txn(  EnvironmentImpl envImpl,  TransactionConfig config,  long id) throws DatabaseException {
    super(envImpl,config.getReadUncommitted(),config.getNoWait());
    init(envImpl,config);
    this.id=id;
  }

	
  private void init(  EnvironmentImpl envImpl,  TransactionConfig config) throws DatabaseException {
    serializableIsolation=config.getSerializableIsolation();
    readCommittedIsolation=config.getReadCommitted();
    if (config.getSync()) {
      defaultFlushSyncBehavior=TXN_SYNC;
    }
 else     if (config.getWriteNoSync()) {
      defaultFlushSyncBehavior=TXN_WRITE_NOSYNC;
    }
 else     if (config.getNoSync()) {
      defaultFlushSyncBehavior=TXN_NOSYNC;
    }
 else {
      defaultFlushSyncBehavior=TXN_SYNC;
    }
    lastLoggedLsn=DbLsn.NULL_LSN;
    firstLoggedLsn=DbLsn.NULL_LSN;
    txnState=USABLE;
    this.hook809();
    this.envImpl.getTxnManager().registerTxn(this);
  }

	
  /** 
 * Constructor for reading from log.
 */
  public Txn(){
    lastLoggedLsn=DbLsn.NULL_LSN;
  }

	
  /** 
 * UserTxns get a new unique id for each instance.
 */
  protected long generateId(  TxnManager txnManager){
    return txnManager.incTxnId();
  }

	
  /** 
 * Access to last LSN.
 */
  long getLastLsn(){
    return lastLoggedLsn;
  }

	
  public void setPrepared(  boolean prepared){
    if (prepared) {
      txnState|=IS_PREPARED;
    }
 else {
      txnState&=~IS_PREPARED;
    }
  }

	
  public void setSuspended(  boolean suspended){
    if (suspended) {
      txnState|=XA_SUSPENDED;
    }
 else {
      txnState&=~XA_SUSPENDED;
    }
  }

	
  public boolean isSuspended(){
    return (txnState & XA_SUSPENDED) != 0;
  }

	
  /** 
 * Gets a lock on this nodeId and, if it is a write lock, saves an abort
 * LSN.  Caller will set the abortLsn later, after the write lock has been
 * obtained.
 * @see Locker#lockInternal
 * @Override
 */
  LockResult lockInternal(  long nodeId,  LockType lockType,  boolean noWait,  DatabaseImpl database) throws DatabaseException {
    long timeout=0;
    boolean useNoWait=noWait || defaultNoWait;
synchronized (this) {
      checkState(false);
      if (!useNoWait) {
        timeout=lockTimeOutMillis;
      }
    }
    LockGrantType grant=lockManager.lock(nodeId,this,lockType,timeout,useNoWait,database);
    WriteLockInfo info=null;
    if (writeInfo != null) {
      if (grant != LockGrantType.DENIED && lockType.isWriteLock()) {
synchronized (this) {
          info=(WriteLockInfo)writeInfo.get(new Long(nodeId));
          undoDatabases.put(database.getId(),database);
        }
      }
    }
    return new LockResult(grant,info);
  }

	
  public int prepare(  Xid xid) throws DatabaseException {
    if ((txnState & IS_PREPARED) != 0) {
      throw new DatabaseException("prepare() has already been called for Transaction " + id + ".");
    }
synchronized (this) {
      checkState(false);
      if (checkCursorsForClose()) {
        throw new DatabaseException("Transaction " + id + " prepare failed because there were open cursors.");
      }
      TxnPrepare prepareRecord=new TxnPrepare(id,xid);
      LogManager logManager=envImpl.getLogManager();
      logManager.logForceFlush(prepareRecord,true);
    }
    setPrepared(true);
    return XAResource.XA_OK;
  }

	
  public void commit(  Xid xid) throws DatabaseException {
    commit(TXN_SYNC);
    envImpl.getTxnManager().unRegisterXATxn(xid,true);
    return;
  }

	
  public void abort(  Xid xid) throws DatabaseException {
    abort(true);
    envImpl.getTxnManager().unRegisterXATxn(xid,false);
    return;
  }

	
  /** 
 * Call commit() with the default sync configuration property.
 */
  public long commit() throws DatabaseException {
    return commit(defaultFlushSyncBehavior);
  }

	
  /** 
 * Commit this transaction
 * 1. Releases read locks
 * 2. Writes a txn commit record into the log
 * 3. Flushes the log to disk.
 * 4. Add deleted LN info to IN compressor queue
 * 5. Release all write locks 
 * If any step of this fails, we must convert this transaction to an abort.
 */
  public long commit(  byte flushSyncBehavior) throws DatabaseException {
    try {
      long commitLsn=DbLsn.NULL_LSN;
synchronized (this) {
        checkState(false);
        if (checkCursorsForClose()) {
          throw new DatabaseException("Transaction " + id + " commit failed because there were open cursors.");
        }
        if (handleLockToHandleMap != null) {
          Iterator handleLockIter=handleLockToHandleMap.entrySet().iterator();
          while (handleLockIter.hasNext()) {
            Map.Entry entry=(Map.Entry)handleLockIter.next();
            transferHandleLockToHandleSet((Long)entry.getKey(),(Set)entry.getValue());
          }
        }
        LogManager logManager=envImpl.getLogManager();
        int numReadLocks=clearReadLocks();
        int numWriteLocks=0;
        if (writeInfo != null) {
          numWriteLocks=writeInfo.size();
          TxnCommit commitRecord=new TxnCommit(id,lastLoggedLsn);
          if (flushSyncBehavior == TXN_SYNC) {
            commitLsn=logManager.logForceFlush(commitRecord,true);
          }
 else           if (flushSyncBehavior == TXN_WRITE_NOSYNC) {
            commitLsn=logManager.logForceFlush(commitRecord,false);
          }
 else {
            commitLsn=logManager.log(commitRecord);
          }
          this.hook806();
          Set alreadyCountedLsnSet=new HashSet();
          Iterator iter=writeInfo.values().iterator();
          while (iter.hasNext()) {
            WriteLockInfo info=(WriteLockInfo)iter.next();
            lockManager.release(info.lock,this);
            if (info.abortLsn != DbLsn.NULL_LSN && !info.abortKnownDeleted) {
              Long longLsn=new Long(info.abortLsn);
              if (!alreadyCountedLsnSet.contains(longLsn)) {
                logManager.countObsoleteNode(info.abortLsn,null);
                alreadyCountedLsnSet.add(longLsn);
              }
            }
          }
          writeInfo=null;
          this.hook803();
        }
        traceCommit(numWriteLocks,numReadLocks);
      }
      this.hook805();
      close(true);
      return commitLsn;
    }
 catch (    RunRecoveryException e) {
      throw e;
    }
catch (    Throwable t) {
      try {
        abortInternal(flushSyncBehavior == TXN_SYNC,!(t instanceof DatabaseException));
        this.hook800(t);
      }
 catch (      Throwable abortT2) {
        throw new DatabaseException("Failed while attempting to commit transaction " + id + ". The attempt to abort and clean up also failed. "+ "The original exception seen from commit = "+ t.getMessage()+ " The exception from the cleanup = "+ abortT2.getMessage(),t);
      }
      throw new DatabaseException("Failed while attempting to commit transaction " + id + ", aborted instead. Original exception = "+ t.getMessage(),t);
    }
  }

	
  /** 
 * Abort this transaction. Steps are:
 * 1. Release LN read locks.
 * 2. Write a txn abort entry to the log. This is only for log
 * file cleaning optimization and there's no need to guarantee a
 * flush to disk.  
 * 3. Find the last LN log entry written for this txn, and use that
 * to traverse the log looking for nodes to undo. For each node,
 * use the same undo logic as recovery to rollback the transaction. Note
 * that we walk the log in order to undo in reverse order of the
 * actual operations. For example, suppose the txn did this:
 * delete K1/D1 (in LN 10)
 * create K1/D1 (in LN 20)
 * If we process LN10 before LN 20, we'd inadvertently create a 
 * duplicate tree of "K1", which would be fatal for the mapping tree.
 * 4. Release the write lock for this LN.
 */
  public long abort(  boolean forceFlush) throws DatabaseException {
    return abortInternal(forceFlush,true);
  }

	
  private long abortInternal(  boolean forceFlush,  boolean writeAbortRecord) throws DatabaseException {
    try {
      int numReadLocks;
      int numWriteLocks;
      long abortLsn;
synchronized (this) {
        checkState(true);
        TxnAbort abortRecord=new TxnAbort(id,lastLoggedLsn);
        abortLsn=DbLsn.NULL_LSN;
        if (writeInfo != null) {
          if (writeAbortRecord) {
            if (forceFlush) {
              abortLsn=envImpl.getLogManager().logForceFlush(abortRecord,true);
            }
 else {
              abortLsn=envImpl.getLogManager().log(abortRecord);
            }
          }
        }
        undo();
        numReadLocks=(readLocks == null) ? 0 : clearReadLocks();
        this.hook808();
        numWriteLocks=(writeInfo == null) ? 0 : clearWriteLocks();
        this.hook804();
      }
      this.hook807();
synchronized (this) {
        boolean openCursors=checkCursorsForClose();
        this.hook799(numReadLocks,numWriteLocks,openCursors);
        if (openCursors) {
          throw new DatabaseException("Transaction " + id + " detected open cursors while aborting");
        }
        if (handleToHandleLockMap != null) {
          Iterator handleIter=handleToHandleLockMap.keySet().iterator();
          while (handleIter.hasNext()) {
            Database handle=(Database)handleIter.next();
            DbInternal.dbInvalidate(handle);
          }
        }
        return abortLsn;
      }
    }
  finally {
      close(false);
    }
  }

	
  /** 
 * Rollback the changes to this txn's write locked nodes.
 */
  private void undo() throws DatabaseException {
    Long nodeId=null;
    long undoLsn=lastLoggedLsn;
    LogManager logManager=envImpl.getLogManager();
    try {
      Set alreadyUndone=new HashSet();
      TreeLocation location=new TreeLocation();
      while (undoLsn != DbLsn.NULL_LSN) {
        LNLogEntry undoEntry=(LNLogEntry)logManager.getLogEntry(undoLsn);
        LN undoLN=undoEntry.getLN();
        nodeId=new Long(undoLN.getNodeId());
        if (!alreadyUndone.contains(nodeId)) {
          alreadyUndone.add(nodeId);
          DatabaseId dbId=undoEntry.getDbId();
          DatabaseImpl db=(DatabaseImpl)undoDatabases.get(dbId);
          undoLN.postFetchInit(db,undoLsn);
          long abortLsn=undoEntry.getAbortLsn();
          boolean abortKnownDeleted=undoEntry.getAbortKnownDeleted();
          this.hook802(undoLsn,location,undoEntry,undoLN,db,abortLsn,abortKnownDeleted);
          if (!undoLN.isDeleted()) {
            logManager.countObsoleteNode(undoLsn,null);
          }
        }
        undoLsn=undoEntry.getUserTxn().getLastLsn();
      }
    }
 catch (    RuntimeException e) {
      throw new DatabaseException("Txn undo for node=" + nodeId + " LSN="+ DbLsn.getNoFormatString(undoLsn),e);
    }
catch (    DatabaseException e) {
      this.hook801(nodeId,undoLsn,e);
      throw e;
    }
  }

	
  private int clearWriteLocks() throws DatabaseException {
    int numWriteLocks=writeInfo.size();
    Iterator iter=writeInfo.values().iterator();
    while (iter.hasNext()) {
      WriteLockInfo info=(WriteLockInfo)iter.next();
      lockManager.release(info.lock,this);
    }
    writeInfo=null;
    return numWriteLocks;
  }

	
  private int clearReadLocks() throws DatabaseException {
    int numReadLocks=0;
    if (readLocks != null) {
      numReadLocks=readLocks.size();
      Iterator iter=readLocks.iterator();
      while (iter.hasNext()) {
        Lock rLock=(Lock)iter.next();
        lockManager.release(rLock,this);
      }
      readLocks=null;
    }
    return numReadLocks;
  }

	
  /** 
 * Called by the recovery manager when logging a transaction aware object.
 * This method is synchronized by the caller, by being called within the
 * log latch. Record the last LSN for this transaction, to create the
 * transaction chain, and also record the LSN in the write info for abort
 * logic.
 */
  public void addLogInfo(  long lastLsn) throws DatabaseException {
    lastLoggedLsn=lastLsn;
synchronized (this) {
      if (firstLoggedLsn == DbLsn.NULL_LSN) {
        firstLoggedLsn=lastLsn;
      }
    }
  }

	
  /** 
 * @return first logged LSN, to aid recovery rollback.
 */
  long getFirstActiveLsn() throws DatabaseException {
synchronized (this) {
      return firstLoggedLsn;
    }
  }

	
  /** 
 * Add lock to the appropriate queue.
 */
  void addLock(  Long nodeId,  Lock lock,  LockType type,  LockGrantType grantStatus) throws DatabaseException {
    new Txn_addLock(this,nodeId,lock,type,grantStatus).execute();
  }

	
  private void addReadLock(  Lock lock){
    int delta=0;
    if (readLocks == null) {
      readLocks=new HashSet();
      delta=this.hook811(delta);
    }
    readLocks.add(lock);
    this.hook810(delta);
  }

	
  /** 
 * Remove the lock from the set owned by this transaction. If specified to
 * LockManager.release, the lock manager will call this when its releasing
 * a lock. Usually done because the transaction doesn't need to really keep
 * the lock, i.e for a deleted record.
 */
  void removeLock(  long nodeId,  Lock lock) throws DatabaseException {
synchronized (this) {
      if ((readLocks != null) && readLocks.remove(lock)) {
        this.hook812();
      }
 else       if ((writeInfo != null) && (writeInfo.remove(new Long(nodeId)) != null)) {
        this.hook813();
      }
    }
  }

	
  /** 
 * A lock is being demoted. Move it from the write collection into the read
 * collection.
 */
  void moveWriteToReadLock(  long nodeId,  Lock lock){
    boolean found=false;
synchronized (this) {
      if ((writeInfo != null) && (writeInfo.remove(new Long(nodeId)) != null)) {
        found=true;
        this.hook814();
      }
      assert found : "Couldn't find lock for Node " + nodeId + " in writeInfo Map.";
      addReadLock(lock);
    }
  }

	
  /** 
 * @return true if this transaction created this node. We know that this
 * is true if the node is write locked and has a null abort LSN.
 */
  public boolean createdNode(  long nodeId) throws DatabaseException {
    boolean created=false;
synchronized (this) {
      if (writeInfo != null) {
        WriteLockInfo info=(WriteLockInfo)writeInfo.get(new Long(nodeId));
        if (info != null) {
          created=info.createdThisTxn;
        }
      }
    }
    return created;
  }

	
  /** 
 * @return the abortLsn for this node.
 */
  public long getAbortLsn(  long nodeId) throws DatabaseException {
    WriteLockInfo info=null;
synchronized (this) {
      if (writeInfo != null) {
        info=(WriteLockInfo)writeInfo.get(new Long(nodeId));
      }
    }
    if (info == null) {
      return DbLsn.NULL_LSN;
    }
 else {
      return info.abortLsn;
    }
  }

	
  /** 
 * @return the WriteLockInfo for this node.
 */
  public WriteLockInfo getWriteLockInfo(  long nodeId) throws DatabaseException {
    WriteLockInfo info=WriteLockInfo.basicWriteLockInfo;
synchronized (this) {
      if (writeInfo != null) {
        info=(WriteLockInfo)writeInfo.get(new Long(nodeId));
      }
    }
    return info;
  }

	
  /** 
 * Is always transactional.
 */
  public boolean isTransactional(){
    return true;
  }

	
  /** 
 * Is serializable isolation if so configured.
 */
  public boolean isSerializableIsolation(){
    return serializableIsolation;
  }

	
  /** 
 * Is read-committed isolation if so configured.
 */
  public boolean isReadCommittedIsolation(){
    return readCommittedIsolation;
  }

	
  /** 
 * This is a transactional locker.
 */
  public Txn getTxnLocker(){
    return this;
  }

	
  /** 
 * Returns 'this', since this locker holds no non-transactional locks.
 */
  public Locker newNonTxnLocker() throws DatabaseException {
    return this;
  }

	
  /** 
 * This locker holds no non-transactional locks.
 */
  public void releaseNonTxnLocks() throws DatabaseException {
  }

	
  /** 
 * Created transactions do nothing at the end of the operation.
 */
  public void operationEnd() throws DatabaseException {
  }

	
  /** 
 * Created transactions do nothing at the end of the operation.
 */
  public void operationEnd(  boolean operationOK) throws DatabaseException {
  }

	
  /** 
 * Created transactions don't transfer locks until commit.
 */
  public void setHandleLockOwner(  boolean ignore,  Database dbHandle,  boolean dbIsClosing) throws DatabaseException {
    if (dbIsClosing) {
      Long handleLockId=(Long)handleToHandleLockMap.get(dbHandle);
      if (handleLockId != null) {
        Set dbHandleSet=(Set)handleLockToHandleMap.get(handleLockId);
        boolean removed=dbHandleSet.remove(dbHandle);
        assert removed : "Can't find " + dbHandle + " from dbHandleSet";
        if (dbHandleSet.size() == 0) {
          Object foo=handleLockToHandleMap.remove(handleLockId);
          assert (foo != null) : "Can't find " + handleLockId + " from handleLockIdtoHandleMap.";
        }
      }
      unregisterHandle(dbHandle);
    }
 else {
      if (dbHandle != null) {
        DbInternal.dbSetHandleLocker(dbHandle,this);
      }
    }
  }

	
  /** 
 * Cursors operating under this transaction are added to the collection.
 */
  public void registerCursor(  CursorImpl cursor) throws DatabaseException {
synchronized (this) {
      cursor.setLockerNext(cursorSet);
      if (cursorSet != null) {
        cursorSet.setLockerPrev(cursor);
      }
      cursorSet=cursor;
    }
  }

	
  /** 
 * Remove a cursor from the collection.
 */
  public void unRegisterCursor(  CursorImpl cursor) throws DatabaseException {
synchronized (this) {
      CursorImpl prev=cursor.getLockerPrev();
      CursorImpl next=cursor.getLockerNext();
      if (prev == null) {
        cursorSet=next;
      }
 else {
        prev.setLockerNext(next);
      }
      if (next != null) {
        next.setLockerPrev(prev);
      }
      cursor.setLockerPrev(null);
      cursor.setLockerNext(null);
    }
  }

	
  /** 
 * @return true if this txn is willing to give up the handle lock to
 * another txn before this txn ends.
 */
  public boolean isHandleLockTransferrable(){
    return false;
  }

	
  /** 
 * Check if all cursors associated with the txn are closed. If not, those
 * open cursors will be forcibly closed.
 * @return true if open cursors exist
 */
  private boolean checkCursorsForClose() throws DatabaseException {
    CursorImpl c=cursorSet;
    while (c != null) {
      if (!c.isClosed()) {
        return true;
      }
      c=c.getLockerNext();
    }
    return false;
  }

	
  /** 
 * Set the state of a transaction to ONLY_ABORTABLE.
 */
  public void setOnlyAbortable(){
    txnState&=~STATE_BITS;
    txnState|=ONLY_ABORTABLE;
  }

	
  /** 
 * Get the state of a transaction's ONLY_ABORTABLE.
 */
  public boolean getOnlyAbortable(){
    return (txnState & ONLY_ABORTABLE) != 0;
  }

	
  /** 
 * Throw an exception if the transaction is not open.
 * If calledByAbort is true, it means we're being called
 * from abort().
 * Caller must invoke with "this" synchronized.
 */
  protected void checkState(  boolean calledByAbort) throws DatabaseException {
    boolean ok=false;
    boolean onlyAbortable=false;
    byte state=(byte)(txnState & STATE_BITS);
    ok=(state == USABLE);
    onlyAbortable=(state == ONLY_ABORTABLE);
    if (!calledByAbort && onlyAbortable) {
      throw new DatabaseException("Transaction " + id + " must be aborted.");
    }
    if (ok || (calledByAbort && onlyAbortable)) {
      return;
    }
    throw new DatabaseException("Transaction " + id + " has been closed.");
  }

	
  /** 
 */
  private void close(  boolean isCommit) throws DatabaseException {
synchronized (this) {
      txnState&=~STATE_BITS;
      txnState|=CLOSED;
    }
    envImpl.getTxnManager().unRegisterTxn(this,isCommit);
  }

	
  /** 
 * @see LogWritable#getLogSize
 */
  public int getLogSize(){
    return LogUtils.LONG_BYTES + LogUtils.LONG_BYTES;
  }

	
  /** 
 * @see LogWritable#writeToLog
 */
  public void writeToLog(  ByteBuffer logBuffer){
    LogUtils.writeLong(logBuffer,id);
    LogUtils.writeLong(logBuffer,lastLoggedLsn);
  }

	
  /** 
 * @see LogReadable#readFromLogIt's ok for FindBugs to whine about id not being synchronized.
 */
  public void readFromLog(  ByteBuffer logBuffer,  byte entryTypeVersion){
    id=LogUtils.readLong(logBuffer);
    lastLoggedLsn=LogUtils.readLong(logBuffer);
  }

	
  /** 
 * @see LogReadable#dumpLog
 */
  public void dumpLog(  StringBuffer sb,  boolean verbose){
    sb.append("<txn id=\"");
    sb.append(super.toString());
    sb.append("\">");
    sb.append(DbLsn.toString(lastLoggedLsn));
    sb.append("</txn>");
  }

	
  /** 
 * @see LogReadable#getTransactionId
 */
  public long getTransactionId(){
    return getId();
  }

	
  /** 
 * @see LogReadable#logEntryIsTransactional
 */
  public boolean logEntryIsTransactional(){
    return true;
  }

	
  /** 
 * Transfer a single handle lock to the set of corresponding handles at
 * commit time.
 */
  private void transferHandleLockToHandleSet(  Long handleLockId,  Set dbHandleSet) throws DatabaseException {
    int numHandles=dbHandleSet.size();
    Database[] dbHandles=new Database[numHandles];
    dbHandles=(Database[])dbHandleSet.toArray(dbHandles);
    Locker[] destTxns=new Locker[numHandles];
    for (int i=0; i < numHandles; i++) {
      destTxns[i]=new BasicLocker(envImpl);
    }
    long nodeId=handleLockId.longValue();
    lockManager.transferMultiple(nodeId,this,destTxns);
    for (int i=0; i < numHandles; i++) {
      destTxns[i].addToHandleMaps(handleLockId,dbHandles[i]);
      DbInternal.dbSetHandleLocker(dbHandles[i],destTxns[i]);
    }
  }

	
  /** 
 * Send trace messages to the java.util.logger. Don't rely on the logger
 * alone to conditionalize whether we send this message, we don't even want
 * to construct the message if the level is not enabled.  The string
 * construction can be numerous enough to show up on a performance profile.
 */
  private void traceCommit(  int numWriteLocks,  int numReadLocks){
    new Txn_traceCommit(this,numWriteLocks,numReadLocks).execute();
  }

	
  int getInMemorySize(){
    return inMemorySize;
  }

	
  /** 
 * Store information about a DatabaseImpl that will have to be
 * purged at transaction commit or abort. This handles cleanup after
 * operations like Environment.truncateDatabase, 
 * Environment.removeDatabase. Cleanup like this is done outside the
 * usual transaction commit or node undo processing, because
 * the mapping tree is always AutoTxn'ed to avoid deadlock and is 
 * essentially  non-transactional
 */
private static  class  DatabaseCleanupInfo {
		
    DatabaseImpl dbImpl;

		
    boolean deleteAtCommit;

		
    DatabaseCleanupInfo(    DatabaseImpl dbImpl,    boolean deleteAtCommit){
      this.dbImpl=dbImpl;
      this.deleteAtCommit=deleteAtCommit;
    }


	}

	
@MethodObject static  class  Txn_addLock {
		
    Txn_addLock(    Txn _this,    Long nodeId,    Lock lock,    LockType type,    LockGrantType grantStatus){
      this._this=_this;
      this.nodeId=nodeId;
      this.lock=lock;
      this.type=type;
      this.grantStatus=grantStatus;
    }

		
    void execute() throws DatabaseException {
synchronized (_this) {
        this.hook815();
        if (type.isWriteLock()) {
          if (_this.writeInfo == null) {
            _this.writeInfo=new HashMap();
            _this.undoDatabases=new HashMap();
            this.hook818();
          }
          _this.writeInfo.put(nodeId,new WriteLockInfo(lock));
          this.hook817();
          if ((grantStatus == LockGrantType.PROMOTION) || (grantStatus == LockGrantType.WAIT_PROMOTION)) {
            _this.readLocks.remove(lock);
            this.hook819();
          }
          this.hook816();
        }
 else {
          _this.addReadLock(lock);
        }
      }
    }

		
    protected Txn _this;

		
    protected Long nodeId;

		
    protected Lock lock;

		
    protected LockType type;

		
    protected LockGrantType grantStatus;

		
    protected int delta;

		
     private void  hook815__wrappee__base  () throws DatabaseException {
    }

		
    protected void hook815() throws DatabaseException {
      delta=0;
      hook815__wrappee__base();
    }

		
     private void  hook816__wrappee__base  () throws DatabaseException {
    }

		
    protected void hook816() throws DatabaseException {
      _this.updateMemoryUsage(delta);
      hook816__wrappee__base();
    }

		
     private void  hook817__wrappee__base  () throws DatabaseException {
    }

		
    protected void hook817() throws DatabaseException {
      delta+=_this.WRITE_LOCK_OVERHEAD;
      hook817__wrappee__base();
    }

		
     private void  hook818__wrappee__base  () throws DatabaseException {
    }

		
    protected void hook818() throws DatabaseException {
      delta+=MemoryBudget.TWOHASHMAPS_OVERHEAD;
      hook818__wrappee__base();
    }

		
     private void  hook819__wrappee__base  () throws DatabaseException {
    }

		
    protected void hook819() throws DatabaseException {
      delta-=_this.READ_LOCK_OVERHEAD;
      hook819__wrappee__base();
    }


	}

	
@MethodObject static  class  Txn_traceCommit {
		
    Txn_traceCommit(    Txn _this,    int numWriteLocks,    int numReadLocks){
      this._this=_this;
      this.numWriteLocks=numWriteLocks;
      this.numReadLocks=numReadLocks;
    }

		
     private void  execute__wrappee__base  (){
    }

		
    void execute(){
      logger=envImpl.getLogger();
      execute__wrappee__base();
    }

		
    protected Txn _this;

		
    protected int numWriteLocks;

		
    protected int numReadLocks;

		
    protected Logger logger;

		
    protected StringBuffer sb;


	}

	
  protected void hook799(  int numReadLocks,  int numWriteLocks,  boolean openCursors) throws DatabaseException {
  }

	
   private void  hook800__wrappee__base  (  Throwable t) throws DatabaseException, Throwable {
  }

	
  protected void hook800(  Throwable t) throws DatabaseException, Throwable {
    Tracer.trace(envImpl,"Txn","commit","Commit of transaction " + id + " failed",t);
    hook800__wrappee__base(t);
  }

	
   private void  hook801__wrappee__base  (  Long nodeId,  long undoLsn,  DatabaseException e) throws DatabaseException {
  }

	
  protected void hook801(  Long nodeId,  long undoLsn,  DatabaseException e) throws DatabaseException {
    Tracer.trace(envImpl,"Txn","undo","for node=" + nodeId + " LSN="+ DbLsn.getNoFormatString(undoLsn),e);
    hook801__wrappee__base(nodeId,undoLsn,e);
  }

	
   private void  hook802__wrappee__base  (  long undoLsn,  TreeLocation location,  LNLogEntry undoEntry,  LN undoLN,  DatabaseImpl db,  long abortLsn,  boolean abortKnownDeleted) throws DatabaseException, RuntimeException {
    RecoveryManager.undo(Level.FINER,db,location,undoLN,undoEntry.getKey(),undoEntry.getDupKey(),undoLsn,abortLsn,abortKnownDeleted,null,false);
  }

	
  protected void hook802(  long undoLsn,  TreeLocation location,  LNLogEntry undoEntry,  LN undoLN,  DatabaseImpl db,  long abortLsn,  boolean abortKnownDeleted) throws DatabaseException, RuntimeException {
    try {
      hook802__wrappee__base(undoLsn,location,undoEntry,undoLN,db,abortLsn,abortKnownDeleted);
    }
  finally {
      if (location.bin != null) {
        location.bin.releaseLatchIfOwner();
      }
    }
  }

	
   private void  hook803__wrappee__base  () throws DatabaseException, RunRecoveryException, Throwable {
  }

	
  protected void hook803() throws DatabaseException, RunRecoveryException, Throwable {
    if ((deleteInfo != null) && deleteInfo.size() > 0) {
      envImpl.addToCompressorQueue(deleteInfo.values(),false);
      deleteInfo.clear();
    }
    hook803__wrappee__base();
  }

	
   private void  hook804__wrappee__base  () throws DatabaseException {
  }

	
  protected void hook804() throws DatabaseException {
    deleteInfo=null;
    hook804__wrappee__base();
  }

	
   private void  hook805__wrappee__base  () throws DatabaseException, RunRecoveryException, Throwable {
  }

	
  protected void hook805() throws DatabaseException, RunRecoveryException, Throwable {
    cleanupDatabaseImpls(true);
    hook805__wrappee__base();
  }

	
   private void  hook806__wrappee__base  () throws DatabaseException, RunRecoveryException, Throwable {
  }

	
  protected void hook806() throws DatabaseException, RunRecoveryException, Throwable {
    setDeletedDatabaseState(true);
    hook806__wrappee__base();
  }

	
   private void  hook807__wrappee__base  () throws DatabaseException {
  }

	
  protected void hook807() throws DatabaseException {
    cleanupDatabaseImpls(false);
    hook807__wrappee__base();
  }

	
   private void  hook808__wrappee__base  () throws DatabaseException {
  }

	
  protected void hook808() throws DatabaseException {
    setDeletedDatabaseState(false);
    hook808__wrappee__base();
  }

	
   private void  hook809__wrappee__base  () throws DatabaseException {
  }

	
  protected void hook809() throws DatabaseException {
    updateMemoryUsage(MemoryBudget.TXN_OVERHEAD);
    hook809__wrappee__base();
  }

	
   private void  hook810__wrappee__base  (  int delta){
  }

	
  protected void hook810(  int delta){
    delta+=READ_LOCK_OVERHEAD;
    updateMemoryUsage(delta);
    hook810__wrappee__base(delta);
  }

	
   private int  hook811__wrappee__base  (  int delta){
    return delta;
  }

	
  protected int hook811(  int delta){
    delta=MemoryBudget.HASHSET_OVERHEAD;
    return hook811__wrappee__base(delta);
  }

	
   private void  hook812__wrappee__base  () throws DatabaseException {
  }

	
  protected void hook812() throws DatabaseException {
    updateMemoryUsage(0 - READ_LOCK_OVERHEAD);
    hook812__wrappee__base();
  }

	
   private void  hook813__wrappee__base  () throws DatabaseException {
  }

	
  protected void hook813() throws DatabaseException {
    updateMemoryUsage(0 - WRITE_LOCK_OVERHEAD);
    hook813__wrappee__base();
  }

	
   private void  hook814__wrappee__base  (){
  }

	
  protected void hook814(){
    updateMemoryUsage(0 - WRITE_LOCK_OVERHEAD);
    hook814__wrappee__base();
  }

	
  private final int READ_LOCK_OVERHEAD=MemoryBudget.HASHSET_ENTRY_OVERHEAD;

	
  private final int WRITE_LOCK_OVERHEAD=MemoryBudget.HASHMAP_ENTRY_OVERHEAD + MemoryBudget.LONG_OVERHEAD;

	
  private int accumulatedDelta=0;

	
  private void updateMemoryUsage(  int delta){
    inMemorySize+=delta;
    accumulatedDelta+=delta;
    if (accumulatedDelta > ACCUMULATED_LIMIT || accumulatedDelta < -ACCUMULATED_LIMIT) {
      envImpl.getMemoryBudget().updateMiscMemoryUsage(accumulatedDelta);
      accumulatedDelta=0;
    }
  }

	
  int getAccumulatedDelta(){
    return accumulatedDelta;
  }

	
  private Set deletedDatabases;

	
  /** 
 * @param dbImpl databaseImpl to remove
 * @param deleteAtCommit true if this databaseImpl should be cleaned on 
 * commit, false if it should be cleaned on abort.
 * @param mb environment memory budget.
 */
  public void markDeleteAtTxnEnd(  DatabaseImpl dbImpl,  boolean deleteAtCommit) throws DatabaseException {
    new Txn_markDeleteAtTxnEnd(this,dbImpl,deleteAtCommit).execute();
  }

	
  private void setDeletedDatabaseState(  boolean isCommit) throws DatabaseException {
	  //**Space({P2,P4,P5,P6}) - delete
	  if (deletedDatabases != null) {
	//**Space({P2,P4,P5,P6}) - add
//    if (deletedDatabases == null) {
      Iterator iter=deletedDatabases.iterator();
      while (iter.hasNext()) {
        DatabaseCleanupInfo info=(DatabaseCleanupInfo)iter.next();
        //**Space({P2,P4,P5,P6}) - delete
        if (info.deleteAtCommit == isCommit) {
      //**Space({P2,P4,P5,P6}) - add
//        if (info.deleteAtCommit != isCommit) {
          info.dbImpl.startDeleteProcessing();
        }
      }
    }
  }

	
  /** 
 * Cleanup leftover databaseImpls that are a by-product of database
 * operations like removeDatabase(), truncateDatabase().
 * This method must be called outside the synchronization on this txn,
 * because it calls deleteAndReleaseINs, which gets the TxnManager's
 * allTxns latch. The checkpointer also gets the allTxns latch, and within
 * that latch, needs to synchronize on individual txns, so we must avoid a
 * latching hiearchy conflict.
 */
  private void cleanupDatabaseImpls(  boolean isCommit) throws DatabaseException {
    if (deletedDatabases != null) {
      DatabaseCleanupInfo[] infoArray;
synchronized (this) {
        infoArray=new DatabaseCleanupInfo[deletedDatabases.size()];
        deletedDatabases.toArray(infoArray);
      }
      for (int i=0; i < infoArray.length; i+=1) {
        DatabaseCleanupInfo info=infoArray[i];
        if (info.deleteAtCommit == isCommit) {
          info.dbImpl.releaseDeletedINs();
        }
      }
      deletedDatabases=null;
    }
  }

	
@MethodObject static  class  Txn_markDeleteAtTxnEnd {
		
    Txn_markDeleteAtTxnEnd(    Txn _this,    DatabaseImpl dbImpl,    boolean deleteAtCommit){
      this._this=_this;
      this.dbImpl=dbImpl;
      this.deleteAtCommit=deleteAtCommit;
    }

		
    void execute() throws DatabaseException {
synchronized (_this) {
        this.hook797();
        if (_this.deletedDatabases == null) {
          _this.deletedDatabases=new HashSet();
          this.hook798();
        }
        _this.deletedDatabases.add(new DatabaseCleanupInfo(dbImpl,deleteAtCommit));
        this.hook796();
      }
    }

		
    protected Txn _this;

		
    protected DatabaseImpl dbImpl;

		
    protected boolean deleteAtCommit;

		
    protected int delta;

		
     private void  hook796__wrappee__DeleteOp  () throws DatabaseException {
    }

		
    protected void hook796() throws DatabaseException {
      delta+=MemoryBudget.HASHSET_ENTRY_OVERHEAD + MemoryBudget.OBJECT_OVERHEAD;
      _this.updateMemoryUsage(delta);
      hook796__wrappee__DeleteOp();
    }

		
     private void  hook797__wrappee__DeleteOp  () throws DatabaseException {
    }

		
    protected void hook797() throws DatabaseException {
      delta=0;
      hook797__wrappee__DeleteOp();
    }

		
     private void  hook798__wrappee__DeleteOp  () throws DatabaseException {
    }

		
    protected void hook798() throws DatabaseException {
      delta+=MemoryBudget.HASHSET_OVERHEAD;
      hook798__wrappee__DeleteOp();
    }


	}

	
  /** 
 * stats
 */
  public LockStats collectStats(  LockStats stats) throws DatabaseException {
synchronized (this) {
      int nReadLocks=(readLocks == null) ? 0 : readLocks.size();
      stats.setNReadLocks(stats.getNReadLocks() + nReadLocks);
      int nWriteLocks=(writeInfo == null) ? 0 : writeInfo.size();
      stats.setNWriteLocks(stats.getNWriteLocks() + nWriteLocks);
    }
    return stats;
  }


}
