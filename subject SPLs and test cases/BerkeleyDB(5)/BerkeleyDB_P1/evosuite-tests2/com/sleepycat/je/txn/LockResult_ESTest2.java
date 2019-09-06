/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:18:23 KST 2017
 */

package com.sleepycat.je.txn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.MapLN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LockResult_ESTest2 extends LockResult_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      LockResult lockResult0 = new LockResult((LockGrantType) null, writeLockInfo0);
      LockGrantType lockGrantType0 = lockResult0.getLockGrant();
      assertNull(lockGrantType0);
  }

  @Test
  public void test1()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.NONE_NEEDED;
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      MapLN mapLN0 = new MapLN(databaseImpl0);
      lockResult0.setLN(mapLN0);
      MapLN mapLN1 = (MapLN)lockResult0.getLN();
      assertEquals(0L, mapLN1.getTransactionId());
  }

  @Test
  public void test2()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.WAIT_NEW;
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      lockResult0.setAbortLsn(443L, true);
      assertEquals(443L, writeLockInfo0.getAbortLsn());
  }

  @Test
  public void test3()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.EXISTING;
      Lock lock0 = new Lock();
      WriteLockInfo writeLockInfo0 = new WriteLockInfo(lock0);
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      lockResult0.setAbortLsn((-3002L), false);
      assertEquals((-3002L), writeLockInfo0.getAbortLsn());
      assertFalse(writeLockInfo0.getAbortKnownDeleted());
  }

  @Test
  public void test4()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.EXISTING;
      LockResult lockResult0 = new LockResult(lockGrantType0, (WriteLockInfo) null);
      lockResult0.setAbortLsn((-2845L), false, true);
  }

  @Test
  public void test5()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.NONE_NEEDED;
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      lockResult0.setAbortLsn((-1L), true);
      assertEquals((-1L), writeLockInfo0.getAbortLsn());
  }

  @Test
  public void test6()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.EXISTING;
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      lockResult0.setAbortLsn(0L, false, false);
      lockResult0.setAbortLsn(0L, false);
      assertEquals(0L, writeLockInfo0.getAbortLsn());
      assertFalse(writeLockInfo0.getAbortKnownDeleted());
  }

  @Test
  public void test7()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.EXISTING;
      LockResult lockResult0 = new LockResult(lockGrantType0, (WriteLockInfo) null);
      LockGrantType lockGrantType1 = lockResult0.getLockGrant();
      assertSame(lockGrantType1, lockGrantType0);
  }

  @Test
  public void test8()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.EXISTING;
      LockResult lockResult0 = new LockResult(lockGrantType0, (WriteLockInfo) null);
      LN lN0 = new LN();
      lockResult0.setLN(lN0);
      LN lN1 = lockResult0.getLN();
      assertFalse(lN1.containsDuplicates());
  }

  @Test
  public void test9()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.EXISTING;
      LockResult lockResult0 = new LockResult(lockGrantType0, (WriteLockInfo) null);
      LN lN0 = lockResult0.getLN();
      assertNull(lN0);
  }
}
