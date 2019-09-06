/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:49:20 KST 2017
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
public class StubbornNetwork_ESTest5 extends StubbornNetwork_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      // Undeclared exception!
      try { 
        stubbornNetworkImpl0.newInstance((String) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1
         //
         assertThrownBy("java.net.InetSocketAddress", e);
      }
  }

  
}
