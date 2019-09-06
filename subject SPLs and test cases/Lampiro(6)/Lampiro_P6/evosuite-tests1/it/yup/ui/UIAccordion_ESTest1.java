/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 00:52:07 KST 2018
 */

package it.yup.ui;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.Vector;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIAccordion_ESTest1 extends UIAccordion_ESTest_scaffolding1 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.swap(0, 1);
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(2, uIAccordion0.getSepSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UILabel uILabel0 = new UILabel((Image) null, "");
      uIAccordion0.insertSpareItem(uILabel0, 0);
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setWidth(1);
      UIAccordion uIAccordion1 = (UIAccordion)uIAccordion0.getSelectedItem();
      assertEquals(11184810, uIAccordion1.getLabelColor());
      assertFalse(uIAccordion1.isOneOpen());
      assertEquals((-1), uIAccordion1.getLabelGradientColor());
      assertEquals(12303291, uIAccordion1.getSepColor());
      assertEquals(2, uIAccordion1.getSepSize());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setType(1);
      UIAccordion uIAccordion1 = (UIAccordion)uIAccordion0.getSelectedItem();
      assertEquals(11184810, uIAccordion1.getLabelColor());
      assertEquals((-1), uIAccordion1.getLabelGradientColor());
      assertFalse(uIAccordion1.isOneOpen());
      assertEquals(12303291, uIAccordion1.getSepColor());
      assertEquals(2, uIAccordion1.getSepSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setGradientSelectedColor(0);
      UIAccordion uIAccordion1 = (UIAccordion)uIAccordion0.getSelectedItem();
      assertFalse(uIAccordion1.isOneOpen());
      assertEquals(2, uIAccordion1.getSepSize());
      assertEquals((-1), uIAccordion1.getLabelGradientColor());
      assertEquals(11184810, uIAccordion1.getLabelColor());
      assertEquals(12303291, uIAccordion1.getSepColor());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setGradientColor(1);
      UIAccordion uIAccordion1 = (UIAccordion)uIAccordion0.getSelectedItem();
      assertEquals((-1), uIAccordion1.getLabelGradientColor());
      assertFalse(uIAccordion1.isOneOpen());
      assertEquals(2, uIAccordion1.getSepSize());
      assertEquals(12303291, uIAccordion1.getSepColor());
      assertEquals(11184810, uIAccordion1.getLabelColor());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setFg_color(1);
      UIAccordion uIAccordion1 = (UIAccordion)uIAccordion0.getSelectedItem();
      assertEquals(11184810, uIAccordion1.getLabelColor());
      assertEquals(2, uIAccordion1.getSepSize());
      assertFalse(uIAccordion1.isOneOpen());
      assertEquals((-1), uIAccordion1.getLabelGradientColor());
      assertEquals(12303291, uIAccordion1.getSepColor());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.bg_color = 1;
      UIAccordion uIAccordion1 = (UIAccordion)uIAccordion0.getSelectedItem();
      assertEquals(11184810, uIAccordion1.getLabelColor());
      assertEquals(2, uIAccordion1.getSepSize());
      assertEquals(12303291, uIAccordion1.getSepColor());
      assertEquals((-1), uIAccordion1.getLabelGradientColor());
      assertFalse(uIAccordion1.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      
      uIAccordion0.setLabelGradientColor(1);
      int int0 = uIAccordion0.getLabelGradientColor();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.height = 1;
      uIAccordion0.getHeight((Graphics) null);
      assertEquals(2, uIAccordion0.getSepSize());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.keyPressed(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.insertPanelItem(uIAccordion0, uIAccordion0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIAccordion", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.getSubpanel((UIItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.getPanelSize((UIItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.addSpareItem((UIItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.clickLabel(uIAccordion0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIAccordion$AccordionItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UITextPanel uITextPanel0 = new UITextPanel();
      uIAccordion0.getSubpanel(uITextPanel0);
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UILabel uILabel0 = new UILabel("");
      // Undeclared exception!
      try { 
        uIAccordion0.insertItem((UIItem) uILabel0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.swap(0, (-1));
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(2, uIAccordion0.getSepSize());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.swap(0, 0);
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.move(0, 0);
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UICheckbox uICheckbox0 = new UICheckbox("");
      // Undeclared exception!
      try { 
        uIAccordion0.clearPanel(uICheckbox0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIAccordion", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.getSubPanelElements(uIAccordion0);
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setBg_color(0);
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.closeLabel((UIItem) null);
      assertEquals(2, uIAccordion0.getSepSize());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.closeLabel(uIAccordion0);
      assertEquals(2, uIAccordion0.getSepSize());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.openLabel((UIItem) null);
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UILabel uILabel0 = new UILabel("");
      // Undeclared exception!
      try { 
        uIAccordion0.openLabel(uILabel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIAccordion$AccordionItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.clickLabel((UIItem) null);
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      String[] stringArray0 = new String[8];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      // Undeclared exception!
      try { 
        uIAccordion0.removePanelItem(uIRadioButtons0, uIRadioButtons0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIAccordion", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UILabel uILabel0 = new UILabel("");
      int int0 = uIAccordion0.getPanelSize(uILabel0);
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(0, int0);
      assertFalse(uIAccordion0.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.getHeight((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      assertEquals(11184810, uIAccordion0.getLabelColor());
      
      uIAccordion0.setLabelColor(0);
      assertEquals(2, uIAccordion0.getSepSize());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.getOpenedLabel();
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UIButton uIButton0 = new UIButton((Image) null, "");
      Vector<UIAccordion> vector0 = new Vector<UIAccordion>();
      // Undeclared exception!
      try { 
        uIAccordion0.addItem((UIItem) uIButton0, (Vector) vector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      assertEquals(12303291, uIAccordion0.getSepColor());
      
      uIAccordion0.setSepColor(0);
      assertFalse(uIAccordion0.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setLabelSelectedColor(0);
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setSepSize(0);
      Vector<UICheckbox> vector0 = new Vector<UICheckbox>();
      // Undeclared exception!
      try { 
        uIAccordion0.insertItem((UIItem) uIAccordion0, 0, (Vector) vector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getSepSize();
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setOneOpen(false);
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(12303291, uIAccordion0.getSepColor());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getLabelGradientColor();
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), int0);
      assertFalse(uIAccordion0.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.removeAllItems();
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setLabelGradientSelectedColor(0);
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getSepColor();
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(12303291, int0);
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.getPanelIndex(uIAccordion0, uIAccordion0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIAccordion", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.getPanelItem(uIAccordion0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIAccordion", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      boolean boolean0 = uIAccordion0.isOneOpen();
      assertEquals(2, uIAccordion0.getSepSize());
      assertFalse(boolean0);
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UIButton uIButton0 = new UIButton((Image) null, "");
      // Undeclared exception!
      try { 
        uIAccordion0.addItem((UIItem) uIButton0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.getItemLabels();
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(2, uIAccordion0.getSepSize());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getLabelColor();
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(11184810, int0);
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(12303291, uIAccordion0.getSepColor());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UILabel uILabel0 = new UILabel("");
      uIAccordion0.addSpareItem(uILabel0);
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
  }
}
