/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:22:15 KST 2017
 */

package com.sleepycat.bind.tuple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.tuple.TupleMarshalledBinding;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TupleMarshalledBinding_ESTest4 extends TupleMarshalledBinding_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      TupleMarshalledBinding tupleMarshalledBinding0 = null;
      try {
        tupleMarshalledBinding0 = new TupleMarshalledBinding((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.Class", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TupleMarshalledBinding tupleMarshalledBinding0 = null;
      try {
        tupleMarshalledBinding0 = new TupleMarshalledBinding(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.lang.Integer does not implement MarshalledTupleEntry
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleMarshalledBinding", e);
      }
  }
}
