/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:26:04 KST 2017
 */

package com.sleepycat.je.dbi;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.dbi.GetMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class GetMode_ESTest2 extends GetMode_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      GetMode getMode0 = GetMode.NEXT_DUP;
      boolean boolean0 = getMode0.isForward();
      assertTrue(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      GetMode getMode0 = GetMode.NEXT_DUP;
      String string0 = getMode0.toString();
      assertEquals("NEXT_DUP", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      GetMode getMode0 = GetMode.PREV_NODUP;
      boolean boolean0 = getMode0.isForward();
      assertFalse(boolean0);
  }
}
