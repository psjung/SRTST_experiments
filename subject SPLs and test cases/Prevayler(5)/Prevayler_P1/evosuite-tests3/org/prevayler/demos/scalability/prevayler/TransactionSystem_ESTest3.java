/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 16:40:27 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.demos.scalability.Record;
import org.prevayler.demos.scalability.RecordIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TransactionSystem_ESTest3 extends TransactionSystem_ESTest_scaffolding3 {

  @Test
  public void test1()  throws Throwable  {
      TransactionSystem transactionSystem0 = new TransactionSystem();
      // Undeclared exception!
      try { 
        transactionSystem0.performTransaction((Record) null, (Record) null, (-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TransactionSystem transactionSystem0 = new TransactionSystem();
      RecordIterator recordIterator0 = new RecordIterator(0);
      Record record0 = recordIterator0.next();
      Date date0 = record0.getDate1();
      Record record1 = new Record(0L, "8#ik)I9)xKoh/I?qx", "8#ik)I9)xKoh/I?qx", (BigDecimal) null, (BigDecimal) null, date0, date0);
      transactionSystem0.performTransaction(record0, record1, 1L);
      // Undeclared exception!
      try { 
        transactionSystem0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.Record", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TransactionSystem transactionSystem0 = new TransactionSystem();
      RecordIterator recordIterator0 = new RecordIterator(0);
      transactionSystem0.replaceAllRecords(recordIterator0);
      assertFalse(recordIterator0.hasNext());
  }

  @Test
  public void test4()  throws Throwable  {
      TransactionSystem transactionSystem0 = new TransactionSystem();
      RecordIterator recordIterator0 = new RecordIterator(100000);
      // Undeclared exception!
      try { 
        transactionSystem0.replaceAllRecords(recordIterator0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      TransactionSystem transactionSystem0 = new TransactionSystem();
      transactionSystem0.hashCode();
  }
}
