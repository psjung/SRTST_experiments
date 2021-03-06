/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 18:11:46 KST 2018
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
import it.yup.xmpp.packets.Presence;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class IQResultListener_ESTest4 extends IQResultListener_ESTest_scaffolding4 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Contact contact0 = new Contact("", "", "", (String[]) null);
      Presence presence0 = new Presence();
      contact0.handleError(presence0);
      assertEquals((-1L), contact0.registerTime);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Element element0 = new Element("", "");
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
  public void test2()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Object[] objectArray0 = new Object[1];
      String[][] stringArray0 = new String[9][2];
      String[] stringArray1 = new String[1];
      stringArray0[0] = stringArray1;
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
      // Undeclared exception!
      try { 
        iqManager0.handleResult((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.IqManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Element element0 = new Element("", (String) null);
      // Undeclared exception!
      try { 
        iqManager0.handleResult(element0);
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
      Object[] objectArray0 = new Object[4];
      String[][] stringArray0 = new String[4][1];
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
  public void test6()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Presence presence0 = new Presence("", "", "", 0);
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
  public void test8()  throws Throwable  {
      MUC mUC0 = new MUC("", "");
      Iq iq0 = new Iq("", "");
      mUC0.packetReceived(iq0);
      assertEquals((-1L), mUC0.registerTime);
  }
}
