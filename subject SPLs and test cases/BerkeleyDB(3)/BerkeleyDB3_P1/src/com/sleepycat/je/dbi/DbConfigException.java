package com.sleepycat.je.dbi; 
import com.sleepycat.je.DatabaseException; 
/** 
 * Configuration related exceptions.
 */
public  class  DbConfigException  extends DatabaseException {
	
  public DbConfigException(  Throwable t){
    super(t);
  }

	
  public DbConfigException(  String message){
    super(message);
  }

	
  public DbConfigException(  String message,  Throwable t){
    super(message,t);
  }


}
