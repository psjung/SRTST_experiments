/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 11:58:42 KST 2018
 */

package it.yup.xml;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class BProcessor_ESTest2 extends BProcessor_ESTest_scaffolding2 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Element element0 = new Element("", "");
      element0.delAttribute("");
      byte[] byteArray0 = BProcessor.toBinary(element0);
      assertArrayEquals(new byte[] {(byte)32, (byte)0, (byte) (-1), (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Element element0 = new Element("", "");
      element0.nchildren = 129;
      // Undeclared exception!
      try { 
        BProcessor.toBinary(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.BProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)1;
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)1;
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)1;
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Element element0 = new Element("", "");
      byte[] byteArray0 = BProcessor.toBinary(element0);
      Element element1 = BProcessor.parse(byteArray0);
      assertNotNull(element1);
      assertArrayEquals(new byte[] {(byte)32, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        BProcessor.parse((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "";
      String[][] stringArray0 = new String[2][3];
      String[] stringArray1 = new String[3];
      stringArray1[1] = "";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray0[0];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        BProcessor.toBinary(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.BProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      String[][] stringArray0 = new String[2][5];
      String[] stringArray1 = new String[9];
      stringArray1[0] = "~5IGd5{{Smf53o";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("~5IGd5{{Smf53o", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        BProcessor.toBinary(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      String[][] stringArray0 = new String[2][5];
      String[] stringArray1 = new String[9];
      stringArray1[0] = "5";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        BProcessor.toBinary(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      String[][] stringArray0 = new String[2][5];
      String[] stringArray1 = new String[9];
      stringArray1[0] = "";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        BProcessor.toBinary(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Element element0 = new Element(";", "");
      element0.addElement("", "");
      byte[] byteArray0 = BProcessor.toBinary(element0);
      assertArrayEquals(new byte[] {(byte)33, (byte)59, (byte)0, (byte)0, (byte)1, (byte)32, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Element element0 = new Element("", "");
      element0.nchildren = 128;
      // Undeclared exception!
      try { 
        BProcessor.toBinary(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.BProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-1);
      byteArray0[3] = (byte)32;
      byteArray0[5] = (byte) (-1);
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-1);
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)2;
      Element element0 = BProcessor.parse(byteArray0);
      assertEquals(0L, element0.queueTime);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)1;
      Element element0 = BProcessor.parse(byteArray0);
      assertNotNull(element0);
      
      byte[] byteArray1 = BProcessor.toBinary(element0);
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)97;
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)2;
      byteArray0[4] = (byte)32;
      Element element0 = BProcessor.parse(byteArray0);
      assertEquals(0L, element0.queueTime);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      byteArray0[1] = (byte) (-1);
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-1);
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)64;
      // Undeclared exception!
      try { 
        BProcessor.parse(byteArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xml.BProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BProcessor bProcessor0 = new BProcessor();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) bProcessor0;
      String[][] stringArray0 = new String[0][3];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        BProcessor.toBinary(element0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // it.yup.xml.BProcessor cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xml.BProcessor", e);
      }
  }
}
