/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 18:51:45 KST 2018
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

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIMenu_ESTest1 extends UIMenu_ESTest_scaffolding1 {
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
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.setSelectedIndex(1);
      assertEquals(1, uIMenu0.getSelectedIndex());
      
      UIPanel uIPanel0 = new UIPanel(true, false);
      uIMenu0.setSelectedItem(uIPanel0);
      assertEquals((-1), uIMenu0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.setSelectedIndex(1);
      assertEquals(1, uIMenu0.getSelectedIndex());
      
      uIMenu0.setOpenedState(false);
      assertFalse(uIMenu0.isOpenedState());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      assertEquals((-1), uIMenu0.getSelectedIndex());
      
      uIMenu0.setSelectedIndex(1);
      uIMenu0.keyPressed(0, 0);
      assertEquals(1, uIMenu0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu((String) null);
      uIMenu0.keyPressed(0, 9);
      assertTrue(uIMenu0.isAutoClose());
      assertFalse(uIMenu0.isOpenedState());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertEquals(0, uIMenu0.getAbsoluteY());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu((String) null);
      uIMenu0.keyPressed(747, 0);
      assertFalse(uIMenu0.isOpenedState());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertTrue(uIMenu0.isAutoClose());
      assertTrue(uIMenu0.isFocusable());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertEquals(0, uIMenu0.getAbsoluteY());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.remove(1);
      assertFalse(uIMenu0.isOpenedState());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertTrue(uIMenu0.isFocusable());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertEquals(0, uIMenu0.getAbsoluteY());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu((String) null);
      // Undeclared exception!
      try { 
        uIMenu0.insert(1, (UIItem) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Invalid menu pos: 1, 0
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      assertEquals(0, uIMenu0.getAbsoluteX());
      
      uIMenu0.setAbsoluteX((-1));
      int int0 = uIMenu0.getAbsoluteX();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      // Undeclared exception!
      try { 
        uIMenu0.append((UIItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      assertEquals((-1), uIMenu0.getSelectedIndex());
      
      uIMenu0.setSelectedIndex((-2));
      assertEquals((-2), uIMenu0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.setDirty(false);
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertFalse(uIMenu0.isOpenedState());
      assertTrue(uIMenu0.isFocusable());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals(0, uIMenu0.getAbsoluteX());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      boolean boolean0 = uIMenu0.contains((UIItem) null);
      assertTrue(uIMenu0.isAutoClose());
      assertFalse(boolean0);
      assertFalse(uIMenu0.isOpenedState());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertTrue(uIMenu0.isFocusable());
      assertEquals((-1), uIMenu0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu((String) null);
      UIMenu uIMenu1 = (UIMenu)uIMenu0.getSelectedItem();
      assertTrue(uIMenu1.isAutoClose());
      assertEquals(0, uIMenu1.getAbsoluteY());
      assertFalse(uIMenu1.isOpenedState());
      assertTrue(uIMenu1.isFocusable());
      assertEquals(0, uIMenu1.getAbsoluteX());
      assertEquals((-1), uIMenu1.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.setSelectedIndex(0);
      assertEquals(0, uIMenu0.getSelectedIndex());
      
      UIPanel uIPanel0 = new UIPanel(true, false);
      uIMenu0.setSelectedItem(uIPanel0);
      assertEquals((-1), uIMenu0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu((String) null);
      uIMenu0.setSelectedItem(uIMenu0);
      assertTrue(uIMenu0.isFocusable());
      assertFalse(uIMenu0.isOpenedState());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertEquals(0, uIMenu0.getAbsoluteX());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu((String) null);
      boolean boolean0 = uIMenu0.isDirty();
      assertTrue(boolean0);
      assertFalse(uIMenu0.isOpenedState());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertTrue(uIMenu0.isAutoClose());
      assertTrue(uIMenu0.isFocusable());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.setScreen((UIScreen) null);
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertTrue(uIMenu0.isAutoClose());
      assertTrue(uIMenu0.isFocusable());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertFalse(uIMenu0.isOpenedState());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.setSelectedIndex(0);
      assertEquals(0, uIMenu0.getSelectedIndex());
      
      uIMenu0.setOpenedState(false);
      assertTrue(uIMenu0.isFocusable());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.setOpenedState(false);
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertFalse(uIMenu0.isOpenedState());
      assertTrue(uIMenu0.isFocusable());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals((-1), uIMenu0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      assertFalse(uIMenu0.isOpenedState());
      
      uIMenu0.setOpenedState(true);
      assertTrue(uIMenu0.isOpenedState());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu((String) null);
      uIMenu0.keyPressed(0, 1);
      assertEquals(0, uIMenu0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.setSelectedIndex(0);
      uIMenu0.keyPressed(0, 0);
      assertEquals(0, uIMenu0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      UITextPanel uITextPanel0 = new UITextPanel();
      // Undeclared exception!
      try { 
        uIMenu0.replace(0, uITextPanel0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Invalid itemList pos: 0, 0
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu((String) null);
      // Undeclared exception!
      try { 
        uIMenu0.replace((-1), (UIItem) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.removeAll();
      assertTrue(uIMenu0.isFocusable());
      assertTrue(uIMenu0.isAutoClose());
      assertFalse(uIMenu0.isOpenedState());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertEquals(0, uIMenu0.getAbsoluteY());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu((String) null);
      boolean boolean0 = uIMenu0.remove((UIItem) null);
      assertTrue(uIMenu0.isAutoClose());
      assertFalse(boolean0);
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertFalse(uIMenu0.isOpenedState());
      assertTrue(uIMenu0.isFocusable());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertEquals((-1), uIMenu0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.remove((-1));
      assertTrue(uIMenu0.isAutoClose());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertTrue(uIMenu0.isFocusable());
      assertFalse(uIMenu0.isOpenedState());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.remove(0);
      assertTrue(uIMenu0.isFocusable());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertTrue(uIMenu0.isAutoClose());
      assertFalse(uIMenu0.isOpenedState());
      assertEquals((-1), uIMenu0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu((String) null);
      // Undeclared exception!
      try { 
        uIMenu0.insert(0, (UIItem) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Invalid menu pos: 0, 0
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      // Undeclared exception!
      try { 
        uIMenu0.insert((-1), (UIItem) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Invalid menu pos: -1, 0
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UIMenu uIMenu0 = null;
      try {
        uIMenu0 = new UIMenu("g");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu((String) null);
      uIMenu0.setAutoClose(true);
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertTrue(uIMenu0.isFocusable());
      assertFalse(uIMenu0.isOpenedState());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.clear();
      assertTrue(uIMenu0.isFocusable());
      assertTrue(uIMenu0.isAutoClose());
      assertFalse(uIMenu0.isOpenedState());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertEquals(0, uIMenu0.getAbsoluteX());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.setSubmenu((UIMenu) null);
      assertTrue(uIMenu0.isAutoClose());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertFalse(uIMenu0.isOpenedState());
      assertTrue(uIMenu0.isFocusable());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertEquals(0, uIMenu0.getAbsoluteX());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.setParentMenu((UIMenu) null);
      assertTrue(uIMenu0.isAutoClose());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertTrue(uIMenu0.isFocusable());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertFalse(uIMenu0.isOpenedState());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      int int0 = uIMenu0.getAbsoluteX();
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertEquals(0, int0);
      assertTrue(uIMenu0.isFocusable());
      assertFalse(uIMenu0.isOpenedState());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      int int0 = uIMenu0.getAbsoluteY();
      assertEquals(0, int0);
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertTrue(uIMenu0.isFocusable());
      assertFalse(uIMenu0.isOpenedState());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals(0, uIMenu0.getAbsoluteX());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu((String) null);
      Vector<UICombobox.UIComboScreen> vector0 = new Vector<UICombobox.UIComboScreen>();
      uIMenu0.setItemList(vector0);
      assertTrue(uIMenu0.isFocusable());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertFalse(uIMenu0.isOpenedState());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.setAbsoluteY(0);
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertFalse(uIMenu0.isOpenedState());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertTrue(uIMenu0.isFocusable());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      UISeparator uISeparator0 = new UISeparator(0);
      uIMenu0.indexOf(uISeparator0);
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertTrue(uIMenu0.isFocusable());
      assertFalse(uIMenu0.isOpenedState());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.getSubmenu();
      assertTrue(uIMenu0.isFocusable());
      assertTrue(uIMenu0.isAutoClose());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertFalse(uIMenu0.isOpenedState());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu((String) null);
      int int0 = uIMenu0.getSelectedIndex();
      assertFalse(uIMenu0.isOpenedState());
      assertTrue(uIMenu0.isFocusable());
      assertEquals((-1), int0);
      assertTrue(uIMenu0.isAutoClose());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertEquals(0, uIMenu0.getAbsoluteY());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      uIMenu0.setWidth(0);
      assertEquals(0, uIMenu0.getWidth());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu("");
      boolean boolean0 = uIMenu0.isOpenedState();
      assertTrue(uIMenu0.isAutoClose());
      assertTrue(uIMenu0.isFocusable());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertEquals(0, uIMenu0.getAbsoluteX());
      assertFalse(boolean0);
      assertEquals(0, uIMenu0.getAbsoluteY());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      UIMenu uIMenu0 = new UIMenu((String) null);
      boolean boolean0 = uIMenu0.isAutoClose();
      assertTrue(uIMenu0.isFocusable());
      assertTrue(boolean0);
      assertFalse(uIMenu0.isOpenedState());
      assertEquals((-1), uIMenu0.getSelectedIndex());
      assertEquals(0, uIMenu0.getAbsoluteY());
      assertEquals(0, uIMenu0.getAbsoluteX());
  }
}
