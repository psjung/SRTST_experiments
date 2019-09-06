/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 04:00:51 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Properties;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class EnvironmentConfig_ESTest3 extends EnvironmentConfig_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setTxnTimeout(98304L);
      long long0 = environmentConfig0.getTxnTimeout();
      assertFalse(environmentConfig0.getAllowCreate());
      assertEquals(98304L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setTransactional(true);
      boolean boolean0 = environmentConfig0.getTransactional();
      assertTrue(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.getReadOnly();
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test03()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      long long0 = environmentConfig0.getLockTimeout();
      assertEquals(500000L, long0);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test04()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setCreateUP(false);
      boolean boolean0 = environmentConfig0.getCreateUP();
      assertFalse(boolean0);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test05()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setCheckpointUP(false);
      boolean boolean0 = environmentConfig0.getCheckpointUP();
      assertFalse(boolean0);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = environmentConfig0.getAllowCreate();
      assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentConfig environmentConfig1 = environmentConfig0.cloneConfig();
      environmentConfig1.setTransactional(true);
      assertTrue(environmentConfig1.getTransactional());
  }

  @Test
  public void test08()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setLockTimeout(2348L);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test11()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      long long0 = environmentConfig0.getLockTimeout();
      //  // Unstable assertion: assertEquals(0L, long0);
  }

  @Test
  public void test12()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      try { 
        environmentConfig0.setConfigParam("allowCreate=true\n{je.txn.serializableIsolation=false, je.env.isReadOnly=true, je.lock.timeout=0}", "%]k0c__w0D(#QE6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // allowCreate=true
         // {je.txn.serializableIsolation=false, je.env.isReadOnly=true, je.lock.timeout=0} is not a valid BDBJE environment configuration
         //
         assertThrownBy("com.sleepycat.je.EnvironmentConfig", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setReadOnly(false);
      assertFalse(environmentConfig0.getAllowCreate());
      assertFalse(environmentConfig0.getReadOnly());
  }

  @Test
  public void test14()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = environmentConfig0.getReadOnly();
      assertFalse(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setLocking(false);
      boolean boolean0 = environmentConfig0.getLocking();
      assertFalse(boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      boolean boolean0 = environmentConfig0.getCheckpointUP();
      assertFalse(environmentConfig0.getAllowCreate());
      assertTrue(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setCreateUP(false);
      EnvironmentConfig environmentConfig1 = environmentConfig0.cloneConfig();
      assertFalse(environmentConfig1.getAllowCreate());
  }

  @Test
  public void test22()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.getTxnSerializableIsolation();
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test23()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setTxnSerializableIsolation(false);
      assertFalse(environmentConfig0.getTxnSerializableIsolation());
  }

  @Test
  public void test24()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setAllowCreate(false);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test26()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      String string0 = environmentConfig0.toString();
      //  // Unstable assertion: assertEquals("allowCreate=false\n{}", string0);
  }

  @Test
  public void test27()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setTxnReadCommitted(false);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test28()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.getTransactional();
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test29()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      boolean boolean0 = environmentConfig0.getCreateUP();
      assertTrue(boolean0);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test30()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.getLocking();
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test31()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      boolean boolean0 = environmentConfig0.getAllowCreate();
      assertFalse(boolean0);
  }
}