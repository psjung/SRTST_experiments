/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:45:51 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LockMode_ESTest1 extends LockMode_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      LockMode lockMode0 = LockMode.DIRTY_READ;
      String string0 = lockMode0.toString();
      assertEquals("LockMode.READ_UNCOMMITTED", string0);
  }
}
