/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 17:17:02 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class NetworkServerObjectReceiverImpl_ESTest3 extends NetworkServerObjectReceiverImpl_ESTest_scaffolding3 {
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
      ObjectServerSocketImpl objectServerSocketImpl0 = new ObjectServerSocketImpl(0);
      objectServerSocketImpl0.close();
      NetworkServerObjectReceiverImpl networkServerObjectReceiverImpl0 = new NetworkServerObjectReceiverImpl((NetworkReceiverFactory) null, (Service) null, objectServerSocketImpl0);
      networkServerObjectReceiverImpl0.run();
      assertTrue(networkServerObjectReceiverImpl0.isDaemon());
  }

  @Test
  public void test1()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      NetworkServerObjectReceiverImpl networkServerObjectReceiverImpl0 = null;
      try {
        networkServerObjectReceiverImpl0 = new NetworkServerObjectReceiverImpl((NetworkReceiverFactory) stubbornNetworkImpl0, (Service) null, (-2442));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -2442
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      NetworkServerObjectReceiverImpl networkServerObjectReceiverImpl0 = new NetworkServerObjectReceiverImpl((NetworkReceiverFactory) networkImpl0, (Service) null, 2430);
      NetworkServerObjectReceiverImpl networkServerObjectReceiverImpl1 = null;
      try {
        networkServerObjectReceiverImpl1 = new NetworkServerObjectReceiverImpl((NetworkReceiverFactory) networkImpl0, (Service) null, 2430);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to open TCP port
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      NetworkServerObjectReceiverImpl networkServerObjectReceiverImpl0 = (NetworkServerObjectReceiverImpl)networkImpl0.createService((Service) null, 0);
      networkServerObjectReceiverImpl0.shutdown();
      networkServerObjectReceiverImpl0.run();
      assertTrue(networkServerObjectReceiverImpl0.isDaemon());
  }

  @Test
  public void test4()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      NetworkServerObjectReceiverImpl networkServerObjectReceiverImpl0 = new NetworkServerObjectReceiverImpl(networkImpl0, (Service) null, (ObjectServerSocket) null);
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
