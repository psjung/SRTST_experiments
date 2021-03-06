/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 18:40:10 KST 2018
 */

package it.yup.xmlstream;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Element_ESTest5 extends Element_ESTest_scaffolding5 {
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
      Element element0 = new Element();
      element0.maxWait = 1;
      element0.setAttribute("", "");
      Element element1 = element0.clone();
      assertEquals(0, element1.maxWait);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Element element0 = new Element("", (String) null);
      Element element1 = element0.clone();
      assertNotSame(element1, element0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Element element0 = new Element();
      element0.maxWait = (-1);
      it.yup.xml.KXmlParser kXmlParser0 = new it.yup.xml.KXmlParser();
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
      kXmlParser0.setInput((Reader) null);
      Element element0 = Element.pullDocumentStart(kXmlParser0);
      assertEquals(0L, element0.queueTime);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Element element0 = new Element("", "");
      Vector<Integer> vector0 = new Vector<Integer>();
      element0.attributes = vector0;
      element0.setAttribute("", "");
      vector0.add((Integer) element0.maxWait);
      // Undeclared exception!
      try { 
        element0.getAttribute((String) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to [Ljava.lang.String;
         //
         verifyException("it.yup.xmlstream.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      FileInputStream fileInputStream0 = new FileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(fileInputStream0);
      Element element0 = Element.load(dataInputStream0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Element element0 = new Element();
      element0.setAttribute("expected: '", "e");
      String string0 = element0.getAttribute("expected: '");
      assertNotNull(string0);
      assertEquals("e", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Element.pullElement((XmlPullParser) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
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
  public void test12()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      Element element0 = Element.pullDocumentStart(kXmlParser0);
      element0.addElement((String) null, (String) null);
      // Undeclared exception!
      try { 
        element0.getChildrenByName("", "");
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
      Element element0 = new Element();
      element0.setAttribute((String) null, "");
      // Undeclared exception!
      try { 
        element0.delAttribute((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Element element0 = new Element();
      // Undeclared exception!
      try { 
        element0._parse((XmlPullParser) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      Element element0 = Element.pullDocumentStart(kXmlParser0);
      element0.content = "";
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream(byteArrayOutputStream0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(printStream0);
      element0.serialize(dataOutputStream0);
      assertEquals(0, element0.maxWait);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Element element0 = new Element("", "");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream(byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(printStream0);
      element0.addElement((String) null, (String) null);
      element0.serialize(dataOutputStream0);
      assertEquals(20, byteArrayOutputStream0.size());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      Element element0 = Element.pullDocumentStart(kXmlParser0);
      Element element1 = element0.addElement("", "");
      Element element2 = element0.clone();
      assertNotSame(element0, element1);
      assertNotSame(element2, element0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Element element0 = new Element("", "");
      Element element1 = new Element(element0);
      assertFalse(element1.equals((Object)element0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Element element0 = new Element("", "");
      element0.content = "";
      byte[] byteArray0 = element0.toXml();
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Element element0 = new Element("", "");
      element0.addElement((String) null, (String) null);
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
  public void test23()  throws Throwable  {
      it.yup.xml.KXmlParser kXmlParser0 = new it.yup.xml.KXmlParser();
      StringReader stringReader0 = new StringReader("");
      kXmlParser0.setInput((Reader) stringReader0);
      // Undeclared exception!
      Element.parseDocument(kXmlParser0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      Element element0 = Element.pullDocumentStart(kXmlParser0);
      Element element1 = element0.addElement("", "");
      Element[] elementArray0 = element0.getChildrenByName("", "g");
      assertNotSame(element0, element1);
      assertEquals(0, elementArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      Element element0 = Element.pullDocumentStart(kXmlParser0);
      Element element1 = element0.addElement("", "");
      Element[] elementArray0 = element0.getChildrenByName("", "");
      assertEquals(1, elementArray0.length);
      assertNotSame(element0, element1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      Element element0 = Element.pullDocumentStart(kXmlParser0);
      Element element1 = element0.getChildByName("", "");
      assertNull(element1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Element element0 = new Element("", "");
      element0.addElement((String) null, (String) null);
      // Undeclared exception!
      try { 
        element0.getChildByName("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Element element0 = new Element();
      element0.setAttribute("", "");
      element0.delAttribute("2");
      assertEquals(0, element0.maxWait);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Element element0 = new Element();
      element0.setAttribute("", "");
      element0.delAttribute("");
      assertEquals(0, element0.maxWait);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Element element0 = new Element();
      element0.setAttribute("", "");
      element0.setAttribute("2", (String) null);
      assertEquals(0L, element0.queueTime);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Element element0 = new Element();
      Vector<Element> vector0 = new Vector<Element>();
      element0.attributes = vector0;
      vector0.add(element0);
      // Undeclared exception!
      try { 
        element0.setAttribute("", "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // it.yup.xmlstream.Element cannot be cast to [Ljava.lang.String;
         //
         verifyException("it.yup.xmlstream.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Element element0 = new Element();
      element0.setAttribute("", "");
      String string0 = element0.getAttribute("E");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Element element0 = new Element();
      element0.setAttribute("", "");
      String string0 = element0.getAttribute("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      String string0 = Element.createUniqueId();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      Element element0 = Element.pullDocumentStart(kXmlParser0);
      Element element1 = element0.addElement("", "");
      Element element2 = element0.getChildByName("", "U");
      assertNotSame(element0, element1);
      assertNull(element2);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      Element element0 = Element.pullDocumentStart(kXmlParser0);
      String string0 = element0.getUri("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Element element0 = new Element((String) null, "");
      byte[] byteArray0 = element0.toXml();
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      try { 
        Element.parseDocument(kXmlParser0);
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // No Input specified (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xmlstream.KXmlParser", e);
      }
  }
}
