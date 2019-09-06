/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 16:05:47 KST 2017
 */

package org.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.XStreamSerializer;
import org.prevayler.implementation.PrevaylerImpl;
import org.prevayler.implementation.clock.BrokenClock;
import org.prevayler.implementation.clock.MachineClock;
import org.prevayler.implementation.clock.PausableClock;
import org.prevayler.implementation.journal.Journal;
import org.prevayler.implementation.journal.TransientJournal;
import org.prevayler.implementation.publishing.CentralPublisher;
import org.prevayler.implementation.publishing.TransactionPublisher;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Prevayler_ESTest3 extends Prevayler_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      Date date0 = new Date();
      BrokenClock brokenClock0 = new BrokenClock(date0);
      PausableClock pausableClock0 = new PausableClock((Clock) brokenClock0);
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) pausableClock0, (Journal) transientJournal0);
      JavaSerializer javaSerializer0 = new JavaSerializer();
      PrevaylerImpl prevaylerImpl0 = new PrevaylerImpl((TransactionPublisher) centralPublisher0, (Serializer) javaSerializer0);
      prevaylerImpl0.close();
  }

  @Test
  public void test01()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) null, (Journal) transientJournal0);
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer(",eFBo+*=klVN]>(z");
      PrevaylerImpl prevaylerImpl0 = new PrevaylerImpl((TransactionPublisher) centralPublisher0, (Serializer) xStreamSerializer0);
      PausableClock pausableClock0 = (PausableClock)prevaylerImpl0.clock();
      assertNotNull(pausableClock0);
  }

  @Test
  public void test04()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (Journal) null);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      PrevaylerImpl prevaylerImpl0 = new PrevaylerImpl((TransactionPublisher) centralPublisher0, (Serializer) javaSerializer0);
      try { 
        prevaylerImpl0.execute((TransactionWithQuery) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.publishing.CentralPublisher", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      BrokenClock brokenClock0 = new BrokenClock();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) brokenClock0, (Journal) transientJournal0);
      PrevaylerImpl prevaylerImpl0 = new PrevaylerImpl((TransactionPublisher) centralPublisher0, (Serializer) null);
      // Undeclared exception!
      try { 
        prevaylerImpl0.execute((TransactionWithQuery) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unable to serialize transaction
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      BrokenClock brokenClock0 = new BrokenClock();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) brokenClock0, (Journal) null);
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      PrevaylerImpl prevaylerImpl0 = new PrevaylerImpl((TransactionPublisher) centralPublisher0, (Serializer) xStreamSerializer0);
      // Undeclared exception!
      try { 
        prevaylerImpl0.execute((Transaction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.publishing.CentralPublisher", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) null, (Journal) transientJournal0);
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("");
      PrevaylerImpl prevaylerImpl0 = new PrevaylerImpl((TransactionPublisher) centralPublisher0, (Serializer) xStreamSerializer0);
      // Undeclared exception!
      try { 
        prevaylerImpl0.execute((Transaction) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unable to serialize transaction
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      BrokenClock brokenClock0 = new BrokenClock();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) brokenClock0, (Journal) null);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      PrevaylerImpl prevaylerImpl0 = new PrevaylerImpl((TransactionPublisher) centralPublisher0, (Serializer) javaSerializer0);
      // Undeclared exception!
      try { 
        prevaylerImpl0.execute((SureTransactionWithQuery) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.publishing.CentralPublisher", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) null, (Journal) null);
      PrevaylerImpl prevaylerImpl0 = new PrevaylerImpl((TransactionPublisher) centralPublisher0, (Serializer) null);
      // Undeclared exception!
      try { 
        prevaylerImpl0.execute((SureTransactionWithQuery) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unable to serialize transaction
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }

  
}
