/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:35:10 KST 2018
 */

package it.yup.xmlstream;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.xmlstream.AccountRegistration;
import it.yup.xmlstream.BasicXmlStream;
import it.yup.xmlstream.TLSInitializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class AccountRegistration_ESTest3 extends AccountRegistration_ESTest_scaffolding3 {
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
      AccountRegistration accountRegistration0 = new AccountRegistration();
      TLSInitializer tLSInitializer0 = new TLSInitializer();
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      objectArray0[4] = (Object) "";
      objectArray0[5] = (Object) "";
      objectArray0[6] = (Object) "";
      objectArray0[7] = (Object) tLSInitializer0;
      String[][] stringArray0 = new String[8][4];
      String[] stringArray1 = new String[5];
      stringArray1[1] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray1;
      stringArray0[2] = stringArray1;
      String[] stringArray2 = new String[7];
      stringArray2[1] = "type";
      stringArray2[2] = "";
      stringArray0[3] = stringArray2;
      it.yup.xml.Element element0 = new it.yup.xml.Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        accountRegistration0.packetReceived(element0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // it.yup.xmlstream.TLSInitializer cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AccountRegistration accountRegistration0 = new AccountRegistration();
      Object[] objectArray0 = new Object[2];
      String[][] stringArray0 = new String[7][7];
      String[] stringArray1 = new String[1];
      stringArray0[0] = stringArray1;
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
  public void test2()  throws Throwable  {
      AccountRegistration accountRegistration0 = new AccountRegistration();
      Object[] objectArray0 = new Object[9];
      String[][] stringArray0 = new String[21][4];
      String[] stringArray1 = new String[5];
      stringArray1[1] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray1;
      stringArray0[2] = stringArray1;
      String[] stringArray2 = new String[7];
      stringArray2[1] = "type";
      stringArray2[2] = "";
      stringArray0[3] = stringArray2;
      it.yup.xml.Element element0 = new it.yup.xml.Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        accountRegistration0.packetReceived(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AccountRegistration accountRegistration0 = new AccountRegistration();
      // Undeclared exception!
      try { 
        accountRegistration0.start((BasicXmlStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.AccountRegistration", e);
      }
  }
}
