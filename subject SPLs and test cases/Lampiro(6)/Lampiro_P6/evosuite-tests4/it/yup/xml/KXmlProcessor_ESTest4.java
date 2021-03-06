/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 16:16:39 KST 2018
 */

package it.yup.xml;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class KXmlProcessor_ESTest4 extends KXmlProcessor_ESTest_scaffolding4 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        KXmlProcessor.pullElement((XmlPullParser) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      it.yup.xmlstream.KXmlParser kXmlParser0 = new it.yup.xmlstream.KXmlParser();
      StringReader stringReader0 = new StringReader("");
      kXmlParser0.setInput((Reader) stringReader0);
      // Undeclared exception!
      try { 
        KXmlProcessor.pullElement(kXmlParser0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        KXmlProcessor.pullDocumentStart((XmlPullParser) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      it.yup.xmlstream.KXmlParser kXmlParser0 = new it.yup.xmlstream.KXmlParser();
      StringReader stringReader0 = new StringReader("");
      kXmlParser0.setInput((Reader) stringReader0);
      // Undeclared exception!
      try { 
        KXmlProcessor.pullDocumentStart(kXmlParser0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        KXmlProcessor.parseDocument((XmlPullParser) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      it.yup.xmlstream.KXmlParser kXmlParser0 = new it.yup.xmlstream.KXmlParser();
      StringReader stringReader0 = new StringReader("");
      kXmlParser0.setInput((Reader) stringReader0);
      // Undeclared exception!
      try { 
        KXmlProcessor.parseDocument(kXmlParser0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      StringReader stringReader0 = new StringReader("");
      stringReader0.close();
      kXmlParser0.setInput((Reader) stringReader0);
      try { 
        KXmlProcessor.parseDocument(kXmlParser0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      Element element0 = KXmlProcessor.pullDocumentStart(kXmlParser0);
      assertEquals(0, element0.maxWait);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
      try { 
        KXmlProcessor.pullElement(kXmlParser0);
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
      KXmlParser kXmlParser0 = new KXmlParser();
      try { 
        KXmlProcessor.parseDocument(kXmlParser0);
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // No Input specified (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xml.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KXmlProcessor kXmlProcessor0 = new KXmlProcessor();
  }
}
