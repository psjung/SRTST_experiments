/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:59:29 KST 2017
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
public class EnvironmentMutableConfig_ESTest3 extends EnvironmentMutableConfig_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      int int0 = environmentConfig0.getNumExplicitlySetParams();
      //  // Unstable assertion: assertEquals(4, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      boolean boolean0 = environmentConfig0.getLoadPropertyFile();
      assertTrue(boolean0);
      assertFalse(environmentConfig0.getTxnNoSync());
      assertFalse(environmentConfig0.getTxnWriteNoSync());
  }

  @Test
  public void test02()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.cacheSize = 1920L;
      long long0 = environmentMutableConfig0.getCacheSize();
      assertEquals(1920L, long0);
  }

  @Test
  public void test03()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.cacheSize = (-1261L);
      long long0 = environmentConfig0.getCacheSize();
      assertEquals((-1261L), long0);
  }

  @Test
  public void test04()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.setLoadPropertyFile(false);
      EnvironmentMutableConfig environmentMutableConfig1 = environmentMutableConfig0.cloneMutableConfig();
      assertFalse(environmentMutableConfig1.getTxnWriteNoSync());
      assertNotSame(environmentMutableConfig1, environmentMutableConfig0);
      assertFalse(environmentMutableConfig1.getTxnNoSync());
  }

  @Test
  public void test05()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.cacheSize = 1920L;
      EnvironmentMutableConfig environmentMutableConfig1 = environmentMutableConfig0.cloneMutableConfig();
      assertNotSame(environmentMutableConfig1, environmentMutableConfig0);
      assertFalse(environmentMutableConfig1.getTxnNoSync());
      assertFalse(environmentMutableConfig1.getTxnWriteNoSync());
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.cacheSize = (-516L);
      EnvironmentMutableConfig environmentMutableConfig1 = environmentMutableConfig0.cloneMutableConfig();
      assertFalse(environmentMutableConfig1.getTxnNoSync());
      assertFalse(environmentMutableConfig1.getTxnWriteNoSync());
      assertNotSame(environmentMutableConfig1, environmentMutableConfig0);
  }

  @Test
  public void test07()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      // Undeclared exception!
      try { 
        environmentConfig0.cloneMutableConfig();
       //  fail("Expecting exception: AssertionError");
       // Unstable assertion
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      try { 
        environmentMutableConfig0.setConfigParam(" is not a valid BDBJE environment configuration", "\"M0IMeyX1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  is not a valid BDBJE environment configuration is not a valid BDBJE environment configuration
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
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
  public void test12()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      EnvironmentConfig environmentConfig1 = (EnvironmentConfig)environmentConfig0.clone();
      assertNotSame(environmentConfig1, environmentConfig0);
  }

  @Test
  public void test13()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      // Undeclared exception!
      try { 
        environmentConfig0.validateProperties((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      // Undeclared exception!
      try { 
        environmentMutableConfig0.setVal((ConfigParam) null, "02fRr>tF?/,K");
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
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      try { 
        environmentConfig0.setCachePercent(1381);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.IntConfigParam: param je.maxMemoryPercent doesn't validate, 1381 is greater than max of 90
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      // Undeclared exception!
      try { 
        environmentConfig0.getVal((ConfigParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
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
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.toString();
      assertFalse(environmentMutableConfig0.getTxnNoSync());
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
  }

  @Test
  public void test22()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      // Undeclared exception!
      try { 
        environmentConfig0.copyMutablePropsTo(environmentConfig0);
       //  fail("Expecting exception: AssertionError");
       // Unstable assertion
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
      
      //  // Unstable assertion: assertFalse(environmentConfig0.getTxnSerializableIsolation());
  }

  @Test
  public void test24()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.checkImmutablePropsForEquality(environmentConfig0);
      assertFalse(environmentConfig0.getReadOnly());
  }

  @Test
  public void test25()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.setCacheSize(0);
      assertFalse(environmentMutableConfig0.getTxnNoSync());
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
  }

  @Test
  public void test26()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      try { 
        environmentMutableConfig0.getConfigParam("Exception while closing cursors:\n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Exception while closing cursors:
         //  is not a valid BDBJE environment configuration
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
      
      environmentMutableConfig0.setTxnWriteNoSync(true);
      environmentMutableConfig0.cloneMutableConfig();
      assertTrue(environmentMutableConfig0.getTxnWriteNoSync());
  }

  @Test
  public void test30()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = environmentConfig0.getTxnWriteNoSync();
      assertFalse(boolean0);
  }

  @Test
  public void test31()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setCacheSize(2466L);
      assertFalse(environmentConfig0.getReadOnly());
  }

  @Test
  public void test32()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      assertFalse(environmentMutableConfig0.getTxnNoSync());
      
      environmentMutableConfig0.setTxnNoSync(true);
      boolean boolean0 = environmentMutableConfig0.getTxnNoSync();
      assertTrue(boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      int int0 = environmentConfig0.getCachePercent();
      //  // Unstable assertion: assertEquals(60, int0);
  }

  @Test
  public void test34()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = null;
      try {
        environmentMutableConfig0 = new EnvironmentMutableConfig((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test35()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.getCacheSize();
      assertFalse(environmentConfig0.getTxnNoSync());
      assertFalse(environmentConfig0.getTxnWriteNoSync());
  }

  @Test
  public void test36()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.getNumExplicitlySetParams();
      assertFalse(environmentMutableConfig0.getTxnNoSync());
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
  }

  @Test
  public void test37()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setValidateParams(false);
      assertFalse(environmentConfig0.getReadOnly());
  }

  @Test
  public void test38()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      boolean boolean0 = environmentConfig0.getTxnNoSync();
      assertFalse(boolean0);
      assertFalse(environmentConfig0.getTxnWriteNoSync());
  }

  @Test
  public void test39()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      // Undeclared exception!
      try { 
        environmentMutableConfig0.fillInEnvironmentGeneratedProps((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      EnvironmentMutableConfig environmentMutableConfig1 = environmentMutableConfig0.cloneMutableConfig();
      environmentMutableConfig1.setTxnNoSync(true);
      assertFalse(environmentMutableConfig0.getTxnNoSync());
      assertTrue(environmentMutableConfig1.getTxnNoSync());
  }
}
