/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 17:00:59 KST 2018
 */

package it.yup.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.ui.UIButton;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIButton_ESTest4 extends UIButton_ESTest_scaffolding4 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "");
      uIButton0.setPressed(false);
      assertFalse(uIButton0.isWrappable());
      assertFalse(uIButton0.isPressed());
      assertEquals(2, uIButton0.getHPadding());
      assertTrue(uIButton0.isFocusable());
      assertEquals(1, uIButton0.getAnchorPoint());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "");
      assertEquals(2, uIButton0.getHPadding());
      
      uIButton0.setHPadding((-1));
      int int0 = uIButton0.getHPadding();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "");
      assertEquals(2, uIButton0.getHPadding());
      
      uIButton0.setHPadding(0);
      int int0 = uIButton0.getHPadding();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "");
      int int0 = uIButton0.getHPadding();
      assertEquals(1, uIButton0.getAnchorPoint());
      assertTrue(uIButton0.isFocusable());
      assertEquals(2, int0);
      assertFalse(uIButton0.isWrappable());
      assertFalse(uIButton0.isPressed());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "");
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
  public void test5()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "");
      assertFalse(uIButton0.isPressed());
      
      uIButton0.setPressed(true);
      boolean boolean0 = uIButton0.isPressed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UIButton uIButton0 = new UIButton((String) null);
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
  public void test7()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "");
      boolean boolean0 = uIButton0.isPressed();
      assertFalse(boolean0);
      assertEquals(2, uIButton0.getHPadding());
      assertFalse(uIButton0.isWrappable());
      assertEquals(1, uIButton0.getAnchorPoint());
      assertTrue(uIButton0.isFocusable());
  }
}
