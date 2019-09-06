/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:58:03 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Cleaner_ESTest5 extends Cleaner_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      Cleaner.Cleaner_processPending cleaner_Cleaner_processPending0 = new Cleaner.Cleaner_processPending((Cleaner) null);
      // Undeclared exception!
      try { 
        cleaner_Cleaner_processPending0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.Cleaner", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Cleaner cleaner0 = null;
      try {
        cleaner0 = new Cleaner((EnvironmentImpl) null, "r']yc]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile", e);
      }
  }
}
