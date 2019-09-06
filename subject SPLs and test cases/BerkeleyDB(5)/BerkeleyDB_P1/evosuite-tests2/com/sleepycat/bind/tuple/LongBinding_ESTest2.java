/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:07:01 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LongBinding_ESTest2 extends LongBinding_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LongBinding.longToEntry(2087L, databaseEntry0);
      long long0 = LongBinding.entryToLong(databaseEntry0);
      assertEquals(2087L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      long long0 = LongBinding.entryToLong(databaseEntry0);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test
  public void test02()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LongBinding.longToEntry(2L, databaseEntry0);
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      Long long0 = (Long)longBinding0.entryToObject(tupleInput0);
      assertEquals(2L, (long)long0);
  }

  @Test
  public void test03()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      Long long0 = new Long((-1924L));
      TupleOutput tupleOutput0 = new TupleOutput();
      longBinding0.objectToEntry((Object) long0, tupleOutput0);
      assertEquals(0, tupleOutput0.getBufferOffset());
  }

  @Test
  public void test04()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      TupleOutput tupleOutput0 = longBinding0.getTupleOutput((Object) null);
      // Undeclared exception!
      try { 
        longBinding0.objectToEntry((Object) null, tupleOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.LongBinding", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        LongBinding.longToEntry((-837L), (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      // Undeclared exception!
      try { 
        longBinding0.entryToObject((TupleInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.LongBinding", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      byte[] byteArray0 = new byte[0];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      // Undeclared exception!
      try { 
        longBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        LongBinding.entryToLong((DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setData(byteArray0, (-2204), 1394);
      // Undeclared exception!
      try { 
        LongBinding.entryToLong(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2204
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        LongBinding.entryToLong(databaseEntry0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      Object object0 = new Object();
      TupleOutput tupleOutput0 = longBinding0.getTupleOutput(object0);
      // Undeclared exception!
      try { 
        longBinding0.objectToEntry(object0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.tuple.LongBinding", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LongBinding.longToEntry(0L, databaseEntry0);
      long long0 = LongBinding.entryToLong(databaseEntry0);
      assertEquals(0L, long0);
  }

  @Test
  public void test13()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)0, 1259);
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      // Undeclared exception!
      try { 
        longBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }
}