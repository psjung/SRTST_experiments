/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:58:27 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.Environment;
import com.sleepycat.je.Transaction;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.txn.Txn;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Transaction_ESTest4 extends Transaction_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      txn0.setSuspended(true);
      Txn txn1 = transaction0.getTxn();
      assertTrue(txn1.logEntryIsTransactional());
  }

  @Test
  public void test01()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      txn0.setOnlyAbortable();
      Txn txn1 = transaction0.getTxn();
      assertTrue(txn1.isTransactional());
  }

  @Test
  public void test02()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.addLogInfo(0L);
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      Txn txn1 = transaction0.getTxn();
      assertFalse(txn1.getOnlyAbortable());
  }

  @Test
  public void test03()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      txn0.addLogInfo(3008L);
      Txn txn1 = transaction0.getTxn();
      assertSame(txn0, txn1);
  }

  @Test
  public void test05()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      transaction0.setName("rqg{e");
      String string0 = transaction0.getName();
      assertEquals("rqg{e", string0);
  }

  @Test
  public void test06()  throws Throwable  {
      Transaction transaction0 = null;
      try {
        transaction0 = new Transaction((Environment) null, (Txn) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      Txn txn1 = (Txn)transaction0.getLocker();
      assertSame(txn1, txn0);
  }

  @Test
  public void test08()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      String string0 = transaction0.toString();
      assertEquals("<Transaction id=\"0\">", string0);
  }

  @Test
  public void test09()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      boolean boolean0 = transaction0.equals(txn0);
      assertFalse(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      boolean boolean0 = transaction0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      boolean boolean0 = transaction0.equals(transaction0);
      assertTrue(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.commitNoSync();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      long long0 = transaction0.getId();
      assertEquals(0L, long0);
  }

  @Test
  public void test14()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.abort();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      transaction0.setName("rqg{e");
      String string0 = transaction0.toString();
      assertEquals("<Transaction id=\"0\" name=\"rqg{e\">", string0);
  }

  @Test
  public void test16()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.commitSync();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.setLockTimeout((-9223372036854775808L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.commit();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      transaction0.hashCode();
  }

  @Test
  public void test20()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      String string0 = transaction0.getName();
      assertNull(string0);
  }

  @Test
  public void test21()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.commitWriteNoSync();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.setTxnTimeout(3031L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }
}
