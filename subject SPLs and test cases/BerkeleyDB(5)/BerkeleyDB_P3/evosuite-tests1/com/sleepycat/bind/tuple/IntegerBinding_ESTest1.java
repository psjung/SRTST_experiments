/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:14:44 KST 2017
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
public class IntegerBinding_ESTest1 extends IntegerBinding_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      IntegerBinding.intToEntry(128, databaseEntry0);
      int int0 = IntegerBinding.entryToInt(databaseEntry0);
      assertEquals(128, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      IntegerBinding integerBinding0 = new IntegerBinding();
      Short short0 = new Short((short) (byte) (-27));
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      integerBinding0.objectToEntry((Object) short0, databaseEntry0);
      int int0 = IntegerBinding.entryToInt(databaseEntry0);
      assertEquals((-27), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      IntegerBinding integerBinding0 = new IntegerBinding();
      Short short0 = new Short((short) (byte) (-27));
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      integerBinding0.objectToEntry((Object) short0, databaseEntry0);
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      Integer integer0 = (Integer)integerBinding0.entryToObject(tupleInput0);
      assertEquals((-27), (int)integer0);
  }

  @Test
  public void test03()  throws Throwable  {
      IntegerBinding integerBinding0 = new IntegerBinding();
      Double double0 = new Double((-14.812));
      // Undeclared exception!
      try { 
        integerBinding0.objectToEntry((Object) double0, (TupleOutput) null);
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
      Short short0 = new Short((short)128);
      TupleOutput tupleOutput0 = integerBinding0.getTupleOutput(short0);
      // Undeclared exception!
      try { 
        integerBinding0.objectToEntry((Object) tupleOutput0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.TupleOutput cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.tuple.IntegerBinding", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        IntegerBinding.intToEntry((-810), (DatabaseEntry) null);
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
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[9];
      databaseEntry0.setData(byteArray0, 0, (int) (byte)56);
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      tupleInput0.readLong();
      // Undeclared exception!
      try { 
        integerBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
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
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)0, 0);
      databaseEntry0.setData(byteArray0, (int) (byte) (-26), (int) (byte)0);
      // Undeclared exception!
      try { 
        IntegerBinding.entryToInt(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -26
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      IntegerBinding integerBinding0 = new IntegerBinding();
      Long long0 = new Long(2L);
      TupleOutput tupleOutput0 = new TupleOutput();
      integerBinding0.objectToEntry((Object) long0, tupleOutput0);
      assertEquals(0, tupleOutput0.getBufferOffset());
  }

  @Test
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      IntegerBinding.intToEntry(0, databaseEntry0);
      int int0 = IntegerBinding.entryToInt(databaseEntry0);
      assertEquals(0, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      IntegerBinding integerBinding0 = new IntegerBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
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
}
