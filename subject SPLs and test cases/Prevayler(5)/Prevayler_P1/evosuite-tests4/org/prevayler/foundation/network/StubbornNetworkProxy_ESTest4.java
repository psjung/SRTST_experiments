/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 11:12:09 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Proxy;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class StubbornNetworkProxy_ESTest4 extends StubbornNetworkProxy_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      StubbornNetworkProxy stubbornNetworkProxy1 = new StubbornNetworkProxy();
      stubbornNetworkProxy0.setClient(stubbornNetworkProxy1);
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl(0L);
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((ObjectReceiver) stubbornNetworkProxy0, (Service) null, (SessionsManager) sessionsManagerImpl0);
      sessionsManagerImpl0.add(stubbornNetworkProxy1);
      stubbornNetworkProxy0.connect(stubbornNetworkProxy1, stubbornServerReceiverImpl0);
      assertNotSame(stubbornNetworkProxy0, stubbornNetworkProxy1);
  }

  @Test
  public void test1()  throws Throwable  {
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl((-1L));
      NetworkSessionId networkSessionId0 = new NetworkSessionId((-1L), 0);
      sessionsManagerImpl0.find(networkSessionId0);
      stubbornNetworkProxy0.setClient((ObjectReceiver) null);
  }

  @Test
  public void test2()  throws Throwable  {
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      stubbornNetworkProxy0.close();
      stubbornNetworkProxy0.getClient();
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName("*MPmXxm");
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket((InetAddress) inet4Address0, 0, true);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@3c5dcef2
         //
         assertThrownBy("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  
}
