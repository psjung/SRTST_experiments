/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:23:30 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TupleTupleBinding_ESTest4 extends TupleTupleBinding_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      Class<String> class0 = String.class;
      TupleTupleMarshalledBinding tupleTupleMarshalledBinding0 = null;
      try {
        tupleTupleMarshalledBinding0 = new TupleTupleMarshalledBinding(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.lang.String does not implement MarshalledTupleKeyEntity
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleTupleMarshalledBinding", e);
      }
  }
}
