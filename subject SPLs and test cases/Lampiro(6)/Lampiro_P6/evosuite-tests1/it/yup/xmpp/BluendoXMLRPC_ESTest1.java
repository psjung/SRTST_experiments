/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 02:07:03 KST 2018
 */

package it.yup.xmpp;

import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xml.Element;
import static org.evosuite.runtime.EvoAssertions.*;
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class BluendoXMLRPC_ESTest1 extends BluendoXMLRPC_ESTest_scaffolding1 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BluendoXMLRPC bluendoXMLRPC0 = new BluendoXMLRPC("");
      Element element0 = new Element("", "");
      // Undeclared exception!
      try { 
        bluendoXMLRPC0.write(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.BluendoXMLRPC", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BluendoXMLRPC bluendoXMLRPC0 = new BluendoXMLRPC("");
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      objectArray0[4] = (Object) "";
      objectArray0[5] = (Object) "";
      objectArray0[6] = (Object) bluendoXMLRPC0;
      String[][] stringArray0 = new String[4][5];
      String[] stringArray1 = new String[3];
      stringArray1[1] = "";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray0[0];
      stringArray0[2] = stringArray1;
      stringArray0[3] = stringArray0[0];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        bluendoXMLRPC0.write(element0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // it.yup.xmpp.BluendoXMLRPC cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xml.BProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BluendoXMLRPC bluendoXMLRPC0 = new BluendoXMLRPC("");
      Object[] objectArray0 = new Object[1];
      String[][] stringArray0 = new String[7][6];
      String[] stringArray1 = new String[4];
      stringArray1[1] = "";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      String[] stringArray2 = new String[2];
      stringArray0[1] = stringArray2;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        bluendoXMLRPC0.write(element0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("it.yup.xml.BProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BluendoXMLRPC bluendoXMLRPC0 = new BluendoXMLRPC("");
      // Undeclared exception!
      try { 
        bluendoXMLRPC0.open();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.BluendoXMLRPC", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BluendoXMLRPC bluendoXMLRPC0 = new BluendoXMLRPC("");
      // Undeclared exception!
      try { 
        bluendoXMLRPC0.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.BluendoXMLRPC", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BluendoXMLRPC bluendoXMLRPC0 = new BluendoXMLRPC("");
      // Undeclared exception!
      try { 
        bluendoXMLRPC0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.BluendoXMLRPC", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BluendoXMLRPC bluendoXMLRPC0 = new BluendoXMLRPC((String) null);
      // Undeclared exception!
      try { 
        bluendoXMLRPC0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.BluendoXMLRPC", e);
      }
  }
}
