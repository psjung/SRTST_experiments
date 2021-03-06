/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:28:11 KST 2017
 */

package com.sleepycat.je.config;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class EnvironmentParams_ESTest3 extends EnvironmentParams_ESTest_scaffolding3 {

  @Test
  public void test1()  throws Throwable  {
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
  public void test4()  throws Throwable  {
      IntConfigParam intConfigParam0 = EnvironmentParams.CLEANER_MIN_UTILIZATION;
      EnvironmentParams.addSupportedParam(intConfigParam0);
      assertEquals("# The cleaner will keep the total disk space utilization percentage\n# above this value. The default is set to 50 percent.", intConfigParam0.getDescription());
  }

  @Test
  public void test5()  throws Throwable  {
      EnvironmentParams environmentParams0 = new EnvironmentParams();
  }
}
