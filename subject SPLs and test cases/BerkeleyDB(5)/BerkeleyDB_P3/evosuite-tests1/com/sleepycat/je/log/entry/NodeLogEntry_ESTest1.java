/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:07:10 KST 2017
 */

package com.sleepycat.je.log.entry;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class NodeLogEntry_ESTest1 extends NodeLogEntry_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(false);
      long long0 = deletedDupLNLogEntry0.getNodeId();
      assertEquals(0L, long0);
  }
}