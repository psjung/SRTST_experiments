/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 18:31:51 KST 2018
 */

package it.yup.xml;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParserException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class KXmlParser_ESTest5 extends KXmlParser_ESTest_scaffolding5 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.require((-1), "", "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getAttributeValue((-2));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getAttributeValue(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getAttributePrefix(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getAttributeName((-2));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -6
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getAttributeName(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getAttributeNamespace(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      StringReader stringReader0 = new StringReader("");
      kXmlParser0.setInput((Reader) stringReader0);
      kXmlParser0.getAttributeCount();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      try { 
        kXmlParser0.skipSubTree();
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // expected: START_TAG {null}null (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.setProperty((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.setFeature((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      try { 
        kXmlParser0.nextTag();
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // No Input specified (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      try { 
        kXmlParser0.next();
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // No Input specified (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        kXmlParser0.getTextCharacters(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getProperty((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getNamespaceUri(4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getNamespacePrefix(4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getNamespaceCount((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getFeature((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      kXmlParser0.getText();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      kXmlParser0.getPositionDescription();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      kXmlParser0.getNamespaceCount(0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      kXmlParser0.getNamespace();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      kXmlParser0.getLineNumber();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      kXmlParser0.getColumnNumber();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      Object object0 = new Object();
      try { 
        kXmlParser0.setProperty("", object0);
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // unsupported property: 
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      try { 
        kXmlParser0.setFeature("", false);
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // unsupported feature:  (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      try { 
        kXmlParser0.nextText();
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // precondition: START_TAG (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      try { 
        kXmlParser0.require(0, (String) null, "");
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // expected: START_DOCUMENT {null} (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      kXmlParser0.getAttributeValue("", "");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getAttributeValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getAttributePrefix(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getAttributePrefix((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getAttributeName(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getAttributeNamespace(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getAttributeNamespace((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      try { 
        kXmlParser0.isEmptyElementTag();
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // Wrong event type (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      int[] intArray0 = new int[5];
      kXmlParser0.getTextCharacters(intArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      try { 
        kXmlParser0.isWhitespace();
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // Wrong event type (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      StringReader stringReader0 = new StringReader("");
      kXmlParser0.setInput((Reader) stringReader0);
      kXmlParser0.getPositionDescription();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.getNamespaceCount(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      kXmlParser0.getNamespace("");
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      kXmlParser0.getProperty("");
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.defineEntityReplacementText("", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // entity replacement text must be defined after setInput!
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      StringReader stringReader0 = new StringReader("i");
      kXmlParser0.setInput((Reader) stringReader0);
      int int0 = kXmlParser0.nextToken();
      assertEquals(1, kXmlParser0.getLineNumber());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      StringReader stringReader0 = new StringReader(" ");
      kXmlParser0.setInput((Reader) stringReader0);
      int int0 = kXmlParser0.next();
      assertEquals((-1), kXmlParser0.getAttributeCount());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.setFeature("http://xmlpull.org/v1/doc/", false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      boolean boolean0 = kXmlParser0.getFeature("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      // Undeclared exception!
      try { 
        kXmlParser0.setProperty("http://xmlpull.org/v1/doc/", "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      String string0 = kXmlParser0.getAttributeType(0);
      assertEquals("CDATA", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      int int0 = kXmlParser0.getDepth();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      String string0 = kXmlParser0.getPrefix();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      String string0 = kXmlParser0.getNamespaceUri(0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      int int0 = kXmlParser0.getAttributeCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      boolean boolean0 = kXmlParser0.isAttributeDefault(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      String string0 = kXmlParser0.getInputEncoding();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      String string0 = kXmlParser0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      int int0 = kXmlParser0.getEventType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      try { 
        kXmlParser0.require(0, "", "");
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // expected: START_DOCUMENT {} (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      String string0 = kXmlParser0.getNamespacePrefix(0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        kXmlParser0.setInput((InputStream) byteArrayInputStream0, "");
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // unsupported
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      try { 
        kXmlParser0.nextToken();
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // No Input specified (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }
}