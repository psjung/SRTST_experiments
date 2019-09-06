/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:24:49 KST 2017
 */

package com.sleepycat.je.log.entry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.log.entry.LNLogEntry;
import com.sleepycat.je.tree.FileSummaryLN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.NameLN;
import com.sleepycat.je.txn.Txn;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LNLogEntry_ESTest4 extends LNLogEntry_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LogEntryType logEntryType0 = nameLN0.getLogType();
      byte[] byteArray0 = new byte[2];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, 3222L, false, txn0);
      lNLogEntry0.marshallOutsideWriteLatch();
      //  // Unstable assertion: assertEquals(251L, lNLogEntry0.getNodeId());
  }

  @Test
  public void test01()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, true);
      boolean boolean0 = lNLogEntry0.isTransactional();
      assertTrue(boolean0);
      assertEquals((-1L), lNLogEntry0.getAbortLsn());
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LogEntryType logEntryType0 = nameLN0.getLogType();
      byte[] byteArray0 = new byte[2];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, 3222L, false, txn0);
      lNLogEntry0.postLogWork(17L);
      lNLogEntry0.getUserTxn();
      //  // Unstable assertion: assertEquals(238L, lNLogEntry0.getNodeId());
  }

  @Test
  public void test03()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LogEntryType logEntryType0 = nameLN0.getLogType();
      byte[] byteArray0 = new byte[2];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, 3222L, false, txn0);
      lNLogEntry0.getTxnId();
      //  // Unstable assertion: assertEquals(228L, lNLogEntry0.getNodeId());
  }

  @Test
  public void test04()  throws Throwable  {
      Class<Object> class0 = Object.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      lNLogEntry0.getNodeId();
      assertEquals((-1L), lNLogEntry0.getAbortLsn());
  }

  @Test
  public void test05()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      lNLogEntry0.getMainItem();
      assertEquals((-1L), lNLogEntry0.getAbortLsn());
  }

  @Test
  public void test06()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      lNLogEntry0.getLogType();
      assertEquals((-1L), lNLogEntry0.getAbortLsn());
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LogEntryType logEntryType0 = nameLN0.getLogType();
      byte[] byteArray0 = new byte[2];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, 3222L, false, txn0);
      lNLogEntry0.getLogType();
      //  // Unstable assertion: assertEquals(219L, lNLogEntry0.getNodeId());
  }

  @Test
  public void test08()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, true);
      lNLogEntry0.getLN();
      assertTrue(lNLogEntry0.isTransactional());
      assertEquals((-1L), lNLogEntry0.getAbortLsn());
  }

  @Test
  public void test09()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LogEntryType logEntryType0 = nameLN0.getLogType();
      byte[] byteArray0 = new byte[2];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, 3222L, false, txn0);
      NameLN nameLN1 = (NameLN)lNLogEntry0.getLN();
      //  // Unstable assertion: assertEquals(210L, nameLN1.getLastId());
  }

  @Test
  public void test10()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      lNLogEntry0.getKey();
      assertEquals((-1L), lNLogEntry0.getAbortLsn());
  }

  @Test
  public void test11()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      lNLogEntry0.getDbId();
      assertEquals((-1L), lNLogEntry0.getAbortLsn());
  }

  @Test
  public void test12()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DUP_BIN_DELTA;
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      byte[] byteArray0 = new byte[5];
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) fileSummaryLN0, (DatabaseId) null, byteArray0, (long) (byte)0, false, (Txn) null);
      lNLogEntry0.getAbortLsn();
      assertFalse(lNLogEntry0.getAbortKnownDeleted());
  }

  @Test
  public void test13()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, true);
      long long0 = lNLogEntry0.getAbortLsn();
      assertEquals((-1L), long0);
      assertTrue(lNLogEntry0.isTransactional());
  }

  @Test
  public void test14()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DUP_BIN_DELTA;
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      byte[] byteArray0 = new byte[5];
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) fileSummaryLN0, (DatabaseId) null, byteArray0, (long) (byte)0, false, (Txn) null);
      lNLogEntry0.countAsObsoleteWhenLogged();
      assertFalse(lNLogEntry0.getAbortKnownDeleted());
  }

  @Test
  public void test15()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("\nWaiters: ");
      // Undeclared exception!
      try { 
        lNLogEntry0.readEntry(byteBuffer0, 930, (byte)0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LogEntryType logEntryType0 = nameLN0.getLogType();
      byte[] byteArray0 = new byte[2];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, 3222L, false, txn0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("=u)!=");
      // Undeclared exception!
      try { 
        lNLogEntry0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LogEntryType logEntryType0 = nameLN0.getLogType();
      byte[] byteArray0 = new byte[1];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, 3222L, false, txn0);
      // Undeclared exception!
      try { 
        lNLogEntry0.writeToLog((ByteBuffer) null);
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
      Class<LN> class0 = LN.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      // Undeclared exception!
      try { 
        lNLogEntry0.readEntry((ByteBuffer) null, 65535, (byte)0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Class<Object> class0 = Object.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, true);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("\"/>");
      // Undeclared exception!
      try { 
        lNLogEntry0.readEntry(byteBuffer0, 0, (byte)16, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to com.sleepycat.je.tree.LN
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, true);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      try { 
        lNLogEntry0.readEntry(byteBuffer0, (-2054), (byte) (-76), true);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.lang.InstantiationException: java.lang.Integer
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      Class<Object> class0 = Object.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, true);
      // Undeclared exception!
      try { 
        lNLogEntry0.postLogWork(1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      Class<String> class0 = String.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      // Undeclared exception!
      try { 
        lNLogEntry0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      // Undeclared exception!
      try { 
        lNLogEntry0.getDupKey();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, true);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        lNLogEntry0.dumpEntry(stringBuffer0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      Class<LN> class0 = LN.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, true);
      // Undeclared exception!
      try { 
        lNLogEntry0.countAsObsoleteWhenLogged();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_MAPLN_TRANSACTIONAL;
      DatabaseId databaseId0 = new DatabaseId(4084);
      byte[] byteArray0 = new byte[0];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = null;
      try {
        lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) null, databaseId0, byteArray0, (long) 4084, true, txn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LogEntryType logEntryType0 = nameLN0.getLogType();
      byte[] byteArray0 = new byte[2];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, 3222L, false, txn0);
      lNLogEntry0.getUserTxn();
      //  // Unstable assertion: assertEquals(181L, lNLogEntry0.getNodeId());
  }

  @Test
  public void test28()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      lNLogEntry0.getUserTxn();
      assertEquals((-1L), lNLogEntry0.getAbortLsn());
  }

  @Test
  public void test29()  throws Throwable  {
      Class<String> class0 = String.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, true);
      // Undeclared exception!
      try { 
        lNLogEntry0.getTxnId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      lNLogEntry0.getTxnId();
      assertEquals((-1L), lNLogEntry0.getAbortLsn());
  }

  @Test
  public void test31()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_MAPLN;
      LN lN0 = new LN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[9];
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, lN0, databaseId0, byteArray0, (-199L), false, (Txn) null);
      lNLogEntry0.getDupKey();
      assertFalse(lNLogEntry0.getAbortKnownDeleted());
      assertEquals((-199L), lNLogEntry0.getAbortLsn());
  }

  @Test
  public void test32()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((int) (byte) (-64));
      NameLN nameLN0 = new NameLN(databaseId0);
      byte[] byteArray0 = new byte[4];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry((LogEntryType) null, (LN) nameLN0, databaseId0, byteArray0, (long) (byte) (-64), false, txn0);
      lNLogEntry0.getDupKey();
      //  // Unstable assertion: assertEquals(171L, lNLogEntry0.getNodeId());
  }

  @Test
  public void test33()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((int) (byte) (-64));
      NameLN nameLN0 = new NameLN(databaseId0);
      byte[] byteArray0 = new byte[4];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry((LogEntryType) null, (LN) nameLN0, databaseId0, byteArray0, (long) (byte) (-64), false, txn0);
      int int0 = lNLogEntry0.getLogSize();
      //  // Unstable assertion: assertEquals(136L, lNLogEntry0.getNodeId());
      //  // Unstable assertion: assertEquals(55, int0);
  }

  @Test
  public void test34()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_MAPLN;
      LN lN0 = new LN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[9];
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, lN0, databaseId0, byteArray0, (-199L), false, (Txn) null);
      int int0 = lNLogEntry0.getLogSize();
      assertEquals(26, int0);
      assertEquals((-199L), lNLogEntry0.getAbortLsn());
      assertFalse(lNLogEntry0.getAbortKnownDeleted());
  }

  @Test
  public void test35()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      lNLogEntry0.postLogWork((-1645L));
      assertEquals((-1L), lNLogEntry0.getAbortLsn());
  }

  @Test
  public void test36()  throws Throwable  {
      Class<String> class0 = String.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, true);
      // Undeclared exception!
      try { 
        lNLogEntry0.getTransactionId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      assertFalse(lNLogEntry0.isTransactional());
      
      long long0 = lNLogEntry0.getTransactionId();
      assertEquals((-1L), lNLogEntry0.getAbortLsn());
      assertEquals(0L, long0);
  }

  @Test
  public void test38()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LogEntryType logEntryType0 = nameLN0.getLogType();
      byte[] byteArray0 = new byte[2];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, 3222L, false, txn0);
      StringWriter stringWriter0 = new StringWriter(1);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      lNLogEntry0.dumpEntry(stringBuffer0, true);
      //  // Unstable assertion: assertEquals(318, stringBuffer0.capacity());
      //  // Unstable assertion: assertEquals(103L, nameLN0.getNodeId());
  }

  @Test
  public void test39()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((int) (byte) (-64));
      NameLN nameLN0 = new NameLN(databaseId0);
      byte[] byteArray0 = new byte[4];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry((LogEntryType) null, (LN) nameLN0, databaseId0, byteArray0, (long) (byte) (-64), false, txn0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      lNLogEntry0.dumpEntry(stringBuffer0, false);
      //  // Unstable assertion: assertEquals(286, stringBuffer0.capacity());
      //  // Unstable assertion: assertEquals(70L, nameLN0.getLastId());
  }

  @Test
  public void test40()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_MAPLN;
      LN lN0 = new LN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[9];
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, lN0, databaseId0, byteArray0, (-199L), false, (Txn) null);
      StringWriter stringWriter0 = new StringWriter(293);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      lNLogEntry0.dumpEntry(stringBuffer0, false);
      assertEquals("<ln><node>0</node></ln><dbId id=\"0\"/><key v=\"0 0 0 0 0 0 0 0 0 \"/>", stringBuffer0.toString());
      assertEquals((-199L), lNLogEntry0.getAbortLsn());
  }

  @Test
  public void test41()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_IN_DELETE_INFO;
      NameLN nameLN0 = new NameLN();
      byte[] byteArray0 = new byte[5];
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, (DatabaseId) null, byteArray0, 3558L, true, (Txn) null);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        lNLogEntry0.readEntry(byteBuffer0, (byte) (-115), (byte) (-113), true);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<^t<>ZgXei2fHXx;");
      lNLogEntry0.readEntry(byteBuffer0, 1, (byte)0, false);
      assertEquals("java.nio.HeapByteBuffer[pos=1 lim=16 cap=32]", byteBuffer0.toString());
      assertEquals(1, byteBuffer0.position());
  }

  @Test
  public void test43()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LogEntryType logEntryType0 = nameLN0.getLogType();
      byte[] byteArray0 = new byte[2];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, 3222L, false, txn0);
      boolean boolean0 = lNLogEntry0.getAbortKnownDeleted();
      //  // Unstable assertion: assertEquals(59L, lNLogEntry0.getNodeId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test44()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_MAPLN;
      LN lN0 = new LN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[9];
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, lN0, databaseId0, byteArray0, (-199L), false, (Txn) null);
      lNLogEntry0.getKey();
      assertFalse(lNLogEntry0.isTransactional());
      assertFalse(lNLogEntry0.getAbortKnownDeleted());
      assertEquals((-199L), lNLogEntry0.getAbortLsn());
  }

  @Test
  public void test45()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LogEntryType logEntryType0 = nameLN0.getLogType();
      byte[] byteArray0 = new byte[2];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, 3222L, false, txn0);
      lNLogEntry0.countAsObsoleteWhenLogged();
      //  // Unstable assertion: assertEquals(49L, lNLogEntry0.getNodeId());
  }

  @Test
  public void test46()  throws Throwable  {
      Class<Object> class0 = Object.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, true);
      // Undeclared exception!
      try { 
        lNLogEntry0.marshallOutsideWriteLatch();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test47()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LogEntryType logEntryType0 = nameLN0.getLogType();
      byte[] byteArray0 = new byte[2];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, 3222L, false, txn0);
      long long0 = lNLogEntry0.getAbortLsn();
      //  // Unstable assertion: assertEquals(38L, lNLogEntry0.getNodeId());
      //  // Unstable assertion: assertEquals(3222L, long0);
  }

  @Test
  public void test48()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((int) (byte) (-64));
      NameLN nameLN0 = new NameLN(databaseId0);
      byte[] byteArray0 = new byte[4];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry((LogEntryType) null, (LN) nameLN0, databaseId0, byteArray0, (long) (byte) (-64), false, txn0);
      LNLogEntry lNLogEntry1 = (LNLogEntry)lNLogEntry0.clone();
      //  // Unstable assertion: assertEquals(28L, lNLogEntry1.getNodeId());
  }

  @Test
  public void test49()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LogEntryType logEntryType0 = nameLN0.getLogType();
      byte[] byteArray0 = new byte[2];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, 3205L, false, txn0);
      NameLN nameLN1 = (NameLN)lNLogEntry0.getMainItem();
      //  // Unstable assertion: assertEquals(18L, nameLN1.getNodeId());
  }

  @Test
  public void test50()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_MAPLN;
      LN lN0 = new LN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[9];
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, lN0, databaseId0, byteArray0, (-199L), false, (Txn) null);
      lNLogEntry0.getLN();
      assertEquals((-199L), lNLogEntry0.getAbortLsn());
      assertFalse(lNLogEntry0.isTransactional());
      assertFalse(lNLogEntry0.getAbortKnownDeleted());
  }

  @Test
  public void test51()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_MAPLN;
      LN lN0 = new LN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[9];
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, lN0, databaseId0, byteArray0, (-199L), false, (Txn) null);
      lNLogEntry0.getDbId();
      assertEquals((-199L), lNLogEntry0.getAbortLsn());
      assertFalse(lNLogEntry0.getAbortKnownDeleted());
      assertFalse(lNLogEntry0.isTransactional());
  }

  @Test
  public void test52()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_MAPLN;
      LN lN0 = new LN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[9];
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, lN0, databaseId0, byteArray0, (-199L), false, (Txn) null);
      lNLogEntry0.getLogType();
      assertEquals((-199L), lNLogEntry0.getAbortLsn());
      assertFalse(lNLogEntry0.isTransactional());
      assertFalse(lNLogEntry0.getAbortKnownDeleted());
  }

  @Test
  public void test53()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LogEntryType logEntryType0 = nameLN0.getLogType();
      byte[] byteArray0 = new byte[2];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, 3205L, false, txn0);
      long long0 = lNLogEntry0.getNodeId();
      //  // Unstable assertion: assertEquals(1L, long0);
  }

  @Test
  public void test54()  throws Throwable  {
      Class<String> class0 = String.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      boolean boolean0 = lNLogEntry0.isTransactional();
      assertEquals((-1L), lNLogEntry0.getAbortLsn());
      assertFalse(boolean0);
  }
}