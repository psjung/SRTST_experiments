/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 17:32:56 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class StubbornServerReceiverImpl_ESTest3 extends StubbornServerReceiverImpl_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl();
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((ObjectReceiver) stubbornNetworkProxy0, (Service) null, (SessionsManager) sessionsManagerImpl0);
      // Undeclared exception!
      try { 
        stubbornServerReceiverImpl0.receive(stubbornNetworkProxy0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.prevayler.foundation.network.StubbornNetworkProxy cannot be cast to org.prevayler.foundation.network.NetworkSessionId
         //
         assertThrownBy("org.prevayler.foundation.network.StubbornServerReceiverImpl", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      StubbornClientReceiverImpl stubbornClientReceiverImpl0 = new StubbornClientReceiverImpl((StubbornNetwork) stubbornNetworkImpl0, (String) null, 0, (ObjectReceiver) null);
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((ObjectReceiver) stubbornClientReceiverImpl0, (Service) null, (SessionsManager) null);
      stubbornServerReceiverImpl0.close();
  }

  @Test
  public void test2()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl(1594L);
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      NetworkSessionId networkSessionId0 = sessionsManagerImpl0.add(stubbornNetworkProxy0);
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((Service) null, (ObjectSocket) null, (SessionsManager) sessionsManagerImpl0);
      // Undeclared exception!
      try { 
        stubbornServerReceiverImpl0.receive(networkSessionId0);
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
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl(1594L);
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((Service) null, (ObjectSocket) null, (SessionsManager) sessionsManagerImpl0);
      stubbornServerReceiverImpl0.disconnect();
  }

  @Test
  public void test4()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl(1646L);
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((ObjectReceiver) null, (Service) null, (SessionsManager) sessionsManagerImpl0);
      NetworkSessionId networkSessionId0 = new NetworkSessionId(1646L, 744);
      // Undeclared exception!
      try { 
        stubbornServerReceiverImpl0.receive(networkSessionId0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.network.StubbornServerReceiverImpl", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      StubbornClientReceiverImpl stubbornClientReceiverImpl0 = new StubbornClientReceiverImpl((StubbornNetwork) stubbornNetworkImpl0, (String) null, 0, (ObjectReceiver) null);
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((ObjectReceiver) stubbornClientReceiverImpl0, (Service) null, (SessionsManager) null);
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

  @Test
  public void test6()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl(1000L);
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((ObjectReceiver) null, (Service) null, (SessionsManager) sessionsManagerImpl0);
      // Undeclared exception!
      try { 
        stubbornServerReceiverImpl0.receive((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.network.StubbornServerReceiverImpl", e);
      }
  }
}
