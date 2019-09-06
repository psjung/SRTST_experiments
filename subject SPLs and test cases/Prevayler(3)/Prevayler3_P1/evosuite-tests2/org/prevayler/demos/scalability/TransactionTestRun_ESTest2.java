/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 19:47:01 KST 2017
 */

package org.prevayler.demos.scalability;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TransactionTestRun_ESTest2 extends TransactionTestRun_ESTest_scaffolding2 {
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
      TransactionTestRun transactionTestRun0 = null;
      try {
        transactionTestRun0 = new TransactionTestRun((ScalabilityTestSubject) null, 94, 94, 1326);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.ScalabilityTestRun", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TransactionTestRun transactionTestRun0 = null;
      try {
        transactionTestRun0 = new TransactionTestRun((ScalabilityTestSubject) null, (-176), 0, (-764));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The minimum number of threads cannot be greater than the maximum number.
         //
         assertThrownBy("org.prevayler.demos.scalability.ScalabilityTestRun", e);
      }
  }
}
