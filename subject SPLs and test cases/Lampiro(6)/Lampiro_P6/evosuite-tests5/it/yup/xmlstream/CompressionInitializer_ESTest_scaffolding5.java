/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jul 01 18:38:11 KST 2018
 */

package it.yup.xmlstream;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class CompressionInitializer_ESTest_scaffolding5 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "it.yup.xmlstream.CompressionInitializer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CompressionInitializer_ESTest_scaffolding5.class.getClassLoader() ,
      "it.yup.util.RMSIndex",
      "it.yup.util.RMSIndex$Item",
      "it.yup.xmpp.IQResultListener",
      "it.yup.xmlstream.BasicXmlStream$ResourceBinding",
      "it.yup.xmlstream.SASLAuthenticator",
      "it.yup.xmlstream.StreamEventListener",
      "it.yup.xmlstream.SocketStream",
      "it.yup.util.RMSIndex$Comparator",
      "it.yup.xmpp.Roster",
      "it.yup.xmlstream.Initializer",
      "it.yup.xmpp.XMPPClient$3",
      "it.yup.xmpp.Roster$3",
      "it.yup.xmlstream.BasicXmlStream$SessionOpener",
      "it.yup.xmlstream.PacketListener",
      "it.yup.transport.TransportListener",
      "it.yup.xmpp.Roster$1",
      "it.yup.xmpp.packets.Iq",
      "it.yup.xmpp.Roster$2",
      "it.yup.xmlstream.EventQueryRegistration",
      "it.yup.xmlstream.EventQuery",
      "it.yup.xml.Element",
      "it.yup.transport.SocketChannel",
      "it.yup.xmlstream.AccountRegistration",
      "it.yup.xmlstream.CompressionInitializer",
      "it.yup.xmlstream.BasicXmlStream",
      "it.yup.xmpp.Config",
      "it.yup.xmpp.XMPPClient",
      "it.yup.xmlstream.BasicXmlStream$ListenerRegistration",
      "org.xmlpull.v1.XmlPullParser",
      "it.yup.util.RMSIndex$DefaultUTF8Comparator",
      "it.yup.xmpp.packets.Stanza",
      "it.yup.xmpp.Contact",
      "it.yup.transport.BaseChannel",
      "org.xmlpull.v1.XmlPullParserException",
      "it.yup.transport.SocketChannel$UTFReader",
      "it.yup.xmpp.packets.Presence"
    );
  } 
}
