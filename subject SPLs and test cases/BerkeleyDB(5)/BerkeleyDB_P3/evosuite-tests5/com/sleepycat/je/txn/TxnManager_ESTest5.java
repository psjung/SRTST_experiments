/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 12:13:42 KST 2017
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
public class TxnManager_ESTest5 extends TxnManager_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      TxnManager txnManager0 = null;
      try {
        txnManager0 = new TxnManager((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.TxnManager", e);
      }
  }
}
