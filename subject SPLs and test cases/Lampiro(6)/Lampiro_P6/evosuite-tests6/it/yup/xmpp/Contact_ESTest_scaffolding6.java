/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jul 01 15:57:15 KST 2018
 */

package it.yup.xmpp;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class Contact_ESTest_scaffolding6 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "it.yup.xmpp.Contact"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Contact_ESTest_scaffolding6.class.getClassLoader() ,
      "it.yup.xmpp.Group",
      "it.yup.util.RMSIndex",
      "it.yup.util.RMSIndex$Item",
      "it.yup.xmpp.XMPPClient$XmppListener",
      "it.yup.xmpp.IQResultListener",
      "it.yup.xmlstream.StreamEventListener",
      "it.yup.xmlstream.SocketStream",
      "it.yup.util.RMSIndex$Comparator",
      "it.yup.xmpp.Roster",
      "it.yup.xmlstream.Initializer",
      "it.yup.xmpp.XMPPClient$3",
      "it.yup.xmpp.Roster$3",
      "it.yup.xmlstream.PacketListener",
      "it.yup.transport.TransportListener",
      "it.yup.xmpp.Roster$1",
      "it.yup.xmpp.packets.Iq",
      "it.yup.xmpp.Roster$2",
      "it.yup.xmlstream.EventQueryRegistration",
      "it.yup.xml.Element",
      "it.yup.xmpp.Task",
      "it.yup.xmlstream.AccountRegistration",
      "it.yup.xmlstream.BasicXmlStream",
      "it.yup.xmpp.Config",
      "it.yup.xmpp.XMPPClient",
      "it.yup.util.RMSIndex$DefaultUTF8Comparator",
      "it.yup.xmpp.packets.Stanza",
      "it.yup.xmpp.Contact",
      "it.yup.transport.BaseChannel",
      "it.yup.xmpp.IqManager",
      "it.yup.xmpp.packets.Presence",
      "it.yup.xmpp.packets.Message"
    );
  } 
}
