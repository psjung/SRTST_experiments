/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 11:40:25 KST 2018
 */

package it.yup.util;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class GoogleToken_ESTest2 extends GoogleToken_ESTest_scaffolding2 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GoogleToken googleToken0 = new GoogleToken((String) null, (String) null, (Object) null);
      // Undeclared exception!
      try { 
        googleToken0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.GoogleToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        GoogleToken.getToken("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.GoogleToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GoogleToken googleToken0 = new GoogleToken("", "p", "");
      // Undeclared exception!
      try { 
        googleToken0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.GoogleToken", e);
      }
  }
}
