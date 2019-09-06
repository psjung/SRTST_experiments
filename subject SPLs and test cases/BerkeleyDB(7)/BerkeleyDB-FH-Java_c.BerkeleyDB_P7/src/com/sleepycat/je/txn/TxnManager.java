package com.sleepycat.je.txn; 
import java.util.Collections; 
import java.util.HashMap; 
import java.util.HashSet; 
import java.util.Iterator; 
import java.util.Map; 
import java.util.Set; 
import javax.transaction.xa.Xid; 
import com.sleepycat.je.DatabaseException; 
import com.sleepycat.je.LockStats; 
import com.sleepycat.je.Transaction; 
import com.sleepycat.je.TransactionConfig; 
import com.sleepycat.je.dbi.EnvironmentImpl; 
import com.sleepycat.je.dbi.MemoryBudget; 
import com.sleepycat.je.utilint.DbLsn; 
import de.ovgu.cide.jakutil.*; 
import com.sleepycat.je.StatsConfig; 
import com.sleepycat.je.TransactionStats; 
public   class  TxnManager {
	
  static final long NULL_TXN_ID=-1;

	
  private static final String DEBUG_NAME=TxnManager.class.getName();

	
  private LockManager lockManager;

	
  private EnvironmentImpl env;

	
  private Set allTxns;

	
  private Map allXATxns;

	
  private Map thread2Txn;

	
  private long lastUsedTxnId;

	
  private int nActiveSerializable;

	
  public TxnManager(  EnvironmentImpl env) throws DatabaseException {
    this.hook822(env);
    this.env=env;
    allTxns=new HashSet();
    this.hook821(env);
    allXATxns=Collections.synchronizedMap(new HashMap());
    thread2Txn=Collections.synchronizedMap(new HashMap());
    this.hook824();
    lastUsedTxnId=0;
  }

	
  /** 
 * Set the txn id sequence.
 */
  synchronized public void setLastTxnId(  long lastId){
    this.lastUsedTxnId=lastId;
  }

	
  /** 
 * Get the last used id, for checkpoint info.
 */
  public synchronized long getLastTxnId(){
    return lastUsedTxnId;
  }

	
  /** 
 * Get the next transaction id to use.
 */
  synchronized long incTxnId(){
    return ++lastUsedTxnId;
  }

	
  /** 
 * Create a new transaction.
 * @param parentfor nested transactions, not yet supported
 * @param txnConfigspecifies txn attributes
 * @return the new txn
 */
  public Txn txnBegin(  Transaction parent,  TransactionConfig txnConfig) throws DatabaseException {
    if (parent != null) {
      throw new DatabaseException("Nested transactions are not supported yet.");
    }
    return new Txn(env,txnConfig);
  }

	
  /** 
 * Give transactions and environment access to lock manager.
 */
  public LockManager getLockManager(){
    return lockManager;
  }

	
  /** 
 * Called when txn is created.
 */
  void registerTxn(  Txn txn) throws DatabaseException {
    allTxns.add(txn);
    if (txn.isSerializableIsolation()) {
      nActiveSerializable++;
    }
  }

	
  /** 
 * Called when txn ends.
 */
  void unRegisterTxn(  Txn txn,  boolean isCommit) throws DatabaseException {
    allTxns.remove(txn);
    this.hook828(txn);
    this.hook825(isCommit);
    if (txn.isSerializableIsolation()) {
      nActiveSerializable--;
    }
  }

	
  /** 
 * Called when txn is created.
 */
  public void registerXATxn(  Xid xid,  Txn txn,  boolean isPrepare) throws DatabaseException {
    if (!allXATxns.containsKey(xid)) {
      allXATxns.put(xid,txn);
      this.hook829();
    }
    this.hook826(isPrepare);
  }

	
  /** 
 * Called when txn ends.
 */
  void unRegisterXATxn(  Xid xid,  boolean isCommit) throws DatabaseException {
    if (allXATxns.remove(xid) == null) {
      throw new DatabaseException("XA Transaction " + xid + " can not be unregistered.");
    }
    this.hook830();
    this.hook827(isCommit);
  }

	
  /** 
 * Retrieve a Txn object from an Xid.
 */
  public Txn getTxnFromXid(  Xid xid) throws DatabaseException {
    return (Txn)allXATxns.get(xid);
  }

	
  /** 
 * Called when txn is assoc'd with this thread.
 */
  public void setTxnForThread(  Transaction txn){
    Thread curThread=Thread.currentThread();
    thread2Txn.put(curThread,txn);
  }

	
  /** 
 * Called when txn is assoc'd with this thread.
 */
  public Transaction unsetTxnForThread() throws DatabaseException {
    Thread curThread=Thread.currentThread();
    return (Transaction)thread2Txn.remove(curThread);
  }

	
  /** 
 * Retrieve a Txn object for this Thread.
 */
  public Transaction getTxnForThread() throws DatabaseException {
    return (Transaction)thread2Txn.get(Thread.currentThread());
  }

	
  public Xid[] XARecover() throws DatabaseException {
    Set xidSet=allXATxns.keySet();
    Xid[] ret=new Xid[xidSet.size()];
    ret=(Xid[])xidSet.toArray(ret);
    return ret;
  }

	
  /** 
 * Returns whether there are any active serializable transactions, excluding
 * the transaction given (if non-null). This is intentionally returned
 * without latching, since latching would not make the act of reading an
 * integer more atomic than it already is.
 */
  public boolean areOtherSerializableTransactionsActive(  Locker excludeLocker){
    int exclude=(excludeLocker != null && excludeLocker.isSerializableIsolation()) ? 1 : 0;
    return (nActiveSerializable - exclude > 0);
  }

	
  /** 
 * Get the earliest LSN of all the active transactions, for checkpoint.
 */
  public long getFirstActiveLsn() throws DatabaseException {
    long firstActive=DbLsn.NULL_LSN;
    firstActive=this.hook823(firstActive);
    return firstActive;
  }

	
  protected void hook821(  EnvironmentImpl env) throws DatabaseException {
  }

	
  protected void hook822(  EnvironmentImpl env) throws DatabaseException {
    if (env.isNoLocking()) {
      lockManager=new DummyLockManager(env);
    }
 else {
      lockManager=new SyncedLockManager(env);
    }
  }

	
  protected long hook823(  long firstActive) throws DatabaseException {
    Iterator iter=allTxns.iterator();
    while (iter.hasNext()) {
      long txnFirstActive=((Txn)iter.next()).getFirstActiveLsn();
      if (firstActive == DbLsn.NULL_LSN) {
        firstActive=txnFirstActive;
      }
 else       if (txnFirstActive != DbLsn.NULL_LSN) {
        if (DbLsn.compareTo(txnFirstActive,firstActive) < 0) {
          firstActive=txnFirstActive;
        }
      }
    }
    return firstActive;
  }

	
   private void  hook824__wrappee__base  () throws DatabaseException {
  }

	
  protected void hook824() throws DatabaseException {
    numCommits=0;
    numAborts=0;
    numXAPrepares=0;
    numXACommits=0;
    numXAAborts=0;
    hook824__wrappee__base();
  }

	
   private void  hook825__wrappee__base  (  boolean isCommit) throws DatabaseException {
  }

	
  protected void hook825(  boolean isCommit) throws DatabaseException {
    if (isCommit) {
      numCommits++;
    }
 else {
      numAborts++;
    }
    hook825__wrappee__base(isCommit);
  }

	
   private void  hook826__wrappee__base  (  boolean isPrepare) throws DatabaseException {
  }

	
  protected void hook826(  boolean isPrepare) throws DatabaseException {
    if (isPrepare) {
      numXAPrepares++;
    }
    hook826__wrappee__base(isPrepare);
  }

	
   private void  hook827__wrappee__base  (  boolean isCommit) throws DatabaseException {
  }

	
  protected void hook827(  boolean isCommit) throws DatabaseException {
    if (isCommit) {
      numXACommits++;
    }
 else {
      numXAAborts++;
    }
    hook827__wrappee__base(isCommit);
  }

	
  protected void hook828(  Txn txn) throws DatabaseException {
  }

	
  protected void hook829() throws DatabaseException {
  }

	
  protected void hook830() throws DatabaseException {
  }

	
  private int numCommits;

	
  private int numAborts;

	
  private int numXAPrepares;

	
  private int numXACommits;

	
  private int numXAAborts;

	
  /** 
 * Collect transaction related stats.
 */
  public TransactionStats txnStat(  StatsConfig config) throws DatabaseException {
    TransactionStats stats=new TransactionStats();
    this.hook820(config,stats);
    return stats;
  }

	
  /** 
 * Collect lock related stats.
 */
  public LockStats lockStat(  StatsConfig config) throws DatabaseException {
    return lockManager.lockStat(config);
  }

	
  protected void hook820(  StatsConfig config,  TransactionStats stats) throws DatabaseException {
    stats.setNCommits(numCommits);
    stats.setNAborts(numAborts);
    stats.setNXAPrepares(numXAPrepares);
    stats.setNXACommits(numXACommits);
    stats.setNXAAborts(numXAAborts);
    stats.setNActive(allTxns.size());
    TransactionStats.Active[] activeSet=new TransactionStats.Active[stats.getNActive()];
    stats.setActiveTxns(activeSet);
    Iterator iter=allTxns.iterator();
    int i=0;
    while (iter.hasNext()) {
      Locker txn=(Locker)iter.next();
      activeSet[i]=new TransactionStats.Active(txn.toString(),txn.getId(),0);
      i++;
    }
    if (config.getClear()) {
      numCommits=0;
      numAborts=0;
      numXACommits=0;
      numXAAborts=0;
    }
  }


}
