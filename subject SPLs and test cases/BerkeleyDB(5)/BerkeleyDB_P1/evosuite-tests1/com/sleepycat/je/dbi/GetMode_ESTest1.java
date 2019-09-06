/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:29:04 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class GetMode_ESTest1 extends GetMode_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      GetMode getMode0 = GetMode.PREV_NODUP;
      boolean boolean0 = getMode0.isForward();
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      GetMode getMode0 = GetMode.PREV_NODUP;
      String string0 = getMode0.toString();
      assertEquals("PREV_NODUP", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      GetMode getMode0 = GetMode.NEXT;
      boolean boolean0 = getMode0.isForward();
      assertTrue(boolean0);
  }
}
