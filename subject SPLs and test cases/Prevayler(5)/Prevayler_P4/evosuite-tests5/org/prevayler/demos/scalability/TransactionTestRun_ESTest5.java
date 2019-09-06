/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:00:47 KST 2017
 */

package org.prevayler.demos.scalability;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TransactionTestRun_ESTest5 extends TransactionTestRun_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      TransactionTestRun transactionTestRun0 = null;
      try {
        transactionTestRun0 = new TransactionTestRun((ScalabilityTestSubject) null, 332, (-1293), 455);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The minimum number of threads cannot be smaller than one.
         //
         assertThrownBy("org.prevayler.demos.scalability.ScalabilityTestRun", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TransactionTestRun transactionTestRun0 = null;
      try {
        transactionTestRun0 = new TransactionTestRun((ScalabilityTestSubject) null, 1618, 1618, 2794);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.ScalabilityTestRun", e);
      }
  }
}