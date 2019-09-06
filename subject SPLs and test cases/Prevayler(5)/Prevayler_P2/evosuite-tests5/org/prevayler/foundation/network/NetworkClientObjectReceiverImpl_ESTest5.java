/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:36:34 KST 2017
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
public class NetworkClientObjectReceiverImpl_ESTest5 extends NetworkClientObjectReceiverImpl_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      Service service0 = null;
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl();
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((Service) null, (ObjectSocket) null, (SessionsManager) sessionsManagerImpl0);
      NetworkClientObjectReceiverImpl networkClientObjectReceiverImpl0 = new NetworkClientObjectReceiverImpl((ObjectSocket) null, (ObjectReceiver) stubbornServerReceiverImpl0);
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
      String string0 = null;
      NetworkClientObjectReceiverImpl networkClientObjectReceiverImpl0 = new NetworkClientObjectReceiverImpl((ObjectSocket) null, (ObjectReceiver) null);
      // Undeclared exception!
      try { 
        networkClientObjectReceiverImpl0.receive((Object) null);
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
      NetworkClientObjectReceiverImpl networkClientObjectReceiverImpl0 = null;
      try {
        networkClientObjectReceiverImpl0 = new NetworkClientObjectReceiverImpl((String) null, (-1338), (ObjectReceiver) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1338
         //
         assertThrownBy("java.net.InetSocketAddress", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
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

  @Test
  public void test5()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl();
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((Service) null, (ObjectSocket) null, (SessionsManager) sessionsManagerImpl0);
      NetworkClientObjectReceiverImpl networkClientObjectReceiverImpl0 = new NetworkClientObjectReceiverImpl((ObjectSocket) null, (ObjectReceiver) stubbornServerReceiverImpl0);
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
}