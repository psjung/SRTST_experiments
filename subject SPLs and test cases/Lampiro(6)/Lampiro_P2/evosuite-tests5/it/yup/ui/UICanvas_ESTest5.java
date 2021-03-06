/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 19:29:30 KST 2018
 */

package it.yup.ui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.Timer;

import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UICanvas_ESTest5 extends UICanvas_ESTest_scaffolding5 {
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
      UICanvas.setDisplay((Display) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Image image0 = UICanvas.getUIImage("");
      assertNull(image0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        UICanvas.showAlert((AlertType) null, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Timer timer0 = UICanvas.getTimer();
      assertNotNull(timer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Item[] itemArray0 = new Item[9];
      Form form0 = new Form("", itemArray0);
      UICanvas.display(form0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UICanvas.unlock();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UICanvas.lock();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UICanvas.setMenuKeys(0, 0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Undeclared exception!
      try { 
        UICanvas.getInstance();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UICanvas", e);
      }
  }
}
