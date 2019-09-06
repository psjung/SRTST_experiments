/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 16:41:12 KST 2017
 */

package com.sleepycat.je.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.Properties;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.bind.tuple.TupleBase;
import com.sleepycat.bind.tuple.TupleOutput;
import com.sleepycat.je.Database;
import com.sleepycat.je.Environment;
import com.sleepycat.je.EnvironmentConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbCacheSize_ESTest4 extends DbCacheSize_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      DbCacheSize.DbCacheSize_insertRecords dbCacheSize_DbCacheSize_insertRecords0 = new DbCacheSize.DbCacheSize_insertRecords((PrintStream) null, (Environment) null, (Database) null, 504, 504, 504, false);
      dbCacheSize_DbCacheSize_insertRecords0.keySize = (-1598);
      dbCacheSize_DbCacheSize_insertRecords0.keySize = 90;
      // Undeclared exception!
      try { 
        dbCacheSize_DbCacheSize_insertRecords0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbCacheSize$DbCacheSize_insertRecords", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      DbCacheSize.DbCacheSize_insertRecords dbCacheSize_DbCacheSize_insertRecords0 = new DbCacheSize.DbCacheSize_insertRecords((PrintStream) null, (Environment) null, (Database) null, 504, 504, 504, true);
      dbCacheSize_DbCacheSize_insertRecords0.keySize = (-1598);
      // Undeclared exception!
      try { 
        dbCacheSize_DbCacheSize_insertRecords0.execute();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbCacheSize$DbCacheSize_insertRecords", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      PrintStream printStream0 = null;
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
  public void test04()  throws Throwable  {
      DbCacheSize.DbCacheSize_insertRecords dbCacheSize_DbCacheSize_insertRecords0 = new DbCacheSize.DbCacheSize_insertRecords((PrintStream) null, (Environment) null, (Database) null, 504, 504, 504, false);
      dbCacheSize_DbCacheSize_insertRecords0.keySize = (-1567);
      // Undeclared exception!
      try { 
        dbCacheSize_DbCacheSize_insertRecords0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbCacheSize$DbCacheSize_insertRecords", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      DbCacheSize.DbCacheSize_insertRecords dbCacheSize_DbCacheSize_insertRecords0 = new DbCacheSize.DbCacheSize_insertRecords((PrintStream) null, (Environment) null, (Database) null, 504, 504, 504, false);
      dbCacheSize_DbCacheSize_insertRecords0.keySize = 1;
      // Undeclared exception!
      try { 
        dbCacheSize_DbCacheSize_insertRecords0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbCacheSize$DbCacheSize_insertRecords", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DbCacheSize.DbCacheSize_insertRecords dbCacheSize_DbCacheSize_insertRecords0 = new DbCacheSize.DbCacheSize_insertRecords((PrintStream) null, (Environment) null, (Database) null, 504, 504, 504, true);
      // Undeclared exception!
      try { 
        dbCacheSize_DbCacheSize_insertRecords0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbCacheSize$DbCacheSize_insertRecords", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DbCacheSize.DbCacheSize_insertRecords dbCacheSize_DbCacheSize_insertRecords0 = new DbCacheSize.DbCacheSize_insertRecords((PrintStream) null, (Environment) null, (Database) null, 504, 504, 504, false);
      dbCacheSize_DbCacheSize_insertRecords0.records = (long) (-1598);
      dbCacheSize_DbCacheSize_insertRecords0.execute();
  }

  @Test
  public void test08()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[9];
          stringArray0[0] = "/yc35v=s`/J6kU";
          stringArray0[1] = "+7F ";
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test09()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[1];
          stringArray0[0] = "-measure";
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test10()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[5];
          stringArray0[1] = "-y";
          stringArray0[0] = "-nodemax";
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test11()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[10];
          stringArray0[1] = "DKnqL<?{QUz";
          stringArray0[0] = "-nodemax";
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test12()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[5];
          stringArray0[0] = "-key";
          stringArray0[1] = "<txn id=\"";
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test13()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[5];
          stringArray0[0] = "-key";
          stringArray0[1] = "-key";
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test14()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[6];
          stringArray0[0] = "-overhead";
          stringArray0[1] = ".(X2ltZe;Q";
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test15()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[0];
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test16()  throws Throwable  {
      DbCacheSize dbCacheSize0 = new DbCacheSize();
  }

  
}
