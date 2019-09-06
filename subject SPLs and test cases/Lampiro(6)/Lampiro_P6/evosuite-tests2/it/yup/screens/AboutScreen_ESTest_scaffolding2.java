/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jul 01 10:50:40 KST 2018
 */

package it.yup.screens;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class AboutScreen_ESTest_scaffolding2 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "it.yup.screens.AboutScreen"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AboutScreen_ESTest_scaffolding2.class.getClassLoader() ,
      "it.yup.screens.MessageComposerScreen",
      "it.yup.xmpp.XMPPClient$XmppListener",
      "it.yup.xmpp.IQResultListener",
      "it.yup.screens.SimpleComposerScreen",
      "it.yup.xmlstream.StreamEventListener",
      "it.yup.screens.DeleteContactAlert",
      "it.yup.screens.DataResultScreen",
      "it.yup.screens.RosterScreen$ScreenSaverStarter",
      "it.yup.screens.RegisterScreen",
      "it.yup.util.ResourceManager",
      "it.yup.screens.DebugScreen",
      "it.yup.xmlstream.PacketListener",
      "it.yup.ui.UIIContainer",
      "it.yup.screens.TaskListScreen",
      "lampiro.LampiroMidlet",
      "it.yup.screens.ChatScreen",
      "it.yup.screens.CommandListScreen",
      "lampiro.screens.SplashScreen",
      "it.yup.screens.AddContactScreen",
      "it.yup.screens.ContactInfoScreen",
      "it.yup.util.LogConsumer",
      "it.yup.screens.RosterScreen",
      "it.yup.screens.RosterScreen$AdHocCommandsHandler",
      "it.yup.ui.UIScreen",
      "it.yup.ui.UIItem",
      "it.yup.screens.OptionsScreen",
      "it.yup.screens.SubscriptionConfirmAlert",
      "it.yup.screens.StatusScreen",
      "it.yup.screens.DataFormScreen",
      "it.yup.screens.SplashScreen",
      "it.yup.screens.AboutScreen",
      "it.yup.ui.UIMenu"
    );
  } 
}
