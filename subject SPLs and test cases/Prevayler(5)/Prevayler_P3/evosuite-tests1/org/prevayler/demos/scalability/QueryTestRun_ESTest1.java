/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 08 12:55:08 KST 2017
 */

package org.prevayler.demos.scalability;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.demos.scalability.prevayler.PrevaylerQuerySubject;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class QueryTestRun_ESTest1 extends QueryTestRun_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          int int0 = 0;
          PrevaylerQuerySubject prevaylerQuerySubject0 = null;
          try {
            prevaylerQuerySubject0 = new PrevaylerQuerySubject();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"QueryTest\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.File.mkdir(File.java:1311)
             // java.io.File.mkdirs(File.java:1343)
             // org.prevayler.foundation.FileManager.produceDirectory(FileManager.java:15)
             // org.prevayler.implementation.PrevaylerDirectory.produceDirectory(PrevaylerDirectory.java:35)
             // org.prevayler.implementation.snapshot.GenericSnapshotManager.<init>(GenericSnapshotManager.java:39)
             // org.prevayler.PrevaylerFactory.snapshotManager(PrevaylerFactory.java:428)
             // org.prevayler.PrevaylerFactory.create(PrevaylerFactory.java:344)
             // org.prevayler.demos.scalability.prevayler.PrevaylerQuerySubject.<init>(PrevaylerQuerySubject.java:19)
             // sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
             // sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
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

  @Test
  public void test1()  throws Throwable  {
      QueryTestRun queryTestRun0 = null;
      try {
        queryTestRun0 = new QueryTestRun((ScalabilityTestSubject) null, 0, 258, 258);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.ScalabilityTestRun", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      QueryTestRun queryTestRun0 = null;
      try {
        queryTestRun0 = new QueryTestRun((ScalabilityTestSubject) null, 0, 3, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The minimum number of threads cannot be greater than the maximum number.
         //
         assertThrownBy("org.prevayler.demos.scalability.ScalabilityTestRun", e);
      }
  }
}
