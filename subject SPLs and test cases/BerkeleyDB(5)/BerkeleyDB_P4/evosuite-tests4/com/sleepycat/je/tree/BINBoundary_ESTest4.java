/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:46:45 KST 2017
 */

package com.sleepycat.je.tree;

import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class BINBoundary_ESTest4 extends BINBoundary_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      BINBoundary bINBoundary0 = new BINBoundary();
      assertFalse(bINBoundary0.isLastBin);
  }
}
