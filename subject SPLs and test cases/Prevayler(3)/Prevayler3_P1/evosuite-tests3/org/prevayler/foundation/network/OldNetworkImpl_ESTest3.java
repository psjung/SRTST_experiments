/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 17:22:17 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import java.io.EOFException;
import java.io.IOException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class OldNetworkImpl_ESTest3 extends OldNetworkImpl_ESTest_scaffolding3 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void clearEvoSuiteFramework() {
String a = "aa";
}

  @Test
  public void test0()  throws Throwable  {
      OldNetworkImpl oldNetworkImpl0 = new OldNetworkImpl();
      // Undeclared exception!
      try { 
        oldNetworkImpl0.openSocket("B{#+s`kI_fI:Pzt(C#", (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1
         //
         assertThrownBy("java.net.InetSocketAddress", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      OldNetworkImpl oldNetworkImpl0 = new OldNetworkImpl();
      oldNetworkImpl0.openObjectServerSocket(852);
      try { 
        oldNetworkImpl0.openObjectServerSocket(852);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to open TCP port
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      OldNetworkImpl oldNetworkImpl0 = new OldNetworkImpl();
      // Undeclared exception!
      try { 
        oldNetworkImpl0.openObjectServerSocket((-924));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -924
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }
}