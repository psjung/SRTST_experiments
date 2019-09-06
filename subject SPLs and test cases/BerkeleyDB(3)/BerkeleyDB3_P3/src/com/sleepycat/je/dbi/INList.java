package com.sleepycat.je.dbi; 
import java.util.HashSet; 
import java.util.Iterator; 
import java.util.Set; 
import java.util.SortedSet; 
import java.util.TreeSet; 
import com.sleepycat.je.DatabaseException; 
import com.sleepycat.je.tree.IN; 
import de.ovgu.cide.jakutil.*; 
import com.sleepycat.je.latch.Latch; 
import com.sleepycat.je.latch.LatchSupport; 
public   class  INList {
	
  private static final String DEBUG_NAME=INList.class.getName();

	
  private SortedSet ins=null;

	
  private EnvironmentImpl envImpl;

	
  INList(  EnvironmentImpl envImpl){
    this.envImpl=envImpl;
    ins=new TreeSet();
    this.hook338(envImpl);
  }

	
  /** 
 * Used only by tree verifier when validating INList. Must be called with
 * orig.majorLatch acquired.
 */
  public INList(  INList orig,  EnvironmentImpl envImpl) throws DatabaseException {
    ins=new TreeSet(orig.getINs());
    this.hook340();
    this.envImpl=envImpl;
    this.hook339(envImpl);
  }

	
  public SortedSet getINs(){
    return ins;
  }

	
  public int getSize(){
    return ins.size();
  }

	
  /** 
 * An IN has just come into memory, add it to the list.
 */
  public void add(  IN in) throws DatabaseException {
    new INList_add(this,in).execute();
  }

	
  private void addAndSetMemory(  Set set,  IN in){
    new INList_addAndSetMemory(this,set,in).execute();
  }

	
  /** 
 * An IN is getting evicted or is displaced by recovery.  Caller is
 * responsible for acquiring the major latch before calling this and
 * releasing it when they're done.
 */
   private void  removeLatchAlreadyHeld__wrappee__base  (  IN in) throws DatabaseException {
    boolean removeDone=ins.remove(in);
    removeDone=this.hook341(in,removeDone);
    assert removeDone;
    this.hook346(in);
  }

	
  /** 
 * An IN is getting evicted or is displaced by recovery.  Caller is
 * responsible for acquiring the major latch before calling this and
 * releasing it when they're done.
 */
  public void removeLatchAlreadyHeld(  IN in) throws DatabaseException {
    assert majorLatch.isOwner();
    removeLatchAlreadyHeld__wrappee__base(in);
  }

	
  /** 
 * An IN is getting swept or is displaced by recovery.
 */
   private void  remove__wrappee__base  (  IN in) throws DatabaseException {
    removeLatchAlreadyHeld(in);
  }

	
  /** 
 * An IN is getting swept or is displaced by recovery.
 */
  public void remove(  IN in) throws DatabaseException {
    assert LatchSupport.countLatchesHeld() == 0;
    majorLatch.acquire();
    try {
      remove__wrappee__base(in);
    }
  finally {
      releaseMajorLatch();
    }
  }

	
   private SortedSet  tailSet__wrappee__base  (  IN in) throws DatabaseException {
    return ins.tailSet(in);
  }

	
  public SortedSet tailSet(  IN in) throws DatabaseException {
    assert majorLatch.isOwner();
    return tailSet__wrappee__base(in);
  }

	
   private IN  first__wrappee__base  () throws DatabaseException {
    return (IN)ins.first();
  }

	
  public IN first() throws DatabaseException {
    assert majorLatch.isOwner();
    return first__wrappee__base();
  }

	
  /** 
 * Return an iterator over the main 'ins' set.  Returned iterator will not
 * show the elements in addedINs.
 * The major latch should be held before entering.  The caller is
 * responsible for releasing the major latch when they're finished with the
 * iterator.
 * @return an iterator over the main 'ins' set.
 */
   private Iterator  iterator__wrappee__base  (){
    return ins.iterator();
  }

	
  /** 
 * Return an iterator over the main 'ins' set.  Returned iterator will not
 * show the elements in addedINs.
 * The major latch should be held before entering.  The caller is
 * responsible for releasing the major latch when they're finished with the
 * iterator.
 * @return an iterator over the main 'ins' set.
 */
  public Iterator iterator(){
    assert majorLatch.isOwner();
    return iterator__wrappee__base();
  }

	
  /** 
 * Clear the entire list during recovery and at shutdown.
 */
   private void  clear__wrappee__base  () throws DatabaseException {
    ins.clear();
    this.hook342();
  }

	
  /** 
 * Clear the entire list during recovery and at shutdown.
 */
  public void clear() throws DatabaseException {
    assert LatchSupport.countLatchesHeld() == 0;
    majorLatch.acquire();
    minorLatch.acquire();
    clear__wrappee__base();
  }

	
  public void dump(){
    System.out.println("size=" + getSize());
    Iterator iter=ins.iterator();
    while (iter.hasNext()) {
      IN theIN=(IN)iter.next();
      System.out.println("db=" + theIN.getDatabase().getId() + " nid=: "+ theIN.getNodeId()+ "/"+ theIN.getLevel());
    }
  }

	
@MethodObject static  class  INList_add {
		
