/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:29:14 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.GetMode;
import com.sleepycat.je.txn.Locker;
import com.sleepycat.je.txn.Txn;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbInternal_ESTest5 extends DbInternal_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      boolean boolean0 = DbInternal.getCheckpointUP(environmentConfig0);
      assertTrue(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.setLoadPropertyFile(false);
      EnvironmentMutableConfig environmentMutableConfig1 = DbInternal.cloneMutableConfig(environmentMutableConfig0);
      assertFalse(environmentMutableConfig1.equals((Object)environmentMutableConfig0));
  }

  @Test
  public void test02()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      EnvironmentConfig environmentConfig1 = environmentConfig0.cloneConfig();
      DbInternal.copyMutablePropsTo(environmentConfig1, environmentConfig0);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test03()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[9];
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0);
      LockMode lockMode0 = LockMode.RMW;
      GetMode getMode0 = GetMode.PREV;
      // Undeclared exception!
      try { 
        DbInternal.retrieveNext((Cursor) null, databaseEntry0, databaseEntry1, lockMode0, getMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0, 9, (int) (byte) (-27));
      LockMode lockMode0 = LockMode.READ_UNCOMMITTED;
      // Undeclared exception!
      try { 
        DbInternal.position((Cursor) null, databaseEntry0, databaseEntry1, lockMode0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      Transaction transaction0 = null;
      File file0 = null;
      Environment environment0 = null;
      try {
        environment0 = new Environment(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Cursor cursor0 = null;
      // Undeclared exception!
      try { 
        DbInternal.getCursorImpl((Cursor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      LockMode lockMode0 = LockMode.DIRTY_READ;
      lockMode0.toString();
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
  public void test09()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = DbInternal.getCreateUP(environmentConfig0);
      assertTrue(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = DbInternal.getCheckpointUP(environmentConfig0);
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      File file0 = null;
      Environment environment0 = null;
      try {
        environment0 = new Environment(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Environment environment0 = null;
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      Database database0 = null;
      SecondaryDatabase secondaryDatabase0 = null;
      try {
        secondaryDatabase0 = new SecondaryDatabase(environment0, secondaryConfig0, database0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      File file0 = null;
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
  public void test14()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbInternal.setCreateUP(environmentConfig0, false);
      assertFalse(environmentConfig0.getTxnSerializableIsolation());
  }

  @Test
  public void test15()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbInternal.checkImmutablePropsForEquality(environmentConfig0, environmentConfig0);
      assertFalse(environmentConfig0.getTransactional());
  }

  @Test
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.setLoadPropertyFile((EnvironmentConfig) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.setCheckpointUP((EnvironmentConfig) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.getTxnReadCommitted((EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.getEnvironmentShell((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.disableParameterValidation((EnvironmentMutableConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.databaseConfigValidate((DatabaseConfig) null, (DatabaseConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.copyMutablePropsTo((EnvironmentMutableConfig) null, (EnvironmentMutableConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.cloneMutableConfig((EnvironmentMutableConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.cloneConfig((EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.dbGetDatabaseImpl((Database) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.getDefaultTxnConfig((Environment) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      EnvironmentConfig environmentConfig1 = DbInternal.cloneConfig(environmentConfig0);
      assertEquals(0L, environmentConfig1.getCacheSize());
  }

  @Test
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.checkImmutablePropsForEquality((EnvironmentMutableConfig) null, (EnvironmentMutableConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      DbInternal dbInternal0 = new DbInternal();
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-76), (int) (byte)0);
      // Undeclared exception!
      try { 
        DbInternal.advanceCursor((Cursor) null, (DatabaseEntry) null, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        DbInternal.dbSetHandleLocker((Database) null, txn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.getCreateUP((EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test35()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      DbInternal.setLoadPropertyFile(environmentConfig0, false);
      assertFalse(environmentConfig0.getTxnNoSync());
  }

  @Test
  public void test36()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        DbInternal.newCursor(databaseImpl0, txn0, (CursorConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Cursor", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.dbInvalidate((Database) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      DbInternal.disableParameterValidation(environmentConfig0);
      assertFalse(environmentConfig0.getReadOnly());
  }

  @Test
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.getCheckpointUP((EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.getLocker((Transaction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      DbInternal.setUseExistingConfig(databaseConfig0, false);
      assertFalse(databaseConfig0.getExclusiveCreate());
  }

  @Test
  public void test42()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      DbInternal.setTxnReadCommitted(environmentConfig0, true);
      assertFalse(environmentConfig0.getReadOnly());
  }

  @Test
  public void test43()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      DbInternal.setCheckpointUP(environmentConfig0, false);
      assertFalse(environmentConfig0.getTxnSerializableIsolation());
  }

  @Test
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.envGetEnvironmentImpl((Environment) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      EnvironmentMutableConfig environmentMutableConfig1 = DbInternal.cloneMutableConfig(environmentMutableConfig0);
      assertFalse(environmentMutableConfig0.equals((Object)environmentMutableConfig1));
  }

  @Test
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.getSortedCursors((JoinCursor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.setCreateUP((EnvironmentConfig) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test48()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      DbInternal.databaseConfigValidate(databaseConfig0, secondaryConfig0);
      assertEquals(0, databaseConfig0.getNodeMaxDupTreeEntries());
  }
}
