package com.sleepycat.je.log;

/** 
 * Log file doesn't exist.
 */
public  class  LogFileNotFoundException  extends LogException {
	
  public LogFileNotFoundException(  String message){
    super(message);
  }


}
