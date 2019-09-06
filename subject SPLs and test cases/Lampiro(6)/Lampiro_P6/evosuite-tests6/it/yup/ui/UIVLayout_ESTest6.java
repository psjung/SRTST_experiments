/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 15:00:40 KST 2018
 */

package it.yup.ui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Graphics;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIVLayout_ESTest6 extends UIVLayout_ESTest_scaffolding6 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[12];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setHeight((-1));
      assertEquals((-1), uIRadioButtons0.getGradientColor());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(1, 0);
      UIPanel uIPanel0 = new UIPanel();
      uIVLayout0.insert(uIPanel0, 0, 0, 0);
      assertEquals(0, uIPanel0.getLayoutHeight());
      assertEquals(0, uIPanel0.getType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 1);
      int int0 = uIVLayout0.getHeight((Graphics) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, (-2));
      int int0 = uIVLayout0.getHeight((Graphics) null);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      // Undeclared exception!
      try { 
        uIVLayout0.paint((Graphics) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIVLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      // Undeclared exception!
      try { 
        uIRadioButtons0.paint((Graphics) null, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("it.yup.ui.UIRadioButtons", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(1761, 0);
      // Undeclared exception!
      try { 
        uIVLayout0.insert((UIItem) null, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIVLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[6];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      // Undeclared exception!
      try { 
        uIRadioButtons0.insert((UIItem) null, (-1), 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("it.yup.ui.UIVLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[0];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      // Undeclared exception!
      try { 
        uIRadioButtons0.getHeight((Graphics) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("it.yup.ui.UIRadioButtons", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UIVLayout uIVLayout0 = null;
      try {
        uIVLayout0 = new UIVLayout((-1), 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      uIVLayout0.height = (-1);
      // Undeclared exception!
      try { 
        uIVLayout0.getHeight((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIVLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      int int0 = uIVLayout0.getHeight((Graphics) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[12];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setHeight(0);
      assertEquals((-1), uIRadioButtons0.getSelectedIndex());
  }
}
