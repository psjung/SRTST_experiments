/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:47:21 KST 2018
 */

package it.yup.xmlstream;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class PacketListener_ESTest3 extends PacketListener_ESTest_scaffolding3 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AccountRegistration accountRegistration0 = new AccountRegistration();
      it.yup.xml.Element element0 = new it.yup.xml.Element((String) null, (String) null);
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
  public void test1()  throws Throwable  {
      AccountRegistration accountRegistration0 = new AccountRegistration();
      Object[] objectArray0 = new Object[7];
      String[][] stringArray0 = new String[9][8];
      String[] stringArray1 = new String[9];
      stringArray1[1] = "";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray0[0];
      stringArray0[2] = stringArray0[0];
      String[] stringArray2 = new String[0];
      stringArray0[3] = stringArray2;
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
}
