/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 13:55:57 KST 2018
 */

package it.yup.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.ui.UITextField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UITextField_ESTest3 extends UITextField_ESTest_scaffolding3 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UITextField uITextField0 = null;
      try {
        uITextField0 = new UITextField((String) null, (String) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UITextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UITextField uITextField0 = null;
      try {
        uITextField0 = new UITextField("", "", 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UITextField", e);
      }
  }
}
