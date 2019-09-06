/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 21:00:06 KST 2016
 */


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.awt.List;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Maler_ESTest3   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  @Test
  public void test05()  throws Throwable  {
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
        maler0.gameLevel(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Maler$$PC", e);
      }
  }

  
}