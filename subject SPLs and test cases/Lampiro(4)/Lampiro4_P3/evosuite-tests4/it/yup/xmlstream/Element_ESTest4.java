/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 17:47:02 KST 2018
 */

package it.yup.xmlstream;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Reader;
import java.io.StringReader;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Element_ESTest4 extends Element_ESTest_scaffolding4 {
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
      Element element0 = new Element("", "");
      element0.maxWait = (-1);
      element0.clone();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Element element0 = new Element("", "");
      Element element1 = new Element(element0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      it.yup.xml.KXmlParser kXmlParser0 = new it.yup.xml.KXmlParser();
      Element element0 = Element.pullDocumentStart(kXmlParser0);
      element0.maxWait = 1;
      try { 
        element0._parse(kXmlParser0);
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // No Input specified (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      it.yup.xml.KXmlParser kXmlParser0 = new it.yup.xml.KXmlParser();
      StringReader stringReader0 = new StringReader("");
      kXmlParser0.setInput((Reader) stringReader0);
      Element.pullDocumentStart(kXmlParser0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Element element0 = new Element();
      element0.addElement("", "");
      element0.getChildByName("", "");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      Element.load(dataInputStream0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Element element0 = new Element();
      element0.setAttribute("V{h[bhke{A[x.X(E", "V");
      element0.getAttribute("V{h[bhke{A[x.X(E");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Element element0 = new Element();
      // Undeclared exception!
      try { 
        element0.toXml();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      it.yup.xml.KXmlParser kXmlParser0 = new it.yup.xml.KXmlParser();
      try { 
        Element.pullElement(kXmlParser0);
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // No Input specified (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Element.pullDocumentStart((XmlPullParser) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      StringReader stringReader0 = new StringReader("");
      kXmlParser0.setInput((Reader) stringReader0);
      // Undeclared exception!
      Element.parseDocument(kXmlParser0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Element.parseDocument((XmlPullParser) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Element.load((DataInputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), 1);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        Element.load(dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Element element0 = new Element();
      element0.addElement("", (String) null);
      // Undeclared exception!
      try { 
        element0.getChildByName((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Element element0 = new Element();
      element0.setAttribute((String) null, "");
      // Undeclared exception!
      try { 
        element0.getAttribute("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Element element0 = new Element();
      Element element1 = element0.addElement("", "");
      element1.attributes = element0.children;
      // Undeclared exception!
      try { 
        element1.delAttribute("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // it.yup.xmlstream.Element cannot be cast to [Ljava.lang.String;
         //
         verifyException("it.yup.xmlstream.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Element element0 = null;
      try {
        element0 = new Element((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Element element0 = new Element();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      element0.serialize(dataOutputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      Element element1 = Element.load(dataInputStream0);
      assertEquals(0L, element1.queueTime);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      Element element0 = Element.pullDocumentStart(kXmlParser0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        element0.serialize(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Element element0 = new Element("", "");
      Element element1 = element0.addElement("", "");
      Element element2 = element0.clone();
      assertNotSame(element0, element1);
      assertNotSame(element2, element0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Element element0 = new Element();
      Element element1 = element0.addElement("", "");
      Element element2 = new Element(element0);
      assertFalse(element2.equals((Object)element1));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Element element0 = new Element();
      element0.setAttribute("", "");
      Element element1 = new Element(element0);
      assertEquals(0L, element1.queueTime);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Element element0 = new Element("", "");
      Element element1 = element0.addElement("", "");
      byte[] byteArray0 = element0.toXml();
      assertEquals(9, byteArray0.length);
      assertNotSame(element0, element1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Element element0 = new Element();
      KXmlParser kXmlParser0 = new KXmlParser();
      StringReader stringReader0 = new StringReader("z");
      kXmlParser0.setInput((Reader) stringReader0);
      // Undeclared exception!
      element0._parse(kXmlParser0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      it.yup.xml.KXmlParser kXmlParser0 = new it.yup.xml.KXmlParser();
      Element element0 = Element.pullDocumentStart(kXmlParser0);
      element0.maxWait = 1;
      String string0 = element0.getAttribute("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Element element0 = new Element();
      Element element1 = element0.addElement("", "");
      Element[] elementArray0 = element0.getChildrenByName((String) null, (String) null);
      assertEquals(0, elementArray0.length);
      assertNotSame(element0, element1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Element element0 = new Element("", "");
      element0.setAttribute("", "");
      element0.delAttribute("K");
      assertEquals(0L, element0.queueTime);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Element element0 = new Element("", "");
      element0.setAttribute("", "");
      element0.delAttribute("");
      assertEquals(0L, element0.queueTime);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Element element0 = new Element();
      element0.setAttribute("", "");
      String string0 = element0.getAttribute("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        Element.pullElement((XmlPullParser) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = Element.createUniqueId();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Element element0 = new Element("", "");
      String string0 = element0.getUri("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Element element0 = new Element();
      Element element1 = element0.addElement("", "");
      Element element2 = element0.getChildByName("", (String) null);
      assertNotSame(element0, element1);
      assertNull(element2);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      it.yup.xml.KXmlParser kXmlParser0 = new it.yup.xml.KXmlParser();
      try { 
        Element.parseDocument(kXmlParser0);
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // No Input specified (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }
}
