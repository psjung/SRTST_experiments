/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:47:02 KST 2018
 */

package it.yup.ui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Vector;

import javax.microedition.lcdui.Graphics;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIPanel_ESTest6 extends UIPanel_ESTest_scaffolding6 {
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
      uIAccordion0.setSelectedIndex(1);
      assertFalse(uIAccordion0.isModal());
      assertFalse(uIAccordion0.isListMode());
      assertEquals((-1), uIAccordion0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.setMaxHeight((-1));
      assertFalse(uIPanel0.isModal());
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      Vector<UIButton> vector0 = new Vector<UIButton>();
      uIAccordion0.setItems(vector0);
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertFalse(uIAccordion0.isListMode());
      assertFalse(uIAccordion0.isModal());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      boolean boolean0 = uIPanel0.isModal();
      assertTrue(boolean0);
      assertTrue(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      boolean boolean0 = uITextPanel0.isListMode();
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertFalse(boolean0);
      assertFalse(uITextPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.selected = true;
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertEquals((-1), uITextPanel1.getMaxHeight());
      assertFalse(uITextPanel1.isListMode());
      assertFalse(uITextPanel1.isModal());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.width = 1;
      UIPanel uIPanel1 = (UIPanel)uIPanel0.getSelectedItem();
      assertFalse(uIPanel1.isListMode());
      assertEquals((-1), uIPanel1.getMaxHeight());
      assertFalse(uIPanel1.isModal());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      uIPanel0.setType(1);
      UIPanel uIPanel1 = (UIPanel)uIPanel0.getSelectedItem();
      assertTrue(uIPanel1.isModal());
      assertTrue(uIPanel1.isListMode());
      assertEquals((-1), uIPanel1.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.setLayoutWidth(1);
      UIPanel uIPanel1 = (UIPanel)uIPanel0.getSelectedItem();
      assertEquals((-1), uIPanel1.getMaxHeight());
      assertFalse(uIPanel1.isModal());
      assertFalse(uIPanel1.isListMode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      uIPanel0.setLayoutHeight(1);
      UIPanel uIPanel1 = (UIPanel)uIPanel0.getSelectedItem();
      assertTrue(uIPanel1.isModal());
      assertTrue(uIPanel1.isListMode());
      assertEquals((-1), uIPanel1.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setLayoutHeight((-1));
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertEquals((-1), uITextPanel1.getMaxHeight());
      assertFalse(uITextPanel1.isModal());
      assertFalse(uITextPanel1.isListMode());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setGradientColor(0);
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertEquals((-1), uITextPanel1.getMaxHeight());
      assertFalse(uITextPanel1.isModal());
      assertFalse(uITextPanel1.isListMode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      assertEquals((-1), uITextPanel0.getMaxHeight());
      
      uITextPanel0.setMaxHeight(1);
      int int0 = uITextPanel0.getMaxHeight();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.getItems();
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertFalse(uITextPanel0.isListMode());
      assertFalse(uITextPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.updateChildren();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.MetaVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.removeItemAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.MetaVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.removeItem(uIAccordion0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIAccordion$AccordionItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, true);
      // Undeclared exception!
      try { 
        uIPanel0.insertItemAt((UIItem) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.drawScrollBar((Graphics) null, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      // Undeclared exception!
      try { 
        uIPanel0.computeRealHeight((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.addItem(uIAccordion0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.setSelectedIndex((-1));
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.removeItemAt((-1));
      assertFalse(uIAccordion0.isListMode());
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertFalse(uIAccordion0.isModal());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      boolean boolean0 = uIPanel0.contains(uIPanel0);
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertTrue(uIPanel0.isModal());
      assertTrue(uIPanel0.isListMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.selectedIdx = 0;
      UIPanel uIPanel1 = (UIPanel)uIPanel0.getSelectedItem();
      assertFalse(uIPanel1.isListMode());
      assertEquals((-1), uIPanel1.getMaxHeight());
      assertFalse(uIPanel1.isModal());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setSelectedIndex(0);
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertFalse(uITextPanel0.isListMode());
      assertFalse(uITextPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setSelectedIndex((-2));
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertFalse(uITextPanel0.isModal());
      assertFalse(uITextPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.removeAllItems();
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertFalse(uIPanel0.isListMode());
      assertEquals(0, uIPanel0.getFirstVisible());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      UITextPanel uITextPanel0 = new UITextPanel();
      uIPanel0.insertItemAt(uITextPanel0, 1);
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertFalse(uITextPanel0.isModal());
      assertTrue(uIPanel0.isListMode());
      assertTrue(uIPanel0.isModal());
      assertFalse(uITextPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      UITextPanel uITextPanel0 = new UITextPanel();
      uIPanel0.insertItemAt(uITextPanel0, 0);
      assertFalse(uITextPanel0.isModal());
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertTrue(uIPanel0.isModal());
      assertTrue(uIPanel0.isListMode());
      assertFalse(uITextPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, false);
      UILabel uILabel0 = new UILabel("");
      uIPanel0.insertItemAt(uILabel0, (-1));
      assertFalse(uIPanel0.isListMode());
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.removeItemAt(1);
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isModal());
      assertFalse(uIPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      // Undeclared exception!
      try { 
        uIPanel0.removeItemAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      UICheckbox uICheckbox0 = new UICheckbox("");
      int int0 = uIPanel0.removeItem(uICheckbox0);
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      uIPanel0.setMaxHeight((-2));
      assertTrue(uIPanel0.isListMode());
      assertTrue(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      uIPanel0.setSelected(true);
      assertTrue(uIPanel0.isListMode());
      assertTrue(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.setSelected(false);
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      // Undeclared exception!
      try { 
        uIPanel0.keyPressed(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      // Undeclared exception!
      try { 
        uIPanel0.updateChildren();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setDirty(false);
      boolean boolean0 = uITextPanel0.isDirty();
      assertFalse(boolean0);
      assertFalse(uITextPanel0.isListMode());
      assertFalse(uITextPanel0.isModal());
      assertEquals((-1), uITextPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      boolean boolean0 = uIPanel0.isDirty();
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertTrue(boolean0);
      assertFalse(uIPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      // Undeclared exception!
      try { 
        uIPanel0.getHeight((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.setScreen((UIScreen) null);
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isListMode());
      assertFalse(uIPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      UIAccordion uIAccordion0 = new UIAccordion();
      assertEquals((-1), uIAccordion0.getSelectedIndex());
      
      uIPanel0.setSelectedItem(uIAccordion0);
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertFalse(uIAccordion0.isModal());
      assertFalse(uIAccordion0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      boolean boolean0 = uITextPanel0.isModal();
      assertFalse(uITextPanel0.isListMode());
      assertEquals((-1), uITextPanel0.getSelectedIndex());
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      int int0 = uIPanel0.getFirstVisible();
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertFalse(uIPanel0.isListMode());
      assertEquals(0, int0);
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, false);
      uIPanel0.setFirstVisible(0);
      assertTrue(uIPanel0.isModal());
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertEquals(0, uIPanel0.getFirstVisible());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      boolean boolean0 = uIPanel0.isListMode();
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertTrue(boolean0);
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertTrue(uIPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, false);
      uIPanel0.setListMode(false);
      assertFalse(uIPanel0.isModal());
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      int int0 = uITextPanel0.getMaxHeight();
      assertFalse(uITextPanel0.isModal());
      assertEquals((-1), int0);
      assertEquals((-1), uITextPanel0.getSelectedIndex());
      assertFalse(uITextPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setModal(false);
      assertFalse(uIAccordion0.isModal());
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertEquals((-1), uIAccordion0.getSelectedIndex());
      assertFalse(uIAccordion0.isListMode());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, false);
      String[] stringArray0 = new String[5];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIPanel0.addItem(uIRadioButtons0);
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertFalse(uIPanel0.isModal());
  }
}