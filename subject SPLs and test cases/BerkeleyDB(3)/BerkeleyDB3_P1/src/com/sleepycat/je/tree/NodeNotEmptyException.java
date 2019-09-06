package com.sleepycat.je.tree;

/** 
 * Error to indicate that a bottom level BIN is not empty during a
 * delete subtree operation.
 */
public  class  NodeNotEmptyException  extends Exception {
	
  public static final NodeNotEmptyException NODE_NOT_EMPTY=new NodeNotEmptyException();

	
  private NodeNotEmptyException(){
  }


}
