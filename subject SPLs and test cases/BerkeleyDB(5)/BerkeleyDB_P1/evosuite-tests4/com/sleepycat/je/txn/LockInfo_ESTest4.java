/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 16:29:22 KST 2017
 */

package com.sleepycat.je.txn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LockInfo_ESTest4 extends LockInfo_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      LockType lockType0 = LockType.WRITE;
      LockInfo lockInfo0 = new LockInfo((Locker) null, lockType0);
      Locker locker0 = lockInfo0.getLocker();
      assertNull(locker0);
  }

  @Test
  public void test01()  throws Throwable  {
      Txn txn0 = new Txn();
      LockType lockType0 = LockType.RANGE_INSERT;
      LockInfo lockInfo0 = new LockInfo((Locker) txn0, lockType0);
      LockType lockType1 = lockInfo0.getLockType();
      assertSame(lockType1, lockType0);
  }

  @Test
  public void test02()  throws Throwable  {
      Txn txn0 = new Txn();
      LockType lockType0 = LockType.RANGE_WRITE;
      LockInfo lockInfo0 = new LockInfo((Locker) txn0, lockType0);
      LockType lockType1 = lockInfo0.getLockType();
      assertSame(lockType0, lockType1);
  }

  @Test
  public void test03()  throws Throwable  {
      LockType lockType0 = LockType.WRITE;
      LockInfo lockInfo0 = new LockInfo((Locker) null, lockType0);
      String string0 = lockInfo0.toString();
      //  // Unstable assertion: assertEquals("<LockInfo locker=\"null\" type=\"WRITE\"/> lock taken at: com.sleepycat.je.txn.LockInfo$StackTraceAtLockTime\r\n\tat com.sleepycat.je.txn.LockInfo.&lt;init&gt;(LockInfo.java:53)\r\n\tat sun.reflect.GeneratedConstructorAccessor28.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:241)\r\n\tat org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)\r\n\tat org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:196)\r\n\tat org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:306)\r\n\tat org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:212)\r\n\tat org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)\r\n\tat java.util.concurrent.FutureTask.run(FutureTask.java:266)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)\r\n\tat java.lang.Thread.run(Thread.java:745)\r\n", string0);
  }

  @Test
  public void test04()  throws Throwable  {
      Txn txn0 = new Txn();
      LockType lockType0 = LockType.READ;
      LockInfo lockInfo0 = new LockInfo((Locker) txn0, lockType0);
      Txn txn1 = (Txn)lockInfo0.getLocker();
      assertEquals(16, txn1.getLogSize());
  }

  @Test
  public void test05()  throws Throwable  {
      Txn txn0 = new Txn();
      LockType lockType0 = LockType.READ;
      LockInfo lockInfo0 = new LockInfo((Locker) txn0, lockType0);
      LockInfo lockInfo1 = (LockInfo)lockInfo0.clone();
      assertFalse(lockInfo1.equals((Object)lockInfo0));
  }

  @Test
  public void test08()  throws Throwable  {
      LockInfo.setDeadlockStackTrace(true);
  }

  @Test
  public void test09()  throws Throwable  {
      LockType lockType0 = LockType.WRITE;
      LockInfo lockInfo0 = new LockInfo((Locker) null, lockType0);
      lockInfo0.setLocker((Locker) null);
      //  // Unstable assertion: assertFalse(lockInfo0.getDeadlockStackTrace());
  }

  @Test
  public void test10()  throws Throwable  {
      LockInfo lockInfo0 = new LockInfo((Locker) null, (LockType) null);
      LockType lockType0 = lockInfo0.getLockType();
      assertNull(lockType0);
  }

  @Test
  public void test11()  throws Throwable  {
      LockInfo lockInfo0 = new LockInfo((Locker) null, (LockType) null);
      lockInfo0.dump();
      //  // Unstable assertion: assertFalse(lockInfo0.getDeadlockStackTrace());
  }
}
