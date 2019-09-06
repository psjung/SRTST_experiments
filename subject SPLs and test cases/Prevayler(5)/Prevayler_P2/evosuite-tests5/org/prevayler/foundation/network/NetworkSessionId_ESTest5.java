/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:38:52 KST 2017
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
public class NetworkSessionId_ESTest5 extends NetworkSessionId_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(1761L, (-980));
      NetworkSessionId networkSessionId1 = new NetworkSessionId(1761L, 1433);
      boolean boolean0 = networkSessionId0.equals(networkSessionId1);
      assertFalse(networkSessionId1.equals((Object)networkSessionId0));
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(1761L, (-980));
      NetworkSessionId networkSessionId1 = new NetworkSessionId(1433, 1433);
      boolean boolean0 = networkSessionId0.equals(networkSessionId1);
      assertFalse(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(1162L, 444);
      NetworkSessionId networkSessionId1 = new NetworkSessionId(1162L, 1);
      boolean boolean0 = networkSessionId0.equals(networkSessionId1);
      assertFalse(boolean0);
      assertFalse(networkSessionId1.equals((Object)networkSessionId0));
  }

  @Test
  public void test3()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId((-3450L), 744);
      NetworkSessionId networkSessionId1 = new NetworkSessionId(0L, 744);
      boolean boolean0 = networkSessionId0.equals(networkSessionId1);
      assertFalse(boolean0);
      assertFalse(networkSessionId1.equals((Object)networkSessionId0));
  }

  @Test
  public void test4()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(1162L, 444);
      Object object0 = new Object();
      boolean boolean0 = networkSessionId0.equals(object0);
      assertFalse(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(1761L, (-980));
      boolean boolean0 = networkSessionId0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(1162L, 444);
      boolean boolean0 = networkSessionId0.equals(networkSessionId0);
      assertTrue(boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(1162L, 444);
      String string0 = networkSessionId0.toString();
      assertEquals("NetworkSessionId for 444, timestamped..1162", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      NetworkSessionId networkSessionId0 = new NetworkSessionId(1162L, 444);
      networkSessionId0.hashCode();
  }
}
