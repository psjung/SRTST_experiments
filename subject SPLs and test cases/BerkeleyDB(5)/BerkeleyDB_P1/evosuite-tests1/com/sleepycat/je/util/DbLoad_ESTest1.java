/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:20:31 KST 2017
 */

package com.sleepycat.je.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PushbackReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.Environment;
import com.sleepycat.je.log.LogException;

import sun.nio.cs.ext.DoubleByte;
import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbLoad_ESTest1 extends DbLoad_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        DbLoad.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-n";
      stringArray0[1] = "-h";
      stringArray0[2] = "";
      try { 
        DbLoad.main(stringArray0);
        fail("Expecting exception: LogException");
      
      } catch(LogException e) {
         //
         // Environment home  doesn't exist
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      byte[] byteArray0 = new byte[0];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 877, 877);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      DoubleByte.Decoder doubleByte_Decoder0 = (DoubleByte.Decoder)mS949_0.newDecoder();
      InputStreamReader inputStreamReader0 = new InputStreamReader((InputStream) tupleInput0, (CharsetDecoder) doubleByte_Decoder0);
      inputStreamReader0.close();
      LineNumberReader lineNumberReader0 = new LineNumberReader((Reader) inputStreamReader0);
      dbLoad0.setInputReader(lineNumberReader0);
      try { 
        dbLoad0.load();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         assertThrownBy("sun.nio.cs.StreamDecoder", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      char[] charArray0 = new char[6];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      PushbackReader pushbackReader0 = new PushbackReader((Reader) charArrayReader0);
      LineNumberReader lineNumberReader0 = new LineNumberReader((Reader) pushbackReader0, 1408);
      dbLoad0.setInputReader(lineNumberReader0);
      // Undeclared exception!
      try { 
        dbLoad0.load();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid header parameter: \u0000\u0000\u0000\u0000\u0000\u0000
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[5];
          stringArray0[1] = "-c";
          stringArray0[2] = "bsdW=}$;3g/3U>=nWW";
          stringArray0[0] = "";
          // Undeclared exception!
          try { 
            DbLoad.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbLoad.printUsage(DbLoad.java:78)
             // com.sleepycat.je.util.DbLoad.parseArgs(DbLoad.java:140)
             // com.sleepycat.je.util.DbLoad.main(DbLoad.java:64)
             // sun.reflect.GeneratedMethodAccessor19.invoke(Unknown Source)
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
  public void test05()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.setTextFileMode(true);
      dbLoad0.setDbName("*[fX;_=A. ~;oWU>C");
      // Undeclared exception!
      try { 
        dbLoad0.load();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.setTextFileMode(true);
      // Undeclared exception!
      try { 
        dbLoad0.load();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply a database name if -l not supplied.
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.setProgressInterval(877);
      // Undeclared exception!
      try { 
        dbLoad0.load();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[6];
          stringArray0[0] = "d1bh(/";
          stringArray0[1] = "-f";
          stringArray0[3] = "k'7~/#q8";
          stringArray0[4] = "dupsort";
          stringArray0[5] = "pW0D|bp\"B*^Y`d";
          // Undeclared exception!
          try { 
            DbLoad.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbLoad.printUsage(DbLoad.java:78)
             // com.sleepycat.je.util.DbLoad.parseArgs(DbLoad.java:152)
             // com.sleepycat.je.util.DbLoad.main(DbLoad.java:64)
             // sun.reflect.GeneratedMethodAccessor19.invoke(Unknown Source)
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
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-v";
      // Undeclared exception!
      try { 
        DbLoad.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[8];
          stringArray0[0] = "-c: ";
          stringArray0[1] = "\"CNm]fWwwB[i;s%";
          stringArray0[2] = " prepare failed because there were open cursors.";
          stringArray0[3] = "";
          stringArray0[4] = "E~goTjy~'W O{";
          stringArray0[5] = "zdpr3=;5/E*B*j";
          stringArray0[6] = "\n</Cursor>";
          stringArray0[7] = "-h";
          // Undeclared exception!
          try { 
            DbLoad.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbLoad.printUsage(DbLoad.java:78)
             // com.sleepycat.je.util.DbLoad.parseArgs(DbLoad.java:123)
             // com.sleepycat.je.util.DbLoad.main(DbLoad.java:64)
             // sun.reflect.GeneratedMethodAccessor19.invoke(Unknown Source)
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
  public void test11()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[7];
          stringArray0[0] = "fQ";
          stringArray0[1] = "!PY__]oMo/yO;,]";
          stringArray0[2] = "";
          stringArray0[3] = "kW~!`gHE$";
          stringArray0[4] = "PF0Pn3b";
          stringArray0[5] = "^/es*x#j6UN^*@";
          stringArray0[6] = "-f";
          // Undeclared exception!
          try { 
            DbLoad.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbLoad.printUsage(DbLoad.java:78)
             // com.sleepycat.je.util.DbLoad.parseArgs(DbLoad.java:115)
             // com.sleepycat.je.util.DbLoad.main(DbLoad.java:64)
             // sun.reflect.GeneratedMethodAccessor19.invoke(Unknown Source)
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
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[6];
          stringArray0[0] = " {3bqv?%^'><V(";
          stringArray0[1] = "-V";
          // Undeclared exception!
          try { 
            DbLoad.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.0\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbLoad.parseArgs(DbLoad.java:108)
             // com.sleepycat.je.util.DbLoad.main(DbLoad.java:64)
             // sun.reflect.GeneratedMethodAccessor19.invoke(Unknown Source)
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
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-I";
      // Undeclared exception!
      try { 
        DbLoad.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "NEXT_NODUP";
      stringArray0[1] = "d1bh(/";
      stringArray0[2] = "false";
      stringArray0[3] = "-s requires an argument";
      stringArray0[4] = "-h";
      stringArray0[5] = "3I|&<)g3mT.(Y{*";
      stringArray0[6] = "-h is a required argument";
      stringArray0[7] = "Enviroment creation isn't allowed,  but there is no pre-existing  environment in";
      stringArray0[8] = "-T";
      try { 
        DbLoad.main(stringArray0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.io.IOException: Invalid argument
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[6];
          stringArray0[0] = "-s";
          stringArray0[2] = ">";
          stringArray0[3] = "`QEr";
          stringArray0[4] = "m*I@j&NObt5{";
          stringArray0[5] = "-s";
          // Undeclared exception!
          try { 
            DbLoad.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbLoad.printUsage(DbLoad.java:78)
             // com.sleepycat.je.util.DbLoad.parseArgs(DbLoad.java:131)
             // com.sleepycat.je.util.DbLoad.main(DbLoad.java:64)
             // sun.reflect.GeneratedMethodAccessor19.invoke(Unknown Source)
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
  public void test16()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.setEnv((Environment) null);
  }

  @Test
  public void test17()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      byte[] byteArray0 = new byte[0];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 877, 877);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      DoubleByte.Decoder doubleByte_Decoder0 = (DoubleByte.Decoder)mS949_0.newDecoder();
      InputStreamReader inputStreamReader0 = new InputStreamReader((InputStream) tupleInput0, (CharsetDecoder) doubleByte_Decoder0);
      LineNumberReader lineNumberReader0 = new LineNumberReader((Reader) inputStreamReader0);
      dbLoad0.setInputReader(lineNumberReader0);
      // Undeclared exception!
      try { 
        dbLoad0.load();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply a database name if -l not supplied.
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.setIgnoreUnknownConfig(false);
  }

  @Test
  public void test19()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.setTotalLoadBytes(88L);
  }

  @Test
  public void test20()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.hook835();
  }

  @Test
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        DbLoad.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.setNoOverwrite(true);
  }

  @Test
  public void test23()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.setProgressInterval((-1966L));
      // Undeclared exception!
      try { 
        dbLoad0.load();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }
}
