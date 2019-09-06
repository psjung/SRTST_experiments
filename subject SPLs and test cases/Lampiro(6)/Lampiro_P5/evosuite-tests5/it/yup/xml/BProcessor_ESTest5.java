/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 18:23:10 KST 2018
 */

package it.yup.xml;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class BProcessor_ESTest5 extends BProcessor_ESTest_scaffolding5 {
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
      element0.delAttribute("");
      BProcessor.toBinary(element0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      String[][] stringArray0 = new String[1][9];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      element0.nattributes = 129;
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
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-1);
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte) (-1);
      BProcessor.parse(byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-1);
      BProcessor.parse(byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      byteArray0[0] = (byte)32;
      BProcessor.parse(byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      String[][] stringArray0 = new String[6][4];
      String[] stringArray1 = new String[3];
      stringArray1[1] = "";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      String[] stringArray2 = new String[1];
      stringArray0[1] = stringArray2;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        BProcessor.toBinary(element0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("it.yup.xml.BProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      String[][] stringArray0 = new String[6][5];
      String[] stringArray1 = new String[8];
      stringArray1[1] = "";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray1;
      stringArray0[2] = stringArray0[1];
      stringArray0[3] = stringArray1;
      stringArray0[4] = stringArray1;
      stringArray0[5] = stringArray0[0];
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
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      String[][] stringArray0 = new String[6][1];
      String[] stringArray1 = new String[4];
      stringArray1[0] = "e~l=PgA#I\"R(4K9!;!H";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("e~l=PgA#I\"R(4K9!;!H", "", objectArray0, stringArray0);
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
      Object[] objectArray0 = new Object[9];
      String[][] stringArray0 = new String[6][1];
      String[] stringArray1 = new String[4];
      stringArray1[0] = "e";
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
      Object[] objectArray0 = new Object[9];
      String[][] stringArray0 = new String[6][1];
      String[] stringArray1 = new String[4];
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
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      objectArray0[4] = (Object) "";
      String[][] stringArray0 = new String[0][2];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Element element1 = new Element("", "");
      element1.setAttribute("", "");
      element0.addElement(element1);
      BProcessor.toBinary(element0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      objectArray0[4] = (Object) "";
      String[][] stringArray0 = new String[0][2];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Element element1 = new Element("j", "");
      element0.addElement(element1);
      BProcessor.toBinary(element0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)1;
      Element element0 = BProcessor.parse(byteArray0);
      BProcessor.toBinary(element0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      String[][] stringArray0 = new String[1][9];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      element0.nattributes = 128;
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
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)1;
      byteArray0[4] = (byte)1;
      byteArray0[6] = (byte) (-1);
      BProcessor.parse(byteArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)1;
      byteArray0[4] = (byte)1;
      BProcessor.parse(byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)2;
      byteArray0[6] = (byte) (-1);
      BProcessor.parse(byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-1);
      // Undeclared exception!
      BProcessor.parse(byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-1);
      byteArray0[3] = (byte) (-65);
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-1);
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)98;
      byteArray0[3] = (byte) (-1);
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Element element0 = BProcessor.parse(byteArray0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
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
  public void test24()  throws Throwable  {
      BProcessor bProcessor0 = new BProcessor();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) bProcessor0;
      String[][] stringArray0 = new String[6][5];
      String[] stringArray1 = new String[8];
      stringArray1[1] = "";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray0[0];
      stringArray0[2] = stringArray0[0];
      stringArray0[3] = stringArray0[0];
      stringArray0[4] = stringArray0[0];
      stringArray0[5] = stringArray0[2];
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
