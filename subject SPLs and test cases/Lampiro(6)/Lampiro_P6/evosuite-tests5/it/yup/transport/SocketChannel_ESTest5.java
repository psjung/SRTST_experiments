/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 17:27:00 KST 2018
 */

package it.yup.transport;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.transport.SocketChannel;
import it.yup.transport.TransportListener;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class SocketChannel_ESTest5 extends SocketChannel_ESTest_scaffolding5 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TransportListener transportListener0 = null;
      SocketChannel socketChannel0 = new SocketChannel("Invalid byte received on text stream: ", (TransportListener) null);
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((-693));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
}
