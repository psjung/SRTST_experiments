/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:36:27 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.GetMode;
import com.sleepycat.je.txn.Locker;
import com.sleepycat.je.txn.Txn;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbInternal_ESTest1 extends DbInternal_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.setTxnNoSync(true);
      EnvironmentMutableConfig environmentMutableConfig1 = DbInternal.cloneMutableConfig(environmentMutableConfig0);
      assertFalse(environmentMutableConfig1.getTxnWriteNoSync());
  }

  @Test
  public void test01()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      EnvironmentConfig environmentConfig1 = DbInternal.cloneConfig(environmentConfig0);
      assertFalse(environmentConfig1.getAllowCreate());
  }

  @Test
  public void test03()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      EnvironmentConfig environmentConfig1 = environmentConfig0.cloneConfig();
      DbInternal.copyMutablePropsTo(environmentConfig1, environmentConfig0);
      assertNotSame(environmentConfig1, environmentConfig0);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)57, (-1929));
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
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
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockMode lockMode0 = LockMode.READ_UNCOMMITTED;
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        DbInternal.position((Cursor) null, databaseEntry0, databaseEntry1, lockMode0, false);
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
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = DbInternal.getTxnReadCommitted(environmentConfig0);
      assertTrue(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      DbInternal dbInternal0 = new DbInternal();
  }

  @Test
  public void test12()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      DbInternal.setLoadPropertyFile(environmentConfig0, true);
      assertFalse(environmentConfig0.getReadOnly());
  }

  @Test
  public void test16()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbInternal.checkImmutablePropsForEquality(environmentConfig0, environmentConfig0);
      assertFalse(environmentConfig0.getReadOnly());
  }

  @Test
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.setCheckpointUP((EnvironmentConfig) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
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
  public void test26()  throws Throwable  {
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
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      // Undeclared exception!
      try { 
        DbInternal.checkImmutablePropsForEquality((EnvironmentMutableConfig) null, environmentConfig0);
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
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentConfig environmentConfig1 = DbInternal.cloneConfig(environmentConfig0);
      environmentConfig1.setTxnSerializableIsolation(true);
      assertFalse(environmentConfig1.getTxnNoSync());
  }

  @Test
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      boolean boolean0 = DbInternal.getCreateUP(environmentConfig0);
      assertTrue(boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      LockMode lockMode0 = LockMode.READ_UNCOMMITTED;
      GetMode getMode0 = GetMode.NEXT_NODUP;
      // Undeclared exception!
      try { 
        DbInternal.retrieveNext((Cursor) null, (DatabaseEntry) null, (DatabaseEntry) null, lockMode0, getMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      boolean boolean0 = DbInternal.getCheckpointUP(environmentConfig0);
      assertTrue(boolean0);
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
  public void test42()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      EnvironmentMutableConfig environmentMutableConfig1 = DbInternal.cloneMutableConfig(environmentMutableConfig0);
      assertNotSame(environmentMutableConfig1, environmentMutableConfig0);
  }

  @Test
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
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
  public void test45()  throws Throwable  {
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

  
}