/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 04:08:16 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Database_ESTest3 extends Database_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      Database.Database_acquireTriggerListWriteLock database_Database_acquireTriggerListWriteLock0 = new Database.Database_acquireTriggerListWriteLock((Database) null);
      File file0 = null;
      Environment environment0 = null;
      try {
        environment0 = new Environment(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Database.DbState database_DbState0 = Database.CLOSED;
      String string0 = database_DbState0.toString();
      assertEquals("DbState.CLOSED", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      Database.DbState database_DbState0 = new Database.DbState("Can't call Databae.putNoOverWrite");
  }

  @Test
  public void test6()  throws Throwable  {
      Database.Database_releaseTriggerListWriteLock database_Database_releaseTriggerListWriteLock0 = new Database.Database_releaseTriggerListWriteLock((Database) null);
      // Undeclared exception!
      try { 
        database_Database_releaseTriggerListWriteLock0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }
}
