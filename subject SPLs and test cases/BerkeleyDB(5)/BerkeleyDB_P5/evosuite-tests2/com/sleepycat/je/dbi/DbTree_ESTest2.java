/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:23:26 KST 2017
 */

package com.sleepycat.je.dbi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.DbTree;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.tree.NameLN;
import com.sleepycat.je.txn.Locker;
import java.io.File;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbTree_ESTest2 extends DbTree_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = new DatabaseId();
      DatabaseImpl databaseImpl0 = dbTree0.getDb(databaseId0, 4294967296L);
      // Undeclared exception!
      try { 
        databaseImpl0.releaseDeletedINs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      File file0 = null;
      Properties properties0 = null;
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig(properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.hook309(false, (CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      boolean boolean0 = false;
      CursorImpl cursorImpl0 = null;
      // Undeclared exception!
      try { 
        dbTree0.hook307(false, (CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("[$");
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

  @Test
  public void test05()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = new DatabaseId();
      dbTree0.getDbName(databaseId0);
      boolean boolean0 = true;
      CursorImpl cursorImpl0 = null;
      // Undeclared exception!
      try { 
        dbTree0.hook308(boolean0, cursorImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      boolean boolean0 = false;
      CursorImpl cursorImpl0 = null;
      // Undeclared exception!
      try { 
        dbTree0.hook309(false, (CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      CursorImpl cursorImpl0 = null;
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
  public void test08()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      CursorImpl cursorImpl0 = null;
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
  public void test09()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      CursorImpl cursorImpl0 = null;
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
  public void test10()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      String string0 = dbTree0.dumpString(0);
      assertEquals("<dbTree lastDbId =\"0\">\n <database id=\"0\"/>\n <database id=\"0\"/>\n</dbtree>", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = new DatabaseId();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("[$");
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

  @Test
  public void test13()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(" non-existent database ");
      byteBuffer0.clear();
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

  @Test
  public void test14()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      StringWriter stringWriter0 = new StringWriter(2123);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dbTree0.dumpLog(stringBuffer0, false);
      assertEquals("<dbtree lastId = \"0\"><idDb><database><dbId id=\"0\"/><root></root><dupsort v=\"false\"/><btcf name=\"\"/><dupcf name=\"\"/></database></idDb><nameDb><database><dbId id=\"0\"/><root></root><dupsort v=\"false\"/><btcf name=\"\"/><dupcf name=\"\"/></database></nameDb></dbtree>", stringBuffer0.toString());
      assertEquals("<dbtree lastId = \"0\"><idDb><database><dbId id=\"0\"/><root></root><dupsort v=\"false\"/><btcf name=\"\"/><dupcf name=\"\"/></database></idDb><nameDb><database><dbId id=\"0\"/><root></root><dupsort v=\"false\"/><btcf name=\"\"/><dupcf name=\"\"/></database></nameDb></dbtree>", stringWriter0.toString());
  }

  @Test
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.readFromLog((ByteBuffer) null, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = new DatabaseId(2);
      // Undeclared exception!
      try { 
        dbTree0.getDb(databaseId0, (long) 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      DatabaseImpl databaseImpl0 = dbTree0.getDb(databaseId0);
      //  // Unstable assertion: assertEquals(641L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test20()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.dumpString((-1651));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1651
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      DatabaseImpl databaseImpl0 = dbTree0.getDb(databaseId0, 1L, true, "");
      //  // Unstable assertion: assertEquals(619L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test22()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = new DatabaseId();
      DatabaseImpl databaseImpl0 = dbTree0.getDb(databaseId0, (-783L), false, "lqA+(yqP*XRuGXy[:");
      //  // Unstable assertion: assertEquals(607L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test23()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = new DatabaseId();
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
  public void test24()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      boolean boolean0 = dbTree0.isReservedDbName("_jeIdMap");
      assertTrue(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      boolean boolean0 = dbTree0.isReservedDbName("<dbtree lastId = \"");
      assertFalse(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = new DatabaseId();
      dbTree0.getDbName(databaseId0);
      CursorImpl cursorImpl0 = null;
      // Undeclared exception!
      try { 
        dbTree0.hook293(cursorImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      String string0 = dbTree0.getDbName(databaseId0);
      assertEquals("_jeIdMap", string0);
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
      DatabaseId databaseId0 = new DatabaseId();
      HashMap<DbTree, NameLN> hashMap0 = new HashMap<DbTree, NameLN>();
      dbTree0.getDb(databaseId0, (-22L), (Map) hashMap0);
      DatabaseImpl databaseImpl0 = dbTree0.getDb(databaseId0, (-22L), (Map) hashMap0);
      //  // Unstable assertion: assertEquals(1, hashMap0.size());
      //  // Unstable assertion: assertEquals(427L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test31()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = DbTree.NAME_DB_ID;
      HashMap<DbTree, NameLN> hashMap0 = new HashMap<DbTree, NameLN>();
      // Undeclared exception!
      try { 
        dbTree0.getDb(databaseId0, (-22L), (Map) hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = new DatabaseId();
      DatabaseImpl databaseImpl0 = dbTree0.getDb(databaseId0);
      //  // Unstable assertion: assertEquals(349L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test34()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.hook308(true, (CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
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
      int int0 = dbTree0.getLastDbId();
      assertEquals(0, int0);
  }

  @Test
  public void test37()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      int int0 = dbTree0.getLogSize();
      assertEquals(48, int0);
  }

  @Test
  public void test38()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      dbTree0.setLastDbId(0);
      assertEquals(0, dbTree0.getLastDbId());
  }

  @Test
  public void test39()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.hook303((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
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
  public void test42()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      long long0 = dbTree0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test43()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.hook310(true, (CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test44()  throws Throwable  {
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
  public void test45()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      dbTree0.postLogWork(1463L);
      assertTrue(dbTree0.marshallOutsideWriteLatch());
  }

  @Test
  public void test46()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.hook306(true, (CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      boolean boolean0 = dbTree0.logEntryIsTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test49()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.dbRemove((Locker) null, "<btcf name=\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test50()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      // Undeclared exception!
      try { 
        dbTree0.hook293((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbTree", e);
      }
  }

  @Test
  public void test51()  throws Throwable  {
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
  public void test52()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      boolean boolean0 = dbTree0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
  }

  @Test
  public void test53()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      boolean boolean0 = dbTree0.marshallOutsideWriteLatch();
      assertTrue(boolean0);
  }

  @Test
  public void test54()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      DatabaseId databaseId0 = new DatabaseId();
      DatabaseImpl databaseImpl0 = dbTree0.getDb(databaseId0, 4294967296L);
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
  public void test55()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      dbTree0.dump();
      assertTrue(dbTree0.marshallOutsideWriteLatch());
  }

  @Test
  public void test56()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      LogEntryType logEntryType0 = dbTree0.getLogType();
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test57()  throws Throwable  {
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
  public void test58()  throws Throwable  {
      DbTree dbTree0 = new DbTree();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("SearchMode.BOTH");
      // Undeclared exception!
      try { 
        dbTree0.readFromLog(byteBuffer0, (byte) (-46));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }
}
