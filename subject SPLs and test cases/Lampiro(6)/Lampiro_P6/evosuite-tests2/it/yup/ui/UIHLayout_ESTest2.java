/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 11:16:38 KST 2018
 */

package it.yup.ui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIHLayout_ESTest2 extends UIHLayout_ESTest_scaffolding2 {

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
      UIHLayout uIHLayout0 = new UIHLayout(38);
      UIButton uIButton0 = new UIButton("");
      uIHLayout0.insert(uIButton0, 0, 0, 1);
      assertEquals(1, uIButton0.getType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(38);
      UIButton uIButton0 = new UIButton((Image) null, "");
      uIHLayout0.insert(uIButton0, 0, 1, 0);
      assertEquals(1, uIButton0.getLayoutWidth());
      assertEquals(0, uIButton0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(0);
      // Undeclared exception!
      try { 
        uIHLayout0.insert((UIItem) null, 1, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("it.yup.ui.UIHLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
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
  public void test5()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(1);
      // Undeclared exception!
      try { 
        uIHLayout0.insert((UIItem) null, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIHLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
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
  public void test7()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(0);
      int int0 = uIHLayout0.getHeight((Graphics) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
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
