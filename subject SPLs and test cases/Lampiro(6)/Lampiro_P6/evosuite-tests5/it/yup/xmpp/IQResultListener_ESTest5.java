/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 19:04:19 KST 2018
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
import it.yup.xmpp.packets.Iq;
import it.yup.xmpp.packets.Message;
import it.yup.xmpp.packets.Presence;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class IQResultListener_ESTest5 extends IQResultListener_ESTest_scaffolding5 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      Element element0 = new Element("", "");
      Presence presence0 = new Presence(element0);
      Message message0 = new Message(presence0);
      contact0.handleError(message0);
      assertEquals((-1L), contact0.registerTime);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MUC mUC0 = new MUC("", "");
      Element element0 = new Element("", "");
      mUC0.packetReceived(element0);
      assertEquals((-1L), mUC0.registerTime);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Object[] objectArray0 = new Object[6];
      String[][] stringArray0 = new String[9][6];
      String[] stringArray1 = new String[2];
      stringArray1[1] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray1;
      stringArray0[2] = stringArray0[1];
      String[] stringArray2 = new String[1];
      stringArray0[3] = stringArray2;
      Element element0 = new Element("", "", objectArray0, stringArray0);
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
      IqManager iqManager0 = IqManager.getInstance();
      Element element0 = new Element("", "");
      Presence presence0 = new Presence(element0);
      // Undeclared exception!
      try { 
        iqManager0.handleResult(presence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Object[] objectArray0 = new Object[1];
      String[][] stringArray0 = new String[7][8];
      String[] stringArray1 = new String[4];
      stringArray1[1] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray1;
      stringArray0[2] = stringArray1;
      stringArray0[3] = stringArray0[0];
      String[] stringArray2 = new String[1];
      stringArray0[4] = stringArray2;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        iqManager0.handleResult(element0);
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
      IqManager iqManager0 = IqManager.getInstance();
      Iq iq0 = new Iq("", "");
      // Undeclared exception!
      try { 
        iqManager0.handleError(iq0);
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
      MUC mUC0 = new MUC("", "");
      Iq iq0 = new Iq("", "result");
      // Undeclared exception!
      try { 
        mUC0.packetReceived(iq0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      MUC mUC0 = new MUC((String) null, "");
      Element element0 = mUC0.store();
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
}
