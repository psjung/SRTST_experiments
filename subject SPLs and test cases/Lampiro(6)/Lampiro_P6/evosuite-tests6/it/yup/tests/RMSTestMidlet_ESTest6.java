/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:11:44 KST 2018
 */

package it.yup.tests;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RMSTestMidlet_ESTest6 extends RMSTestMidlet_ESTest_scaffolding6 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RMSTestMidlet rMSTestMidlet0 = null;
      try {
        rMSTestMidlet0 = new RMSTestMidlet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.tests.RMSTestMidlet", e);
      }
  }
}
