/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 17:01:10 KST 2017
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
public class Network_ESTest3 extends Network_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      networkImpl0.startService((Service) null, 1229);
  }

  @Test
  public void test1()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      try { 
        networkImpl0.stopService((-229));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Port Not in Service
         //
         assertThrownBy("org.prevayler.foundation.network.BaseNetworkImpl", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      // Undeclared exception!
      try { 
        networkImpl0.startService((Service) null, (-2226));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -2226
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  
}
