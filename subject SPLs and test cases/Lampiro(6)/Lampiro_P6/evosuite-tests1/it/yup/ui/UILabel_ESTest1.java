/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 01:03:00 KST 2018
 */

package it.yup.ui;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Vector;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UILabel_ESTest1 extends UILabel_ESTest_scaffolding1 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "");
      uIButton0.setText("");
      assertEquals((-1), uIButton0.getImgAnchorPoint());
      assertFalse(uIButton0.isFlip());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UILabel uILabel0 = new UILabel((Image) null, "");
      assertFalse(uILabel0.isFlip());
      
      uILabel0.setFlip(true);
      boolean boolean0 = uILabel0.isFlip();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UILabel uILabel0 = new UILabel("");
      Vector<Object> vector0 = new Vector<Object>();
      uILabel0.setTextLines(vector0);
      uILabel0.getTextLines();
      assertFalse(uILabel0.isFlip());
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      assertFalse(uILabel0.isWrappable());
      assertEquals(20, uILabel0.getAnchorPoint());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UIButton uIButton0 = new UIButton((String) null);
      uIButton0.getText();
      assertFalse(uIButton0.isFlip());
      assertEquals((-1), uIButton0.getImgAnchorPoint());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "S");
      uIButton0.getText();
      assertFalse(uIButton0.isFlip());
      assertEquals((-1), uIButton0.getImgAnchorPoint());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UILabel uILabel0 = new UILabel((Image) null);
      assertEquals(20, uILabel0.getAnchorPoint());
      
      uILabel0.setAnchorPoint(0);
      int int0 = uILabel0.getAnchorPoint();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UILabel uILabel0 = new UILabel((Image) null);
      assertEquals(20, uILabel0.getAnchorPoint());
      
      uILabel0.setAnchorPoint((-1));
      int int0 = uILabel0.getAnchorPoint();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox("");
      // Undeclared exception!
      try { 
        uICheckbox0.paint((Graphics) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILabel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox("");
      uICheckbox0.setImg((Image) null);
      assertEquals(20, uICheckbox0.getAnchorPoint());
      assertEquals((-1), uICheckbox0.getImgAnchorPoint());
      assertFalse(uICheckbox0.isFlip());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UIButton uIButton0 = new UIButton("");
      uIButton0.setWrappable(true, 0);
      assertTrue(uIButton0.isWrappable());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "");
      uIButton0.setWrappable(false, 0);
      assertEquals(0, uIButton0.getWidth());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("K", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox("w ");
      // Undeclared exception!
      try { 
        uICheckbox0.computeTextLines((Font) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILabel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "S");
      // Undeclared exception!
      try { 
        uIButton0.computeTextLines((Font) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILabel", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UILabel uILabel0 = new UILabel((Image) null);
      uILabel0.computeTextLines((Font) null, 0);
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      assertEquals(20, uILabel0.getAnchorPoint());
      assertFalse(uILabel0.isWrappable());
      assertFalse(uILabel0.isFlip());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UILabel uILabel0 = new UILabel((Image) null, "");
      boolean boolean0 = uILabel0.isFlip();
      assertFalse(uILabel0.isWrappable());
      assertEquals(20, uILabel0.getAnchorPoint());
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UILabel uILabel0 = new UILabel((Image) null);
      int int0 = uILabel0.getImgAnchorPoint();
      assertEquals(20, uILabel0.getAnchorPoint());
      assertFalse(uILabel0.isWrappable());
      assertEquals((-1), int0);
      assertFalse(uILabel0.isFlip());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UILabel uILabel0 = new UILabel((Image) null);
      // Undeclared exception!
      try { 
        uILabel0.getTextWidth("", (Font) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILabel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UILabel uILabel0 = new UILabel((Image) null);
      boolean boolean0 = uILabel0.isWrappable();
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      assertEquals(20, uILabel0.getAnchorPoint());
      assertFalse(uILabel0.isFlip());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UILabel uILabel0 = new UILabel((Image) null);
      uILabel0.getFont();
      assertFalse(uILabel0.isFlip());
      assertFalse(uILabel0.isWrappable());
      assertEquals(20, uILabel0.getAnchorPoint());
      assertEquals((-1), uILabel0.getImgAnchorPoint());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UILabel uILabel0 = new UILabel("");
      // Undeclared exception!
      try { 
        uILabel0.paintTextLine((Graphics) null, "", 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILabel", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "");
      String string0 = uIButton0.getText();
      assertNotNull(string0);
      assertFalse(uIButton0.isFlip());
      assertEquals((-1), uIButton0.getImgAnchorPoint());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UILabel uILabel0 = new UILabel("");
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      
      uILabel0.setImgAnchorPoint(0);
      assertEquals(0, uILabel0.getImgAnchorPoint());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UILabel uILabel0 = new UILabel((Image) null, "");
      uILabel0.setFont((Font) null);
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      assertEquals(20, uILabel0.getAnchorPoint());
      assertFalse(uILabel0.isFlip());
      assertFalse(uILabel0.isWrappable());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UILabel uILabel0 = new UILabel((Image) null, "");
      uILabel0.getImg();
      assertFalse(uILabel0.isFlip());
      assertFalse(uILabel0.isWrappable());
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      assertEquals(20, uILabel0.getAnchorPoint());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UILabel uILabel0 = new UILabel((Image) null);
      int int0 = uILabel0.getAnchorPoint();
      assertEquals(20, int0);
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      assertFalse(uILabel0.isFlip());
      assertFalse(uILabel0.isWrappable());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UILabel uILabel0 = new UILabel("");
      uILabel0.getTextLines();
      assertFalse(uILabel0.isWrappable());
      assertFalse(uILabel0.isFlip());
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      assertEquals(20, uILabel0.getAnchorPoint());
  }
}
