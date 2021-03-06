/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 00:38:28 KST 2018
 */

package it.yup.tests;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xml.Element;
import static org.evosuite.runtime.EvoAssertions.*;
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class XMPPTestClient_ESTest1 extends XMPPTestClient_ESTest_scaffolding1 {
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
      XMPPTestClient xMPPTestClient0 = new XMPPTestClient();
      XMPPTestClient.Listener xMPPTestClient_Listener0 = xMPPTestClient0.new Listener();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XMPPTestClient xMPPTestClient0 = new XMPPTestClient();
      XMPPTestClient.Listener xMPPTestClient_Listener0 = xMPPTestClient0.listener;
      Object object0 = new Object();
      xMPPTestClient_Listener0.gotStreamEvent("D.i#}", object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XMPPTestClient xMPPTestClient0 = new XMPPTestClient();
      XMPPTestClient.Listener xMPPTestClient_Listener0 = xMPPTestClient0.listener;
      xMPPTestClient_Listener0.gotStreamEvent("", xMPPTestClient0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XMPPTestClient xMPPTestClient0 = new XMPPTestClient();
      XMPPTestClient.Echoer xMPPTestClient_Echoer0 = xMPPTestClient0.new Echoer();
      Element element0 = new Element("", "");
      // Undeclared exception!
      try { 
        xMPPTestClient_Echoer0.packetReceived(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.tests.XMPPTestClient$Echoer", e);
      }
  }
}
