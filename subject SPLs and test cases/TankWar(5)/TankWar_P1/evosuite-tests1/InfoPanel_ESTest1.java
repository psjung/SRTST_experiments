/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 20:30:51 KST 2016
 */


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.beans.PropertyChangeListener;

import javax.swing.DebugGraphics;
import javax.swing.plaf.metal.MetalComboBoxUI;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class InfoPanel_ESTest1  {
	
	@BeforeClass
	public static void initEvoSuiteFramework() { 
		
	}
	@AfterClass
	public static void exitEvoSuiteFramework() { 
		
	}
  @Test
  public void test0()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      maler0.status = 3;
      InfoPanel infoPanel0 = new InfoPanel(maler0);
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      MetalComboBoxUI.MetalPropertyChangeListener metalComboBoxUI_MetalPropertyChangeListener0 = (MetalComboBoxUI.MetalPropertyChangeListener)metalComboBoxUI0.createPropertyChangeListener();
      infoPanel0.addPropertyChangeListener((PropertyChangeListener) metalComboBoxUI_MetalPropertyChangeListener0);
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        infoPanel0.paint(debugGraphics0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // InfoPanel cannot be cast to javax.swing.JComboBox
         //
         assertThrownBy("javax.swing.plaf.basic.BasicComboBoxUI$Handler", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      maler0.status = 3;
      InfoPanel infoPanel0 = new InfoPanel(maler0);
      DebugGraphics debugGraphics0 = new DebugGraphics();
      infoPanel0.paint(debugGraphics0);
      assertEquals(100, infoPanel0.getWidth());
      assertEquals(50, infoPanel0.getHeight());
  }

  @Test
  public void test2()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      maler0.status = 2;
      InfoPanel infoPanel0 = new InfoPanel(maler0);
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        infoPanel0.paint(debugGraphics0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("javax.swing.DebugGraphics", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      InfoPanel infoPanel0 = new InfoPanel(maler0);
      DebugGraphics debugGraphics0 = new DebugGraphics();
      infoPanel0.paint(debugGraphics0);
      assertEquals(50, infoPanel0.getHeight());
      assertEquals(100, infoPanel0.getWidth());
  }

  @Test
  public void test4()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      maler0.status = 1;
      InfoPanel infoPanel0 = new InfoPanel(maler0);
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        infoPanel0.paint(debugGraphics0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("javax.swing.DebugGraphics", e);
      }
  }
}
