package com.sleepycat.je.dbi; 
import com.sleepycat.je.DatabaseException; 
/** 
 * Implemented by observers of mutable config changes.
 */
public  interface  EnvConfigObserver {
	
  /** 
 * Notifies the observer that one or more mutable properties have been
 * changed.
 */
  void envConfigUpdate(  DbConfigManager configMgr) throws DatabaseException ;


}
