package com.sleepycat.je.log; 
import com.sleepycat.je.RunRecoveryException;
import com.sleepycat.je.dbi.EnvironmentImpl; 
/** 
 * Configuration related exceptions.
 */
public  class  DbChecksumException  extends RunRecoveryException {
	
  public DbChecksumException(  EnvironmentImpl env,  String message){
    super(env,message);
  }

	
  public DbChecksumException(  EnvironmentImpl env,  String message,  Throwable t){
    super(env,message,t);
  }


}
