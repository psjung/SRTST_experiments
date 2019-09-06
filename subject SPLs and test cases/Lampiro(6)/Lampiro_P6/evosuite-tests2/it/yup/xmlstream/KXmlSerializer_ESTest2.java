/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 12:19:37 KST 2018
 */

package it.yup.xmlstream;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class KXmlSerializer_ESTest2 extends KXmlSerializer_ESTest_scaffolding2 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.endTag("", "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag("", "");
      XmlSerializer xmlSerializer1 = xmlSerializer0.startTag("", "");
      assertSame(xmlSerializer0, xmlSerializer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.startTag("", "");
      XmlSerializer xmlSerializer0 = kXmlSerializer0.attribute("", "", " ");
      assertSame(xmlSerializer0, kXmlSerializer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.flush();
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter(0);
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.processingInstruction("");
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.entityRef("");
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter(0);
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.docdecl("");
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter(0);
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.comment((String) null);
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      char[] charArray0 = new char[4];
      XmlSerializer xmlSerializer0 = kXmlSerializer0.text(charArray0, 0, 0);
      assertNull(xmlSerializer0.getNamespace());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag("", "");
      XmlSerializer xmlSerializer1 = xmlSerializer0.text("");
      assertEquals("", xmlSerializer1.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      String string0 = kXmlSerializer0.getPrefix("", false);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      String string0 = kXmlSerializer0.getPrefix("I", true);
      assertEquals("n0", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.startTag("K", "");
      kXmlSerializer0.getNamespace();
      assertEquals(1, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag("", "K");
      String string0 = xmlSerializer0.getName();
      assertEquals(1, kXmlSerializer0.getDepth());
      assertEquals("K", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.text((char[]) null, 0, (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      Boolean boolean0 = Boolean.valueOf(false);
      // Undeclared exception!
      try { 
        kXmlSerializer0.startDocument("", boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      int int0 = kXmlSerializer0.getDepth();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag("KIvIsiT=x", "KIvIsiT=x");
      kXmlSerializer0.endDocument();
      XmlSerializer xmlSerializer1 = xmlSerializer0.endTag("KIvIsiT=x", "KIvIsiT=x");
      assertEquals(0, xmlSerializer1.getDepth());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      kXmlSerializer0.setPrefix("", "");
      kXmlSerializer0.setPrefix("", "");
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag("KIvIsiT=x", "KIvIsiT=x");
      xmlSerializer0.endTag("KIvIsiT=x", "KIvIsiT=x");
      xmlSerializer0.getName();
      assertEquals(0, xmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag("", "");
      xmlSerializer0.getName();
      assertEquals(1, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag("KIvIsiT=x", "KIvIsiT=x");
      xmlSerializer0.endTag("KIvIsiT=x", "KIvIsiT=x");
      kXmlSerializer0.getNamespace();
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.startTag("", "");
      kXmlSerializer0.getNamespace();
      assertEquals(1, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.startTag("K", "");
      kXmlSerializer0.cdsect("");
      kXmlSerializer0.endDocument();
      assertNull(kXmlSerializer0.getNamespace());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.endTag((String) null, "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      kXmlSerializer0.setPrefix("v", "");
      // Undeclared exception!
      try { 
        kXmlSerializer0.startTag("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.startTag("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.startTag((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      Boolean boolean0 = new Boolean(true);
      kXmlSerializer0.startDocument("", boolean0);
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      Boolean boolean0 = Boolean.valueOf("");
      kXmlSerializer0.startDocument("", boolean0);
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream(byteArrayOutputStream0, true);
      try { 
        kXmlSerializer0.setOutput((OutputStream) printStream0, "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.setOutput((OutputStream) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      kXmlSerializer0.setOutput((OutputStream) pipedOutputStream0, (String) null);
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      kXmlSerializer0.setPrefix((String) null, (String) null);
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.setFeature("", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported Feature
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter(0);
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.setPrefix("", "c");
      kXmlSerializer0.setPrefix("", "");
      kXmlSerializer0.setPrefix("", "f");
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag("KIvIsiT=x", "");
      XmlSerializer xmlSerializer1 = kXmlSerializer0.attribute("KIvIsiT=x", "", "");
      assertSame(xmlSerializer1, xmlSerializer0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      boolean boolean0 = kXmlSerializer0.getFeature("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.startTag("", "");
      kXmlSerializer0.cdsect("");
      kXmlSerializer0.endDocument();
      assertNull(kXmlSerializer0.getNamespace());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.text("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.startTag("", "");
      XmlSerializer xmlSerializer0 = kXmlSerializer0.attribute("", "", ">");
      assertEquals("", xmlSerializer0.getName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag("", "");
      XmlSerializer xmlSerializer1 = xmlSerializer0.attribute("", "", "<");
      assertSame(xmlSerializer0, xmlSerializer1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.ignorableWhitespace("&");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter(0);
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.text("\"");
      assertEquals(0, xmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.text("\r");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter(0);
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.text("\n");
      assertEquals(0, xmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag("KIvIsiT=x", "KIvIsiT=x");
      xmlSerializer0.endTag("KIvIsiT=x", "KIvIsiT=x");
      // Undeclared exception!
      try { 
        xmlSerializer0.attribute("", "", "");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal position for attribute
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.processingInstruction("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.text((char[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.docdecl("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.entityRef("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.endDocument();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.comment("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.getProperty("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported property
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      kXmlSerializer0.getPrefix("", true);
      String string0 = kXmlSerializer0.getPrefix("", true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      kXmlSerializer0.ignorableWhitespace("");
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.cdsect("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        kXmlSerializer0.setProperty("", object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported Property:java.lang.Object@2b0097a9
         //
         verifyException("it.yup.xmlstream.KXmlSerializer", e);
      }
  }
}
