/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:33:50 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class RangeRestartException_ESTest1 extends RangeRestartException_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      RangeRestartException rangeRestartException0 = new RangeRestartException();
      assertNull(rangeRestartException0.getMessage());
  }
}