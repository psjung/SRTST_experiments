/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:36:59 KST 2017
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
public class CheckpointEnd_ESTest4 extends CheckpointEnd_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("ao*RRB}3gB'knny", (-4767L), 0L, (-24L), 0L, (-9), (-845L), 127L);
      long long0 = checkpointEnd0.getRootLsn();
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", (-1L), (-1L), (-1L), (-1L), 1086, (long) 1086, 0L);
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
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("NameLN_TX", (-2033L), (-2033L), 2812L, 2812L, 1543, 381L, 0L);
      long long0 = checkpointEnd0.getLastTxnId();
      assertEquals(381L, long0);
  }

  @Test
  public void test04()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      long long0 = checkpointEnd0.getLastNodeId();
      assertEquals(0L, long0);
  }

  @Test
  public void test05()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 0L, 1L, 147L, 147L, (-1486), (long) (-1486), 0L);
      long long0 = checkpointEnd0.getLastNodeId();
      assertEquals(147L, long0);
  }

  @Test
  public void test06()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("</ref>", (-1074L), (-1074L), (-1074L), (-1L), 666, 0L, 0L);
      int int0 = checkpointEnd0.getLastDbId();
      assertEquals(666, int0);
  }

  @Test
  public void test07()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 0L, 1L, 147L, 147L, (-1486), (long) (-1486), 0L);
      int int0 = checkpointEnd0.getLastDbId();
      assertEquals((-1486), int0);
  }

  @Test
  public void test08()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      long long0 = checkpointEnd0.getId();
      assertEquals(0L, long0);
  }

  @Test
  public void test09()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 475L, 475L, 475L, (-2530L), 787, 475L, 3127L);
      long long0 = checkpointEnd0.getId();
      assertEquals(3127L, long0);
  }

  @Test
  public void test10()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("65", 1L, 0L, 0L, 0L, 0, 0L, 0L);
      long long0 = checkpointEnd0.getFirstActiveLsn();
      assertEquals(0L, long0);
  }

  @Test
  public void test11()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", (-1L), (-1L), (-1L), (-1L), 1086, (long) 1086, 0L);
      long long0 = checkpointEnd0.getFirstActiveLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test12()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("`aJ;Ch0W[ogyHzf\"U", 0L, 0L, 0L, 0L, (-2913), 4006L, 0L);
      long long0 = checkpointEnd0.getCheckpointStartLsn();
      assertEquals(0L, long0);
  }

  @Test
  public void test13()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      long long0 = checkpointEnd0.getCheckpointStartLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test14()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 0L, 1L, 147L, 147L, (-1486), (long) (-1486), 0L);
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
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("e\n2nu7Mq", (-1L), (-1991L), (-1L), (-1991L), (-2143614307), (-4340L), (long) (-2143614307));
      // Undeclared exception!
      try { 
        checkpointEnd0.readFromLog((ByteBuffer) null, (byte) (-75));
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
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", (-1L), (-1L), (-1L), (-1L), 1086, (long) 1086, 0L);
      // Undeclared exception!
      try { 
        checkpointEnd0.dumpLog((StringBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.CheckpointEnd", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("`aJ;Ch0W[ogyHzf\"U", 0L, 0L, 0L, 0L, (-2913), 4006L, 0L);
      String string0 = checkpointEnd0.toString();
      //  // Unstable assertion: assertEquals("time=2017-04-22 15:36:37.294 lastNodeId=0 lastDbId=-2913 lastTxnId=4006 id=0 rootExists=true ckptStartLsn=0x0/0x0 root=0x0/0x0 firstActive=0x0/0x0", string0);
  }

  @Test
  public void test18()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      String string0 = checkpointEnd0.toString();
      assertEquals("time=null lastNodeId=0 lastDbId=0 lastTxnId=0 id=0 rootExists=false ckptStartLsn=0xffffffff/0xffffffff firstActive=0xffffffff/0xffffffff", string0);
  }

  @Test
  public void test19()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd(".:8<s]C%P^*{krI,;?4", 0L, 781L, 781L, 781L, 0, (-1271L), 1746L);
      int int0 = checkpointEnd0.getLogSize();
      assertEquals(84, int0);
  }

  @Test
  public void test20()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", (-1L), (-1L), (-1L), (-1L), 1086, (long) 1086, 0L);
      int int0 = checkpointEnd0.getLogSize();
      assertEquals(57, int0);
  }

  @Test
  public void test21()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd((String) null, (-2568L), (-2153L), (-1L), (-2568L), 983, (-1889L), (long) 983);
      assertFalse(checkpointEnd0.logEntryIsTransactional());
  }

  @Test
  public void test22()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      int int0 = checkpointEnd0.getLastDbId();
      assertEquals(0, int0);
  }

  @Test
  public void test23()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 0L, 1L, 147L, 147L, (-1486), (long) (-1486), 0L);
      boolean boolean0 = checkpointEnd0.logEntryIsTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("Nq+!.", (-1L), 1L, (-1144L), (-1L), (-1103), (-417L), 4106L);
      long long0 = checkpointEnd0.getLastTxnId();
      assertEquals((-417L), long0);
  }

  @Test
  public void test25()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd(" firstActive=", 1246L, 1246L, 4294967295L, 1246L, (-1625), 4987L, 4294967295L);
      long long0 = checkpointEnd0.getCheckpointStartLsn();
      assertEquals(1246L, long0);
  }

  @Test
  public void test26()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 0L, 1L, 147L, 147L, (-1486), (long) (-1486), 0L);
      long long0 = checkpointEnd0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test27()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("Nq+!.", (-1L), 1L, (-1144L), (-1L), (-1103), (-417L), 4106L);
      long long0 = checkpointEnd0.getRootLsn();
      assertEquals(1L, long0);
  }

  @Test
  public void test28()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("8", 194L, 194L, 194L, 194L, 4298, (long) 4298, (-1L));
      long long0 = checkpointEnd0.getId();
      assertEquals((-1L), long0);
  }

  @Test
  public void test29()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      LogEntryType logEntryType0 = checkpointEnd0.getLogType();
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test30()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd(".:8<s]C%P^*{krI,;?4", 0L, 781L, 781L, 781L, 0, (-1271L), 1746L);
      long long0 = checkpointEnd0.getFirstActiveLsn();
      assertEquals(781L, long0);
  }

  @Test
  public void test31()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 0L, 1L, 147L, 147L, (-1486), (long) (-1486), 0L);
      boolean boolean0 = checkpointEnd0.marshallOutsideWriteLatch();
      assertTrue(boolean0);
  }

  @Test
  public void test32()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("e\n2nu7Mq", (-1L), (-1991L), (-1L), (-1991L), (-2143614307), (-4340L), (long) (-2143614307));
      boolean boolean0 = checkpointEnd0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", (-1L), (-1L), (-1L), (-1L), 1086, (long) 1086, 0L);
      checkpointEnd0.postLogWork((-1L));
      assertFalse(checkpointEnd0.logEntryIsTransactional());
  }

  @Test
  public void test34()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("e\n2nu7Mq", (-1L), (-1991L), (-1L), (-1991L), (-2143614307), (-4340L), (long) (-2143614307));
      long long0 = checkpointEnd0.getLastNodeId();
      assertEquals((-1991L), long0);
  }
}
