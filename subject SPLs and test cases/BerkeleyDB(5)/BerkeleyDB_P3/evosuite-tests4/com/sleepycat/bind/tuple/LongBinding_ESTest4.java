/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:15:47 KST 2017
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
public class LongBinding_ESTest4 extends LongBinding_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LongBinding.longToEntry(0L, databaseEntry0);
      long long0 = LongBinding.entryToLong(databaseEntry0);
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LongBinding.longToEntry(2833L, databaseEntry0);
      long long0 = LongBinding.entryToLong(databaseEntry0);
      assertEquals(2833L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LongBinding.longToEntry(2833L, databaseEntry0);
      LongBinding longBinding0 = new LongBinding();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      Long long0 = (Long)longBinding0.entryToObject(tupleInput0);
      assertEquals(2833L, (long)long0);
  }

  @Test
  public void test03()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      // Undeclared exception!
      try { 
        longBinding0.objectToEntry((Object) null, (TupleOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.LongBinding", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      // Undeclared exception!
      try { 
        longBinding0.objectToEntry((Object) longBinding0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.LongBinding cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.tuple.LongBinding", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        LongBinding.longToEntry(820L, (DatabaseEntry) null);
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
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 0, 32);
      // Undeclared exception!
      try { 
        LongBinding.entryToLong(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
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
      Integer integer0 = new Integer((-1));
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      longBinding0.objectToEntry((Object) integer0, tupleOutput0);
      assertEquals(0, tupleOutput0.getBufferOffset());
  }

  @Test
  public void test12()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      TupleOutput tupleOutput0 = longBinding0.getTupleOutput(longBinding0);
      assertEquals(0, tupleOutput0.getBufferOffset());
  }

  @Test
  public void test13()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LongBinding.longToEntry((-879L), databaseEntry0);
      long long0 = LongBinding.entryToLong(databaseEntry0);
      assertEquals((-879L), long0);
  }

  @Test
  public void test14()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      byte[] byteArray0 = new byte[0];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (-565), (-1));
      // Undeclared exception!
      try { 
        longBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -565
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }
}