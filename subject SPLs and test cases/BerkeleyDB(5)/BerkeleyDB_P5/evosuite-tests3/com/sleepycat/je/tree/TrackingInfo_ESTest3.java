/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:24:38 KST 2017
 */

package com.sleepycat.je.tree;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TrackingInfo_ESTest3 extends TrackingInfo_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      TrackingInfo trackingInfo0 = new TrackingInfo((-1189L), 0L);
  }

  @Test
  public void test1()  throws Throwable  {
      TrackingInfo trackingInfo0 = new TrackingInfo(79L, 79L);
      String string0 = trackingInfo0.toString();
      assertEquals("lsn=0x0/0x4f node=79", string0);
  }
}
