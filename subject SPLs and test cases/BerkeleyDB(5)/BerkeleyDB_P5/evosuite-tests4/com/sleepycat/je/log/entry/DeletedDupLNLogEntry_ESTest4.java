/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:21:14 KST 2017
 */

package com.sleepycat.je.log.entry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.log.entry.DeletedDupLNLogEntry;
import com.sleepycat.je.tree.FileSummaryLN;
import com.sleepycat.je.tree.LN;
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
public class DeletedDupLNLogEntry_ESTest4 extends DeletedDupLNLogEntry_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(true);
      byte[] byteArray0 = deletedDupLNLogEntry0.getDupKey();
      assertNull(byteArray0);
  }

  @Test
  public void test01()  throws Throwable  {
      LN lN0 = new LN();
      DatabaseId databaseId0 = new DatabaseId((-355));
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = new byte[7];
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry((LogEntryType) null, lN0, databaseId0, byteArray0, byteArray1, 3361L, false, (Txn) null);
      assertTrue(deletedDupLNLogEntry0.marshallOutsideWriteLatch());
  }

  @Test
  public void test02()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(true);
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(false);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("\"ztxAIT#N9lO");
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.readEntry(byteBuffer0, 437, (byte)0, true);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(true);
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.readEntry((ByteBuffer) null, 0, (byte)0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(true);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("KgCe)Xr7mA8Yxfh3TAd");
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.readEntry(byteBuffer0, 167, (byte) (-17), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(false);
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(false);
      StringWriter stringWriter0 = new StringWriter(1112);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.dumpEntry(stringBuffer0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_FILESUMMARYLN;
      byte[] byteArray0 = new byte[3];
      Txn txn0 = new Txn();
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = null;
      try {
        deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(logEntryType0, (LN) null, (DatabaseId) null, byteArray0, byteArray0, (long) (byte)6, false, txn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_NAMELN;
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseId databaseId0 = new DatabaseId(983);
      byte[] byteArray0 = new byte[8];
      Txn txn0 = new Txn();
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(logEntryType0, (LN) fileSummaryLN0, databaseId0, byteArray0, byteArray0, (long) 983, true, txn0);
      byte[] byteArray1 = deletedDupLNLogEntry0.getDupKey();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test
  public void test10()  throws Throwable  {
      LN lN0 = new LN();
      DatabaseId databaseId0 = new DatabaseId((-355));
      byte[] byteArray0 = new byte[9];
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry((LogEntryType) null, lN0, databaseId0, byteArray0, byteArray0, (long) (byte)1, false, (Txn) null);
      int int0 = deletedDupLNLogEntry0.getLogSize();
      assertEquals(39, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(true);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("KgCe)Xr7mA8Yxfh3TAd");
      deletedDupLNLogEntry0.readEntry(byteBuffer0, 0, (byte) (-17), false);
      assertEquals(19, byteBuffer0.remaining());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=19 cap=38]", byteBuffer0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      LN lN0 = new LN(byteArray0);
      DatabaseId databaseId0 = new DatabaseId();
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry((LogEntryType) null, lN0, databaseId0, byteArray0, byteArray0, 2443L, true, (Txn) null);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      LN lN0 = new LN(byteArray0);
      DatabaseId databaseId0 = new DatabaseId();
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry((LogEntryType) null, lN0, databaseId0, byteArray0, byteArray0, 2443L, true, (Txn) null);
      StringWriter stringWriter0 = new StringWriter(175);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      StringBuffer stringBuffer1 = deletedDupLNLogEntry0.dumpEntry(stringBuffer0, true);
      //  // Unstable assertion: assertEquals("<ln><node>1</node><data>0 0 0 0 0 </data></ln><dbId id=\"0\"/><key v=\"0 0 0 0 0 \"/><key v=\"0 0 0 0 0 \"/>", stringBuffer1.toString());
  }
}
