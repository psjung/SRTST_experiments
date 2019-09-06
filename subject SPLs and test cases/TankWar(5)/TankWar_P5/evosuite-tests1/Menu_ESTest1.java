/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 20:37:02 KST 2016
 */


import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Scrollbar;
import java.io.InputStream;
import java.util.Vector;
import javax.swing.DebugGraphics;
import javax.swing.JComponent;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.awt.HeadlessToolkit;
import sun.awt.image.ToolkitImage;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Menu_ESTest1   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  @Test
  public void test01()  throws Throwable  {
      Menu menu0 = new Menu((Maler) null);
      menu0.logoYK = (-2304);
      menu0.KeyBehandeln(39);
  }

  @Test
  public void test02()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.KeyBehandeln(1639);
  }

  @Test
  public void test03()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, 255);
      menu0.add("", (Image) null, 2382);
      menu0.add("", (Image) null, (Image) null, 39);
  }

  @Test
  public void test04()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, (-3428));
      menu0.add("", 38);
      menu0.add("X=MXz{f>~sd|PZ=h}", (Image) null, (Image) null, 90);
  }

  @Test
  public void test05()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, 2);
      menu0.add("", (Image) null, (Image) null, 2);
  }

  @Test
  public void test06()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, (-3428));
      menu0.add("", 38);
      menu0.add("X=MXz{f>~sd|PZ=h}", (Image) null, (Image) null, 1);
  }

  @Test
  public void test07()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", 38);
      menu0.add("X=MXz{f>~sd|PZ=h}", (Image) null, (Image) null, 90);
      menu0.add("@8Tsu;Un#kOIi", (Image) null, (-767));
  }

  @Test
  public void test08()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", 0);
      menu0.add("enemyBoss21L.png", (Image) null, 0);
      menu0.add("", (Image) null, 1);
  }

  @Test
  public void test09()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, (-3428));
      menu0.add("", 38);
      menu0.add("@8Tsu;Un#kOIi", (Image) null, (-767));
  }

  @Test
  public void test10()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", 0);
      menu0.add("", (Image) null, 2);
      menu0.add("", (-1411));
  }

  @Test
  public void test12()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setZeileAbstand(1);
  }

  @Test
  public void test13()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setKoordinateImage(0, (-1049));
  }

  @Test
  public void test14()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setLogoKoordinate(1, 1);
  }

  @Test
  public void test15()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      // Undeclared exception!
      try { 
        menu0.erscheinen((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      JPopupMenu jPopupMenu0 = new JPopupMenu("'U.O:<+mW3w");
      DebugGraphics debugGraphics0 = new DebugGraphics((Graphics) null, (JComponent) jPopupMenu0);
      // Undeclared exception!
      try { 
        menu0.erscheinen(debugGraphics0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.DebugGraphics cannot be cast to java.awt.Graphics2D
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Menu menu0 = new Menu((Maler) null);
      Vector<InputStream> vector0 = new Vector<InputStream>();
      menu0.options = vector0;
      vector0.add((InputStream) null);
      // Undeclared exception!
      try { 
        menu0.add((String) null, (Image) null, (Image) null, 1315);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      Object[] objectArray0 = new Object[6];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 4);
      Vector vector0 = defaultTableModel0.getDataVector();
      menu0.options = vector0;
      // Undeclared exception!
      try { 
        menu0.add("", (Image) null, (Image) null, 1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector cannot be cast to Option
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      Object[] objectArray0 = new Object[3];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 1758);
      Vector vector0 = defaultTableModel0.getDataVector();
      menu0.options = vector0;
      // Undeclared exception!
      try { 
        menu0.add("enemyBoss21L.png", (Image) null, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector cannot be cast to Option
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      Vector<Scrollbar> vector0 = new Vector<Scrollbar>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, vector0);
      Vector vector1 = defaultTableModel0.getDataVector();
      menu0.options = vector1;
      vector0.add((Scrollbar) null);
      // Undeclared exception!
      try { 
        menu0.add("", 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      Object[] objectArray0 = new Object[3];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 1);
      Vector vector0 = defaultTableModel0.getDataVector();
      menu0.options = vector0;
      // Undeclared exception!
      try { 
        menu0.add("ab0PW//f", (-4803));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector cannot be cast to Option
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", 0);
      menu0.add("", (Image) null, (Image) null, (-3428));
      menu0.add("", 38);
  }

  @Test
  public void test23()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setStyle(1);
  }

  @Test
  public void test24()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.addLogo((Image) null);
  }

  @Test
  public void test25()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, 1);
      menu0.KeyBehandeln(10);
  }

  @Test
  public void test26()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("playerTank02R.png", 0);
      menu0.KeyBehandeln(37);
  }

  @Test
  public void test27()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.KeyBehandeln(37);
  }

  @Test
  public void test28()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.KeyBehandeln(38);
  }

  @Test
  public void test29()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, 1);
      menu0.KeyBehandeln(40);
  }

  @Test
  public void test30()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.KeyBehandeln(10);
  }

  @Test
  public void test32()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("u'G-?'h", (Image) null, (Image) null, 0);
      menu0.add("", (Image) null, 1);
      menu0.KeyBehandeln(40);
  }

  @Test
  public void test33()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setStyle((-3117));
  }

  @Test
  public void test34()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setStyle(2);
  }

  @Test
  public void test35()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setStyle(0);
  }

  @Test
  public void test36()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setFontSize(1393);
  }

  @Test
  public void test37()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setWaehlbar(false);
      // Undeclared exception!
      try { 
        menu0.KeyBehandeln(10);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         assertThrownBy("java.util.Vector", e);
      }
  }

  @Test
  public void test39()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setLogoKoordinate(1, 0);
  }

  @Test
  public void test40()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setKoordinateImage(1, 1);
  }
}
