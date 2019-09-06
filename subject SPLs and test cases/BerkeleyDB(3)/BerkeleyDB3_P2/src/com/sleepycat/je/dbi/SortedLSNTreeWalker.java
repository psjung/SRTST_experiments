package com.sleepycat.je.dbi; 
import java.util.Arrays; 
import java.util.HashSet; 
import java.util.Iterator; 
import java.util.Set; 
import com.sleepycat.je.DatabaseException; 
import com.sleepycat.je.cleaner.OffsetList; 
import com.sleepycat.je.log.LogEntryType; 
import com.sleepycat.je.tree.BIN; 
import com.sleepycat.je.tree.DBIN; 
import com.sleepycat.je.tree.DIN; 
import com.sleepycat.je.tree.IN; 
import com.sleepycat.je.tree.Node; 
import com.sleepycat.je.utilint.DbLsn; 
import de.ovgu.cide.jakutil.*; 
public   class  SortedLSNTreeWalker {
	
public  interface  TreeNodeProcessor {
		
    void processLSN(    long childLSN,    LogEntryType childType);


	}

	
  protected DatabaseImpl dbImpl;

	
  private EnvironmentImpl envImpl;

	
  private long rootLsn;

	
  private boolean dups;

	
  private boolean removeINsFromINList;

	
  private boolean setDbState;

	
  private long[] currentLSNs;

	
  private int currentLSNIdx=0;

	
  private OffsetList accumulatedLSNFileNumbers;

	
  private OffsetList accumulatedLSNFileOffsets;

	
  private TreeNodeProcessor callback;

	
  protected boolean accumulateLNs=false;

	
  public SortedLSNTreeWalker(  DatabaseImpl dbImpl,  boolean removeINsFromINList,  boolean setDbState,  long rootLsn,  TreeNodeProcessor callback) throws DatabaseException {
    this.dbImpl=dbImpl;
    this.envImpl=dbImpl.getDbEnvironment();
    if (envImpl == null) {
      throw new DatabaseException("environmentImpl is null for target db " + dbImpl.getDebugName());
    }
    this.dups=dbImpl.getSortedDuplicates();
    this.removeINsFromINList=removeINsFromINList;
    this.setDbState=setDbState;
    this.rootLsn=rootLsn;
    this.callback=callback;
    currentLSNs=new long[0];
    currentLSNIdx=0;
  }

	
  private boolean extractINsForDb(  INList inList) throws DatabaseException {
    return new SortedLSNTreeWalker_extractINsForDb(this,inList).execute();
  }

	
  /** 
 * Find all non-resident nodes, and execute the callback. The root IN's LSN
 * is not returned to the callback.
 */
  public void walk() throws DatabaseException {
    walkInternal();
  }

	
  protected void walkInternal() throws DatabaseException {
    INList inList=envImpl.getInMemoryINs();
    IN root=null;
    if (!extractINsForDb(inList)) {
      if (rootLsn == DbLsn.NULL_LSN) {
        return;
      }
      root=getRootIN(rootLsn);
      accumulateLSNs(root);
      releaseRootIN(root);
    }
    this.hook359();
    while (true) {
      maybeGetMoreINs();
      if (currentLSNs != null && currentLSNIdx < currentLSNs.length) {
        fetchAndProcessLSN(currentLSNs[currentLSNIdx++]);
      }
 else {
        break;
      }
    }
  }

	
  private void maybeGetMoreINs(){
    if ((currentLSNs != null && currentLSNIdx >= currentLSNs.length)) {
      if (accumulatedLSNFileNumbers == null || accumulatedLSNFileNumbers.size() == 0) {
        currentLSNs=null;
        currentLSNIdx=Integer.MAX_VALUE;
        return;
      }
      long[] tempFileNumbers=accumulatedLSNFileNumbers.toArray();
      long[] tempFileOffsets=accumulatedLSNFileOffsets.toArray();
      int nLSNs=tempFileNumbers.length;
      currentLSNIdx=0;
      currentLSNs=new long[nLSNs];
      for (int i=0; i < nLSNs; i++) {
        currentLSNs[i]=DbLsn.makeLsn(tempFileNumbers[i],tempFileOffsets[i]);
      }
      Arrays.sort(currentLSNs);
      accumulatedLSNFileNumbers=null;
      accumulatedLSNFileOffsets=null;
    }
  }

	
  private void accumulateLSNs(  IN in) throws DatabaseException {
    boolean accumulate=true;
    if (!accumulateLNs) {
      if ((!dups && (in instanceof BIN)) || (in instanceof DBIN)) {
        accumulate=false;
      }
    }
    for (int i=0; i < in.getNEntries(); i++) {
      if (in.isEntryPendingDeleted(i) || in.isEntryKnownDeleted(i)) {
        continue;
      }
      long lsn=in.getLsn(i);
      Node node=in.getTarget(i);
      if (accumulate && (node == null)) {
        if (accumulatedLSNFileNumbers == null) {
          accumulatedLSNFileNumbers=new OffsetList();
          accumulatedLSNFileOffsets=new OffsetList();
        }
        accumulatedLSNFileNumbers.add(DbLsn.getFileNumber(lsn),false);
        accumulatedLSNFileOffsets.add(DbLsn.getFileOffset(lsn),false);
        addToLsnINMap(new Long(lsn),in,i);
      }
 else {
        callback.processLSN(lsn,(node == null) ? LogEntryType.LOG_LN : node.getLogType());
      }
    }
    if (in instanceof DIN) {
      if (in.isRoot()) {
        DIN din=(DIN)in;
        callback.processLSN(din.getDupCountLNRef().getLsn(),LogEntryType.LOG_DUPCOUNTLN);
      }
    }
  }

	
  private void fetchAndProcessLSN(  long lsn) throws DatabaseException {
    Node node=fetchLSN(lsn);
    if (node != null) {
      callback.processLSN(lsn,node.getLogType());
      if (node instanceof IN) {
        accumulateLSNs((IN)node);
      }
    }
  }

	
  /** 
 * The default behavior fetches the rootIN from the log, but classes
 * extending this may fetch the root from the tree.
 */
  protected IN getRootIN(  long rootLsn) throws DatabaseException {
    return (IN)envImpl.getLogManager().get(rootLsn);
  }

	
  protected void releaseRootIN(  IN ignore) throws DatabaseException {
  }

	
  protected void addToLsnINMap(  Long lsn,  IN in,  int index){
  }

	
  protected Node fetchLSN(  long lsn) throws DatabaseException {
    return (Node)envImpl.getLogManager().get(lsn);
  }

	
@MethodObject static  class  SortedLSNTreeWalker_extractINsForDb {
		
