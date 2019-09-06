/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 11:02:58 KST 2017
 */

package org.prevayler.foundation.network;

import static org.junit.Assert.assertSame;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class SessionsManager_ESTest4 extends SessionsManager_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl();
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      NetworkSessionId networkSessionId0 = sessionsManagerImpl0.add(stubbornNetworkProxy0);
      sessionsManagerImpl0.remove(networkSessionId0);
  }

  @Test
  public void test1()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl();
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      NetworkSessionId networkSessionId0 = sessionsManagerImpl0.add(stubbornNetworkProxy0);
      StubbornNetworkProxy stubbornNetworkProxy1 = sessionsManagerImpl0.find(networkSessionId0);
      assertSame(stubbornNetworkProxy1, stubbornNetworkProxy0);
  }
}