/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 18:15:34 KST 2018
 */

package it.yup.util;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class StderrConsumer_ESTest5 extends StderrConsumer_ESTest_scaffolding5 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StderrConsumer stderrConsumer0 = new StderrConsumer();
      stderrConsumer0.gotMessage("", 0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StderrConsumer stderrConsumer0 = new StderrConsumer();
      stderrConsumer0.setExiting();
  }
}
