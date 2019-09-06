/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 18:02:42 KST 2018
 */

package it.yup.ui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Graphics;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIVLayout_ESTest5 extends UIVLayout_ESTest_scaffolding5 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(1, 0);
      UIVLayout uIVLayout1 = new UIVLayout(0, 0);
      uIVLayout0.insert(uIVLayout1, 0, 0, 0);
      assertEquals(0, uIVLayout1.getType());
      assertEquals(0, uIVLayout1.getLayoutHeight());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      uIVLayout0.setHeight(1);
      int int0 = uIVLayout0.getHeight((Graphics) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, (-2));
      int int0 = uIVLayout0.getHeight((Graphics) null);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(1, 0);
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
  public void test05()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      // Undeclared exception!
      try { 
        uIVLayout0.insert((UIItem) null, 0, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("it.yup.ui.UIVLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      int int0 = uIVLayout0.getHeight((Graphics) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      uIVLayout0.setHeight(0);
      assertEquals((-1), uIVLayout0.getGradientSelectedColor());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[2];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      // Undeclared exception!
      try { 
        uIRadioButtons0.getHeight((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILabel", e);
      }
  }
}
