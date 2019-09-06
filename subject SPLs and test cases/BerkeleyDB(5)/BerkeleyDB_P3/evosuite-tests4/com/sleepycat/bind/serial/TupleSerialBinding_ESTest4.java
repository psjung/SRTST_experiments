/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:09:48 KST 2017
 */

package com.sleepycat.bind.serial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.serial.SerialBinding;
import com.sleepycat.bind.serial.TupleSerialMarshalledBinding;
import com.sleepycat.bind.tuple.TupleBase;
import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleOutput;
import com.sleepycat.je.DatabaseEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TupleSerialBinding_ESTest4 extends TupleSerialBinding_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0, 0, 0);
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
      Object object0 = tupleSerialMarshalledBinding0.objectToData((Object) null);
      assertNull(object0);
  }

  @Test
  public void test03()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      byte[] byteArray0 = new byte[0];
      tupleSerialMarshalledBinding0.setTupleBufferSize((-2369));
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 1419, 1419);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey((Object) null, databaseEntry0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey((Object) databaseEntry0, databaseEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.DatabaseEntry cannot be cast to com.sleepycat.bind.tuple.MarshalledTupleKeyEntity
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      byte[] byteArray0 = new byte[6];
      TupleOutput tupleOutput0 = TupleBase.newOutput(byteArray0);
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
      Integer integer0 = new Integer(143);
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey((Object) integer0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to com.sleepycat.bind.tuple.MarshalledTupleKeyEntity
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      byte[] byteArray0 = new byte[6];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 1747, 128);
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
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.entryToObject(tupleInput0, (Object) tupleInput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.TupleInput cannot be cast to com.sleepycat.bind.tuple.MarshalledTupleKeyEntity
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 1419, 1419);
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
  public void test10()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToData((Object) null, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialBinding", e);
      }
  }
}