/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:48:43 KST 2017
 */

package com.sleepycat.je.tree;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TrackingInfo_ESTest1 extends TrackingInfo_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      TrackingInfo trackingInfo0 = new TrackingInfo(1375L, (-806L));
  }

  @Test
  public void test1()  throws Throwable  {
      TrackingInfo trackingInfo0 = new TrackingInfo((-433L), (-433L));
      String string0 = trackingInfo0.toString();
      assertEquals("lsn=0xffffffff/0xfffffe4f node=-433", string0);
  }
}