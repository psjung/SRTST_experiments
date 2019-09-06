/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:18:38 KST 2017
 */

package com.sleepycat.bind.tuple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.tuple.TupleBase;
import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleOutput;
import com.sleepycat.je.DatabaseEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TupleBase_ESTest4 extends TupleBase_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      tupleBase0.setTupleBufferSize(717);
      int int0 = tupleBase0.getTupleBufferSize();
      assertEquals(717, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      tupleBase0.setTupleBufferSize(809);
      tupleBase0.getTupleOutput(databaseEntry0);
      assertEquals(809, tupleBase0.getTupleBufferSize());
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      assertTrue(tupleInput0.markSupported());
  }

  @Test
  public void test03()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      TupleOutput tupleOutput0 = tupleBase0.getTupleOutput(tupleBase0);
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
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
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
  public void test05()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      tupleBase0.setTupleBufferSize((-321));
      // Undeclared exception!
      try { 
        tupleBase0.getTupleOutput(tupleBase0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      TupleOutput tupleOutput0 = TupleBase.newOutput(byteArray0);
      assertEquals(0, tupleOutput0.getBufferOffset());
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      TupleBase.inputToEntry(tupleInput0, databaseEntry0);
      assertTrue(tupleInput0.markSupported());
  }

  @Test
  public void test08()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      int int0 = tupleBase0.getTupleBufferSize();
      assertEquals(0, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleBase.outputToEntry(tupleOutput0, databaseEntry0);
      assertEquals(0, tupleOutput0.size());
  }

  @Test
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      tupleBase0.setTupleBufferSize((-3041));
      int int0 = tupleBase0.getTupleBufferSize();
      assertEquals((-3041), int0);
  }
}
