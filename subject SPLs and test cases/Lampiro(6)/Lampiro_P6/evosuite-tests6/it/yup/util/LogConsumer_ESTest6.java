/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 15:02:58 KST 2018
 */

package it.yup.util;

import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class LogConsumer_ESTest6 extends LogConsumer_ESTest_scaffolding6 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XMPPConsumer xMPPConsumer0 = new XMPPConsumer();
      xMPPConsumer0.setExiting();
      assertFalse(xMPPConsumer0.isInterrupted());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XMPPConsumer xMPPConsumer0 = new XMPPConsumer();
      xMPPConsumer0.gotMessage("", 0);
      //  // Unstable assertion: assertFalse(xMPPConsumer0.isDaemon());
  }
}
