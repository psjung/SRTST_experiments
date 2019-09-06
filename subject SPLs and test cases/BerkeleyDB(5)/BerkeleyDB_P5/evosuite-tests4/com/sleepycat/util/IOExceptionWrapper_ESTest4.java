/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 17:08:32 KST 2017
 */

package com.sleepycat.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class IOExceptionWrapper_ESTest4 extends IOExceptionWrapper_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      IOExceptionWrapper iOExceptionWrapper0 = null;
      try {
        iOExceptionWrapper0 = new IOExceptionWrapper((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.IOExceptionWrapper", e);
      }
  }
}
