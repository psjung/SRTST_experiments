/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 15:37:11 KST 2018
 */

package it.yup.xmlstream;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.shaded.org.mockito.Mockito.doReturn;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Enumeration;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.transport.SocketChannel;
import it.yup.transport.TransportListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class BasicXmlStream_ESTest6 extends BasicXmlStream_ESTest_scaffolding6 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      SocketChannel socketChannel0 = new SocketChannel("", (TransportListener) null);
      // Undeclared exception!
      try { 
        socketStream0.connectionEstablished(socketChannel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.SocketStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      it.yup.xml.Element element0 = new it.yup.xml.Element("", "");
      element0.uri = "urn:ietf:params:xml:ns:xmpp-stanzas";
      socketStream0.promotePacket(element0);
      socketStream0.run();
      String[] stringArray0 = new String[4];
      stringArray0[0] = null;
      stringArray0[1] = "(w@ispace)";
      stringArray0[2] = "(w@ispace)";
      stringArray0[3] = "ZEU26R>tvpee(";
      EventQuery eventQuery0 = new EventQuery("", stringArray0, stringArray0);
      boolean boolean0 = socketStream0.areMatching(element0, eventQuery0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      socketStream0.initialize("", "");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      // Undeclared exception!
      try { 
        socketStream0.send((it.yup.xml.Element) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.BasicXmlStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) socketStream0;
      String[][] stringArray0 = new String[1][8];
      String[] stringArray1 = new String[9];
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      it.yup.xml.Element element0 = new it.yup.xml.Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        socketStream0.send(element0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // it.yup.xmlstream.SocketStream cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        BasicXmlStream.removeEventListener((EventQueryRegistration) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.BasicXmlStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      BasicXmlStream.addOnetimeEventListener((EventQuery) null, "");
      // Undeclared exception!
      try { 
        socketStream0.nextInitializer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.BasicXmlStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      // Undeclared exception!
      try { 
        socketStream0.dispatchEvent((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.BasicXmlStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      String[] stringArray0 = new String[6];
      EventQuery eventQuery0 = new EventQuery("", stringArray0, stringArray0);
      BasicXmlStream.addEventListener(eventQuery0, "");
      SASLAuthenticator sASLAuthenticator0 = new SASLAuthenticator();
      // Undeclared exception!
      try { 
        socketStream0.dispatchEvent("", sASLAuthenticator0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to it.yup.xmlstream.StreamEventListener
         //
         verifyException("it.yup.xmlstream.BasicXmlStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      AccountRegistration accountRegistration0 = new AccountRegistration();
      // Undeclared exception!
      try { 
        socketStream0.addInitializer(accountRegistration0, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4 > 3
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      socketStream0.nextInitializer();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[1];
      EventQuery eventQuery0 = new EventQuery("", stringArray0, stringArray0);
      SocketStream socketStream0 = new SocketStream();
      BasicXmlStream.ListenerRegistration basicXmlStream_ListenerRegistration0 = new BasicXmlStream.ListenerRegistration(eventQuery0, socketStream0, true);
      assertTrue(basicXmlStream_ListenerRegistration0.oneTime);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      Enumeration<String> enumeration0 = (Enumeration<String>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      socketStream0.initializerInterator = enumeration0;
      socketStream0.nextInitializer();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      it.yup.xml.Element[] elementArray0 = new it.yup.xml.Element[1];
      String[][] stringArray0 = new String[2][1];
      it.yup.xml.Element element0 = new it.yup.xml.Element("", (String) null, elementArray0, stringArray0);
      elementArray0[0] = element0;
      socketStream0.processFeatures(elementArray0);
      assertEquals(1, elementArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      it.yup.xml.Element[] elementArray0 = new it.yup.xml.Element[1];
      // Undeclared exception!
      try { 
        socketStream0.processFeatures(elementArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.BasicXmlStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      socketStream0.dispatchEvent("", "");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      Object[] objectArray0 = new Object[5];
      String[][] stringArray0 = new String[2][7];
      it.yup.xml.Element element0 = new it.yup.xml.Element("", "(w@ispace)", objectArray0, stringArray0);
      socketStream0.promotePacket(element0);
      assertEquals(0L, element0.queueTime);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      it.yup.xml.Element element0 = new it.yup.xml.Element("", "");
      socketStream0.promotePacket(element0);
      assertEquals(0L, element0.queueTime);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      Vector<SocketStream> vector0 = new Vector<SocketStream>();
      vector0.add(socketStream0);
      socketStream0.sendQueue = vector0;
      Vector vector1 = socketStream0.getPacketsToSend(false);
      assertEquals(1, vector1.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      Vector<SocketStream> vector0 = new Vector<SocketStream>();
      vector0.add(socketStream0);
      socketStream0.sendQueue = vector0;
      // Undeclared exception!
      try { 
        socketStream0.getPacketsToSend(true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // it.yup.xmlstream.SocketStream cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xmlstream.BasicXmlStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      Vector vector0 = socketStream0.getPacketsToSend(true);
      assertEquals("[]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      AccountRegistration accountRegistration0 = new AccountRegistration();
      socketStream0.addInitializer(accountRegistration0, 0);
      assertFalse(accountRegistration0.optional);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      SASLAuthenticator sASLAuthenticator0 = new SASLAuthenticator();
      socketStream0.removeInitializer(sASLAuthenticator0);
      assertFalse(sASLAuthenticator0.optional);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[6];
      EventQuery eventQuery0 = new EventQuery("", stringArray0, stringArray0);
      EventQueryRegistration eventQueryRegistration0 = BasicXmlStream.addEventListener(eventQuery0, "");
      BasicXmlStream.removeEventListener(eventQueryRegistration0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      Object[] objectArray0 = new Object[4];
      String[][] stringArray0 = new String[8][6];
      it.yup.xml.Element element0 = new it.yup.xml.Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        socketStream0.send(element0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }
}