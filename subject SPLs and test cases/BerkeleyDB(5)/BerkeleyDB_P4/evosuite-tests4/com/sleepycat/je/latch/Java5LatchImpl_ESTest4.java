/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:40:36 KST 2017
 */

package com.sleepycat.je.latch;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.latch.Java5LatchImpl;
import com.sleepycat.je.latch.LatchException;
import com.sleepycat.je.latch.LatchNotHeldException;
import com.sleepycat.je.latch.LatchStats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Java5LatchImpl_ESTest4 extends Java5LatchImpl_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.acquireNoWait();
      java5LatchImpl0.release();
  }

  @Test
  public void test01()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      String string0 = "";
      java5LatchImpl0.setName(string0);
  }

  @Test
  public void test02()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.releaseIfOwner();
  }

  @Test
  public void test03()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      try { 
        java5LatchImpl0.release();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // null not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      Thread thread0 = java5LatchImpl0.owner();
      assertNull(thread0);
  }

  @Test
  public void test05()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      int int0 = java5LatchImpl0.nWaiters();
      assertEquals(0, int0);
  }

  @Test
  public void test06()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      boolean boolean0 = java5LatchImpl0.isOwner();
      assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.hook421();
  }

  @Test
  public void test08()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.hook420();
  }

  @Test
  public void test09()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.hook419();
  }

  @Test
  public void test10()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.hook418();
  }

  @Test
  public void test11()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.hook417();
  }

  @Test
  public void test12()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.hook416();
  }

  @Test
  public void test13()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      LatchStats latchStats0 = java5LatchImpl0.getLatchStats();
      assertEquals(0, latchStats0.nReleases);
  }

  @Test
  public void test14()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.acquire();
  }

  @Test
  public void test15()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.acquireNoWait();
      try { 
        java5LatchImpl0.acquireNoWait();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // null already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      String string0 = java5LatchImpl0.toString();
      assertNotNull(string0);
  }
}
