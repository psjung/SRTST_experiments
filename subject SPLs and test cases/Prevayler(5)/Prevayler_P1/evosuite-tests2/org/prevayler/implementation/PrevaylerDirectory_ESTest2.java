/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:52:22 KST 2017
 */

package org.prevayler.implementation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class PrevaylerDirectory_ESTest2 extends PrevaylerDirectory_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      File file0 = prevaylerDirectory0.snapshotFile(0L, "Snapshot");
      long long0 = PrevaylerDirectory.snapshotVersion(file0);
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      File file0 = prevaylerDirectory0.snapshotFile(11L, "Snapshot");
      long long0 = PrevaylerDirectory.snapshotVersion(file0);
      assertEquals(11L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("Journal");
      File file0 = prevaylerDirectory0.journalFile(1041L, "Journal");
      long long0 = PrevaylerDirectory.journalVersion(file0);
      assertEquals(1041L, long0);
  }

  @Test
  public void test03()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("Journal");
      File file0 = prevaylerDirectory0.journalFile((-317L), "Journal");
      long long0 = PrevaylerDirectory.journalVersion(file0);
      assertEquals("000000000000000-317.Journal", file0.getName());
      assertEquals((-1L), long0);
  }

  @Test
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrevaylerDirectory.snapshotVersion((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("}<K~prC-nJC2OHZc.");
      // Undeclared exception!
      try { 
        prevaylerDirectory0.snapshotFile((-373L), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrevaylerDirectory.renameUnusedFile((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      // Undeclared exception!
      try { 
        prevaylerDirectory0.produceDirectory();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.FileManager", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      // Undeclared exception!
      try { 
        prevaylerDirectory0.latestSnapshot();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrevaylerDirectory.journalVersion((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      // Undeclared exception!
      try { 
        prevaylerDirectory0.journalFile(2221L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("journal");
      // Undeclared exception!
      try { 
        prevaylerDirectory0.createTempFile((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.File", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("/");
      // Undeclared exception!
      try { 
        prevaylerDirectory0.createTempFile("/", "Snapshot");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         assertThrownBy("java.io.File", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrevaylerDirectory.checkValidSnapshotSuffix((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrevaylerDirectory.checkValidJournalSuffix((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = null;
      try {
        prevaylerDirectory0 = new PrevaylerDirectory((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.File", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      PrevaylerDirectory.checkValidJournalSuffix("journal");
  }

  @Test
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrevaylerDirectory.checkValidJournalSuffix("0000000000000000000.Journal");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Journal filename suffix must match /[a-zA-Z0-9]*[Jj]ournal/, but '0000000000000000000.Journal' does not
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrevaylerDirectory.checkValidSnapshotSuffix("S\"apshot");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Snapshot filename suffix must match /[a-zA-Z0-9]*[Ss]napshot/, but 'S\"apshot' does not
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      PrevaylerDirectory.checkValidSnapshotSuffix("snapshot");
  }

  @Test
  public void test20()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("Journal");
      try { 
        prevaylerDirectory0.latestSnapshot();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error reading file list from directory Journal
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("/");
      File file0 = prevaylerDirectory0.latestSnapshot();
      assertNull(file0);
  }

  @Test
  public void test22()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("Journal filename suffix must match /[a-zA-Z0-9]*[Jj]ournal/, but '");
      // Undeclared exception!
      try { 
        prevaylerDirectory0.journalFile(466L, "Journal filename suffix must match /[a-zA-Z0-9]*[Jj]ournal/, but '");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Journal filename suffix must match /[a-zA-Z0-9]*[Jj]ournal/, but 'Journal filename suffix must match /[a-zA-Z0-9]*[Jj]ournal/, but '' does not
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("Pj5![s1|");
      // Undeclared exception!
      try { 
        prevaylerDirectory0.snapshotFile((-1L), "Pj5![s1|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Snapshot filename suffix must match /[a-zA-Z0-9]*[Ss]napshot/, but 'Pj5![s1|' does not
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("/");
      File file0 = prevaylerDirectory0.findInitialJournalFile((-263L));
      assertNull(file0);
  }

  @Test
  public void test25()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("");
      // Undeclared exception!
      try { 
        prevaylerDirectory0.findInitialJournalFile(1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Arrays", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("/");
      prevaylerDirectory0.produceDirectory();
  }

  @Test
  public void test27()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
          File file0 = prevaylerDirectory0.journalFile(3705L, "journal");
          // Undeclared exception!
          try { 
            PrevaylerDirectory.renameUnusedFile(file0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"0000000000000003705.journal\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.File.renameTo(File.java:1388)
             // org.prevayler.implementation.PrevaylerDirectory.renameUnusedFile(PrevaylerDirectory.java:143)
             // sun.reflect.GeneratedMethodAccessor39.invoke(Unknown Source)
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
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test28()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      File file0 = prevaylerDirectory0.snapshotFile((-4L), "Snapshot");
      long long0 = PrevaylerDirectory.snapshotVersion(file0);
      assertEquals((-1L), long0);
      assertEquals("00000000000000000-4.Snapshot", file0.toString());
  }

  @Test
  public void test29()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("Journal");
      File file0 = prevaylerDirectory0.journalFile(0L, "Journal");
      long long0 = PrevaylerDirectory.journalVersion(file0);
      assertEquals(0L, long0);
  }
}
