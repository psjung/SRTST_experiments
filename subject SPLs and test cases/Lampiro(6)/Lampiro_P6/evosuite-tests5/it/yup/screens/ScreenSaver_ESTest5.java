/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 17:16:05 KST 2018
 */

package it.yup.screens;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.screens.ScreenSaver;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.TextBox;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ScreenSaver_ESTest5 extends ScreenSaver_ESTest_scaffolding5 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Form form0 = new Form("");
      ScreenSaver screenSaver0 = new ScreenSaver(form0);
      screenSaver0.paint((Graphics) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TextBox textBox0 = new TextBox("", "", 0, 0);
      ScreenSaver screenSaver0 = new ScreenSaver(textBox0);
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
      Form form0 = new Form("");
      ScreenSaver screenSaver0 = new ScreenSaver(form0);
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
