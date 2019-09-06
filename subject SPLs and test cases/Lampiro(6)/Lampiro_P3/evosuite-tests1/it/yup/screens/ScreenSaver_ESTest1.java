/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 00:33:50 KST 2018
 */

package it.yup.screens;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;

import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.List;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ScreenSaver_ESTest1 extends ScreenSaver_ESTest_scaffolding1 {
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
      ScreenSaver screenSaver0 = new ScreenSaver((Displayable) null);
      // Undeclared exception!
      try { 
        screenSaver0.keyPressed(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.screens.ScreenSaver", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ScreenSaver screenSaver0 = new ScreenSaver((Displayable) null);
      screenSaver0.showNotify();
      // Undeclared exception!
      try { 
        screenSaver0.paint((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.screens.ScreenSaver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      List list0 = new List("", 0);
      ScreenSaver screenSaver0 = new ScreenSaver(list0);
      screenSaver0.paint((Graphics) null);
  }
}