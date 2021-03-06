/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 11:07:48 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class StubbornNetworkClientConnector_ESTest4 extends StubbornNetworkClientConnector_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl();
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((Service) null, (ObjectSocket) null, (SessionsManager) sessionsManagerImpl0);
      stubbornServerReceiverImpl0.disconnect();
  }

  @Test
  public void test1()  throws Throwable  {
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((ObjectReceiver) stubbornNetworkProxy0, (Service) null, (SessionsManager) null);
      // Undeclared exception!
      try { 
        stubbornServerReceiverImpl0.disconnect();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.network.StubbornServerReceiverImpl", e);
      }
  }
}
