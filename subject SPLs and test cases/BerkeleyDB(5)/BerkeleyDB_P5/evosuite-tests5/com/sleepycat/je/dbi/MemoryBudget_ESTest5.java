/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 08:49:32 KST 2017
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
  public void test1()  throws Throwable  {
      MemoryBudget.byteArraySize(0);
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
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
  public void test2()  throws Throwable  {
      int int0 = MemoryBudget.byteArraySize(101);
      assertEquals(128, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = MemoryBudget.byteArraySize(78);
      assertEquals(104, int0);
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = MemoryBudget.KEY_OVERHEAD;
      MemoryBudget.TXN_OVERHEAD = 24;
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setCacheSize(24);
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // je.maxMemory is 24 which is less than the minimum: 98304
         //
         assertThrownBy("com.sleepycat.je.dbi.MemoryBudget$MemoryBudget_reset", e);
      }
  }

  
}