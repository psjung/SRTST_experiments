/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:25:40 KST 2017
 */

package org.prevayler.foundation;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class StopWatch_ESTest5 extends StopWatch_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      StopWatch stopWatch0 = StopWatch.start();
      assertEquals(0.0, stopWatch0.secondsEllapsed(), 0.01D);
      
      StopWatch.start();
      StopWatch.start();
      stopWatch0.millisEllapsed();
      StopWatch stopWatch1 = StopWatch.start();
      assertEquals(0.0, stopWatch1.secondsEllapsed(), 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      StopWatch stopWatch0 = StopWatch.start();
      double double0 = stopWatch0.secondsEllapsed();
      assertEquals(0.004, double0, 0.01D);
  }
}
