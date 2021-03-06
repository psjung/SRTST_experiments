/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 11:37:58 KST 2018
 */

package it.yup.ui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.time.chrono.MinguoDate;
import java.util.Vector;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIUtils_ESTest2 extends UIUtils_ESTest_scaffolding2 {
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
      UIUtils.colorize(512, 512);
      int[] intArray0 = new int[9];
      intArray0[0] = 85857817;
      intArray0[1] = 512;
      intArray0[2] = 85857817;
      intArray0[3] = 85857817;
      intArray0[4] = 512;
      intArray0[5] = 85857817;
      intArray0[7] = 0;
      intArray0[8] = 85857817;
      UIUtils.rescalaArray(intArray0, intArray0, 0, (-125), 1, 512, 0, 85857817, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      uITextPanel0.needScrollbar = true;
      uITextPanel0.selectedIdx = 112;
      UIUtils.easyMenu("", (-725), (-725), 1840, (UIItem) uITextPanel0, "", "");
      int[] intArray0 = new int[4];
      intArray0[0] = 112;
      intArray0[1] = 112;
      intArray0[2] = 112;
      intArray0[3] = 112;
      int[] intArray1 = new int[3];
      intArray1[0] = 112;
      intArray1[1] = 112;
      intArray1[2] = 65;
      // Undeclared exception!
      try { 
        UIUtils.rescalaArray(intArray0, intArray1, 213, 65, 1840, 112, 65, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 65
         //
         verifyException("it.yup.ui.UIUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UIUtils uIUtils0 = new UIUtils();
      UIUtils.colorize(0, 1226);
      UIUtils.colorize(101, 1226);
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.getOpenedLabel();
      UIUtils.easyMenu((String) null, (-1504), 52, 0, (UIItem) null, "X@Z.>G!bEGy=", "KEs6se^(PWK#<");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UIUtils.medColor(53, 16481280);
      int[] intArray0 = new int[5];
      intArray0[0] = 16481280;
      intArray0[1] = 16481280;
      intArray0[2] = 16481280;
      intArray0[3] = 8207898;
      intArray0[4] = 16481280;
      int int0 = 797;
      // Undeclared exception!
      try { 
        UIUtils.rescalaArray(intArray0, intArray0, 16481280, 797, 797, 52224, 0, 0, 53);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20679
         //
         verifyException("it.yup.ui.UIUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UIUtils uIUtils0 = new UIUtils();
      int int0 = 0;
      UIUtils.medColor(0, 0);
      String string0 = "";
      int int1 = 104;
      int int2 = 0;
      String string1 = "posS|V}_W";
      UICombobox uICombobox0 = null;
      try {
        uICombobox0 = new UICombobox("posS|V}_W", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.getOpenedLabel();
      UIMenu uIMenu0 = UIUtils.easyMenu((String) null, 0, 0, 0, (UIItem) null);
      // Undeclared exception!
      try { 
        uIMenu0.paint((Graphics) null, 668, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UIUtils uIUtils0 = new UIUtils();
      int[] intArray0 = new int[4];
      intArray0[0] = (-1291);
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 48;
      int int0 = 0;
      UIUtils.rescalaArray(intArray0, intArray0, 0, 397, 272, (-1291), 0, 0, 0);
      int int1 = 0;
      int int2 = (-2714);
      UIUtils.rescalaArray(intArray0, intArray0, intArray0[3], intArray0[2], int0, int1, intArray0[1], int2, intArray0[2]);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 103;
      intArray0[3] = 11327682;
      // Undeclared exception!
      UIUtils.rescalaArray(intArray0, intArray0, 0, 0, 0, 11327682, 2759, 1027, 103);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator((-643));
      UILabel uILabel0 = new UILabel("kU{mN)%h3@!6b[fni");
      uISeparator0.setStatus(uILabel0);
      UIMenu uIMenu0 = UIUtils.easyMenu((String) null, 0, (-1813), (-1231), (UIItem) uISeparator0, (String) null, (String) null);
      UIUtils.easyMenu((String) null, (-643), 0, 0, (UIItem) uILabel0);
      UIUtils.easyMenu("", (-4313), (-1231), 2, (UIItem) uIMenu0, "c'i", "SELECT");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator((-1709), 0);
      int[] intArray0 = new int[7];
      intArray0[0] = (-1709);
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = (-1709);
      uISeparator0.setGradientSelectedColor((-2696));
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = (-1709);
      uISeparator0.coors = intArray0;
      uISeparator0.setFg_color((-479));
      uISeparator0.setGradientSelectedColor(2459);
      uISeparator0.bg_color = 3423;
      UIUtils.easyMenu("", (-1709), 0, 0, (UIItem) uISeparator0, "", (String) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UIUtils.colorize(921, 0);
      UIUtils uIUtils0 = new UIUtils();
      UIAccordion uIAccordion0 = new UIAccordion();
      UIItem uIItem0 = uIAccordion0.getSelectedItem();
      UIUtils.easyCenterLayout(uIItem0, 921);
      UIUtils.colorize((-482), 921);
      UIUtils.easyMenu("", 921, 116, 0, (UIItem) uIAccordion0, "", "");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 35;
      intArray0[0] = 35;
      UIUtils.rescalaArray(intArray0, intArray0, 35, 2732, (-333), 2732, 35, 35, 16);
      String string0 = "";
      int int1 = 3231;
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
  public void test12()  throws Throwable  {
      UIUtils uIUtils0 = new UIUtils();
      String string0 = "6q1s#]\"Sje`ChO2";
      int int0 = 13;
      UILabel uILabel0 = new UILabel("=:JW");
      UIItem uIItem0 = uILabel0.getSelectedItem();
      // Undeclared exception!
      try { 
        UIUtils.easyMenu("6q1s#]\"Sje`ChO2", 50, 13, 13, uIItem0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UIUtils uIUtils0 = new UIUtils();
      int[] intArray0 = new int[6];
      intArray0[0] = (-2198);
      intArray0[1] = 9;
      intArray0[2] = 0;
      intArray0[3] = 2034;
      intArray0[4] = (-4001);
      intArray0[5] = (-2001);
      UIUtils.rescalaArray(intArray0, intArray0, 2034, 16711680, 0, 2034, 0, 9, 2034);
      assertArrayEquals(new int[] {(-2198), 9, 0, 2034, (-4001), (-2001)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UIUtils.medColor(120, 120);
      UIUtils.colorize(120, 105);
      int[] intArray0 = new int[9];
      intArray0[0] = 105;
      intArray0[1] = 2853;
      intArray0[2] = 105;
      intArray0[3] = 17566725;
      intArray0[4] = 57;
      intArray0[5] = 120;
      intArray0[6] = 120;
      intArray0[7] = 105;
      intArray0[8] = 120;
      // Undeclared exception!
      try { 
        UIUtils.rescalaArray(intArray0, intArray0, 17566725, 106, 120, 951, 57, 105, 106);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11187
         //
         verifyException("it.yup.ui.UIUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(true, true);
      UIItem uIItem0 = uIPanel0.getSelectedItem();
      UIMenu uIMenu0 = UIUtils.easyMenu((String) null, (-1614), 0, (-1674), uIItem0, "+:J}b3}Mtg@`',~dg", "x");
      // Undeclared exception!
      try { 
        UIUtils.easyMenu("12,", (-1040), (-1040), (-1614), (UIItem) uIMenu0, "12,", "x");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel();
      UIUtils.easyMenu("", 95, 269, 269, (UIItem) uIPanel0);
      // Undeclared exception!
      try { 
        UIUtils.easyMenu("SELECT", 560, 269, 560, (UIItem) uIPanel0, "SELECT", "!B<45<xK");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UIUtils uIUtils0 = new UIUtils();
      UITextPanel uITextPanel0 = new UITextPanel();
      UIItem uIItem0 = uITextPanel0.getSelectedItem();
      // Undeclared exception!
      try { 
        UIUtils.easyMenu("0}e)?0", (-1141), (-1141), (-1141), uIItem0, "0}e)?0", "http://jabber.org/protocol/muc#user");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UIUtils uIUtils0 = new UIUtils();
      int int0 = UIUtils.colorize(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UIUtils.rescalaArray((int[]) null, (int[]) null, 0, 0, (-1622), 0, (-1738), 0, (-4603));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = (-3422);
      intArray0[0] = (-3422);
      intArray0[1] = 109;
      int int1 = (-2823);
      intArray0[2] = (-2823);
      intArray0[3] = (-257);
      intArray0[4] = 56;
      int int2 = (-4638);
      intArray0[5] = (-4638);
      intArray0[6] = 0;
      intArray0[7] = 0;
      int int3 = 1319;
      int int4 = 5000;
      int int5 = (-4002);
      UIUtils.rescalaArray(intArray0, intArray0, 1319, 56, 5000, (-257), (-257), (-4002), (-257));
      UIUtils.colorize(109, 109);
      UIItem uIItem0 = null;
      int int6 = 48;
      // Undeclared exception!
      try { 
        UIUtils.easyCenterLayout((UIItem) null, 48);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIHLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[0];
      UIUtils.rescalaArray(intArray0, intArray0, (-1795), 0, 0, (-1795), 612, 0, 2540);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UIUtils uIUtils0 = new UIUtils();
      // Undeclared exception!
      try { 
        UIUtils.rescalaArray((int[]) null, (int[]) null, 0, 0, 104, 111, 883, 0, 111);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UIUtils uIUtils0 = new UIUtils();
      UILabel uILabel0 = new UILabel(", ");
      UILabel uILabel1 = (UILabel)uILabel0.getSelectedItem();
      uILabel0.setImgAnchorPoint(3);
      UIUtils.easyCenterLayout(uILabel1, (-1207));
      assertEquals(1, uILabel1.getAnchorPoint());
      
      UIUtils.medColor((-1207), (-1207));
      int int0 = UIUtils.colorize(981, (-1207));
      assertEquals((-10805), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = UIUtils.colorize(333, 333);
      assertEquals(55857309, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      Image image0 = uIAccordion0.openImage;
      Image.createImage((Image) null, 0, (-1233), (-1233), 0, 742);
      // Undeclared exception!
      try { 
        UIUtils.imageResize((Image) null, 97, 97);
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
      UILabel uILabel0 = new UILabel("e*5Y(KtG#2V");
      UIHLayout uIHLayout0 = UIUtils.easyCenterLayout(uILabel0, 0);
      assertEquals(1, uILabel0.getAnchorPoint());
      assertFalse(uIHLayout0.isGroup());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UIUtils uIUtils0 = new UIUtils();
      int int0 = UIUtils.medColor(11584200, 97);
      assertEquals(5792148, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UIAccordion uIAccordion0 = new UIAccordion();
      Image image0 = uIAccordion0.closeImage;
      // Undeclared exception!
      try { 
        UIUtils.imageResize((Image) null, (-2779), 118);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UILabel uILabel0 = new UILabel(", ");
      UIItem uIItem0 = uILabel0.getSelectedItem();
      uILabel0.setImgAnchorPoint(3);
      UIHLayout uIHLayout0 = UIUtils.easyCenterLayout(uIItem0, (-1207));
      assertFalse(uIHLayout0.isGroup());
      
      int int0 = UIUtils.colorize(981, (-1207));
      assertEquals((-10805), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator((-1685));
      uISeparator0.setGradientSelectedColor((-2696));
      uISeparator0.setFg_color((-479));
      uISeparator0.bg_color = 3437;
      UIMenu uIMenu0 = UIUtils.easyMenu("", (-1685), 0, 0, (UIItem) uISeparator0, "", (String) null);
      assertEquals((-1), uIMenu0.getWidth());
      
      int int0 = UIUtils.colorize((-1685), 59);
      assertEquals(16776386, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UIPanel uIPanel0 = new UIPanel(false, false);
      uIPanel0.dirty = true;
      UIItem uIItem0 = uIPanel0.getSelectedItem();
      UIMenu uIMenu0 = UIUtils.easyMenu("", 955, 1000, 51, uIItem0);
      Vector<MinguoDate> vector0 = new Vector<MinguoDate>();
      uIMenu0.itemList = vector0;
      uIPanel0.setWidth(95);
      vector0.add((MinguoDate) null);
      UIUtils.colorize(1475, 113);
      // Undeclared exception!
      try { 
        UIUtils.imageResize((Image) null, 65280, 113);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[2] = 4;
      intArray0[3] = (-2235);
      intArray0[5] = (-804);
      intArray0[6] = 110;
      UIUtils.rescalaArray(intArray0, intArray0, (-804), 0, (-2235), 110, 756, (-2235), 756);
      UIUtils.medColor(0, 226);
      UIUtils.colorize(1294, (-804));
      UITextPanel uITextPanel0 = new UITextPanel();
      UIItem uIItem0 = uITextPanel0.getSelectedItem();
      // Undeclared exception!
      try { 
        uIItem0.keyPressed(0);
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
      String[] stringArray0 = new String[2];
      stringArray0[0] = "A~26>";
      stringArray0[1] = "invalid maxValue for non interactive mode";
      UIRadioButtons uIRadioButtons0 = new UIRadioButtons(stringArray0);
      UIUtils.easyCenterLayout(uIRadioButtons0, 14);
      assertEquals(14, uIRadioButtons0.getLayoutWidth());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UIUtils uIUtils0 = new UIUtils();
      int[] intArray0 = new int[4];
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 78;
      int int0 = 397;
      UIUtils.rescalaArray(intArray0, intArray0, 0, 397, 272, 0, 0, 0, 0);
      int int1 = 0;
      int int2 = (-2714);
      UIUtils.rescalaArray(intArray0, intArray0, intArray0[3], intArray0[2], int0, int1, intArray0[1], int2, intArray0[2]);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = (-2151);
      UIUtils.colorize((-2151), (-2151));
      int[] intArray0 = new int[7];
      intArray0[0] = (-344053058);
      intArray0[0] = (-344053058);
      intArray0[3] = (-2151);
      UIUtils.rescalaArray(intArray0, intArray0, 0, 0, (-2437), (-2437), (-2151), (-2151), (-2437));
      UIUtils.medColor((-2437), 0);
      UIAccordion uIAccordion0 = new UIAccordion();
      uIAccordion0.width = 75;
      uIAccordion0.getOpenedLabel();
      UIUtils.easyMenu("", 0, 100, (-2151), (UIItem) null, "", "");
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)114;
      byteArray0[2] = (byte)76;
      byteArray0[3] = (byte)91;
      byteArray0[4] = (byte)111;
      Image.createImage(byteArray0, (-1446), 8354621);
      // Undeclared exception!
      try { 
        UIUtils.imageResize((Image) null, (-10), 100);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIUtils", e);
      }
  }
}
