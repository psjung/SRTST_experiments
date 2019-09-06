/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 12:10:45 KST 2017
 */

package com.sleepycat.je.txn;

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
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Properties;

import javax.transaction.xa.Xid;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.Database;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.RunRecoveryException;
import com.sleepycat.je.TransactionConfig;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LogUtils;
import com.sleepycat.je.log.entry.LNLogEntry;
import com.sleepycat.je.tree.MapLN;
import com.sleepycat.je.tree.TreeLocation;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Txn_ESTest5 extends Txn_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.getTxnLocker();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("Can't find ");
      // Undeclared exception!
      try { 
        txn0.readFromLog(byteBuffer0, (byte) (-44));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      txn0.getTxnLocker();
      assertTrue(txn0.getOnlyAbortable());
  }

  @Test
  public void test02()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.addLogInfo(705L);
      Txn txn1 = txn0.getTxnLocker();
      assertEquals(0L, txn1.getTransactionId());
  }

  @Test
  public void test03()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      txn0.hook803();
      Map.Entry.comparingByKey();
      Long long0 = new Long((long) 104);
      Lock lock0 = new Lock();
      LockType lockType0 = LockType.RANGE_WRITE;
      Txn.Txn_addLock txn_Txn_addLock0 = new Txn.Txn_addLock(txn0, long0, lock0, lockType0, (LockGrantType) null);
      txn_Txn_addLock0._this = txn0;
      txn_Txn_addLock0.hook816();
      Long long1 = new Long((long) 104);
      txn0.addLock(long1, lock0, lockType0, (LockGrantType) null);
      assertTrue(txn0.getOnlyAbortable());
  }

  @Test
  public void test04()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[15];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(104, byteArray0, byteArray0);
      LockType lockType0 = LockType.RESTART;
      // Undeclared exception!
      try { 
        txn0.lock((byte) (-41), lockType0, false, (DatabaseImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.checkState(false);
      assertFalse(txn0.isReadUncommittedDefault());
  }

  @Test
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      Txn txn0 = new Txn();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(" in writeInfo Map.");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      txn0.readFromLog(byteBuffer1, (byte)6);
      assertEquals(16, txn0.getLogSize());
  }

  @Test
  public void test11()  throws Throwable  {
      Txn txn0 = new Txn();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        txn0.writeToLog(byteBuffer0);
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook810(1000);
      assertEquals(0L, txn0.getLockTimeout());
  }

  @Test
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      Txn txn0 = new Txn();
      try { 
        txn0.commit((byte) (-51));
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = null The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      txn0.hook803();
      byte[] byteArray0 = new byte[0];
      txn0.hook812();
      txn0.id = (-1496L);
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(104, byteArray0, byteArray0);
      logUtils_XidImpl0.toString();
      try { 
        txn0.commit((Xid) logUtils_XidImpl0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction -1496. The attempt to abort and clean up also failed. The original exception seen from commit = Transaction -1496 must be aborted. The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.abort(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = Long.valueOf((-892L));
      Lock lock0 = new Lock((Long) null);
      LockType lockType0 = LockType.WRITE;
      LockGrantType lockGrantType0 = LockGrantType.WAIT_PROMOTION;
      // Undeclared exception!
      try { 
        txn0.addLock(long0, lock0, lockType0, lockGrantType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn$Txn_addLock", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.getOnlyAbortable();
      assertFalse(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.setHandleLockOwner(true, (Database) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setHandleLockOwner(false, (Database) null, false);
      assertFalse(txn0.getDefaultNoWait());
  }

  @Test
  public void test24()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getAbortLsn(104);
      assertEquals((-1L), long0);
  }

  @Test
  public void test25()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.createdNode((-1746L));
      assertFalse(boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.removeLock((byte) (-41), (Lock) null);
      assertFalse(txn0.isHandleLockTransferrable());
  }

  @Test
  public void test28()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.addLogInfo(104);
      txn0.addLogInfo(705L);
      assertFalse(txn0.isReadUncommittedDefault());
  }

  @Test
  public void test29()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[1];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(104, byteArray0, byteArray0);
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
  public void test30()  throws Throwable  {
      Txn txn0 = new Txn();
      LockType lockType0 = LockType.RANGE_INSERT;
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      // Undeclared exception!
      try { 
        txn0.lockInternal(0, lockType0, false, databaseImpl0);
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
        txn0.lock((byte) (-41), lockType0, true, (DatabaseImpl) null);
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
      boolean boolean0 = txn0.isSuspended();
      assertFalse(boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      Txn txn0 = new Txn();
      assertFalse(txn0.isSuspended());
      
      txn0.setSuspended(true);
      boolean boolean0 = txn0.isSuspended();
      assertTrue(boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setSuspended(false);
      assertFalse(txn0.getOnlyAbortable());
      assertFalse(txn0.isSuspended());
  }

  @Test
  public void test35()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setPrepared(true);
      byte[] byteArray0 = new byte[6];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(536, byteArray0, byteArray0);
      try { 
        txn0.prepare(logUtils_XidImpl0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // prepare() has already been called for Transaction 0.
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test36()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setPrepared(false);
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test37()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = new Long((long) 104);
      Lock lock0 = new Lock();
      LockType lockType0 = LockType.RANGE_WRITE;
      LockGrantType lockGrantType0 = LockGrantType.WAIT_NEW;
      Txn.Txn_addLock txn_Txn_addLock0 = new Txn.Txn_addLock(txn0, long0, lock0, lockType0, lockGrantType0);
      txn_Txn_addLock0.hook819();
  }

  @Test
  public void test38()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.releaseNonTxnLocks();
      assertTrue(txn0.logEntryIsTransactional());
  }

  @Test
  public void test39()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = new Long((long) 104);
      LockGrantType lockGrantType0 = LockGrantType.WAIT_NEW;
      Lock lock0 = new Lock(long0);
      LockType lockType0 = LockType.READ;
      txn0.addLock(long0, lock0, lockType0, lockGrantType0);
      assertFalse(txn0.getDefaultNoWait());
  }

  @Test
  public void test40()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook804();
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test41()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.readFromLog((ByteBuffer) null, (byte) (-9));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      Txn txn0 = new Txn();
      int int0 = txn0.getLogSize();
      assertEquals(16, int0);
  }

  @Test
  public void test44()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook814();
      assertTrue(txn0.isTransactional());
  }

  @Test
  public void test45()  throws Throwable  {
      Txn txn0 = new Txn();
      DatabaseException databaseException0 = new DatabaseException("muDIuF$[AX&zTcz[");
      txn0.hook800(databaseException0);
      assertFalse(txn0.getDefaultNoWait());
  }

  @Test
  public void test46()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn txn1 = (Txn)txn0.newNonTxnLocker();
      assertFalse(txn1.isReadCommittedIsolation());
  }

  @Test
  public void test47()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = new Long((long) 104);
      RunRecoveryException runRecoveryException0 = new RunRecoveryException((EnvironmentImpl) null);
      txn0.hook801(long0, 0L, runRecoveryException0);
      assertEquals(10000, Txn.ACCUMULATED_LIMIT);
  }

  @Test
  public void test48()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.logEntryIsTransactional();
      assertTrue(boolean0);
  }

  @Test
  public void test49()  throws Throwable  {
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
  public void test50()  throws Throwable  {
      Txn txn0 = new Txn();
      int int0 = txn0.getInMemorySize();
      assertEquals(0, int0);
  }

  @Test
  public void test51()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.operationEnd(false);
      assertFalse(txn0.isHandleLockTransferrable());
  }

  @Test
  public void test52()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getLastLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test53()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
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
  public void test54()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook813();
      assertTrue(txn0.logEntryIsTransactional());
  }

  @Test
  public void test55()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[1];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-904), byteArray0, byteArray1);
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
  public void test56()  throws Throwable  {
      Txn txn0 = new Txn();
      TreeLocation treeLocation0 = new TreeLocation();
      Class<LNLogEntry> class0 = LNLogEntry.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      MapLN mapLN0 = new MapLN(databaseImpl0);
      try { 
        txn0.hook802(0L, treeLocation0, lNLogEntry0, mapLN0, databaseImpl0, 0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test57()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook810(104);
      assertFalse(txn0.isReadUncommittedDefault());
  }

  @Test
  public void test58()  throws Throwable  {
      Txn txn0 = new Txn();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      txn0.dumpLog(stringBuffer0, false);
      assertEquals(70, stringBuffer0.capacity());
      assertEquals("<txn id=\"0__Txn\"><DbLsn val=\"0xffffffff/0xffffffff\"/></txn>", stringWriter0.toString());
  }

  @Test
  public void test59()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook807();
      assertEquals(0L, txn0.getTxnTimeOut());
  }

  @Test
  public void test60()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isHandleLockTransferrable();
      assertFalse(boolean0);
  }

  @Test
  public void test61()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isTransactional();
      assertTrue(boolean0);
  }

  @Test
  public void test62()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getFirstActiveLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test63()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook806();
      assertEquals(0L, txn0.getTxnTimeOut());
  }

  @Test
  public void test64()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test65()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook808();
      assertFalse(txn0.isHandleLockTransferrable());
  }

  @Test
  public void test66()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn txn1 = txn0.getTxnLocker();
      txn1.hook814();
      assertEquals(0L, txn1.getTxnTimeOut());
  }

  @Test
  public void test67()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.operationEnd();
      assertEquals(10000, Txn.ACCUMULATED_LIMIT);
  }

  @Test
  public void test68()  throws Throwable  {
      Txn txn0 = new Txn();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("z0Nv,r#MRiO5B+nTa!?");
      txn0.writeToLog(byteBuffer0);
      assertEquals(0L, txn0.getTransactionId());
  }

  @Test
  public void test69()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.isReadCommittedIsolation();
      byte[] byteArray0 = new byte[1];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(104, byteArray0, byteArray0);
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
  public void test70()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
      Txn txn0 = null;
      try {
        txn0 = new Txn((EnvironmentImpl) null, transactionConfig0, 10L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

  @Test
  public void test71()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      try { 
        txn0.commit((byte) (-59));
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = Transaction 0 must be aborted. The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test74()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook805();
      assertFalse(txn0.isSuspended());
  }

  @Test
  public void test76()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook809();
      assertFalse(txn0.isHandleLockTransferrable());
  }

  @Test
  public void test77()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isSerializableIsolation();
      assertFalse(boolean0);
  }

  
}