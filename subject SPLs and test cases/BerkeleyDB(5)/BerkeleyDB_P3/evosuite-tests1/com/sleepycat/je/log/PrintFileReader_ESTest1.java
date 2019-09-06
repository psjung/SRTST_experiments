/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:55:59 KST 2017
 */

package com.sleepycat.je.log;

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
public class PrintFileReader_ESTest1 extends PrintFileReader_ESTest_scaffolding1 {

  @Test
  public void test1()  throws Throwable  {
      PrintFileReader printFileReader0 = null;
      try {
        printFileReader0 = new PrintFileReader((EnvironmentImpl) null, (-5), (long) (-5), (long) (-5), "ilEV'", "ilEV'", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }
}