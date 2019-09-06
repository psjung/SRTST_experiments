/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:26:39 KST 2017
 */

package com.sleepycat.compat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.compat.DbCompat;
import com.sleepycat.je.Cursor;
import com.sleepycat.je.CursorConfig;
import com.sleepycat.je.Database;
import com.sleepycat.je.DatabaseConfig;
import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.Environment;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.LockMode;
import com.sleepycat.je.SecondaryConfig;
import com.sleepycat.je.SecondaryCursor;
import com.sleepycat.je.Transaction;
import com.sleepycat.je.TransactionConfig;
import java.io.File;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbCompat_ESTest4 extends DbCompat_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.READ_COMMITTED;
      CursorConfig cursorConfig1 = DbCompat.cloneCursorConfig(cursorConfig0);
      assertNotSame(cursorConfig1, cursorConfig0);
      assertTrue(cursorConfig1.getReadCommitted());
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      // Undeclared exception!
      try { 
        DbCompat.setRecordLength(databaseConfig0, (-2365));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      DbCompat.setSortedDuplicates(secondaryConfig0, true);
      assertTrue(secondaryConfig0.getSortedDuplicates());
  }

  @Test
  public void test03()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
      DbCompat.setSerializableIsolation(transactionConfig0, false);
      assertFalse(transactionConfig0.getSerializableIsolation());
  }

  @Test
  public void test04()  throws Throwable  {
      Environment environment0 = null;
      Transaction transaction0 = null;
      String string0 = "";
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      // Undeclared exception!
      try { 
        DbCompat.openDatabase((Environment) null, (Transaction) null, "", "", databaseConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      Environment environment0 = null;
      // Undeclared exception!
      try { 
        DbCompat.getThreadTransaction(environment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      boolean boolean0 = DbCompat.getSortedDuplicates(databaseConfig0);
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      File file0 = null;
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      Environment environment0 = null;
      try {
        environment0 = new Environment(file0, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // envHome cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      DbCompat.setSortedDuplicates(databaseConfig0, false);
      assertFalse(databaseConfig0.getSortedDuplicates());
  }

  @Test
  public void test09()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
      assertFalse(transactionConfig0.getSerializableIsolation());
      
      DbCompat.setSerializableIsolation(transactionConfig0, true);
      assertTrue(transactionConfig0.getSerializableIsolation());
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      // Undeclared exception!
      try { 
        DbCompat.openDatabase((Environment) null, (Transaction) null, (String) null, "", databaseConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      // Undeclared exception!
      try { 
        DbCompat.setRecordLength(databaseConfig0, 3346);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      DbCompat.setRecordLength(databaseConfig0, 0);
      assertEquals(0, databaseConfig0.getNodeMaxDupTreeEntries());
  }

  @Test
  public void test14()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      // Undeclared exception!
      try { 
        DbCompat.setUnsortedDuplicates(databaseConfig0, true);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      DbCompat.setUnsortedDuplicates(secondaryConfig0, false);
      assertFalse(secondaryConfig0.getSortedDuplicates());
  }

  @Test
  public void test16()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      // Undeclared exception!
      try { 
        DbCompat.setInitializeCDB(environmentConfig0, true);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbCompat.setInitializeCDB(environmentConfig0, false);
      assertEquals(0L, environmentConfig0.getCacheSize());
  }

  @Test
  public void test18()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      // Undeclared exception!
      try { 
        DbCompat.setInitializeLocking(environmentConfig0, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbCompat.setInitializeLocking(environmentConfig0, true);
      assertFalse(environmentConfig0.getTxnSerializableIsolation());
  }

  @Test
  public void test20()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      // Undeclared exception!
      try { 
        DbCompat.setInitializeCache(environmentConfig0, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbCompat.setInitializeCache(environmentConfig0, true);
      assertFalse(environmentConfig0.getTxnNoSync());
  }

  @Test
  public void test22()  throws Throwable  {
      CursorConfig cursorConfig0 = new CursorConfig();
      // Undeclared exception!
      try { 
        DbCompat.setWriteCursor(cursorConfig0, true);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.DIRTY_READ;
      boolean boolean0 = DbCompat.getWriteCursor(cursorConfig0);
      assertFalse(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)39, (int) (byte) (-108));
      // Undeclared exception!
      try { 
        DbCompat.append((Database) null, (Transaction) null, databaseEntry0, databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      boolean boolean0 = DbCompat.getInitializeLocking((EnvironmentConfig) null);
      assertTrue(boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbCompat.setSortedDuplicates((DatabaseConfig) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      // Undeclared exception!
      try { 
        DbCompat.setTypeHash(secondaryConfig0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbCompat.getSortedDuplicates((DatabaseConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      // Undeclared exception!
      try { 
        DbCompat.setRecordPad(secondaryConfig0, (-1287));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      DbCompat.setReadUncommitted(databaseConfig0, true);
      assertFalse(databaseConfig0.getAllowCreate());
  }

  @Test
  public void test32()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        DbCompat.getRecordNumber(databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      // Undeclared exception!
      try { 
        DbCompat.setRenumbering(secondaryConfig0, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        DbCompat.setRecordNumber(databaseEntry0, 3346);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test35()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      boolean boolean0 = DbCompat.isTypeRecno(secondaryConfig0);
      assertFalse(boolean0);
  }

  @Test
  public void test36()  throws Throwable  {
      DbCompat dbCompat0 = new DbCompat();
  }

  @Test
  public void test37()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      // Undeclared exception!
      try { 
        DbCompat.setTypeRecno(secondaryConfig0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        DbCompat.putBefore((Cursor) null, databaseEntry0, databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test39()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      boolean boolean0 = DbCompat.isTypeHash(databaseConfig0);
      assertFalse(boolean0);
  }

  @Test
  public void test40()  throws Throwable  {
      boolean boolean0 = DbCompat.isTypeBtree((DatabaseConfig) null);
      assertTrue(boolean0);
  }

  @Test
  public void test41()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      // Undeclared exception!
      try { 
        DbCompat.openDatabase((Environment) null, (Transaction) null, "w1?'D+", "Database.putNoOverwrite", secondaryConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      boolean boolean0 = DbCompat.getUnsortedDuplicates(secondaryConfig0);
      assertFalse(boolean0);
  }

  @Test
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbCompat.setSerializableIsolation((TransactionConfig) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbCompat.cloneCursorConfig((CursorConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbCompat.getInitializeCDB(environmentConfig0);
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      databaseConfig0.setReadOnly(false);
      databaseConfig0.setNodeMaxDupTreeEntries(5);
      databaseConfig0.setExclusiveCreate(false);
      DbCompat dbCompat0 = new DbCompat();
      DbCompat.getSortedDuplicates(databaseConfig0);
      CursorConfig cursorConfig0 = CursorConfig.READ_UNCOMMITTED;
      DbCompat.setWriteCursor(cursorConfig0, false);
      DbCompat.getReadUncommitted(databaseConfig0);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        DbCompat.getRecordNumber(databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test46()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      // Undeclared exception!
      try { 
        DbCompat.setTypeQueue(secondaryConfig0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockMode lockMode0 = LockMode.READ_COMMITTED;
      // Undeclared exception!
      try { 
        DbCompat.getSearchRecordNumber((SecondaryCursor) null, databaseEntry0, databaseEntry0, databaseEntry0, lockMode0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-1360), (int) (byte)18);
      // Undeclared exception!
      try { 
        DbCompat.getSearchRecordNumber((Cursor) null, (DatabaseEntry) null, databaseEntry0, (LockMode) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test49()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        DbCompat.putAfter((Cursor) null, databaseEntry0, databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test50()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockMode lockMode0 = LockMode.RMW;
      // Undeclared exception!
      try { 
        DbCompat.getCurrentRecordNumber((Cursor) null, databaseEntry0, lockMode0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test51()  throws Throwable  {
      String string0 = DbCompat.getDatabaseFile((Database) null);
      assertNull(string0);
  }

  @Test
  public void test52()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      // Undeclared exception!
      try { 
        DbCompat.setBtreeRecordNumbers(secondaryConfig0, true);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test53()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      // Undeclared exception!
      try { 
        DbCompat.setBtreeComparator(databaseConfig0, (Comparator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test54()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbCompat.setLockDetectModeOldest(environmentConfig0);
      assertFalse(environmentConfig0.getTransactional());
  }

  @Test
  public void test55()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      boolean boolean0 = DbCompat.getBtreeRecordNumbers(secondaryConfig0);
      assertFalse(boolean0);
  }

  @Test
  public void test56()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      boolean boolean0 = DbCompat.getRenumbering(secondaryConfig0);
      assertFalse(boolean0);
  }

  @Test
  public void test58()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      boolean boolean0 = DbCompat.isTypeQueue(secondaryConfig0);
      assertFalse(boolean0);
  }
}
