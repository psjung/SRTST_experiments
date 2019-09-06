/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 16:11:58 KST 2018
 */

package it.yup.xmpp.packets;

import static org.evosuite.runtime.EvoAssertions.verifyException;
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
public class DataForm_ESTest6 extends DataForm_ESTest_scaffolding6 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Element element0 = new Element("", "");
      DataForm dataForm0 = new DataForm(element0);
      dataForm0.instructions = "";
      Element element1 = dataForm0.getResultElement();
      assertEquals(0, element1.maxWait);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Element element0 = new Element("", (String) null);
      DataForm dataForm0 = new DataForm(element0);
      dataForm0.fields = null;
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
  public void test2()  throws Throwable  {
      Element element0 = new Element("", "");
      DataForm dataForm0 = new DataForm(element0);
      Vector<String> vector0 = new Vector<String>();
      dataForm0.fields = vector0;
      vector0.add("");
      // Undeclared exception!
      try { 
        dataForm0.getResultElement();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to it.yup.xmpp.packets.DataForm$Field
         //
         verifyException("it.yup.xmpp.packets.DataForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
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
  public void test4()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      String[][] stringArray0 = new String[7][4];
      String[] stringArray1 = new String[9];
      stringArray1[1] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray1;
      stringArray0[2] = stringArray0[1];
      stringArray0[3] = stringArray1;
      stringArray0[4] = stringArray0[2];
      stringArray0[5] = stringArray0[4];
      String[] stringArray2 = new String[0];
      stringArray0[6] = stringArray2;
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
  public void test5()  throws Throwable  {
      Element element0 = new Element("", "option");
      DataForm dataForm0 = new DataForm(element0);
      element0.addElement(element0);
      DataForm.Field dataForm_Field0 = dataForm0.new Field(element0);
      assertFalse(dataForm_Field0.required);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Element element0 = new Element("", "");
      element0.addElement("", "");
      DataForm dataForm0 = new DataForm(element0);
      DataForm.Field dataForm_Field0 = dataForm0.new Field(element0);
      assertFalse(dataForm_Field0.required);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Element element0 = new Element("", "");
      DataForm dataForm0 = new DataForm(element0);
      Vector<DataForm.Field> vector0 = new Vector<DataForm.Field>();
      dataForm0.fields = vector0;
      DataForm.Field dataForm_Field0 = dataForm0.new Field(element0);
      dataForm_Field0.type = "";
      vector0.add(dataForm_Field0);
      Element element1 = dataForm0.getResultElement();
      assertFalse(element1.equals((Object)element0));
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Element element0 = new Element("", "");
      DataForm dataForm0 = new DataForm(element0);
      Vector<DataForm.Field> vector0 = new Vector<DataForm.Field>();
      dataForm0.fields = vector0;
      DataForm.Field dataForm_Field0 = dataForm0.new Field(element0);
      vector0.add(dataForm_Field0);
      Element element1 = dataForm0.getResultElement();
      assertEquals(0, element1.maxWait);
  }
}