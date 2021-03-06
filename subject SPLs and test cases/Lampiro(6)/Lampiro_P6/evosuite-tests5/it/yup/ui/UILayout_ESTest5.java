/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 17:48:02 KST 2018
 */

package it.yup.ui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Vector;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UILayout_ESTest5 extends UILayout_ESTest_scaffolding5 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[17];
      stringArray0[2] = "";
      stringArray0[1] = "";
      stringArray0[2] = "Ng";
      stringArray0[3] = "resource";
      stringArray0[4] = "/emo/15.png";
      stringArray0[1] = "";
      stringArray0[6] = "u71>mLV";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setSelected(true);
      uIRadioButtons0.setType(1076);
      uIRadioButtons0.setDirty(true);
      uIRadioButtons0.setBg_color(1076);
      uIRadioButtons0.getSelectedItem();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(8, (-1093));
      uIVLayout0.getScreen();
      uIVLayout0.contains((UIItem) null);
      uIVLayout0.traverseFocusable(8, true);
      uIVLayout0.setType(15);
      // Undeclared exception!
      try { 
        uIVLayout0.getItem((-216));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -216
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Y}A";
      stringArray0[1] = "gNB2";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "false";
      stringArray0[5] = "";
      stringArray0[6] = "q|ikz}7,hr";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.traverseFocusable(1, false);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 29;
      UIItem[] uIItemArray0 = new UIItem[1];
      String string0 = "i_;`";
      int int1 = (-1);
      UIVLayout uIVLayout0 = new UIVLayout(29, 1425);
      uIVLayout0.setSelectedIndex(95);
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
  public void test04()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(6);
      uIHLayout0.selected = true;
      uIHLayout0.fg_color = 6;
      uIHLayout0.setFocusable(true);
      uIHLayout0.setSelectedIndex((-5054));
      uIHLayout0.isGroup();
      String[] stringArray0 = new String[0];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.bg_color = (-980);
      uIRadioButtons0.setSelectedIndex((-533));
      uIHLayout0.getSelectedItem();
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
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "HCjt_3*|21S";
      stringArray0[2] = "Ng";
      stringArray0[3] = "resource";
      stringArray0[4] = "/emo/15.png";
      stringArray0[5] = "";
      stringArray0[6] = "u71>mLV";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setLayoutHeight(726);
      uIRadioButtons0.setDirty(true);
      uIRadioButtons0.setBg_color((-1729));
      uIRadioButtons0.getSelectedItem();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[2] = "";
      stringArray0[1] = "HCjt_3*|21S";
      stringArray0[2] = "Ng";
      stringArray0[3] = "resource";
      stringArray0[4] = "/emo/15.png";
      stringArray0[1] = "";
      stringArray0[6] = "u71>mLV";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setSelected(true);
      uIRadioButtons0.setType(1076);
      uIRadioButtons0.setDirty(true);
      uIRadioButtons0.setBg_color((-1729));
      uIRadioButtons0.getSelectedItem();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "form";
      stringArray0[1] = "Pr 7";
      stringArray0[2] = "_h<<S\"w_<>EuV";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "form";
      stringArray0[6] = "FO";
      stringArray0[7] = "y$j?;cq/7XO|";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setFg_color(0);
      uIRadioButtons0.setHeight((-380));
      int int0 = 832;
      UIButton uIButton0 = new UIButton("");
      UIItem[] uIItemArray0 = new UIItem[1];
      uIItemArray0[0] = (UIItem) uIRadioButtons0;
      uIRadioButtons0.layoutItems = uIItemArray0;
      // Undeclared exception!
      try { 
        uIRadioButtons0.contains(uIButton0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "HCjt_3*|21S";
      stringArray0[2] = "Ng";
      stringArray0[3] = "resource";
      stringArray0[4] = "/emo/15.png";
      stringArray0[5] = "";
      stringArray0[6] = "u71>mLV";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.width = 1987;
      uIRadioButtons0.setDirty(true);
      uIRadioButtons0.setBg_color((-1729));
      uIRadioButtons0.getSelectedItem();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "HCjt_3*|21S";
      stringArray0[2] = "Ng";
      stringArray0[3] = "resource";
      stringArray0[4] = "/emo/15.png";
      stringArray0[5] = "";
      stringArray0[6] = "u71>mLV";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setType(1076);
      uIRadioButtons0.setDirty(true);
      uIRadioButtons0.setBg_color((-1729));
      uIRadioButtons0.getSelectedItem();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(6);
      uIHLayout0.selected = true;
      uIHLayout0.fg_color = (-1214);
      uIHLayout0.setFocusable(true);
      uIHLayout0.setSelectedIndex((-5054));
      uIHLayout0.isGroup();
      String[] stringArray0 = new String[0];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setSelectedIndex((-533));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(829, 829);
      uIVLayout0.setLayoutHeight((-710));
      uIVLayout0.setSelected(false);
      uIVLayout0.setFocusable(false);
      uIVLayout0.setSelectedIndex((-780));
      String string0 = "Z";
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("Z", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "@R74b*CIaEIvUWHNR6";
      stringArray0[3] = "_'G@]2s";
      stringArray0[4] = "*z#-Hw#a({<P";
      stringArray0[5] = "";
      stringArray0[6] = "";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.height = 338;
      uIRadioButtons0.setType(2248);
      uIRadioButtons0.setDirty(false);
      uIRadioButtons0.setFg_color(2248);
      uIRadioButtons0.getSelectedIndex();
      uIRadioButtons0.traverseFocusable(1076, true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(1343);
      uIHLayout0.focusable = true;
      // Undeclared exception!
      try { 
        uIHLayout0.setSelectedIndex(60);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "form";
      stringArray0[1] = "Pr 7";
      stringArray0[2] = "_h<<S\"w_<>EuV";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "k(A1OLu$Yap$_Eq7";
      stringArray0[6] = "FO";
      stringArray0[7] = "y$j?;cq/7XO|";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setFg_color(0);
      uIRadioButtons0.setHeight((-380));
      UIButton uIButton0 = new UIButton("");
      uIRadioButtons0.contains(uIButton0);
      // Undeclared exception!
      try { 
        uIRadioButtons0.traverseFocusable(832, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 832
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[0];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setSelectedIndex(3216);
      uIRadioButtons0.isFocusable();
      UIHLayout uIHLayout0 = new UIHLayout(3216);
      uIRadioButtons0.getSelectedItem();
      uIRadioButtons0.getSelectedIndex();
      Vector<UIRadioButtons> vector0 = new Vector<UIRadioButtons>();
      uIHLayout0.getSelectedItem();
      // Undeclared exception!
      try { 
        uIRadioButtons0.keyPressed(3146);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = 505;
      UIHLayout uIHLayout0 = new UIHLayout(505);
      boolean boolean0 = false;
      int int1 = 2323;
      uIHLayout0.height = 2323;
      // Undeclared exception!
      try { 
        uIHLayout0.setDirty(false);
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
      String[] stringArray0 = new String[0];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setSelectedIndex(3216);
      uIRadioButtons0.isFocusable();
      UIHLayout uIHLayout0 = new UIHLayout(3216);
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("", false);
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
      UIVLayout uIVLayout0 = new UIVLayout(18, 18);
      UIGauge uIGauge0 = new UIGauge((String) null, false, 44, 3630);
      uIVLayout0.setSelectedItem(uIGauge0);
      assertTrue(uIVLayout0.isGroup());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[0];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      int int0 = uIRadioButtons0.getSelectedIndex();
      assertEquals((-1), int0);
      
      boolean boolean0 = uIRadioButtons0.isGroup();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "BR[";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setHeight((-895));
      int int0 = (-1911);
      uIRadioButtons0.traverseFocusable((-1911), false);
      String string0 = "";
      String[] stringArray1 = new String[5];
      stringArray1[0] = "";
      stringArray1[1] = "";
      stringArray1[2] = "BR[";
      stringArray1[3] = "";
      stringArray1[4] = "BR[";
      Image[] imageArray0 = new Image[6];
      Image.createImage(102, 0);
      imageArray0[0] = null;
      Image.createRGBImage((int[]) null, (-895), (-895), true);
      imageArray0[1] = null;
      Image.createImage(2350, 1059);
      imageArray0[2] = null;
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-3);
      Image.createImage(byteArray0, 0, (-895));
      imageArray0[3] = null;
      Image.createRGBImage((int[]) null, 0, 102, true);
      imageArray0[4] = null;
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("@{,kGrMBKFvdqGM,B", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "form";
      stringArray0[1] = "Pr 7";
      stringArray0[2] = "_h<<S\"w_<>EuV";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "k(A1OLu$Yap$_Eq7";
      stringArray0[6] = "FO";
      stringArray0[7] = "y$j?;cq/7XO|";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setFg_color(0);
      uIRadioButtons0.setHeight((-380));
      // Undeclared exception!
      try { 
        uIRadioButtons0.traverseFocusable(832, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 832
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = 1;
      UIVLayout uIVLayout0 = new UIVLayout(1, 818);
      uIVLayout0.setGradientSelectedColor(818);
      uIVLayout0.selected = false;
      // Undeclared exception!
      try { 
        uIVLayout0.setBg_color(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = 35;
      UIVLayout uIVLayout0 = new UIVLayout(35, 35);
      // Undeclared exception!
      try { 
        uIVLayout0.keyPressed(35);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Fk%<He>jo,DA";
      stringArray0[1] = "aw=gcB";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setBg_color(0);
      assertEquals(0, uIRadioButtons0.getBg_color());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = 3207;
      UIVLayout uIVLayout0 = new UIVLayout(3207, 3207);
      // Undeclared exception!
      try { 
        uIVLayout0.keyPressed(3207);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = " <FIRE>";
      stringArray0[1] = "g<o";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "[|Ak#jD%:Z*JZmEI";
      stringArray0[5] = "m!r&[Dd21SHZ";
      stringArray0[6] = "$%V*99D<3^,";
      stringArray0[7] = "NICKNAME";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setDirty(false);
      assertTrue(uIRadioButtons0.isGroup());
      assertEquals((-1), uIRadioButtons0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[0];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.height = (-1047);
      // Undeclared exception!
      try { 
        uIRadioButtons0.drawSegmentedBorder((Graphics) null, 1653, (-1047));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(37);
      uIHLayout0.setGradientSelectedColor(31);
      // Undeclared exception!
      try { 
        uIHLayout0.isFocusable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "bO'%k~f!VB";
      stringArray0[1] = "plH=4!=b/~Z7$LFT1-";
      stringArray0[2] = "f<-";
      stringArray0[3] = "Csi/";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setSelectedIndex((-1));
      boolean boolean0 = uIRadioButtons0.isFocusable();
      assertTrue(uIRadioButtons0.isGroup());
      assertEquals((-1), uIRadioButtons0.getSelectedIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "61Dx:pIT";
      stringArray0[2] = "";
      stringArray0[3] = "#DX#n";
      stringArray0[4] = "4wP3:~";
      stringArray0[5] = "Sfuq`.y";
      stringArray0[6] = "";
      stringArray0[7] = "";
      stringArray0[8] = "+)EdTEmep";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.getItem(0);
      uIRadioButtons0.setWidth(3922);
      uIRadioButtons0.traverseFocusable(0, true);
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "get";
      stringArray0[1] = "t}Xb009_FSu";
      stringArray0[2] = "";
      stringArray0[3] = "pEj<=]|t>+'@mcs";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      int int0 = uIRadioButtons0.traverseFocusable((-349), true);
      assertEquals(0, int0);
      assertEquals((-1), uIRadioButtons0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "UD $JBB(^q";
      stringArray0[1] = "";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.selectedIndex = 0;
      int int0 = 3013;
      // Undeclared exception!
      try { 
        uIRadioButtons0.getItem(3013);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3013
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "reported";
      String string0 = "(k!_`SW";
      stringArray0[2] = "(k!_`SW";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.getSelectedIndex();
      uIRadioButtons0.setScreen((UIScreen) null);
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = 0;
      UIHLayout uIHLayout0 = new UIHLayout(0);
      boolean boolean0 = false;
      uIHLayout0.setGroup(false);
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
  public void test35()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 0);
      uIVLayout0.setSelected(false);
      uIVLayout0.isDirty();
      UIHLayout uIHLayout0 = new UIHLayout(0);
      uIHLayout0.setStatus(uIVLayout0);
      // Undeclared exception!
      try { 
        uIVLayout0.insert(uIHLayout0, 32, 32, 972);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "@hw6Jf_g4f6@~#5.a";
      stringArray0[2] = "ea";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "OZ.~h=/pM";
      stringArray0[7] = "rml:[2,9y\"";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.bg_color = 0;
      uIRadioButtons0.setSelected(true);
      uIRadioButtons0.getSelectedIndex();
      boolean boolean0 = uIRadioButtons0.isDirty();
      assertTrue(uIRadioButtons0.isSelected());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(8, 8);
      // Undeclared exception!
      try { 
        uIVLayout0.setSelected(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = 38;
      UIVLayout uIVLayout0 = new UIVLayout(38, 0);
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
  public void test39()  throws Throwable  {
      int int0 = 0;
      UIHLayout uIHLayout0 = new UIHLayout(0);
      String string0 = "";
      UICheckbox uICheckbox0 = new UICheckbox("");
      Graphics graphics0 = null;
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
  public void test40()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(0, 2241399);
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
  public void test41()  throws Throwable  {
      int int0 = 3207;
      int int1 = 1310;
      UIVLayout uIVLayout0 = new UIVLayout(3207, 1310);
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
  public void test42()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(24, 24);
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.getSelectedItem();
      uIVLayout0.getScreen();
      uIVLayout0.setScreen((UIScreen) null);
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
  public void test43()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(99, 99);
      uIVLayout0.setSelectedColor(0);
      uIVLayout0.setSelectedIndex(99);
      uIVLayout0.selected = false;
      uIVLayout0.setWidth(99);
      uIVLayout0.getSelectedItem();
      // Undeclared exception!
      try { 
        uIVLayout0.getItem(3554);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3554
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(6);
      uIHLayout0.selected = true;
      uIHLayout0.fg_color = (-1228);
      uIHLayout0.setFocusable(true);
      uIHLayout0.setSelectedIndex((-5054));
      uIHLayout0.isGroup();
      String[] stringArray0 = new String[0];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setSelectedIndex((-533));
      uIHLayout0.getSelectedItem();
      // Undeclared exception!
      try { 
        uIHLayout0.traverseFocusable((-423), true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "$TLCZWv%sg\"Cf[?q[<f";
      stringArray0[1] = "$TLCZWv%sg\"Cf[?q[<f";
      stringArray0[2] = "$TLCZWv%sg\"Cf[?q[<f";
      stringArray0[4] = "$TLCZWv%sg\"Cf[?q[<f";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.traverseFocusable(0, false);
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("$TLCZWv%sg\"Cf[?q[<f", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[2] = "";
      stringArray0[1] = "HCjt_3*|21S";
      stringArray0[2] = "Ng";
      stringArray0[3] = "resource";
      stringArray0[4] = "/emo/15.png";
      stringArray0[1] = "";
      stringArray0[6] = "u71>mLV";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setSelected(true);
      uIRadioButtons0.setType(1076);
      uIRadioButtons0.setDirty(true);
      uIRadioButtons0.setBg_color((-1750));
      UIRadioButtons uIRadioButtons1 = (UIRadioButtons)uIRadioButtons0.getSelectedItem();
      uIRadioButtons1.getSelectedIndex();
      uIRadioButtons0.selectedColor = (-1);
      uIRadioButtons1.setSelected(false);
      assertEquals((-1750), uIRadioButtons0.getBg_color());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String[] stringArray0 = new String[11];
      stringArray0[0] = "u+nM@8";
      stringArray0[3] = "";
      stringArray0[4] = "muc#roomconfig_allowinvites";
      stringArray0[6] = "GjOUF&\rvD[awoWt";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      int int0 = (-122);
      uIRadioButtons0.setFg_color((-122));
      int int1 = UILayout.CONSTRAINT_PIXELS;
      uIRadioButtons0.setBg_color(0);
      uIRadioButtons0.setFg_color(0);
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
  public void test48()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "u+nM@8";
      stringArray0[1] = "";
      stringArray0[4] = "muc#roomconfig_allowinvites";
      stringArray0[6] = "GjOUF&\rvD[awoWt";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      int int0 = UILayout.CONSTRAINT_PIXELS;
      uIRadioButtons0.setFg_color(0);
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
  public void test49()  throws Throwable  {
      String[] stringArray0 = new String[9];
      String string0 = "KW^/4";
      stringArray0[0] = "KW^/4";
      stringArray0[2] = "Ov";
      stringArray0[3] = "(:+ZR";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      stringArray0[8] = "KW^/4";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("o@Y.0]>|VeV6R@2tNmw", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      int int0 = 29;
      UIVLayout uIVLayout0 = new UIVLayout(29, (-1238));
      uIVLayout0.selected = true;
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
  public void test51()  throws Throwable  {
      int int0 = 60;
      int int1 = (-1238);
      UIItem[] uIItemArray0 = new UIItem[4];
      String string0 = "i_`";
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("urn:xmpp:delay", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(11);
      String[] stringArray0 = new String[3];
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setSelectedIndex((-788));
      boolean boolean0 = uIRadioButtons0.isFocusable();
      assertTrue(boolean0);
      assertEquals((-1), uIRadioButtons0.getSelectedIndex());
      assertTrue(uIRadioButtons0.isGroup());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(24, 24);
      UIAccordion uIAccordion0 = new UIAccordion();
      uIVLayout0.setSelectedItem(uIAccordion0);
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
  public void test54()  throws Throwable  {
      UIVLayout uIVLayout0 = new UIVLayout(24, 24);
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.getOpenedLabel();
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
  public void test55()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "form";
      stringArray0[1] = "Pr 7";
      stringArray0[6] = "_h<<S\"w_<>EuV";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "k(A1OLu$Yap$_Eq7";
      stringArray0[6] = "FO";
      stringArray0[7] = "y$j?;cq/7XO|";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      uIRadioButtons0.setFg_color(0);
      uIRadioButtons0.setHeight((-380));
      UIButton uIButton0 = new UIButton("");
      boolean boolean0 = uIRadioButtons0.contains(uIButton0);
      assertFalse(boolean0);
      
      int int0 = uIRadioButtons0.traverseFocusable(832, true);
      assertTrue(uIRadioButtons0.isGroup());
      assertEquals((-1), int0);
      assertEquals((-1), uIRadioButtons0.getSelectedIndex());
  }
}
