/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 17:39:33 KST 2018
 */

package it.yup.ui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Graphics;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIHLayout_ESTest5 extends UIHLayout_ESTest_scaffolding5 {
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
      UIHLayout uIHLayout0 = new UIHLayout(0);
      // Undeclared exception!
      try { 
        uIHLayout0.paint((Graphics) null, 0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIHLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(0);
      // Undeclared exception!
      try { 
        uIHLayout0.insert(uIHLayout0, 1, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("it.yup.ui.UIHLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(1);
      UITextPanel uITextPanel0 = new UITextPanel();
      uIHLayout0.insert(uITextPanel0, 0, 0, 0);
      assertEquals(0, uITextPanel0.getLayoutWidth());
      assertTrue(uITextPanel0.isDirty());
      assertEquals(0, uITextPanel0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(0);
      // Undeclared exception!
      try { 
        uIHLayout0.paint((Graphics) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIHLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(39);
      UIVLayout uIVLayout0 = new UIVLayout(1, 0);
      // Undeclared exception!
      try { 
        uIHLayout0.insert(uIVLayout0, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UIHLayout uIHLayout0 = null;
      try {
        uIHLayout0 = new UIHLayout((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(0);
      int int0 = uIHLayout0.getHeight((Graphics) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(1);
      // Undeclared exception!
      try { 
        uIHLayout0.getHeight((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIHLayout", e);
      }
  }
}
