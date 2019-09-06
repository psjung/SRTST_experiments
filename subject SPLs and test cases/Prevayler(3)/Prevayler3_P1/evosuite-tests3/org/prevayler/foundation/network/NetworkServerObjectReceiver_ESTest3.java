/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 17:03:05 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class NetworkServerObjectReceiver_ESTest3 extends NetworkServerObjectReceiver_ESTest_scaffolding3 {
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
      NetworkImpl networkImpl0 = new NetworkImpl();
      ObjectServerSocketImpl objectServerSocketImpl0 = new ObjectServerSocketImpl(1759);
      NetworkServerObjectReceiverImpl networkServerObjectReceiverImpl0 = new NetworkServerObjectReceiverImpl(networkImpl0, (Service) null, objectServerSocketImpl0);
      networkServerObjectReceiverImpl0.shutdown();
      assertTrue(networkServerObjectReceiverImpl0.isDaemon());
  }

  @Test
  public void test1()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      NetworkServerObjectReceiverImpl networkServerObjectReceiverImpl0 = new NetworkServerObjectReceiverImpl(stubbornNetworkImpl0, (Service) null, (ObjectServerSocket) null);
      // Undeclared exception!
      try { 
        networkServerObjectReceiverImpl0.shutdown();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.network.NetworkServerObjectReceiverImpl", e);
      }
  }
}