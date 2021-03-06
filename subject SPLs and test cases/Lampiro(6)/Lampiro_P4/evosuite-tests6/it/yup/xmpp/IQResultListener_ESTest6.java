/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 16:03:26 KST 2018
 */

package it.yup.xmpp;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xml.Element;
import it.yup.xmpp.packets.Message;
import it.yup.xmpp.packets.Presence;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class IQResultListener_ESTest6 extends IQResultListener_ESTest_scaffolding6 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Contact contact0 = new Contact("", "", "", (String[]) null);
      Element element0 = new Element("", "");
      Message message0 = new Message(element0);
      contact0.handleError(message0);
      assertEquals((-1L), contact0.registerTime);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      // Undeclared exception!
      try { 
        iqManager0.packetReceived((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.IQResultListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Object[] objectArray0 = new Object[2];
      String[][] stringArray0 = new String[4][6];
      String[] stringArray1 = new String[8];
      stringArray1[1] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray1;
      stringArray0[2] = stringArray0[1];
      stringArray0[3] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        iqManager0.packetReceived(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      String[][] stringArray1 = new String[9][4];
      stringArray1[0] = stringArray0;
      contact0.cmdlist = stringArray1;
      Element element0 = new Element("", "", contact0.cmdlist, contact0.cmdlist);
      // Undeclared exception!
      try { 
        contact0.packetReceived(element0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      Presence presence0 = new Presence("", "", "", "", 0);
      // Undeclared exception!
      try { 
        contact0.handleResult(presence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Message message0 = new Message("", "");
      // Undeclared exception!
      try { 
        iqManager0.handleResult(message0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      MUC mUC0 = new MUC("", "");
      Element element0 = mUC0.store();
      Presence presence0 = new Presence(element0);
      // Undeclared exception!
      try { 
        iqManager0.handleError(presence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MUC mUC0 = new MUC("", "");
      Message message0 = new Message("", "");
      mUC0.packetReceived(message0);
      assertEquals((-1L), mUC0.registerTime);
  }
}
