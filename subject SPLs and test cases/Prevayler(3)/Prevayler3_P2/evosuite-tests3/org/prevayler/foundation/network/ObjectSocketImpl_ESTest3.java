/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 17:21:13 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
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
public class ObjectSocketImpl_ESTest3 extends ObjectSocketImpl_ESTest_scaffolding3 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void clearEvoSuiteFramework() {
String a = "aa";
}

  @Test
  public void test0()  throws Throwable  {
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
  public void test2()  throws Throwable  {
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

  
}
