/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:57:13 KST 2017
 */

package org.prevayler.implementation.publishing;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.Clock;
import org.prevayler.implementation.Capsule;
import org.prevayler.implementation.TransactionTimestamp;
import org.prevayler.implementation.clock.MachineClock;
import org.prevayler.implementation.clock.PausableClock;
import org.prevayler.implementation.journal.Journal;
import org.prevayler.implementation.journal.TransientJournal;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class AbstractPublisher_ESTest1 extends AbstractPublisher_ESTest_scaffolding1 {
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
      MachineClock machineClock0 = new MachineClock();
      Date date0 = new Date();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (Journal) transientJournal0);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, 1491577031262L, date0);
      centralPublisher0.notifySubscribers(transactionTimestamp0);
      assertEquals(1491577031262L, transactionTimestamp0.systemVersion());
  }

  @Test
  public void test1()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      Date date0 = new Date();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (Journal) transientJournal0);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, 1491577031262L, date0);
      centralPublisher0.addSubscriber((TransactionSubscriber) null);
      // Undeclared exception!
      try { 
        centralPublisher0.notifySubscribers(transactionTimestamp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.publishing.AbstractPublisher", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (Journal) transientJournal0);
      PausableClock pausableClock0 = (PausableClock)centralPublisher0.clock();
      assertNotNull(pausableClock0);
  }

  @Test
  public void test3()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (Journal) transientJournal0);
      centralPublisher0.cancelSubscription((TransactionSubscriber) null);
  }
}
