/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:20:25 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.config.BooleanConfigParam;
import com.sleepycat.je.config.ConfigParam;
import com.sleepycat.je.config.IntConfigParam;
import com.sleepycat.je.config.LongConfigParam;
import com.sleepycat.je.config.ShortConfigParam;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbConfigManager_ESTest2 extends DbConfigManager_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      DbConfigManager dbConfigManager0 = new DbConfigManager((EnvironmentConfig) null);
      EnvironmentConfig environmentConfig0 = dbConfigManager0.getEnvironmentConfig();
      assertNull(environmentConfig0);
  }

  @Test
  public void test01()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      environmentConfig0.setTxnSerializableIsolation(true);
      EnvironmentConfig environmentConfig1 = dbConfigManager0.getEnvironmentConfig();
      assertFalse(environmentConfig1.getTransactional());
  }

  @Test
  public void test02()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setTransactional(true);
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      EnvironmentConfig environmentConfig1 = dbConfigManager0.getEnvironmentConfig();
      assertFalse(environmentConfig1.getTxnSerializableIsolation());
  }

  @Test
  public void test03()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setReadOnly(true);
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      EnvironmentConfig environmentConfig1 = dbConfigManager0.getEnvironmentConfig();
      assertTrue(environmentConfig1.getReadOnly());
  }

  @Test
  public void test04()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setAllowCreate(true);
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      EnvironmentConfig environmentConfig1 = dbConfigManager0.getEnvironmentConfig();
      assertTrue(environmentConfig1.getAllowCreate());
  }

  @Test
  public void test05()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      String string0 = dbConfigManager0.get("je.log.bufferSize");
      assertEquals("1048576", string0);
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      // Undeclared exception!
      try { 
        dbConfigManager0.getShort((ShortConfigParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbConfigManager", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      // Undeclared exception!
      try { 
        dbConfigManager0.getLong((LongConfigParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbConfigManager", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      DbConfigManager dbConfigManager0 = new DbConfigManager((EnvironmentConfig) null);
      // Undeclared exception!
      try { 
        dbConfigManager0.getInt((IntConfigParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbConfigManager", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      DbConfigManager dbConfigManager0 = new DbConfigManager((EnvironmentConfig) null);
      // Undeclared exception!
      try { 
        dbConfigManager0.get("'x8^7lj$6");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbConfigManager", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      // Undeclared exception!
      try { 
        dbConfigManager0.get((ConfigParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbConfigManager", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      // Undeclared exception!
      try { 
        dbConfigManager0.getBoolean((BooleanConfigParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbConfigManager", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      try { 
        dbConfigManager0.get("# If true (the default), use an LRU-only policy to select nodes for\n# eviction.  If false, select by Btree level first, and then by LRU.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // # If true (the default), use an LRU-only policy to select nodes for
         // # eviction.  If false, select by Btree level first, and then by LRU. is not a valid BDBJE environment configuration
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      dbConfigManager0.getEnvironmentConfig();
      environmentConfig0.setLocking(false);
      assertFalse(environmentConfig0.getLocking());
  }
}
