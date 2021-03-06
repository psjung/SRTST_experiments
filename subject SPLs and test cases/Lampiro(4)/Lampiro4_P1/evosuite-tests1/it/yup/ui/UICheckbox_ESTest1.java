/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 00:55:37 KST 2018
 */

package it.yup.ui;

import static org.junit.Assert.assertFalse;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UICheckbox_ESTest1 extends UICheckbox_ESTest_scaffolding1 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox("");
      assertFalse(uICheckbox0.isChecked());
      
      uICheckbox0.setChecked(true);
      boolean boolean0 = uICheckbox0.isChecked();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox("");
      // Undeclared exception!
      try { 
        uICheckbox0.keyPressed(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox((String) null);
      uICheckbox0.setChecked(true);
      assertTrue(uICheckbox0.isChecked());
      
      uICheckbox0.setChecked(false);
      assertFalse(uICheckbox0.isChecked());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox("");
      uICheckbox0.setChecked(false);
      assertTrue(uICheckbox0.isFocusable());
      assertFalse(uICheckbox0.isChecked());
      assertFalse(uICheckbox0.isWrappable());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox("");
      boolean boolean0 = uICheckbox0.isChecked();
      assertTrue(uICheckbox0.isFocusable());
      assertFalse(uICheckbox0.isWrappable());
      assertFalse(boolean0);
  }
}
