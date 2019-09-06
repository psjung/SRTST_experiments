/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:54:40 KST 2017
 */

package org.prevayler.implementation.journal;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.implementation.TransactionGuide;
import org.prevayler.implementation.publishing.POBox;
import org.prevayler.implementation.publishing.TransactionSubscriber;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Journal_ESTest1 extends Journal_ESTest_scaffolding1 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void clearEvoSuiteFramework() {
String a = "aa";
}

  @Test
  public void test0()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      POBox pOBox0 = new POBox((TransactionSubscriber) null);
      transientJournal0.update(pOBox0, (-570L));
  }

  @Test
  public void test1()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      transientJournal0.close();
  }

  @Test
  public void test2()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      transientJournal0.update((TransactionSubscriber) null, 1L);
      POBox pOBox0 = new POBox((TransactionSubscriber) null);
      try { 
        transientJournal0.update(pOBox0, (-570L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unable to recover transaction -570. The oldest recoverable transaction is 1.
         //
         assertThrownBy("org.prevayler.implementation.journal.TransientJournal", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
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
  public void test4()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      transientJournal0.update((TransactionSubscriber) null, 818L);
      // Undeclared exception!
      try { 
        transientJournal0.append((TransactionGuide) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.journal.TransientJournal", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      // Undeclared exception!
      try { 
        transientJournal0.append((TransactionGuide) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Journal.update() has to be called at least once before Journal.journal().
         //
         assertThrownBy("org.prevayler.implementation.journal.TransientJournal", e);
      }
  }
}
