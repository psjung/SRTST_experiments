/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:33:39 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.cleaner.FileSummary;
import com.sleepycat.je.cleaner.PackedOffsets;
import com.sleepycat.je.cleaner.TrackedFileSummary;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.log.LogEntryType;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FileSummaryLN_ESTest1 extends FileSummaryLN_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      byte[] byteArray0 = FileSummaryLN.makeFullKey(0L, 22);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<fileSummaryLN>\n  <node>0</node>\n</fileSummaryLN>\n");
      fileSummaryLN0.readFromLog(byteBuffer0, (byte)40);
      long long0 = fileSummaryLN0.getFileNumber(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)127, (byte) (-1), (byte) (-1), (byte) (-23)}, byteArray0);
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = 11;
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.getBaseSummary();
      //  // Unstable assertion: assertEquals(160L, fileSummaryLN0.getNodeId());
  }

  @Test
  public void test02()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = 4;
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.getBaseSummary();
      //  // Unstable assertion: assertEquals(154L, fileSummaryLN0.getNodeId());
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = FileSummaryLN.makeFullKey(0L, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)127, (byte) (-1), (byte) (-1), (byte) (-1)}, byteArray0);
  }

  @Test
  public void test04()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      byte[] byteArray0 = new byte[7];
      boolean boolean0 = fileSummaryLN0.hasStringKey(byteArray0);
      //  // Unstable assertion: assertEquals(142L, fileSummaryLN0.getNodeId());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      // Undeclared exception!
      try { 
        Charset.forName("s*7,");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // s*7,
         //
         assertThrownBy("java.nio.charset.Charset", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      // Undeclared exception!
      try { 
        fileSummaryLN0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      // Undeclared exception!
      try { 
        fileSummaryLN0.readFromLog((ByteBuffer) null, (byte)27);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        fileSummaryLN0.getFileNumber(byteArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\u0000\u0000\u0000\"
         //
         assertThrownBy("java.lang.NumberFormatException", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      // Undeclared exception!
      try { 
        fileSummaryLN0.dumpString(2080, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 2080
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      String string0 = fileSummaryLN0.dumpString(0, false);
      assertEquals("  <node>0</node>\n\n", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = fileSummaryLN0.hasStringKey(byteArray0);
      assertTrue(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      String string0 = fileSummaryLN0.beginTag();
      assertEquals("<fileSummaryLN>", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      String string0 = fileSummaryLN0.endTag();
      assertEquals("</fileSummaryLN>", string0);
  }

  @Test
  public void test14()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("C&WO_9FC5emk4/']u");
      // Undeclared exception!
      try { 
        fileSummaryLN0.readFromLog(byteBuffer0, (byte) (-118));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("hdi]>ry9Zw_7C<k*t<");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      // Undeclared exception!
      try { 
        fileSummaryLN0.writeToLog(byteBuffer1);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<fileSummaryLN>\n  <node>0</node>\n</fileSummaryLN>\n");
      fileSummaryLN0.writeToLog(byteBuffer0);
      assertEquals(41, byteBuffer0.remaining());
      assertEquals("java.nio.HeapByteBuffer[pos=9 lim=50 cap=100]", byteBuffer0.toString());
  }

  @Test
  public void test17()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      int int0 = fileSummaryLN0.getLogSize();
      //  // Unstable assertion: assertEquals(68L, fileSummaryLN0.getNodeId());
      //  // Unstable assertion: assertEquals(53, int0);
  }

  @Test
  public void test18()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      int int0 = fileSummaryLN0.getLogSize();
      assertEquals(9, int0);
  }

  @Test
  public void test20()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.dumpLogAdditional(stringBuffer0, true);
      //  // Unstable assertion: assertEquals(286, stringBuffer0.capacity());
      //  // Unstable assertion: assertEquals(57L, fileSummaryLN0.getNodeId());
  }

  @Test
  public void test21()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fileSummaryLN0.dumpLogAdditional(stringBuffer0, false);
      //  // Unstable assertion: assertEquals(286, stringBuffer0.capacity());
      //  // Unstable assertion: assertEquals(47L, fileSummaryLN0.getNodeId());
  }

  @Test
  public void test22()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fileSummaryLN0.dumpLogAdditional(stringBuffer0, false);
      assertEquals("", stringBuffer0.toString());
      assertEquals("", stringWriter0.toString());
  }

  @Test
  public void test23()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      String string0 = fileSummaryLN0.dumpString(0, true);
      //  // Unstable assertion: assertEquals("<fileSummaryLN>\n  <node>28</node>\n  <data></data>\n</fileSummaryLN>\n<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/><offsets size=\"0\"/>", string0);
  }

  @Test
  public void test24()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      fileSummaryLN0.postFetchInit(databaseImpl0, 0L);
      //  // Unstable assertion: assertEquals(23L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertEquals(23L, fileSummaryLN0.getLastId());
  }

  @Test
  public void test26()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = fileSummaryLN0.hasStringKey(byteArray0);
      //  // Unstable assertion: assertEquals(11L, fileSummaryLN0.getLastId());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      byte[] byteArray0 = FileSummaryLN.makeFullKey((-2L), 22);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<fileSummaryLN>\n  <node>0</node>\n</fileSummaryLN>\n");
      fileSummaryLN0.readFromLog(byteBuffer0, (byte)40);
      long long0 = fileSummaryLN0.getFileNumber(byteArray0);
      assertEquals(4294967294L, long0);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-1), (byte) (-2), (byte)127, (byte) (-1), (byte) (-1), (byte) (-23)}, byteArray0);
  }

  @Test
  public void test28()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      // Undeclared exception!
      try { 
        fileSummaryLN0.getFileNumber((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      byte[] byteArray0 = FileSummaryLN.makePartialKey(22);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)22}, byteArray0);
  }

  @Test
  public void test31()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      boolean boolean0 = fileSummaryLN0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
  }

  @Test
  public void test32()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      PackedOffsets packedOffsets0 = fileSummaryLN0.getObsoleteOffsets();
      assertFalse(packedOffsets0.logEntryIsTransactional());
  }

  @Test
  public void test33()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      LogEntryType logEntryType0 = fileSummaryLN0.getLogType();
      assertTrue(logEntryType0.isNodeType());
  }

  @Test
  public void test34()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      boolean boolean0 = fileSummaryLN0.marshallOutsideWriteLatch();
      assertFalse(boolean0);
  }

  @Test
  public void test35()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      TrackedFileSummary trackedFileSummary0 = fileSummaryLN0.getTrackedSummary();
      assertNull(trackedFileSummary0);
  }

  @Test
  public void test36()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      String string0 = fileSummaryLN0.toString();
      assertEquals("<fileSummaryLN>\n  <node>0</node>\n</fileSummaryLN>\n", string0);
  }

  @Test
  public void test37()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      fileSummaryLN0.setTrackedSummary((TrackedFileSummary) null);
      assertFalse(fileSummaryLN0.marshallOutsideWriteLatch());
  }

  @Test
  public void test38()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.getBaseSummary();
      //  // Unstable assertion: assertEquals(1L, fileSummaryLN0.getLastId());
  }
}
