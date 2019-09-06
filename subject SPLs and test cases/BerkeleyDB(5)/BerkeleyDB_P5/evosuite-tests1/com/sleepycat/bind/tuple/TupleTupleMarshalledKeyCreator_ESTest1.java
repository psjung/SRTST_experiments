/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:25:24 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TupleTupleMarshalledKeyCreator_ESTest1 extends TupleTupleMarshalledKeyCreator_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "");
      byte[] byteArray0 = new byte[0];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 0, 0);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      TupleInput tupleInput1 = TupleBase.entryToInput(databaseEntry0);
      TupleOutput tupleOutput0 = new TupleOutput();
      // Undeclared exception!
      try { 
        tupleTupleMarshalledKeyCreator0.createSecondaryKey(tupleInput0, tupleInput1, tupleOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleTupleMarshalledKeyCreator", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "9km-#6M>iZqyU");
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        tupleTupleMarshalledKeyCreator0.nullifyForeignKey(tupleInput0, tupleOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleTupleMarshalledKeyCreator", e);
      }
  }
}
