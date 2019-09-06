/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 11:24:53 KST 2018
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
import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UILayout_ESTest2 extends UILayout_ESTest_scaffolding2 {
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
      UIVLayout uIVLayout0 = new UIVLayout(0, 8);
      uIVLayout0.isDirty();
      uIVLayout0.setGradientColor(107);
      uIVLayout0.setType(107);
      boolean boolean0 = false;
      uIVLayout0.setSelected(true);
      uIVLayout0.contains((UIItem) null);
      uIVLayout0.setSelectedIndex(0);
      // Undeclared exception!
      try { 
        uIVLayout0.keyPressed(8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 469;
      UIHLayout uIHLayout0 = new UIHLayout(469);
      int int1 = (-1215);
      uIHLayout0.dirKey2 = (-1215);
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        uIHLayout0.setSelected(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[7];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.isDirty();
      uIRadioButtons0.setGradientColor(8);
      uIRadioButtons0.bg_color = 1;
      uIRadioButtons0.getSelectedItem();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(62);
      uIHLayout0.setGradientSelectedColor(300);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)90;
      byteArray0[1] = (byte)52;
      byteArray0[2] = (byte)37;
      byteArray0[3] = (byte)28;
      byteArray0[4] = (byte) (-123);
      byteArray0[5] = (byte) (-59);
      Image.createImage(byteArray0, (int) (byte)90, (int) (byte)90);
      UILabel uILabel0 = new UILabel((Image) null);
      uIHLayout0.insert(uILabel0, 47, 47, (byte)37);
      uIHLayout0.bg_color = 62;
      uIHLayout0.getSelectedItem();
      // Undeclared exception!
      try { 
        uIHLayout0.setBg_color((-1202));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(1215);
      uIHLayout0.setGroup(false);
      uIHLayout0.setGradientColor(1215);
      uIHLayout0.selectedIndex = 1215;
      boolean boolean0 = false;
      boolean boolean1 = true;
      uIHLayout0.setSelectedIndex(1403);
      // Undeclared exception!
      try { 
        uIHLayout0.keyPressed((-61));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[7];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.selected = true;
      uIRadioButtons0.isDirty();
      uIRadioButtons0.getSelectedItem();
      uIRadioButtons0.setBg_color(1227);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 57;
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      UIHLayout uIHLayout0 = new UIHLayout(57);
      uIHLayout0.setSelectedIndex(57);
      stringArray0[1] = "subscription";
      stringArray0[2] = "LF";
      stringArray0[3] = "";
      stringArray0[4] = "V^XVB*z@I(3[Z D[4";
      stringArray0[5] = "";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("S_ax#WGa{;|9+alJZ", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(1215);
      uIHLayout0.setGroup(false);
      uIHLayout0.setGradientColor(1215);
      uIHLayout0.setSelectedColor(1215);
      uIHLayout0.selectedIndex = 1215;
      boolean boolean0 = false;
      boolean boolean1 = true;
      int int0 = (-61);
      // Undeclared exception!
      try { 
        uIHLayout0.traverseFocusable(1, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[7];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.isDirty();
      uIRadioButtons0.setFg_color(1110);
      uIRadioButtons0.getSelectedItem();
      uIRadioButtons0.setDirty(true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[7];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.isDirty();
      uIRadioButtons0.isDirty();
      UIVLayout uIVLayout0 = new UIVLayout(1, 2204);
      uIVLayout0.insert(uIRadioButtons0, 0, (-1927), 34);
      uIRadioButtons0.setSelectedItem(uIVLayout0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = " xmlns='";
      stringArray0[2] = "O`F(aeTqko4NE#FDnH";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.layoutFocused = false;
      uIRadioButtons0.setSelectedIndex(0);
      uIRadioButtons0.setBg_color(8);
      uIRadioButtons0.getContainer();
      uIRadioButtons0.getItem(0);
      uIRadioButtons0.setContainer((UIIContainer) null);
      uIRadioButtons0.traverseFocusable(8, false);
      // Undeclared exception!
      try { 
        uIRadioButtons0.keyPressed((-701558691));
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
      UIVLayout uIVLayout0 = new UIVLayout(102, (-634));
      UITextPanel uITextPanel0 = new UITextPanel();
      // Undeclared exception!
      try { 
        uIVLayout0.setSelectedItem((UIItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(1164);
      boolean boolean0 = false;
      uIHLayout0.setGroup(false);
      String string0 = null;
      uIHLayout0.selectedIndex = 1164;
      uIHLayout0.isGroup();
      UIRadioButtons uIRadioButtons0 = null;
      try {
        uIRadioButtons0 = new UIRadioButtons((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIRadioButtons", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[16];
      stringArray0[15] = "";
      stringArray0[1] = " xmlns='";
      stringArray0[2] = "O`F(aeTqko4NE#FDnH";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.layoutFocused = false;
      uIRadioButtons0.setSelectedIndex(0);
      uIRadioButtons0.setBg_color(8);
      uIRadioButtons0.traverseFocusable(8, false);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.traverseFocusable(0, true);
      // Undeclared exception!
      try { 
        uIRadioButtons0.drawSegmentedBorder((Graphics) null, 0, 88);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(1188);
      uIHLayout0.selectedIndex = 1188;
      // Undeclared exception!
      try { 
        uIHLayout0.updateChildren();
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
      UIVLayout uIVLayout0 = new UIVLayout(0, (-1));
      uIVLayout0.setHeight(0);
      uIVLayout0.setBg_color(854);
      uIVLayout0.getSelectedItem();
      assertEquals(854, uIVLayout0.getBg_color());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "`%`Q=&H>t#Ii";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setFocusable(false);
      uIRadioButtons0.askRepaint();
      int int0 = 0;
      uIRadioButtons0.setSelectedIndex(0);
      uIRadioButtons0.updateChildren();
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("`%`Q=&H>t#Ii", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      String string0 = "+{i(]rWepR>\"kbJvtC";
      stringArray0[1] = "+{i(]rWepR>\"kbJvtC";
      stringArray0[2] = "";
      stringArray0[3] = "probe";
      stringArray0[4] = "list-multi";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      int int0 = 621;
      uIRadioButtons0.setSelectedIndex(621);
      UIButton uIButton0 = new UIButton("list-multi");
      // Undeclared exception!
      try { 
        uIRadioButtons0.insert(uIButton0, 621, 0, 1712);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "LDaZ4y*0hJ2+";
      stringArray0[1] = "i8aYCx";
      stringArray0[2] = "vcard-temp";
      stringArray0[3] = "5BZ$";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      UIRadioButtons uIRadioButtons1 = (UIRadioButtons)uIRadioButtons0.getSelectedItem();
      assertTrue(uIRadioButtons1.isGroup());
      assertEquals(0, uIRadioButtons1.getLayoutHeight());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "krR31I%['sn.*L";
      stringArray0[1] = "(x<1";
      stringArray0[2] = ">{'iA61Q=9";
      stringArray0[3] = "J4\"H,[";
      stringArray0[4] = "&amp;";
      stringArray0[5] = "%W$#0n";
      stringArray0[6] = "";
      stringArray0[7] = "^/y\"m";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      int int0 = 16744448;
      uIRadioButtons0.setGradientSelectedColor(16744448);
      Graphics graphics0 = null;
      uIRadioButtons0.setFocusable(true);
      uIRadioButtons0.dirKey2 = 1032;
      UIScreen uIScreen0 = null;
      uIRadioButtons0.setScreen((UIScreen) null);
      // Undeclared exception!
      try { 
        uIRadioButtons0.drawPixel((Graphics) null, (-1), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "1r7(j}DKd;:;";
      stringArray0[1] = "2RQCOAqit";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      // Undeclared exception!
      try { 
        uIRadioButtons0.getItem((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(0);
      uIHLayout0.setLayoutWidth(0);
      uIHLayout0.getSelectedItem();
      uIHLayout0.isGroup();
      uIHLayout0.setDirty(true);
      String[] stringArray0 = new String[5];
      String string0 = "1g\\u";
      stringArray0[0] = string0;
      stringArray0[1] = "D;W&]]E,D";
      stringArray0[2] = "lDCLmo@VJ<q";
      stringArray0[3] = "canceled";
      stringArray0[4] = "Ay";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      // Undeclared exception!
      try { 
        uIRadioButtons0.keyPressed(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = 244;
      UIVLayout uIVLayout0 = new UIVLayout(244, 244);
      int int1 = 57;
      uIVLayout0.setHeight(57);
      // Undeclared exception!
      try { 
        uIVLayout0.isFocusable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "boolean";
      stringArray0[1] = ".%%1s~%G^*G'BvLb+";
      stringArray0[2] = "";
      stringArray0[3] = "UV0F?lu-?JP_6q,";
      stringArray0[4] = "|u,T<I";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      boolean boolean0 = uIRadioButtons0.isFocusable();
      assertTrue(boolean0);
      assertTrue(uIRadioButtons0.isGroup());
      assertEquals((-1), uIRadioButtons0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = 0;
      UIVLayout uIVLayout0 = new UIVLayout(59, 0);
      int int1 = 1094;
      uIVLayout0.contains((UIItem) null);
      uIVLayout0.dirKey2 = 1094;
      uIVLayout0.setSelectedColor(0);
      // Undeclared exception!
      try { 
        uIVLayout0.isDirty();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(102, (-634));
      boolean boolean0 = uIVLayout0.contains((UIItem) null);
      assertTrue(boolean0);
      
      UITextPanel uITextPanel0 = new UITextPanel();
      uIVLayout0.setSelectedItem(uITextPanel0);
      assertTrue(uIVLayout0.isGroup());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "+vc[k/gAUy> ]@yp";
      stringArray0[1] = "}hk*C9D{";
      stringArray0[2] = "id,a.*jVLRX";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      UIGauge uIGauge0 = new UIGauge("V1ycPF", true, 300, (-2021));
      uIRadioButtons0.setSelectedItem(uIGauge0);
      assertEquals((-1), uIRadioButtons0.getSelectedIndex());
      assertTrue(uIRadioButtons0.isGroup());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(0);
      uIHLayout0.dirKey1 = 0;
      UIItem[] uIItemArray0 = new UIItem[9];
      uIItemArray0[0] = (UIItem) uIHLayout0;
      int int0 = 0;
      uIHLayout0.fg_color = 0;
      uIItemArray0[1] = (UIItem) uIHLayout0;
      uIItemArray0[2] = (UIItem) uIHLayout0;
      uIItemArray0[3] = (UIItem) uIHLayout0;
      uIHLayout0.setType(0);
      uIHLayout0.focusable = true;
      uIItemArray0[4] = (UIItem) uIHLayout0;
      uIItemArray0[5] = (UIItem) uIHLayout0;
      // Undeclared exception!
      try { 
        uIHLayout0.updateChildren();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = 8;
      UIVLayout uIVLayout0 = new UIVLayout(8, 8);
      uIVLayout0.setFocusable(true);
      int int1 = (-2408);
      uIVLayout0.fg_color = (-2408);
      int int2 = 249;
      uIVLayout0.setHeight(249);
      int int3 = 1952;
      uIVLayout0.traverseFocusable(1952, true);
      // Undeclared exception!
      try { 
        uIVLayout0.updateChildren();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = 785;
      UIVLayout uIVLayout0 = new UIVLayout(1, 785);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIVLayout0.setStatus(uIRadioButtons0);
      // Undeclared exception!
      try { 
        uIVLayout0.updateChildren();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(3195);
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
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "5_b1IY8.ygN$9g~F=k";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.isDirty();
      // Undeclared exception!
      try { 
        uIRadioButtons0.traverseFocusable(4106, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4106
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = 131072;
      UIVLayout uIVLayout0 = new UIVLayout(131072, 131072);
      // Undeclared exception!
      try { 
        uIVLayout0.isDirty();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(873, 2055);
      uIVLayout0.getScreen();
      uIVLayout0.setScreen((UIScreen) null);
      assertTrue(uIVLayout0.isGroup());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(2449);
      uIHLayout0.setGroup(true);
      // Undeclared exception!
      try { 
        uIHLayout0.setDirty(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "*s/yk<YY{Z!4d9q1F";
      stringArray0[1] = ":-/";
      stringArray0[2] = "\" ";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setGroup(true);
      assertEquals((-1), uIRadioButtons0.getSelectedIndex());
      assertTrue(uIRadioButtons0.isGroup());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "text";
      stringArray0[2] = "LHrB mV#<XB2i&:!y";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.dirKey1 = 1;
      assertEquals((-1), uIRadioButtons0.getSelectedIndex());
      
      uIRadioButtons0.setSelectedIndex(1);
      uIRadioButtons0.isGroup();
      uIRadioButtons0.setDirty(true);
      uIRadioButtons0.setHeight((-1479));
      assertTrue(uIRadioButtons0.isGroup());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = 904;
      UIVLayout uIVLayout0 = new UIVLayout(904, 904);
      // Undeclared exception!
      try { 
        uIVLayout0.setBg_color(904);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(0);
      UIItem[] uIItemArray0 = new UIItem[7];
      uIItemArray0[0] = (UIItem) uIHLayout0;
      uIItemArray0[1] = (UIItem) uIHLayout0;
      uIItemArray0[2] = (UIItem) uIHLayout0;
      uIHLayout0.contains(uIItemArray0[1]);
      uIItemArray0[3] = (UIItem) uIHLayout0;
      uIItemArray0[4] = (UIItem) uIHLayout0;
      uIItemArray0[5] = (UIItem) uIHLayout0;
      uIItemArray0[6] = (UIItem) uIHLayout0;
      uIHLayout0.layoutItems = uIItemArray0;
      // Undeclared exception!
      try { 
        uIHLayout0.keyPressed((-1360));
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
      String[] stringArray0 = new String[3];
      stringArray0[0] = "presence";
      stringArray0[1] = "";
      stringArray0[2] = "G;0~n^7s a_";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      UIMenu uIMenu0 = new UIMenu("");
      boolean boolean0 = uIRadioButtons0.contains(uIMenu0);
      assertEquals((-1), uIRadioButtons0.getSelectedIndex());
      assertTrue(uIRadioButtons0.isGroup());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "w|N.~#NOLj7";
      stringArray0[3] = "rC";
      stringArray0[4] = "sha1";
      stringArray0[5] = "";
      stringArray0[6] = " ";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.getSelectedIndex();
      uIRadioButtons0.setSelectedIndex((-1));
      uIRadioButtons0.getSelectedIndex();
      UIHLayout uIHLayout0 = new UIHLayout(75);
      uIHLayout0.dirty = true;
      uIHLayout0.insert(uIRadioButtons0, 61, 61, 2241399);
      uIRadioButtons0.setType(75);
      uIRadioButtons0.setHeight(1709);
      uIHLayout0.setSelectedItem(uIRadioButtons0);
      uIRadioButtons0.setHeight(62);
      boolean boolean0 = true;
      uIHLayout0.traverseFocusable(166, true);
      // Undeclared exception!
      try { 
        uIHLayout0.setBg_color(61);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 8);
      uIVLayout0.isDirty();
      uIVLayout0.setGradientColor(107);
      uIVLayout0.setType(107);
      boolean boolean0 = false;
      uIVLayout0.setSelected(true);
      // Undeclared exception!
      try { 
        uIVLayout0.keyPressed(8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(102, (-634));
      uIVLayout0.contains(uIVLayout0);
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.insertItemAt(uIVLayout0, (-634));
      uIVLayout0.setSelectedItem(uITextPanel0);
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
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "*";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setSelected(false);
      uIRadioButtons0.setHeight((-1927));
      uIRadioButtons0.traverseFocusable((-1927), false);
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = " xmlns='";
      stringArray0[2] = "O`F(aeTqko4NE#FDnH";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.layoutFocused = false;
      uIRadioButtons0.setSelectedIndex(0);
      uIRadioButtons0.setBg_color(8);
      // Undeclared exception!
      try { 
        uIRadioButtons0.traverseFocusable(8, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 8);
      uIVLayout0.isDirty();
      uIVLayout0.setType(107);
      uIVLayout0.setGradientSelectedColor(0);
      uIVLayout0.setSelected(true);
      uIVLayout0.setSelected(true);
      uIVLayout0.setSelected(false);
      // Undeclared exception!
      try { 
        uIVLayout0.updateChildren();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 8);
      uIVLayout0.setGroup(false);
      uIVLayout0.setType(107);
      uIVLayout0.setGradientSelectedColor(0);
      uIVLayout0.setSelected(true);
      uIVLayout0.setSelected(true);
      uIVLayout0.setSelected(false);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "G9b";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "text-single";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("G9b", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int int0 = 244;
      UIVLayout uIVLayout0 = new UIVLayout(244, 244);
      int int1 = 68;
      uIVLayout0.setHeight(68);
      // Undeclared exception!
      try { 
        uIVLayout0.isFocusable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "FORM_TYPE";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.traverseFocusable(0, true);
      uIRadioButtons0.setBg_color(0);
      // Undeclared exception!
      try { 
        uIRadioButtons0.updateChildren();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String[] stringArray0 = new String[7];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.isDirty();
      uIRadioButtons0.selectedIndex = (-842);
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("\"9", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String[] stringArray0 = new String[7];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      boolean boolean0 = uIRadioButtons0.isDirty();
      assertTrue(boolean0);
      
      UIRadioButtons uIRadioButtons1 = (UIRadioButtons)uIRadioButtons0.getSelectedItem();
      assertEquals((-1), uIRadioButtons0.getSelectedIndex());
      assertTrue(uIRadioButtons1.isGroup());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(1215);
      uIHLayout0.setGroup(false);
      uIHLayout0.setGradientColor(1215);
      uIHLayout0.selectedIndex = 1215;
      boolean boolean0 = false;
      boolean boolean1 = true;
      // Undeclared exception!
      try { 
        uIHLayout0.keyPressed((-61));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }
}
