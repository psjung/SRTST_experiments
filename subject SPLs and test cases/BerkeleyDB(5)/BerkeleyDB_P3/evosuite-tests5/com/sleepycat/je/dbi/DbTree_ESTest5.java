/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:26:54 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.Database;
import com.sleepycat.je.DatabaseConfig;
import com.sleepycat.je.DatabaseNotFoundException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.tree.MapLN;
import com.sleepycat.je.txn.Locker;
import com.sleepycat.je.txn.Txn;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbTree_ESTest5 extends DbTree_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      String string0 = dbTree0.dumpString(3);
      assertEquals("   <dbTree lastDbId =\"0\">\n    <database id=\"0\"/>\n    <database id=\"0\"/>\n</dbtree>", string0);
  }

  @Test
  public void test01()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.NAME_DB_ID;
      // Undeclared exception!
      try { 
        dbTree0.getDb(databaseId0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      String string0 = null;
      // Undeclared exception!
      try { 
        Charset.forName(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         assertThrownBy("java.nio.charset.Charset", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.rebuildINListMapDb();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      DbTree dbTree0 = null;
      try {
        dbTree0 = new DbTree((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      boolean boolean0 = true;
      CursorImpl cursorImpl0 = null;
      // Undeclared exception!
      try { 
        dbTree0.readFromLog((ByteBuffer) null, (byte)117);
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
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.NAME_DB_ID;
      CursorImpl cursorImpl0 = null;
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        dbTree0.getDb(databaseId0, 3406L, true, "Ax<>OhMz+cl`;W~Sc");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      HashMap<Object, DatabaseImpl> hashMap0 = new HashMap<Object, DatabaseImpl>();
      dbTree0.getDb(databaseId0, 0L, (Map) hashMap0);
      CursorImpl cursorImpl0 = null;
      // Undeclared exception!
      try { 
        dbTree0.hook305(cursorImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      CursorImpl cursorImpl0 = null;
      DatabaseId databaseId0 = new DatabaseId(0);
      dbTree0.getDbName(databaseId0);
      // Undeclared exception!
      try { 
        dbTree0.hook303(cursorImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      HashMap<Object, DatabaseImpl> hashMap0 = new HashMap<Object, DatabaseImpl>();
      dbTree0.getDb(databaseId0, 0L, (Map) hashMap0);
      CursorImpl cursorImpl0 = null;
      // Undeclared exception!
      try { 
        dbTree0.hook299(cursorImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      HashMap<Object, DatabaseImpl> hashMap0 = new HashMap<Object, DatabaseImpl>();
      dbTree0.getDb(databaseId0, 0L, (Map) hashMap0);
      // Undeclared exception!
      try { 
        dbTree0.getDbNames();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      HashMap<Object, DatabaseImpl> hashMap0 = new HashMap<Object, DatabaseImpl>();
      dbTree0.getDb(databaseId0, 0L, (Map) hashMap0);
      DatabaseImpl databaseImpl0 = dbTree0.getDb(databaseId0);
      //  // Unstable assertion: assertEquals(961L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test15()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      HashMap<Object, DatabaseImpl> hashMap0 = new HashMap<Object, DatabaseImpl>();
      dbTree0.getDb(databaseId0, 0L, (Map) hashMap0);
      // Undeclared exception!
      try { 
        dbTree0.deleteMapLN(databaseId0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      CursorImpl cursorImpl0 = null;
      // Undeclared exception!
      try { 
        dbTree0.hook303(cursorImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      String string0 = dbTree0.getDbName(databaseId0);
      assertEquals("_jeIdMap", string0);
  }

  @Test
  public void test19()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dbTree0.dumpLog(stringBuffer0, true);
      assertEquals(258, stringBuffer0.length());
      assertEquals("<dbtree lastId = \"0\"><idDb><database><dbId id=\"0\"/><root></root><dupsort v=\"false\"/><btcf name=\"\"/><dupcf name=\"\"/></database></idDb><nameDb><database><dbId id=\"0\"/><root></root><dupsort v=\"false\"/><btcf name=\"\"/><dupcf name=\"\"/></database></nameDb></dbtree>", stringWriter0.toString());
  }

  @Test
  public void test20()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("kHISUGqbkhFJ\"Md");
      // Undeclared exception!
      try { 
        dbTree0.readFromLog(byteBuffer0, (byte)80);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.getDbName((DatabaseId) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = new DatabaseId();
      DatabaseImpl databaseImpl0 = dbTree0.getDb(databaseId0, 110L, true, (String) null);
      //  // Unstable assertion: assertEquals(801L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test26()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      boolean boolean0 = dbTree0.isReservedDbName("?mS L-");
      assertFalse(boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      boolean boolean0 = dbTree0.isReservedDbName("_jeNameMap");
      assertTrue(boolean0);
  }

  @Test
  public void test28()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.getDbNames();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.NAME_DB_ID;
      String string0 = dbTree0.getDbName(databaseId0);
      assertEquals("_jeNameMap", string0);
  }

  @Test
  public void test30()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = new DatabaseId(0);
      HashMap<DatabaseImpl, MapLN> hashMap0 = new HashMap<DatabaseImpl, MapLN>();
      dbTree0.getDb(databaseId0, (-1943L), (Map) hashMap0);
      DatabaseImpl databaseImpl0 = dbTree0.getDb(databaseId0, 0L, (Map) hashMap0);
      assertFalse(hashMap0.isEmpty());
      assertEquals("_jeIdMap", databaseImpl0.getDebugName());
  }

  @Test
  public void test31()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      HashMap<Object, DatabaseImpl> hashMap0 = new HashMap<Object, DatabaseImpl>();
      dbTree0.getDb(databaseId0, 0L, (Map) hashMap0);
      String string0 = "";
      Locker locker0 = null;
      // Undeclared exception!
      try { 
        dbTree0.dbRename(locker0, string0, string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      // Undeclared exception!
      try { 
        dbTree0.deleteMapLN(databaseId0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = new DatabaseId();
      DatabaseImpl databaseImpl0 = dbTree0.getDb(databaseId0, 0L);
      // Undeclared exception!
      try { 
        dbTree0.modifyDbRoot(databaseImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.getHighestLevel();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree$RootLevel", e);
      }
  }

  @Test
  public void test35()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      String string0 = dbTree0.toString();
      assertEquals("<dbTree lastDbId =\"0\">\n <database id=\"0\"/>\n <database id=\"0\"/>\n</dbtree>", string0);
  }

  @Test
  public void test36()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      DatabaseImpl databaseImpl0 = dbTree0.getDb(databaseId0);
      //  // Unstable assertion: assertEquals(393L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test37()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.dumpString((-930));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -930
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      int int0 = dbTree0.getLastDbId();
      assertEquals(0, int0);
  }

  @Test
  public void test39()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      int int0 = dbTree0.getLogSize();
      assertEquals(48, int0);
  }

  @Test
  public void test40()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.hook298((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      dbTree0.setLastDbId((-1742));
      int int0 = dbTree0.getLastDbId();
      assertEquals((-1742), int0);
  }

  @Test
  public void test43()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      Txn txn0 = new Txn();
      try { 
        dbTree0.dbRename(txn0, ".mS L-", ".mS L-");
        fail("Expecting exception: DatabaseNotFoundException");
      
      } catch(DatabaseNotFoundException e) {
         //
         // Attempted to rename non-existent database .mS L-
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test44()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      long long0 = dbTree0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test46()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.setEnvironmentImpl((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }

  @Test
  public void test47()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      dbTree0.postLogWork(48);
      assertEquals(0, dbTree0.getLastDbId());
  }

  @Test
  public void test49()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.hook304((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test50()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      boolean boolean0 = dbTree0.logEntryIsTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test51()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.getDb((Locker) null, " non-existent database ", (Database) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test53()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.hook299((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test54()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      // Undeclared exception!
      try { 
        dbTree0.createDb((Locker) null, "?mS L-", databaseConfig0, (Database) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }

  @Test
  public void test55()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      boolean boolean0 = dbTree0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
  }

  @Test
  public void test56()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      boolean boolean0 = dbTree0.marshallOutsideWriteLatch();
      assertTrue(boolean0);
  }

  @Test
  public void test57()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      DatabaseImpl databaseImpl0 = dbTree0.getDb(databaseId0, 0L);
      //  // Unstable assertion: assertEquals(39L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test58()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      dbTree0.dump();
      assertEquals(0, dbTree0.getLastDbId());
  }

  @Test
  public void test59()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      LogEntryType logEntryType0 = dbTree0.getLogType();
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test60()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test61()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.hook305((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test62()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("=~KWBkb|kcC:^<aZ5WO");
      // Undeclared exception!
      try { 
        dbTree0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }
}
