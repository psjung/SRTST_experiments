/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:47:52 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.OperationStatus;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class OperationStatus_ESTest4 extends OperationStatus_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      OperationStatus operationStatus0 = OperationStatus.KEYEMPTY;
      String string0 = operationStatus0.toString();
      assertEquals("OperationStatus.KEYEMPTY", string0);
  }
}
