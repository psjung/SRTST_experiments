/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 11:32:28 KST 2018
 */

package it.yup.ui;

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
public class UISeparator_ESTest2 extends UISeparator_ESTest_scaffolding2 {
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
      UISeparator uISeparator0 = new UISeparator(0, 1);
      // Undeclared exception!
      try { 
        uISeparator0.paint((Graphics) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UISeparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(0);
      // Undeclared exception!
      try { 
        uISeparator0.paint((Graphics) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UISeparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UISeparator uISeparator0 = new UISeparator(0, 0);
      // Undeclared exception!
      try { 
        uISeparator0.paint((Graphics) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UISeparator", e);
      }
  }
}
