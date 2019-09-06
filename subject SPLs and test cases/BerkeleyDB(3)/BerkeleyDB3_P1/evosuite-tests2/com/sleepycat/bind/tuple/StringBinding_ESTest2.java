/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:04:27 KST 2017
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
public class StringBinding_ESTest2 extends StringBinding_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-3270), 1461);
      StringBinding.stringToEntry((String) null, databaseEntry0);
      String string0 = StringBinding.entryToString(databaseEntry0);
      assertNull(string0);
  }

  @Test
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringBinding.stringToEntry(" offset=", (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      // Undeclared exception!
      try { 
        stringBinding0.objectToEntry((Object) "$j:N<|ah$um", (TupleOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.StringBinding", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      Integer integer0 = new Integer(0);
      TupleOutput tupleOutput0 = new TupleOutput();
      // Undeclared exception!
      try { 
        stringBinding0.objectToEntry((Object) integer0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         assertThrownBy("com.sleepycat.bind.tuple.StringBinding", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringBinding.entryToString((DatabaseEntry) null);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-15);
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
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      // Undeclared exception!
      try { 
        StringBinding.entryToString(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeByte((-667));
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
  public void test10()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      byte[] byteArray0 = new byte[6];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte)103, (-1));
      // Undeclared exception!
      try { 
        stringBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 103
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      TupleOutput tupleOutput0 = stringBinding0.getTupleOutput("");
      stringBinding0.objectToEntry((Object) null, tupleOutput0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      Object object0 = stringBinding0.entryToObject(tupleInput0);
      assertNull(object0);
  }

  @Test
  public void test12()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      TupleOutput tupleOutput0 = stringBinding0.getTupleOutput("");
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      String string0 = (String)stringBinding0.entryToObject(tupleInput0);
      assertEquals("", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)0, (int) (byte)0);
      String string0 = StringBinding.entryToString(databaseEntry0);
      assertEquals("", string0);
  }
}