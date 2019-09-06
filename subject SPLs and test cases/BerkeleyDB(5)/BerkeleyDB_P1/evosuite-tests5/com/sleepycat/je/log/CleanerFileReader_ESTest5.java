/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:33:02 KST 2017
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
public class CleanerFileReader_ESTest5 extends CleanerFileReader_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      Long long0 = new Long((long) (byte)53);
      CleanerFileReader cleanerFileReader0 = null;
      try {
        cleanerFileReader0 = new CleanerFileReader((EnvironmentImpl) null, (int) (byte)53, (long) (byte)53, long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }
}
