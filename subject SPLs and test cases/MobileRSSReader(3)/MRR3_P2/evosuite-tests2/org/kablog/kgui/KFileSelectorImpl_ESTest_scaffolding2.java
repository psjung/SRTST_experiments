/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Aug 12 18:35:25 KST 2018
 */

package org.kablog.kgui;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class KFileSelectorImpl_ESTest_scaffolding2 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.kablog.kgui.KFileSelectorImpl"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(KFileSelectorImpl_ESTest_scaffolding2.class.getClassLoader() ,
      "org.kablog.kgui.KFileSelector",
      "com.substanceofcode.utils.CauseException",
      "com.substanceofcode.testlcdui.TextBox",
      "org.kablog.kgui.KFileSelectorImpl",
      "net.sf.jlogmicro.util.exception.CauseRuntimeException",
      "com.substanceofcode.rssreader.presentation.UiUtil",
      "cz.cacek.ebook.util.ResourceProviderME",
      "com.substanceofcode.utils.CauseMemoryException",
      "org.kablog.kgui.KViewChild",
      "net.sf.jlogmicro.util.logging.Logger",
      "net.sf.jlogmicro.util.logging.LogManager",
      "com.substanceofcode.testlcdui.TextField",
      "com.substanceofcode.utils.CauseRuntimeException",
      "net.sf.jlogmicro.util.exception.CauseException",
      "net.sf.jlogmicro.util.logging.Level",
      "com.substanceofcode.testlcdui.ChoiceGroup",
      "com.substanceofcode.testlcdui.Form"
    );
  } 
}
