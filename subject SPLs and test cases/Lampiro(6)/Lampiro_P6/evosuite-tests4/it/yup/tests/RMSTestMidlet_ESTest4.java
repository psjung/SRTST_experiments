/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 17:31:21 KST 2018
 */

package it.yup.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.tests.RMSTestMidlet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RMSTestMidlet_ESTest4 extends RMSTestMidlet_ESTest_scaffolding4 {

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
