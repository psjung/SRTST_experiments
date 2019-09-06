/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:06:34 KST 2017
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
public class PrintFileReader_ESTest2 extends PrintFileReader_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      PrintFileReader printFileReader0 = null;
      try {
        printFileReader0 = new PrintFileReader((EnvironmentImpl) null, 18, (long) 18, (long) 18, "2", "2", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }
}
