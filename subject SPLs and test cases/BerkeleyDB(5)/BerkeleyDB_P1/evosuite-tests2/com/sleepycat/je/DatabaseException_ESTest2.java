/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:47:26 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DatabaseException_ESTest2 extends DatabaseException_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      DatabaseException databaseException0 = new DatabaseException("");
      DatabaseException databaseException1 = new DatabaseException((Throwable) databaseException0);
      assertFalse(databaseException0.equals((Object)databaseException1));
  }

  @Test
  public void test1()  throws Throwable  {
      DatabaseException databaseException0 = new DatabaseException();
      assertNull(databaseException0.getMessage());
  }

  @Test
  public void test2()  throws Throwable  {
      DatabaseException databaseException0 = new DatabaseException("");
      DatabaseException databaseException1 = new DatabaseException("[/%q.|", (Throwable) databaseException0);
      assertFalse(databaseException1.equals((Object)databaseException0));
  }
}
