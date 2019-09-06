/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:20:30 KST 2017
 */

package com.sleepycat.bind.serial;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class SerialBinding_ESTest2 extends SerialBinding_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      SerialBinding serialBinding0 = null;
      try {
        serialBinding0 = new SerialBinding((ClassCatalog) null, (Class) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // classCatalog must be non-null
         //
         assertThrownBy("com.sleepycat.bind.serial.SerialBinding", e);
      }
  }
}
