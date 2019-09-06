/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:17:12 KST 2017
 */

package com.sleepycat.je.txn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class WriteLockInfo_ESTest1 extends WriteLockInfo_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      assertEquals((-1L), writeLockInfo0.getAbortLsn());
      
      writeLockInfo0.abortLsn = 0L;
      writeLockInfo0.getAbortLsn();
      assertTrue(writeLockInfo0.getAbortKnownDeleted());
  }

  @Test
  public void test1()  throws Throwable  {
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      writeLockInfo0.abortLsn = 9223372036854775807L;
      long long0 = writeLockInfo0.getAbortLsn();
      assertEquals(9223372036854775807L, long0);
  }

  @Test
  public void test2()  throws Throwable  {
      Long long0 = new Long(0L);
      Lock lock0 = new Lock(long0);
      WriteLockInfo writeLockInfo0 = new WriteLockInfo(lock0);
      boolean boolean0 = writeLockInfo0.getAbortKnownDeleted();
      assertFalse(boolean0);
      assertEquals((-1L), writeLockInfo0.getAbortLsn());
  }

  @Test
  public void test3()  throws Throwable  {
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      boolean boolean0 = writeLockInfo0.getAbortKnownDeleted();
      assertTrue(boolean0);
      assertEquals((-1L), writeLockInfo0.getAbortLsn());
  }

  @Test
  public void test4()  throws Throwable  {
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      long long0 = writeLockInfo0.getAbortLsn();
      assertTrue(writeLockInfo0.getAbortKnownDeleted());
      assertEquals((-1L), long0);
  }
}