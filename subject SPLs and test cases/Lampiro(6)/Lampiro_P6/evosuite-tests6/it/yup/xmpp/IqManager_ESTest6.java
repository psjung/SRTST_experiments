/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 16:02:31 KST 2018
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class IqManager_ESTest6 extends IqManager_ESTest_scaffolding6 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
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
  public void test1()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Object[] objectArray0 = new Object[8];
      String[][] stringArray0 = new String[8][6];
      String[] stringArray1 = new String[1];
      stringArray0[0] = stringArray1;
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
  public void test2()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      // Undeclared exception!
      try { 
        iqManager0.handleError((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.IqManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      String string0 = "6M5xAm*\\udRmgd8(bqz";
      Iq iq0 = new Iq(string0, string0);
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
  public void test4()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Object[] objectArray0 = new Object[2];
      String[][] stringArray0 = new String[8][1];
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
  public void test5()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Iq iq0 = new Iq("", "");
      MUC mUC0 = new MUC("", "");
      // Undeclared exception!
      try { 
        iqManager0.addRegistration(iq0, mUC0);
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
      iqManager0.streamInitialized();
      assertEquals((-1L), iqManager0.registerTime);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Object[] objectArray0 = new Object[8];
      String[][] stringArray0 = new String[8][6];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        iqManager0.handleResult(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }
}
