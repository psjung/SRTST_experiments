/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:45:01 KST 2017
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
public class LNFileReader_ESTest1 extends LNFileReader_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      Long long0 = new Long((long) 28);
      LNFileReader lNFileReader0 = null;
      try {
        lNFileReader0 = new LNFileReader((EnvironmentImpl) null, 28, (long) 28, true, (long) 28, (long) 28, long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }
}
