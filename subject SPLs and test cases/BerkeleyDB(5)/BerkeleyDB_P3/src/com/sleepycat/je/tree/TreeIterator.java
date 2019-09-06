package com.sleepycat.je.tree; 
import java.util.Iterator; 
import java.util.NoSuchElementException; 
import com.sleepycat.je.DatabaseException; 
import de.ovgu.cide.jakutil.*; 
import com.sleepycat.je.latch.LatchNotHeldException; 
public final   class  TreeIterator  implements Iterator {
	
  private Tree tree;

	
  private BIN nextBin;

	
  private int index;

	
  public TreeIterator(  Tree tree) throws DatabaseException {
    nextBin=(BIN)tree.getFirstNode();
    this.hook755();
    index=-1;
    this.tree=tree;
  }

	
  public boolean hasNext(){
    boolean ret=false;
    try {
      this.hook756();
      advance();
      ret=(nextBin != null) && (index < nextBin.getNEntries());
    }
 catch (    DatabaseException e) {
    }
 finally {
      this.hook757();
    }
    return ret;
  }

	
  public Object next(){
    Object ret=null;
    try {
      if (nextBin == null) {
        throw new NoSuchElementException();
      }
      this.hook758();
      ret=nextBin.getKey(index);
    }
 catch (    DatabaseException e) {
    }
 finally {
      this.hook759();
    }
    return ret;
  }

	
  public void remove(){
    throw new UnsupportedOperationException();
  }

	
  private void advance() throws DatabaseException {
    while (nextBin != null) {
      if (++index < nextBin.getNEntries()) {
        return;
      }
      nextBin=tree.getNextBin(nextBin,false);
      index=-1;
    }
  }

	
   private void  hook755__wrappee__base  () throws DatabaseException {
  }

	
  protected void hook755() throws DatabaseException {
    if (nextBin != null) {
      nextBin.releaseLatch();
    }
    hook755__wrappee__base();
  }

	
   private void  hook756__wrappee__base  () throws DatabaseException {
  }

	
  protected void hook756() throws DatabaseException {
    if (nextBin != null) {
      nextBin.latch();
    }
    hook756__wrappee__base();
  }

	
   private void  hook757__wrappee__base  (){
  }

	
  protected void hook757(){
    try {
      if (nextBin != null) {
        nextBin.releaseLatch();
      }
    }
 catch (    LatchNotHeldException e) {
    }
    hook757__wrappee__base();
  }

	
   private void  hook758__wrappee__base  () throws DatabaseException {
  }

	
  protected void hook758() throws DatabaseException {
    nextBin.latch();
    hook758__wrappee__base();
  }

	
   private void  hook759__wrappee__base  (){
  }

	
  protected void hook759(){
    try {
      if (nextBin != null) {
        nextBin.releaseLatch();
      }
    }
 catch (    LatchNotHeldException e) {
    }
    hook759__wrappee__base();
  }


}
