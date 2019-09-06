/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Aug 12 18:24:50 KST 2018
 */

package com.substanceofcode.rssreader.presentation;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class SettingsForm_ESTest_scaffolding5 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.substanceofcode.rssreader.presentation.SettingsForm"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SettingsForm_ESTest_scaffolding5.class.getClassLoader() ,
      "com.substanceofcode.utils.CauseException",
      "com.substanceofcode.testlcdui.StringItem",
      "net.sf.jlogmicro.util.exception.CauseRuntimeException",
      "com.substanceofcode.rssreader.presentation.UiUtil",
      "cz.cacek.ebook.util.ResourceProviderME",
      "com.substanceofcode.rssreader.presentation.SettingsForm",
      "com.substanceofcode.utils.CauseMemoryException",
      "net.sf.jlogmicro.util.logging.Logger",
      "net.sf.jlogmicro.util.logging.LogManager",
      "com.substanceofcode.testlcdui.TextField",
      "com.substanceofcode.testutil.TestOutput",
      "com.substanceofcode.utils.CauseRuntimeException",
      "net.sf.jlogmicro.util.exception.CauseException",
      "net.sf.jlogmicro.util.logging.Level",
      "com.substanceofcode.rssreader.presentation.RssReaderMIDlet",
      "com.substanceofcode.testlcdui.ChoiceGroup",
      "com.substanceofcode.testlcdui.Form"
    );
  } 
}
