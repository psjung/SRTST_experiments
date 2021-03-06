/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 10:52:43 KST 2017
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
public class BaseNetworkImpl_ESTest4 extends BaseNetworkImpl_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      StubbornClientReceiverImpl stubbornClientReceiverImpl0 = (StubbornClientReceiverImpl)stubbornNetworkImpl0.newReceiver("]8UUt=", 1, (ObjectReceiver) null);
      StubbornClientReceiverImpl stubbornClientReceiverImpl1 = (StubbornClientReceiverImpl)stubbornNetworkImpl0.findServer("]8UUt=", 1606, stubbornClientReceiverImpl0);
      assertFalse(stubbornClientReceiverImpl1.isInterrupted());
  }

  @Test
  public void test01()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      NetworkServerObjectReceiverImpl networkServerObjectReceiverImpl0 = (NetworkServerObjectReceiverImpl)networkImpl0.createService((Service) null, 606);
      assertFalse(networkServerObjectReceiverImpl0.isInterrupted());
  }

  @Test
  public void test02()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      // Undeclared exception!
      try { 
        stubbornNetworkImpl0.startService((Service) null, (-123));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -123
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      // Undeclared exception!
      try { 
        networkImpl0.newReceiver((Service) null, (ObjectSocket) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.network.NetworkClientObjectReceiverImpl", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      // Undeclared exception!
      try { 
        stubbornNetworkImpl0.createService((Service) null, (-5688));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -5688
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      networkImpl0.startService((Service) null, 1659);
      try { 
        networkImpl0.createService((Service) null, 1659);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to open TCP port
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
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

  @Test
  public void test11()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      try { 
        networkImpl0.stopService(0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Port Not in Service
         //
         assertThrownBy("org.prevayler.foundation.network.BaseNetworkImpl", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      networkImpl0.startService((Service) null, 0);
      networkImpl0.stopService(0);
  }
}
