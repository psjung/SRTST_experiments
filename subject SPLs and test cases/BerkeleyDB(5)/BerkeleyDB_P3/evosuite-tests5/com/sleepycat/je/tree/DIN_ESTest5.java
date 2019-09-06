/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:31:57 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Properties;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.DbConfigManager;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.dbi.MemoryBudget;
import com.sleepycat.je.log.LogManager;
import com.sleepycat.je.txn.LockResult;
import com.sleepycat.je.txn.Txn;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DIN_ESTest5 extends DIN_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[0];
      dIN0.selectKey(byteArray0, byteArray0);
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test01()  throws Throwable  {
      DIN dIN0 = new DIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<din>\n  <dupkey></dupkey>\n    <lsn/>\n    <key v=\"\"/>\n    <target/>\n    <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</din>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      byteBuffer1.compact();
      dIN0.readFromLog(byteBuffer1, (byte)0);
      assertEquals("java.nio.HeapByteBuffer[pos=358 lim=656 cap=656]", byteBuffer1.toString());
      
      dIN0.getMainTreeKey();
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test02()  throws Throwable  {
      DIN dIN0 = new DIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<din>\n  <dupkey></dupkey>\n    <lsn/>\n    <key v=\"\"/>\n    <target/>\n    <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</din>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      byteBuffer1.compact();
      dIN0.readFromLog(byteBuffer1, (byte)0);
      assertEquals(358, byteBuffer1.position());
      
      dIN0.getDupKey();
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test03()  throws Throwable  {
      DIN dIN0 = new DIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<din>\n  <dupkey></dupkey>\n    <lsn/>\n    <key v=\"\"/>\n    <target/>\n    <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</din>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      byteBuffer1.compact();
      dIN0.readFromLog(byteBuffer1, (byte)0);
      assertEquals(298, byteBuffer1.remaining());
      
      dIN0.getDupCountLNRef();
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test04()  throws Throwable  {
      DIN dIN0 = new DIN();
      int int0 = dIN0.generateLevel((DatabaseId) null, (-1));
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
      assertEquals((-1), int0);
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test05()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLNRefAndNullTarget dIN_DIN_updateDupCountLNRefAndNullTarget0 = new DIN.DIN_updateDupCountLNRefAndNullTarget(dIN0, 1);
      dIN_DIN_updateDupCountLNRefAndNullTarget0.newLsn = 524288L;
      dIN_DIN_updateDupCountLNRefAndNullTarget0.execute();
      assertTrue(dIN0.getDirty());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test06()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[4];
      byte[] byteArray2 = dIN0.selectKey(byteArray0, byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test08()  throws Throwable  {
      DIN dIN0 = new DIN();
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)0;
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.createNewInstance(byteArray0, 1766, (byte)23);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DIN dIN0 = new DIN();
      int int0 = dIN0.generateLevel((DatabaseId) null, 16777214);
      assertEquals(16777214, int0);
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test11()  throws Throwable  {
      DIN dIN0 = new DIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("Q>|.v\"J]oC{_+N%. ");
      // Undeclared exception!
      try { 
        dIN0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLN dIN_DIN_updateDupCountLN0 = new DIN.DIN_updateDupCountLN(dIN0, dIN0);
      dIN_DIN_updateDupCountLN0.execute();
      // Undeclared exception!
      try { 
        dIN0.toString();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 130
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      DIN dIN0 = new DIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<din>\n  <dupkey></dupkey>\n    <lsn/>\n    <key v=\"\"/>\n    <target/>\n    <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</din>");
      // Undeclared exception!
      try { 
        dIN0.readFromLog(byteBuffer0, (byte)0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.readFromLog((ByteBuffer) null, (byte)10);
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
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[8];
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        dIN0.incrementDuplicateCount((LockResult) null, byteArray0, txn0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.getLogSize();
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
      DIN dIN0 = new DIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<din>\n  <dupkey></dupkey>\n    <lsn/>\n    <key v=\"\"/>\n    <target/>\n    <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</din>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      byteBuffer1.compact();
      dIN0.readFromLog(byteBuffer1, (byte)0);
      // Undeclared exception!
      try { 
        dIN0.getDupCountLN();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLN dIN_DIN_updateDupCountLN0 = new DIN.DIN_updateDupCountLN(dIN0, dIN0);
      dIN_DIN_updateDupCountLN0.execute();
      // Undeclared exception!
      try { 
        dIN0.getDupCountLN();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.DIN cannot be cast to com.sleepycat.je.tree.DupCountLN
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.getChildKey((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.dumpLogAdditional((StringBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[3];
      DIN dIN0 = null;
      try {
        dIN0 = new DIN(databaseImpl0, byteArray0, (-2646), byteArray0, (ChildReference) null, 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      DIN dIN0 = new DIN();
      String string0 = dIN0.beginTag();
      assertEquals("<din>", string0);
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test26()  throws Throwable  {
      DIN dIN0 = new DIN();
      String string0 = dIN0.endTag();
      assertEquals("DIN", dIN0.shortClassName());
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
      assertEquals("</din>", string0);
  }

  @Test
  public void test27()  throws Throwable  {
      DIN dIN0 = new DIN();
      String string0 = dIN0.shortClassName();
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", string0);
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test29()  throws Throwable  {
      DIN dIN0 = new DIN();
      String string0 = dIN0.dumpString(0, false);
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
      assertEquals("  <dupkey></dupkey>\n    <lsn/>\n    <key v=\"\"/>\n    <target/>\n    <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n", string0);
  }

  @Test
  public void test30()  throws Throwable  {
      DIN dIN0 = new DIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<din>\n  <dupkey></dupkey>\n    <lsn/>\n    <key v=\"\"/>\n    <target/>\n    <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</din>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      byteBuffer1.compact();
      dIN0.readFromLog(byteBuffer1, (byte)0);
      assertEquals(298, byteBuffer1.remaining());
      
      String string0 = dIN0.dumpString((byte)0, true);
      assertEquals("<din>\n  <dupkey><key v=\"\"/></dupkey>\n  <dupCountLN/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</din>", string0);
  }

  @Test
  public void test31()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.dumpString((-1605), false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1603
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      DIN dIN0 = new DIN();
      StringWriter stringWriter0 = new StringWriter(1);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dIN0.dumpLogAdditional(stringBuffer0);
      assertEquals(119, stringBuffer0.length());
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test33()  throws Throwable  {
      DIN dIN0 = new DIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<din>\n  <dupkey></dupkey>\n    <lsn/>\n    <key v=\"\"/>\n    <target/>\n    <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</din>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      byteBuffer1.compact();
      dIN0.readFromLog(byteBuffer1, (byte)0);
      dIN0.writeToLog(byteBuffer1);
      assertEquals(393, byteBuffer1.position());
      assertEquals("java.nio.HeapByteBuffer[pos=393 lim=656 cap=656]", byteBuffer1.toString());
  }

  @Test
  public void test34()  throws Throwable  {
      DIN dIN0 = new DIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<din>\n  <dupkey></dupkey>\n    <lsn/>\n    <key v=\"\"/>\n    <target/>\n    <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</din>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      byteBuffer1.compact();
      dIN0.readFromLog(byteBuffer1, (byte)0);
      assertEquals(298, byteBuffer1.remaining());
      
      int int0 = dIN0.getLogSize();
      assertEquals(35, int0);
  }

  @Test
  public void test35()  throws Throwable  {
      DIN dIN0 = new DIN();
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        dIN0.logInternal((LogManager) null, false, false, false, bIN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test36()  throws Throwable  {
      DIN dIN0 = new DIN();
      TreeLocation treeLocation0 = new TreeLocation();
      boolean boolean0 = dIN0.matchLNByNodeId(treeLocation0, (-1L));
      assertEquals(0, dIN0.getLevel());
      assertFalse(boolean0);
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test37()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getDupTreeKey();
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test38()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getDupCountLNRef();
      dIN0.updateDupCountLNRef(412L);
      assertTrue(dIN0.getDirty());
  }

  @Test
  public void test39()  throws Throwable  {
      DIN dIN0 = new DIN();
      boolean boolean0 = dIN0.containsDuplicates();
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(boolean0);
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test40()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getDupKey();
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test42()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getLogType();
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test43()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.accumulateStats((TreeWalkerStatsAccumulator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      DIN dIN0 = new DIN();
      boolean boolean0 = dIN0.isDbRoot();
      assertTrue(dIN0.needsSplitting());
      assertFalse(boolean0);
      assertEquals("DIN", dIN0.shortClassName());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test46()  throws Throwable  {
      DIN dIN0 = new DIN();
      try { 
        dIN0.getDupCountLN();
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // fetchTarget of null lsn IN=0 state=0 NULL_LSN without KnownDeleted
         //
         assertThrownBy("com.sleepycat.je.tree.ChildReference", e);
      }
  }

  @Test
  public void test47()  throws Throwable  {
      DIN dIN0 = new DIN();
      String string0 = dIN0.toString();
      assertTrue(dIN0.needsSplitting());
      assertEquals("<din>\n  <dupkey></dupkey>\n    <lsn/>\n    <key v=\"\"/>\n    <target/>\n    <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</din>", string0);
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test48()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getMainTreeKey();
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test49()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getChildKey(dIN0);
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test50()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[3];
      ChildReference childReference0 = new ChildReference((Node) dIN0, byteArray0, 0L);
      dIN0.setDupCountLN(childReference0);
      dIN0.getDupCountLNRef();
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test51()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.getKeyComparator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test52()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.updateDupCountLNRefAndNullTarget(1);
      assertTrue(dIN0.getDirty());
  }

  @Test
  public void test53()  throws Throwable  {
      DIN dIN0 = new DIN();
      DupCountLN dupCountLN0 = new DupCountLN(1);
      dIN0.updateDupCountLN(dupCountLN0);
      dIN0.getDupCountLN();
      //  // Unstable assertion: assertEquals(1L, dIN0.getLastId());
  }
}
