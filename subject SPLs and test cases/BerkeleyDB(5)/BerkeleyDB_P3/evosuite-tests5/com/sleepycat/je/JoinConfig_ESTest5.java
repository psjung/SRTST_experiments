/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:39:51 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class JoinConfig_ESTest5 extends JoinConfig_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      JoinConfig joinConfig0 = new JoinConfig();
      boolean boolean0 = joinConfig0.getNoSort();
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      JoinConfig joinConfig0 = new JoinConfig();
      JoinConfig joinConfig1 = joinConfig0.cloneConfig();
      assertFalse(joinConfig1.getNoSort());
  }

  @Test
  public void test2()  throws Throwable  {
      JoinConfig joinConfig0 = JoinConfig.DEFAULT;
      boolean boolean0 = joinConfig0.getNoSort();
      assertFalse(boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      JoinConfig joinConfig0 = JoinConfig.DEFAULT;
      JoinConfig joinConfig1 = joinConfig0.cloneConfig();
      assertFalse(joinConfig1.getNoSort());
  }

  @Test
  public void test4()  throws Throwable  {
      JoinConfig joinConfig0 = new JoinConfig();
      joinConfig0.setNoSort(false);
      assertFalse(joinConfig0.getNoSort());
  }
}
