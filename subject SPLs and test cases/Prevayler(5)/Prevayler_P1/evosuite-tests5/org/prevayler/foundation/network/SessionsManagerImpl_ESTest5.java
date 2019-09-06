/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:45:49 KST 2017
 */

package org.prevayler.foundation.network;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class SessionsManagerImpl_ESTest5 extends SessionsManagerImpl_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl();
      NetworkSessionId networkSessionId0 = sessionsManagerImpl0.add((StubbornNetworkProxy) null);
      StubbornNetworkProxy stubbornNetworkProxy0 = sessionsManagerImpl0.find(networkSessionId0);
      assertNull(stubbornNetworkProxy0);
  }

  @Test
  public void test1()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl(0L);
  }

  @Test
  public void test2()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl();
      sessionsManagerImpl0.remove((NetworkSessionId) null);
  }

  @Test
  public void test3()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl();
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      NetworkSessionId networkSessionId0 = sessionsManagerImpl0.add(stubbornNetworkProxy0);
      StubbornNetworkProxy stubbornNetworkProxy1 = sessionsManagerImpl0.find(networkSessionId0);
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((ObjectReceiver) stubbornNetworkProxy0, (Service) null, (SessionsManager) sessionsManagerImpl0);
      stubbornNetworkProxy0.connect(stubbornNetworkProxy1, stubbornServerReceiverImpl0);
      assertSame(stubbornNetworkProxy0, stubbornNetworkProxy1);
  }
}
