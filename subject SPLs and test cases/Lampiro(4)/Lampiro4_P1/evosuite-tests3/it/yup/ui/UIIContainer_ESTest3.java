/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 13:40:20 KST 2018
 */

package it.yup.ui;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import it.yup.ui.UIItem;
import it.yup.ui.UIPanel;
import it.yup.ui.UITextPanel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UIIContainer_ESTest3 extends UIIContainer_ESTest_scaffolding3 {
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
      UIPanel uIPanel0 = new UIPanel();
      uIPanel0.setSelectedItem(uIPanel0);
      assertEquals((-1), uIPanel0.getSelectedIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UITextPanel uITextPanel0 = new UITextPanel();
      boolean boolean0 = uITextPanel0.contains((UIItem) null);
      assertFalse(boolean0);
  }
}
