/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 15:14:02 KST 2018
 */

package it.yup.xmpp.packets;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xml.Element;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class DataForm_ESTest3 extends DataForm_ESTest_scaffolding3 {
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
      DataForm dataForm0 = new DataForm(element0);
      dataForm0.type = "";
      Element element1 = dataForm0.getResultElement();
      assertEquals(0L, element1.queueTime);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      String[][] stringArray0 = new String[1][5];
      String[] stringArray1 = new String[8];
      stringArray1[1] = "type";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", (String) null, objectArray0, stringArray0);
      DataForm dataForm0 = new DataForm(element0);
      DataForm.Field dataForm_Field0 = null;
      try {
        dataForm_Field0 = dataForm0.new Field(element0);
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
      Element element0 = new Element("", "");
      DataForm dataForm0 = new DataForm(element0);
      Vector<String> vector0 = new Vector<String>();
      dataForm0.fields = vector0;
      vector0.add((String) null);
      // Undeclared exception!
      try { 
        dataForm0.getResultElement();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.packets.DataForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DataForm dataForm0 = null;
      try {
        dataForm0 = new DataForm((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.packets.DataForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      String[][] stringArray0 = new String[8][2];
      String[] stringArray1 = new String[1];
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      DataForm dataForm0 = null;
      try {
        dataForm0 = new DataForm(element0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Element element0 = new Element("", "");
      DataForm dataForm0 = new DataForm(element0);
      element0.addElementAndContent((String) null, "", "");
      DataForm.Field dataForm_Field0 = dataForm0.new Field(element0);
      assertFalse(dataForm_Field0.required);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Element element0 = new Element("", "");
      DataForm dataForm0 = new DataForm(element0);
      Vector<Object> vector0 = new Vector<Object>();
      dataForm0.fields = vector0;
      DataForm.Field dataForm_Field0 = dataForm0.new Field(element0);
      dataForm_Field0.type = "text-multi";
      vector0.add((Object) dataForm_Field0);
      Element element1 = dataForm0.getResultElement();
      assertEquals(0L, element1.queueTime);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Element element0 = new Element("", "");
      DataForm dataForm0 = new DataForm(element0);
      Vector<Object> vector0 = new Vector<Object>();
      dataForm0.fields = vector0;
      DataForm.Field dataForm_Field0 = dataForm0.new Field(element0);
      dataForm_Field0.type = "list-multi";
      vector0.add((Object) dataForm_Field0);
      Element element1 = dataForm0.getResultElement();
      assertEquals(0L, element1.queueTime);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Element element0 = new Element("", "");
      DataForm dataForm0 = new DataForm(element0);
      Vector<Object> vector0 = new Vector<Object>();
      dataForm0.fields = vector0;
      DataForm.Field dataForm_Field0 = dataForm0.new Field(element0);
      dataForm_Field0.type = "jid-multi";
      vector0.add((Object) dataForm_Field0);
      Element element1 = dataForm0.getResultElement();
      assertEquals(0L, element1.queueTime);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Element element0 = new Element("", "");
      DataForm dataForm0 = new DataForm(element0);
      Vector<Object> vector0 = new Vector<Object>();
      dataForm0.fields = vector0;
      DataForm.Field dataForm_Field0 = dataForm0.new Field(element0);
      dataForm_Field0.type = "jid-single";
      vector0.add((Object) dataForm_Field0);
      Element element1 = dataForm0.getResultElement();
      assertFalse(element1.equals((Object)element0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Element element0 = new Element("", "");
      DataForm dataForm0 = new DataForm(element0);
      Vector<Object> vector0 = new Vector<Object>();
      dataForm0.fields = vector0;
      DataForm.Field dataForm_Field0 = dataForm0.new Field(element0);
      vector0.add((Object) dataForm_Field0);
      Element element1 = dataForm0.getResultElement();
      assertEquals(0L, element1.queueTime);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Element element0 = new Element("", "");
      DataForm dataForm0 = new DataForm(element0);
      Vector<Integer> vector0 = new Vector<Integer>();
      dataForm0.fields = vector0;
      vector0.add((Integer) element0.maxWait);
      // Undeclared exception!
      try { 
        dataForm0.getResultElement();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to it.yup.xmpp.packets.DataForm$Field
         //
         verifyException("it.yup.xmpp.packets.DataForm", e);
      }
  }
}
