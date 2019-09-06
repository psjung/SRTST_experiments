/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:41:37 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class StubbornServerReceiverImpl_ESTest2 extends StubbornServerReceiverImpl_ESTest_scaffolding2 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void clearEvoSuiteFramework() {
String a = "aa";
}

  @Test
  public void test1()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = (StubbornServerReceiverImpl)stubbornNetworkImpl0.newReceiver((Service) null, (ObjectSocket) null);
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl();
      StubbornServerReceiverImpl stubbornServerReceiverImpl1 = new StubbornServerReceiverImpl((ObjectReceiver) stubbornServerReceiverImpl0, (Service) null, (SessionsManager) sessionsManagerImpl0);
      // Undeclared exception!
      try { 
        stubbornServerReceiverImpl1.receive(sessionsManagerImpl0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.prevayler.foundation.network.SessionsManagerImpl cannot be cast to org.prevayler.foundation.network.NetworkSessionId
         //
         assertThrownBy("org.prevayler.foundation.network.StubbornServerReceiverImpl", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((Service) null, (ObjectSocket) null, (SessionsManager) null);
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
  public void test3()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl(5831L);
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((Service) null, (ObjectSocket) null, (SessionsManager) sessionsManagerImpl0);
      stubbornServerReceiverImpl0.close();
  }

  @Test
  public void test4()  throws Throwable  {
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl();
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((ObjectReceiver) null, (Service) null, (SessionsManager) sessionsManagerImpl0);
      NetworkSessionId networkSessionId0 = sessionsManagerImpl0.add(stubbornNetworkProxy0);
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
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl(5831L);
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((Service) null, (ObjectSocket) null, (SessionsManager) sessionsManagerImpl0);
      // Undeclared exception!
      try { 
        stubbornServerReceiverImpl0.receive((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.network.NetworkClientObjectReceiverImpl", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl();
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((Service) null, (ObjectSocket) null, (SessionsManager) sessionsManagerImpl0);
      NetworkSessionId networkSessionId0 = sessionsManagerImpl0.add((StubbornNetworkProxy) null);
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
  public void test7()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl(5831L);
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((Service) null, (ObjectSocket) null, (SessionsManager) sessionsManagerImpl0);
      stubbornServerReceiverImpl0.disconnect();
  }
}
