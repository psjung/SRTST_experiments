/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:43:46 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class PreloadConfig_ESTest5 extends PreloadConfig_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      PreloadConfig preloadConfig0 = new PreloadConfig();
      preloadConfig0.setMaxMillisecs(1L);
      long long0 = preloadConfig0.getMaxMillisecs();
      assertEquals(1L, long0);
  }

  @Test
  public void test2()  throws Throwable  {
      PreloadConfig preloadConfig0 = new PreloadConfig();
      preloadConfig0.setLoadLNs(true);
      boolean boolean0 = preloadConfig0.getLoadLNs();
      assertTrue(boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      PreloadConfig preloadConfig0 = new PreloadConfig();
      long long0 = preloadConfig0.getMaxBytes();
      assertEquals(0L, long0);
  }

  @Test
  public void test4()  throws Throwable  {
      PreloadConfig preloadConfig0 = new PreloadConfig();
      long long0 = preloadConfig0.getMaxMillisecs();
      assertEquals(0L, long0);
  }

  @Test
  public void test5()  throws Throwable  {
      PreloadConfig preloadConfig0 = new PreloadConfig();
      preloadConfig0.setMaxMillisecs((-6175L));
      long long0 = preloadConfig0.getMaxMillisecs();
      assertEquals((-6175L), long0);
  }

  @Test
  public void test6()  throws Throwable  {
      PreloadConfig preloadConfig0 = new PreloadConfig();
      // Undeclared exception!
      try { 
        preloadConfig0.cloneConfig();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.PreloadConfig cannot be cast to com.sleepycat.je.DatabaseConfig
         //
         assertThrownBy("com.sleepycat.je.PreloadConfig", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      PreloadConfig preloadConfig0 = new PreloadConfig();
      preloadConfig0.setMaxBytes((-6175L));
      long long0 = preloadConfig0.getMaxBytes();
      assertEquals((-6175L), long0);
  }

  @Test
  public void test8()  throws Throwable  {
      PreloadConfig preloadConfig0 = new PreloadConfig();
      boolean boolean0 = preloadConfig0.getLoadLNs();
      assertFalse(boolean0);
  }
}
