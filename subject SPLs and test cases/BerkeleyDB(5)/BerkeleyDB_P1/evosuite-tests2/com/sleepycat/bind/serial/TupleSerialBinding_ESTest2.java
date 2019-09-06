/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:14:25 KST 2017
 */

package com.sleepycat.bind.serial;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleOutput;
import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TupleSerialBinding_ESTest2 extends TupleSerialBinding_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.entryToObject(databaseEntry0, databaseEntry1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialBinding", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      Object object0 = tupleSerialMarshalledBinding0.entryToObject((TupleInput) null, (Object) null);
      assertNull(object0);
  }

  @Test
  public void test02()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      int int0 = 0;
      Integer integer0 = new Integer(int0);
      Integer integer1 = (Integer)tupleSerialMarshalledBinding0.objectToData((Object) integer0);
      assertEquals(0, (int)integer1);
  }

  @Test
  public void test03()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey((Object) null, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      byte[] byteArray0 = new byte[3];
      tupleSerialMarshalledBinding0.setTupleBufferSize((-1590));
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey((Object) tupleSerialMarshalledBinding0, databaseEntry0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      byte[] byteArray0 = new byte[7];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey((Object) null, tupleOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      byte[] byteArray0 = new byte[1];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey((Object) tupleSerialMarshalledBinding0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.serial.TupleSerialMarshalledBinding cannot be cast to com.sleepycat.bind.tuple.MarshalledTupleKeyEntity
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.entryToObject(tupleInput0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      byte[] byteArray0 = new byte[6];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte) (-1), (int) (byte)73);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.entryToObject(tupleInput0, (Object) tupleSerialMarshalledBinding0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.serial.TupleSerialMarshalledBinding cannot be cast to com.sleepycat.bind.tuple.MarshalledTupleKeyEntity
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey((Object) tupleSerialMarshalledBinding0, databaseEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.serial.TupleSerialMarshalledBinding cannot be cast to com.sleepycat.bind.tuple.MarshalledTupleKeyEntity
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToData((Object) tupleSerialMarshalledBinding0, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialBinding", e);
      }
  }
}