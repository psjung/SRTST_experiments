/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jul 01 01:15:55 KST 2018
 */

package it.yup.ui;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class UITextPanel_ESTest_scaffolding1 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "it.yup.ui.UITextPanel"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(UITextPanel_ESTest_scaffolding1.class.getClassLoader() ,
      "it.yup.ui.UIScreen",
      "it.yup.ui.UIConfig",
      "it.yup.ui.UIItem",
      "it.yup.ui.Semaphore",
      "it.yup.ui.UIEmoLabel",
      "it.yup.ui.UIVLayout",
      "it.yup.ui.UILayout",
      "it.yup.ui.UIRadioButtons",
      "it.yup.ui.UITextPanel",
      "it.yup.ui.UISeparator",
      "it.yup.ui.UIIContainer",
      "it.yup.ui.UILabel",
      "it.yup.ui.UICanvas$1",
      "it.yup.ui.UIRadioButtons$UIRadioButton",
      "it.yup.ui.UIUtils",
      "it.yup.ui.UICanvas",
      "it.yup.ui.UIPanel",
      "it.yup.ui.UIMenu"
    );
  } 
}
