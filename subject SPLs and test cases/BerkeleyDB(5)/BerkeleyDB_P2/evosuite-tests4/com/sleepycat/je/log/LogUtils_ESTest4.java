/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:14:07 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.log.LogUtils;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.Charset;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;
import javax.transaction.xa.Xid;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LogUtils_ESTest4 extends LogUtils_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("\" bqual=\"");
      long long0 = LogUtils.readLong(byteBuffer0);
      assertEquals(4426019690839679010L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<~\"zeJW8/>rMRBZJ-h");
      int int0 = LogUtils.readInt(byteBuffer0);
      assertEquals(2049080892, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(2001, byteArray0, byteArray0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<Xid formatId=\"2001\" gTxnId=\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\" bqual=\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"/>");
      LogUtils.writeXid(byteBuffer0, logUtils_XidImpl0);
      LogUtils.XidImpl logUtils_XidImpl1 = (LogUtils.XidImpl)LogUtils.readXid(byteBuffer0);
      assertEquals(32, byteBuffer0.position());
      assertEquals(2243940, logUtils_XidImpl1.getFormatId());
  }

  @Test
  public void test03()  throws Throwable  {
      int int0 = LogUtils.getStringLogSize("8|Pfis4CP=_<");
      assertEquals(16, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int int0 = LogUtils.getByteArrayLogSize(byteArray0);
      assertEquals(9, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("|%6tw)q");
      int int0 = LogUtils.readIntMSB(byteBuffer0);
      assertEquals(2082813556, int0);
  }

  @Test
  public void test06()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("\" bqual=\"");
      LogUtils.writeInt(byteBuffer0, (-1032));
      assertTrue(byteBuffer0.hasArray());
  }

  @Test
  public void test07()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<~\"zeJW8/>rMRBZJ-h");
      short short0 = LogUtils.readShort(byteBuffer0);
      assertEquals((short)32316, short0);
  }

  @Test
  public void test08()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<~\"zeJW8/>rMRBZJ-h");
      long long0 = LogUtils.getUnsignedInt(byteBuffer0);
      assertEquals(2049080892L, long0);
  }

  @Test
  public void test09()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(273);
      LogUtils.writeUnsignedInt(byteBuffer0, (byte) (-67));
      assertEquals(269, byteBuffer0.remaining());
  }

  @Test
  public void test10()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<Xid formatId=\"0\" gTxnId=\"i0\uD731^*\u0000\u0004 \" bqual=\"i0\uD731^*\u0000\u0004 \"/>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      LogUtils.writeString(byteBuffer1, "d^5A;l\"k>wp,^Ix:");
      assertEquals(20, byteBuffer1.position());
      assertEquals(36, byteBuffer1.remaining());
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("Y1Bvs_FMGp<=f");
      LogUtils.writeByteArray(byteBuffer0, byteArray0);
      assertEquals("java.nio.HeapByteBuffer[pos=9 lim=13 cap=26]", byteBuffer0.toString());
      assertEquals(9, byteBuffer0.position());
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(494, byteArray0, byteArray0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("|Q8S0");
      // Undeclared exception!
      try { 
        LogUtils.writeXid(byteBuffer0, logUtils_XidImpl0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(544, byteArray0, byteArray0);
      // Undeclared exception!
      try { 
        LogUtils.writeXid((ByteBuffer) null, logUtils_XidImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        LogUtils.writeUnsignedInt(byteBuffer0, (-1L));
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.writeUnsignedInt((ByteBuffer) null, 3018L);
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
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      Instant instant0 = Instant.ofEpochMilli(0L);
      Timestamp timestamp0 = Timestamp.from(instant0);
      // Undeclared exception!
      try { 
        LogUtils.writeTimestamp(byteBuffer0, timestamp0);
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
      Instant instant0 = Instant.now();
      Timestamp timestamp0 = Timestamp.from(instant0);
      // Undeclared exception!
      try { 
        LogUtils.writeTimestamp((ByteBuffer) null, timestamp0);
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
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<Xid formatId=\"4\" gTxnId=\"\" bqual=\"\"/>");
      mS949_0.decode(byteBuffer0);
      // Undeclared exception!
      try { 
        LogUtils.writeShort(byteBuffer0, (short)75);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.writeShort((ByteBuffer) null, (short)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)82);
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      // Undeclared exception!
      try { 
        LogUtils.writeLong(byteBuffer1, (-1364L));
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.DirectByteBufferR", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("|%6tw)q");
      // Undeclared exception!
      try { 
        LogUtils.writeLong(byteBuffer0, 0L);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.writeLong((ByteBuffer) null, 1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("=?K|[ ");
      byteBuffer0.getInt();
      // Undeclared exception!
      try { 
        LogUtils.writeIntMSB(byteBuffer0, (-4065));
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.writeIntMSB((ByteBuffer) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("\"/>");
      // Undeclared exception!
      try { 
        LogUtils.writeInt(byteBuffer0, 2);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        LogUtils.writeByteArray((ByteBuffer) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("U3Y3!#3F");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      byteBuffer1.flip();
      // Undeclared exception!
      try { 
        LogUtils.writeBoolean(byteBuffer1, false);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readXid((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("i^/");
      // Undeclared exception!
      try { 
        LogUtils.readTimestamp(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readTimestamp((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        LogUtils.readString(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readString((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("c)-c");
      byteBuffer0.putInt(3);
      // Undeclared exception!
      try { 
        LogUtils.readShort(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readShort((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test35()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        LogUtils.readLong(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readLong((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        LogUtils.readIntMSB(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readIntMSB((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test39()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        LogUtils.readInt(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readInt((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readByteArray((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        LogUtils.readBoolean(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readBoolean((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.getXidSize((Xid) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        LogUtils.getUnsignedInt(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.getUnsignedInt((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.getStringLogSize((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test48()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        LogUtils.dumpBoolean(byteBuffer0, stringBuffer0, "{[11C$FXfV<6_@");
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test49()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        LogUtils.dumpBoolean((ByteBuffer) null, stringBuffer0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test50()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("*lG?qx*dy");
      boolean boolean0 = LogUtils.readBoolean(byteBuffer0);
      assertFalse(boolean0);
  }

  @Test
  public void test51()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(273);
      LogUtils.readByteArray(byteBuffer0);
      assertEquals(4, byteBuffer0.position());
      assertEquals(269, byteBuffer0.remaining());
  }

  @Test
  public void test52()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.writeInt((ByteBuffer) null, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test53()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(273);
      long long0 = LogUtils.readLong(byteBuffer0);
      assertEquals(0L, long0);
  }

  @Test
  public void test54()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(273);
      int int0 = LogUtils.readInt(byteBuffer0);
      assertEquals(0, int0);
  }

  @Test
  public void test55()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)82);
      LogUtils.writeLong(byteBuffer0, (-1364L));
      assertTrue(byteBuffer0.isDirect());
  }

  @Test
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(2001, byteArray0, (byte[]) null);
      String string0 = logUtils_XidImpl0.toString();
      assertEquals("<Xid formatId=\"2001\" gTxnId=\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\" bqual=\"null\"/>", string0);
  }

  @Test
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((int) (byte)0, (byte[]) null, byteArray0);
      String string0 = logUtils_XidImpl0.toString();
      assertEquals("<Xid formatId=\"0\" gTxnId=\"null\" bqual=\"\u0000\u0000\u0000\u0000\"/>", string0);
  }

  @Test
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-1000), byteArray0, (byte[]) null);
      boolean boolean0 = logUtils_XidImpl0.equals(logUtils_XidImpl0);
      assertTrue(boolean0);
      assertEquals(-1000, logUtils_XidImpl0.getFormatId());
  }

  @Test
  public void test59()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<Xid formatId=\"2001\" gTxnId=\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\" bqual=\"null\"/>");
      LogUtils.XidImpl logUtils_XidImpl0 = (LogUtils.XidImpl)LogUtils.readXid(byteBuffer0);
      assertEquals("java.nio.HeapByteBuffer[pos=38 lim=55 cap=110]", byteBuffer0.toString());
      assertEquals(1684625468, logUtils_XidImpl0.getFormatId());
  }

  @Test
  public void test60()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(",$!d8;nt1xHng");
      byteBuffer0.get();
      LogUtils.writeIntMSB(byteBuffer0, 2265);
      byteBuffer0.flip();
      // Undeclared exception!
      try { 
        LogUtils.readXid(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test61()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(273);
      byte[] byteArray0 = new byte[4];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((int) (byte)0, (byte[]) null, byteArray0);
      LogUtils.writeXid(byteBuffer0, logUtils_XidImpl0);
      assertEquals(10, byteBuffer0.position());
      assertEquals(0, logUtils_XidImpl0.getFormatId());
  }

  @Test
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(0, byteArray0, (byte[]) null);
      int int0 = LogUtils.getXidSize(logUtils_XidImpl0);
      assertEquals(8, int0);
      assertEquals(0, logUtils_XidImpl0.getFormatId());
  }

  @Test
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((int) (byte)0, (byte[]) null, byteArray0);
      int int0 = LogUtils.getXidSize(logUtils_XidImpl0);
      assertEquals(10, int0);
      assertEquals(0, logUtils_XidImpl0.getFormatId());
  }

  @Test
  public void test64()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)82);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      boolean boolean0 = LogUtils.dumpBoolean(byteBuffer0, stringBuffer0, "{[11C$FXfV<6_@");
      assertEquals(34, stringBuffer0.length());
      assertFalse(boolean0);
  }

  @Test
  public void test65()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.writeBoolean((ByteBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test66()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("U3Y3!#3F");
      LogUtils.writeBoolean(byteBuffer0, false);
      assertFalse(byteBuffer0.isDirect());
  }

  @Test
  public void test67()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(273);
      int int0 = LogUtils.readIntMSB(byteBuffer0);
      assertEquals(0, int0);
  }

  @Test
  public void test68()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(",$!d8;nt1xHng");
      LogUtils.writeIntMSB(byteBuffer0, 2265);
      LogUtils.writeShort(byteBuffer0, (short) (-3148));
      byteBuffer0.flip();
      LogUtils.readXid(byteBuffer0);
      // Undeclared exception!
      try { 
        LogUtils.readByteArray(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test69()  throws Throwable  {
      int int0 = LogUtils.getLongLogSize();
      assertEquals(8, int0);
  }

  @Test
  public void test70()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.getByteArrayLogSize((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test71()  throws Throwable  {
      int int0 = LogUtils.getIntLogSize();
      assertEquals(4, int0);
  }

  @Test
  public void test72()  throws Throwable  {
      LogUtils logUtils0 = new LogUtils();
      assertEquals(8, logUtils0.getLongLogSize());
  }

  @Test
  public void test73()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(273);
      Timestamp timestamp0 = new Timestamp(0L);
      LogUtils.writeTimestamp(byteBuffer0, timestamp0);
      assertEquals(273, byteBuffer0.capacity());
  }

  @Test
  public void test74()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)82);
      long long0 = LogUtils.getUnsignedInt(byteBuffer0);
      assertEquals(0L, long0);
  }

  @Test
  public void test75()  throws Throwable  {
      int int0 = LogUtils.getTimestampLogSize();
      assertEquals(8, int0);
  }

  @Test
  public void test76()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)82);
      String string0 = LogUtils.readString(byteBuffer0);
      assertEquals(4, byteBuffer0.position());
      assertEquals("", string0);
  }

  @Test
  public void test77()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("_G&hVgTR!U$");
      // Undeclared exception!
      try { 
        LogUtils.writeString(byteBuffer0, " exists = \"");
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test78()  throws Throwable  {
      int int0 = LogUtils.getBooleanLogSize();
      assertEquals(1, int0);
  }

  @Test
  public void test79()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("F7zj\"^4");
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        LogUtils.writeByteArray(byteBuffer0, byteArray0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test80()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<Xid formatId=\"4\" gTxnId=\"\" bqual=\"\"/>");
      Timestamp timestamp0 = LogUtils.readTimestamp(byteBuffer0);
      assertEquals(612000000, timestamp0.getNanos());
  }

  @Test
  public void test81()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)82);
      short short0 = LogUtils.readShort(byteBuffer0);
      assertEquals((short)0, short0);
  }

  @Test
  public void test82()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(2001, byteArray0, (byte[]) null);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<Xid formatId=\"2001\" gTxnId=\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\" bqual=\"null\"/>");
      LogUtils.writeXid(byteBuffer0, logUtils_XidImpl0);
      // Undeclared exception!
      try { 
        LogUtils.readXid(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test83()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((int) (byte) (-1), byteArray0, byteArray0);
      HijrahChronology hijrahChronology0 = HijrahChronology.INSTANCE;
      HijrahDate hijrahDate0 = hijrahChronology0.dateEpochDay(1602L);
      boolean boolean0 = logUtils_XidImpl0.equals(hijrahDate0);
      assertFalse(boolean0);
      assertEquals(-1, logUtils_XidImpl0.getFormatId());
  }
}