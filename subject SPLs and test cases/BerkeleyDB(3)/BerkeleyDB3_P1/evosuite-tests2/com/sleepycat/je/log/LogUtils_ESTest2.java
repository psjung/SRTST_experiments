/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:05:15 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.sql.Timestamp;
import java.time.Instant;

import javax.transaction.xa.Xid;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LogUtils_ESTest2 extends LogUtils_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("9a>xi?Y8'&|4n$Xv`");
      LogUtils.writeLong(byteBuffer0, 0L);
      byteBuffer0.rewind();
      short short0 = LogUtils.readShort(byteBuffer0);
      assertEquals((short)0, short0);
  }

  @Test
  public void test01()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("9a>xi?Y8'&|4n$Xv`");
      LogUtils.writeLong(byteBuffer0, (-10L));
      byteBuffer0.rewind();
      short short0 = LogUtils.readShort(byteBuffer0);
      assertEquals((short) (-10), short0);
  }

  @Test
  public void test02()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1792);
      int int0 = LogUtils.readInt(byteBuffer0);
      assertEquals(0, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(0, byteArray0, byteArray0);
      int int0 = LogUtils.getXidSize(logUtils_XidImpl0);
      assertEquals(0, logUtils_XidImpl0.getFormatId());
      assertEquals(10, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<Xid formatId=\"-2682\" gTxnId=\"\u0000 \uFFFD\" bqual=\"\u0000 \uFFFD\"/>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      int int0 = LogUtils.readIntMSB(byteBuffer1);
      assertEquals(1012427108, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("~dyJleO^9t,_WM");
      LogUtils.writeInt(byteBuffer0, 0);
      assertEquals(4, byteBuffer0.position());
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<Xid formatId=\"16\" gTxnId=\"\uAE78\u0000\" bqual=\"\uAE78\u0000\"/>");
      LogUtils.writeByteArray(byteBuffer0, byteArray0);
      assertEquals(7, byteBuffer0.position());
      assertEquals("java.nio.HeapByteBuffer[pos=7 lim=45 cap=86]", byteBuffer0.toString());
  }

  @Test
  public void test07()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("qA=<CdO{lRGVx8rQ2c_");
      long long0 = LogUtils.readLong(byteBuffer0);
      assertEquals(8885430829761511793L, long0);
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = LogUtils.getByteArrayLogSize(byteArray0);
      assertEquals(13, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("AK>]9we#Z-[hN");
      byteBuffer0.clear();
      LogUtils.writeString(byteBuffer0, "AK>]9we#Z-[hN");
      assertEquals(10, byteBuffer0.remaining());
      assertEquals(18, byteBuffer0.position());
  }

  @Test
  public void test10()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("K>]9we#Z-[bN");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      byteBuffer1.getDouble();
      byte[] byteArray0 = new byte[0];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(649, byteArray0, byteArray0);
      // Undeclared exception!
      try { 
        LogUtils.writeXid(byteBuffer1, logUtils_XidImpl0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("s5E~F");
      // Undeclared exception!
      try { 
        LogUtils.writeXid(byteBuffer0, (Xid) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(";KA{E");
      LogUtils.getUnsignedInt(byteBuffer0);
      // Undeclared exception!
      try { 
        LogUtils.writeUnsignedInt(byteBuffer0, 10);
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
      // Undeclared exception!
      try { 
        LogUtils.writeUnsignedInt((ByteBuffer) null, 1797L);
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
      Instant instant0 = Instant.ofEpochSecond((-855L));
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
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.writeString((ByteBuffer) null, (String) null);
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
      ByteBuffer byteBuffer0 = mS949_0.encode("+");
      // Undeclared exception!
      try { 
        LogUtils.writeShort(byteBuffer0, (short) (-633));
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
      // Undeclared exception!
      try { 
        LogUtils.writeShort((ByteBuffer) null, (short)56);
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
      ByteBuffer byteBuffer0 = mS949_0.encode("0R?[\"");
      // Undeclared exception!
      try { 
        LogUtils.writeLong(byteBuffer0, (-1L));
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
        LogUtils.writeLong((ByteBuffer) null, (-1760L));
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
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<");
      // Undeclared exception!
      try { 
        LogUtils.writeIntMSB(byteBuffer0, (-1));
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.writeIntMSB((ByteBuffer) null, 499);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.writeInt((ByteBuffer) null, (-1154));
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
      ByteBuffer byteBuffer0 = mS949_0.encode("9a>xi?Y8'&|4n$Xv`");
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
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
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("#");
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
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(")m5/t~>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      byteBuffer1.putFloat((float) (byte)32);
      // Undeclared exception!
      try { 
        LogUtils.readIntMSB(byteBuffer1);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("\"/>");
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
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("EM");
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
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
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
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
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
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(";KA{E");
      LogUtils.readBoolean(byteBuffer0);
      LogUtils.readInt(byteBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        LogUtils.dumpBoolean(byteBuffer0, stringBuffer0, "");
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(40);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        LogUtils.dumpBoolean((ByteBuffer) null, stringBuffer0, "v]10aVI<K7S3#8");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test46()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        LogUtils.writeInt(byteBuffer0, (-242));
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(".");
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        LogUtils.writeByteArray(byteBuffer0, byteArray0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(5411, byteArray0, (byte[]) null);
      String string0 = logUtils_XidImpl0.toString();
      assertEquals("<Xid formatId=\"5411\" gTxnId=\"\" bqual=\"null\"/>", string0);
  }

  @Test
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(0, byteArray0, byteArray0);
      String string0 = logUtils_XidImpl0.toString();
      assertEquals("<Xid formatId=\"0\" gTxnId=\"\u0000\u0000\" bqual=\"\u0000\u0000\"/>", string0);
  }

  @Test
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-2682), byteArray0, byteArray0);
      boolean boolean0 = logUtils_XidImpl0.equals(logUtils_XidImpl0);
      assertTrue(boolean0);
      assertEquals(-2682, logUtils_XidImpl0.getFormatId());
  }

  @Test
  public void test52()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(";KA{E");
      byte[] byteArray0 = new byte[2];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(0, byteArray0, byteArray0);
      boolean boolean0 = logUtils_XidImpl0.equals(byteBuffer0);
      assertEquals(0, logUtils_XidImpl0.getFormatId());
      assertFalse(boolean0);
  }

  @Test
  public void test53()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("9a>xi?Y8'&|4n$Xv`");
      LogUtils.writeLong(byteBuffer0, (-2L));
      byteBuffer0.rewind();
      LogUtils.XidImpl logUtils_XidImpl0 = (LogUtils.XidImpl)LogUtils.readXid(byteBuffer0);
      LogUtils.writeXid(byteBuffer0, logUtils_XidImpl0);
      assertEquals(5, byteBuffer0.remaining());
      assertEquals(-2, logUtils_XidImpl0.getFormatId());
  }

  @Test
  public void test54()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("BzXl7_}WC@! G6'SW");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      boolean boolean0 = LogUtils.dumpBoolean(byteBuffer1, stringBuffer0, "BzXl7_}WC@! G6'SW");
      assertEquals(70, stringBuffer0.capacity());
      assertFalse(boolean0);
  }

  @Test
  public void test55()  throws Throwable  {
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
  public void test56()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("qA=<CdO{lRGVx8rQ2c_");
      LogUtils.writeBoolean(byteBuffer0, false);
      assertEquals(1, byteBuffer0.position());
  }

  @Test
  public void test57()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1811);
      LogUtils.writeUnsignedInt(byteBuffer0, (-576L));
      assertTrue(byteBuffer0.hasRemaining());
  }

  @Test
  public void test58()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1811);
      int int0 = LogUtils.readIntMSB(byteBuffer0);
      assertEquals(0, int0);
  }

  @Test
  public void test59()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("~dyJleO^9t,_WM");
      LogUtils.writeIntMSB(byteBuffer0, (-41));
      assertEquals("java.nio.HeapByteBuffer[pos=4 lim=14 cap=28]", byteBuffer0.toString());
  }

  @Test
  public void test60()  throws Throwable  {
      int int0 = LogUtils.getLongLogSize();
      assertEquals(8, int0);
  }

  @Test
  public void test61()  throws Throwable  {
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
  public void test62()  throws Throwable  {
      int int0 = LogUtils.getIntLogSize();
      assertEquals(4, int0);
  }

  @Test
  public void test63()  throws Throwable  {
      LogUtils logUtils0 = new LogUtils();
      assertEquals(8, logUtils0.getTimestampLogSize());
  }

  @Test
  public void test64()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("#a4u=QRbI>");
      Timestamp timestamp0 = new Timestamp(980L);
      LogUtils.writeTimestamp(byteBuffer0, timestamp0);
      assertEquals(20, byteBuffer0.capacity());
  }

  @Test
  public void test65()  throws Throwable  {
      int int0 = LogUtils.getStringLogSize("Zrg\"ohIFq~j@uN+uW");
      assertEquals(21, int0);
  }

  @Test
  public void test66()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1812);
      long long0 = LogUtils.getUnsignedInt(byteBuffer0);
      assertEquals(0L, long0);
  }

  @Test
  public void test67()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("~dyJleO^9t,_WM");
      LogUtils.writeShort(byteBuffer0, (short)1);
      assertFalse(byteBuffer0.isDirect());
  }

  @Test
  public void test68()  throws Throwable  {
      int int0 = LogUtils.getTimestampLogSize();
      assertEquals(8, int0);
  }

  @Test
  public void test69()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1811);
      String string0 = LogUtils.readString(byteBuffer0);
      assertEquals("java.nio.HeapByteBuffer[pos=4 lim=1811 cap=1811]", byteBuffer0.toString());
      assertEquals("", string0);
  }

  @Test
  public void test70()  throws Throwable  {
      int int0 = LogUtils.getBooleanLogSize();
      assertEquals(1, int0);
  }

  @Test
  public void test71()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("AK>]9we#Z-[hN");
      // Undeclared exception!
      try { 
        LogUtils.writeString(byteBuffer0, "AK>]9we#Z-[hN");
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test72()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("9a>xi?Y8'&|4n$Xv`");
      Timestamp timestamp0 = LogUtils.readTimestamp(byteBuffer0);
      assertEquals(809000000, timestamp0.getNanos());
  }

  @Test
  public void test73()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("9a>xi?Y8'&|4n$Xv`");
      short short0 = LogUtils.readShort(byteBuffer0);
      assertEquals((short)24889, short0);
  }

  @Test
  public void test74()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("AK>]9we#Z-[hN");
      byte[] byteArray0 = new byte[0];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(637, byteArray0, byteArray0);
      LogUtils.writeXid(byteBuffer0, logUtils_XidImpl0);
      assertEquals(637, logUtils_XidImpl0.getFormatId());
  }

  @Test
  public void test75()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1812);
      LogUtils.XidImpl logUtils_XidImpl0 = (LogUtils.XidImpl)LogUtils.readXid(byteBuffer0);
      int int0 = LogUtils.getXidSize(logUtils_XidImpl0);
      assertEquals("java.nio.HeapByteBuffer[pos=6 lim=1812 cap=1812]", byteBuffer0.toString());
      assertEquals(6, int0);
  }

  @Test
  public void test76()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1811);
      byte[] byteArray0 = LogUtils.readByteArray(byteBuffer0);
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((int) (short)1, byteArray0, byteArray0);
      assertEquals(4, byteBuffer0.position());
      assertEquals("java.nio.HeapByteBuffer[pos=4 lim=1811 cap=1811]", byteBuffer0.toString());
  }
}
