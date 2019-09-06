package com.sleepycat.je.tree; 
import com.sleepycat.je.DatabaseException; 
public  interface  WithRootLatched {
	
  /** 
 * doWork is called while the tree's root latch is held.
 */
  public IN doWork(  ChildReference root) throws DatabaseException ;


}
