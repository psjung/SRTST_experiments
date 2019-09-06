/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:09:10 KST 2018
 */

package it.yup.screens;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ScreenSaver_ESTest6 extends ScreenSaver_ESTest_scaffolding6 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScreenSaver screenSaver0 = new ScreenSaver((Displayable) null);
      screenSaver0.paint((Graphics) null);
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
      Alert alert0 = new Alert((String) null);
      ScreenSaver screenSaver0 = new ScreenSaver(alert0);
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
}