/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jul 01 17:27:00 KST 2018
 */

package it.yup.transport;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class SocketChannel_ESTest_scaffolding5 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "it.yup.transport.SocketChannel"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SocketChannel_ESTest_scaffolding5.class.getClassLoader() ,
      "org.bouncycastle.crypto.tls.RecordStream",
      "org.bouncycastle.crypto.tls.TlsCipherSuiteManager",
      "it.yup.util.RMSIndex$Item",
      "com.jcraft.jzlib.Deflate",
      "org.bouncycastle.crypto.tls.TlsUtils",
      "com.jcraft.jzlib.Inflate",
      "com.jcraft.jzlib.InfCodes",
      "org.bouncycastle.crypto.tls.TlsInputStream",
      "it.yup.xmlstream.BasicXmlStream$ResourceBinding",
      "it.yup.xmlstream.SASLAuthenticator",
      "org.bouncycastle.crypto.tls.TlsOuputStream",
      "it.yup.xmlstream.SocketStream",
      "it.yup.util.RMSIndex$Comparator",
      "it.yup.util.Utils",
      "org.bouncycastle.crypto.tls.CertificateVerifyer",
      "it.yup.xmlstream.Initializer",
      "com.jcraft.jzlib.StaticTree",
      "it.yup.xmpp.Roster$3",
      "it.yup.xmlstream.PacketListener",
      "it.yup.xmpp.Roster$1",
      "it.yup.xmpp.packets.Iq",
      "it.yup.xmpp.Roster$2",
      "it.yup.xml.Element",
      "org.bouncycastle.crypto.prng.RandomGenerator",
      "org.bouncycastle.crypto.tls.TlsCipherSuite",
      "it.yup.xmpp.Config",
      "it.yup.xmlstream.BasicXmlStream$ListenerRegistration",
      "com.jcraft.jzlib.Tree",
      "org.xmlpull.v1.XmlPullParser",
      "org.bouncycastle.crypto.CipherParameters",
      "it.yup.transport.BaseChannel",
      "org.bouncycastle.crypto.tls.TlsProtocolHandler",
      "org.bouncycastle.crypto.BlockCipher",
      "org.bouncycastle.crypto.tls.TlsBlockCipherCipherSuite",
      "org.xmlpull.v1.XmlPullParserException",
      "it.yup.transport.SocketChannel$UTFReader",
      "it.yup.util.Logger",
      "it.yup.xmpp.packets.Presence",
      "org.bouncycastle.crypto.prng.ThreadedSeedGenerator$SeedGenerator",
      "org.bouncycastle.crypto.prng.ThreadedSeedGenerator",
      "com.jcraft.jzlib.ZOutputStream",
      "com.jcraft.jzlib.Deflate$Config",
      "it.yup.util.RMSIndex",
      "org.bouncycastle.crypto.tls.CombinedHash",
      "com.jcraft.jzlib.ZInputStream",
      "it.yup.xmpp.IQResultListener",
      "it.yup.xmlstream.StreamEventListener",
      "it.yup.xmpp.Roster",
      "org.bouncycastle.crypto.CryptoException",
      "org.bouncycastle.crypto.tls.AlwaysValidVerifyer",
      "it.yup.transport.BaseChannel$Sender",
      "org.bouncycastle.crypto.Digest",
      "it.yup.xmpp.XMPPClient$3",
      "it.yup.xmlstream.BasicXmlStream$SessionOpener",
      "org.bouncycastle.crypto.InvalidCipherTextException",
      "it.yup.transport.TransportListener",
      "com.jcraft.jzlib.ZStreamException",
      "org.bouncycastle.crypto.digests.GeneralDigest",
      "it.yup.transport.SocketChannel$1",
      "it.yup.transport.SocketChannel$2",
      "it.yup.xmlstream.EventQueryRegistration",
      "it.yup.xmlstream.EventQuery",
      "it.yup.transport.SocketChannel",
      "it.yup.xml.KXmlParser",
      "it.yup.xmlstream.AccountRegistration",
      "org.bouncycastle.crypto.tls.TlsNullCipherSuite",
      "it.yup.xmlstream.BasicXmlStream",
      "com.jcraft.jzlib.FilterInputStream",
      "it.yup.xmpp.XMPPClient",
      "org.bouncycastle.crypto.digests.SHA1Digest",
      "org.bouncycastle.crypto.digests.MD5Digest",
      "it.yup.util.RMSIndex$DefaultUTF8Comparator",
      "it.yup.xmpp.packets.Stanza",
      "org.bouncycastle.crypto.tls.ByteQueue",
      "it.yup.xmpp.Contact",
      "com.jcraft.jzlib.ZStream",
      "org.bouncycastle.crypto.AsymmetricBlockCipher",
      "com.jcraft.jzlib.InfTree",
      "org.bouncycastle.crypto.tls.TlsRuntimeException",
      "com.jcraft.jzlib.InfBlocks",
      "javab.security.SecureRandom",
      "org.bouncycastle.crypto.prng.DigestRandomGenerator",
      "org.bouncycastle.crypto.ExtendedDigest",
      "com.jcraft.jzlib.Adler32"
    );
  } 
}
