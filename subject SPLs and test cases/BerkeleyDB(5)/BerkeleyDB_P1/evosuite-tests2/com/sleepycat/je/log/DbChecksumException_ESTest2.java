/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:45:32 KST 2017
 */

package com.sleepycat.je.log;

import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbChecksumException_ESTest2 extends DbChecksumException_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      DbChecksumException dbChecksumException0 = new DbChecksumException((EnvironmentImpl) null, "");
      DbChecksumException dbChecksumException1 = new DbChecksumException((EnvironmentImpl) null, "JZn@Hg", (Throwable) dbChecksumException0);
      assertFalse(dbChecksumException0.equals((Object)dbChecksumException1));
  }
}
