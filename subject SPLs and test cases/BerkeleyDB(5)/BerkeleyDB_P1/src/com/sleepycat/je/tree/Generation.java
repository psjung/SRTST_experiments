package com.sleepycat.je.tree;

public final  class  Generation {
	
  static private long nextGeneration=0;

	
  static long getNextGeneration(){
    return nextGeneration++;
  }


}
