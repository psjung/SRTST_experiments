/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 00:53:09 KST 2018
 */

package it.yup.ui;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIButton_ESTest1 extends UIButton_ESTest_scaffolding1 {
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
      UIButton uIButton0 = new UIButton((Image) null, "");
      uIButton0.setPressed(false);
      assertFalse(uIButton0.isWrappable());
      assertEquals(1, uIButton0.getAnchorPoint());
      assertFalse(uIButton0.isPressed());
      assertEquals(2, uIButton0.getHPadding());
      assertTrue(uIButton0.isFocusable());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "");
      assertEquals(2, uIButton0.getHPadding());
      
      uIButton0.setHPadding(0);
      int int0 = uIButton0.getHPadding();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "");
      assertEquals(2, uIButton0.getHPadding());
      
      uIButton0.setHPadding((-1));
      int int0 = uIButton0.getHPadding();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UIButton uIButton0 = new UIButton("");
      // Undeclared exception!
      try { 
        uIButton0.paint((Graphics) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIButton", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "");
      int int0 = uIButton0.getHPadding();
      assertTrue(uIButton0.isFocusable());
      assertEquals(2, int0);
      assertEquals(1, uIButton0.getAnchorPoint());
      assertFalse(uIButton0.isPressed());
      assertFalse(uIButton0.isWrappable());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UIButton uIButton0 = new UIButton("");
      // Undeclared exception!
      try { 
        uIButton0.getHeight((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILabel", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UIButton uIButton0 = new UIButton("");
      assertFalse(uIButton0.isPressed());
      
      uIButton0.setPressed(true);
      boolean boolean0 = uIButton0.isPressed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "");
      boolean boolean0 = uIButton0.isPressed();
      assertEquals(2, uIButton0.getHPadding());
      assertFalse(uIButton0.isWrappable());
      assertEquals(1, uIButton0.getAnchorPoint());
      assertTrue(uIButton0.isFocusable());
      assertFalse(boolean0);
  }
}
