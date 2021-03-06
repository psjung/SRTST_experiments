/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 11:00:14 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class ObjectSocketImpl_ESTest4 extends ObjectSocketImpl_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      ObjectSocketImpl objectSocketImpl0 = null;
      try {
        objectSocketImpl0 = new ObjectSocketImpl((Socket) mockSocket0);
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Socket is not connected
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ObjectSocketImpl objectSocketImpl0 = null;
      try {
        objectSocketImpl0 = new ObjectSocketImpl((Socket) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.network.ObjectSocketImpl", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ObjectSocketImpl objectSocketImpl0 = null;
      try {
        objectSocketImpl0 = new ObjectSocketImpl("?o7", (-3653));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-3653
         //
         assertThrownBy("java.net.InetSocketAddress", e);
      }
  }
}
