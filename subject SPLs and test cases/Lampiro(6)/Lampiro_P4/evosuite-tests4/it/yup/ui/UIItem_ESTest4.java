/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 15:28:17 KST 2018
 */

package it.yup.ui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Graphics;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIItem_ESTest4 extends UIItem_ESTest_scaffolding4 {
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
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setType(0);
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals(0, uIAccordion0.getType());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      assertEquals((-1), uIAccordion0.getBg_color());
      assertTrue(uIAccordion0.isDirty());
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertEquals((-1), uIAccordion0.getGradientColor());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UIGauge uIGauge0 = new UIGauge("", false, 0, 0);
      uIGauge0.setScreen((UIScreen) null);
      assertEquals((-1), uIGauge0.getBg_color());
      assertEquals((-1), uIGauge0.getGradientSelectedColor());
      assertEquals(8947848, uIGauge0.getSelectedColor());
      assertEquals((-1), uIGauge0.getGradientColor());
      assertFalse(uIGauge0.isFocusable());
      assertEquals((-1), uIGauge0.getFg_color());
      assertEquals((-1), uIGauge0.getWidth());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setLayoutHeight(0);
      assertEquals((-1), uITextPanel0.getFg_color());
      assertTrue(uITextPanel0.isDirty());
      assertEquals(0, uITextPanel0.getLayoutHeight());
      assertEquals((-1), uITextPanel0.getBg_color());
      assertEquals((-1), uITextPanel0.getWidth());
      assertEquals(8947848, uITextPanel0.getSelectedColor());
      assertEquals((-1), uITextPanel0.getGradientSelectedColor());
      assertEquals((-1), uITextPanel0.getGradientColor());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox("");
      uICheckbox0.setFocusable(false);
      assertFalse(uICheckbox0.isFocusable());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UIGauge uIGauge0 = new UIGauge("", false, 0, 0);
      uIGauge0.setDirty(false);
      assertEquals((-1), uIGauge0.getWidth());
      assertEquals((-1), uIGauge0.getGradientColor());
      assertEquals((-1), uIGauge0.getGradientSelectedColor());
      assertEquals(8947848, uIGauge0.getSelectedColor());
      assertFalse(uIGauge0.isFocusable());
      assertEquals((-1), uIGauge0.getBg_color());
      assertEquals((-1), uIGauge0.getFg_color());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      uIVLayout0.setContainer((UIIContainer) null);
      assertEquals((-1), uIVLayout0.getWidth());
      assertEquals(8947848, uIVLayout0.getSelectedColor());
      assertEquals((-1), uIVLayout0.getFg_color());
      assertEquals((-1), uIVLayout0.getBg_color());
      assertEquals((-1), uIVLayout0.getGradientSelectedColor());
      assertEquals((-1), uIVLayout0.getGradientColor());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      assertEquals((-1), uIPanel0.getBg_color());
      
      uIPanel0.setBg_color(0);
      assertEquals(0, uIPanel0.getBg_color());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.isFocusable();
      assertEquals((-1), uITextPanel0.getFg_color());
      assertEquals((-1), uITextPanel0.getGradientColor());
      assertEquals((-1), uITextPanel0.getGradientSelectedColor());
      assertEquals(8947848, uITextPanel0.getSelectedColor());
      assertEquals((-1), uITextPanel0.getBg_color());
      assertEquals((-1), uITextPanel0.getWidth());
      assertTrue(uITextPanel0.isDirty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      uIVLayout0.isFocusable();
      assertEquals((-1), uIVLayout0.getFg_color());
      assertEquals((-1), uIVLayout0.getGradientSelectedColor());
      assertEquals(8947848, uIVLayout0.getSelectedColor());
      assertEquals((-1), uIVLayout0.getGradientColor());
      assertEquals((-1), uIVLayout0.getBg_color());
      assertEquals((-1), uIVLayout0.getWidth());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(0);
      assertEquals((-1), uISeparator0.getWidth());
      
      uISeparator0.setWidth(1);
      int int0 = uISeparator0.getWidth();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      UIItem uIItem0 = uIPanel0.getSelectedItem();
      assertEquals((-1), uIItem0.getGradientColor());
      assertEquals((-1), uIItem0.getWidth());
      assertEquals((-1), uIItem0.getGradientSelectedColor());
      assertEquals((-1), uIItem0.getFg_color());
      assertEquals((-1), uIItem0.getBg_color());
      assertEquals(8947848, uIItem0.getSelectedColor());
      assertTrue(uIItem0.isDirty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.getScreen();
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      assertTrue(uIAccordion0.isDirty());
      assertEquals((-1), uIAccordion0.getGradientColor());
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals((-1), uIAccordion0.getBg_color());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.getContainer();
      assertEquals((-1), uIPanel0.getGradientSelectedColor());
      assertEquals(8947848, uIPanel0.getSelectedColor());
      assertEquals((-1), uIPanel0.getWidth());
      assertEquals((-1), uIPanel0.getBg_color());
      assertEquals((-1), uIPanel0.getGradientColor());
      assertEquals((-1), uIPanel0.getFg_color());
      assertTrue(uIPanel0.isDirty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      assertEquals((-1), uIAccordion0.getBg_color());
      
      uIAccordion0.bg_color = 1;
      int int0 = uIAccordion0.getBg_color();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[5];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      // Undeclared exception!
      try { 
        uIRadioButtons0.paint0((Graphics) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(1);
      // Undeclared exception!
      try { 
        uIHLayout0.isFocusable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox("");
      // Undeclared exception!
      try { 
        uICheckbox0.drawInput((Graphics) null, 0, 0, 0, 0);
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
      UIMenu uIMenu0 = new UIMenu("");
      int int0 = uIMenu0.getSelectedColor();
      assertEquals((-1), uIMenu0.getFg_color());
      assertEquals((-1), uIMenu0.getGradientSelectedColor());
      assertEquals((-1), uIMenu0.getGradientColor());
      assertEquals((-1), uIMenu0.getWidth());
      assertEquals(8947848, int0);
      assertEquals((-1), uIMenu0.getBg_color());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      uIPanel0.setSelected(true);
      assertTrue(uIPanel0.isDirty());
      assertEquals((-1), uIPanel0.getGradientSelectedColor());
      assertEquals(8947848, uIPanel0.getSelectedColor());
      assertEquals((-1), uIPanel0.getBg_color());
      assertFalse(uIPanel0.isSelected());
      assertEquals((-1), uIPanel0.getGradientColor());
      assertEquals((-1), uIPanel0.getWidth());
      assertEquals((-1), uIPanel0.getFg_color());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UILabel uILabel0 = new UILabel("");
      uILabel0.setSelected(false);
      assertFalse(uILabel0.isFocusable());
      assertFalse(uILabel0.isSelected());
      assertEquals(8947848, uILabel0.getSelectedColor());
      assertEquals((-1), uILabel0.getGradientColor());
      assertEquals((-1), uILabel0.getGradientSelectedColor());
      assertEquals((-1), uILabel0.getWidth());
      assertEquals((-1), uILabel0.getBg_color());
      assertEquals((-1), uILabel0.getFg_color());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      boolean boolean0 = uIPanel0.askRepaint();
      assertFalse(boolean0);
      assertTrue(uIPanel0.isDirty());
      assertEquals((-1), uIPanel0.getBg_color());
      assertEquals((-1), uIPanel0.getWidth());
      assertEquals((-1), uIPanel0.getFg_color());
      assertEquals((-1), uIPanel0.getGradientColor());
      assertEquals((-1), uIPanel0.getGradientSelectedColor());
      assertEquals(8947848, uIPanel0.getSelectedColor());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      boolean boolean0 = uIAccordion0.isSelected();
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals((-1), uIAccordion0.getGradientColor());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      assertEquals((-1), uIAccordion0.getBg_color());
      assertFalse(boolean0);
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertEquals((-1), uIAccordion0.getWidth());
      assertTrue(uIAccordion0.isDirty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      uIVLayout0.getSubmenu();
      assertEquals((-1), uIVLayout0.getFg_color());
      assertEquals((-1), uIVLayout0.getWidth());
      assertEquals((-1), uIVLayout0.getBg_color());
      assertEquals((-1), uIVLayout0.getGradientColor());
      assertEquals((-1), uIVLayout0.getGradientSelectedColor());
      assertEquals(8947848, uIVLayout0.getSelectedColor());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getType();
      assertTrue(uIAccordion0.isDirty());
      assertEquals((-1), uIAccordion0.getBg_color());
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals((-1), uIAccordion0.getGradientColor());
      assertEquals(0, int0);
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      assertEquals((-1), uIPanel0.getGradientColor());
      
      uIPanel0.setGradientColor(0);
      assertEquals(0, uIPanel0.getGradientColor());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setLayoutWidth(0);
      assertEquals((-1), uIAccordion0.getGradientColor());
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertEquals(0, uIAccordion0.getLayoutWidth());
      assertTrue(uIAccordion0.isDirty());
      assertEquals((-1), uIAccordion0.getBg_color());
      assertEquals((-1), uIAccordion0.getFg_color());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setStatus((Object) null);
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      assertEquals((-1), uIAccordion0.getBg_color());
      assertEquals((-1), uIAccordion0.getGradientColor());
      assertTrue(uIAccordion0.isDirty());
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals((-1), uIAccordion0.getFg_color());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getBg_color();
      assertEquals((-1), int0);
      assertTrue(uIAccordion0.isDirty());
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals((-1), uIAccordion0.getGradientColor());
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(0);
      int int0 = uISeparator0.getWidth();
      assertEquals((-1), uISeparator0.getGradientColor());
      assertEquals((-1), uISeparator0.getBg_color());
      assertEquals((-1), int0);
      assertEquals((-1), uISeparator0.getFg_color());
      assertFalse(uISeparator0.isFocusable());
      assertEquals((-1), uISeparator0.getGradientSelectedColor());
      assertEquals(8947848, uISeparator0.getSelectedColor());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      assertEquals((-1), uIAccordion0.getFg_color());
      
      uIAccordion0.setFg_color(0);
      assertEquals(0, uIAccordion0.getFg_color());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      assertEquals(8947848, uIVLayout0.getSelectedColor());
      
      uIVLayout0.setSelectedColor(0);
      assertEquals(0, uIVLayout0.getSelectedColor());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setSubmenu((UIMenu) null);
      assertEquals((-1), uITextPanel0.getWidth());
      assertEquals((-1), uITextPanel0.getFg_color());
      assertEquals((-1), uITextPanel0.getBg_color());
      assertEquals((-1), uITextPanel0.getGradientSelectedColor());
      assertEquals(8947848, uITextPanel0.getSelectedColor());
      assertTrue(uITextPanel0.isDirty());
      assertEquals((-1), uITextPanel0.getGradientColor());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[5];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      boolean boolean0 = uIRadioButtons0.isDirty();
      assertEquals((-1), uIRadioButtons0.getWidth());
      assertEquals((-1), uIRadioButtons0.getGradientSelectedColor());
      assertEquals((-1), uIRadioButtons0.getGradientColor());
      assertEquals(8947848, uIRadioButtons0.getSelectedColor());
      assertTrue(boolean0);
      assertEquals((-1), uIRadioButtons0.getBg_color());
      assertEquals((-1), uIRadioButtons0.getFg_color());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      int int0 = uITextPanel0.getLayoutHeight();
      assertEquals(0, int0);
      assertEquals((-1), uITextPanel0.getWidth());
      assertEquals((-1), uITextPanel0.getBg_color());
      assertEquals((-1), uITextPanel0.getGradientColor());
      assertTrue(uITextPanel0.isDirty());
      assertEquals((-1), uITextPanel0.getGradientSelectedColor());
      assertEquals(8947848, uITextPanel0.getSelectedColor());
      assertEquals((-1), uITextPanel0.getFg_color());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox("");
      int int0 = uICheckbox0.getFg_color();
      assertEquals((-1), uICheckbox0.getGradientSelectedColor());
      assertEquals((-1), uICheckbox0.getGradientColor());
      assertEquals((-1), uICheckbox0.getBg_color());
      assertEquals((-1), uICheckbox0.getWidth());
      assertEquals((-1), int0);
      assertEquals(8947848, uICheckbox0.getSelectedColor());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      assertEquals((-1), uITextPanel0.getGradientSelectedColor());
      
      uITextPanel0.setGradientSelectedColor(0);
      assertEquals(0, uITextPanel0.getGradientSelectedColor());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      UIGauge uIGauge0 = new UIGauge("", false, 0, 0);
      int int0 = uIGauge0.getGradientSelectedColor();
      assertEquals((-1), int0);
      assertEquals((-1), uIGauge0.getBg_color());
      assertEquals(8947848, uIGauge0.getSelectedColor());
      assertEquals((-1), uIGauge0.getGradientColor());
      assertFalse(uIGauge0.isFocusable());
      assertEquals((-1), uIGauge0.getFg_color());
      assertEquals((-1), uIGauge0.getWidth());
  }
}