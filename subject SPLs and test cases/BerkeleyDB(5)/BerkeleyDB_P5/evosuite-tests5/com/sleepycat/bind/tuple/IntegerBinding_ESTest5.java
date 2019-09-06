/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:05:16 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class IntegerBinding_ESTest5 extends IntegerBinding_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      IntegerBinding.intToEntry(128, databaseEntry0);
      int int0 = IntegerBinding.entryToInt(databaseEntry0);
      assertEquals(128, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      int int0 = IntegerBinding.entryToInt(databaseEntry0);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      IntegerBinding.intToEntry((-5588), databaseEntry0);
      IntegerBinding integerBinding0 = new IntegerBinding();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      Integer integer0 = (Integer)integerBinding0.entryToObject(tupleInput0);
      assertEquals((-5588), (int)integer0);
  }

  @Test
  public void test03()  throws Throwable  {
      IntegerBinding integerBinding0 = new IntegerBinding();
      byte[] byteArray0 = new byte[4];
      TupleOutput tupleOutput0 = TupleBase.newOutput(byteArray0);
      // Undeclared exception!
      try { 
        integerBinding0.objectToEntry((Object) null, tupleOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.IntegerBinding", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      IntegerBinding integerBinding0 = new IntegerBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      // Undeclared exception!
      try { 
        integerBinding0.objectToEntry((Object) integerBinding0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.IntegerBinding cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.tuple.IntegerBinding", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        IntegerBinding.intToEntry(995, (DatabaseEntry) null);
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
      IntegerBinding integerBinding0 = new IntegerBinding();
      // Undeclared exception!
      try { 
        integerBinding0.entryToObject((TupleInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.IntegerBinding", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      IntegerBinding integerBinding0 = new IntegerBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        integerBinding0.entryToObject(tupleInput0);
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
        IntegerBinding.entryToInt((DatabaseEntry) null);
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
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        IntegerBinding.entryToInt(databaseEntry0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-42), 1);
      // Undeclared exception!
      try { 
        IntegerBinding.entryToInt(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -42
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      IntegerBinding integerBinding0 = new IntegerBinding();
      Double double0 = new Double(1.0);
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      integerBinding0.objectToEntry((Object) double0, tupleOutput0);
      assertEquals(4, tupleOutput0.getBufferLength());
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-42), 1);
      IntegerBinding.intToEntry(0, databaseEntry0);
      int int0 = IntegerBinding.entryToInt(databaseEntry0);
      assertEquals(0, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      IntegerBinding integerBinding0 = new IntegerBinding();
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte) (-101), 155);
      // Undeclared exception!
      try { 
        integerBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -101
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      IntegerBinding integerBinding0 = new IntegerBinding();
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      TupleOutput tupleOutput1 = integerBinding0.getTupleOutput(tupleOutput0);
      assertFalse(tupleOutput1.equals((Object)tupleOutput0));
  }
}
