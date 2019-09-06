/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:49:24 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LogBufferPool_ESTest5 extends LogBufferPool_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      LogBufferPool logBufferPool0 = null;
      try {
        logBufferPool0 = new LogBufferPool((FileManager) null, (EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogBufferPool", e);
      }
  }
}
