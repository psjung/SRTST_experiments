/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:39:09 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.Properties;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.config.ConfigParam;
import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class EnvironmentMutableConfig_ESTest4 extends EnvironmentMutableConfig_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.getNumExplicitlySetParams();
      assertFalse(environmentConfig0.getTxnWriteNoSync());
      assertFalse(environmentConfig0.getTxnNoSync());
  }

  @Test
  public void test01()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      EnvironmentMutableConfig environmentMutableConfig1 = environmentMutableConfig0.cloneMutableConfig();
      environmentMutableConfig1.setTxnWriteNoSync(true);
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
      assertTrue(environmentMutableConfig1.getTxnWriteNoSync());
  }

  @Test
  public void test02()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.setLoadPropertyFile(false);
      EnvironmentMutableConfig environmentMutableConfig1 = environmentMutableConfig0.cloneMutableConfig();
      assertNotSame(environmentMutableConfig1, environmentMutableConfig0);
      assertFalse(environmentMutableConfig1.getTxnWriteNoSync());
      assertFalse(environmentMutableConfig1.getTxnNoSync());
  }

  @Test
  public void test03()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.cacheSize = (-2742L);
      EnvironmentMutableConfig environmentMutableConfig1 = environmentMutableConfig0.cloneMutableConfig();
      assertNotSame(environmentMutableConfig1, environmentMutableConfig0);
      assertFalse(environmentMutableConfig1.getTxnNoSync());
      assertFalse(environmentMutableConfig1.getTxnWriteNoSync());
  }

  @Test
  public void test04()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      Properties properties0 = null;
      // Undeclared exception!
      try { 
        environmentConfig0.validateProperties(properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      ConfigParam configParam0 = null;
      String string0 = null;
      // Undeclared exception!
      try { 
        environmentConfig0.setVal(configParam0, string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.toString();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      Properties properties0 = null;
      EnvironmentMutableConfig environmentMutableConfig0 = null;
      try {
        environmentMutableConfig0 = new EnvironmentMutableConfig(properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = true;
      environmentConfig0.setTxnNoSync(boolean0);
      assertTrue(environmentConfig0.getTxnNoSync());
  }

  @Test
  public void test11()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      ConfigParam configParam0 = null;
      // Undeclared exception!
      try { 
        environmentConfig0.getVal(configParam0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = environmentConfig0.getTxnWriteNoSync();
      environmentConfig0.setLoadPropertyFile(boolean0);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test13()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      long long0 = environmentConfig0.getCacheSize();
      assertEquals(0L, long0);
  }

  @Test
  public void test14()  throws Throwable  {
      Properties properties0 = null;
      EnvironmentMutableConfig environmentMutableConfig0 = null;
      try {
        environmentMutableConfig0 = new EnvironmentMutableConfig(properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.setValidateParams(true);
      assertFalse(environmentMutableConfig0.getTxnNoSync());
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
  }

  @Test
  public void test16()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      boolean boolean0 = environmentMutableConfig0.getLoadPropertyFile();
      assertTrue(boolean0);
      assertFalse(environmentMutableConfig0.getTxnNoSync());
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
  }

  @Test
  public void test17()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.getCachePercent();
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
      assertFalse(environmentMutableConfig0.getTxnNoSync());
  }

  @Test
  public void test18()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentMutableConfig0.checkImmutablePropsForEquality(environmentConfig0);
      assertFalse(environmentConfig0.getTxnWriteNoSync());
      assertFalse(environmentConfig0.getTxnNoSync());
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
  }

  @Test
  public void test19()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      // Undeclared exception!
      try { 
        environmentMutableConfig0.validateProperties((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      // Undeclared exception!
      try { 
        environmentMutableConfig0.setVal((ConfigParam) null, "B@UZBh)No|c30Ql![%");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      // Undeclared exception!
      try { 
        environmentConfig0.copyMutablePropsTo((EnvironmentMutableConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      // Undeclared exception!
      try { 
        environmentConfig0.copyHandlePropsTo((EnvironmentMutableConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      // Undeclared exception!
      try { 
        environmentConfig0.checkImmutablePropsForEquality((EnvironmentMutableConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.toString();
      assertFalse(environmentMutableConfig0.getTxnNoSync());
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
  }

  @Test
  public void test25()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.copyMutablePropsTo(environmentMutableConfig0);
      assertFalse(environmentMutableConfig0.getTxnNoSync());
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
  }

  @Test
  public void test26()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentConfig environmentConfig1 = (EnvironmentConfig)environmentConfig0.clone();
      environmentConfig0.setTxnSerializableIsolation(true);
      try { 
        environmentConfig1.checkImmutablePropsForEquality(environmentConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // je.txn.serializableIsolation is set to true in the config parameter which is incompatible with the value of null in the underlying environment
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      try { 
        environmentMutableConfig0.getConfigParam("*+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // *+ is not a valid BDBJE environment configuration
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      try { 
        environmentMutableConfig0.setConfigParam("'Ua", "#-Ng)PrH<bZ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'Ua is not a valid BDBJE environment configuration
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      try { 
        environmentMutableConfig0.setConfigParam("je.evictor.lruOnly", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // je.evictor.lruOnly is not a mutable BDBJE environment configuration
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setCacheSize((-1L));
      assertFalse(environmentConfig0.getTxnWriteNoSync());
      assertFalse(environmentConfig0.getTxnNoSync());
  }

  @Test
  public void test32()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      boolean boolean0 = environmentMutableConfig0.getTxnNoSync();
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
      assertFalse(boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      // Undeclared exception!
      try { 
        environmentConfig0.fillInEnvironmentGeneratedProps((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      EnvironmentMutableConfig environmentMutableConfig1 = environmentMutableConfig0.cloneMutableConfig();
      environmentMutableConfig1.setTxnNoSync(true);
      assertTrue(environmentMutableConfig1.getTxnNoSync());
      assertFalse(environmentMutableConfig0.getTxnNoSync());
  }
}
