/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 13:15:31 KST 2018
 */

package it.yup.screens;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.screens.ScreenSaver;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ScreenSaver_ESTest3 extends ScreenSaver_ESTest_scaffolding3 {
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
      List list0 = new List("", 0);
      ScreenSaver screenSaver0 = new ScreenSaver(list0);
      screenSaver0.paint((Graphics) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      List list0 = new List("", 0);
      ScreenSaver screenSaver0 = new ScreenSaver(list0);
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
  public void test2()  throws Throwable  {
      List list0 = new List("", 0);
      ScreenSaver screenSaver0 = new ScreenSaver(list0);
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
}
