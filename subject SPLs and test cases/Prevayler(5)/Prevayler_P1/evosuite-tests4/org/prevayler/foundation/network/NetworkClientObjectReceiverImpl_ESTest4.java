/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 10:54:09 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class NetworkClientObjectReceiverImpl_ESTest4 extends NetworkClientObjectReceiverImpl_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      NetworkClientObjectReceiverImpl networkClientObjectReceiverImpl0 = new NetworkClientObjectReceiverImpl((ObjectSocket) null, (ObjectReceiver) null);
      // Undeclared exception!
      try { 
        networkClientObjectReceiverImpl0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.network.NetworkClientObjectReceiverImpl", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ObjectSocket objectSocket0 = null;
      NetworkClientObjectReceiverImpl networkClientObjectReceiverImpl0 = new NetworkClientObjectReceiverImpl((ObjectSocket) null, (ObjectReceiver) null);
      // Undeclared exception!
      try { 
        networkClientObjectReceiverImpl0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.network.NetworkClientObjectReceiverImpl", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      NetworkClientObjectReceiverImpl networkClientObjectReceiverImpl0 = new NetworkClientObjectReceiverImpl((ObjectSocket) null, (ObjectReceiver) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        networkClientObjectReceiverImpl0.receive(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.network.NetworkClientObjectReceiverImpl", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      NetworkClientObjectReceiverImpl networkClientObjectReceiverImpl0 = null;
      try {
        networkClientObjectReceiverImpl0 = new NetworkClientObjectReceiverImpl("=]dAg+&r,Ecz", (-18), (ObjectReceiver) stubbornNetworkProxy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-18
         //
         assertThrownBy("java.net.InetSocketAddress", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      NetworkClientObjectReceiverImpl networkClientObjectReceiverImpl0 = null;
      try {
        networkClientObjectReceiverImpl0 = new NetworkClientObjectReceiverImpl((ObjectSocket) null, (Service) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.network.NetworkClientObjectReceiverImpl", e);
      }
  }
}
