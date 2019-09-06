/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:27:32 KST 2018
 */

package it.yup.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.xml.Element;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Element_ESTest3 extends Element_ESTest_scaffolding3 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      String[][] stringArray0 = new String[1][4];
      String[] stringArray1 = new String[8];
      stringArray1[2] = " ";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.toXml();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "'";
      String[][] stringArray0 = new String[3][3];
      String[] stringArray1 = new String[5];
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray1;
      stringArray0[2] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.toXml();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      String[][] stringArray0 = new String[1][5];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      element0.nchildren = (-1);
      Element[] elementArray0 = element0.getChildren();
      assertEquals(0, elementArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      String[][] stringArray0 = new String[5][5];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      element0.addText("");
      assertEquals(0, element0.maxWait);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      String[][] stringArray0 = new String[2][4];
      String[] stringArray1 = new String[0];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      element0.children = (Object[]) stringArray1;
      // Undeclared exception!
      try { 
        element0.addText("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Element element0 = new Element("", "");
      element0.delAttribute("");
      element0.delAttribute("");
      assertEquals(0L, element0.queueTime);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "";
      Element element0 = new Element("", "");
      int int0 = (-242);
      element0.nattributes = int0;
      String string1 = element0.getAttribute(string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      String[][] stringArray0 = new String[9][5];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      element0.ensureCapacity(0, (byte)100);
      assertEquals(0L, element0.queueTime);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      String[][] stringArray0 = new String[9][5];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      element0.ensureCapacity(0, (byte)98);
      assertEquals(0, element0.maxWait);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Element element0 = new Element("", "");
      Element element1 = element0.addElement("", "");
      element0.clone();
      assertNotSame(element0, element1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      String[][] stringArray0 = new String[2][4];
      String[] stringArray1 = new String[9];
      stringArray1[1] = "!hjgYJC";
      stringArray1[2] = "h";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      String string0 = element0.getAttribute("!hjgYJC");
      assertEquals("h", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      String[][] stringArray0 = new String[8][2];
      String[] stringArray1 = new String[8];
      stringArray1[1] = "";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      String string0 = element0.getAttribute("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      String[][] stringArray0 = new String[1][8];
      String[] stringArray1 = new String[9];
      stringArray1[1] = "";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.setAttributes(stringArray1, stringArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[][] stringArray0 = new String[5][5];
      String[] stringArray1 = new String[0];
      Element element0 = new Element((String) null, (String) null, stringArray1, stringArray0);
      // Undeclared exception!
      try { 
        element0.setAttribute((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      String[][] stringArray0 = new String[5][6];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.getChildrenByName("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      objectArray0[4] = (Object) "";
      objectArray0[5] = (Object) "";
      objectArray0[6] = (Object) "";
      objectArray0[7] = (Object) "";
      String[][] stringArray0 = new String[3][7];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      element0.nchildren = 9;
      // Undeclared exception!
      try { 
        element0.getChildByName("", "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      String[][] stringArray0 = new String[2][4];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.getAttribute("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      String[][] stringArray0 = new String[9][6];
      String[] stringArray1 = new String[5];
      stringArray1[1] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray0[0];
      stringArray0[2] = stringArray0[0];
      stringArray0[3] = stringArray0[2];
      stringArray0[4] = stringArray0[1];
      stringArray0[5] = stringArray0[2];
      String[] stringArray2 = new String[0];
      stringArray0[6] = stringArray2;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.getAttribute("'");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      String[][] stringArray0 = new String[9][3];
      String[] stringArray1 = new String[5];
      stringArray1[1] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray0[0];
      String[] stringArray2 = new String[0];
      stringArray0[2] = stringArray2;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.delAttribute((String) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      String[][] stringArray0 = new String[7][2];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.clone();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[][] stringArray0 = new String[0][7];
      Element element0 = null;
      try {
        element0 = new Element("", "", (Object[]) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      String[][] stringArray0 = new String[8][3];
      Element element0 = new Element((String) null, (String) null, objectArray0, stringArray0);
      Element element1 = null;
      try {
        element1 = new Element(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      String[][] stringArray0 = new String[7][7];
      String[] stringArray1 = new String[0];
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", (String) null, objectArray0, stringArray0);
      Element element1 = null;
      try {
        element1 = new Element(element0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      objectArray0[0] = object0;
      String[][] stringArray0 = new String[6][3];
      String[] stringArray1 = new String[3];
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray0[0];
      stringArray0[2] = stringArray0[0];
      stringArray0[3] = stringArray1;
      stringArray0[4] = stringArray0[3];
      stringArray0[5] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.toXml();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) "";
      Object object0 = new Object();
      objectArray0[1] = object0;
      String[][] stringArray0 = new String[5][7];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.resetText();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Element element0 = new Element("", "");
      element0.resetText();
      assertEquals(0, element0.maxWait);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Element element0 = new Element("", "");
      String string0 = element0.getText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Element element0 = new Element("", "");
      element0.removeChild(element0);
      assertEquals(0, element0.maxWait);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      String[][] stringArray0 = new String[2][6];
      String[] stringArray1 = new String[5];
      stringArray1[1] = "&lt;";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      element0.setAttribute("&lt;", "");
      assertEquals(0, element0.maxWait);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      String[][] stringArray0 = new String[1][9];
      String[] stringArray1 = new String[2];
      stringArray1[1] = "I";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Element element1 = element0.addElement("", "");
      element0.getAttribute(element1.name);
      assertNotSame(element1, element0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      objectArray0[0] = object0;
      String[][] stringArray0 = new String[1][8];
      Element element0 = new Element("", (String) null, objectArray0, stringArray0);
      Element element1 = null;
      try {
        element1 = new Element(element0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      String[][] stringArray0 = new String[3][3];
      String[] stringArray1 = new String[5];
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray0[0];
      stringArray0[2] = stringArray0[1];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      byte[] byteArray0 = element0.toXml();
      assertEquals(38, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Element element0 = new Element("", "");
      byte[] byteArray0 = element0.toXml();
      assertEquals(14, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      String[][] stringArray0 = new String[3][3];
      String[] stringArray1 = new String[5];
      stringArray1[0] = "6";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray0[0];
      stringArray0[2] = stringArray0[1];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.toXml();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      String[][] stringArray0 = new String[3][7];
      String[] stringArray1 = new String[4];
      stringArray1[0] = "";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.toXml();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      String[][] stringArray0 = new String[6][3];
      String[] stringArray1 = new String[3];
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.toXml();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      String[][] stringArray0 = new String[3][3];
      String[] stringArray1 = new String[5];
      stringArray1[2] = ">";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.toXml();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      String[][] stringArray0 = new String[5][2];
      String[] stringArray1 = new String[4];
      stringArray1[2] = "<";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.toXml();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      String[][] stringArray0 = new String[3][3];
      String[] stringArray1 = new String[5];
      stringArray1[2] = "'";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.toXml();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      String[][] stringArray0 = new String[3][7];
      String[] stringArray1 = new String[4];
      stringArray1[2] = "&";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.toXml();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      String[][] stringArray0 = new String[6][3];
      String[] stringArray1 = new String[3];
      stringArray1[2] = "\"";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.toXml();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "";
      Object object0 = new Object();
      objectArray0[1] = object0;
      objectArray0[2] = (Object) "";
      objectArray0[3] = objectArray0[1];
      objectArray0[4] = (Object) "";
      objectArray0[5] = (Object) "";
      objectArray0[6] = (Object) "";
      objectArray0[7] = (Object) "";
      objectArray0[8] = (Object) "";
      String[][] stringArray0 = new String[0][5];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.getChildren();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "";
      Object object0 = new Object();
      objectArray0[1] = object0;
      String[][] stringArray0 = new String[0][5];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.getChildren();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "";
      String[][] stringArray0 = new String[0][1];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Element[] elementArray0 = element0.getChildren();
      assertEquals(0, elementArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      String[][] stringArray0 = new String[5][6];
      String[] stringArray1 = new String[9];
      stringArray1[0] = "from";
      stringArray1[2] = "";
      Element element0 = new Element("", "", objectArray0, stringArray0);
      element0.addElement("", "from");
      Element[] elementArray0 = element0.getChildrenByName(stringArray1[2], stringArray1[0]);
      assertEquals(1, elementArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      String[][] stringArray0 = new String[5][6];
      String[] stringArray1 = new String[9];
      stringArray1[0] = "from";
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Element element1 = element0.addElement("", "from");
      Element[] elementArray0 = element0.getChildrenByName(stringArray1[2], stringArray1[0]);
      assertEquals(1, elementArray0.length);
      assertNotSame(element0, element1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      String[][] stringArray0 = new String[5][6];
      String[] stringArray1 = new String[9];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      element0.addElement("", "");
      Element[] elementArray0 = element0.getChildrenByName(stringArray1[2], stringArray1[0]);
      assertEquals(0, elementArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      Object object0 = new Object();
      objectArray0[2] = object0;
      String[][] stringArray0 = new String[8][2];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.getChildByName("", "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      objectArray0[4] = (Object) "";
      objectArray0[5] = (Object) "";
      objectArray0[6] = (Object) "";
      objectArray0[7] = (Object) "";
      String[][] stringArray0 = new String[3][7];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Element element1 = element0.getChildByName("", "");
      assertNull(element1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      String[][] stringArray0 = new String[3][7];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.getChildByName("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      objectArray0[4] = (Object) "";
      objectArray0[5] = (Object) "";
      Object object0 = new Object();
      objectArray0[6] = object0;
      String[][] stringArray0 = new String[1][6];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.removeChild("", "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) "";
      String[][] stringArray0 = new String[8][1];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.removeChild("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = "&gt;";
      Element element0 = new Element("", "");
      Element element1 = element0.removeChild(string0, string0);
      assertNull(element1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      String[][] stringArray0 = new String[0][3];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      element0.addElement(element0);
      assertEquals(0L, element0.queueTime);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = Element.createUniqueId();
      assertEquals("1", string0);
      
      Element element0 = new Element("", "");
      Element element1 = element0.addElementAndContent(string0, string0, string0);
      assertNotSame(element0, element1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      String[][] stringArray0 = new String[1][8];
      String[] stringArray1 = new String[7];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Element element1 = element0.addElementAndContent(stringArray1[6], "", stringArray1[6]);
      assertNotSame(element1, element0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      String[][] stringArray0 = new String[1][9];
      String[] stringArray1 = new String[2];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Element element1 = element0.addElement(stringArray1[0], "");
      assertNotSame(element1, element0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      String[][] stringArray0 = new String[1][8];
      String[] stringArray1 = new String[7];
      stringArray1[1] = "";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      element0.delAttribute("");
      assertEquals(0, element0.maxWait);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      String[][] stringArray0 = new String[1][8];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.delAttribute((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Element element0 = new Element("", "");
      byte byte0 = (byte)0;
      element0.ensureCapacity(element0.maxWait, byte0);
      assertEquals(0, element0.maxWait);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      Object object0 = new Object();
      objectArray0[0] = object0;
      String[][] stringArray0 = new String[1][2];
      String[] stringArray1 = new String[6];
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        element0.clone();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "";
      String[][] stringArray0 = new String[1][8];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Element element1 = new Element(element0);
      assertFalse(element1.equals((Object)element0));
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      String[][] stringArray0 = new String[1][9];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Element element1 = element0.addElement("", "");
      element0.getText();
      assertNotSame(element0, element1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      String[][] stringArray0 = new String[1][9];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      element0.removeAllElements();
      assertEquals(0, element0.maxWait);
  }
}
