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

  
}
