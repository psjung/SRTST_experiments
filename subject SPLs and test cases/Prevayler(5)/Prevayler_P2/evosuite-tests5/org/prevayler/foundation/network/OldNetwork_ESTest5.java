/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:42:31 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class OldNetwork_ESTest5 extends OldNetwork_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      OldNetworkImpl oldNetworkImpl0 = new OldNetworkImpl();
      ObjectServerSocketImpl objectServerSocketImpl0 = (ObjectServerSocketImpl)oldNetworkImpl0.openObjectServerSocket(1574);
      assertNotNull(objectServerSocketImpl0);
  }

  @Test
  public void test1()  throws Throwable  {
      OldNetworkImpl oldNetworkImpl0 = new OldNetworkImpl();
      // Undeclared exception!
      try { 
        oldNetworkImpl0.openSocket("E^JH", (-1666));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1666
         //
         assertThrownBy("java.net.InetSocketAddress", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      OldNetworkImpl oldNetworkImpl0 = new OldNetworkImpl();
      // Undeclared exception!
      try { 
        oldNetworkImpl0.openObjectServerSocket((-1182));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -1182
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      OldNetworkImpl oldNetworkImpl0 = new OldNetworkImpl();
      oldNetworkImpl0.openObjectServerSocket(1110);
      try { 
        oldNetworkImpl0.openObjectServerSocket(1110);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to open TCP port
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }
}