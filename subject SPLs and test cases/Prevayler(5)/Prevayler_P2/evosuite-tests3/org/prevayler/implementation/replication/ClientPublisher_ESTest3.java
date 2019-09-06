/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 18:57:21 KST 2017
 */

package org.prevayler.implementation.replication;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.EOFException;
import java.io.IOException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.foundation.network.OldNetwork;
import org.prevayler.foundation.network.OldNetworkImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class ClientPublisher_ESTest3 extends ClientPublisher_ESTest_scaffolding3 {

  @Test
  public void test3()  throws Throwable  {
      ClientPublisher clientPublisher0 = null;
      try {
        clientPublisher0 = new ClientPublisher((OldNetwork) null, "FP", (-511));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.replication.ClientPublisher", e);
      }
  }
}
