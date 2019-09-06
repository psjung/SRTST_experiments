/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:35:30 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DummyLockManager_ESTest3 extends DummyLockManager_ESTest_scaffolding3 {

  @Test
  public void test1()  throws Throwable  {
      DummyLockManager dummyLockManager0 = null;
      try {
        dummyLockManager0 = new DummyLockManager((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.LockManager", e);
      }
  }
}
