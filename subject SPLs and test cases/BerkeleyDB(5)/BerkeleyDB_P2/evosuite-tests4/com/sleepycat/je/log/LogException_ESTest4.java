/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:08:59 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.log.LogException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LogException_ESTest4 extends LogException_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      LogException logException0 = new LogException("");
      LogException logException1 = new LogException("", (Exception) logException0);
      assertEquals("com.sleepycat.je.log.LogException: ", logException1.toString());
  }
}
