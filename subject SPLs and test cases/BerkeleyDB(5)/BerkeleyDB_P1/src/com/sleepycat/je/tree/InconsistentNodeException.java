package com.sleepycat.je.tree; 
import com.sleepycat.je.DatabaseException; 
/** 
 * Error to indicate that something is out of wack in the tree.
 */
public  class  InconsistentNodeException  extends DatabaseException {
	
  public InconsistentNodeException(){
    super();
  }

	
  public InconsistentNodeException(  String message){
    super(message);
  }


}
