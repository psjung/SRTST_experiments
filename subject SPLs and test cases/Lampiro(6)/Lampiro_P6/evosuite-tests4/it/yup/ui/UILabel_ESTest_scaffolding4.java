/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jul 01 15:30:29 KST 2018
 */

package it.yup.ui;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class UILabel_ESTest_scaffolding4 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "it.yup.ui.UILabel"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(UILabel_ESTest_scaffolding4.class.getClassLoader() ,
      "it.yup.ui.UIScreen",
      "it.yup.ui.UIConfig",
      "it.yup.util.Utils",
      "it.yup.ui.UIItem",
      "org.bouncycastle.crypto.Digest",
      "it.yup.ui.UILayout",
      "it.yup.ui.UIHLayout",
      "it.yup.ui.UISeparator",
      "it.yup.ui.UILabel",
      "it.yup.ui.UIIContainer",
      "org.bouncycastle.crypto.digests.GeneralDigest",
      "it.yup.ui.UICanvas$1",
      "it.yup.ui.UICombobox$UIComboScreen",
      "it.yup.ui.UICanvas",
      "it.yup.ui.UIPanel",
      "it.yup.ui.UIButton",
      "org.bouncycastle.crypto.ExtendedDigest",
      "org.bouncycastle.crypto.digests.SHA1Digest",
      "org.bouncycastle.crypto.digests.MD5Digest",
      "it.yup.ui.UIMenu",
      "it.yup.ui.UICheckbox",
      "it.yup.ui.UICombobox"
    );
  } 
}
