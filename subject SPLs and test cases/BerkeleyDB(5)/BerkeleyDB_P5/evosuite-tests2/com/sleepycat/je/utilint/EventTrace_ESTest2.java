/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:45:58 KST 2017
 */

package com.sleepycat.je.utilint;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class EventTrace_ESTest2 extends EventTrace_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      EventTrace.ExceptionEventTrace eventTrace_ExceptionEventTrace0 = new EventTrace.ExceptionEventTrace();
      String string0 = eventTrace_ExceptionEventTrace0.toString();
      //  // Unstable assertion: assertEquals("java.lang.Exception\r\n\tat com.sleepycat.je.utilint.EventTrace$ExceptionEventTrace.&lt;init&gt;(EventTrace.java:91)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:241)\r\n\tat org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)\r\n\tat org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:196)\r\n\tat org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:306)\r\n\tat org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:212)\r\n\tat org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)\r\n\tat java.util.concurrent.FutureTask.run(FutureTask.java:266)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)\r\n\tat java.lang.Thread.run(Thread.java:745)\r\n", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      EventTrace eventTrace0 = new EventTrace("");
  }
}
