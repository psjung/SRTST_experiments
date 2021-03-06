/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 01:09:06 KST 2018
 */

package it.yup.ui;

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
import static org.evosuite.runtime.EvoAssertions.*;
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIPanel_ESTest1 extends UIPanel_ESTest_scaffolding1 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, false);
      uIPanel0.setSelectedIndex(1);
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, false);
      uIPanel0.setMaxHeight((-1));
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, false);
      uIPanel0.selectedIdx = 1;
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      uIPanel0.addItem(uIVLayout0);
      // Undeclared exception!
      try { 
        uIPanel0.updateChildren();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      boolean boolean0 = uIPanel0.isListMode();
      assertTrue(boolean0);
      assertTrue(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.selected = true;
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertFalse(uITextPanel1.isListMode());
      assertEquals((-1), uITextPanel1.getMaxHeight());
      assertFalse(uITextPanel1.isModal());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, false);
      uIPanel0.setWidth(0);
      UIPanel uIPanel1 = (UIPanel)uIPanel0.getSelectedItem();
      assertTrue(uIPanel1.isModal());
      assertFalse(uIPanel1.isListMode());
      assertEquals((-1), uIPanel1.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setWidth(1);
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertEquals((-1), uITextPanel1.getMaxHeight());
      assertFalse(uITextPanel1.isModal());
      assertFalse(uITextPanel1.isListMode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setLayoutWidth(1);
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertEquals((-1), uITextPanel1.getMaxHeight());
      assertFalse(uITextPanel1.isListMode());
      assertFalse(uITextPanel1.isModal());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setLayoutHeight(1);
      UITextPanel uITextPanel1 = (UITextPanel)uITextPanel0.getSelectedItem();
      assertFalse(uITextPanel1.isModal());
      assertFalse(uITextPanel1.isListMode());
      assertEquals((-1), uITextPanel1.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setGradientSelectedColor(1);
      UIAccordion uIAccordion1 = (UIAccordion)uIAccordion0.getSelectedItem();
      assertFalse(uIAccordion1.isListMode());
      assertFalse(uIAccordion1.isModal());
      assertEquals((-1), uIAccordion1.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.bg_color = 1;
      UIAccordion uIAccordion1 = (UIAccordion)uIAccordion0.getSelectedItem();
      assertEquals((-1), uIAccordion1.getMaxHeight());
      assertFalse(uIAccordion1.isModal());
      assertFalse(uIAccordion1.isListMode());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, false);
      UIGauge uIGauge0 = new UIGauge("", true, 0, 0);
      uIPanel0.insertItemAt(uIGauge0, 0);
      assertEquals((-1), uIPanel0.getSelectedIndex());
      
      uIPanel0.setSelectedIndex(0);
      int int0 = uIPanel0.getSelectedIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      assertEquals((-1), uIPanel0.getMaxHeight());
      
      uIPanel0.setMaxHeight(1);
      int int0 = uIPanel0.getMaxHeight();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      Vector<UICheckbox> vector0 = new Vector<UICheckbox>();
      UICheckbox uICheckbox0 = new UICheckbox("");
      vector0.add(uICheckbox0);
      uIPanel0.setItems(vector0);
      uIPanel0.getItems();
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.computeRealHeight((Graphics) null);
      assertFalse(uITextPanel0.isModal());
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertFalse(uITextPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.setItems((Vector) null);
      // Undeclared exception!
      try { 
        uIPanel0.setSelectedIndex(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, false);
      UIVLayout uIVLayout0 = new UIVLayout(1, 0);
      uIPanel0.addItem(uIVLayout0);
      // Undeclared exception!
      try { 
        uIPanel0.setDirty(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer(0);
      vector0.add(integer0);
      uIAccordion0.setItems(vector0);
      // Undeclared exception!
      try { 
        uIAccordion0.setDirty(false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to it.yup.ui.UIItem
         //
         verifyException("it.yup.ui.UIPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.removeItem((UIItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.paint((Graphics) null, 0, 0);
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
      UIPanel uIPanel0 = new UIPanel();
      // Undeclared exception!
      try { 
        uIPanel0.drawScrollBar((Graphics) null, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
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
  public void test23()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      // Undeclared exception!
      try { 
        uIPanel0.addItem((UIItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, false);
      uIPanel0.setSelectedIndex((-1));
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.removeItemAt((-1));
      assertFalse(uIAccordion0.isListMode());
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertFalse(uIAccordion0.isModal());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      boolean boolean0 = uIAccordion0.isDirty();
      assertTrue(boolean0);
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertFalse(uIAccordion0.isModal());
      assertFalse(uIAccordion0.isListMode());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.getItems();
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      UIPanel uIPanel0 = new UIPanel();
      UIAccordion uIAccordion0 = new UIAccordion();
      uIPanel0.addItem(uITextPanel0);
      boolean boolean0 = uIPanel0.contains(uIAccordion0);
      assertFalse(uIAccordion0.isListMode());
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertFalse(uIAccordion0.isModal());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, true);
      uIPanel0.setSelectedIndex(0);
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertTrue(uIPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, false);
      uIPanel0.setSelectedIndex((-2));
      assertTrue(uIPanel0.isModal());
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, false);
      uIPanel0.removeAllItems();
      assertEquals(0, uIPanel0.getFirstVisible());
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.insertItemAt((UIItem) null, 1);
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertFalse(uITextPanel0.isModal());
      assertFalse(uITextPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.insertItemAt(uIPanel0, (-1));
      assertFalse(uIPanel0.isModal());
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      Vector<UICheckbox> vector0 = new Vector<UICheckbox>();
      UICheckbox uICheckbox0 = new UICheckbox("");
      vector0.add(uICheckbox0);
      vector0.add(uICheckbox0);
      uIPanel0.setItems(vector0);
      uIPanel0.removeItemAt(0);
      assertEquals((-1), uIPanel0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.removeItemAt(1);
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertFalse(uITextPanel0.isModal());
      assertFalse(uITextPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, false);
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      uIPanel0.addItem(uIVLayout0);
      int int0 = uIPanel0.removeItem(uIVLayout0);
      assertEquals(0, int0);
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertEquals((-1), uIPanel0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, false);
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      int int0 = uIPanel0.removeItem(uIVLayout0);
      assertFalse(uIPanel0.isListMode());
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), int0);
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.setMaxHeight((-2));
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      assertEquals((-1), uIPanel0.getMaxHeight());
      
      uIPanel0.setMaxHeight(0);
      int int0 = uIPanel0.getMaxHeight();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, false);
      UIGauge uIGauge0 = new UIGauge("", true, 0, 0);
      uIPanel0.insertItemAt(uIGauge0, 0);
      uIPanel0.setSelectedIndex(0);
      Vector<UICombobox.UIComboScreen> vector0 = new Vector<UICombobox.UIComboScreen>();
      uIPanel0.setItems(vector0);
      uIPanel0.setSelected(true);
      assertEquals(0, uIPanel0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, false);
      UIGauge uIGauge0 = new UIGauge("", true, 0, 0);
      uIPanel0.insertItemAt(uIGauge0, 0);
      uIPanel0.setSelectedIndex(0);
      uIPanel0.setSelected(true);
      assertEquals(0, uIPanel0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      uIPanel0.setSelected(true);
      assertTrue(uIPanel0.isListMode());
      assertTrue(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertEquals((-1), uIPanel0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.clearPanel((UILabel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
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
  public void test45()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      uIAccordion0.insertSpareItem(uIVLayout0, 0);
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
  public void test46()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setDirty(false);
      boolean boolean0 = uITextPanel0.isDirty();
      assertFalse(boolean0);
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertFalse(uITextPanel0.isModal());
      assertFalse(uITextPanel0.isListMode());
      assertEquals((-1), uITextPanel0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.addItem(uITextPanel0);
      boolean boolean0 = uIPanel0.isDirty();
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertFalse(uIPanel0.isListMode());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      // Undeclared exception!
      try { 
        uITextPanel0.getHeight((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setScreen((UIScreen) null);
      assertEquals((-1), uIAccordion0.getSelectedIndex());
      assertFalse(uIAccordion0.isListMode());
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertFalse(uIAccordion0.isModal());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      assertEquals((-1), uIPanel0.getSelectedIndex());
      
      UISeparator uISeparator0 = new UISeparator(0);
      uIPanel0.setSelectedItem(uISeparator0);
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isModal());
      assertFalse(uIPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      boolean boolean0 = uIPanel0.isModal();
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(boolean0);
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertFalse(uIPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      int int0 = uITextPanel0.getFirstVisible();
      assertEquals((-1), uITextPanel0.getSelectedIndex());
      assertFalse(uITextPanel0.isListMode());
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertFalse(uITextPanel0.isModal());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setFirstVisible(0);
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertEquals((-1), uITextPanel0.getSelectedIndex());
      assertFalse(uITextPanel0.isListMode());
      assertEquals(0, uITextPanel0.getFirstVisible());
      assertFalse(uITextPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      boolean boolean0 = uITextPanel0.isListMode();
      assertEquals((-1), uITextPanel0.getSelectedIndex());
      assertFalse(uITextPanel0.isModal());
      assertFalse(boolean0);
      assertEquals((-1), uITextPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getSelectedIndex();
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertFalse(uIAccordion0.isListMode());
      assertFalse(uIAccordion0.isModal());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.setListMode(false);
      assertFalse(uITextPanel0.isModal());
      assertFalse(uITextPanel0.isListMode());
      assertEquals((-1), uITextPanel0.getSelectedIndex());
      assertEquals((-1), uITextPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      boolean boolean0 = uITextPanel0.isFocusable();
      assertTrue(boolean0);
      assertEquals((-1), uITextPanel0.getMaxHeight());
      assertEquals((-1), uITextPanel0.getSelectedIndex());
      assertFalse(uITextPanel0.isListMode());
      assertFalse(uITextPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getMaxHeight();
      assertEquals((-1), int0);
      assertFalse(uIAccordion0.isListMode());
      assertEquals((-1), uIAccordion0.getSelectedIndex());
      assertFalse(uIAccordion0.isModal());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setModal(false);
      assertFalse(uIAccordion0.isModal());
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertEquals((-1), uIAccordion0.getSelectedIndex());
      assertFalse(uIAccordion0.isListMode());
  }
}
