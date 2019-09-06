/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:24:58 KST 2017
 */

package com.sleepycat.je.dbi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.DbEnvState;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbEnvState_ESTest4 extends DbEnvState_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      DbEnvState dbEnvState0 = DbEnvState.INVALID;
      String string0 = dbEnvState0.toString();
      assertEquals("invalid", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      DbEnvState dbEnvState0 = DbEnvState.INVALID;
      DbEnvState[] dbEnvStateArray0 = new DbEnvState[1];
      // Undeclared exception!
      try { 
        dbEnvState0.checkState(dbEnvStateArray0, dbEnvStateArray0[0]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvState", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DbEnvState dbEnvState0 = new DbEnvState((String) null);
      DbEnvState[] dbEnvStateArray0 = new DbEnvState[4];
      dbEnvStateArray0[1] = dbEnvState0;
      dbEnvState0.checkState(dbEnvStateArray0, dbEnvState0);
  }

  @Test
  public void test3()  throws Throwable  {
      DbEnvState dbEnvState0 = new DbEnvState((String) null);
      DbEnvState[] dbEnvStateArray0 = new DbEnvState[4];
      try { 
        dbEnvState0.checkState(dbEnvStateArray0, dbEnvState0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Can't go from environment state null to null
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvState", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      DbEnvState dbEnvState0 = new DbEnvState((String) null);
      String string0 = dbEnvState0.toString();
      assertNull(string0);
  }
}
