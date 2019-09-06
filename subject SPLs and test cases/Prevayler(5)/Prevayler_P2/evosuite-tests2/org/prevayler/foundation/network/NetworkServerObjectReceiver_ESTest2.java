/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:24:59 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class NetworkServerObjectReceiver_ESTest2 extends NetworkServerObjectReceiver_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      NetworkServerObjectReceiverImpl networkServerObjectReceiverImpl0 = (NetworkServerObjectReceiverImpl)networkImpl0.createService((Service) null, 1230);
      networkServerObjectReceiverImpl0.shutdown();
      assertTrue(networkServerObjectReceiverImpl0.isDaemon());
  }

  @Test
  public void test1()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      NetworkServerObjectReceiverImpl networkServerObjectReceiverImpl0 = new NetworkServerObjectReceiverImpl(networkImpl0, (Service) null, (ObjectServerSocket) null);
      // Undeclared exception!
      try { 
        networkServerObjectReceiverImpl0.shutdown();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.network.NetworkServerObjectReceiverImpl", e);
      }
  }
}
