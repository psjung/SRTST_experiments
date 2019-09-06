/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:34:52 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
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

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.cleaner.FileSummary;
import com.sleepycat.je.cleaner.TrackedFileSummary;
import com.sleepycat.je.dbi.DatabaseImpl;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FileSummaryLN_ESTest5 extends FileSummaryLN_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      byte[] byteArray0 = FileSummaryLN.makeFullKey(0, 0);
      long long0 = fileSummaryLN0.getFileNumber(byteArray0);
      //  // Unstable assertion: assertEquals(410L, fileSummaryLN0.getLastId());
      //  // Unstable assertion: assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = 766;
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.getBaseSummary();
      //  // Unstable assertion: assertEquals(405L, fileSummaryLN0.getLastId());
  }

  @Test
  public void test02()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummary0.obsoleteLNCount = 766;
      fileSummaryLN0.getBaseSummary();
      //  // Unstable assertion: assertEquals(400L, fileSummaryLN0.getNodeId());
  }

  @Test
  public void test03()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<com.sleepycat.je.tree.FileSummaryLN/4294969493");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      fileSummaryLN0.readFromLog(byteBuffer1, (byte) (-11));
      fileSummaryLN0.getBaseSummary();
      assertEquals(1766207077, fileSummary0.totalINSize);
      assertFalse(fileSummary0.isEmpty());
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = FileSummaryLN.makeFullKey(0L, 1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)127, (byte) (-1), (byte) (-1), (byte) (-2)}, byteArray0);
  }

  @Test
  public void test05()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      byte[] byteArray0 = new byte[21];
      // Undeclared exception!
      try { 
        fileSummaryLN0.getFileNumber(byteArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"
         //
         assertThrownBy("java.lang.NumberFormatException", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("Couldn't rename ");
      // Undeclared exception!
      try { 
        fileSummaryLN0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<com.sleepycat.je.tree.FileSummaryLN/4294969487");
      // Undeclared exception!
      try { 
        fileSummaryLN0.readFromLog(byteBuffer0, (byte)28);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      // Undeclared exception!
      try { 
        fileSummaryLN0.readFromLog((ByteBuffer) null, (byte)96);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      // Undeclared exception!
      try { 
        fileSummaryLN0.dumpString((-2992), false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2990
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      // Undeclared exception!
      try { 
        fileSummaryLN0.dumpLogAdditional((StringBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSummary", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      String string0 = fileSummaryLN0.dumpString(0, false);
      assertEquals("  <node>0</node>\n\n", string0);
  }

  @Test
  public void test15()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      String string0 = fileSummaryLN0.dumpString(0, true);
      //  // Unstable assertion: assertEquals("<fileSummaryLN>\n  <node>324</node>\n  <data></data>\n</fileSummaryLN>\n<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/><offsets size=\"0\"/>", string0);
  }

  @Test
  public void test16()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      byte[] byteArray0 = FileSummaryLN.makeFullKey((-2551L), 0);
      fileSummaryLN0.hasStringKey(byteArray0);
      //  // Unstable assertion: assertEquals(279L, fileSummaryLN0.getLastId());
  }

  @Test
  public void test17()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      byte[] byteArray0 = FileSummaryLN.makePartialKey((-1L));
      boolean boolean0 = fileSummaryLN0.hasStringKey(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1)}, byteArray0);
      assertTrue(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.beginTag();
      //  // Unstable assertion: assertEquals(273L, fileSummaryLN0.getLastId());
  }

  @Test
  public void test19()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.endTag();
      //  // Unstable assertion: assertEquals(267L, fileSummaryLN0.getLastId());
  }

  @Test
  public void test20()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<com.sleepycat.je.tree.FileSummaryLN/4294969497");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      fileSummaryLN0.readFromLog(byteBuffer1, (byte)0);
      //  // Unstable assertion: assertEquals(876163636, fileSummary0.obsoleteLNCount);
      //  // Unstable assertion: assertEquals(246L, fileSummaryLN0.getLastId());
  }

  @Test
  public void test21()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      // Undeclared exception!
      try { 
        fileSummaryLN0.readFromLog(byteBuffer1, (byte)28);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Java heap space
         //
      }
  }

  @Test
  public void test22()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<fileSummaryLN>\n  <node>0</node>\n</fileSummaryLN>\n");
      fileSummaryLN0.readFromLog(byteBuffer0, (byte) (-52));
      // Undeclared exception!
      try { 
        fileSummaryLN0.hasStringKey((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.FileSummaryLN", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("TrbK6J7 . P");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      fileSummaryLN0.writeToLog(byteBuffer1);
      assertFalse(byteBuffer1.equals((Object)byteBuffer0));
  }

  @Test
  public void test24()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<fileSummaryLN>\n  <node>4294969496</node>\n  <data></data>\n</fileSummaryLN>\n<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/><offsets size=\"0\"/>");
      fileSummaryLN0.writeToLog(byteBuffer0);
      //  // Unstable assertion: assertEquals("java.nio.HeapByteBuffer[pos=53 lim=239 cap=478]", byteBuffer0.toString());
      //  // Unstable assertion: assertEquals(215L, fileSummaryLN0.getLastId());
  }

  @Test
  public void test25()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      int int0 = fileSummaryLN0.getLogSize();
      //  // Unstable assertion: assertEquals(190L, fileSummaryLN0.getLastId());
      //  // Unstable assertion: assertEquals(53, int0);
  }

  @Test
  public void test26()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      int int0 = fileSummaryLN0.getLogSize();
      assertEquals(9, int0);
  }

  @Test
  public void test28()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fileSummaryLN0.dumpLogAdditional(stringBuffer0, false);
      //  // Unstable assertion: assertEquals(286, stringBuffer0.capacity());
      //  // Unstable assertion: assertEquals(173L, fileSummaryLN0.getNodeId());
  }

  @Test
  public void test29()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fileSummaryLN0.dumpLog(stringBuffer0, true);
      //  // Unstable assertion: assertEquals(286, stringBuffer0.capacity());
      //  // Unstable assertion: assertEquals(161L, fileSummaryLN0.getNodeId());
  }

  @Test
  public void test30()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fileSummaryLN0.dumpLogAdditional(stringBuffer0, true);
      assertEquals(0, stringBuffer0.capacity());
      assertEquals("", stringWriter0.toString());
  }

  @Test
  public void test31()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      String string0 = fileSummaryLN0.toString();
      assertEquals("<fileSummaryLN>\n  <node>0</node>\n</fileSummaryLN>\n", string0);
  }

  @Test
  public void test32()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      fileSummaryLN0.postFetchInit((DatabaseImpl) null, (byte) (-52));
      //  // Unstable assertion: assertEquals(160L, fileSummaryLN0.getLastId());
  }

  @Test
  public void test33()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      byte[] byteArray0 = new byte[8];
      boolean boolean0 = fileSummaryLN0.hasStringKey(byteArray0);
      //  // Unstable assertion: assertEquals(140L, fileSummaryLN0.getLastId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = fileSummaryLN0.hasStringKey(byteArray0);
      //  // Unstable assertion: assertEquals(129L, fileSummaryLN0.getLastId());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test35()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      byte[] byteArray0 = FileSummaryLN.makeFullKey((-2551L), 0);
      long long0 = fileSummaryLN0.getFileNumber(byteArray0);
      //  // Unstable assertion: assertEquals(50L, fileSummaryLN0.getLastId());
      //  // Unstable assertion: assertEquals(4294964745L, long0);
  }

  @Test
  public void test37()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      boolean boolean0 = fileSummaryLN0.countAsObsoleteWhenLogged();
      //  // Unstable assertion: assertEquals(40L, fileSummaryLN0.getLastId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test38()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.getObsoleteOffsets();
      //  // Unstable assertion: assertEquals(34L, fileSummaryLN0.getNodeId());
  }

  @Test
  public void test39()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.getLogType();
      //  // Unstable assertion: assertEquals(28L, fileSummaryLN0.getNodeId());
  }

  @Test
  public void test40()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      boolean boolean0 = fileSummaryLN0.marshallOutsideWriteLatch();
      //  // Unstable assertion: assertEquals(21L, fileSummaryLN0.getLastId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test41()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.getTrackedSummary();
      //  // Unstable assertion: assertEquals(15L, fileSummaryLN0.getNodeId());
  }

  @Test
  public void test42()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.setTrackedSummary((TrackedFileSummary) null);
      //  // Unstable assertion: assertEquals(8L, fileSummaryLN0.getLastId());
  }

  @Test
  public void test43()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.getBaseSummary();
      //  // Unstable assertion: assertEquals(1L, fileSummaryLN0.getNodeId());
  }
}
