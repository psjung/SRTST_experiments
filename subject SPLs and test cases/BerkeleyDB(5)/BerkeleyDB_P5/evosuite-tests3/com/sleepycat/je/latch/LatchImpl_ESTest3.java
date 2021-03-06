/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:05:53 KST 2017
 */

package com.sleepycat.je.latch;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LatchImpl_ESTest3 extends LatchImpl_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      Thread thread0 = latchImpl0.owner();
      assertNull(thread0);
  }

  @Test
  public void test01()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      latchImpl0.hook428();
      assertFalse(latchImpl0.isOwner());
  }

  @Test
  public void test02()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      latchImpl0.hook427();
      assertEquals(0, latchImpl0.nWaiters());
  }

  @Test
  public void test03()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      latchImpl0.hook426();
      assertFalse(latchImpl0.isOwner());
  }

  @Test
  public void test04()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      latchImpl0.hook424();
      assertFalse(latchImpl0.isOwner());
  }

  @Test
  public void test05()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      latchImpl0.hook423();
      assertEquals(0, latchImpl0.nWaiters());
  }

  @Test
  public void test06()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl("J$wlxILHe/SQ~!p", (EnvironmentImpl) null);
      latchImpl0.hook422();
      assertFalse(latchImpl0.isOwner());
  }

  @Test
  public void test07()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      latchImpl0.releaseIfOwner();
      assertEquals(0, latchImpl0.nWaiters());
  }

  @Test
  public void test08()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      try { 
        latchImpl0.release();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // LatchImpl(LatchImpl) not held
         //
         assertThrownBy("com.sleepycat.je.latch.LatchImpl", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl("(", (EnvironmentImpl) null);
      latchImpl0.setName("");
      assertFalse(latchImpl0.isOwner());
  }

  @Test
  public void test10()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      latchImpl0.hook425();
      assertFalse(latchImpl0.isOwner());
  }

  @Test
  public void test11()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl("", (EnvironmentImpl) null);
      int int0 = latchImpl0.nWaiters();
      assertEquals(0, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      boolean boolean0 = latchImpl0.isOwner();
      assertFalse(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      latchImpl0.acquireNoWait();
      try { 
        latchImpl0.acquireNoWait();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // LatchImpl(LatchImpl) already held
         //
         assertThrownBy("com.sleepycat.je.latch.LatchImpl", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      latchImpl0.toString();
      try { 
        latchImpl0.release();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // LatchImpl(LatchImpl) not held
         //
         assertThrownBy("com.sleepycat.je.latch.LatchImpl", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      latchImpl0.acquire();
      assertEquals(0, latchImpl0.nWaiters());
  }

  @Test
  public void test16()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl("(", (EnvironmentImpl) null);
      latchImpl0.acquire();
      try { 
        latchImpl0.acquire();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // LatchImpl(() already held
         //
         assertThrownBy("com.sleepycat.je.latch.LatchImpl", e);
      }
  }
}
