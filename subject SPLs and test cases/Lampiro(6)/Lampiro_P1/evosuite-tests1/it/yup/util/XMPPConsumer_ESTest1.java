/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 01:35:11 KST 2018
 */

package it.yup.util;

import org.evosuite.runtime.EvoRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class XMPPConsumer_ESTest1 extends XMPPConsumer_ESTest_scaffolding1 {
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
      xMPPConsumer0.gotMessage("", 0);
      //  // Unstable assertion: assertFalse(xMPPConsumer0.isDaemon());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XMPPConsumer xMPPConsumer0 = new XMPPConsumer();
      xMPPConsumer0.gotMessage("", 0);
      //  // Unstable assertion: assertFalse(xMPPConsumer0.isDaemon());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XMPPConsumer xMPPConsumer0 = XMPPConsumer.getConsumer();
      xMPPConsumer0.setExiting();
      //  // Unstable assertion: assertFalse(xMPPConsumer0.isDaemon());
  }
}
