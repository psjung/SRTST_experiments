/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:31:51 KST 2017
 */

package com.sleepycat.je.dbi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.DbConfigManager;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.dbi.MemoryBudget;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class MemoryBudget_ESTest4 extends MemoryBudget_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      int int0 = MemoryBudget.byteArraySize((-2318));
      //  // Unstable assertion: assertEquals(25, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      DbConfigManager dbConfigManager0 = new DbConfigManager((EnvironmentConfig) null);
      MemoryBudget memoryBudget0 = null;
      try {
        memoryBudget0 = new MemoryBudget((EnvironmentImpl) null, dbConfigManager0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.MemoryBudget", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      int int0 = MemoryBudget.byteArraySize(24);
      //  // Unstable assertion: assertEquals(49, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      int int0 = MemoryBudget.byteArraySize(4);
      //  // Unstable assertion: assertEquals(25, int0);
  }

  @Test
  public void test07()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setCacheSize((-4083L));
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // je.maxMemory is -4083 which is less than the minimum: 98304
         //
         assertThrownBy("com.sleepycat.je.dbi.MemoryBudget$MemoryBudget_reset", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setCacheSize(4294967313L);
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // je.maxMemory has a value of 4294967313 but the JVM is only configured for 2859991040. Consider using je.maxMemoryPercent.
         //
         assertThrownBy("com.sleepycat.je.dbi.MemoryBudget$MemoryBudget_reset", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      MemoryBudget.MemoryBudget_sinit memoryBudget_MemoryBudget_sinit0 = new MemoryBudget.MemoryBudget_sinit();
      memoryBudget_MemoryBudget_sinit0.execute();
      memoryBudget_MemoryBudget_sinit0.execute();
  }
}
