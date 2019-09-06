package com.sleepycat.je.utilint;

/** 
 */
public  class  TestHookExecute {
	
  public static boolean doHookIfSet(  TestHook testHook){
    if (testHook != null) {
      testHook.doHook();
    }
    return true;
  }


}
