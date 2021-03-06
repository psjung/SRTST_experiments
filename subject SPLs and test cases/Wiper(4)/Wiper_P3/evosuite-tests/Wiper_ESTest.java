/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 13 10:07:14 KST 2019
 */


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Wiper_ESTest extends Wiper_ESTest_scaffolding {
	@BeforeClass
	public static void initEvoSuiteFramework() {
	String a = "aa";
	}
	@AfterClass
	public static void exitEvoSuiteFramework() {
	String a = "aa";
	}
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Wiper wiper0 = new Wiper();
      assertFalse(wiper0.getIsSlowWipe());
      
      wiper0.OnSlowWipe();
      boolean boolean0 = wiper0.getIsSlowWipe();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Wiper wiper0 = new Wiper();
      assertFalse(wiper0.getIntervalOn());
      
      wiper0.setIntervalOn();
      boolean boolean0 = wiper0.getIntervalOn();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Wiper wiper0 = new Wiper();
      assertFalse(wiper0.getManualOn());
      
      wiper0.setManualOn();
      boolean boolean0 = wiper0.getManualOn();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Wiper wiper0 = new Wiper();
      wiper0.setPermanantWipe();
      boolean boolean0 = wiper0.getPermanantWipe();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Wiper wiper0 = new Wiper();
      wiper0.setEvent(1);
      assertFalse(wiper0.getIsSlowWipe());
      
      wiper0.run();
      assertTrue(wiper0.getIsSlowWipe());
  }
}
