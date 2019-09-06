/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:09:22 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TupleBase_ESTest5 extends TupleBase_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      tupleBase0.setTupleBufferSize(32768);
      int int0 = tupleBase0.getTupleBufferSize();
      assertEquals(32768, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      tupleBase0.setTupleBufferSize((-1041));
      int int0 = tupleBase0.getTupleBufferSize();
      assertEquals((-1041), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      tupleBase0.setTupleBufferSize(461);
      Object object0 = new Object();
      tupleBase0.getTupleOutput(object0);
      assertEquals(461, tupleBase0.getTupleBufferSize());
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte)0, (int) (byte)3);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      TupleBase.inputToEntry(tupleInput0, databaseEntry0);
      assertEquals(0, tupleInput0.getBufferOffset());
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      // Undeclared exception!
      try { 
        TupleBase.outputToEntry(tupleOutput0, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        TupleBase.entryToInput((DatabaseEntry) null);
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
      TupleBase tupleBase0 = new TupleBase();
      int int0 = tupleBase0.getTupleBufferSize();
      assertEquals(0, int0);
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = TupleBase.newOutput(byteArray0);
      assertEquals(0, tupleOutput0.getBufferLength());
  }

  @Test
  public void test08()  throws Throwable  {
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      assertEquals(0, tupleOutput0.getBufferLength());
  }

  @Test
  public void test09()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      Object object0 = new Object();
      TupleOutput tupleOutput0 = tupleBase0.getTupleOutput(object0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        TupleBase.inputToEntry(tupleInput0, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      TupleOutput tupleOutput0 = tupleBase0.getTupleOutput("yR/M,KSn");
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleBase.outputToEntry(tupleOutput0, databaseEntry0);
      assertEquals(0, tupleBase0.getTupleBufferSize());
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      assertTrue(tupleInput0.markSupported());
  }

  @Test
  public void test12()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      tupleBase0.setTupleBufferSize((-1041));
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        tupleBase0.getTupleOutput(object0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }
}