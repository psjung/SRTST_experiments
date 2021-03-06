/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 15:05:31 KST 2018
 */

package it.yup.xmpp;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xml.Element;
import it.yup.xmpp.packets.Message;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class IQResultListener_ESTest3 extends IQResultListener_ESTest_scaffolding3 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      Element element0 = new Element("", "");
      contact0.handleError(element0);
      assertEquals((-1L), contact0.registerTime);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MUC mUC0 = new MUC("", "");
      Message message0 = new Message((String) null, (String) null);
      mUC0.packetReceived(message0);
      assertEquals((-1L), mUC0.registerTime);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      String[] stringArray0 = new String[1];
      String[][] stringArray1 = new String[4][1];
      Element element0 = new Element("", "", stringArray0, stringArray1);
      // Undeclared exception!
      try { 
        iqManager0.packetReceived(element0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MUC mUC0 = new MUC("", "");
      Element element0 = mUC0.store();
      Message message0 = new Message(element0);
      // Undeclared exception!
      try { 
        mUC0.handleResult(message0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
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
  public void test5()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Object[] objectArray0 = new Object[0];
      String[][] stringArray0 = new String[2][4];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        iqManager0.handleError(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Element element0 = new Element("", (String) null);
      // Undeclared exception!
      try { 
        iqManager0.handleError(element0);
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
      IqManager iqManager0 = IqManager.getInstance();
      Object[] objectArray0 = new Object[0];
      String[][] stringArray0 = new String[2][4];
      String[] stringArray1 = new String[0];
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        iqManager0.handleError(element0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Message message0 = new Message("", "");
      // Undeclared exception!
      try { 
        iqManager0.packetReceived(message0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      MUC mUC0 = new MUC("", "");
      Message message0 = new Message("", "result");
      // Undeclared exception!
      try { 
        mUC0.packetReceived(message0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }
}
