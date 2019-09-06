/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:18:03 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class StringBinding_ESTest4 extends StringBinding_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      String string0 = StringBinding.entryToString(databaseEntry0);
      assertEquals("", string0);
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      StringBinding.stringToEntry((String) null, databaseEntry0);
      String string0 = StringBinding.entryToString(databaseEntry0);
      assertNull(string0);
  }

  @Test
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringBinding.stringToEntry("", (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      // Undeclared exception!
      try { 
        stringBinding0.objectToEntry((Object) "", (TupleOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.StringBinding", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      // Undeclared exception!
      try { 
        stringBinding0.objectToEntry((Object) stringBinding0, (TupleOutput) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.StringBinding cannot be cast to java.lang.String
         //
         assertThrownBy("com.sleepycat.bind.tuple.StringBinding", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      byte[] byteArray0 = new byte[4];
      TupleOutput tupleOutput0 = TupleBase.newOutput(byteArray0);
      tupleOutput0.addSize((byte) (-80));
      // Undeclared exception!
      try { 
        stringBinding0.objectToEntry((Object) null, tupleOutput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -80
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      // Undeclared exception!
      try { 
        stringBinding0.getTupleOutput(stringBinding0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.StringBinding cannot be cast to java.lang.String
         //
         assertThrownBy("com.sleepycat.bind.tuple.StringBinding", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)112;
      byteArray0[1] = (byte)115;
      byteArray0[2] = (byte) (-1);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      // Undeclared exception!
      try { 
        StringBinding.entryToString(databaseEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-974), 2081);
      // Undeclared exception!
      try { 
        StringBinding.entryToString(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -974
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      // Undeclared exception!
      try { 
        stringBinding0.entryToObject((TupleInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.StringBinding", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeByte(40);
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      // Undeclared exception!
      try { 
        stringBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-47);
      TupleInput tupleInput0 = new TupleInput(byteArray0, 1, 57);
      // Undeclared exception!
      try { 
        stringBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 0, 590);
      StringBinding stringBinding0 = new StringBinding();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      String string0 = (String)stringBinding0.entryToObject(tupleInput0);
      assertEquals("", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      byte[] byteArray0 = new byte[4];
      TupleOutput tupleOutput0 = TupleBase.newOutput(byteArray0);
      stringBinding0.objectToEntry((Object) null, tupleOutput0);
      assertEquals(0, stringBinding0.getTupleBufferSize());
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 0, 590);
      StringBinding.stringToEntry((String) null, databaseEntry0);
      StringBinding stringBinding0 = new StringBinding();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      Object object0 = stringBinding0.entryToObject(tupleInput0);
      assertNull(object0);
  }

  @Test
  public void test15()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        StringBinding.entryToString(databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      TupleOutput tupleOutput0 = stringBinding0.getTupleOutput((Object) null);
      assertEquals(0, tupleOutput0.getBufferLength());
  }
}