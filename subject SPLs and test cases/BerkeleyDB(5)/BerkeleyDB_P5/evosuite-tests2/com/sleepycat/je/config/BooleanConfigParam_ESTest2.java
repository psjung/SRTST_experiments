/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:47:27 KST 2017
 */

package com.sleepycat.je.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.config.BooleanConfigParam;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class BooleanConfigParam_ESTest2 extends BooleanConfigParam_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam("W%WbpL:^b&[", true, true, "W%WbpL:^b&[");
      // Undeclared exception!
      try { 
        booleanConfigParam0.validateValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.BooleanConfigParam", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = null;
      try {
        booleanConfigParam0 = new BooleanConfigParam("", true, true, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam("w", true, true, "w");
      booleanConfigParam0.validateValue("false");
      assertEquals("w", booleanConfigParam0.getDescription());
  }

  @Test
  public void test3()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam("true", false, false, "true");
      try { 
        booleanConfigParam0.validateValue("Bv~?Jsc7W:]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.BooleanConfigParam: Bv~?Jsc7W:] not valid boolean true
         //
         assertThrownBy("com.sleepycat.je.config.BooleanConfigParam", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam("true", false, false, "true");
      booleanConfigParam0.validateValue("true");
      assertEquals("true", booleanConfigParam0.toString());
  }
}
