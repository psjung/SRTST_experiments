/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 19:12:47 KST 2018
 */

package it.yup.xmpp.packets;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xml.Element;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Message_ESTest5 extends Message_ESTest_scaffolding5 {
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
      Message message0 = new Message("", "");
      message0.setBody("m");
      String string0 = message0.getBody();
      assertEquals("m", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Message message0 = new Message("", "");
      message0.addElement((Element) null);
      // Undeclared exception!
      try { 
        message0.setBody("");
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
      Message message0 = new Message("", "");
      message0.addElement((Element) null);
      // Undeclared exception!
      try { 
        message0.getErrorText();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Message message0 = new Message("", "");
      message0.setBody((String) null);
      // Undeclared exception!
      try { 
        message0.getBody();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Message message0 = null;
      try {
        message0 = new Message((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      objectArray0[4] = (Object) "";
      Object object0 = new Object();
      objectArray0[5] = object0;
      String[][] stringArray0 = new String[0][3];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Message message0 = null;
      try {
        message0 = new Message(element0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      String[][] stringArray0 = new String[9][6];
      String[] stringArray1 = new String[1];
      stringArray0[5] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Message message0 = null;
      try {
        message0 = new Message(element0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Message message0 = new Message("", "");
      String string0 = message0.getErrorText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Message message0 = new Message("", "");
      message0.addElement((String) null, "error");
      String string0 = message0.getErrorText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Message message0 = new Message("", "");
      String string0 = message0.getBody();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Message message0 = new Message("", "");
      message0.setBody("");
      String string0 = message0.getBody();
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Message message0 = new Message("", "");
      Message message1 = new Message(message0);
      assertFalse(message1.equals((Object)message0));
  }
}