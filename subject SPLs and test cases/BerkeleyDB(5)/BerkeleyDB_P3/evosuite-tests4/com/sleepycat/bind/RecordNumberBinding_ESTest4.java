/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:02:01 KST 2017
 */

package com.sleepycat.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.RecordNumberBinding;
import com.sleepycat.je.DatabaseEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class RecordNumberBinding_ESTest4 extends RecordNumberBinding_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        RecordNumberBinding.recordNumberToEntry(0L, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.RecordNumberBinding", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      RecordNumberBinding recordNumberBinding0 = new RecordNumberBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      Long long0 = new Long((long) (byte)73);
      // Undeclared exception!
      try { 
        recordNumberBinding0.objectToEntry(long0, databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      RecordNumberBinding recordNumberBinding0 = new RecordNumberBinding();
      byte[] byteArray0 = new byte[8];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-1), (int) (byte)0);
      // Undeclared exception!
      try { 
        recordNumberBinding0.objectToEntry((Object) null, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.RecordNumberBinding", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        RecordNumberBinding.entryToRecordNumber(databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        RecordNumberBinding.recordNumberToEntry((-675L), databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      RecordNumberBinding recordNumberBinding0 = new RecordNumberBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        recordNumberBinding0.objectToEntry(recordNumberBinding0, databaseEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.RecordNumberBinding cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.RecordNumberBinding", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      RecordNumberBinding recordNumberBinding0 = new RecordNumberBinding();
      // Undeclared exception!
      try { 
        recordNumberBinding0.entryToObject(databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }
}