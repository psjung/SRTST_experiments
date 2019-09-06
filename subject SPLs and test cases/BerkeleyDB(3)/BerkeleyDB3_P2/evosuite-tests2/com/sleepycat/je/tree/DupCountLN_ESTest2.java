/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:42:29 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
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

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DupCountLN_ESTest2 extends DupCountLN_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(26);
      int int0 = dupCountLN0.getDupCount();
      assertEquals(26, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-1273));
      int int0 = dupCountLN0.getDupCount();
      assertEquals((-1273), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(5);
      int int0 = dupCountLN0.getLogSize();
      //  // Unstable assertion: assertEquals(182L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertEquals(17, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(3179);
      int int0 = dupCountLN0.decDupCount();
      assertEquals(3178, dupCountLN0.getDupCount());
      assertEquals(3178, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(24);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("4|!NFXv dzaRi");
      // Undeclared exception!
      try { 
        dupCountLN0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(5758);
      // Undeclared exception!
      try { 
        dupCountLN0.writeToLog((ByteBuffer) null);
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
      DupCountLN dupCountLN0 = new DupCountLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("pC`Yr*");
      // Undeclared exception!
      try { 
        dupCountLN0.readFromLog(byteBuffer0, (byte)4);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(0);
      // Undeclared exception!
      try { 
        dupCountLN0.readFromLog((ByteBuffer) null, (byte)0);
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
      DupCountLN dupCountLN0 = new DupCountLN();
      // Undeclared exception!
      try { 
        dupCountLN0.dumpString((-1), true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      // Undeclared exception!
      try { 
        dupCountLN0.dumpLogAdditional((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DupCountLN", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      String string0 = dupCountLN0.dumpString(10, true);
      assertEquals("          <dupCountLN>\n            <count v=\"0\"/>\n            <node>0</node>\n          </dupCountLN>", string0);
  }

  @Test
  public void test12()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(26);
      dupCountLN0.beginTag();
      //  // Unstable assertion: assertEquals(144L, dupCountLN0.getLastId());
  }

  @Test
  public void test13()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(26);
      boolean boolean0 = dupCountLN0.isDeleted();
      //  // Unstable assertion: assertEquals(140L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(26);
      dupCountLN0.endTag();
      //  // Unstable assertion: assertEquals(136L, dupCountLN0.getNodeId());
  }

  @Test
  public void test15()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(26);
      dupCountLN0.dumpString(26, false);
      //  // Unstable assertion: assertEquals(104L, dupCountLN0.getLastId());
  }

  @Test
  public void test16()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(0);
      dupCountLN0.incDupCount();
      int int0 = dupCountLN0.decDupCount();
      //  // Unstable assertion: assertEquals(62L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertEquals(0, int0);
  }

  @Test
  public void test18()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      // Undeclared exception!
      try { 
        dupCountLN0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(26);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("                            <count v=\"26\"/>\n                            <node>98683</node>\n                            <data></data>\n");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      dupCountLN0.writeToLog(byteBuffer1);
      assertEquals(116, byteBuffer1.remaining());
      assertEquals(26, dupCountLN0.getDupCount());
  }

  @Test
  public void test20()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      dupCountLN0.getLogType();
      assertEquals(0, dupCountLN0.getDupCount());
  }

  @Test
  public void test21()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(26);
      long long0 = dupCountLN0.getMemorySizeIncludedByParent();
      //  // Unstable assertion: assertEquals(27L, dupCountLN0.getLastId());
      //  // Unstable assertion: assertEquals(40L, long0);
  }

  @Test
  public void test22()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      dupCountLN0.getTransactionalLogType();
      assertEquals(0, dupCountLN0.getDupCount());
  }

  @Test
  public void test23()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(26);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dupCountLN0.dumpLogAdditional(stringBuffer0, true);
      //  // Unstable assertion: assertEquals(15, stringBuffer0.length());
      //  // Unstable assertion: assertEquals(15L, dupCountLN0.getNodeId());
  }

  @Test
  public void test24()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      boolean boolean0 = dupCountLN0.containsDuplicates();
      assertTrue(boolean0);
      assertEquals(0, dupCountLN0.getDupCount());
  }

  @Test
  public void test25()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(26);
      dupCountLN0.setDupCount(26);
      assertEquals(26, dupCountLN0.getDupCount());
  }

  @Test
  public void test26()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      String string0 = dupCountLN0.toString();
      assertEquals("<dupCountLN>\n  <count v=\"0\"/>\n  <node>0</node>\n</dupCountLN>", string0);
  }

  @Test
  public void test27()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(26);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("                            <count v=\"26\"/>\n                            <node>98683</node>\n                            <data></data>\n");
      dupCountLN0.readFromLog(byteBuffer0, (byte)16);
      //  // Unstable assertion: assertEquals(1L, dupCountLN0.getLastId());
  }

  @Test
  public void test28()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      int int0 = dupCountLN0.getDupCount();
      assertEquals(0, int0);
  }
}
