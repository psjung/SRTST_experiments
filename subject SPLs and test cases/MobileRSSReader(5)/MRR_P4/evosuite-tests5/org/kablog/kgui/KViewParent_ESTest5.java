/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 19:12:08 KST 2018
 */

package org.kablog.kgui;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class KViewParent_ESTest5 extends KViewParent_ESTest_scaffolding5 {
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
      KFileSelectorMgr kFileSelectorMgr0 = new KFileSelectorMgr();
      kFileSelectorMgr0.displayDbgMsg("", (AlertType) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KFileSelectorMgr kFileSelectorMgr0 = new KFileSelectorMgr();
      kFileSelectorMgr0.childStatusChanged((KViewChild) null, 0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      KFileSelectorMgr kFileSelectorMgr0 = new KFileSelectorMgr();
      kFileSelectorMgr0.childFinished((KViewChild) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      KFileSelectorMgr kFileSelectorMgr0 = new KFileSelectorMgr();
      kFileSelectorMgr0.addDeferredAction((Runnable) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      KFileSelectorMgr kFileSelectorMgr0 = new KFileSelectorMgr();
      Alert alert0 = new Alert("");
      // Undeclared exception!
      try { 
        kFileSelectorMgr0.reqSetVisible(alert0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.kablog.kgui.KFileSelectorMgr", e);
      }
  }
}
