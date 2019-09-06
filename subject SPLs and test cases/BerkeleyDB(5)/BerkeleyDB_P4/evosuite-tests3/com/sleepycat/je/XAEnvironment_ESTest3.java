/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:43:38 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class XAEnvironment_ESTest3 extends XAEnvironment_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      XAEnvironment xAEnvironment0 = null;
      try {
        xAEnvironment0 = new XAEnvironment((File) null, (EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // envHome cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }
}
