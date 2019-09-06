/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:46:09 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LockNotGrantedException_ESTest1 extends LockNotGrantedException_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      LockNotGrantedException lockNotGrantedException0 = new LockNotGrantedException((String) null);
      LockNotGrantedException lockNotGrantedException1 = new LockNotGrantedException((Throwable) lockNotGrantedException0);
      assertEquals("com.sleepycat.je.LockNotGrantedException", lockNotGrantedException1.getMessage());
  }

  @Test
  public void test1()  throws Throwable  {
      LockNotGrantedException lockNotGrantedException0 = new LockNotGrantedException();
      assertNull(lockNotGrantedException0.getMessage());
  }

  @Test
  public void test2()  throws Throwable  {
      LockNotGrantedException lockNotGrantedException0 = new LockNotGrantedException((String) null);
      LockNotGrantedException lockNotGrantedException1 = new LockNotGrantedException((String) null, (Throwable) lockNotGrantedException0);
      assertEquals("com.sleepycat.je.LockNotGrantedException", lockNotGrantedException1.toString());
  }
}
