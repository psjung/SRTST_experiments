/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jul 01 01:54:36 KST 2018
 */

package it.yup.xmlstream;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class BasicXmlStream_ESTest_scaffolding1 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "it.yup.xmlstream.BasicXmlStream"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BasicXmlStream_ESTest_scaffolding1.class.getClassLoader() ,
      "it.yup.xmlstream.BasicXmlStream$ResourceBinding",
      "it.yup.xmlstream.SASLAuthenticator",
      "it.yup.xmlstream.StreamEventListener",
      "it.yup.xmlstream.SocketStream",
      "it.yup.util.Utils",
      "org.bouncycastle.crypto.Digest",
      "it.yup.xmlstream.Initializer",
      "it.yup.xmlstream.BasicXmlStream$SessionOpener",
      "it.yup.transport.TransportListener",
      "it.yup.xmlstream.PacketListener",
      "it.yup.xmpp.packets.Iq",
      "org.bouncycastle.crypto.digests.GeneralDigest",
      "it.yup.xmlstream.EventQueryRegistration",
      "it.yup.transport.SocketChannel$2",
      "it.yup.xmlstream.EventQuery",
      "it.yup.transport.SocketChannel",
      "it.yup.xml.Element",
      "it.yup.xml.KXmlParser",
      "it.yup.xmlstream.AccountRegistration",
      "it.yup.xmlstream.BasicXmlStream",
      "it.yup.xmlstream.BasicXmlStream$ListenerRegistration",
      "org.bouncycastle.crypto.digests.SHA1Digest",
      "org.bouncycastle.crypto.digests.MD5Digest",
      "org.xmlpull.v1.XmlPullParser",
      "it.yup.xmpp.packets.Stanza",
      "it.yup.transport.BaseChannel",
      "org.xmlpull.v1.XmlPullParserException",
      "it.yup.transport.SocketChannel$UTFReader",
      "it.yup.util.Logger",
      "org.bouncycastle.crypto.ExtendedDigest"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Enumeration", false, BasicXmlStream_ESTest_scaffolding1.class.getClassLoader()));
  }
}
