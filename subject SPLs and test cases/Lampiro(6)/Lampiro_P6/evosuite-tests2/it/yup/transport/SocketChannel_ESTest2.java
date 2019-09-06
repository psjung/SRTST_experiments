/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 11:03:33 KST 2018
 */

package it.yup.transport;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.InputStream;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class SocketChannel_ESTest2 extends SocketChannel_ESTest_scaffolding2 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SocketChannel socketChannel0 = new SocketChannel("", (TransportListener) null);
      socketChannel0.getInputStream();
      assertEquals(300000L, socketChannel0.KEEP_ALIVE);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SocketChannel socketChannel0 = new SocketChannel("", (TransportListener) null);
      SocketChannel.UTFReader socketChannel_UTFReader0 = socketChannel0.new UTFReader((InputStream) null);
      char[] charArray0 = new char[9];
      try { 
        socketChannel_UTFReader0.read(charArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unsupported method
         //
         verifyException("it.yup.transport.SocketChannel$UTFReader", e);
      }
  }
}
