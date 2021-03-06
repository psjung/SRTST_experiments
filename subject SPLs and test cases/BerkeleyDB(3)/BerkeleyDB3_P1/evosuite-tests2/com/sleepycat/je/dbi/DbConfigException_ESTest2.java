/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:19:24 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbConfigException_ESTest2 extends DbConfigException_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      DbConfigException dbConfigException0 = new DbConfigException("");
      DbConfigException dbConfigException1 = new DbConfigException((Throwable) dbConfigException0);
      assertFalse(dbConfigException0.equals((Object)dbConfigException1));
  }

  @Test
  public void test1()  throws Throwable  {
      DbConfigException dbConfigException0 = new DbConfigException("");
      DbConfigException dbConfigException1 = new DbConfigException("u[l2Aiz", (Throwable) dbConfigException0);
      assertFalse(dbConfigException1.equals((Object)dbConfigException0));
  }
}
