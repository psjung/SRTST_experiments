/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:01:19 KST 2017
 */

package com.sleepycat.je.txn;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LockConflict_ESTest1 extends LockConflict_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      LockConflict lockConflict0 = LockConflict.ALLOW;
      boolean boolean0 = lockConflict0.getRestart();
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      LockConflict lockConflict0 = LockConflict.RESTART;
      boolean boolean0 = lockConflict0.getAllowed();
      assertFalse(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      LockConflict lockConflict0 = LockConflict.ALLOW;
      boolean boolean0 = lockConflict0.getAllowed();
      assertTrue(boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      LockConflict lockConflict0 = LockConflict.RESTART;
      boolean boolean0 = lockConflict0.getRestart();
      assertTrue(boolean0);
  }
}
