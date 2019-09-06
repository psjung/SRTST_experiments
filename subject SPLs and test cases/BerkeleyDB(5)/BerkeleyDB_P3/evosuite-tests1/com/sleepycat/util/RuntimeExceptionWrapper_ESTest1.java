/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:42:25 KST 2017
 */

package com.sleepycat.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.util.RuntimeExceptionWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class RuntimeExceptionWrapper_ESTest1 extends RuntimeExceptionWrapper_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      RuntimeExceptionWrapper runtimeExceptionWrapper0 = null;
      try {
        runtimeExceptionWrapper0 = new RuntimeExceptionWrapper((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.RuntimeExceptionWrapper", e);
      }
  }
}
