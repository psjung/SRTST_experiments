/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:09:50 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class PrevaylerScalabilitySubject_ESTest1 extends PrevaylerScalabilitySubject_ESTest_scaffolding1 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void clearEvoSuiteFramework() {
String a = "aa";
}

  @Test
  public void test0()  throws Throwable  {
      PrevaylerTransactionSubject prevaylerTransactionSubject0 = null;
      try {
        prevaylerTransactionSubject0 = new PrevaylerTransactionSubject("=**-83BYt q@", "");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
         //
         // 
         //
         assertThrownBy("java.lang.Class", e);
      }
  }
}
