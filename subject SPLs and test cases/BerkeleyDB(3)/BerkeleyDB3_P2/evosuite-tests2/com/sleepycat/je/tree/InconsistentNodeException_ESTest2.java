/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:48:34 KST 2017
 */

package com.sleepycat.je.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class InconsistentNodeException_ESTest2 extends InconsistentNodeException_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      InconsistentNodeException inconsistentNodeException0 = new InconsistentNodeException("M\"@");
      assertEquals("com.sleepycat.je.tree.InconsistentNodeException: M\"@", inconsistentNodeException0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      InconsistentNodeException inconsistentNodeException0 = new InconsistentNodeException();
      assertNull(inconsistentNodeException0.getMessage());
  }
}
