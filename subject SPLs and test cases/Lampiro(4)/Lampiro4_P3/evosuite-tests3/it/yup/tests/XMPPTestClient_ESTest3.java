/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 13:20:49 KST 2018
 */

package it.yup.tests;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.tests.XMPPTestClient;
import it.yup.xml.Element;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class XMPPTestClient_ESTest3 extends XMPPTestClient_ESTest_scaffolding3 {
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
      xMPPTestClient_Listener0.gotStreamEvent("", "");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XMPPTestClient xMPPTestClient0 = new XMPPTestClient();
      XMPPTestClient.Listener xMPPTestClient_Listener0 = xMPPTestClient0.new Listener();
      xMPPTestClient_Listener0.gotStreamEvent("l", xMPPTestClient0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XMPPTestClient xMPPTestClient0 = new XMPPTestClient();
      Element element0 = new Element("", "");
      XMPPTestClient.Echoer xMPPTestClient_Echoer0 = xMPPTestClient0.new Echoer();
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