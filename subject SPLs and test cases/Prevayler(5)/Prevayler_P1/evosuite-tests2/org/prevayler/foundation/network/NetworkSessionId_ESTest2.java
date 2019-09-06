/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:26:15 KST 2017
 */

package org.prevayler.foundation.network;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class NetworkSessionId_ESTest2 extends NetworkSessionId_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(0L, 994);
      NetworkSessionId networkSessionId1 = new NetworkSessionId(0L, 658);
      boolean boolean0 = networkSessionId0.equals(networkSessionId1);
      assertFalse(networkSessionId1.equals((Object)networkSessionId0));
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId((-479L), (-21));
      NetworkSessionId networkSessionId1 = new NetworkSessionId((-21), (-21));
      boolean boolean0 = networkSessionId1.equals(networkSessionId0);
      assertFalse(networkSessionId0.equals((Object)networkSessionId1));
      assertFalse(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(0, 0);
      NetworkSessionId networkSessionId1 = new NetworkSessionId(0L, 1);
      boolean boolean0 = networkSessionId0.equals(networkSessionId1);
      assertFalse(networkSessionId1.equals((Object)networkSessionId0));
      assertFalse(boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(2867L, (-1));
      NetworkSessionId networkSessionId1 = new NetworkSessionId((-1), (-1));
      boolean boolean0 = networkSessionId1.equals(networkSessionId0);
      assertFalse(boolean0);
      assertFalse(networkSessionId0.equals((Object)networkSessionId1));
  }

  @Test
  public void test4()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(0L, 994);
      Integer integer0 = new Integer(994);
      boolean boolean0 = networkSessionId0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(659, 659);
      boolean boolean0 = networkSessionId0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(0, 0);
      boolean boolean0 = networkSessionId0.equals(networkSessionId0);
      assertTrue(boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(0, 0);
      String string0 = networkSessionId0.toString();
      assertEquals("NetworkSessionId for 0, timestamped..0", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(0L, 994);
      networkSessionId0.hashCode();
  }
}