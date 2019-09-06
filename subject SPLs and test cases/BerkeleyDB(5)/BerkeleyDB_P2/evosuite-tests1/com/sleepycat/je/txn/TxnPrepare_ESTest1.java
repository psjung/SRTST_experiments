/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:16:51 KST 2017
 */

package com.sleepycat.je.txn;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.log.LogUtils;
import com.sleepycat.je.txn.TxnPrepare;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import javax.transaction.xa.Xid;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TxnPrepare_ESTest1 extends TxnPrepare_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-4363), byteArray0, byteArray0);
      TxnPrepare txnPrepare0 = new TxnPrepare(0L, (Xid) logUtils_XidImpl0);
      LogUtils.XidImpl logUtils_XidImpl1 = (LogUtils.XidImpl)txnPrepare0.getXid();
      assertSame(logUtils_XidImpl0, logUtils_XidImpl1);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-4363), byteArray0, byteArray0);
      TxnPrepare txnPrepare0 = new TxnPrepare(0L, (Xid) logUtils_XidImpl0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("</lastFullLsn>");
      // Undeclared exception!
      try { 
        txnPrepare0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      TxnPrepare txnPrepare0 = new TxnPrepare();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("aEN`9dTfFs;_Ygk");
      // Undeclared exception!
      try { 
        txnPrepare0.writeToLog(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      TxnPrepare txnPrepare0 = new TxnPrepare();
      // Undeclared exception!
      try { 
        txnPrepare0.readFromLog((ByteBuffer) null, (byte)103);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      TxnPrepare txnPrepare0 = new TxnPrepare();
      // Undeclared exception!
      try { 
        txnPrepare0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      TxnPrepare txnPrepare0 = new TxnPrepare();
      // Undeclared exception!
      try { 
        txnPrepare0.dumpLog((StringBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.TxnPrepare", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      TxnPrepare txnPrepare0 = new TxnPrepare();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      txnPrepare0.dumpLog(stringBuffer0, false);
      assertEquals(55, stringBuffer0.length());
      assertEquals("<TxnPrepare id=\"0\" xid=\"null\" time=\"null\"></TxnPrepare>", stringWriter0.toString());
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-2717), byteArray0, byteArray0);
      TxnPrepare txnPrepare0 = new TxnPrepare(1233L, (Xid) logUtils_XidImpl0);
      LogEntryType logEntryType0 = txnPrepare0.getLogType();
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-1), byteArray0, byteArray0);
      TxnPrepare txnPrepare0 = new TxnPrepare((-773L), (Xid) logUtils_XidImpl0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<Xid formatId=\"-1\" gTxnId=\"\u0000\uCF84\u0000\" bqual=\"\u0000\uCF84\u0000\"/>");
      // Undeclared exception!
      try { 
        txnPrepare0.readFromLog(byteBuffer0, (byte)0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(4689, byteArray0, byteArray0);
      TxnPrepare txnPrepare0 = new TxnPrepare((-1L), (Xid) logUtils_XidImpl0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<Xid formatId=\"4689\" gTxnId=\"\u82D2/\" bqual=\"\u82D2/\"/>");
      txnPrepare0.writeToLog(byteBuffer0);
      assertEquals((-1L), txnPrepare0.getId());
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(4689, byteArray0, byteArray0);
      TxnPrepare txnPrepare0 = new TxnPrepare((-1L), (Xid) logUtils_XidImpl0);
      int int0 = txnPrepare0.getLogSize();
      assertEquals(28, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(4689, byteArray0, byteArray0);
      TxnPrepare txnPrepare0 = new TxnPrepare((-1L), (Xid) logUtils_XidImpl0);
      String string0 = txnPrepare0.getTagName();
      assertEquals("TxnPrepare", string0);
  }

  @Test
  public void test12()  throws Throwable  {
      TxnPrepare txnPrepare0 = new TxnPrepare();
      LogUtils.XidImpl logUtils_XidImpl0 = (LogUtils.XidImpl)txnPrepare0.getXid();
      assertNull(logUtils_XidImpl0);
  }
}