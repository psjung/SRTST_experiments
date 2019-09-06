/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 18:32:36 KST 2018
 */

package it.yup.xml;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.Reader;
import java.io.StringReader;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class KXmlProcessor_ESTest5 extends KXmlProcessor_ESTest_scaffolding5 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
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
  public void test1()  throws Throwable  {
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
  public void test2()  throws Throwable  {
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
  public void test3()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
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
  public void test4()  throws Throwable  {
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
  public void test5()  throws Throwable  {
      KXmlParser kXmlParser0 = new KXmlParser();
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
  public void test6()  throws Throwable  {
      it.yup.xmlstream.KXmlParser kXmlParser0 = new it.yup.xmlstream.KXmlParser();
      Element element0 = KXmlProcessor.pullDocumentStart(kXmlParser0);
      assertEquals(0, element0.maxWait);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      it.yup.xmlstream.KXmlParser kXmlParser0 = new it.yup.xmlstream.KXmlParser();
      try { 
        KXmlProcessor.pullElement(kXmlParser0);
        fail("Expecting exception: XmlPullParserException");
      
      } catch(XmlPullParserException e) {
         //
         // No Input specified (position:START_DOCUMENT null@0:0) 
         //
         verifyException("it.yup.xmlstream.KXmlParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
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
  public void test9()  throws Throwable  {
      KXmlProcessor kXmlProcessor0 = new KXmlProcessor();
  }
}
