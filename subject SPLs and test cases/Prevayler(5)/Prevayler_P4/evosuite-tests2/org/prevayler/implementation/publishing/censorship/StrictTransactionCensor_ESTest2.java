/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 21:44:55 KST 2017
 */

package org.prevayler.implementation.publishing.censorship;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.implementation.snapshot.GenericSnapshotManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class StrictTransactionCensor_ESTest2 extends StrictTransactionCensor_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      StrictTransactionCensor strictTransactionCensor0 = null;
      try {
        strictTransactionCensor0 = new StrictTransactionCensor((GenericSnapshotManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.publishing.censorship.StrictTransactionCensor", e);
      }
  }
}