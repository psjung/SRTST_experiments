/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:41:13 KST 2017
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

import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.DbConfigManager;
import com.sleepycat.je.dbi.MemoryBudget;
import com.sleepycat.je.log.LogManager;
import com.sleepycat.je.txn.LockGrantType;
import com.sleepycat.je.txn.LockResult;
import com.sleepycat.je.txn.Txn;
import com.sleepycat.je.txn.WriteLockInfo;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DIN_ESTest2 extends DIN_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.selectKey((byte[]) null, (byte[]) null);
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test01()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[7];
      dIN0.setIdentifierKey(byteArray0);
      dIN0.getDupTreeKey();
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test02()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.setDupCountLN((ChildReference) null);
      dIN0.getDupCountLNRef();
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test03()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.updateDupCountLNRefAndNullTarget(1L);
      dIN0.getDupCountLNRef();
      assertTrue(dIN0.getDirty());
  }

  @Test
  public void test04()  throws Throwable  {
      DIN dIN0 = new DIN();
      DatabaseId databaseId0 = new DatabaseId();
      int int0 = dIN0.generateLevel(databaseId0, 1503);
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
      assertEquals(0, dIN0.getLevel());
      assertEquals(1503, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      DIN dIN0 = new DIN();
      int int0 = dIN0.generateLevel((DatabaseId) null, (byte) (-1));
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
      assertEquals((-1), int0);
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test06()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = new byte[0];
      byte[] byteArray2 = dIN0.selectKey(byteArray0, byteArray1);
      assertTrue(dIN0.needsSplitting());
      assertArrayEquals(new byte[] {}, byteArray2);
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test07()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        dIN0.createNewInstance(byteArray0, 1, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      DIN dIN0 = new DIN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      dIN0.init(databaseImpl0, (byte[]) null, (byte)99, (-879));
      dIN0.getKeyComparator();
      //  // Unstable assertion: assertEquals(151L, dIN0.getLastId());
  }

  @Test
  public void test09()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      long long0 = DIN.computeOverhead(dbConfigManager0);
      assertEquals(2736L, long0);
  }

  @Test
  public void test10()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LN lN0 = new LN(databaseEntry0);
      dIN0.updateDupCountLN(lN0);
      assertEquals(56L, dIN0.getInMemorySize());
  }

  @Test
  public void test11()  throws Throwable  {
      DIN dIN0 = new DIN();
      DatabaseId databaseId0 = new DatabaseId(0);
      int int0 = dIN0.generateLevel(databaseId0, 0);
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, int0);
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test12()  throws Throwable  {
      DIN dIN0 = new DIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("287^Ta");
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
  public void test13()  throws Throwable  {
      DIN dIN0 = new DIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<din>\n  <dupkey></dupkey>\n    <lsn/>\n    <key v=\"\"/>\n    <target/>\n    <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</din>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      // Undeclared exception!
      try { 
        dIN0.writeToLog(byteBuffer1);
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
      DIN dIN0 = new DIN();
      dIN0.setDupCountLN((ChildReference) null);
      // Undeclared exception!
      try { 
        dIN0.updateDupCountLNRefAndNullTarget((-961L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN$DIN_updateDupCountLNRefAndNullTarget", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference((Node) dIN0, byteArray0, 1194L);
      dIN0.setDupCountLN(childReference0);
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
  public void test16()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      DIN dIN0 = new DIN();
      ByteBuffer byteBuffer0 = mS949_0.encode("<dupCountLN/>");
      // Undeclared exception!
      try { 
        dIN0.readFromLog(byteBuffer0, (byte)42);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.readFromLog((ByteBuffer) null, (byte)0);
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
      LockGrantType lockGrantType0 = LockGrantType.EXISTING;
      Txn txn0 = new Txn();
      WriteLockInfo writeLockInfo0 = txn0.getWriteLockInfo(4294967296L);
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      byte[] byteArray0 = new byte[0];
      try { 
        dIN0.incrementDuplicateCount(lockResult0, byteArray0, txn0, true);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // fetchTarget of null lsn IN=0 state=0 NULL_LSN without KnownDeleted
         //
         assertThrownBy("com.sleepycat.je.tree.ChildReference", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.setDupCountLN((ChildReference) null);
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
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.dumpString((-2299), false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2297
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
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
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.computeMemorySize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[1];
      ChildReference childReference0 = new ChildReference();
      DIN dIN0 = null;
      try {
        dIN0 = new DIN(databaseImpl0, byteArray0, 808, byteArray0, childReference0, (int) (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.setDupCountLN((ChildReference) null);
      String string0 = dIN0.dumpString((byte) (-1), false);
      assertTrue(dIN0.needsSplitting());
      assertEquals(" <dupkey></dupkey>\n <dupCountLN/>\n <node>0</node>\n <idkey><key v=\"\"/></idkey>\n <dirty val=\"false\"/>\n <generation val=\"0\"/>\n <level val=\"0\"/>\n <isRoot val=\"false\"/>\n <entries nEntries=\"0\">\n </entries>\n", string0);
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test27()  throws Throwable  {
      DIN dIN0 = new DIN();
      String string0 = dIN0.dumpString(0, true);
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
      assertEquals("<din>\n  <dupkey></dupkey>\n    <lsn/>\n    <key v=\"\"/>\n    <target/>\n    <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</din>", string0);
  }

  @Test
  public void test28()  throws Throwable  {
      DIN dIN0 = new DIN();
      String string0 = dIN0.beginTag();
      assertTrue(dIN0.needsSplitting());
      assertEquals("<din>", string0);
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test29()  throws Throwable  {
      DIN dIN0 = new DIN();
      String string0 = dIN0.endTag();
      assertEquals("</din>", string0);
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test30()  throws Throwable  {
      DIN dIN0 = new DIN();
      boolean boolean0 = dIN0.isDbRoot();
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
      assertFalse(boolean0);
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test31()  throws Throwable  {
      DIN dIN0 = new DIN();
      String string0 = dIN0.shortClassName();
      assertEquals("DIN", string0);
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        DIN.computeOverhead((DbConfigManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.setDupCountLN((ChildReference) null);
      String string0 = dIN0.toString();
      assertTrue(dIN0.needsSplitting());
      assertEquals("<din>\n  <dupkey></dupkey>\n  <dupCountLN/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</din>", string0);
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test34()  throws Throwable  {
      DIN dIN0 = new DIN();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dIN0.dumpLogAdditional(stringBuffer0);
      assertEquals("<key v=\"<null>\"/><ref knownDeleted=\"false\" pendingDeleted=\"false\"><key v=\"\"/><DbLsn val=\"0xffffffff/0xffffffff\"/></ref>", stringBuffer0.toString());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test35()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.logInternal((LogManager) null, false, false, true, dBIN0);
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
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
      assertFalse(boolean0);
  }

  @Test
  public void test37()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.createNewInstance((byte[]) null, 3169, 3169);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getDupTreeKey();
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test39()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getDupCountLNRef();
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test40()  throws Throwable  {
      DIN dIN0 = new DIN();
      boolean boolean0 = dIN0.containsDuplicates();
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(boolean0);
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test41()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getDupKey();
      // Undeclared exception!
      try { 
        dIN0.createNewInstance((byte[]) null, 3169, 3169);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[1];
      ChildReference childReference0 = new ChildReference();
      DIN dIN0 = null;
      try {
        dIN0 = new DIN(databaseImpl0, byteArray0, (int) (byte) (-4), byteArray0, childReference0, (int) (byte) (-4));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test43()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getLogType();
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test44()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[8];
      dIN0.selectKey(byteArray0, byteArray0);
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.getMemoryOverhead((MemoryBudget) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.updateDupCountLNRef(2151L);
      assertTrue(dIN0.getDirty());
  }

  @Test
  public void test49()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getMainTreeKey();
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test50()  throws Throwable  {
      DIN dIN0 = new DIN();
      DBIN dBIN0 = new DBIN();
      dIN0.getChildKey(dBIN0);
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test51()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.setDupCountLN((ChildReference) null);
      // Undeclared exception!
      try { 
        dIN0.log((LogManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test52()  throws Throwable  {
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
}
