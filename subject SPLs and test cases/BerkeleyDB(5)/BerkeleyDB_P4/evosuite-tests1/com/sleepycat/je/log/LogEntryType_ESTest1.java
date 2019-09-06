/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:49:07 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Set;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.log.entry.INLogEntry;
import com.sleepycat.je.log.entry.SingleItemLogEntry;
import com.sleepycat.je.tree.DIN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LogEntryType_ESTest1 extends LogEntryType_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DBIN;
      byte byte0 = logEntryType0.getVersion();
      assertEquals((byte)2, byte0);
  }

  @Test
  public void test01()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte)58, (byte) (-3));
      byte byte0 = logEntryType0.getVersion();
      assertFalse(logEntryType0.isNodeType());
      assertEquals((byte) (-3), byte0);
  }

  @Test
  public void test02()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte)0, (byte)0);
      byte byte0 = logEntryType0.getTypeNum();
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test03()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte) (-128), (byte)0);
      byte byte0 = logEntryType0.getTypeNum();
      assertEquals((byte) (-128), byte0);
  }

  @Test
  public void test04()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte) (-118), (byte) (-111));
      logEntryType0.getSharedLogEntry();
      assertTrue(logEntryType0.isNodeType());
  }

  @Test
  public void test05()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte)2, (byte)25);
      assertTrue(logEntryType0.isNodeType());
  }

  @Test
  public void test06()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte)16, (byte)102);
      assertNotNull(logEntryType0);
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test07()  throws Throwable  {
      byte byte0 = LogEntryType.clearProvisional((byte)15);
      assertEquals((byte)15, byte0);
  }

  @Test
  public void test08()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_BIN;
      boolean boolean0 = logEntryType0.equalsType((byte)81);
      assertFalse(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_BIN;
      boolean boolean0 = logEntryType0.equalsType((byte)15, (byte)0);
      assertFalse(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      boolean boolean0 = LogEntryType.isValidType((byte)27);
      assertTrue(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      boolean boolean0 = LogEntryType.isValidType((byte) (-30));
      assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      byte byte0 = LogEntryType.setProvisional((byte) (-30));
      assertEquals((byte) (-30), byte0);
  }

  @Test
  public void test13()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte)27, (byte)2);
      assertFalse(logEntryType0.isNodeType());
      assertNotNull(logEntryType0);
  }

  @Test
  public void test14()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte) (-84), (byte) (-84));
      assertNull(logEntryType0);
  }

  @Test
  public void test15()  throws Throwable  {
      DIN dIN0 = new DIN();
      LogEntryType logEntryType0 = dIN0.getLogType();
      boolean boolean0 = logEntryType0.isNodeType();
      assertTrue(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      boolean boolean0 = LogEntryType.isNodeType((byte)15, (byte) (-1));
      assertTrue(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DBIN;
      logEntryType0.hashCode();
  }

  @Test
  public void test18()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_BIN;
      LogEntryType logEntryType1 = LogEntryType.LOG_CKPT_START;
      boolean boolean0 = logEntryType0.equals(logEntryType1);
      assertFalse(logEntryType1.equals((Object)logEntryType0));
      assertFalse(boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_BIN_DELTA;
      boolean boolean0 = logEntryType0.equals(logEntryType0);
      assertTrue(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_TXN_ABORT;
      Set set0 = LogEntryType.getAllTypes();
      boolean boolean0 = logEntryType0.equals(set0);
      assertEquals(27, set0.size());
      assertFalse(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_TXN_ABORT;
      boolean boolean0 = logEntryType0.equalsType((byte)18);
      assertTrue(boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      DIN dIN0 = new DIN();
      LogEntryType logEntryType0 = dIN0.getLogType();
      boolean boolean0 = logEntryType0.equalsType((byte)0);
      assertFalse(boolean0);
  }

  @Test
  public void test23()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte)7, (byte)7);
      boolean boolean0 = logEntryType0.equalsType((byte)7, (byte) (-1));
      assertTrue(boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DBIN;
      boolean boolean0 = logEntryType0.equalsType((byte)2, (byte)0);
      assertFalse(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      boolean boolean0 = LogEntryType.isValidType((byte)58);
      assertFalse(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      boolean boolean0 = LogEntryType.isValidType((byte)18);
      assertTrue(boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      boolean boolean0 = LogEntryType.isValidType((byte)0);
      assertFalse(boolean0);
  }

  @Test
  public void test28()  throws Throwable  {
      boolean boolean0 = LogEntryType.isProvisional((byte) (-1));
      assertTrue(boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      boolean boolean0 = LogEntryType.isProvisional((byte)18);
      assertFalse(boolean0);
  }

  @Test
  public void test30()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte)48, (byte)0);
      assertNull(logEntryType0);
  }

  @Test
  public void test31()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte)0, (byte) (-35));
      assertNull(logEntryType0);
  }

  @Test
  public void test32()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DBIN;
      boolean boolean0 = logEntryType0.isNodeType();
      assertTrue(boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_IN_DELETE_INFO;
      boolean boolean0 = logEntryType0.isNodeType();
      assertFalse(boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
      boolean boolean0 = LogEntryType.isNodeType((byte)2, (byte)27);
      assertTrue(boolean0);
  }

  @Test
  public void test35()  throws Throwable  {
      boolean boolean0 = LogEntryType.isNodeType((byte)48, (byte)18);
      assertFalse(boolean0);
  }

  @Test
  public void test36()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_TXN_ABORT;
      byte byte0 = logEntryType0.getVersion();
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test37()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_TXN_ABORT;
      String string0 = logEntryType0.toString();
      assertEquals("Abort/0", string0);
  }

  @Test
  public void test38()  throws Throwable  {
      byte byte0 = LogEntryType.clearProvisional((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test39()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DBIN;
      INLogEntry iNLogEntry0 = (INLogEntry)logEntryType0.getSharedLogEntry();
      assertFalse(iNLogEntry0.countAsObsoleteWhenLogged());
  }

  @Test
  public void test40()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_TXN_ABORT;
      byte byte0 = logEntryType0.getTypeNum();
      assertEquals((byte)18, byte0);
  }

  @Test
  public void test41()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_TXN_ABORT;
      SingleItemLogEntry singleItemLogEntry0 = (SingleItemLogEntry)logEntryType0.getNewLogEntry();
      assertNotNull(singleItemLogEntry0);
  }

  @Test
  public void test42()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte) (-128), (byte)0);
      // Undeclared exception!
      try { 
        logEntryType0.getNewLogEntry();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogEntryType", e);
      }
  }
}
