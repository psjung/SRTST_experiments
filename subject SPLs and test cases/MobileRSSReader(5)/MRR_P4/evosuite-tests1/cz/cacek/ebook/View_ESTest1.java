/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:31:44 KST 2018
 */

package cz.cacek.ebook;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Font;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class View_ESTest1 extends View_ESTest_scaffolding1 {
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
      // Undeclared exception!
      try { 
        view0.getScrollPosition(0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      View.Screen view_Screen0 = new View.Screen(3);
      view_Screen0.rollBw("", 0);
      assertEquals(3, view_Screen0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      View.Screen view_Screen0 = new View.Screen(0);
      // Undeclared exception!
      try { 
        view_Screen0.rollFw("", 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("cz.cacek.ebook.View$Screen", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      View.Screen view_Screen0 = new View.Screen(1);
      view_Screen0.getContent(0);
      assertEquals(1, view_Screen0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      View.Screen view_Screen0 = new View.Screen(6);
      view_Screen0.setContent(0, "");
      assertEquals(6, view_Screen0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Page page0 = new Page("U");
      View view0 = new View(0, 0, 0);
      // Undeclared exception!
      try { 
        view0.setPage(page0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      try { 
        view0.setFont((Font) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      try { 
        view0.prevLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      try { 
        view0.nextLine();
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
        view0.isLastPage();
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      Page page0 = new Page("U");
      View view0 = new View(0, 0, 0);
      view0.page = page0;
      boolean boolean0 = view0.isLastPage();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      int int0 = view0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      int int0 = view0.charWidth(']');
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Page page0 = new Page("");
      try { 
        View.estimateHeight(0, true, 0, 0, page0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Page page0 = new Page("");
      try { 
        View.estimateHeight(0, false, 0, 0, page0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      View view0 = null;
      try {
        view0 = new View(0, 0, 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      View view0 = null;
      try {
        view0 = new View(0, 0, 0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      View.Screen view_Screen0 = new View.Screen(2);
      view_Screen0.rollFw("", 0);
      assertEquals(2, view_Screen0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      Font font0 = view0.getFont();
      assertNull(font0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      View.Screen view_Screen0 = new View.Screen(0);
      view_Screen0.getPosition(0);
      assertEquals(0, view_Screen0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      View.Screen view_Screen0 = new View.Screen(0);
      view_Screen0.setPosition(0, 0);
      assertEquals(0, view_Screen0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      View.Screen view_Screen0 = new View.Screen(0);
      int int0 = view_Screen0.size();
      assertEquals(0, int0);
  }
}
