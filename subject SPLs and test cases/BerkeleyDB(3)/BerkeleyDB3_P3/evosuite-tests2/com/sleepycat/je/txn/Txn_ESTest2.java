/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:24:13 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import javax.transaction.xa.Xid;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.Database;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.TransactionConfig;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.log.LogUtils;
import com.sleepycat.je.log.entry.LNLogEntry;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.TreeLocation;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Txn_ESTest2 extends Txn_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.addLogInfo(2793L);
      long long0 = txn0.getLastLsn();
      assertEquals(2793L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      Txn txn0 = new Txn();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      String string0 = "V2PAS/L8FMk!CBL ";
      ByteBuffer byteBuffer0 = mS949_0.encode(string0);
      txn0.writeToLog(byteBuffer0);
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test02()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[3];
      txn0.hook812();
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(txn0.ACCUMULATED_LIMIT, byteArray0, byteArray0);
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
  public void test05()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      assertTrue(txn0.getOnlyAbortable());
  }

  @Test
  public void test06()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[3];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(txn0.ACCUMULATED_LIMIT, byteArray0, byteArray0);
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
  public void test07()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isHandleLockTransferrable();
      assertFalse(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = true;
      txn0.checkState(boolean0);
      assertFalse(txn0.isSerializableIsolation());
  }

  @Test
  public void test10()  throws Throwable  {
      EnvironmentImpl environmentImpl0 = null;
      TransactionConfig transactionConfig0 = new TransactionConfig();
      Txn txn0 = null;
      try {
        txn0 = new Txn(environmentImpl0, transactionConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook813();
      assertFalse(txn0.isReadUncommittedDefault());
  }

  @Test
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook810((-3256));
      assertFalse(txn0.isHandleLockTransferrable());
  }

  @Test
  public void test16()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.dumpLog((StringBuffer) null, false);
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
      try { 
        txn0.commit((byte)91);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = null The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      Txn txn0 = new Txn();
      TreeLocation treeLocation0 = new TreeLocation();
      Class<Object> class0 = Object.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, true);
      LN lN0 = new LN((byte[]) null);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      try { 
        txn0.hook802(0, treeLocation0, lNLogEntry0, lN0, databaseImpl0, 884L, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.getOnlyAbortable();
      assertFalse(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getAbortLsn(1L);
      assertEquals((-1L), long0);
  }

  @Test
  public void test22()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.createdNode(20000000L);
      assertFalse(boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      Txn txn0 = new Txn();
      Lock lock0 = new Lock();
      txn0.removeLock(20000000L, lock0);
      assertTrue(txn0.isTransactional());
  }

  @Test
  public void test25()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.addLogInfo((-40));
      txn0.addLogInfo((-40));
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test26()  throws Throwable  {
      Txn txn0 = new Txn();
      LockType lockType0 = LockType.READ;
      // Undeclared exception!
      try { 
        txn0.lock(2268L, lockType0, false, (DatabaseImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      Txn txn0 = new Txn();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      LockType lockType0 = LockType.READ;
      // Undeclared exception!
      try { 
        txn0.lockInternal((-40), lockType0, true, databaseImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isSuspended();
      assertFalse(boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setSuspended(true);
      assertTrue(txn0.isSuspended());
  }

  @Test
  public void test30()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setSuspended(false);
      assertFalse(txn0.isSuspended());
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test31()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setPrepared(true);
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test32()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setPrepared(false);
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test33()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = new Long((-3836L));
      LockType lockType0 = LockType.NONE;
      LockGrantType lockGrantType0 = LockGrantType.DENIED;
      Txn.Txn_addLock txn_Txn_addLock0 = new Txn.Txn_addLock(txn0, long0, (Lock) null, lockType0, lockGrantType0);
      txn_Txn_addLock0.hook819();
  }

  @Test
  public void test34()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = Long.valueOf(3L);
      LockType lockType0 = LockType.RANGE_WRITE;
      LockGrantType lockGrantType0 = LockGrantType.EXISTING;
      txn0.addLock(long0, (Lock) null, lockType0, lockGrantType0);
      assertEquals("RANGE_WRITE", lockType0.toString());
  }

  @Test
  public void test35()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = Long.valueOf(0L);
      Lock lock0 = new Lock();
      LockType lockType0 = LockType.RANGE_WRITE;
      LockGrantType lockGrantType0 = LockGrantType.PROMOTION;
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
  public void test36()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.releaseNonTxnLocks();
      assertTrue(txn0.logEntryIsTransactional());
  }

  @Test
  public void test37()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = Long.valueOf(0L);
      Lock lock0 = new Lock();
      LockType lockType0 = LockType.RANGE_INSERT;
      LockGrantType lockGrantType0 = LockGrantType.PROMOTION;
      txn0.addLock(long0, lock0, lockType0, lockGrantType0);
      byte byte0 = (byte)0;
      try { 
        txn0.commit(byte0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = null The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook804();
      assertEquals(0L, txn0.getLockTimeout());
  }

  @Test
  public void test39()  throws Throwable  {
      Txn txn0 = new Txn();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("?fEaM;:YF5`[?");
      // Undeclared exception!
      try { 
        txn0.readFromLog(byteBuffer0, (byte) (-81));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[2];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-1992), byteArray0, byteArray0);
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
  public void test41()  throws Throwable  {
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
  public void test42()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook814();
      assertFalse(txn0.getDefaultNoWait());
  }

  @Test
  public void test43()  throws Throwable  {
      Txn txn0 = new Txn();
      try { 
        txn0.hook800((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.Tracer", e);
      }
  }

  @Test
  public void test44()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn txn1 = (Txn)txn0.newNonTxnLocker();
      assertFalse(txn1.isSuspended());
  }

  @Test
  public void test45()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = Long.valueOf(0L);
      // Undeclared exception!
      try { 
        txn0.hook801(long0, 0L, (DatabaseException) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.Tracer", e);
      }
  }

  @Test
  public void test46()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.logEntryIsTransactional();
      assertTrue(boolean0);
  }

  @Test
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
      Txn txn0 = new Txn();
      int int0 = txn0.getInMemorySize();
      assertEquals(0, int0);
  }

  @Test
  public void test49()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.operationEnd(false);
      assertTrue(txn0.isTransactional());
  }

  @Test
  public void test50()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getLastLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test51()  throws Throwable  {
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
  public void test52()  throws Throwable  {
      Txn txn0 = new Txn();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      TreeLocation treeLocation0 = new TreeLocation();
      LogEntryType logEntryType0 = LogEntryType.LOG_LN;
      DupCountLN dupCountLN0 = new DupCountLN();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) dupCountLN0, (DatabaseId) null, (byte[]) null, (-229L), true, txn0);
      txn0.hook802((-229L), treeLocation0, lNLogEntry0, dupCountLN0, databaseImpl0, (-1L), true);
      //  // Unstable assertion: assertEquals(1L, dupCountLN0.getLastId());
      //  // Unstable assertion: assertEquals(1L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test53()  throws Throwable  {
      Txn txn0 = new Txn();
      StringWriter stringWriter0 = new StringWriter((int) (byte)108);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      txn0.dumpLog(stringBuffer0, true);
      assertEquals(59, stringBuffer0.length());
      assertEquals("<txn id=\"0__Txn\"><DbLsn val=\"0xffffffff/0xffffffff\"/></txn>", stringWriter0.toString());
  }

  @Test
  public void test54()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook807();
      assertEquals(0L, txn0.getTxnTimeOut());
  }

  @Test
  public void test55()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isTransactional();
      assertTrue(boolean0);
  }

  @Test
  public void test56()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getFirstActiveLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test57()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook806();
      assertTrue(txn0.logEntryIsTransactional());
  }

  @Test
  public void test58()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook808();
      assertEquals(10000, Txn.ACCUMULATED_LIMIT);
  }

  @Test
  public void test59()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn txn1 = txn0.getTxnLocker();
      assertFalse(txn1.getOnlyAbortable());
  }

  @Test
  public void test60()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.operationEnd();
      assertTrue(txn0.logEntryIsTransactional());
  }

  @Test
  public void test61()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isReadCommittedIsolation();
      assertFalse(boolean0);
  }

  @Test
  public void test62()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      Txn txn0 = null;
      try {
        txn0 = new Txn((EnvironmentImpl) null, transactionConfig0, (-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

  @Test
  public void test63()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook803();
      assertEquals(0L, txn0.getId());
  }

  @Test
  public void test66()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook805();
      assertFalse(txn0.getDefaultNoWait());
  }

  @Test
  public void test68()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook809();
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test69()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[0];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(2700, byteArray0, byteArray0);
      try { 
        txn0.commit((Xid) logUtils_XidImpl0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = null The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test70()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isSerializableIsolation();
      assertFalse(boolean0);
  }

  @Test
  public void test71()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn.Txn_traceCommit txn_Txn_traceCommit0 = new Txn.Txn_traceCommit(txn0, (-40), (-40));
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
