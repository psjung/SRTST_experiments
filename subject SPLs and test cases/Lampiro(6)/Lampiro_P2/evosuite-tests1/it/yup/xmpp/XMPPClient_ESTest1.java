/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 02:26:54 KST 2018
 */

package it.yup.xmpp;

import static org.junit.Assert.assertArrayEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class XMPPClient_ESTest1 extends XMPPClient_ESTest_scaffolding1 {
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
      String string0 = XMPPClient.getErrorString("?");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = XMPPClient.getErrorString("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = XMPPClient.getTraffic();
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }
}
