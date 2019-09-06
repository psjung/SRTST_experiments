/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 15:34:53 KST 2018
 */

package it.yup.xmlstream;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class AccountRegistration_ESTest6 extends AccountRegistration_ESTest_scaffolding6 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AccountRegistration accountRegistration0 = new AccountRegistration();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) accountRegistration0;
      String[][] stringArray0 = new String[8][8];
      String[] stringArray1 = new String[7];
      stringArray1[1] = "type";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      it.yup.xml.Element element0 = new it.yup.xml.Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        accountRegistration0.packetReceived(element0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // it.yup.xmlstream.AccountRegistration cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AccountRegistration accountRegistration0 = new AccountRegistration();
      Object[] objectArray0 = new Object[8];
      String[][] stringArray0 = new String[7][0];
      it.yup.xml.Element element0 = new it.yup.xml.Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        accountRegistration0.packetReceived(element0);
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
      AccountRegistration accountRegistration0 = new AccountRegistration();
      Object[] objectArray0 = new Object[3];
      String[][] stringArray0 = new String[9][8];
      String[] stringArray1 = new String[10];
      stringArray1[1] = "type";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      it.yup.xml.Element element0 = new it.yup.xml.Element("", "", objectArray0, stringArray0);
      element0.removeAllElements();
      // Undeclared exception!
      try { 
        accountRegistration0.packetReceived(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.AccountRegistration", e);
      }
  }

  
}
