/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 17:05:06 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.RunRecoveryException;
import com.sleepycat.je.config.ConfigParam;
import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Tracer_ESTest4 extends Tracer_ESTest_scaffolding4 {

  @Test
  public void test02()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tracer.getStackTrace((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.Tracer", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Tracer tracer0 = new Tracer(": ");
      Tracer tracer1 = new Tracer("<sg a-,l=\"");
      boolean boolean0 = tracer0.equals(tracer1);
      assertFalse(boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tracer.parseLevel((EnvironmentImpl) null, (ConfigParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.Tracer", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      RunRecoveryException runRecoveryException0 = new RunRecoveryException((EnvironmentImpl) null, (Throwable) null);
      String string0 = Tracer.getStackTrace(runRecoveryException0);
      //  // Unstable assertion: assertEquals("com.sleepycat.je.RunRecoveryException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:241)\r\n\tat org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)\r\n\tat org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:196)\r\n\tat org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:306)\r\n\tat org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:212)\r\n\tat org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)\r\n\tat java.util.concurrent.FutureTask.run(FutureTask.java:266)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)\r\n\tat java.lang.Thread.run(Thread.java:745)\r\n", string0);
  }

  
}
