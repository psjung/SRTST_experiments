/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 11:41:49 KST 2018
 */

package it.yup.util;

import static org.junit.Assert.assertFalse;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class LogConsumer_ESTest2 extends LogConsumer_ESTest_scaffolding2 {
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
      XMPPConsumer xMPPConsumer0 = XMPPConsumer.getConsumer();
      xMPPConsumer0.setExiting();
      assertFalse(xMPPConsumer0.isInterrupted());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XMPPConsumer xMPPConsumer0 = XMPPConsumer.getConsumer();
      xMPPConsumer0.gotMessage("", 0);
      assertFalse(xMPPConsumer0.isInterrupted());
  }
}
