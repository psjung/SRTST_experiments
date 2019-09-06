/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 12:23:10 KST 2017
 */

package org.prevayler.implementation.journal;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.time.Instant;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.foundation.Turn;
import org.prevayler.implementation.Capsule;
import org.prevayler.implementation.TransactionGuide;
import org.prevayler.implementation.TransactionTimestamp;
import org.prevayler.implementation.publishing.POBox;
import org.prevayler.implementation.publishing.TransactionSubscriber;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Journal_ESTest4 extends Journal_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      POBox pOBox0 = new POBox((TransactionSubscriber) null);
      transientJournal0.update(pOBox0, 724L);
  }

  @Test
  public void test1()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      transientJournal0.close();
  }

  @Test
  public void test2()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      // Undeclared exception!
      try { 
        transientJournal0.nextTransaction();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // update() must be called at least once
         //
         assertThrownBy("org.prevayler.implementation.journal.TransientJournal", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      Instant instant0 = Instant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, 0L, date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      // Undeclared exception!
      try { 
        transientJournal0.append(transactionGuide0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Journal.update() has to be called at least once before Journal.journal().
         //
         assertThrownBy("org.prevayler.implementation.journal.TransientJournal", e);
      }
  }
}
