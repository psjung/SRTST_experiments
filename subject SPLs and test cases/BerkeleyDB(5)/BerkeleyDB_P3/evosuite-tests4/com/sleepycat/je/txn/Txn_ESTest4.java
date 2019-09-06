/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 16:35:54 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.StringWriter;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Properties;
import java.util.logging.MemoryHandler;

import javax.transaction.xa.Xid;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.LockStats;
import com.sleepycat.je.TransactionConfig;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.log.LogUtils;
import com.sleepycat.je.log.SyncedLogManager;
import com.sleepycat.je.log.entry.LNLogEntry;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.TreeLocation;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Txn_ESTest4 extends Txn_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      txn0.getTxnLocker();
      assertTrue(txn0.getOnlyAbortable());
  }

  @Test
  public void test01()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.getTxnLocker();
      txn0.addLogInfo(24);
      assertTrue(txn0.logEntryIsTransactional());
  }

  @Test
  public void test02()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = new Long((-1862L));
      txn0.hook812();
      LockType lockType0 = LockType.RESTART;
      LockGrantType lockGrantType0 = LockGrantType.PROMOTION;
      txn0.addLock(long0, (Lock) null, lockType0, lockGrantType0);
      assertFalse(lockType0.isWriteLock());
  }

  @Test
  public void test03()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.addLogInfo(24);
      txn0.addLogInfo((byte)50);
      assertFalse(txn0.isReadUncommittedDefault());
  }

  @Test
  public void test04()  throws Throwable  {
      Txn txn0 = new Txn();
      String string0 = "";
      // Undeclared exception!
      try { 
        Charset.forName(string0);
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 
         //
         assertThrownBy("java.nio.charset.Charset", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.nonBlockingLock(2165, (LockType) null, (DatabaseImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Txn txn0 = new Txn();
      SyncedLogManager syncedLogManager0 = null;
      try {
        syncedLogManager0 = new SyncedLogManager((EnvironmentImpl) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogManager", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Txn txn0 = new Txn();
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
  public void test09()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = false;
      txn0.checkState(boolean0);
      assertEquals(0L, txn0.getId());
  }

  @Test
  public void test12()  throws Throwable  {
      Txn txn0 = new Txn();
      StringWriter stringWriter0 = new StringWriter(2165);
      boolean boolean0 = false;
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      txn0.dumpLog(stringBuffer0, boolean0);
      assertEquals(59, stringBuffer0.length());
      assertEquals("<txn id=\"0__Txn\"><DbLsn val=\"0xffffffff/0xffffffff\"/></txn>", stringWriter0.toString());
  }

  @Test
  public void test13()  throws Throwable  {
      Txn txn0 = new Txn();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("prepare() has already been called for Transaction ");
      txn0.readFromLog(byteBuffer0, (byte)8);
      assertEquals(50, byteBuffer0.limit());
  }

  @Test
  public void test15()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.unRegisterCursor((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.registerCursor((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook810((-10000));
      assertTrue(txn0.logEntryIsTransactional());
  }

  @Test
  public void test18()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      try { 
        txn0.checkState(false);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Transaction 0 must be aborted.
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      try { 
        txn0.commit((byte) (-8));
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = Transaction 0 must be aborted. The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      Txn txn0 = new Txn();
      try { 
        txn0.commit((byte) (-60));
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = null The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.abort(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = new Long((long) (byte) (-69));
      LockType lockType0 = LockType.WRITE;
      LockGrantType lockGrantType0 = LockGrantType.PROMOTION;
      // Undeclared exception!
      try { 
        txn0.addLock(long0, (Lock) null, lockType0, lockGrantType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn$Txn_addLock", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.getOnlyAbortable();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, (EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbConfigManager", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getAbortLsn((byte) (-51));
      assertEquals((-1L), long0);
  }

  @Test
  public void test27()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.createdNode((byte)4);
      assertFalse(boolean0);
  }

  @Test
  public void test28()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.removeLock((byte)4, (Lock) null);
      assertEquals(0L, txn0.getTransactionId());
  }

  @Test
  public void test29()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.addLogInfo((-2786L));
      txn0.addLogInfo(24);
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test30()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[1];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(48, byteArray0, byteArray0);
      // Undeclared exception!
      try { 
        txn0.prepare(logUtils_XidImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      Txn txn0 = new Txn();
      LockType lockType0 = LockType.RESTART;
      // Undeclared exception!
      try { 
        txn0.lock((-1L), lockType0, false, (DatabaseImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      Txn txn0 = new Txn();
      LockType lockType0 = LockType.NONE;
      // Undeclared exception!
      try { 
        txn0.lockInternal((-271L), lockType0, true, (DatabaseImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isSuspended();
      assertFalse(boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setSuspended(true);
      txn0.setSuspended(true);
      assertTrue(txn0.isSuspended());
  }

  @Test
  public void test35()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setSuspended(false);
      assertFalse(txn0.isSuspended());
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test36()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setPrepared(true);
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test37()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setPrepared(false);
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test38()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = new Long((-1L));
      Lock lock0 = new Lock();
      LockType lockType0 = LockType.NONE;
      LockGrantType lockGrantType0 = LockGrantType.PROMOTION;
      Txn.Txn_addLock txn_Txn_addLock0 = new Txn.Txn_addLock(txn0, long0, lock0, lockType0, lockGrantType0);
      txn_Txn_addLock0.hook819();
  }

  @Test
  public void test39()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = new Long((long) (byte)6);
      Lock lock0 = new Lock();
      LockType lockType0 = LockType.WRITE;
      LockGrantType lockGrantType0 = LockGrantType.DENIED;
      txn0.addLock(long0, lock0, lockType0, lockGrantType0);
      assertFalse(txn0.isReadUncommittedDefault());
  }

  @Test
  public void test43()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.releaseNonTxnLocks();
      assertFalse(txn0.isHandleLockTransferrable());
  }

  @Test
  public void test44()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook804();
      assertFalse(txn0.isHandleLockTransferrable());
  }

  @Test
  public void test45()  throws Throwable  {
      Txn txn0 = new Txn();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        txn0.readFromLog(byteBuffer0, (byte)0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test46()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.generateId((TxnManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test47()  throws Throwable  {
      Txn txn0 = new Txn();
      int int0 = txn0.getLogSize();
      assertEquals(16, int0);
  }

  @Test
  public void test48()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook814();
      assertTrue(txn0.logEntryIsTransactional());
  }

  @Test
  public void test49()  throws Throwable  {
      Txn txn0 = new Txn();
      DatabaseException databaseException0 = new DatabaseException();
      try { 
        txn0.hook800(databaseException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.Tracer", e);
      }
  }

  @Test
  public void test50()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn txn1 = (Txn)txn0.newNonTxnLocker();
      assertEquals(0L, txn1.getTxnTimeOut());
  }

  @Test
  public void test51()  throws Throwable  {
      Txn txn0 = new Txn();
      DatabaseException databaseException0 = new DatabaseException("Can't call Database.getSearchBoth:", (Throwable) null);
      // Undeclared exception!
      try { 
        txn0.hook801((Long) null, (-3051L), databaseException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.Tracer", e);
      }
  }

  @Test
  public void test52()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.logEntryIsTransactional();
      assertTrue(boolean0);
  }

  @Test
  public void test53()  throws Throwable  {
      Txn txn0 = new Txn();
      try { 
        txn0.commit();
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = null The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test54()  throws Throwable  {
      Txn txn0 = new Txn();
      int int0 = txn0.getInMemorySize();
      assertEquals(0, int0);
  }

  @Test
  public void test55()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.operationEnd(false);
      assertFalse(txn0.isReadUncommittedDefault());
  }

  @Test
  public void test56()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getLastLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test57()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      Txn txn0 = null;
      try {
        txn0 = new Txn((EnvironmentImpl) null, transactionConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

  @Test
  public void test58()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook813();
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test59()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[9];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-1297), byteArray0, byteArray0);
      // Undeclared exception!
      try { 
        txn0.abort((Xid) logUtils_XidImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test61()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook807();
      int int0 = txn0.getLogSize();
      assertEquals(16, int0);
      
      txn0.hook814();
      assertEquals(16, txn0.getLogSize());
  }

  @Test
  public void test62()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isTransactional();
      assertTrue(boolean0);
  }

  @Test
  public void test63()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getFirstActiveLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test64()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook806();
      assertEquals(16, txn0.getLogSize());
  }

  @Test
  public void test65()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test66()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook808();
      assertEquals(0L, txn0.getTransactionId());
  }

  @Test
  public void test67()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn txn1 = txn0.getTxnLocker();
      txn1.hook812();
      assertEquals(0L, txn1.getTxnTimeOut());
  }

  @Test
  public void test68()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.operationEnd();
      assertEquals(0L, txn0.getTransactionId());
  }

  @Test
  public void test69()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test70()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isReadCommittedIsolation();
      assertFalse(boolean0);
  }

  @Test
  public void test71()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      Txn txn0 = null;
      try {
        txn0 = new Txn((EnvironmentImpl) null, transactionConfig0, (-4070L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

  @Test
  public void test72()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      byte[] byteArray0 = new byte[8];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(2165, byteArray0, byteArray0);
      try { 
        txn0.commit((Xid) logUtils_XidImpl0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = Transaction 0 must be aborted. The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test73()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook803();
      assertFalse(txn0.getDefaultNoWait());
  }

  @Test
  public void test76()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook805();
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test77()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook809();
      assertEquals(10000, Txn.ACCUMULATED_LIMIT);
  }

  @Test
  public void test78()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isSerializableIsolation();
      assertFalse(boolean0);
  }

  @Test
  public void test79()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn.Txn_traceCommit txn_Txn_traceCommit0 = new Txn.Txn_traceCommit(txn0, 2165, 2165);
      // Undeclared exception!
      try { 
        txn_Txn_traceCommit0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn$Txn_traceCommit", e);
      }
  }
}
