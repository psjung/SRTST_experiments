/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:51:31 KST 2017
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
public class Database_ESTest2 extends Database_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.getForeignKeyDatabase();
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
  public void test2()  throws Throwable  {
      Environment environment0 = null;
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.getForeignKeyDatabase();
      File file0 = null;
      Environment environment1 = null;
      try {
        environment1 = new Environment(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Database.DbState database_DbState0 = new Database.DbState("GJKM3^hmw20Ob6Y");
  }

  
}
