/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:22:46 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Network_ESTest2 extends Network_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      stubbornNetworkImpl0.startService((Service) null, 0);
      stubbornNetworkImpl0.stopService(0);
  }

  @Test
  public void test1()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      stubbornNetworkImpl0.startService((Service) null, 0);
  }

  @Test
  public void test2()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      StubbornClientReceiverImpl stubbornClientReceiverImpl0 = (StubbornClientReceiverImpl)stubbornNetworkImpl0.findServer("Prevayler Network Client Receiver", 1, stubbornNetworkProxy0);
      assertFalse(stubbornClientReceiverImpl0.isInterrupted());
  }

  @Test
  public void test3()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      try { 
        networkImpl0.stopService(1967);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Port Not in Service
         //
         assertThrownBy("org.prevayler.foundation.network.BaseNetworkImpl", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      // Undeclared exception!
      try { 
        stubbornNetworkImpl0.startService((Service) null, (-395));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -395
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  
}
