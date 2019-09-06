/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 12:35:37 KST 2018
 */

package it.yup.xmpp;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xml.Element;
import it.yup.xmpp.packets.Iq;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class IqManager_ESTest2 extends IqManager_ESTest_scaffolding2 {
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
      Iq iq0 = new Iq((String) null, "Otj~f6");
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) iqManager0;
      Object object0 = new Object();
      objectArray0[1] = object0;
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) iq0;
      objectArray0[4] = (Object) "Otj~f6";
      String[][] stringArray0 = new String[9][4];
      String[] stringArray1 = new String[5];
      stringArray1[0] = null;
      stringArray1[1] = "iq";
      stringArray1[2] = null;
      stringArray1[3] = "Q70'y2FkN";
      stringArray1[4] = "jabber:client";
      stringArray0[0] = stringArray1;
      String[] stringArray2 = new String[9];
      stringArray2[0] = "iq";
      stringArray2[1] = "# `[4ZZ0 _.?;&v";
      stringArray2[2] = "jabber:client";
      stringArray2[3] = "iq";
      stringArray2[4] = "";
      stringArray2[5] = "";
      stringArray2[6] = "Otj~f6";
      stringArray2[7] = "jabber:client";
      stringArray2[8] = "jabber:client";
      stringArray0[1] = stringArray2;
      String[] stringArray3 = new String[4];
      stringArray3[0] = null;
      stringArray3[1] = "id";
      stringArray3[2] = "";
      stringArray3[3] = "";
      stringArray0[2] = stringArray3;
      String[] stringArray4 = new String[6];
      stringArray4[0] = "iq";
      stringArray4[1] = "";
      stringArray4[2] = "Q70'y2FkN";
      stringArray4[3] = null;
      stringArray4[4] = null;
      stringArray4[5] = "Q70'y2FkN";
      stringArray0[3] = stringArray4;
      String[] stringArray5 = new String[3];
      stringArray5[0] = "id";
      stringArray5[1] = "";
      stringArray5[2] = "iq";
      stringArray0[4] = stringArray5;
      String[] stringArray6 = new String[2];
      stringArray6[0] = "id";
      stringArray6[1] = "id";
      stringArray0[5] = stringArray6;
      String[] stringArray7 = new String[6];
      stringArray7[0] = "iq";
      stringArray7[1] = null;
      stringArray7[2] = "jabber:client";
      stringArray7[3] = "id";
      stringArray7[4] = "jabber:client";
      stringArray7[5] = "Q70'y2FkN";
      stringArray0[6] = stringArray7;
      String[] stringArray8 = new String[2];
      stringArray8[0] = "";
      stringArray8[1] = "O7o}zVLk$JPHF^6kT";
      stringArray0[7] = stringArray8;
      String[] stringArray9 = new String[4];
      stringArray9[0] = "id";
      stringArray9[1] = "Otj~f6";
      stringArray9[2] = "";
      stringArray9[3] = "# `[4ZZ0 _.?;&v";
      stringArray0[8] = stringArray9;
      Element element0 = new Element("Q70'y2FkN", "", objectArray0, stringArray0);
      iqManager0.handleResult(element0);
      IqManager iqManager1 = IqManager.getInstance();
      assertSame(iqManager1, iqManager0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Iq iq0 = new Iq("", "set");
      String[] stringArray0 = new String[0];
      Contact contact0 = new Contact("", "", "", stringArray0);
      iqManager0.addRegistration(iq0, contact0);
      //  // Unstable assertion: assertEquals(1530416126860L, contact0.registerTime);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Object[] objectArray0 = new Object[5];
      String[][] stringArray0 = new String[9][4];
      String[] stringArray1 = new String[23];
      stringArray1[1] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray1;
      String[] stringArray2 = new String[4];
      stringArray2[1] = "id";
      stringArray2[2] = "";
      stringArray0[2] = stringArray2;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      iqManager0.handleError(element0);
      assertEquals((-1L), iqManager0.registerTime);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Object[] objectArray0 = new Object[6];
      String[][] stringArray0 = new String[5][1];
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
  public void test05()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      MUC mUC0 = new MUC("", "");
      Element element0 = mUC0.store();
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
  public void test06()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Object[] objectArray0 = new Object[4];
      String[][] stringArray0 = new String[7][3];
      String[] stringArray1 = new String[4];
      stringArray1[1] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray1;
      stringArray0[2] = stringArray1;
      stringArray0[3] = stringArray1;
      stringArray0[4] = stringArray0[3];
      stringArray0[5] = stringArray0[0];
      String[] stringArray2 = new String[0];
      stringArray0[6] = stringArray2;
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
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Iq iq0 = new Iq("", "");
      Contact contact0 = new Contact("", "", "", (String[]) null);
      // Undeclared exception!
      try { 
        iqManager0.addRegistration(iq0, contact0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      iqManager0.streamInitialized();
      assertEquals((-1L), iqManager0.registerTime);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IqManager iqManager0 = IqManager.getInstance();
      Iq iq0 = new Iq((String) null, "");
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
