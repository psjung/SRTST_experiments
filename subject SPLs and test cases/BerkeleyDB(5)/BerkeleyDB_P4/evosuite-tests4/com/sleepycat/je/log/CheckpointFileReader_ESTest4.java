/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:49:53 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.CheckpointFileReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class CheckpointFileReader_ESTest4 extends CheckpointFileReader_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      CheckpointFileReader checkpointFileReader0 = null;
      try {
        checkpointFileReader0 = new CheckpointFileReader((EnvironmentImpl) null, (int) (byte) (-126), false, (long) (byte) (-126), (long) (byte) (-126), (long) (byte) (-126));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }
}
