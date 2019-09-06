/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 17:42:10 KST 2018
 */

package it.yup.ui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIItem_ESTest5 extends UIItem_ESTest_scaffolding5 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      
      uIAccordion0.setSelectedColor(1);
      int int0 = uIAccordion0.getSelectedColor();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setType(0);
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertTrue(uIAccordion0.isDirty());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      assertEquals((-1), uIAccordion0.getGradientColor());
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals(0, uIAccordion0.getType());
      assertEquals((-1), uIAccordion0.getBg_color());
      assertEquals((-1), uIAccordion0.getWidth());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setLayoutHeight(0);
      assertTrue(uIAccordion0.isDirty());
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals((-1), uIAccordion0.getBg_color());
      assertEquals(0, uIAccordion0.getLayoutHeight());
      assertEquals((-1), uIAccordion0.getGradientColor());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox((String) null);
      assertEquals((-1), uICheckbox0.getFg_color());
      
      uICheckbox0.setFg_color(0);
      assertEquals(0, uICheckbox0.getFg_color());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UIButton uIButton0 = new UIButton("");
      uIButton0.setDirty(false);
      assertEquals((-1), uIButton0.getGradientColor());
      assertEquals((-1), uIButton0.getGradientSelectedColor());
      assertEquals((-1), uIButton0.getBg_color());
      assertEquals((-1), uIButton0.getWidth());
      assertEquals(8947848, uIButton0.getSelectedColor());
      assertEquals((-1), uIButton0.getFg_color());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setContainer(uIAccordion0);
      assertEquals((-1), uIAccordion0.getGradientColor());
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      assertTrue(uIAccordion0.isDirty());
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals((-1), uIAccordion0.getBg_color());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UIButton uIButton0 = new UIButton("");
      assertEquals((-1), uIButton0.getBg_color());
      
      uIButton0.setBg_color(0);
      assertEquals(0, uIButton0.getBg_color());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.isFocusable();
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals((-1), uIAccordion0.getBg_color());
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      assertTrue(uIAccordion0.isDirty());
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals((-1), uIAccordion0.getGradientColor());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      uIVLayout0.isFocusable();
      assertEquals((-1), uIVLayout0.getFg_color());
      assertEquals(8947848, uIVLayout0.getSelectedColor());
      assertEquals((-1), uIVLayout0.getWidth());
      assertEquals((-1), uIVLayout0.getGradientColor());
      assertEquals((-1), uIVLayout0.getBg_color());
      assertEquals((-1), uIVLayout0.getGradientSelectedColor());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox("");
      assertEquals(0, uICheckbox0.getLayoutWidth());
      
      uICheckbox0.setLayoutWidth((-1));
      int int0 = uICheckbox0.getLayoutWidth();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(1, 0);
      int int0 = uISeparator0.getHeight((Graphics) null);
      assertEquals((-1), uISeparator0.getWidth());
      assertEquals((-1), uISeparator0.getGradientColor());
      assertEquals((-1), uISeparator0.getBg_color());
      assertEquals(0, uISeparator0.getFg_color());
      assertEquals(1, int0);
      assertFalse(uISeparator0.isFocusable());
      assertEquals((-1), uISeparator0.getGradientSelectedColor());
      assertEquals(8947848, uISeparator0.getSelectedColor());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(0, 0);
      assertEquals(0, uISeparator0.getFg_color());
      
      uISeparator0.fg_color = 1;
      int int0 = uISeparator0.getFg_color();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[4];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      int int0 = uIRadioButtons0.getFg_color();
      assertEquals((-1), int0);
      assertEquals((-1), uIRadioButtons0.getGradientColor());
      assertEquals((-1), uIRadioButtons0.getGradientSelectedColor());
      assertEquals((-1), uIRadioButtons0.getBg_color());
      assertEquals((-1), uIRadioButtons0.getWidth());
      assertEquals(8947848, uIRadioButtons0.getSelectedColor());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UIButton uIButton0 = new UIButton((Image) null, "");
      uIButton0.getContainer();
      assertEquals((-1), uIButton0.getWidth());
      assertEquals((-1), uIButton0.getGradientSelectedColor());
      assertEquals((-1), uIButton0.getGradientColor());
      assertEquals((-1), uIButton0.getFg_color());
      assertEquals(8947848, uIButton0.getSelectedColor());
      assertEquals((-1), uIButton0.getBg_color());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(0);
      assertEquals((-1), uIHLayout0.getBg_color());
      
      uIHLayout0.bg_color = 0;
      int int0 = uIHLayout0.getBg_color();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox("");
      boolean boolean0 = uICheckbox0.askRepaint();
      assertEquals((-1), uICheckbox0.getFg_color());
      assertEquals((-1), uICheckbox0.getBg_color());
      assertEquals((-1), uICheckbox0.getGradientSelectedColor());
      assertEquals((-1), uICheckbox0.getWidth());
      assertEquals((-1), uICheckbox0.getGradientColor());
      assertFalse(boolean0);
      assertEquals(8947848, uICheckbox0.getSelectedColor());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      // Undeclared exception!
      try { 
        uITextPanel0.paint0((Graphics) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(1);
      // Undeclared exception!
      try { 
        uIHLayout0.isDirty();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      // Undeclared exception!
      try { 
        uIPanel0.drawInput((Graphics) null, 0, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getSelectedColor();
      assertEquals((-1), uIAccordion0.getGradientColor());
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertTrue(uIAccordion0.isDirty());
      assertEquals((-1), uIAccordion0.getBg_color());
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals(8947848, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(0, 0);
      uISeparator0.setFocusable(true);
      uISeparator0.setSelected(true);
      assertTrue(uISeparator0.isSelected());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(0, 0);
      uISeparator0.setSelected(true);
      assertEquals(8947848, uISeparator0.getSelectedColor());
      assertFalse(uISeparator0.isSelected());
      assertEquals((-1), uISeparator0.getGradientSelectedColor());
      assertEquals((-1), uISeparator0.getBg_color());
      assertEquals((-1), uISeparator0.getWidth());
      assertEquals((-1), uISeparator0.getGradientColor());
      assertEquals(0, uISeparator0.getFg_color());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(0, 0);
      uISeparator0.setSelected(false);
      assertEquals((-1), uISeparator0.getBg_color());
      assertEquals(8947848, uISeparator0.getSelectedColor());
      assertEquals((-1), uISeparator0.getWidth());
      assertFalse(uISeparator0.isFocusable());
      assertEquals((-1), uISeparator0.getGradientSelectedColor());
      assertEquals((-1), uISeparator0.getGradientColor());
      assertEquals(0, uISeparator0.getFg_color());
      assertFalse(uISeparator0.isSelected());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(0, 0);
      uISeparator0.getStatus();
      assertFalse(uISeparator0.isFocusable());
      assertEquals(8947848, uISeparator0.getSelectedColor());
      assertEquals((-1), uISeparator0.getWidth());
      assertEquals(0, uISeparator0.getFg_color());
      assertEquals((-1), uISeparator0.getBg_color());
      assertEquals((-1), uISeparator0.getGradientColor());
      assertEquals((-1), uISeparator0.getGradientSelectedColor());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(0, 0);
      int int0 = uISeparator0.getHeight((Graphics) null);
      assertEquals((-1), uISeparator0.getGradientSelectedColor());
      assertEquals(0, int0);
      assertEquals(8947848, uISeparator0.getSelectedColor());
      assertFalse(uISeparator0.isFocusable());
      assertEquals((-1), uISeparator0.getGradientColor());
      assertEquals(0, uISeparator0.getFg_color());
      assertEquals((-1), uISeparator0.getBg_color());
      assertEquals((-1), uISeparator0.getWidth());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.getSubmenu();
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      assertEquals((-1), uIAccordion0.getBg_color());
      assertTrue(uIAccordion0.isDirty());
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals((-1), uIAccordion0.getGradientColor());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(0);
      assertEquals((-1), uIHLayout0.getGradientColor());
      
      uIHLayout0.setGradientColor(0);
      assertEquals(0, uIHLayout0.getGradientColor());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(0, 0);
      assertEquals((-1), uISeparator0.getWidth());
      
      uISeparator0.setWidth(0);
      assertEquals(0, uISeparator0.getWidth());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UILabel uILabel0 = new UILabel((String) null);
      uILabel0.setStatus((Object) null);
      assertFalse(uILabel0.isFocusable());
      assertEquals((-1), uILabel0.getGradientSelectedColor());
      assertEquals(8947848, uILabel0.getSelectedColor());
      assertEquals((-1), uILabel0.getWidth());
      assertEquals((-1), uILabel0.getFg_color());
      assertEquals((-1), uILabel0.getBg_color());
      assertEquals((-1), uILabel0.getGradientColor());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(0);
      int int0 = uIHLayout0.getBg_color();
      assertEquals((-1), uIHLayout0.getGradientSelectedColor());
      assertEquals(8947848, uIHLayout0.getSelectedColor());
      assertEquals((-1), int0);
      assertEquals((-1), uIHLayout0.getWidth());
      assertEquals((-1), uIHLayout0.getFg_color());
      assertEquals((-1), uIHLayout0.getGradientColor());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox("");
      UIItem uIItem0 = uICheckbox0.getSelectedItem();
      assertEquals((-1), uIItem0.getFg_color());
      assertEquals((-1), uIItem0.getGradientColor());
      assertEquals((-1), uIItem0.getWidth());
      assertEquals((-1), uIItem0.getBg_color());
      assertEquals((-1), uIItem0.getGradientSelectedColor());
      assertEquals(8947848, uIItem0.getSelectedColor());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox("");
      int int0 = uICheckbox0.getLayoutWidth();
      assertEquals(0, int0);
      assertEquals((-1), uICheckbox0.getWidth());
      assertEquals((-1), uICheckbox0.getFg_color());
      assertEquals((-1), uICheckbox0.getBg_color());
      assertEquals((-1), uICheckbox0.getGradientSelectedColor());
      assertEquals(8947848, uICheckbox0.getSelectedColor());
      assertEquals((-1), uICheckbox0.getGradientColor());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      
      uIAccordion0.setSelectedColor(0);
      int int0 = uIAccordion0.getSelectedColor();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(0, 0);
      boolean boolean0 = uISeparator0.isDirty();
      assertEquals(0, uISeparator0.getFg_color());
      assertEquals(8947848, uISeparator0.getSelectedColor());
      assertEquals((-1), uISeparator0.getGradientColor());
      assertEquals((-1), uISeparator0.getGradientSelectedColor());
      assertEquals((-1), uISeparator0.getWidth());
      assertEquals((-1), uISeparator0.getBg_color());
      assertFalse(uISeparator0.isFocusable());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(0, 0);
      int int0 = uISeparator0.getLayoutHeight();
      assertEquals(0, int0);
      assertEquals((-1), uISeparator0.getGradientSelectedColor());
      assertEquals(8947848, uISeparator0.getSelectedColor());
      assertFalse(uISeparator0.isFocusable());
      assertEquals((-1), uISeparator0.getGradientColor());
      assertEquals(0, uISeparator0.getFg_color());
      assertEquals((-1), uISeparator0.getBg_color());
      assertEquals((-1), uISeparator0.getWidth());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(0, 0);
      int int0 = uISeparator0.getFg_color();
      assertEquals((-1), uISeparator0.getGradientColor());
      assertEquals((-1), uISeparator0.getGradientSelectedColor());
      assertEquals((-1), uISeparator0.getWidth());
      assertEquals((-1), uISeparator0.getBg_color());
      assertFalse(uISeparator0.isFocusable());
      assertEquals(8947848, uISeparator0.getSelectedColor());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(0, 0);
      uISeparator0.getScreen();
      assertEquals(0, uISeparator0.getFg_color());
      assertEquals((-1), uISeparator0.getBg_color());
      assertEquals((-1), uISeparator0.getWidth());
      assertEquals((-1), uISeparator0.getGradientColor());
      assertFalse(uISeparator0.isFocusable());
      assertEquals((-1), uISeparator0.getGradientSelectedColor());
      assertEquals(8947848, uISeparator0.getSelectedColor());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      assertEquals((-1), uITextPanel0.getGradientSelectedColor());
      
      uITextPanel0.setGradientSelectedColor(0);
      assertEquals(0, uITextPanel0.getGradientSelectedColor());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getGradientSelectedColor();
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals((-1), uIAccordion0.getGradientColor());
      assertEquals((-1), uIAccordion0.getBg_color());
      assertEquals((-1), int0);
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      assertTrue(uIAccordion0.isDirty());
  }
}