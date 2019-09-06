/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 15:37:13 KST 2018
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
public class UIPanel_ESTest4 extends UIPanel_ESTest_scaffolding4 {
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
      boolean boolean0 = uIAccordion0.isModal();
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertFalse(uIAccordion0.isListMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      boolean boolean0 = uIPanel0.isListMode();
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertTrue(boolean0);
      assertTrue(uIPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      UIVLayout uIVLayout0 = new UIVLayout(1, 0);
      uIPanel0.addItem(uIVLayout0);
      // Undeclared exception!
      try { 
        uIPanel0.setSelectedItem(uIVLayout0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UITextPanel uITextPanel0 = new UITextPanel();
      // Undeclared exception!
      try { 
        uIAccordion0.removeItem(uITextPanel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIAccordion$AccordionItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UISeparator uISeparator0 = new UISeparator(0, 0);
      // Undeclared exception!
      try { 
        uIAccordion0.addItem(uISeparator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      assertEquals((-1), uIPanel0.getSelectedIndex());
      
      uIPanel0.setSelectedIndex((-1));
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.removeItemAt((-1));
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertFalse(uIAccordion0.isModal());
      assertEquals((-1), uIAccordion0.getSelectedIndex());
      assertFalse(uIAccordion0.isListMode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      boolean boolean0 = uIAccordion0.isDirty();
      assertFalse(uIAccordion0.isModal());
      assertEquals((-1), uIAccordion0.getSelectedIndex());
      assertFalse(uIAccordion0.isListMode());
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      uIPanel0.getItems();
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertTrue(uIPanel0.isModal());
      assertTrue(uIPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      UILabel uILabel0 = new UILabel((String) null);
      boolean boolean0 = uIPanel0.contains(uILabel0);
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertFalse(uIPanel0.isListMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      assertEquals((-1), uIPanel0.getSelectedIndex());
      
      uIPanel0.selectedIdx = 0;
      uIPanel0.getSelectedItem();
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      uIPanel0.addItem(uIVLayout0);
      uIPanel0.setSelectedItem(uIVLayout0);
      assertTrue(uIVLayout0.isSelected());
      assertEquals(0, uIPanel0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setSelectedIndex(0);
      assertFalse(uIAccordion0.isModal());
      assertEquals((-1), uIAccordion0.getSelectedIndex());
      assertFalse(uIAccordion0.isListMode());
      assertEquals((-1), uIAccordion0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, true);
      uIPanel0.setSelectedIndex((-2));
      assertTrue(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertFalse(uIPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.removeAllItems();
      assertEquals(0, uIPanel0.getFirstVisible());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertFalse(uIPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.insertSpareItem(uIPanel0, 1);
      assertFalse(uIAccordion0.isModal());
      assertEquals((-1), uIAccordion0.getSelectedIndex());
      assertFalse(uIAccordion0.isListMode());
      assertEquals((-1), uIAccordion0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      UIAccordion uIAccordion0 = new UIAccordion();
      assertEquals((-1), uIAccordion0.getSelectedIndex());
      
      uIAccordion0.insertSpareItem(uIPanel0, 0);
      assertFalse(uIAccordion0.isModal());
      assertEquals((-1), uIAccordion0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.insertItemAt(uIPanel0, (-1));
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertFalse(uIPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.removeItemAt(1);
      assertEquals((-1), uIAccordion0.getMaxHeight());
      assertFalse(uIAccordion0.isModal());
      assertFalse(uIAccordion0.isListMode());
      assertEquals((-1), uIAccordion0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      int int0 = uIPanel0.removeItem((UIItem) null);
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), int0);
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertFalse(uIPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, false);
      uIPanel0.setMaxHeight((-2));
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertTrue(uIPanel0.isModal());
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      assertEquals((-1), uIPanel0.getMaxHeight());
      
      uIPanel0.setMaxHeight(0);
      assertEquals(0, uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      uIPanel0.setSelected(true);
      assertTrue(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertTrue(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      // Undeclared exception!
      try { 
        uITextPanel0.updateChildren();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer(0);
      vector0.add(integer0);
      uIAccordion0.setItems(vector0);
      // Undeclared exception!
      try { 
        uIAccordion0.updateChildren();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to it.yup.ui.UIItem
         //
         verifyException("it.yup.ui.UIPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      UIGauge uIGauge0 = new UIGauge("", false, 0, 0);
      uIPanel0.addItem(uIGauge0);
      uIPanel0.setDirty(true);
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertFalse(uIPanel0.isListMode());
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, false);
      uIPanel0.setScreen((UIScreen) null);
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      boolean boolean0 = uIPanel0.isModal();
      assertTrue(boolean0);
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertTrue(uIPanel0.isListMode());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      int int0 = uIPanel0.getFirstVisible();
      assertTrue(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertEquals(0, int0);
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertTrue(uIPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      uIPanel0.setFirstVisible(0);
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertEquals(0, uIPanel0.getFirstVisible());
      assertTrue(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertTrue(uIPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      boolean boolean0 = uIPanel0.isListMode();
      assertFalse(boolean0);
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertFalse(uIPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      int int0 = uIPanel0.getSelectedIndex();
      assertTrue(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertTrue(uIPanel0.isListMode());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      uIPanel0.setListMode(true);
      assertTrue(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertTrue(uIPanel0.isModal());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      boolean boolean0 = uIPanel0.isFocusable();
      assertTrue(boolean0);
      assertFalse(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getMaxHeight();
      assertEquals((-1), uIAccordion0.getSelectedIndex());
      assertFalse(uIAccordion0.isListMode());
      assertFalse(uIAccordion0.isModal());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      uIPanel0.setModal(true);
      assertTrue(uIPanel0.isModal());
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertTrue(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getMaxHeight());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, false);
      UITextPanel uITextPanel0 = new UITextPanel();
      uIPanel0.addItem(uITextPanel0);
      assertFalse(uITextPanel0.isModal());
      assertFalse(uITextPanel0.isListMode());
      
      boolean boolean0 = uIPanel0.isDirty();
      assertEquals((-1), uIPanel0.getMaxHeight());
      assertTrue(boolean0);
      assertFalse(uIPanel0.isListMode());
      assertEquals((-1), uIPanel0.getSelectedIndex());
      assertFalse(uIPanel0.isModal());
  }
}
