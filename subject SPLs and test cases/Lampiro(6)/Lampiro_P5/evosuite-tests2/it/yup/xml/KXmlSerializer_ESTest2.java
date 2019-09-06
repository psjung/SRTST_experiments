/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 12:07:37 KST 2018
 */

package it.yup.xml;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
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
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag("", "");
      xmlSerializer0.startTag("", (String) null);
      kXmlSerializer0.entityRef("");
      assertEquals("", kXmlSerializer0.getNamespace());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter(0);
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.flush();
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter(0);
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.processingInstruction("");
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.endDocument();
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter(0);
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.docdecl((String) null);
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter(0);
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.comment("");
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.cdsect("");
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      String string0 = kXmlSerializer0.getPrefix("p", true);
      assertEquals("n0", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.startTag("I", "");
      kXmlSerializer0.getNamespace();
      assertEquals(1, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag("", "Q");
      String string0 = xmlSerializer0.getName();
      assertEquals(1, kXmlSerializer0.getDepth());
      assertEquals("Q", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.startTag("", "");
      int int0 = kXmlSerializer0.getDepth();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        kXmlSerializer0.text(charArray0, 3, 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      Boolean boolean0 = Boolean.TRUE;
      // Undeclared exception!
      try { 
        kXmlSerializer0.startDocument("", boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      int int0 = kXmlSerializer0.getDepth();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.startTag("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      kXmlSerializer0.getName();
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag("", "");
      xmlSerializer0.getName();
      assertEquals(1, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      kXmlSerializer0.getNamespace();
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      kXmlSerializer0.startTag("", "");
      kXmlSerializer0.getNamespace();
      assertEquals(1, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.endTag((String) null, "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.endTag("", (String) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.attribute("", "", "");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal position for attribute
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      kXmlSerializer0.setPrefix("x", "");
      // Undeclared exception!
      try { 
        kXmlSerializer0.startTag("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.startTag((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter(0);
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      Boolean boolean0 = Boolean.FALSE;
      kXmlSerializer0.startDocument((String) null, boolean0);
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter(0);
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      Boolean boolean0 = Boolean.valueOf(true);
      kXmlSerializer0.startDocument("", boolean0);
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.setOutput((OutputStream) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      try { 
        kXmlSerializer0.setOutput((OutputStream) byteArrayOutputStream0, "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      kXmlSerializer0.setPrefix((String) null, (String) null);
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.setFeature("", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported Feature
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      String string0 = kXmlSerializer0.getPrefix("", true);
      assertNotNull(string0);
      assertEquals("", string0);
      assertEquals(0, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag("h", "");
      XmlSerializer xmlSerializer1 = xmlSerializer0.attribute("h", "", "");
      assertSame(xmlSerializer1, xmlSerializer0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      boolean boolean0 = kXmlSerializer0.getFeature("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.endDocument();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.ignorableWhitespace("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag(">", "");
      xmlSerializer0.setPrefix("", "");
      assertEquals(1, kXmlSerializer0.getDepth());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.text("<");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.text("'");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.ignorableWhitespace("\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      kXmlSerializer0.setOutput((Writer) stringWriter0);
      XmlSerializer xmlSerializer0 = kXmlSerializer0.startTag("h", "");
      xmlSerializer0.text("");
      assertEquals(1, kXmlSerializer0.getDepth());
      assertEquals("", kXmlSerializer0.getName());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      kXmlSerializer0.ignorableWhitespace("");
      assertNull(kXmlSerializer0.getName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.comment("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.getProperty((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported property
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        kXmlSerializer0.setProperty("", object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported Property:java.lang.Object@fcca59
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.processingInstruction("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      char[] charArray0 = new char[6];
      XmlSerializer xmlSerializer0 = kXmlSerializer0.text(charArray0, 0, 0);
      assertNull(xmlSerializer0.getName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      XmlSerializer xmlSerializer0 = kXmlSerializer0.text("");
      assertNull(xmlSerializer0.getName());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.docdecl("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.cdsect((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      String string0 = kXmlSerializer0.getPrefix("", false);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      KXmlSerializer kXmlSerializer0 = new KXmlSerializer();
      // Undeclared exception!
      try { 
        kXmlSerializer0.entityRef("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.KXmlSerializer", e);
      }
  }
}
