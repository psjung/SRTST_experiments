/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 15:22:30 KST 2018
 */

package it.yup.xml;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class BProcessor_ESTest6 extends BProcessor_ESTest_scaffolding6 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)1;
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte) (-1);
      BProcessor.parse(byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-1);
      BProcessor.parse(byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)96;
      BProcessor.parse(byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      String[][] stringArray0 = new String[4][3];
      String[] stringArray1 = new String[7];
      stringArray1[1] = "";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray1;
      stringArray0[2] = stringArray0[1];
      String[] stringArray2 = new String[0];
      stringArray0[3] = stringArray2;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        BProcessor.toBinary(element0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("it.yup.xml.BProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) "";
      String[][] stringArray0 = new String[7][3];
      String[] stringArray1 = new String[4];
      stringArray1[1] = "";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray0[0];
      stringArray0[2] = stringArray1;
      stringArray0[3] = stringArray0[0];
      stringArray0[4] = stringArray0[3];
      stringArray0[5] = stringArray0[2];
      stringArray0[6] = stringArray0[1];
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
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      String[][] stringArray0 = new String[3][3];
      String[] stringArray1 = new String[8];
      stringArray1[0] = "I76s";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("I76s", "", objectArray0, stringArray0);
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
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      String[][] stringArray0 = new String[3][3];
      String[] stringArray1 = new String[8];
      stringArray1[0] = "I";
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
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      String[][] stringArray0 = new String[3][3];
      String[] stringArray1 = new String[8];
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
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-1);
      byteArray0[4] = (byte) (-1);
      BProcessor.parse(byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-1);
      BProcessor.parse(byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-1);
      byteArray0[4] = (byte) (-1);
      // Undeclared exception!
      BProcessor.parse(byteArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)32;
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-1);
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-1);
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
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
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)32;
      Element element0 = BProcessor.parse(byteArray0);
      assertEquals(0, element0.maxWait);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BProcessor bProcessor0 = new BProcessor();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) bProcessor0;
      String[][] stringArray0 = new String[3][3];
      String[] stringArray1 = new String[8];
      stringArray1[1] = "";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray1;
      stringArray0[2] = stringArray1;
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

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Element element0 = BProcessor.parse(byteArray0);
      assertNotNull(element0);
      
      byte[] byteArray1 = BProcessor.toBinary(element0);
      assertEquals(17, byteArray1.length);
  }
}
