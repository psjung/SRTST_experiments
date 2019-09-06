/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:35:52 KST 2017
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
public class Network_ESTest5 extends Network_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      stubbornNetworkImpl0.startService((Service) null, 0);
      stubbornNetworkImpl0.stopService(0);
  }

  @Test
  public void test1()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      networkImpl0.startService((Service) null, 0);
  }

  @Test
  public void test2()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      StubbornClientReceiverImpl stubbornClientReceiverImpl0 = (StubbornClientReceiverImpl)stubbornNetworkImpl0.findServer((String) null, 1, stubbornNetworkProxy0);
      assertFalse(stubbornClientReceiverImpl0.isInterrupted());
  }

  @Test
  public void test3()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      try { 
        stubbornNetworkImpl0.stopService((-1509));
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
        stubbornNetworkImpl0.startService((Service) null, (-3043));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -3043
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      networkImpl0.startService((Service) null, 0);
      try { 
        networkImpl0.startService((Service) null, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Port In Service
         //
         assertThrownBy("org.prevayler.foundation.network.BaseNetworkImpl", e);
      }
  }

  
}