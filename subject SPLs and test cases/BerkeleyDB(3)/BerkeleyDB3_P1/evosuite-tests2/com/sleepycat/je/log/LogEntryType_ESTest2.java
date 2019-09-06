/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:59:32 KST 2017
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

import com.sleepycat.je.log.entry.LNLogEntry;
import com.sleepycat.je.log.entry.SingleItemLogEntry;
import com.sleepycat.je.tree.DupCountLN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LogEntryType_ESTest2 extends LogEntryType_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_IN;
      byte byte0 = logEntryType0.getVersion();
      assertEquals((byte)2, byte0);
  }

  @Test
  public void test01()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte)85, (byte) (-91));
      byte byte0 = logEntryType0.getVersion();
      assertEquals((byte) (-91), byte0);
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test02()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte) (-42), (byte)107);
      byte byte0 = logEntryType0.getTypeNum();
      assertEquals((byte) (-42), byte0);
  }

  @Test
  public void test03()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte) (-51), (byte) (-51));
      logEntryType0.getSharedLogEntry();
      assertTrue(logEntryType0.isNodeType());
  }

  @Test
  public void test04()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte)26, (byte)26);
      assertNotNull(logEntryType0);
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test05()  throws Throwable  {
      byte byte0 = LogEntryType.clearProvisional((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test06()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_ROOT;
      LogEntryType logEntryType1 = new LogEntryType((byte)0, (byte)11);
      boolean boolean0 = logEntryType1.equals(logEntryType0);
      assertFalse(logEntryType0.equals((Object)logEntryType1));
      assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_ROOT;
      boolean boolean0 = logEntryType0.equalsType((byte) (-1));
      assertFalse(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      boolean boolean0 = LogEntryType.isValidType((byte) (-65));
      assertFalse(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte)10, (byte)124);
      assertTrue(logEntryType0.isNodeType());
  }

  @Test
  public void test10()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte) (-48), (byte)32);
      assertNull(logEntryType0);
  }

  @Test
  public void test11()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DBIN;
      boolean boolean0 = logEntryType0.isNodeType();
      assertTrue(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte) (-42), (byte)107);
      boolean boolean0 = logEntryType0.equalsType((byte) (-8), (byte) (-8));
      assertFalse(boolean0);
      assertTrue(logEntryType0.isNodeType());
  }

  @Test
  public void test13()  throws Throwable  {
      boolean boolean0 = LogEntryType.isNodeType((byte) (-1), (byte)27);
      assertTrue(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte) (-107), (byte) (-107));
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

  @Test
  public void test15()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_FILE_HEADER;
      logEntryType0.hashCode();
  }

  @Test
  public void test16()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_FILE_HEADER;
      boolean boolean0 = logEntryType0.equals("FileHeader/0");
      assertFalse(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_TXN_PREPARE;
      boolean boolean0 = logEntryType0.equals(logEntryType0);
      assertTrue(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_ROOT;
      LogEntryType logEntryType1 = LogEntryType.LOG_DUP_BIN_DELTA;
      boolean boolean0 = logEntryType1.equals(logEntryType0);
      assertFalse(boolean0);
      assertFalse(logEntryType0.equals((Object)logEntryType1));
  }

  @Test
  public void test19()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_TXN_PREPARE;
      boolean boolean0 = logEntryType0.equalsType((byte)27);
      assertTrue(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_ROOT;
      boolean boolean0 = logEntryType0.equalsType((byte)96);
      assertFalse(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DBIN;
      boolean boolean0 = logEntryType0.equalsType((byte)15, (byte)15);
      assertTrue(boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_ROOT;
      boolean boolean0 = logEntryType0.equalsType((byte) (-120), (byte)0);
      assertFalse(boolean0);
  }

  @Test
  public void test23()  throws Throwable  {
      boolean boolean0 = LogEntryType.isValidType((byte)11);
      assertTrue(boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      boolean boolean0 = LogEntryType.isValidType((byte)123);
      assertFalse(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      boolean boolean0 = LogEntryType.isValidType((byte)0);
      assertFalse(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      boolean boolean0 = LogEntryType.isProvisional((byte) (-60));
      assertTrue(boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      boolean boolean0 = LogEntryType.isProvisional((byte)0);
      assertFalse(boolean0);
  }

  @Test
  public void test28()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte)106, (byte)106);
      assertNull(logEntryType0);
  }

  @Test
  public void test29()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte)12, (byte)12);
      assertTrue(logEntryType0.isNodeType());
  }

  @Test
  public void test30()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte)0, (byte) (-128));
      assertNull(logEntryType0);
  }

  @Test
  public void test31()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      LogEntryType logEntryType0 = dupCountLN0.getLogType();
      boolean boolean0 = logEntryType0.isNodeType();
      assertTrue(boolean0);
  }

  @Test
  public void test32()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_FILE_HEADER;
      boolean boolean0 = logEntryType0.isNodeType();
      assertFalse(boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      boolean boolean0 = LogEntryType.isNodeType((byte)15, (byte) (-128));
      assertTrue(boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
      boolean boolean0 = LogEntryType.isNodeType((byte)83, (byte) (-113));
      assertFalse(boolean0);
  }

  @Test
  public void test35()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_FILE_HEADER;
      byte byte0 = logEntryType0.getVersion();
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test36()  throws Throwable  {
      byte byte0 = LogEntryType.setProvisional((byte) (-1));
      assertEquals((byte) (-1), byte0);
  }

  @Test
  public void test37()  throws Throwable  {
      Set set0 = LogEntryType.getAllTypes();
      assertEquals(27, set0.size());
  }

  @Test
  public void test38()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_ROOT;
      String string0 = logEntryType0.toString();
      assertEquals("Root/1", string0);
  }

  @Test
  public void test39()  throws Throwable  {
      byte byte0 = LogEntryType.clearProvisional((byte) (-32));
      assertEquals((byte)96, byte0);
  }

  @Test
  public void test40()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      LogEntryType logEntryType0 = dupCountLN0.getLogType();
      LNLogEntry lNLogEntry0 = (LNLogEntry)logEntryType0.getSharedLogEntry();
      assertFalse(lNLogEntry0.getAbortKnownDeleted());
  }

  @Test
  public void test41()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      LogEntryType logEntryType0 = dupCountLN0.getLogType();
      byte byte0 = logEntryType0.getTypeNum();
      assertEquals((byte)10, byte0);
  }

  @Test
  public void test42()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_FILE_HEADER;
      SingleItemLogEntry singleItemLogEntry0 = (SingleItemLogEntry)logEntryType0.getNewLogEntry();
      assertNotNull(singleItemLogEntry0);
  }

  @Test
  public void test43()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte)0, (byte)0);
      byte byte0 = logEntryType0.getTypeNum();
      assertEquals((byte)0, byte0);
  }
}
