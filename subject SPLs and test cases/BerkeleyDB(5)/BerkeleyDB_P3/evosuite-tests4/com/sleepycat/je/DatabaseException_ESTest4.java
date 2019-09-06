/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:33:04 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.DatabaseException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DatabaseException_ESTest4 extends DatabaseException_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      DatabaseException databaseException0 = new DatabaseException();
      DatabaseException databaseException1 = new DatabaseException((Throwable) databaseException0);
      assertFalse(databaseException1.equals((Object)databaseException0));
  }

  @Test
  public void test1()  throws Throwable  {
      DatabaseException databaseException0 = new DatabaseException();
      DatabaseException databaseException1 = new DatabaseException("", (Throwable) databaseException0);
      assertEquals("", databaseException1.getMessage());
  }

  @Test
  public void test2()  throws Throwable  {
      DatabaseException databaseException0 = new DatabaseException("6w(F`WK}ypIZ4Aq");
      assertEquals("6w(F`WK}ypIZ4Aq", databaseException0.getMessage());
  }
}
