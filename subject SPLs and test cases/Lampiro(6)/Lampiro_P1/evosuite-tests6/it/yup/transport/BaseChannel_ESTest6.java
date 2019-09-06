/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:16:46 KST 2018
 */

package it.yup.transport;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.InputStream;
import java.io.PipedInputStream;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xmlstream.SocketStream;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class BaseChannel_ESTest6 extends BaseChannel_ESTest_scaffolding6 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      SocketChannel socketChannel0 = new SocketChannel("", socketStream0);
      socketChannel0.open();
      assertEquals(300000L, socketChannel0.KEEP_ALIVE);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      SocketChannel socketChannel0 = new SocketChannel("", socketStream0);
      boolean boolean0 = socketChannel0.pollAlive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      SocketChannel socketChannel0 = new SocketChannel("", socketStream0);
      socketChannel0.close();
      boolean boolean0 = socketChannel0.pollAlive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      SocketChannel socketChannel0 = new SocketChannel("", socketStream0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      socketChannel0.inputStream = (InputStream) pipedInputStream0;
      boolean boolean0 = socketChannel0.isOpen();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      SocketChannel socketChannel0 = new SocketChannel((String) null, socketStream0);
      boolean boolean0 = socketChannel0.isOpen();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      SocketChannel socketChannel0 = new SocketChannel("", socketStream0);
      socketChannel0.sendContent((byte[]) null);
      assertFalse(socketChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      SocketChannel socketChannel0 = new SocketChannel((String) null, socketStream0);
      BaseChannel.Sender baseChannel_Sender0 = socketChannel0.new Sender(socketChannel0);
      baseChannel_Sender0.exiting = true;
      baseChannel_Sender0.run();
      assertFalse(baseChannel_Sender0.isInterrupted());
  }
}