    INList_add(    INList _this,    IN in){
      this._this=_this;
      this.in=in;
    }

		
    void execute() throws DatabaseException {
      this.hook344();
      addToMajor=true;
      this.hook343();
    }

		
    protected INList _this;

		
    protected IN in;

		
    protected boolean enteredWithLatchHeld;

		
    protected boolean addToMajor;

		
     private void  hook343__wrappee__base  () throws DatabaseException {
      this.hook345();
    }

		
    protected void hook343() throws DatabaseException {
      try {
        hook343__wrappee__base();
      }
  finally {
        if (addToMajor) {
          _this.releaseMajorLatchIfHeld();
        }
      }
    }

		
     private void  hook344__wrappee__base  () throws DatabaseException {
    }

		
    protected void hook344() throws DatabaseException {
      enteredWithLatchHeld=_this.majorLatch.isOwner();
      hook344__wrappee__base();
    }

		
     private void  hook345__wrappee__base  () throws DatabaseException {
      _this.addAndSetMemory(_this.ins,in);
    }

		
    protected void hook345() throws DatabaseException {
      if (enteredWithLatchHeld) {
        addToMajor=false;
      }
 else {
        if (!(_this.majorLatch.acquireNoWait())) {
          addToMajor=false;
        }
      }
      if (addToMajor) {
        hook345__wrappee__base();
      }
 else {
        _this.minorLatch.acquire();
        try {
          _this.addAndSetMemory(_this.addedINs,in);
        }
  finally {
          _this.minorLatch.release();
        }
        if (!enteredWithLatchHeld) {
          if (_this.majorLatch.acquireNoWait()) {
            try {
              _this.latchMinorAndDumpAddedINs();
            }
  finally {
              _this.releaseMajorLatch();
            }
          }
        }
      }
    }


	}

	
@MethodObject static  class  INList_addAndSetMemory {
		
    INList_addAndSetMemory(    INList _this,    Set set,    IN in){
      this._this=_this;
      this.set=set;
      this.in=in;
    }

		
    void execute(){
      addOk=set.add(in);
      assert addOk : "failed adding in " + in.getNodeId();
    }

		
    protected INList _this;

		
    protected Set set;

		
    protected IN in;

		
    protected boolean addOk;

		
    protected MemoryBudget mb;


	}

	
   private void  hook338__wrappee__base  (  EnvironmentImpl envImpl){
  }

	
  protected void hook338(  EnvironmentImpl envImpl){
    addedINs=new HashSet();
    majorLatch=LatchSupport.makeLatch(DEBUG_NAME + " Major Latch",envImpl);
    minorLatch=LatchSupport.makeLatch(DEBUG_NAME + " Minor Latch",envImpl);
    hook338__wrappee__base(envImpl);
  }

	
   private void  hook339__wrappee__base  (  EnvironmentImpl envImpl) throws DatabaseException {
  }

	
  protected void hook339(  EnvironmentImpl envImpl) throws DatabaseException {
    majorLatch=LatchSupport.makeLatch(DEBUG_NAME + " Major Latch",envImpl);
    minorLatch=LatchSupport.makeLatch(DEBUG_NAME + " Minor Latch",envImpl);
    hook339__wrappee__base(envImpl);
  }

	
   private void  hook340__wrappee__base  () throws DatabaseException {
  }

	
  protected void hook340() throws DatabaseException {
    addedINs=new HashSet();
    hook340__wrappee__base();
  }

	
   private boolean  hook341__wrappee__base  (  IN in,  boolean removeDone) throws DatabaseException {
    return removeDone;
  }

	
  protected boolean hook341(  IN in,  boolean removeDone) throws DatabaseException {
    if (!removeDone) {
      minorLatch.acquire();
      try {
        removeDone=addedINs.remove(in);
        dumpAddedINsIntoMajorSet();
      }
  finally {
        minorLatch.release();
      }
    }
    return hook341__wrappee__base(in,removeDone);
  }

	
   private void  hook342__wrappee__base  () throws DatabaseException {
  }

	
  protected void hook342() throws DatabaseException {
    addedINs.clear();
    minorLatch.release();
    releaseMajorLatch();
    hook342__wrappee__base();
  }

	
  protected void hook346(  IN in) throws DatabaseException {
  }

	
  private Set addedINs=null;

	
  private Latch majorLatch;

	
  private Latch minorLatch;

	
  /** 
 * The locking hierarchy is:
 * 1. INList major latch.
 * 2. IN latch.
 * In other words, the INList major latch must be taken before any IN
 * latches to avoid deadlock. 
 */
  public void latchMajor() throws DatabaseException {
    assert LatchSupport.countLatchesHeld() == 0;
    majorLatch.acquire();
  }

	
  public void releaseMajorLatchIfHeld() throws DatabaseException {
    if (majorLatch.isOwner()) {
      releaseMajorLatch();
    }
  }

	
  public void releaseMajorLatch() throws DatabaseException {
    latchMinorAndDumpAddedINs();
    majorLatch.release();
  }

	
  private void dumpAddedINsIntoMajorSet(){
    if (addedINs.size() > 0) {
      ins.addAll(addedINs);
      addedINs.clear();
    }
  }

	
  void latchMinorAndDumpAddedINs() throws DatabaseException {
    latchMinor();
    try {
      dumpAddedINsIntoMajorSet();
    }
  finally {
      releaseMinorLatch();
    }
  }

	
  private void latchMinor() throws DatabaseException {
    minorLatch.acquire();
  }

	
  private void releaseMinorLatch() throws DatabaseException {
    minorLatch.release();
  }


}
