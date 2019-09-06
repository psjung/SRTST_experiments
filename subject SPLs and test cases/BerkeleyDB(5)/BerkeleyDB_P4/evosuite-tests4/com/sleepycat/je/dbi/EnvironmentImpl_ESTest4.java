/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:28:33 KST 2017
 */

package com.sleepycat.je.dbi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;
import java.io.File;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class EnvironmentImpl_ESTest4 extends EnvironmentImpl_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      File file0 = null;
      Properties properties0 = null;
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig(properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      EnvironmentImpl.EnvironmentImpl_createDaemons environmentImpl_EnvironmentImpl_createDaemons0 = new EnvironmentImpl.EnvironmentImpl_createDaemons((EnvironmentImpl) null);
      long long0 = 0L;
  }

  @Test
  public void test02()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
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
  public void test03()  throws Throwable  {
      boolean boolean0 = EnvironmentImpl.getFairLatches();
      assertFalse(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      boolean boolean0 = EnvironmentImpl.maybeForceYield();
      assertTrue(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setLocking(false);
      environmentConfig0.setTransactional(true);
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't set 'je.env.isNoLocking' and 'je.env.isTransactional';
         //
         assertThrownBy("com.sleepycat.je.dbi.EnvironmentImpl", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setTransactional(true);
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
  public void test07()  throws Throwable  {
      int int0 = EnvironmentImpl.getThreadLocalReferenceCount();
      //  // Unstable assertion: assertEquals((-2), int0);
  }

  @Test
  public void test08()  throws Throwable  {
      boolean boolean0 = EnvironmentImpl.getNoComparators();
      assertFalse(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      EnvironmentImpl.decThreadLocalReferenceCount();
  }

  @Test
  public void test10()  throws Throwable  {
      EnvironmentImpl.incThreadLocalReferenceCount();
  }

  @Test
  public void test11()  throws Throwable  {
      EnvironmentImpl.EnvironmentImpl_createDaemons environmentImpl_EnvironmentImpl_createDaemons0 = new EnvironmentImpl.EnvironmentImpl_createDaemons((EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        environmentImpl_EnvironmentImpl_createDaemons0.hook329();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.EnvironmentImpl", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      EnvironmentImpl.EnvironmentImpl_createDaemons environmentImpl_EnvironmentImpl_createDaemons0 = new EnvironmentImpl.EnvironmentImpl_createDaemons((EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        environmentImpl_EnvironmentImpl_createDaemons0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.evictor.Evictor", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      EnvironmentImpl.EnvironmentImpl_createDaemons environmentImpl_EnvironmentImpl_createDaemons0 = new EnvironmentImpl.EnvironmentImpl_createDaemons((EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        environmentImpl_EnvironmentImpl_createDaemons0.hook332();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.EnvironmentImpl", e);
      }
  }
}
