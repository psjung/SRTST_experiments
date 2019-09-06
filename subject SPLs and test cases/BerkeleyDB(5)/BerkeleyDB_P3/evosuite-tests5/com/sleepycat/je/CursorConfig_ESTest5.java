/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:21:43 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class CursorConfig_ESTest5 extends CursorConfig_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.DIRTY_READ;
      cursorConfig0.setReadUncommitted(true);
      assertTrue(cursorConfig0.getReadUncommitted());
  }

  @Test
  public void test2()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.DIRTY_READ;
      boolean boolean0 = cursorConfig0.getReadCommitted();
      assertFalse(boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      CursorConfig cursorConfig0 = new CursorConfig();
      cursorConfig0.setReadCommitted(false);
      assertFalse(cursorConfig0.getReadCommitted());
      assertFalse(cursorConfig0.getDirtyRead());
  }

  @Test
  public void test5()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.READ_UNCOMMITTED;
      CursorConfig cursorConfig1 = cursorConfig0.cloneConfig();
      assertFalse(cursorConfig1.equals((Object)cursorConfig0));
  }

  @Test
  public void test6()  throws Throwable  {
      CursorConfig cursorConfig0 = new CursorConfig();
      cursorConfig0.setDirtyRead(false);
      assertFalse(cursorConfig0.getReadCommitted());
      assertFalse(cursorConfig0.getReadUncommitted());
  }
}