/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:53:06 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.logging.Level;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.RunRecoveryException;
import com.sleepycat.je.config.ConfigParam;
import com.sleepycat.je.dbi.EnvironmentImpl;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Tracer_ESTest2 extends Tracer_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      Tracer tracer0 = new Tracer("-z");
      String string0 = tracer0.getMessage();
      assertEquals("-z", string0);
  }

  @Test
  public void test01()  throws Throwable  {
      File file0 = null;
      Properties properties0 = null;
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig(properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      RunRecoveryException runRecoveryException0 = new RunRecoveryException((EnvironmentImpl) null, "-z");
      String string0 = Tracer.getStackTrace(runRecoveryException0);
      //  // Unstable assertion: assertEquals("com.sleepycat.je.RunRecoveryException: -z\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:241)\r\n\tat org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)\r\n\tat org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:196)\r\n\tat org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:306)\r\n\tat org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:212)\r\n\tat org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)\r\n\tat java.util.concurrent.FutureTask.run(FutureTask.java:266)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)\r\n\tat java.lang.Thread.run(Thread.java:745)\r\n", string0);
  }

  @Test
  public void test04()  throws Throwable  {
      Tracer tracer0 = new Tracer("-z");
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      tracer0.dumpLog(stringBuffer0, false);
      //  // Unstable assertion: assertEquals(70, stringBuffer0.capacity());
      //  // Unstable assertion: assertEquals("<Dbg time=\"2017-04-22 02:52:47.109\"><msg val=\"-z\"/></Dbg>", stringWriter0.toString());
  }

  @Test
  public void test05()  throws Throwable  {
      Tracer tracer0 = new Tracer(".>'Qo`Lj;,e");
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(".>'Qo`Lj;,e");
      // Undeclared exception!
      try { 
        tracer0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Tracer tracer0 = new Tracer();
      // Undeclared exception!
      try { 
        tracer0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Tracer tracer0 = new Tracer();
      // Undeclared exception!
      try { 
        tracer0.readFromLog((ByteBuffer) null, (byte) (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Tracer tracer0 = new Tracer();
      // Undeclared exception!
      try { 
        tracer0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Tracer tracer0 = new Tracer();
      String string0 = tracer0.toString();
      assertEquals("null/null", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      Tracer tracer0 = new Tracer("~RVo");
      Tracer tracer1 = new Tracer();
      boolean boolean0 = tracer0.equals(tracer1);
      assertEquals("~RVo", tracer0.getMessage());
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      Tracer tracer0 = new Tracer();
      boolean boolean0 = tracer0.equals(tracer0);
      assertTrue(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      Tracer tracer0 = new Tracer("-z");
      Integer integer0 = new Integer(2413);
      boolean boolean0 = tracer0.equals(integer0);
      assertFalse(boolean0);
      assertEquals("-z", tracer0.getMessage());
  }

  @Test
  public void test13()  throws Throwable  {
      Tracer tracer0 = new Tracer("");
      tracer0.getLogType();
      assertEquals("", tracer0.getMessage());
  }

  @Test
  public void test14()  throws Throwable  {
      Tracer tracer0 = new Tracer("");
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("E|8o{ti(-l(6E9{5G?i");
      tracer0.writeToLog(byteBuffer0);
      assertEquals(7, byteBuffer0.remaining());
      assertEquals("", tracer0.getMessage());
  }

  @Test
  public void test15()  throws Throwable  {
      Tracer tracer0 = new Tracer("H(Je:7Z=qsQ1PP");
      // Undeclared exception!
      try { 
        tracer0.dumpLog((StringBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.Tracer", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      Tracer tracer0 = new Tracer();
      String string0 = tracer0.getMessage();
      assertNull(string0);
  }

  @Test
  public void test17()  throws Throwable  {
      Tracer tracer0 = new Tracer("");
      int int0 = tracer0.getLogSize();
      assertEquals(12, int0);
  }

  @Test
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tracer.trace((Level) null, (EnvironmentImpl) null, "&gt;");
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
      Tracer tracer0 = new Tracer("~RVo");
      tracer0.hashCode();
      assertEquals("~RVo", tracer0.getMessage());
  }

  @Test
  public void test20()  throws Throwable  {
      Tracer tracer0 = new Tracer();
      boolean boolean0 = tracer0.logEntryIsTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      Tracer tracer0 = new Tracer("-z");
      boolean boolean0 = tracer0.marshallOutsideWriteLatch();
      assertEquals("-z", tracer0.getMessage());
      assertTrue(boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      Tracer tracer0 = new Tracer("Q{8w");
      tracer0.postLogWork((-2393L));
      assertEquals("Q{8w", tracer0.getMessage());
  }

  @Test
  public void test23()  throws Throwable  {
      Tracer tracer0 = new Tracer();
      boolean boolean0 = tracer0.countAsObsoleteWhenLogged();
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
  public void test25()  throws Throwable  {
      Tracer tracer0 = new Tracer("-z");
      long long0 = tracer0.getTransactionId();
      assertEquals(0L, long0);
      assertEquals("-z", tracer0.getMessage());
  }

  @Test
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tracer.trace((EnvironmentImpl) null, "", "2017-04-22 02:52:04.197/~=V$o", "2017-04-22 02:52:04.197/~=V$o", (Throwable) null);
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
  public void test28()  throws Throwable  {
      Tracer tracer0 = new Tracer("Problem parsing parameter ");
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("Problem parsing parameter ");
      // Undeclared exception!
      try { 
        tracer0.readFromLog(byteBuffer0, (byte) (-94));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }
}
