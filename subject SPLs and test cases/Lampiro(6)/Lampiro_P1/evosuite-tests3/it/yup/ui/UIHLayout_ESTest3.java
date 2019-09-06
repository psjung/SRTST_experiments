/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 13:39:53 KST 2018
 */

package it.yup.ui;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.ui.UIHLayout;
import it.yup.ui.UIItem;
import it.yup.ui.UISeparator;
import javax.microedition.lcdui.Graphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIHLayout_ESTest3 extends UIHLayout_ESTest_scaffolding3 {
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
      UIHLayout uIHLayout0 = new UIHLayout(0);
      // Undeclared exception!
      try { 
        uIHLayout0.paint((Graphics) null, 0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIHLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(1);
      UISeparator uISeparator0 = new UISeparator(0, 0);
      uIHLayout0.insert(uISeparator0, 0, 0, 1);
      assertEquals(1, uISeparator0.getType());
      assertEquals(0, uISeparator0.getLayoutWidth());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(2);
      UISeparator uISeparator0 = new UISeparator(0, 0);
      uIHLayout0.insert(uISeparator0, 0, 1, 0);
      assertEquals(1, uISeparator0.getLayoutWidth());
      assertEquals(0, uISeparator0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(0);
      // Undeclared exception!
      try { 
        uIHLayout0.insert(uIHLayout0, 1, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("it.yup.ui.UIHLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(0);
      // Undeclared exception!
      try { 
        uIHLayout0.paint((Graphics) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIHLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(1);
      // Undeclared exception!
      try { 
        uIHLayout0.insert(uIHLayout0, 0, 0, 0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(101);
      // Undeclared exception!
      try { 
        uIHLayout0.insert((UIItem) null, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIHLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UIHLayout uIHLayout0 = null;
      try {
        uIHLayout0 = new UIHLayout((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UILayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(0);
      int int0 = uIHLayout0.getHeight((Graphics) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      UIHLayout uIHLayout0 = new UIHLayout(1);
      // Undeclared exception!
      try { 
        uIHLayout0.getHeight((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIHLayout", e);
      }
  }
}