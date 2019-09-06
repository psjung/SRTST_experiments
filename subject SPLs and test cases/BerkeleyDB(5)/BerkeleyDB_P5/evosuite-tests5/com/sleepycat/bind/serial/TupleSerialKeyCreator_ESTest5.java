/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 08:59:32 KST 2017
 */

package com.sleepycat.bind.serial;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TupleSerialKeyCreator_ESTest5 extends TupleSerialKeyCreator_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      TupleSerialMarshalledKeyCreator tupleSerialMarshalledKeyCreator0 = null;
      try {
        tupleSerialMarshalledKeyCreator0 = new TupleSerialMarshalledKeyCreator(tupleSerialMarshalledBinding0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // dataBinding may not be null
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledKeyCreator", e);
      }
  }
}
