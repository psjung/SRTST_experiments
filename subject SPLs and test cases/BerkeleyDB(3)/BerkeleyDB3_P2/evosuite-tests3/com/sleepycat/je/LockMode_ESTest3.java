/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:53:52 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LockMode_ESTest3 extends LockMode_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      LockMode lockMode0 = LockMode.READ_UNCOMMITTED;
      String string0 = lockMode0.toString();
      assertEquals("LockMode.READ_UNCOMMITTED", string0);
  }
}
