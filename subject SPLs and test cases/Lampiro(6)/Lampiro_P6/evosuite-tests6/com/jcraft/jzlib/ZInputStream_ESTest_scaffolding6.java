/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jul 01 14:01:29 KST 2018
 */

package com.jcraft.jzlib;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ZInputStream_ESTest_scaffolding6 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.jcraft.jzlib.ZInputStream"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 


  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ZInputStream_ESTest_scaffolding6.class.getClassLoader() ,
      "com.jcraft.jzlib.Deflate",
      "com.jcraft.jzlib.Inflate",
      "com.jcraft.jzlib.InfCodes",
      "com.jcraft.jzlib.ZInputStream",
      "com.jcraft.jzlib.ZStream",
      "com.jcraft.jzlib.StaticTree",
      "com.jcraft.jzlib.InfTree",
      "com.jcraft.jzlib.ZStreamException",
      "com.jcraft.jzlib.InfBlocks",
      "com.jcraft.jzlib.Deflate$Config",
      "com.jcraft.jzlib.FilterInputStream",
      "com.jcraft.jzlib.Adler32",
      "com.jcraft.jzlib.Tree"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Enumeration", false, ZInputStream_ESTest_scaffolding6.class.getClassLoader()));
  }
}
