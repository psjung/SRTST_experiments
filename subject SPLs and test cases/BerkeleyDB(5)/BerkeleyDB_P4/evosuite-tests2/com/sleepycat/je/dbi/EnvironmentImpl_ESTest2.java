/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:25:31 KST 2017
 */

package com.sleepycat.je.dbi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.txn.BasicLocker;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class EnvironmentImpl_ESTest2 extends EnvironmentImpl_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
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

  @Test
  public void test01()  throws Throwable  {
      EnvironmentImpl environmentImpl0 = null;
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
      EnvironmentImpl environmentImpl0 = null;
      EnvironmentImpl.EnvironmentImpl_createDaemons environmentImpl_EnvironmentImpl_createDaemons0 = new EnvironmentImpl.EnvironmentImpl_createDaemons((EnvironmentImpl) null);
      BasicLocker basicLocker0 = null;
      try {
        basicLocker0 = new BasicLocker(environmentImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      boolean boolean0 = EnvironmentImpl.getFairLatches();
      assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      boolean boolean0 = EnvironmentImpl.maybeForceYield();
      assertTrue(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setTransactional(true);
      environmentConfig0.setLocking(false);
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
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      int int0 = EnvironmentImpl.getThreadLocalReferenceCount();
      //  // Unstable assertion: assertEquals(0, int0);
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
      boolean boolean0 = EnvironmentImpl.getNoComparators();
      assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
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
}
