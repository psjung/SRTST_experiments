package com.sleepycat.je; 
import de.ovgu.cide.jakutil.*; 
public   class  CheckpointConfig {
	
  public final static CheckpointConfig DEFAULT=new CheckpointConfig();

	
  private boolean force=false;

	
  private boolean minimizeRecoveryTime=false;

	
  /** 
 * Javadoc for this public method is generated via
 * the doc templates in the doc_src directory.
 */
  public CheckpointConfig(){
  }

	
  /** 
 * Javadoc for this public method is generated via
 * the doc templates in the doc_src directory.
 */
  public void setForce(  boolean force){
    this.force=force;
  }

	
  /** 
 * Javadoc for this public method is generated via
 * the doc templates in the doc_src directory.
 */
  public boolean getForce(){
    return force;
  }

	
  /** 
 * Javadoc for this public method is generated via
 * the doc templates in the doc_src directory.
 */
  public void setMinimizeRecoveryTime(  boolean minimizeRecoveryTime){
    this.minimizeRecoveryTime=minimizeRecoveryTime;
  }

	
  /** 
 * Javadoc for this public method is generated via
 * the doc templates in the doc_src directory.
 */
  public boolean getMinimizeRecoveryTime(){
    return minimizeRecoveryTime;
  }

	
  private int minutes=0;

	
  /** 
 * Javadoc for this public method is generated via
 * the doc templates in the doc_src directory.
 */
  public void setMinutes(  int minutes){
    this.minutes=minutes;
  }

	
  /** 
 * Javadoc for this public method is generated via
 * the doc templates in the doc_src directory.
 */
  public int getMinutes(){
	  //**Space({P1,P2,P3,P4,P5,P6,P7}) - add
//	  return 0;
	//**Space({P1,P2,P3,P4,P5,P6,P7}) - delete
    return minutes;
  }

	
  private int kbytes=0;

	
  /** 
 * Javadoc for this public method is generated via
 * the doc templates in the doc_src directory.
 */
  public void setKBytes(  int kbytes){
	//**Space({P2,P4,P5}) - delete
    this.kbytes=kbytes;
  }

	
  /** 
 * Javadoc for this public method is generated via
 * the doc templates in the doc_src directory.
 */
  public int getKBytes(){
	//**Space({P2,P4,P5}) - delete
	  return kbytes;
	//**Space({P2,P4,P5}) - add
//    return 0;
  }


}
