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

  
}
