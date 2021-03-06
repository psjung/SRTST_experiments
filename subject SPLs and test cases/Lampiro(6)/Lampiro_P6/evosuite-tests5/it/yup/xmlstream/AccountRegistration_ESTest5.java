/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 18:35:30 KST 2018
 */

package it.yup.xmlstream;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class AccountRegistration_ESTest5 extends AccountRegistration_ESTest_scaffolding5 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AccountRegistration accountRegistration0 = new AccountRegistration();
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) accountRegistration0;
      String[][] stringArray0 = new String[4][9];
      String[] stringArray1 = new String[9];
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
  public void test1()  throws Throwable  {
      AccountRegistration accountRegistration0 = new AccountRegistration();
      Object[] objectArray0 = new Object[6];
      String[][] stringArray0 = new String[7][5];
      String[] stringArray1 = new String[8];
      stringArray1[1] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray1;
      stringArray0[2] = stringArray1;
      stringArray0[3] = stringArray1;
      stringArray0[4] = stringArray0[0];
      String[] stringArray2 = new String[0];
      stringArray0[5] = stringArray2;
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
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "";
      String[][] stringArray0 = new String[3][7];
      String[] stringArray1 = new String[4];
      stringArray1[1] = "type";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      it.yup.xml.Element element0 = new it.yup.xml.Element("", "", objectArray0, stringArray0);
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
