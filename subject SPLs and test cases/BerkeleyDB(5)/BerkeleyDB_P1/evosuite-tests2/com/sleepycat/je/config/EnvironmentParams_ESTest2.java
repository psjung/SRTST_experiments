/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:45:24 KST 2017
 */

package com.sleepycat.je.config;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class EnvironmentParams_ESTest2 extends EnvironmentParams_ESTest_scaffolding2 {

  @Test
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnvironmentParams.addSupportedParam((ConfigParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.EnvironmentParams", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      EnvironmentParams environmentParams0 = new EnvironmentParams();
  }
}