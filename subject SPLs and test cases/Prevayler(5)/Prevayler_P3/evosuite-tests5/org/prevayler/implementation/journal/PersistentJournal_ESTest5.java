/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 22:59:33 KST 2017
 */

package org.prevayler.implementation.journal;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.foundation.monitor.Monitor;
import org.prevayler.foundation.monitor.NullMonitor;
import org.prevayler.foundation.monitor.SimpleMonitor;
import org.prevayler.implementation.PrevaylerDirectory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class PersistentJournal_ESTest5 extends PersistentJournal_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      SimpleMonitor simpleMonitor0 = new SimpleMonitor();
      PersistentJournal persistentJournal0 = null;
      try {
        persistentJournal0 = new PersistentJournal(prevaylerDirectory0, 0L, 0L, (String) null, (Monitor) simpleMonitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SimpleMonitor simpleMonitor0 = new SimpleMonitor();
      PersistentJournal persistentJournal0 = null;
      try {
        persistentJournal0 = new PersistentJournal((PrevaylerDirectory) null, 1L, 1L, "0=@Gz", (Monitor) simpleMonitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Journal filename suffix must match /[a-zA-Z0-9]*[Jj]ournal/, but '0=@Gz' does not
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      PersistentJournal persistentJournal0 = null;
      try {
        persistentJournal0 = new PersistentJournal(prevaylerDirectory0, 5000L, 5000L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("");
      PersistentJournal persistentJournal0 = null;
      try {
        persistentJournal0 = new PersistentJournal(prevaylerDirectory0, 131L, 131L, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Journal filename suffix must match /[a-zA-Z0-9]*[Jj]ournal/, but '' does not
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory(" files are supported");
          NullMonitor nullMonitor0 = new NullMonitor();
          PersistentJournal persistentJournal0 = null;
          try {
            persistentJournal0 = new PersistentJournal(prevaylerDirectory0, 50L, 50L, "journal", (Monitor) nullMonitor0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \" files are supported\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.File.mkdir(File.java:1311)
             // java.io.File.mkdirs(File.java:1343)
             // org.prevayler.foundation.FileManager.produceDirectory(FileManager.java:15)
             // org.prevayler.implementation.PrevaylerDirectory.produceDirectory(PrevaylerDirectory.java:35)
             // org.prevayler.implementation.journal.PersistentJournal.<init>(PersistentJournal.java:66)
             // org.prevayler.implementation.journal.PersistentJournal.<init>(PersistentJournal.java:55)
             // sun.reflect.GeneratedConstructorAccessor45.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:422)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:241)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:196)
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
}