    SortedLSNTreeWalker_extractINsForDb(    SortedLSNTreeWalker _this,    INList inList){
      this._this=_this;
      this.inList=inList;
    }

		
     private boolean  execute__wrappee__base  () throws DatabaseException {
      foundSome=false;
      foundSet=new HashSet();
      this.hook360();
      this.hook356();
      try {
        this.hook357();
        iter=inList.iterator();
        while (iter.hasNext()) {
          thisIN=(IN)iter.next();
          if (thisIN.getDatabase() == _this.dbImpl) {
            foundSome=true;
            if (_this.removeINsFromINList) {
              iter.remove();
              this.hook361();
            }
            foundSet.add(thisIN);
          }
        }
      }
 catch (      DatabaseException e) {
        this.hook362();
        throw e;
      }
 finally {
        this.hook358();
      }
      if (foundSome) {
        iter1=foundSet.iterator();
        while (iter1.hasNext()) {
          thisIN1=(IN)iter1.next();
          _this.accumulateLSNs(thisIN1);
        }
      }
      foundSet=null;
      return foundSome;
    }

		
    boolean execute() throws DatabaseException {
      boolean result=execute__wrappee__base();
      mb.updateTreeMemoryUsage(memoryChange);
      return result;
    }

		
    protected SortedLSNTreeWalker _this;

		
    protected INList inList;

		
    protected boolean foundSome;

		
    protected Set foundSet;

		
    protected long memoryChange;

		
    protected MemoryBudget mb;

		
    protected Iterator iter;

		
    protected IN thisIN;

		
    protected Iterator iter1;

		
    protected IN thisIN1;

		
     private void  hook356__wrappee__base  () throws DatabaseException {
    }

		
    protected void hook356() throws DatabaseException {
      inList.latchMajor();
      hook356__wrappee__base();
    }

		
     private void  hook357__wrappee__base  () throws DatabaseException {
    }

		
    protected void hook357() throws DatabaseException {
      inList.latchMinorAndDumpAddedINs();
      hook357__wrappee__base();
    }

		
     private void  hook358__wrappee__base  () throws DatabaseException {
    }

		
    protected void hook358() throws DatabaseException {
      inList.releaseMajorLatch();
      hook358__wrappee__base();
    }

		
     private void  hook360__wrappee__base  () throws DatabaseException {
    }

		
    protected void hook360() throws DatabaseException {
      memoryChange=0;
      mb=_this.envImpl.getMemoryBudget();
      hook360__wrappee__base();
    }

		
     private void  hook361__wrappee__base  () throws DatabaseException {
    }

		
    protected void hook361() throws DatabaseException {
      memoryChange+=(thisIN.getAccumulatedDelta() - thisIN.getInMemorySize());
      thisIN.setInListResident(false);
      hook361__wrappee__base();
    }

		
     private void  hook362__wrappee__base  () throws DatabaseException {
    }

		
    protected void hook362() throws DatabaseException {
      mb.updateTreeMemoryUsage(memoryChange);
      hook362__wrappee__base();
    }


	}

	
   private void  hook359__wrappee__base  () throws DatabaseException {
  }

	
  protected void hook359() throws DatabaseException {
    if (setDbState) {
      dbImpl.finishedINListHarvest();
    }
    hook359__wrappee__base();
  }


}
