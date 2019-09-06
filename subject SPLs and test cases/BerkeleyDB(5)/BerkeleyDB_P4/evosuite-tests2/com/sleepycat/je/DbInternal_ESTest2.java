/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:45:46 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.Cursor;
import com.sleepycat.je.CursorConfig;
import com.sleepycat.je.Database;
import com.sleepycat.je.DatabaseConfig;
import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.DbInternal;
import com.sleepycat.je.Environment;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.EnvironmentMutableConfig;
import com.sleepycat.je.LockMode;
import com.sleepycat.je.SecondaryConfig;
import com.sleepycat.je.Transaction;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.GetMode;
import com.sleepycat.je.txn.Locker;
import com.sleepycat.je.txn.Txn;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbInternal_ESTest2 extends DbInternal_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      boolean boolean0 = DbInternal.getCreateUP(environmentConfig0);
      assertTrue(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      EnvironmentMutableConfig environmentMutableConfig1 = DbInternal.cloneMutableConfig(environmentMutableConfig0);
      assertEquals(0L, environmentMutableConfig1.getCacheSize());
  }

  @Test
  public void test02()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentConfig environmentConfig1 = DbInternal.cloneConfig(environmentConfig0);
      DbInternal.setTxnReadCommitted(environmentConfig1, true);
      assertFalse(environmentConfig1.getAllowCreate());
  }

  @Test
  public void test03()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setReadOnly(true);
      EnvironmentConfig environmentConfig1 = DbInternal.cloneConfig(environmentConfig0);
      assertFalse(environmentConfig1.equals((Object)environmentConfig0));
  }

  @Test
  public void test04()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentConfig environmentConfig1 = DbInternal.cloneConfig(environmentConfig0);
      environmentConfig1.setLocking(false);
      assertFalse(environmentConfig0.equals((Object)environmentConfig1));
  }

  @Test
  public void test05()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentConfig environmentConfig1 = DbInternal.cloneConfig(environmentConfig0);
      environmentConfig1.setCreateUP(false);
      assertFalse(environmentConfig1.equals((Object)environmentConfig0));
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setAllowCreate(true);
      EnvironmentConfig environmentConfig1 = DbInternal.cloneConfig(environmentConfig0);
      assertFalse(environmentConfig1.equals((Object)environmentConfig0));
  }

  @Test
  public void test07()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentConfig environmentConfig1 = DbInternal.cloneConfig(environmentConfig0);
      DbInternal.copyMutablePropsTo(environmentConfig1, environmentConfig0);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test08()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0, (-3147), 0);
      // Undeclared exception!
      try { 
        DbInternal.advanceCursor((Cursor) null, databaseEntry0, databaseEntry1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      LockMode lockMode0 = LockMode.DEFAULT;
      // Undeclared exception!
      try { 
        DbInternal.retrieveNext((Cursor) null, databaseEntry0, databaseEntry1, lockMode0, (GetMode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      Cursor cursor0 = null;
      byte[] byteArray0 = new byte[9];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockMode lockMode0 = LockMode.DEFAULT;
      GetMode getMode0 = null;
      // Undeclared exception!
      try { 
        DbInternal.retrieveNext(cursor0, databaseEntry0, databaseEntry0, lockMode0, getMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      File file0 = null;
      // Undeclared exception!
      try { 
        DbInternal.getEnvironmentShell(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      Environment environment0 = null;
      // Undeclared exception!
      try { 
        DbInternal.getDefaultTxnConfig(environment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      Environment environment0 = null;
      // Undeclared exception!
      try { 
        DbInternal.envGetEnvironmentImpl(environment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = false;
      DbInternal.setCheckpointUP(environmentConfig0, boolean0);
      assertEquals(0L, environmentConfig0.getCacheSize());
  }

  @Test
  public void test17()  throws Throwable  {
      Environment environment0 = null;
      // Undeclared exception!
      try { 
        DbInternal.getDefaultTxnConfig(environment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      Database database0 = secondaryConfig0.getForeignKeyDatabase();
      // Undeclared exception!
      try { 
        DbInternal.dbInvalidate(database0);
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
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.setUseExistingConfig((DatabaseConfig) null, false);
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
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
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
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentConfig environmentConfig1 = DbInternal.cloneConfig(environmentConfig0);
      environmentConfig0.setReadOnly(true);
      try { 
        DbInternal.checkImmutablePropsForEquality(environmentConfig1, environmentConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // je.env.isReadOnly is set to true in the config parameter which is incompatible with the value of null in the underlying environment
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      boolean boolean0 = DbInternal.getCheckpointUP(environmentConfig0);
      assertTrue(boolean0);
  }

  @Test
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbInternal.checkImmutablePropsForEquality(environmentConfig0, environmentConfig0);
      assertFalse(environmentConfig0.getReadOnly());
  }

  @Test
  public void test33()  throws Throwable  {
      DbInternal dbInternal0 = new DbInternal();
  }

  @Test
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-1226), 0);
      LockMode lockMode0 = LockMode.READ_COMMITTED;
      // Undeclared exception!
      try { 
        DbInternal.position((Cursor) null, databaseEntry0, (DatabaseEntry) null, lockMode0, true);
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
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbInternal.setLoadPropertyFile(environmentConfig0, true);
      assertEquals(0L, environmentConfig0.getCacheSize());
  }

  @Test
  public void test36()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Txn txn0 = new Txn();
      CursorConfig cursorConfig0 = CursorConfig.READ_COMMITTED;
      // Undeclared exception!
      try { 
        DbInternal.newCursor(databaseImpl0, txn0, cursorConfig0);
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
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbInternal.disableParameterValidation(environmentConfig0);
      assertFalse(environmentConfig0.getTxnNoSync());
  }

  @Test
  public void test38()  throws Throwable  {
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
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
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
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      DbInternal.databaseConfigValidate(databaseConfig0, databaseConfig0);
      assertFalse(databaseConfig0.getReadOnly());
  }
}
