/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 19:49:49 KST 2017
 */

package org.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.Serializable;
import java.time.Month;
import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;
import java.time.format.FormatStyle;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.foundation.monitor.SimpleMonitor;
import org.prevayler.foundation.network.OldNetwork;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.SkaringaSerializer;
import org.prevayler.foundation.serialization.XStreamSerializer;
import org.prevayler.implementation.PrevaylerImpl;
import org.prevayler.implementation.clock.MachineClock;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class PrevaylerFactory_ESTest2 extends PrevaylerFactory_ESTest_scaffolding2 {

  @Test
  public void test04()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("PrevalenceBase");
      prevaylerFactory0.configureJournalSerializer(xStreamSerializer0);
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureJournalSerializer(skaringaSerializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Read the javadoc to this method.
         //
         assertThrownBy("org.prevayler.PrevaylerFactory", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      JavaSerializer javaSerializer0 = new JavaSerializer();
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureJournalSerializer((String) null, (Serializer) javaSerializer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureJournalSerializer("GiMJ6s", (Serializer) skaringaSerializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Journal filename suffix must match /[a-zA-Z0-9]*[Jj]ournal/, but 'GiMJ6s' does not
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configurePrevalenceDirectory("");
  }

  @Test
  public void test11()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
          HijrahChronology hijrahChronology0 = HijrahChronology.INSTANCE;
          HijrahDate hijrahDate0 = hijrahChronology0.dateNow();
          prevaylerFactory0.configurePrevalentSystem(hijrahDate0);
          XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
          prevaylerFactory0.configureJournalSerializer(xStreamSerializer0);
          // Undeclared exception!
          try { 
            prevaylerFactory0.create();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"Prevalence\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.File.mkdir(File.java:1311)
             // java.io.File.mkdirs(File.java:1343)
             // org.prevayler.foundation.FileManager.produceDirectory(FileManager.java:15)
             // org.prevayler.implementation.PrevaylerDirectory.produceDirectory(PrevaylerDirectory.java:35)
             // org.prevayler.implementation.snapshot.GenericSnapshotManager.<init>(GenericSnapshotManager.java:39)
             // org.prevayler.PrevaylerFactory.snapshotManager(PrevaylerFactory.java:470)
             // org.prevayler.PrevaylerFactory.create(PrevaylerFactory.java:374)
             // sun.reflect.GeneratedMethodAccessor75.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:497)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:261)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:224)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:306)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:212)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
             // java.lang.Thread.run(Thread.java:745)
             //
             assertThrownBy("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test12()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      SimpleMonitor simpleMonitor0 = new SimpleMonitor();
      prevaylerFactory0.configureMonitor(simpleMonitor0);
  }

  @Test
  public void test15()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          Prevayler prevayler0 = PrevaylerFactory.createTransientPrevayler((Serializable) "Hijrah-umalqura", (String) null);
          assertNull(prevayler0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test16()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureJournalFileAgeThreshold((-2998L));
  }

  @Test
  public void test18()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      prevaylerFactory0.configureJournalSerializer(skaringaSerializer0);
      JavaSerializer javaSerializer0 = new JavaSerializer();
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureJournalSerializer(javaSerializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Read the javadoc to this method.
         //
         assertThrownBy("org.prevayler.PrevaylerFactory", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureReplicationServer(1);
  }

  @Test
  public void test20()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureTransactionFiltering(true);
  }

  @Test
  public void test21()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureNetwork((OldNetwork) null);
  }

  @Test
  public void test22()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      MachineClock machineClock0 = new MachineClock();
      prevaylerFactory0.configureClock(machineClock0);
  }

  @Test
  public void test24()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureReplicationClient("&ZlVSk>$B$ ", (-209));
  }

  @Test
  public void test25()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      prevaylerFactory0.configureJournalSerializer(javaSerializer0);
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureJournalSerializer((XStreamSerializer) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Read the javadoc to this method.
         //
         assertThrownBy("org.prevayler.PrevaylerFactory", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureJournalFileSizeThreshold(0L);
  }

  @Test
  public void test27()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          Month month0 = Month.APRIL;
          Prevayler prevayler0 = PrevaylerFactory.createCheckpointPrevayler(month0, "snapshot");
          assertNull(prevayler0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}