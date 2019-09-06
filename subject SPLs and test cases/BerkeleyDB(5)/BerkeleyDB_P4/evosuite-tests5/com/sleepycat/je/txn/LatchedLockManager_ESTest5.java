/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:58:13 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LatchedLockManager_ESTest5 extends LatchedLockManager_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      LatchedLockManager latchedLockManager0 = null;
      try {
        latchedLockManager0 = new LatchedLockManager((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.LockManager", e);
      }
  }
}
