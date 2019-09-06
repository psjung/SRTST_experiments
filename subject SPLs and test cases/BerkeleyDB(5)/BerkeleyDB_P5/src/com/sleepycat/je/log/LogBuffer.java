package com.sleepycat.je.log; 
import java.nio.ByteBuffer; 
import com.sleepycat.je.DatabaseException; 
import com.sleepycat.je.dbi.EnvironmentImpl; 
import com.sleepycat.je.utilint.DbLsn; 
import de.ovgu.cide.jakutil.*; 
import com.sleepycat.je.latch.Latch; 
import com.sleepycat.je.latch.LatchSupport; 
 
class  LogBuffer  implements LogSource {
	
  private static final String DEBUG_NAME=LogBuffer.class.getName();

	
  private ByteBuffer buffer;

	
  private long firstLsn;

	
  private long lastLsn;

	
  LogBuffer(  int capacity,  EnvironmentImpl env) throws DatabaseException {
    this.hook481(capacity);
    this.hook482(capacity);
    this.hook479(env);
    reinit();
  }

	
  LogBuffer  (  ByteBuffer buffer,  long firstLsn) throws DatabaseException {
    this.buffer=buffer;
    this.firstLsn=firstLsn;
    this.lastLsn=firstLsn;
  
    rewriteAllowed=false;
  }

	
   private void  reinit__wrappee__base  () throws DatabaseException {
    buffer.clear();
    firstLsn=DbLsn.NULL_LSN;
    lastLsn=DbLsn.NULL_LSN;
  }

	
   private void  reinit__wrappee__DiskFullErro  () throws DatabaseException {
    reinit__wrappee__base();
    rewriteAllowed=false;
  }

	
  void reinit() throws DatabaseException {
    readLatch.acquire();
    reinit__wrappee__DiskFullErro();
    readLatch.release();
  }

	
  /** 
 * Return first LSN held in this buffer. Assumes the log write latch is
 * held.
 */
  long getFirstLsn(){
    return firstLsn;
  }

	
  /** 
 * This LSN has been written to the log.
 */
   private void  registerLsn__wrappee__base  (  long lsn) throws DatabaseException {
    if (lastLsn != DbLsn.NULL_LSN) {
      assert (DbLsn.compareTo(lsn,lastLsn) > 0);
    }
    lastLsn=lsn;
    if (firstLsn == DbLsn.NULL_LSN) {
      firstLsn=lsn;
    }
  }

	
  /** 
 * This LSN has been written to the log.
 */
  void registerLsn(  long lsn) throws DatabaseException {
    readLatch.acquire();
    try {
      registerLsn__wrappee__base(lsn);
    }
  finally {
      readLatch.release();
    }
  }

	
  /** 
 * Check capacity of buffer. Assumes that the log write latch is held.
 * @return true if this buffer can hold this many more bytes.
 */
  boolean hasRoom(  int numBytes){
    return (numBytes <= (buffer.capacity() - buffer.position()));
  }

	
  /** 
 * @return the actual data buffer.
 */
  ByteBuffer getDataBuffer(){
    return buffer;
  }

	
  /** 
 * @return capacity in bytes
 */
  int getCapacity(){
    return buffer.capacity();
  }

	
  /** 
 * Support for reading a log entry out of a still-in-memory log
 * @return true if this buffer holds the entry at this LSN. The buffer will
 * be latched for read. Returns false if LSN is not here, and
 * releases the read latch.
 */
   private boolean  containsLsn__wrappee__base  (  long lsn) throws DatabaseException {
    boolean found=false;
    if ((firstLsn != DbLsn.NULL_LSN) && ((DbLsn.compareTo(firstLsn,lsn) <= 0) && (DbLsn.compareTo(lastLsn,lsn) >= 0))) {
      found=true;
    }
    if (found) {
      return true;
    }
 else {
      this.hook480();
      return false;
    }
  }

	
  /** 
 * Support for reading a log entry out of a still-in-memory log
 * @return true if this buffer holds the entry at this LSN. The buffer will
 * be latched for read. Returns false if LSN is not here, and
 * releases the read latch.
 */
  boolean containsLsn(  long lsn) throws DatabaseException {
    readLatch.acquire();
    return containsLsn__wrappee__base(lsn);
  }

	
  /** 
 * @see LogSource#getBytes
 */
  public ByteBuffer getBytes(  long fileOffset){
    ByteBuffer copy=null;
    while (true) {
      try {
        copy=buffer.duplicate();
        copy.position((int)(fileOffset - DbLsn.getFileOffset(firstLsn)));
        break;
      }
 catch (      IllegalArgumentException IAE) {
        continue;
      }
    }
    return copy;
  }

	
  /** 
 * @see LogSource#getBytes
 */
  public ByteBuffer getBytes(  long fileOffset,  int numBytes){
    ByteBuffer copy=getBytes(fileOffset);
    assert (copy.remaining() >= numBytes) : "copy.remaining=" + copy.remaining() + " numBytes="+ numBytes;
    return copy;
  }

	
   private void  hook479__wrappee__base  (  EnvironmentImpl env) throws DatabaseException {
  }

	
  protected void hook479(  EnvironmentImpl env) throws DatabaseException {
    readLatch=LatchSupport.makeLatch(DEBUG_NAME,env);
    hook479__wrappee__base(env);
  }

	
   private void  hook480__wrappee__base  () throws DatabaseException {
  }

	
  protected void hook480() throws DatabaseException {
    readLatch.release();
    hook480__wrappee__base();
  }

	
  protected void hook481(  int capacity) throws DatabaseException {
  }

	
  protected void hook482(  int capacity) throws DatabaseException {
  }

	
  /** 
 * @see LogSource#release
 */
  public void release  () throws DatabaseException {
    readLatch.releaseIfOwner();
  }

	
  private boolean rewriteAllowed;

	
  boolean getRewriteAllowed(){
	  //**Space({P2,P3,P5,P6}) - delete
	    return rewriteAllowed;
	    //**Space({P2,P3,P5,P6}) - add
//	    return false;
  }

	
  void setRewriteAllowed(){
    rewriteAllowed=true;
  }

	
  private Latch readLatch;

	
  /** 
 * When modifying the buffer, acquire the readLatch. Call release() to
 * release the latch. Note that containsLsn() acquires the latch for
 * reading.
 */
  public void latchForWrite() throws DatabaseException {
    readLatch.acquire();
  }


}
