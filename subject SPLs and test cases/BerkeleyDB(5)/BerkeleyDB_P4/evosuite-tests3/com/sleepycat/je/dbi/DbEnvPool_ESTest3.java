/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:21:26 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbEnvPool_ESTest3 extends DbEnvPool_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      DbEnvPool dbEnvPool0 = DbEnvPool.getInstance();
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      // Undeclared exception!
      try { 
        dbEnvPool0.getEnvironment((File) null, environmentConfig0);
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
      DbEnvPool dbEnvPool0 = DbEnvPool.getInstance();
      // Undeclared exception!
      try { 
        dbEnvPool0.remove((File) null);
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
      DbEnvPool dbEnvPool0 = DbEnvPool.getInstance();
      dbEnvPool0.clear();
  }

  @Test
  public void test3()  throws Throwable  {
      DbEnvPool dbEnvPool0 = DbEnvPool.getInstance();
      // Undeclared exception!
      try { 
        dbEnvPool0.getExistingEnvironment((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      DbEnvPool.EnvironmentImplInfo dbEnvPool_EnvironmentImplInfo0 = new DbEnvPool.EnvironmentImplInfo((EnvironmentImpl) null, true);
      assertTrue(dbEnvPool_EnvironmentImplInfo0.firstHandle);
  }
}