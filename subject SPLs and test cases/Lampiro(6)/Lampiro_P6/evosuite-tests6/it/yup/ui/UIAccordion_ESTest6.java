/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:25:14 KST 2018
 */

package it.yup.ui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIAccordion_ESTest6 extends UIAccordion_ESTest_scaffolding6 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.swap(0, 1);
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setSepSize((-1));
      // Undeclared exception!
      try { 
        uIAccordion0.addItem((UIItem) uIAccordion0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UIButton uIButton0 = new UIButton((Image) null, "");
      uIAccordion0.insertSpareItem(uIButton0, 0);
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UIHLayout uIHLayout0 = new UIHLayout(0);
      uIAccordion0.addSpareItem(uIHLayout0);
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(2, uIAccordion0.getSepSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setWidth(1);
      UIAccordion uIAccordion1 = (UIAccordion)uIAccordion0.getSelectedItem();
      assertEquals((-1), uIAccordion1.getLabelGradientColor());
      assertFalse(uIAccordion1.isOneOpen());
      assertEquals(11184810, uIAccordion1.getLabelColor());
      assertEquals(12303291, uIAccordion1.getSepColor());
      assertEquals(2, uIAccordion1.getSepSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setType(1);
      UIAccordion uIAccordion1 = (UIAccordion)uIAccordion0.getSelectedItem();
      assertEquals(11184810, uIAccordion1.getLabelColor());
      assertEquals(2, uIAccordion1.getSepSize());
      assertEquals(12303291, uIAccordion1.getSepColor());
      assertEquals((-1), uIAccordion1.getLabelGradientColor());
      assertFalse(uIAccordion1.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setLayoutWidth((-1));
      UIAccordion uIAccordion1 = (UIAccordion)uIAccordion0.getSelectedItem();
      assertEquals(2, uIAccordion1.getSepSize());
      assertEquals(11184810, uIAccordion1.getLabelColor());
      assertEquals(12303291, uIAccordion1.getSepColor());
      assertEquals((-1), uIAccordion1.getLabelGradientColor());
      assertFalse(uIAccordion1.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.insertSpareItem((UIItem) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UICheckbox uICheckbox0 = new UICheckbox("");
      // Undeclared exception!
      try { 
        uIAccordion0.insertPanelItem(uICheckbox0, uICheckbox0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIAccordion", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.getSubPanelElements((UIItem) null);
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
      UISeparator uISeparator0 = new UISeparator(0);
      // Undeclared exception!
      try { 
        uIAccordion0.clickLabel(uISeparator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIAccordion$AccordionItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.clickLabel((UIItem) null);
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(2, uIAccordion0.getSepSize());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UITextPanel uITextPanel0 = new UITextPanel();
      uIAccordion0.getSubpanel(uITextPanel0);
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(2, uIAccordion0.getSepSize());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.insertItem((UIItem) uIAccordion0, 0);
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
      uIAccordion0.swap(4, 0);
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(12303291, uIAccordion0.getSepColor());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.swap(0, 0);
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.move(0, 0);
      assertEquals(2, uIAccordion0.getSepSize());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
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
      UIButton uIButton0 = new UIButton("");
      // Undeclared exception!
      try { 
        uIAccordion0.clearPanel(uIButton0);
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
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setBg_color(0);
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.closeLabel(uIAccordion0);
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      // Undeclared exception!
      try { 
        uIAccordion0.openLabel(uIAccordion0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIAccordion$AccordionItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.closeLabel((UIItem) null);
      assertEquals(2, uIAccordion0.getSepSize());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      UISeparator uISeparator0 = new UISeparator(0);
      // Undeclared exception!
      try { 
        uIAccordion0.removePanelItem(uISeparator0, uISeparator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIAccordion", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getPanelSize(uIAccordion0);
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(0, int0);
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      assertEquals(11184810, uIAccordion0.getLabelColor());
      
      uIAccordion0.setLabelColor(0);
      assertEquals(0, uIAccordion0.getLabelColor());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.getOpenedLabel();
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      Vector<String> vector0 = new Vector<String>();
      // Undeclared exception!
      try { 
        uIAccordion0.addItem((UIItem) uIAccordion0, (Vector) vector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      assertEquals(12303291, uIAccordion0.getSepColor());
      
      uIAccordion0.setSepColor(0);
      assertEquals(2, uIAccordion0.getSepSize());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setLabelSelectedColor(0);
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setSepSize(0);
      // Undeclared exception!
      try { 
        uIAccordion0.addItem((UIItem) uIAccordion0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getSepSize();
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(2, int0);
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      
      uIAccordion0.setLabelGradientColor(0);
      assertEquals(0, uIAccordion0.getLabelGradientColor());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setOneOpen(false);
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getLabelGradientColor();
      assertEquals((-1), int0);
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.removeAllItems();
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.setLabelGradientSelectedColor(0);
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(uIAccordion0.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getSepColor();
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(12303291, int0);
      assertEquals(2, uIAccordion0.getSepSize());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      boolean boolean0 = uIAccordion0.isOneOpen();
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertFalse(boolean0);
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.getItemLabels();
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(11184810, uIAccordion0.getLabelColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertFalse(uIAccordion0.isOneOpen());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      int int0 = uIAccordion0.getLabelColor();
      assertFalse(uIAccordion0.isOneOpen());
      assertEquals((-1), uIAccordion0.getLabelGradientColor());
      assertEquals(2, uIAccordion0.getSepSize());
      assertEquals(12303291, uIAccordion0.getSepColor());
      assertEquals(11184810, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
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
  public void test50()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      Vector<UITextPanel> vector0 = new Vector<UITextPanel>();
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
}
