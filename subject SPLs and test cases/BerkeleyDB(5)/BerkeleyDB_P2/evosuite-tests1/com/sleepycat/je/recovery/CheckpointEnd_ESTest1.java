/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:09:20 KST 2017
 */

package com.sleepycat.je.recovery;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.log.LogEntryType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class CheckpointEnd_ESTest1 extends CheckpointEnd_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd((String) null, (long) (byte)0, (long) 10, 18L, (long) 10, (int) (byte)0, 18L, (long) (byte)0);
      long long0 = checkpointEnd0.getRootLsn();
      assertEquals(10L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      long long0 = checkpointEnd0.getRootLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test02()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      long long0 = checkpointEnd0.getLastTxnId();
      assertEquals(0L, long0);
  }

  @Test
  public void test03()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("pi za", (-1L), (-643L), (-643L), (-1L), 57, (-643L), (long) 57);
      long long0 = checkpointEnd0.getLastTxnId();
      assertEquals((-643L), long0);
  }

  @Test
  public void test04()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 16L, 16L, 16L, 0L, 8, 16L, (long) 8);
      long long0 = checkpointEnd0.getLastNodeId();
      assertEquals(0L, long0);
  }

  @Test
  public void test05()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd(" lastTxnId=", 1281L, 0L, 1281L, 1281L, 1737, (long) 1737, (-895L));
      long long0 = checkpointEnd0.getLastNodeId();
      assertEquals(1281L, long0);
  }

  @Test
  public void test06()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      int int0 = checkpointEnd0.getLastDbId();
      assertEquals(0, int0);
  }

  @Test
  public void test07()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 16L, 16L, 16L, 0L, 8, 16L, (long) 8);
      int int0 = checkpointEnd0.getLastDbId();
      assertEquals(8, int0);
  }

  @Test
  public void test08()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      long long0 = checkpointEnd0.getId();
      assertEquals(0L, long0);
  }

  @Test
  public void test09()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("?|6", 23L, 23L, 23L, 23L, 0, 23L, 23L);
      long long0 = checkpointEnd0.getId();
      assertEquals(23L, long0);
  }

  @Test
  public void test10()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 16L, 16L, 16L, 0L, 8, 16L, (long) 8);
      long long0 = checkpointEnd0.getFirstActiveLsn();
      assertEquals(16L, long0);
  }

  @Test
  public void test11()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      long long0 = checkpointEnd0.getFirstActiveLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test12()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 16L, 16L, 16L, 0L, 8, 16L, (long) 8);
      long long0 = checkpointEnd0.getCheckpointStartLsn();
      assertEquals(16L, long0);
  }

  @Test
  public void test13()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      long long0 = checkpointEnd0.getCheckpointStartLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test14()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", (-1L), (-1L), (-1L), (-1L), 835, (long) 835, (long) 835);
      ByteBuffer byteBuffer0 = null;
      // Undeclared exception!
      try { 
        checkpointEnd0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", (-1L), (-1L), (-1L), (-1L), 835, (long) 835, (long) 835);
      // Undeclared exception!
      try { 
        checkpointEnd0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("?|6", 23L, 23L, 23L, 23L, 0, 23L, 23L);
      // Undeclared exception!
      try { 
        checkpointEnd0.readFromLog((ByteBuffer) null, (byte) (-105));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      // Undeclared exception!
      try { 
        checkpointEnd0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 0L, 3230L, 3230L, 3230L, (-1218), 0L, (long) (-1218));
      // Undeclared exception!
      try { 
        checkpointEnd0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.CheckpointEnd", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("?%ph2L:d", 76L, 76L, 76L, 76L, 0, 76L, 76L);
      String string0 = checkpointEnd0.toString();
      //  // Unstable assertion: assertEquals("time=2017-04-21 20:09:01.718 lastNodeId=76 lastDbId=0 lastTxnId=76 id=76 rootExists=true ckptStartLsn=0x0/0x4c root=0x0/0x4c firstActive=0x0/0x4c", string0);
  }

  @Test
  public void test20()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("?%ph2L:d", 76L, 76L, 76L, 76L, 0, 76L, 76L);
      int int0 = checkpointEnd0.getLogSize();
      assertEquals(73, int0);
  }

  @Test
  public void test21()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", (-1L), (-1L), (-1L), (-1L), 835, (long) 835, (long) 835);
      int int0 = checkpointEnd0.getLogSize();
      assertEquals(57, int0);
  }

  @Test
  public void test22()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("Oz_~p[<", 1034L, (-1L), (-1L), (-1L), 65537, (-1L), 0L);
      String string0 = checkpointEnd0.toString();
      //  // Unstable assertion: assertEquals("time=2017-04-21 20:09:00.623 lastNodeId=-1 lastDbId=65537 lastTxnId=-1 id=0 rootExists=false ckptStartLsn=0x0/0x40a firstActive=0x0/0x40a", string0);
  }

  @Test
  public void test23()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd(";3=#^H", 1L, (long) (-575), 1L, (long) (-575), (-575), 1L, 1L);
      int int0 = checkpointEnd0.getLastDbId();
      assertEquals((-575), int0);
  }

  @Test
  public void test24()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 0L, 3230L, 3230L, 3230L, (-1218), 0L, (long) (-1218));
      boolean boolean0 = checkpointEnd0.logEntryIsTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("?%ph2L:d", 76L, 76L, 76L, 76L, 0, 76L, 76L);
      long long0 = checkpointEnd0.getLastTxnId();
      assertEquals(76L, long0);
  }

  @Test
  public void test26()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 0L, 3230L, 3230L, 3230L, (-1218), 0L, (long) (-1218));
      long long0 = checkpointEnd0.getCheckpointStartLsn();
      assertEquals(0L, long0);
  }

  @Test
  public void test27()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd((String) null, (long) (byte)120, (long) (byte) (-31), 1L, (-369L), (int) (byte) (-11), 4294967295L, (-369L));
      long long0 = checkpointEnd0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test28()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("o\fZ+|LL@:,1l,/<", 0L, 0L, 0L, 3132L, 0, 0L, (-1908L));
      long long0 = checkpointEnd0.getRootLsn();
      assertEquals(0L, long0);
  }

  @Test
  public void test29()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("Wauy!9*_5Q", 0L, 0L, (-552L), 0L, 0, (-468L), (-2302L));
      long long0 = checkpointEnd0.getId();
      assertEquals((-2302L), long0);
  }

  @Test
  public void test30()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      LogEntryType logEntryType0 = checkpointEnd0.getLogType();
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test31()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 0L, (-188L), 0L, 596L, 11, 596L, 3726L);
      long long0 = checkpointEnd0.getFirstActiveLsn();
      assertEquals(0L, long0);
  }

  @Test
  public void test32()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("?%ph2L:d", 76L, 76L, 76L, 76L, 0, 76L, 76L);
      boolean boolean0 = checkpointEnd0.marshallOutsideWriteLatch();
      assertTrue(boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("?%ph2L:d", 76L, 76L, 76L, 76L, 0, 76L, 76L);
      boolean boolean0 = checkpointEnd0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("Wauy!9*_5Q", 0L, 0L, (-552L), 0L, 0, (-468L), (-2302L));
      checkpointEnd0.postLogWork((-2302L));
      assertFalse(checkpointEnd0.countAsObsoleteWhenLogged());
  }

  @Test
  public void test35()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd((String) null, (long) (byte)120, (long) (byte) (-31), 1L, (-369L), (int) (byte) (-11), 4294967295L, (-369L));
      long long0 = checkpointEnd0.getLastNodeId();
      assertEquals((-369L), long0);
  }
}
