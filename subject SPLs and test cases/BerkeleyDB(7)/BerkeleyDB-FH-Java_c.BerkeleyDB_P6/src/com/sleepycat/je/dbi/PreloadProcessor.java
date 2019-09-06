package com.sleepycat.je.dbi; 
import com.sleepycat.je.PreloadStats; 
import com.sleepycat.je.dbi.SortedLSNTreeWalker.TreeNodeProcessor; 
import com.sleepycat.je.log.LogEntryType; 
import com.sleepycat.je.utilint.DbLsn; 
import de.ovgu.cide.jakutil.*; 
 
class  PreloadProcessor  implements TreeNodeProcessor {
	
  private EnvironmentImpl envImpl;

	
  private long maxBytes;

	
  private long targetTime;

	
  PreloadProcessor(  EnvironmentImpl envImpl,  long maxBytes,  long targetTime,  PreloadStats stats){
    this.envImpl=envImpl;
    this.maxBytes=maxBytes;
    this.targetTime=targetTime;
    this.hook353(stats);
  }

	
  /** 
 * Called for each LSN that the SortedLSNTreeWalker encounters.
 */
  public void processLSN(  long childLsn,  LogEntryType childType){
    assert childLsn != DbLsn.NULL_LSN;
    if (System.currentTimeMillis() > targetTime) {
      throw DatabaseImpl.timeExceededPreloadException;
    }
    this.hook355();
    this.hook354(childType);
  }

	
   private void  hook353__wrappee__base  (  PreloadStats stats){
  }

	
  protected void hook353(  PreloadStats stats){
    this.stats=stats;
    hook353__wrappee__base(stats);
  }

	
   private void  hook354__wrappee__base  (  LogEntryType childType){
  }

	
  protected void hook354(  LogEntryType childType){
    if (childType.equals(LogEntryType.LOG_DUPCOUNTLN_TRANSACTIONAL) || childType.equals(LogEntryType.LOG_DUPCOUNTLN)) {
      stats.nDupCountLNsLoaded++;
    }
 else     if (childType.equals(LogEntryType.LOG_LN_TRANSACTIONAL) || childType.equals(LogEntryType.LOG_LN)) {
      stats.nLNsLoaded++;
    }
 else     if (childType.equals(LogEntryType.LOG_DBIN)) {
      stats.nDBINsLoaded++;
    }
 else     if (childType.equals(LogEntryType.LOG_BIN)) {
      stats.nBINsLoaded++;
    }
 else     if (childType.equals(LogEntryType.LOG_DIN)) {
      stats.nDINsLoaded++;
    }
 else     if (childType.equals(LogEntryType.LOG_IN)) {
      stats.nINsLoaded++;
    }
    hook354__wrappee__base(childType);
  }

	
   private void  hook355__wrappee__base  (){
  }

	
  protected void hook355(){
    if (envImpl.getMemoryBudget().getCacheMemoryUsage() > maxBytes) {
      throw DatabaseImpl.memoryExceededPreloadException;
    }
    hook355__wrappee__base();
  }

	
  private PreloadStats stats;


}
