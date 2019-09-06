/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:30:18 KST 2017
 */

package com.sleepycat.je.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.OutputStream;
import java.io.PrintStream;
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbCacheSize_ESTest2 extends DbCacheSize_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      PrintStream printStream0 = new PrintStream((OutputStream) tupleOutput0, true);
      DbCacheSize.DbCacheSize_insertRecords dbCacheSize_DbCacheSize_insertRecords0 = new DbCacheSize.DbCacheSize_insertRecords(printStream0, (Environment) null, (Database) null, 24L, 10011, 10011, true);
      dbCacheSize_DbCacheSize_insertRecords0.keySize = 0;
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
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      PrintStream printStream0 = new PrintStream((OutputStream) tupleOutput0, true);
      DbCacheSize.DbCacheSize_insertRecords dbCacheSize_DbCacheSize_insertRecords0 = new DbCacheSize.DbCacheSize_insertRecords(printStream0, (Environment) null, (Database) null, 10000, 374, (-2014028953), true);
  }

  @Test
  public void test02()  throws Throwable  {
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      PrintStream printStream0 = new PrintStream((OutputStream) tupleOutput0, false);
      DbCacheSize.DbCacheSize_insertRecords dbCacheSize_DbCacheSize_insertRecords0 = new DbCacheSize.DbCacheSize_insertRecords(printStream0, (Environment) null, (Database) null, 24L, 10011, 10011, false);
      dbCacheSize_DbCacheSize_insertRecords0.keySize = 0;
      dbCacheSize_DbCacheSize_insertRecords0.execute();
      assertEquals(43, tupleOutput0.size());
      assertEquals(43, tupleOutput0.getBufferLength());
  }

  @Test
  public void test03()  throws Throwable  {
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      PrintStream printStream0 = new PrintStream((OutputStream) tupleOutput0, false);
      DbCacheSize.DbCacheSize_insertRecords dbCacheSize_DbCacheSize_insertRecords0 = new DbCacheSize.DbCacheSize_insertRecords(printStream0, (Environment) null, (Database) null, 24L, 10011, 10011, false);
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
  public void test04()  throws Throwable  {
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      PrintStream printStream0 = new PrintStream((OutputStream) tupleOutput0, true);
      DbCacheSize.DbCacheSize_insertRecords dbCacheSize_DbCacheSize_insertRecords0 = new DbCacheSize.DbCacheSize_insertRecords(printStream0, (Environment) null, (Database) null, 0L, 10000, 10000, true);
      dbCacheSize_DbCacheSize_insertRecords0.execute();
  }

  @Test
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[15];
      stringArray0[1] = "\n      # Average data bytes per record; if omitted no leaf";
      stringArray0[0] = "-measure";
      DbCacheSize.main(stringArray0);
  }

  @Test
  public void test06()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[15];
          stringArray0[1] = "-is 1 open Database in the Environment.\n";
          stringArray0[0] = "-measure";
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test07()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[1];
          stringArray0[0] = "-overhead";
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test08()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[9];
          stringArray0[0] = "-density";
          stringArray0[1] = "-density";
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test09()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[9];
          stringArray0[0] = "-density";
          stringArray0[1] = "";
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test10()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[15];
          stringArray0[0] = "\n      # Average data bytes per record; if omitted no leaf";
          stringArray0[1] = "-is 1 open Database in the Environment.\n";
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test11()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[3];
          stringArray0[0] = "-data";
          stringArray0[1] = "-data";
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test12()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[3];
          stringArray0[0] = "-nodemax";
          stringArray0[1] = "-nodemax";
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test13()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[0];
          DbCacheSize.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test15()  throws Throwable  {
      DbCacheSize dbCacheSize0 = new DbCacheSize();
  }

  
}
