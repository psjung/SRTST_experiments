/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:59:15 KST 2018
 */

package it.yup.ui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIUtils_ESTest6 extends UIUtils_ESTest_scaffolding6 {
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
      int int0 = 29;
      int int1 = 119;
      // Undeclared exception!
      try { 
        UIUtils.rescalaArray((int[]) null, (int[]) null, 29, 119, 119, 119, 29, 119, 119);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UILabel uILabel0 = new UILabel("te:");
      assertEquals((-1), uILabel0.getGradientColor());
      assertEquals((-1), uILabel0.getFg_color());
      assertEquals(0, uILabel0.getLayoutHeight());
      assertEquals((-1), uILabel0.getWidth());
      assertEquals((-1), uILabel0.getBg_color());
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      assertFalse(uILabel0.isWrappable());
      assertFalse(uILabel0.isFocusable());
      assertEquals(0, uILabel0.getLayoutWidth());
      assertFalse(uILabel0.isFlip());
      assertEquals(20, uILabel0.getAnchorPoint());
      assertEquals(0, uILabel0.getType());
      assertFalse(uILabel0.isSelected());
      assertEquals(8947848, uILabel0.getSelectedColor());
      assertEquals((-1), uILabel0.getGradientSelectedColor());
      assertEquals("te:", uILabel0.getText());
      assertNotNull(uILabel0);
      
      UIHLayout uIHLayout0 = UIUtils.easyCenterLayout(uILabel0, (-932));
      assertEquals((-1), uILabel0.getGradientColor());
      assertEquals((-1), uILabel0.getFg_color());
      assertEquals(0, uILabel0.getLayoutHeight());
      assertEquals(1, uILabel0.getAnchorPoint());
      assertEquals((-1), uILabel0.getWidth());
      assertEquals((-1), uILabel0.getBg_color());
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      assertFalse(uILabel0.isWrappable());
      assertFalse(uILabel0.isFocusable());
      assertFalse(uILabel0.isFlip());
      assertEquals((-932), uILabel0.getLayoutWidth());
      assertEquals(0, uILabel0.getType());
      assertFalse(uILabel0.isSelected());
      assertEquals(8947848, uILabel0.getSelectedColor());
      assertEquals((-1), uILabel0.getGradientSelectedColor());
      assertEquals("te:", uILabel0.getText());
      assertFalse(uIHLayout0.isGroup());
      assertEquals((-1), uIHLayout0.getWidth());
      assertEquals((-1), uIHLayout0.getGradientColor());
      assertEquals((-1), uIHLayout0.getGradientSelectedColor());
      assertEquals(8947848, uIHLayout0.getSelectedColor());
      assertFalse(uIHLayout0.isSelected());
      assertEquals(0, uIHLayout0.getLayoutWidth());
      assertFalse(uIHLayout0.isFocusable());
      assertEquals(0, uIHLayout0.getType());
      assertEquals((-1), uIHLayout0.getBg_color());
      assertEquals((-1), uIHLayout0.getFg_color());
      assertEquals(0, uIHLayout0.getLayoutHeight());
      assertNotNull(uIHLayout0);
      
      uIHLayout0.selected = true;
      assertEquals((-1), uILabel0.getGradientColor());
      assertEquals((-1), uILabel0.getFg_color());
      assertEquals(0, uILabel0.getLayoutHeight());
      assertEquals(1, uILabel0.getAnchorPoint());
      assertEquals((-1), uILabel0.getWidth());
      assertEquals((-1), uILabel0.getBg_color());
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      assertFalse(uILabel0.isWrappable());
      assertFalse(uILabel0.isFocusable());
      assertFalse(uILabel0.isFlip());
      assertEquals((-932), uILabel0.getLayoutWidth());
      assertEquals(0, uILabel0.getType());
      assertFalse(uILabel0.isSelected());
      assertEquals(8947848, uILabel0.getSelectedColor());
      assertEquals((-1), uILabel0.getGradientSelectedColor());
      assertEquals("te:", uILabel0.getText());
      assertTrue(uIHLayout0.isSelected());
      assertFalse(uIHLayout0.isGroup());
      assertEquals((-1), uIHLayout0.getWidth());
      assertEquals((-1), uIHLayout0.getGradientColor());
      assertEquals((-1), uIHLayout0.getGradientSelectedColor());
      assertEquals(8947848, uIHLayout0.getSelectedColor());
      assertEquals(0, uIHLayout0.getLayoutWidth());
      assertFalse(uIHLayout0.isFocusable());
      assertEquals(0, uIHLayout0.getType());
      assertEquals((-1), uIHLayout0.getBg_color());
      assertEquals((-1), uIHLayout0.getFg_color());
      assertEquals(0, uIHLayout0.getLayoutHeight());
      
      uIHLayout0.setGradientSelectedColor(3477);
      assertEquals((-1), uILabel0.getGradientColor());
      assertEquals((-1), uILabel0.getFg_color());
      assertEquals(0, uILabel0.getLayoutHeight());
      assertEquals(1, uILabel0.getAnchorPoint());
      assertEquals((-1), uILabel0.getWidth());
      assertEquals((-1), uILabel0.getBg_color());
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      assertFalse(uILabel0.isWrappable());
      assertFalse(uILabel0.isFocusable());
      assertFalse(uILabel0.isFlip());
      assertEquals((-932), uILabel0.getLayoutWidth());
      assertEquals(0, uILabel0.getType());
      assertFalse(uILabel0.isSelected());
      assertEquals(8947848, uILabel0.getSelectedColor());
      assertEquals((-1), uILabel0.getGradientSelectedColor());
      assertEquals("te:", uILabel0.getText());
      assertTrue(uIHLayout0.isSelected());
      assertFalse(uIHLayout0.isGroup());
      assertEquals((-1), uIHLayout0.getWidth());
      assertEquals((-1), uIHLayout0.getGradientColor());
      assertEquals(3477, uIHLayout0.getGradientSelectedColor());
      assertEquals(8947848, uIHLayout0.getSelectedColor());
      assertEquals(0, uIHLayout0.getLayoutWidth());
      assertFalse(uIHLayout0.isFocusable());
      assertEquals(0, uIHLayout0.getType());
      assertEquals((-1), uIHLayout0.getBg_color());
      assertEquals((-1), uIHLayout0.getFg_color());
      assertEquals(0, uIHLayout0.getLayoutHeight());
      
      UIMenu uIMenu0 = UIUtils.easyMenu("", (-932), (-932), (-932), (UIItem) uIHLayout0, "", ";Xt5");
      assertEquals((-1), uILabel0.getGradientColor());
      assertEquals((-1), uILabel0.getFg_color());
      assertEquals(0, uILabel0.getLayoutHeight());
      assertEquals(1, uILabel0.getAnchorPoint());
      assertEquals((-1), uILabel0.getWidth());
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      assertFalse(uILabel0.isWrappable());
      assertFalse(uILabel0.isFocusable());
      assertEquals(11322072, uILabel0.getBg_color());
      assertFalse(uILabel0.isFlip());
      assertEquals((-932), uILabel0.getLayoutWidth());
      assertEquals(0, uILabel0.getType());
      assertFalse(uILabel0.isSelected());
      assertEquals(8947848, uILabel0.getSelectedColor());
      assertEquals((-1), uILabel0.getGradientSelectedColor());
      assertEquals("te:", uILabel0.getText());
      assertTrue(uIHLayout0.isSelected());
      assertFalse(uIHLayout0.isGroup());
      assertEquals((-1), uIHLayout0.getWidth());
      assertEquals((-1), uIHLayout0.getGradientColor());
      assertEquals(3477, uIHLayout0.getGradientSelectedColor());
      assertEquals(8947848, uIHLayout0.getSelectedColor());
      assertEquals(11322072, uIHLayout0.getBg_color());
      assertEquals(0, uIHLayout0.getLayoutWidth());
      assertEquals(0, uIHLayout0.getType());
      assertTrue(uIHLayout0.isFocusable());
      assertEquals((-1), uIHLayout0.getFg_color());
      assertEquals(0, uIHLayout0.getLayoutHeight());
      assertFalse(uIMenu0.isOpenedState());
      assertEquals(0, uIMenu0.getSelectedIndex());
      assertEquals(0, uIMenu0.getLayoutHeight());
      assertEquals(0, uIMenu0.getLayoutWidth());
      assertEquals((-1), uIMenu0.getWidth());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals((-1), uIMenu0.getFg_color());
      assertEquals((-1), uIMenu0.getGradientColor());
      assertEquals((-1), uIMenu0.getBg_color());
      assertEquals((-1), uIMenu0.getGradientSelectedColor());
      assertEquals(8947848, uIMenu0.getSelectedColor());
      assertTrue(uIMenu0.isFocusable());
      assertFalse(uIMenu0.isSelected());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertEquals(0, uIMenu0.getType());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertNotNull(uIMenu0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UIMenu uIMenu0 = UIUtils.easyMenu("", 0, 0, 0, (UIItem) null);
      assertTrue(uIMenu0.isFocusable());
      assertEquals((-1), uIMenu0.getGradientColor());
      assertEquals(8947848, uIMenu0.getSelectedColor());
      assertEquals(0, uIMenu0.getLayoutWidth());
      assertFalse(uIMenu0.isOpenedState());
      assertEquals(0, uIMenu0.getLayoutHeight());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertEquals((-1), uIMenu0.getWidth());
      assertEquals((-1), uIMenu0.getGradientSelectedColor());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals((-1), uIMenu0.getBg_color());
      assertEquals(0, uIMenu0.getType());
      assertFalse(uIMenu0.isSelected());
      assertEquals((-1), uIMenu0.getFg_color());
      assertNotNull(uIMenu0);
      
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = 0;
      intArray0[7] = 0;
      UIUtils.rescalaArray(intArray0, intArray0, 110, 0, 0, (-2271), 3013, 0, 0);
      assertEquals(8, intArray0.length);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Image image0 = UIMenu.menuImage;
      assertNull(image0);
      
      UILabel uILabel0 = new UILabel((Image) null, "#vN");
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      assertEquals((-1), uILabel0.getWidth());
      assertEquals("#vN", uILabel0.getText());
      assertEquals((-1), uILabel0.getFg_color());
      assertEquals((-1), uILabel0.getBg_color());
      assertEquals(0, uILabel0.getLayoutHeight());
      assertEquals(8947848, uILabel0.getSelectedColor());
      assertEquals(0, uILabel0.getType());
      assertFalse(uILabel0.isSelected());
      assertEquals((-1), uILabel0.getGradientSelectedColor());
      assertEquals(0, uILabel0.getLayoutWidth());
      assertEquals(20, uILabel0.getAnchorPoint());
      assertEquals((-1), uILabel0.getGradientColor());
      assertFalse(uILabel0.isWrappable());
      assertFalse(uILabel0.isFocusable());
      assertFalse(uILabel0.isFlip());
      assertNotNull(uILabel0);
      
      UIMenu uIMenu0 = UIUtils.easyMenu("", 59, 1080, 1930, (UIItem) uILabel0);
      assertTrue(uILabel0.isFocusable());
      assertEquals((-1), uILabel0.getImgAnchorPoint());
      assertEquals((-1), uILabel0.getWidth());
      assertEquals("#vN", uILabel0.getText());
      assertEquals((-1), uILabel0.getFg_color());
      assertEquals(0, uILabel0.getLayoutHeight());
      assertEquals(8947848, uILabel0.getSelectedColor());
      assertEquals(0, uILabel0.getType());
      assertTrue(uILabel0.isSelected());
      assertEquals((-1), uILabel0.getGradientSelectedColor());
      assertEquals(0, uILabel0.getLayoutWidth());
      assertEquals(11322072, uILabel0.getBg_color());
      assertEquals(20, uILabel0.getAnchorPoint());
      assertEquals((-1), uILabel0.getGradientColor());
      assertFalse(uILabel0.isWrappable());
      assertFalse(uILabel0.isFlip());
      assertFalse(uIMenu0.isOpenedState());
      assertEquals((-1), uIMenu0.getGradientSelectedColor());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals((-1), uIMenu0.getFg_color());
      assertEquals(1930, uIMenu0.getWidth());
      assertTrue(uIMenu0.isFocusable());
      assertFalse(uIMenu0.isSelected());
      assertEquals(0, uIMenu0.getType());
      assertEquals((-1), uIMenu0.getBg_color());
      assertEquals(59, uIMenu0.getAbsoluteX());
      assertEquals(0, uIMenu0.getSelectedIndex());
      assertEquals(0, uIMenu0.getLayoutHeight());
      assertEquals(8947848, uIMenu0.getSelectedColor());
      assertEquals(1080, uIMenu0.getAbsoluteY());
      assertEquals((-1), uIMenu0.getGradientColor());
      assertEquals(0, uIMenu0.getLayoutWidth());
      assertNotNull(uIMenu0);
      
      // Undeclared exception!
      try { 
        UIUtils.easyMenu("SELECT", 102, 59, 102, (UIItem) uIMenu0, "/icons/radio_checked.png", "2u@(0ccqNKxGsh%+&{");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UIMenu uIMenu0 = UIUtils.easyMenu("", 0, 0, 2258739, (UIItem) null);
      assertEquals(0, uIMenu0.getLayoutWidth());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertFalse(uIMenu0.isSelected());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertEquals((-1), uIMenu0.getBg_color());
      assertEquals((-1), uIMenu0.getGradientColor());
      assertEquals((-1), uIMenu0.getFg_color());
      assertTrue(uIMenu0.isFocusable());
      assertEquals(0, uIMenu0.getType());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals(0, uIMenu0.getLayoutHeight());
      assertFalse(uIMenu0.isOpenedState());
      assertEquals(8947848, uIMenu0.getSelectedColor());
      assertEquals((-1), uIMenu0.getGradientSelectedColor());
      assertEquals(2258739, uIMenu0.getWidth());
      assertNotNull(uIMenu0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = UIUtils.colorize(1732, 0);
      assertEquals(1732, int0);
      
      int int1 = UIUtils.colorize(1732, 2882);
      assertEquals(483464552, int1);
      assertFalse(int1 == int0);
      
      int[] intArray0 = new int[7];
      intArray0[0] = 1732;
      intArray0[1] = 1732;
      intArray0[2] = 483464552;
      intArray0[3] = 1732;
      intArray0[4] = 2882;
      intArray0[5] = 2882;
      intArray0[6] = 1732;
      // Undeclared exception!
      UIUtils.rescalaArray(intArray0, intArray0, 1732, 107, (-1485), 483464552, (-460), 97, 107);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = UIUtils.medColor(97, 16761386);
      assertEquals(8347973, int0);
      
      UIMenu uIMenu0 = UIUtils.easyMenu("", 2398255, 2398255, 97, (UIItem) null);
      assertEquals(0, uIMenu0.getLayoutHeight());
      assertEquals((-1), uIMenu0.getBg_color());
      assertEquals(8947848, uIMenu0.getSelectedColor());
      assertEquals(97, uIMenu0.getWidth());
      assertTrue(uIMenu0.isFocusable());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertEquals(2398255, uIMenu0.getAbsoluteX());
      assertTrue(uIMenu0.isAutoClose());
      assertFalse(uIMenu0.isSelected());
      assertEquals(0, uIMenu0.getLayoutWidth());
      assertEquals(2398255, uIMenu0.getAbsoluteY());
      assertEquals((-1), uIMenu0.getFg_color());
      assertEquals((-1), uIMenu0.getGradientColor());
      assertEquals((-1), uIMenu0.getGradientSelectedColor());
      assertEquals(0, uIMenu0.getType());
      assertFalse(uIMenu0.isOpenedState());
      assertNotNull(uIMenu0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        UIUtils.easyMenu("9][)v6SO^K0I3", 1680, 1680, 1680, (UIItem) null, "", "9][)v6SO^K0I3");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UICheckbox uICheckbox0 = new UICheckbox("L`PuKTHTB +K");
      assertEquals(0, uICheckbox0.getLayoutWidth());
      assertFalse(uICheckbox0.isChecked());
      assertFalse(uICheckbox0.isSelected());
      assertFalse(uICheckbox0.isWrappable());
      assertEquals("L`PuKTHTB +K", uICheckbox0.getText());
      assertFalse(uICheckbox0.isFlip());
      assertEquals((-1), uICheckbox0.getBg_color());
      assertEquals(0, uICheckbox0.getType());
      assertEquals((-1), uICheckbox0.getGradientColor());
      assertEquals((-1), uICheckbox0.getFg_color());
      assertTrue(uICheckbox0.isFocusable());
      assertEquals(20, uICheckbox0.getAnchorPoint());
      assertEquals((-1), uICheckbox0.getImgAnchorPoint());
      assertEquals(8947848, uICheckbox0.getSelectedColor());
      assertEquals((-1), uICheckbox0.getGradientSelectedColor());
      assertEquals((-1), uICheckbox0.getWidth());
      assertEquals(0, uICheckbox0.getLayoutHeight());
      assertNotNull(uICheckbox0);
      
      UIHLayout uIHLayout0 = UIUtils.easyCenterLayout(uICheckbox0, 105);
      assertFalse(uICheckbox0.isChecked());
      assertFalse(uICheckbox0.isSelected());
      assertFalse(uICheckbox0.isWrappable());
      assertEquals("L`PuKTHTB +K", uICheckbox0.getText());
      assertFalse(uICheckbox0.isFlip());
      assertEquals((-1), uICheckbox0.getBg_color());
      assertEquals(0, uICheckbox0.getType());
      assertEquals((-1), uICheckbox0.getGradientColor());
      assertEquals((-1), uICheckbox0.getFg_color());
      assertTrue(uICheckbox0.isFocusable());
      assertEquals((-1), uICheckbox0.getImgAnchorPoint());
      assertEquals(8947848, uICheckbox0.getSelectedColor());
      assertEquals((-1), uICheckbox0.getGradientSelectedColor());
      assertEquals(105, uICheckbox0.getLayoutWidth());
      assertEquals((-1), uICheckbox0.getWidth());
      assertEquals(1, uICheckbox0.getAnchorPoint());
      assertEquals(0, uICheckbox0.getLayoutHeight());
      assertEquals((-1), uIHLayout0.getWidth());
      assertFalse(uIHLayout0.isGroup());
      assertEquals((-1), uIHLayout0.getGradientColor());
      assertEquals((-1), uIHLayout0.getGradientSelectedColor());
      assertEquals(8947848, uIHLayout0.getSelectedColor());
      assertFalse(uIHLayout0.isSelected());
      assertEquals(0, uIHLayout0.getLayoutWidth());
      assertTrue(uIHLayout0.isFocusable());
      assertEquals(0, uIHLayout0.getType());
      assertEquals((-1), uIHLayout0.getFg_color());
      assertEquals((-1), uIHLayout0.getBg_color());
      assertEquals(0, uIHLayout0.getLayoutHeight());
      assertNotNull(uIHLayout0);
      
      UIMenu uIMenu0 = UIUtils.easyMenu("", 13421772, 13421772, 105, (UIItem) uICheckbox0, "L`PuKTHTB +K", "L`PuKTHTB +K");
      assertEquals(11322072, uICheckbox0.getBg_color());
      assertFalse(uICheckbox0.isChecked());
      assertFalse(uICheckbox0.isWrappable());
      assertEquals("L`PuKTHTB +K", uICheckbox0.getText());
      assertFalse(uICheckbox0.isFlip());
      assertEquals(0, uICheckbox0.getType());
      assertEquals((-1), uICheckbox0.getGradientColor());
      assertEquals((-1), uICheckbox0.getFg_color());
      assertTrue(uICheckbox0.isFocusable());
      assertEquals((-1), uICheckbox0.getImgAnchorPoint());
      assertTrue(uICheckbox0.isSelected());
      assertEquals(8947848, uICheckbox0.getSelectedColor());
      assertEquals((-1), uICheckbox0.getGradientSelectedColor());
      assertEquals(105, uICheckbox0.getLayoutWidth());
      assertEquals((-1), uICheckbox0.getWidth());
      assertEquals(1, uICheckbox0.getAnchorPoint());
      assertEquals(0, uICheckbox0.getLayoutHeight());
      assertEquals(0, uIMenu0.getType());
      assertEquals((-1), uIMenu0.getGradientSelectedColor());
      assertEquals(0, uIMenu0.getLayoutHeight());
      assertFalse(uIMenu0.isOpenedState());
      assertEquals(0, uIMenu0.getSelectedIndex());
      assertFalse(uIMenu0.isSelected());
      assertEquals(0, uIMenu0.getLayoutWidth());
      assertEquals((-1), uIMenu0.getBg_color());
      assertEquals(105, uIMenu0.getWidth());
      assertEquals(8947848, uIMenu0.getSelectedColor());
      assertEquals(13421772, uIMenu0.getAbsoluteY());
      assertEquals(13421772, uIMenu0.getAbsoluteX());
      assertTrue(uIMenu0.isFocusable());
      assertEquals((-1), uIMenu0.getGradientColor());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals((-1), uIMenu0.getFg_color());
      assertNotNull(uIMenu0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = UIUtils.colorize((-2830), (-2830));
      assertEquals((-457907918), int0);
      
      int int1 = UIUtils.medColor((-2830), (-2830));
      assertEquals(16774386, int1);
      assertFalse(int1 == int0);
      
      UIAccordion uIAccordion0 = new UIAccordion();
      assertEquals(0, uIAccordion0.getLayoutHeight());
      assertEquals((-1), uIAccordion0.getBg_color());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      assertEquals((-1), uIAccordion0.getGradientColor());
      assertFalse(uIAccordion0.isListMode());
      assertEquals((-1), uIAccordion0.getSelectedIndex());
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertTrue(uIAccordion0.isDirty());
      assertEquals(2, uIAccordion0.getSepSize());
      assertFalse(uIAccordion0.isSelected());
      assertEquals(0, uIAccordion0.getType());
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(0, uIAccordion0.getFirstVisible());
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertFalse(uIAccordion0.isModal());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals(0, uIAccordion0.getLayoutWidth());
      assertTrue(uIAccordion0.isFocusable());
      assertNotNull(uIAccordion0);
      
      Image image0 = uIAccordion0.closeImage;
      assertNull(image0);
      
      // Undeclared exception!
      try { 
        UIUtils.imageResize((Image) null, (-328), 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 0;
      int int1 = UIUtils.colorize(0, 0);
      assertEquals(0, int1);
      assertTrue(int1 == int0);
      
      UIUtils uIUtils0 = new UIUtils();
      assertNotNull(uIUtils0);
      
      String string0 = "Vl";
      int int2 = 516;
      UIAccordion uIAccordion0 = new UIAccordion();
      assertFalse(uIAccordion0.isListMode());
      assertEquals((-1), uIAccordion0.getSelectedIndex());
      assertEquals((-1), uIAccordion0.getGradientColor());
      assertEquals(0, uIAccordion0.getFirstVisible());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      assertFalse(uIAccordion0.isModal());
      assertTrue(uIAccordion0.isDirty());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertFalse(uIAccordion0.isSelected());
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals((-1), uIAccordion0.getBg_color());
      assertEquals(0, uIAccordion0.getType());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertEquals(0, uIAccordion0.getLayoutWidth());
      assertEquals(0, uIAccordion0.getLayoutHeight());
      assertTrue(uIAccordion0.isFocusable());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertNotNull(uIAccordion0);
      
      uIAccordion0.setSepColor(0);
      assertFalse(uIAccordion0.isListMode());
      assertEquals((-1), uIAccordion0.getSelectedIndex());
      assertEquals((-1), uIAccordion0.getGradientColor());
      assertEquals(0, uIAccordion0.getFirstVisible());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      assertFalse(uIAccordion0.isModal());
      assertTrue(uIAccordion0.isDirty());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertFalse(uIAccordion0.isSelected());
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals((-1), uIAccordion0.getBg_color());
      assertEquals(0, uIAccordion0.getType());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertEquals(0, uIAccordion0.getLayoutWidth());
      assertEquals(0, uIAccordion0.getLayoutHeight());
      assertTrue(uIAccordion0.isFocusable());
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertEquals(0, uIAccordion0.getSepColor());
      
      UIAccordion uIAccordion1 = (UIAccordion)uIAccordion0.getSelectedItem();
      assertFalse(uIAccordion0.isListMode());
      assertEquals((-1), uIAccordion0.getSelectedIndex());
      assertEquals((-1), uIAccordion0.getGradientColor());
      assertEquals(0, uIAccordion0.getFirstVisible());
      assertEquals(8947848, uIAccordion0.getSelectedColor());
      assertFalse(uIAccordion0.isModal());
      assertTrue(uIAccordion0.isDirty());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertFalse(uIAccordion0.isSelected());
      assertEquals((-1), uIAccordion0.getFg_color());
      assertEquals((-1), uIAccordion0.getBg_color());
      assertEquals(0, uIAccordion0.getType());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getGradientSelectedColor());
      assertEquals(0, uIAccordion0.getLayoutWidth());
      assertEquals(0, uIAccordion0.getLayoutHeight());
      assertTrue(uIAccordion0.isFocusable());
      assertEquals((-1), uIAccordion0.getWidth());
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertEquals(0, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion1.getMaxHeight());
      assertFalse(uIAccordion1.isModal());
      assertEquals(0, uIAccordion1.getFirstVisible());
      assertEquals((-1), uIAccordion1.getGradientColor());
      assertFalse(uIAccordion1.isListMode());
      assertEquals((-1), uIAccordion1.getSelectedIndex());
      assertEquals(0, uIAccordion1.getLayoutHeight());
      assertEquals((-1), uIAccordion1.getWidth());
      assertEquals(0, uIAccordion1.getLayoutWidth());
      assertEquals(0, uIAccordion1.getSepColor());
      assertTrue(uIAccordion1.isFocusable());
      assertFalse(uIAccordion1.isOneOpen());
      assertEquals((-1), uIAccordion1.getLabelGradientColor());
      assertFalse(uIAccordion1.isSelected());
      assertEquals((-1), uIAccordion1.getGradientSelectedColor());
      assertTrue(uIAccordion1.isDirty());
      assertEquals(2, uIAccordion1.getSepSize());
      assertEquals(11184810, uIAccordion1.getLabelColor());
      assertEquals(8947848, uIAccordion1.getSelectedColor());
      assertEquals((-1), uIAccordion1.getFg_color());
      assertEquals((-1), uIAccordion1.getBg_color());
      assertEquals(0, uIAccordion1.getType());
      assertNotNull(uIAccordion1);
      assertSame(uIAccordion0, uIAccordion1);
      assertSame(uIAccordion1, uIAccordion0);
      
      // Undeclared exception!
      try { 
        UIUtils.easyMenu("Vl", 0, 516, 0, (UIItem) uIAccordion1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 3793;
      intArray0[0] = 3793;
      int int1 = 4;
      int int2 = 16671003;
      // Undeclared exception!
      try { 
        UIUtils.rescalaArray(intArray0, intArray0, 3793, 4, 4, 4, 4, 16671003, 3793);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1191395057
         //
         verifyException("it.yup.ui.UIUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 1536;
      intArray0[1] = 56;
      intArray0[2] = 0;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = 1742;
      intArray0[7] = (-1076);
      // Undeclared exception!
      try { 
        UIUtils.rescalaArray(intArray0, intArray0, 1536, 0, 8, 65, 1536, 51, 1536);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 79872
         //
         verifyException("it.yup.ui.UIUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 42;
      intArray0[1] = 85;
      intArray0[2] = 0;
      intArray0[3] = 0;
      UIUtils.rescalaArray(intArray0, intArray0, 13, 6, 0, 85, 0, 0, 42);
      assertEquals(4, intArray0.length);
      assertArrayEquals(new int[] {42, 85, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = 0;
      int int1 = UIUtils.colorize(0, 0);
      assertEquals(0, int1);
      assertTrue(int1 == int0);
      
      String string0 = " - Error:";
      int int2 = 0;
      int int3 = 0;
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("CB={VNL|X*76", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = UIUtils.colorize(3, 1049);
      assertEquals(175930454, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UIUtils uIUtils0 = new UIUtils();
      assertNotNull(uIUtils0);
      
      int[] intArray0 = new int[0];
      UIUtils.rescalaArray(intArray0, intArray0, (-522), (-522), (-522), (-522), (-522), (-522), 0);
      assertEquals(0, intArray0.length);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = UIUtils.colorize(995, 0);
      assertEquals(995, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = null;
      int int0 = (-3005);
      int int1 = 0;
      int int2 = 2258739;
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.getOpenedLabel();
      // Undeclared exception!
      try { 
        UIUtils.easyCenterLayout((UIItem) null, (-1541));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIHLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UIUtils.medColor((-550), (-550));
      UIUtils uIUtils0 = new UIUtils();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-48);
      byteArray0[1] = (byte)100;
      byteArray0[2] = (byte)39;
      byteArray0[3] = (byte)99;
      byteArray0[4] = (byte) (-22);
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte) (-115);
      byteArray0[7] = (byte)102;
      Image.createImage(byteArray0, (int) (byte) (-48), 11584200);
      // Undeclared exception!
      try { 
        UIUtils.imageResize((Image) null, (byte)39, (byte)100);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UIUtils uIUtils0 = new UIUtils();
      int int0 = UIUtils.medColor(3768, 0);
      assertEquals(1884, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[1] = 56;
      intArray0[2] = 0;
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = 1742;
      intArray0[7] = (-1076);
      UIUtils.rescalaArray(intArray0, intArray0, 0, 0, 8, 65, 0, 51, 0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = "F#\\l?Be?C";
      int int0 = 16;
      int int1 = (-1906);
      int int2 = 99;
      String string1 = "";
      int int3 = 800;
      UIScreen uIScreen0 = null;
      try {
        uIScreen0 = new UIScreen();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = (-2172);
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.setGradientColor(16711680);
      uIPanel0.selectedColor = (-2172);
      UIMenu uIMenu0 = UIUtils.easyMenu("", (-2172), (-2172), (-2172), (UIItem) uIPanel0, "", "W5oU4/N$:wYA");
      UIUtils uIUtils0 = new UIUtils();
      UIUtils.easyCenterLayout(uIMenu0, 119);
      UIUtils.easyCenterLayout(uIPanel0, 16711680);
      UIUtils.easyMenu("", (-2172), (-2172), 0, (UIItem) uIMenu0);
      int[] intArray0 = new int[4];
      intArray0[0] = (-2172);
      intArray0[1] = (-2172);
      intArray0[2] = (-2172);
      intArray0[3] = (-2172);
      UIMenu uIMenu1 = new UIMenu("");
      uIMenu1.dirty = false;
      uIMenu0.setSubmenu(uIMenu1);
      UIUtils.rescalaArray(intArray0, intArray0, (-2172), (-2172), (-1447), (-1447), 2232, (-2172), (-2172));
      // Undeclared exception!
      try { 
        UIUtils.easyMenu("W5oU4/N$:wYA", (-2172), (-2172), (-2172), (UIItem) uIPanel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = UIUtils.colorize(178, 178);
      assertEquals(29804091, int0);
      
      int int1 = UIUtils.medColor(1687, 29804091);
      assertEquals(6514281, int1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = (-507);
      UIMenu uIMenu0 = UIUtils.easyMenu("", (-507), (-507), (-507), (UIItem) null);
      int int1 = 2;
      int int2 = 51;
      int int3 = (-1087);
      uIMenu0.setAbsoluteX((-1087));
      UIUtils.easyMenu("", 2, 2, 51, (UIItem) null, "%(ncN>82&%?{48", "CANCEL");
      // Undeclared exception!
      try { 
        UIUtils.imageResize((Image) null, 2, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = 127;
      intArray0[0] = 127;
      intArray0[1] = 0;
      intArray0[2] = 0;
      int int1 = 1343;
      // Undeclared exception!
      try { 
        UIUtils.rescalaArray(intArray0, intArray0, 0, 0, 2749, 1343, (-17), 2749, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -17
         //
         verifyException("it.yup.ui.UIUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UILabel uILabel0 = new UILabel("wiDOMcyY\"I");
      int int0 = (-741);
      uILabel0.text = "wiDOMcyY\"I";
      UIUtils.easyCenterLayout(uILabel0, (-741));
      uILabel0.setText("wiDOMcyY\"I");
      // Undeclared exception!
      try { 
        UIUtils.easyMenu("pr", (-741), (-741), (-741), (UIItem) uILabel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }
}