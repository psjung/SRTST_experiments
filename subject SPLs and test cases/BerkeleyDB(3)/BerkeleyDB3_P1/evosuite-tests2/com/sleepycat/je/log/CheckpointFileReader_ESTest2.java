/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:44:36 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class CheckpointFileReader_ESTest2 extends CheckpointFileReader_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      CheckpointFileReader checkpointFileReader0 = null;
      try {
        checkpointFileReader0 = new CheckpointFileReader((EnvironmentImpl) null, (-18), false, (long) (-18), (long) (-18), (long) (-18));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }
}
