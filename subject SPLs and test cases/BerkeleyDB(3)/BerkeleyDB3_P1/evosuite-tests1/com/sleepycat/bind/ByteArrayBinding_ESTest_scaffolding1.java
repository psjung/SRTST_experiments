/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Apr 21 18:01:00 KST 2017
 */

package com.sleepycat.bind;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.MethodRule;
import org.junit.rules.TestName;
import org.junit.rules.TestWatchman;
import org.junit.runners.model.FrameworkMethod;

@EvoSuiteClassExclude
public class ByteArrayBinding_ESTest_scaffolding1 {

  @org.junit.Rule 
  public org.junit.rules.Timeout globalTimeout = new org.junit.rules.Timeout(4000); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.sleepycat.bind.ByteArrayBinding"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
  } 

  @Before 
  public void initTestCase() throws NoSuchMethodException, SecurityException{ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
    
//    System.out.println("@@TestCase: " + this.getClass().getCanonicalName() + "." + testName.getMethodName() + "()");
  } 

  @Rule
  public MethodRule watchman = new TestWatchman() {
     public void starting(FrameworkMethod method) {
        System.out.println("@@TestCase: " + method.getMethod().getDeclaringClass().getCanonicalName() + "." + method.getName() + "()");
     }
  };
  /*
  @Rule
  public TestName testName = new TestName();
  */

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

}
