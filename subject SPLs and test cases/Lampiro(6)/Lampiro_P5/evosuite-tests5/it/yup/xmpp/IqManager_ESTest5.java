/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 19:02:59 KST 2018
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
import it.yup.xmpp.packets.Iq;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class IqManager_ESTest5 extends IqManager_ESTest_scaffolding5 {
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
      IqManager iqManager0 = IqManager.getInstance();
      Iq iq0 = new Iq(",BaA E`;^^", "PHOTO");
      iq0.maxWait = iq0.maxWait;
      Element element0 = iq0.addElement(",BaA E`;^^", "M3#;509W59");
      element0.getText();
      element0.setAttribute("id", "");
      Element element1 = new Element(element0);
      iqManager0.handleResult(element0);
      Iq iq1 = new Iq(":9Cj\"'_K", ",BaA E`;^^");
      IqManager iqManager1 = IqManager.getInstance();
      // Undeclared exception!
      try { 
        iqManager0.addRegistration(iq1, iqManager1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Object[] objectArray0 = new Object[2];
      String[][] stringArray0 = new String[9][7];
      String[] stringArray1 = new String[6];
      stringArray1[1] = "";
      stringArray0[0] = stringArray1;
      String[] stringArray2 = new String[0];
      stringArray0[1] = stringArray2;
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
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Object[] objectArray0 = new Object[9];
      String[][] stringArray0 = new String[9][6];
      String[] stringArray1 = new String[1];
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
  public void test05()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Iq iq0 = new Iq("", "");
      Element element0 = iq0.addElement("", "");
      element0.setAttribute("id", "i");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "E";
      stringArray0[3] = "";
      stringArray0[4] = "id";
      stringArray0[5] = "";
      stringArray0[6] = "q";
      iq0.setAttributes(stringArray0, stringArray0);
      iqManager0.addRegistration(iq0, iqManager0);
      iqManager0.handleError(element0);
      //  // Unstable assertion: assertEquals(1530439369317L, iqManager0.registerTime);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Iq iq0 = new Iq("", "set");
      iqManager0.addRegistration(iq0, iqManager0);
      iqManager0.handleResult(iq0);
      //  // Unstable assertion: assertEquals(1530439369281L, iqManager0.registerTime);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      //  // Unstable assertion: assertEquals((-1L), iqManager0.registerTime);
      
      Iq iq0 = new Iq("", "set");
      iqManager0.addRegistration(iq0, iqManager0);
      iqManager0.handleError(iq0);
      //  // Unstable assertion: assertEquals(1530439369221L, iqManager0.registerTime);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Iq iq0 = new Iq("", "");
      // Undeclared exception!
      try { 
        iqManager0.handleResult(iq0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }
}
