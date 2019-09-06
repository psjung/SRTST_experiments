/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:10:58 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.PrintStream;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.Environment;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbScavenger_ESTest3 extends DbScavenger_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      DbScavenger dbScavenger0 = null;
      try {
        dbScavenger0 = new DbScavenger((Environment) null, (PrintStream) null, "` YnA1j')7,gQey-J", true, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbDump", e);
      }
  }
}
