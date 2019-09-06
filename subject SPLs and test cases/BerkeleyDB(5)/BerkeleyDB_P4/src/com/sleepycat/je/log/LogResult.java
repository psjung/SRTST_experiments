package com.sleepycat.je.log; 
import de.ovgu.cide.jakutil.*; 
 
class  LogResult {
	
  long currentLsn;

	
  boolean wakeupCleaner;

	
  LogResult(  long currentLsn,  boolean wakeupCheckpointer,  boolean wakeupCleaner){
    this.currentLsn=currentLsn;
    this.hook510(wakeupCheckpointer);
    this.wakeupCleaner=wakeupCleaner;
  }

	
   private void  hook510__wrappee__base  (  boolean wakeupCheckpointer){
  }

	
  protected void hook510(  boolean wakeupCheckpointer){
    this.wakeupCheckpointer=wakeupCheckpointer;
    hook510__wrappee__base(wakeupCheckpointer);
  }

	
  boolean wakeupCheckpointer;


}
