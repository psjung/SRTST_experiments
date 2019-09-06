/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:05:27 KST 2017
 */

package com.sleepycat.je.txn;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.txn.LockInfo;
import com.sleepycat.je.txn.LockType;
import com.sleepycat.je.txn.Locker;
import com.sleepycat.je.txn.Txn;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LockInfo_ESTest1 extends LockInfo_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      Txn txn0 = new Txn();
      LockInfo lockInfo0 = new LockInfo((Locker) txn0, (LockType) null);
      Txn txn1 = (Txn)lockInfo0.getLocker();
      assertEquals(0L, txn1.getLockTimeout());
  }

  @Test
  public void test01()  throws Throwable  {
      Txn txn0 = new Txn();
      LockInfo lockInfo0 = new LockInfo((Locker) txn0, (LockType) null);
      LockType lockType0 = lockInfo0.getLockType();
      assertNull(lockType0);
  }

  @Test
  public void test02()  throws Throwable  {
      LockType lockType0 = LockType.RESTART;
      LockInfo lockInfo0 = new LockInfo((Locker) null, lockType0);
      LockType lockType1 = lockInfo0.getLockType();
      assertEquals("RESTART", lockType1.toString());
  }

  @Test
  public void test05()  throws Throwable  {
      LockType lockType0 = LockType.RANGE_WRITE;
      LockInfo lockInfo0 = new LockInfo((Locker) null, lockType0);
      Locker locker0 = lockInfo0.getLocker();
      assertNull(locker0);
  }

  @Test
  public void test09()  throws Throwable  {
      LockInfo.setDeadlockStackTrace(false);
  }

  @Test
  public void test11()  throws Throwable  {
      LockType lockType0 = LockType.RANGE_WRITE;
      LockInfo lockInfo0 = new LockInfo((Locker) null, lockType0);
      LockType lockType1 = lockInfo0.getLockType();
      assertSame(lockType1, lockType0);
  }
}
