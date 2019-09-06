/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 04 14:39:10 KST 2016
 */


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.Vector;

import javax.swing.DebugGraphics;
import javax.swing.table.DefaultTableModel;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Maler_ESTest4   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  @Test
  public void test00()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Object[][] objectArray0 = new Object[1][1];
      maler0.infoWidth = 13;
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, objectArray0[0]);
      Vector vector0 = defaultTableModel0.getDataVector();
      // Undeclared exception!
      try { 
        maler0.note(vector0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector cannot be cast to Note
         //
         assertThrownBy("Maler$$Re_fuer_PC", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      maler0.GAME_WIDTH = (-552);
      // Undeclared exception!
      try { 
        maler0.tankErstellen();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Width (-552) and height (0) must be non-zero
         //
         assertThrownBy("java.awt.image.ReplicateScaleFilter", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      maler0.infoWidth = 60;
      maler0.gamesize();
      maler0.tankErstellen();
      assertFalse(maler0.isValid());
  }

  @Test
  public void test03()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      maler0.tk = null;
      // Undeclared exception!
      try { 
        maler0.tankErstellen();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Maler$$PC", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      Vector vector0 = menu0.options;
      // Undeclared exception!
      try { 
        maler0.note(vector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      maler0.tankErstellen();
      Object[][] objectArray0 = new Object[1][1];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, objectArray0[0]);
      Vector vector0 = defaultTableModel0.getDataVector();
      // Undeclared exception!
      try { 
        maler0.note(vector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      // Undeclared exception!
      try { 
        maler0.gameWin();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Maler$$PC", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      // Undeclared exception!
      try { 
        maler0.gameLevel(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Maler$$PC", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      maler0.menu = menu0;
      // Undeclared exception!
      try { 
        maler0.gameLevel(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      maler0.GAME_HEIGHT = 643;
      // Undeclared exception!
      try { 
        maler0.tankErstellen();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Width (0) and height (643) must be non-zero
         //
         assertThrownBy("java.awt.image.ReplicateScaleFilter", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        maler0.print(debugGraphics0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("javax.swing.DebugGraphics", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      maler0.tankErstellen();
      // Undeclared exception!
      try { 
        maler0.gameWin();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      maler0.gamesize();
      // Undeclared exception!
      try { 
        maler0.note((Vector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Maler$$Re_fuer_PC", e);
      }
  }
}
