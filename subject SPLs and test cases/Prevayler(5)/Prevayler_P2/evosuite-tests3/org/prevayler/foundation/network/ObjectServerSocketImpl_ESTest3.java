/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 17:20:14 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.EOFException;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.net.SocketException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class ObjectServerSocketImpl_ESTest3 extends ObjectServerSocketImpl_ESTest_scaffolding3 {

  @Test
  public void test2()  throws Throwable  {
      ObjectServerSocketImpl objectServerSocketImpl0 = new ObjectServerSocketImpl(101);
      ObjectServerSocketImpl objectServerSocketImpl1 = null;
      try {
        objectServerSocketImpl1 = new ObjectServerSocketImpl(101);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to open TCP port
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ObjectServerSocketImpl objectServerSocketImpl0 = new ObjectServerSocketImpl(61);
      objectServerSocketImpl0.close();
      try { 
        objectServerSocketImpl0.accept();
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Socket is closed
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ObjectServerSocketImpl objectServerSocketImpl0 = new ObjectServerSocketImpl(0);
      try { 
        objectServerSocketImpl0.accept();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated exception on waiting server
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ObjectServerSocketImpl objectServerSocketImpl0 = null;
      try {
        objectServerSocketImpl0 = new ObjectServerSocketImpl((-3264));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -3264
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }
}
