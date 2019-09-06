/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:50:14 KST 2018
 */

package cz.cacek.ebook;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Graphics;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class AbstractView_ESTest5 extends AbstractView_ESTest_scaffolding5 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      assertEquals(16777215, view0.getBackgroundColor());
      
      view0.setColors(0, 1);
      assertEquals(1, view0.getForegroundColor());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      View view0 = null;
      try {
        view0 = new View(1, 0, 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      view0.initView(0, 0, 1);
      assertEquals(16777215, view0.getBackgroundColor());
      assertEquals(0, view0.getForegroundColor());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      View view0 = null;
      try {
        view0 = new View(0, 1, 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      view0.init();
      assertEquals(0, view0.getForegroundColor());
      assertEquals(16777215, view0.getBackgroundColor());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      assertEquals(0, view0.getForegroundColor());
      
      view0.foreground = 1;
      int int0 = view0.getForegroundColor();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      assertEquals(16777215, view0.getBackgroundColor());
      
      view0.background = 0;
      int int0 = view0.getBackgroundColor();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      assertEquals(16777215, view0.getBackgroundColor());
      
      view0.background = (-1);
      int int0 = view0.getBackgroundColor();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      // Undeclared exception!
      try { 
        view0.setPercPosition(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      // Undeclared exception!
      try { 
        view0.setFirst();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      // Undeclared exception!
      try { 
        view0.getPercPosition();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      try { 
        view0.fwdPage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      try { 
        view0.fwdLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      // Undeclared exception!
      try { 
        view0.fillPage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      // Undeclared exception!
      try { 
        view0.emptyPage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      try { 
        view0.bckPage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      try { 
        view0.bckLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      // Undeclared exception!
      try { 
        view0.draw((Graphics) null, 0, 0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.AbstractView", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = AbstractView.getTotalBorderSpace();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      int int0 = view0.getForegroundColor();
      assertEquals(16777215, view0.getBackgroundColor());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = AbstractView.getLineSpace();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      int int0 = view0.getBackgroundColor();
      assertEquals(0, view0.getForegroundColor());
      assertEquals(16777215, int0);
  }
}
