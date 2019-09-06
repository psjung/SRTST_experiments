/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:20:02 KST 2017
 */

package com.sleepycat.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class ExceptionUnwrapper_ESTest3 extends ExceptionUnwrapper_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      Throwable throwable0 = ExceptionUnwrapper.unwrapAny((Throwable) null);
      assertNull(throwable0);
  }

  @Test
  public void test1()  throws Throwable  {
      Error error0 = new Error();
      IOExceptionWrapper iOExceptionWrapper0 = new IOExceptionWrapper((Throwable) error0);
      Error error1 = (Error)ExceptionUnwrapper.unwrapAny(iOExceptionWrapper0);
      assertEquals("java.lang.Error", error1.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      Exception exception0 = new Exception(".JbYR=&6&9X/TF");
      Exception exception1 = ExceptionUnwrapper.unwrap(exception0);
      assertSame(exception1, exception0);
  }

  @Test
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExceptionUnwrapper.unwrap((Exception) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not Exception or Error: null
         //
         assertThrownBy("com.sleepycat.util.ExceptionUnwrapper", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ExceptionUnwrapper exceptionUnwrapper0 = new ExceptionUnwrapper();
  }
}