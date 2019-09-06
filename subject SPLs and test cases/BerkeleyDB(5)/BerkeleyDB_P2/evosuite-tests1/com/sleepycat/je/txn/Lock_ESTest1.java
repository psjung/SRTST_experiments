/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:00:40 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.dbi.MemoryBudget;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Lock_ESTest1 extends Lock_ESTest_scaffolding1 {

  @Test
  public void test01()  throws Throwable  {
      Lock lock0 = new Lock();
      Long long0 = lock0.getNodeId();
      assertNull(long0);
  }

  @Test
  public void test02()  throws Throwable  {
      Lock lock0 = new Lock((Long) null);
      lock0.getWriteOwnerLocker();
      Locker[] lockerArray0 = new Locker[1];
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, (EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbConfigManager", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      Long long0 = new Long(0L);
      Lock lock0 = new Lock(long0);
      int int0 = lock0.nWaiters();
      assertEquals(0, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      Long long0 = new Long(297L);
      Lock lock0 = new Lock(long0);
      int int0 = lock0.nOwners();
      assertEquals(0, int0);
  }

  @Test
  public void test07()  throws Throwable  {
      Lock lock0 = new Lock((Long) null);
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        lock0.transferMultiple(txn0, (Locker[]) null, (MemoryBudget) null, 293);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Lock", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Long long0 = new Long(297L);
      Lock lock0 = new Lock(long0);
      String string0 = lock0.toString();
      assertEquals(" NodeId:297 Owners: (none) Waiters: (none)", string0);
  }

  @Test
  public void test15()  throws Throwable  {
      Lock lock0 = new Lock((Long) null);
      boolean boolean0 = lock0.isWaiter((Locker) null);
      assertFalse(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      Long long0 = new Long(4854L);
      Lock lock0 = new Lock(long0);
      boolean boolean0 = lock0.isOwner((Locker) null, (LockType) null);
      assertFalse(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      Lock lock0 = new Lock((Long) null);
      lock0.demote((Locker) null);
  }

  @Test
  public void test22()  throws Throwable  {
      Long long0 = new Long(4854L);
      Lock lock0 = new Lock(long0);
      Set set0 = lock0.release((Locker) null, (MemoryBudget) null, 1102);
      assertNull(set0);
  }

  @Test
  public void test24()  throws Throwable  {
      Long long0 = new Long(297L);
      Lock lock0 = new Lock(long0);
      Set set0 = lock0.getOwnersClone();
      assertTrue(set0.isEmpty());
  }

  @Test
  public void test25()  throws Throwable  {
      Long long0 = new Long(297L);
      Lock lock0 = new Lock(long0);
      lock0.flushWaiter((Locker) null, (MemoryBudget) null, 0);
  }

  @Test
  public void test26()  throws Throwable  {
      Long long0 = new Long(297L);
      Lock lock0 = new Lock(long0);
      List list0 = lock0.getWaitersListClone();
      assertEquals(0, list0.size());
  }

  @Test
  public void test35()  throws Throwable  {
      Long long0 = new Long(297L);
      Lock lock0 = new Lock(long0);
      lock0.hook765((MemoryBudget) null, (-376), false);
  }

  @Test
  public void test36()  throws Throwable  {
      Long long0 = new Long(297L);
      Lock lock0 = new Lock(long0);
      Long long1 = lock0.getNodeId();
      assertSame(long1, long0);
  }
}
