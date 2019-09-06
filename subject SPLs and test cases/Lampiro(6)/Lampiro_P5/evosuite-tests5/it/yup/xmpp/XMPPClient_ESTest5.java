/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 19:27:58 KST 2018
 */

package it.yup.xmpp;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import it.yup.xmpp.XMPPClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class XMPPClient_ESTest5 extends XMPPClient_ESTest_scaffolding5 {
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
      String string0 = XMPPClient.getErrorString("403");
      assertEquals("Forbidden", string0);
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
