/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 17:58:26 KST 2018
 */

package it.yup.ui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Vector;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UITextPanel_ESTest5 extends UITextPanel_ESTest_scaffolding5 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setEnableEmoticons(false);
      assertFalse(uITextPanel0.isEnableEmoticons());
      assertFalse(uITextPanel0.isNeedScrollbar());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setSelected(false);
      assertFalse(uITextPanel0.isEnableEmoticons());
      assertFalse(uITextPanel0.isSelected());
      assertFalse(uITextPanel0.isNeedScrollbar());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      // Undeclared exception!
      try { 
        uITextPanel0.paint((Graphics) null, 1, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UITextPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setMaxHeight((-2));
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertFalse(uITextPanel0.isNeedScrollbar());
      assertFalse(uITextPanel0.isEnableEmoticons());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setMaxHeight((-1));
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertFalse(uITextPanel0.isNeedScrollbar());
      assertFalse(uITextPanel0.isEnableEmoticons());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      assertFalse(uITextPanel0.isNeedScrollbar());
      
      uITextPanel0.needScrollbar = true;
      boolean boolean0 = uITextPanel0.isNeedScrollbar();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      assertFalse(uITextPanel0.isEnableEmoticons());
      
      uITextPanel0.setEnableEmoticons(true);
      boolean boolean0 = uITextPanel0.isEnableEmoticons();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      Vector<UITextPanel> vector0 = new Vector<UITextPanel>();
      uITextPanel0.setTextLines(vector0);
      uITextPanel0.getTextLines();
      assertFalse(uITextPanel0.isNeedScrollbar());
      assertFalse(uITextPanel0.isEnableEmoticons());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      String[] stringArray0 = new String[9];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setWidth(0);
      uITextPanel0.setContainer((UIItem) uIRadioButtons0);
      uITextPanel0.getSelectedItem();
      assertFalse(uITextPanel0.isNeedScrollbar());
      assertFalse(uITextPanel0.isEnableEmoticons());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setWidth(1);
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertFalse(uITextPanel1.isNeedScrollbar());
      assertFalse(uITextPanel1.isEnableEmoticons());
      assertNotNull(uITextPanel1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setType(1);
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertNotNull(uITextPanel1);
      assertFalse(uITextPanel1.isNeedScrollbar());
      assertFalse(uITextPanel1.isEnableEmoticons());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setType((-1));
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertFalse(uITextPanel1.isNeedScrollbar());
      assertNotNull(uITextPanel1);
      assertFalse(uITextPanel1.isEnableEmoticons());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setLayoutWidth(1);
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertNotNull(uITextPanel1);
      assertFalse(uITextPanel1.isEnableEmoticons());
      assertFalse(uITextPanel1.isNeedScrollbar());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setLayoutHeight(1);
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertFalse(uITextPanel1.isNeedScrollbar());
      assertNotNull(uITextPanel1);
      assertFalse(uITextPanel1.isEnableEmoticons());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setGradientSelectedColor(1);
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertFalse(uITextPanel1.isNeedScrollbar());
      assertFalse(uITextPanel1.isEnableEmoticons());
      assertNotNull(uITextPanel1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setGradientColor(1);
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertFalse(uITextPanel1.isEnableEmoticons());
      assertNotNull(uITextPanel1);
      assertFalse(uITextPanel1.isNeedScrollbar());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setBg_color(0);
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertFalse(uITextPanel1.isNeedScrollbar());
      assertNotNull(uITextPanel1);
      assertFalse(uITextPanel1.isEnableEmoticons());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.bg_color = 1;
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertFalse(uITextPanel1.isEnableEmoticons());
      assertNotNull(uITextPanel1);
      assertFalse(uITextPanel1.isNeedScrollbar());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      int int0 = uITextPanel0.computeRealHeight((Graphics) null);
      assertEquals(0, int0);
      assertFalse(uITextPanel0.isNeedScrollbar());
      assertFalse(uITextPanel0.isEnableEmoticons());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setItems((Vector) null);
      // Undeclared exception!
      try { 
        uITextPanel0.setSelected(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UITextPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      // Undeclared exception!
      try { 
        uITextPanel0.keyPressed(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      // Undeclared exception!
      try { 
        uITextPanel0.drawScrollBar((Graphics) null, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UITextPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setScreen((UIScreen) null);
      assertFalse(uITextPanel0.isEnableEmoticons());
      assertFalse(uITextPanel0.isNeedScrollbar());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setSelected(true);
      uITextPanel0.getSelectedItem();
      assertTrue(uITextPanel0.isSelected());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setFont((Font) null);
      assertFalse(uITextPanel0.isEnableEmoticons());
      assertFalse(uITextPanel0.isNeedScrollbar());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      // Undeclared exception!
      try { 
        uITextPanel0.paint((Graphics) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UITextPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setMaxHeight(0);
      uITextPanel0.setMaxHeight(0);
      assertEquals(0, uITextPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.getTextLines();
      assertFalse(uITextPanel0.isEnableEmoticons());
      assertFalse(uITextPanel0.isNeedScrollbar());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      boolean boolean0 = uITextPanel0.isEnableEmoticons();
      assertFalse(boolean0);
      assertFalse(uITextPanel0.isNeedScrollbar());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.getText();
      assertFalse(uITextPanel0.isNeedScrollbar());
      assertFalse(uITextPanel0.isEnableEmoticons());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setText("");
      assertFalse(uITextPanel0.isEnableEmoticons());
      assertFalse(uITextPanel0.isNeedScrollbar());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      Vector<Object> vector0 = new Vector<Object>();
      uITextPanel0.setTextLines(vector0);
      // Undeclared exception!
      try { 
        uITextPanel0.paint((Graphics) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      boolean boolean0 = uITextPanel0.isNeedScrollbar();
      assertFalse(boolean0);
      assertFalse(uITextPanel0.isEnableEmoticons());
  }
}
