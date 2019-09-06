/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 10:55:01 KST 2018
 */

package it.yup.screens;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Graphics;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class SplashScreen_ESTest2 extends SplashScreen_ESTest_scaffolding2 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SplashScreen splashScreen0 = new SplashScreen();
      // Undeclared exception!
      try { 
        splashScreen0.paint((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.screens.SplashScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SplashScreen splashScreen0 = new SplashScreen();
      splashScreen0.keyPressed(0);
  }
}