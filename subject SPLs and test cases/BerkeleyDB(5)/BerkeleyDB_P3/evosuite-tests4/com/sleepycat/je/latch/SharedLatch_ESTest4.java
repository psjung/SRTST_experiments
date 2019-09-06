/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:47:47 KST 2017
 */

package com.sleepycat.je.latch;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.latch.Java5SharedLatchImpl;
import com.sleepycat.je.latch.LatchException;
import com.sleepycat.je.latch.SharedLatchImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class SharedLatch_ESTest4 extends SharedLatch_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      Java5SharedLatchImpl java5SharedLatchImpl0 = new Java5SharedLatchImpl();
      boolean boolean0 = java5SharedLatchImpl0.acquireExclusiveNoWait();
      assertTrue(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("%H] r/IRyz;nwE]9", (EnvironmentImpl) null);
      sharedLatchImpl0.acquireExclusive();
      assertTrue(sharedLatchImpl0.isWriteLockedByCurrentThread());
  }

  @Test
  public void test2()  throws Throwable  {
      Java5SharedLatchImpl java5SharedLatchImpl0 = new Java5SharedLatchImpl();
      java5SharedLatchImpl0.setNoteLatch(true);
  }

  @Test
  public void test3()  throws Throwable  {
      Java5SharedLatchImpl java5SharedLatchImpl0 = new Java5SharedLatchImpl();
      java5SharedLatchImpl0.setName("jIE");
  }

  @Test
  public void test4()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("", (EnvironmentImpl) null);
      sharedLatchImpl0.release();
      assertFalse(sharedLatchImpl0.isWriteLockedByCurrentThread());
  }

  @Test
  public void test5()  throws Throwable  {
      Java5SharedLatchImpl java5SharedLatchImpl0 = new Java5SharedLatchImpl();
      boolean boolean0 = java5SharedLatchImpl0.isWriteLockedByCurrentThread();
      assertFalse(boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      Java5SharedLatchImpl java5SharedLatchImpl0 = new Java5SharedLatchImpl();
      java5SharedLatchImpl0.acquireShared();
  }

  @Test
  public void test7()  throws Throwable  {
      Java5SharedLatchImpl java5SharedLatchImpl0 = new Java5SharedLatchImpl();
      java5SharedLatchImpl0.acquireExclusive();
      try { 
        java5SharedLatchImpl0.acquireExclusiveNoWait();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // null already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5SharedLatchImpl", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Java5SharedLatchImpl java5SharedLatchImpl0 = new Java5SharedLatchImpl();
      java5SharedLatchImpl0.acquireExclusiveNoWait();
      try { 
        java5SharedLatchImpl0.acquireExclusive();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // null already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5SharedLatchImpl", e);
      }
  }
}
