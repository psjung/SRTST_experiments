/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 08:49:32 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class MemoryBudget_ESTest5 extends MemoryBudget_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setCacheSize((-1L));
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // je.maxMemory is -1 which is less than the minimum: 98304
         //
         assertThrownBy("com.sleepycat.je.dbi.MemoryBudget$MemoryBudget_reset", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      EnvironmentImpl environmentImpl0 = null;
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl1 = null;
      try {
        environmentImpl1 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      int int0 = 1;
      environmentConfig0.setCachePercent(1);
      environmentConfig0.setReadOnly(true);
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  
}