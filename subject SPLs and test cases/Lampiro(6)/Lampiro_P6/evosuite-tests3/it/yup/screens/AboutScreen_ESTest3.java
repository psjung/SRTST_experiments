/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 13:12:53 KST 2018
 */

package it.yup.screens;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.screens.AboutScreen;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Graphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class AboutScreen_ESTest3 extends AboutScreen_ESTest_scaffolding3 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AboutScreen aboutScreen0 = new AboutScreen();
      // Undeclared exception!
      try { 
        aboutScreen0.paint((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.screens.AboutScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AboutScreen aboutScreen0 = new AboutScreen();
      aboutScreen0.commandAction((Command) null, aboutScreen0);
  }
}
