/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jul 01 00:42:42 KST 2018
 */

package it.yup.transport;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class BaseChannel_ESTest_scaffolding1 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "it.yup.transport.BaseChannel"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BaseChannel_ESTest_scaffolding1.class.getClassLoader() ,
      "org.bouncycastle.crypto.tls.TlsInputStream",
      "it.yup.xmlstream.BasicXmlStream$ResourceBinding",
      "org.bouncycastle.crypto.tls.TlsOuputStream",
      "it.yup.xmlstream.SASLAuthenticator",
      "it.yup.xmlstream.StreamEventListener",
      "it.yup.xmlstream.SocketStream",
      "org.bouncycastle.crypto.CryptoException",
      "it.yup.util.Utils",
      "it.yup.transport.BaseChannel$Sender",
      "org.bouncycastle.crypto.Digest",
      "it.yup.xmlstream.Initializer",
      "org.bouncycastle.crypto.InvalidCipherTextException",
      "it.yup.xmlstream.BasicXmlStream$SessionOpener",
      "it.yup.transport.TransportListener",
      "it.yup.xmlstream.PacketListener",
      "it.yup.xmpp.packets.Iq",
      "org.bouncycastle.crypto.digests.GeneralDigest",
      "it.yup.transport.SocketChannel$1",
      "it.yup.transport.SocketChannel$2",
      "it.yup.xmlstream.EventQueryRegistration",
      "it.yup.xmlstream.EventQuery",
      "it.yup.transport.SocketChannel",
      "it.yup.xml.Element",
      "it.yup.xmlstream.BasicXmlStream",
      "it.yup.xmlstream.BasicXmlStream$ListenerRegistration",
      "org.bouncycastle.crypto.digests.SHA1Digest",
      "org.bouncycastle.crypto.digests.MD5Digest",
      "org.bouncycastle.crypto.CipherParameters",
      "org.xmlpull.v1.XmlPullParser",
      "it.yup.xmpp.packets.Stanza",
      "it.yup.transport.BaseChannel",
      "org.bouncycastle.crypto.tls.TlsProtocolHandler",
      "org.bouncycastle.crypto.AsymmetricBlockCipher",
      "org.xmlpull.v1.XmlPullParserException",
      "it.yup.transport.SocketChannel$UTFReader",
      "it.yup.util.Logger",
      "javab.security.SecureRandom",
      "org.bouncycastle.crypto.ExtendedDigest"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Enumeration", false, BaseChannel_ESTest_scaffolding1.class.getClassLoader()));
  }
}
