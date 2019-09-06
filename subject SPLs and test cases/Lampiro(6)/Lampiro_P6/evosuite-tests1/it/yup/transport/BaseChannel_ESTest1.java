/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 00:42:42 KST 2018
 */

package it.yup.transport;

import static org.evosuite.shaded.org.mockito.Mockito.doReturn;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;

import javax.microedition.io.StreamConnection;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xml.Element;
import it.yup.xmlstream.BasicXmlStream;
import it.yup.xmlstream.EventQuery;
import it.yup.xmlstream.SocketStream;
import static org.evosuite.runtime.EvoAssertions.*;
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class BaseChannel_ESTest1 extends BaseChannel_ESTest_scaffolding1 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      BasicXmlStream.NOT_AUTHORIZED = null;
      BasicXmlStream.REGISTRATION_FAILED = "<,z%<fc]ITTVc<de^:";
      SocketChannel socketChannel0 = new SocketChannel("", socketStream0);
      BasicXmlStream.STREAM_AUTHENTICATED = "<,z%<fc]ITTVc<de^:";
      BaseChannel.bytes_received = (-3382);
      socketChannel0.close();
      socketChannel0.isOpen();
      socketChannel0.isOpen();
      socketChannel0.pollAlive();
      byte[] byteArray0 = new byte[1];
      BaseChannel.bytes_sent = (-3382);
      byteArray0[0] = (byte) (-31);
      socketChannel0.sendContent(byteArray0);
      socketChannel0.isOpen();
      socketChannel0.pollAlive();
      socketChannel0.isOpen();
      socketChannel0.pollAlive();
      socketChannel0.pollAlive();
      String string0 = "ak&^=KKtvxvq?NPC";
      socketChannel0.transportType = string0;
      socketChannel0.isOpen();
      socketChannel0.isOpen();
      socketChannel0.pollAlive();
      socketChannel0.open();
      socketChannel0.sendContent(byteArray0);
      socketChannel0.open();
      socketChannel0.open();
      socketChannel0.open();
      BaseChannel.Sender baseChannel_Sender0 = socketChannel0.new Sender(socketChannel0);
      // Undeclared exception!
      try { 
        baseChannel_Sender0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.transport.BaseChannel$Sender", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      socketStream0.jid = "";
      BasicXmlStream.STREAM_TERMINATED = "";
      BasicXmlStream.UNMATCHED_STANZA = "";
      SocketChannel socketChannel0 = new SocketChannel("", socketStream0);
      socketChannel0.connectionUrl = "t;wBPU'hx`?$HH[";
      socketChannel0.KEEP_ALIVE = (-2776L);
      socketChannel0.connectionUrl = "";
      socketChannel0.close();
      socketChannel0.getOutputStream();
      BaseChannel.bytes_sent = (-3382);
      socketChannel0.close();
      socketChannel0.getReader();
      BasicXmlStream.CONNECTION_FAILED = "Qk;k$fdzR*:";
      socketChannel0.getReader();
      socketChannel0.getOutputStream();
      socketChannel0.pollAlive();
      socketChannel0.isOpen();
      socketChannel0.pollAlive();
      socketChannel0.open();
      socketChannel0.pollAlive();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-39);
      byteArray0[1] = (byte) (-87);
      byteArray0[2] = (byte) (-81);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)99;
      // Undeclared exception!
      try { 
        socketChannel0.sendContent(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative delay.
         //
         verifyException("java.util.Timer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SocketChannel socketChannel0 = new SocketChannel("7Ojrk<EX$YJK'", (TransportListener) null);
      socketChannel0.exiting = false;
      BaseChannel.Sender baseChannel_Sender0 = socketChannel0.new Sender(socketChannel0);
      baseChannel_Sender0.exiting = false;
      socketChannel0.sender = baseChannel_Sender0;
      baseChannel_Sender0.exiting = true;
      socketChannel0.transportType = null;
      baseChannel_Sender0.run();
      socketChannel0.isOpen();
      baseChannel_Sender0.exiting = true;
      baseChannel_Sender0.exiting = true;
      socketChannel0.exiting = true;
      baseChannel_Sender0.run();
      baseChannel_Sender0.run();
      socketChannel0.pollAlive();
      socketChannel0.isOpen();
      socketChannel0.getOutputStream();
      socketChannel0.close();
      socketChannel0.sender.run();
      assertSame(socketChannel0.sender, baseChannel_Sender0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      BasicXmlStream.STREAM_INITIALIZED = "qN(;emrx+&;ppf";
      SocketChannel socketChannel0 = new SocketChannel("", socketStream0);
      socketStream0.jid = "DIRECT_SOCKET";
      socketChannel0.isOpen();
      socketChannel0.close();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)85;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)61;
      byteArray0[6] = (byte)87;
      socketChannel0.sendContent(byteArray0);
      assertEquals(300000L, socketChannel0.KEEP_ALIVE);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      SocketChannel socketChannel0 = new SocketChannel("VCM$>[g( PHV)", socketStream0);
      socketStream0.connectionFailed(socketChannel0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      socketChannel0.inputStream = (InputStream) bufferedInputStream0;
      BasicXmlStream.NOT_AUTHORIZED = null;
      socketChannel0.pollAlive();
      String[] stringArray0 = new String[0];
      EventQuery eventQuery0 = new EventQuery((String) null, stringArray0, stringArray0);
      EventQuery eventQuery1 = eventQuery0.child;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 811);
      PipedOutputStream pipedOutputStream1 = null;
      try {
        pipedOutputStream1 = new PipedOutputStream(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      SocketChannel socketChannel0 = new SocketChannel("", socketStream0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-3);
      byteArray0[3] = (byte)127;
      Element element0 = new Element((String) null, "<,z%<fc]ITTVc<de^:");
      element0.removeAllElements();
      // Undeclared exception!
      try { 
        socketStream0.send(element0, (byte) (-3));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.SocketStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      SocketChannel socketChannel0 = new SocketChannel("illegal standalone value: ", socketStream0);
      BasicXmlStream.CONNECTION_FAILED = "send exited";
      socketStream0.nextInitializer();
      BasicXmlStream.STREAM_ERROR = "<,z%<fc]ITTVc<de^:";
      BaseChannel.bytes_received = (-3382);
      socketChannel0.close();
      socketChannel0.getOutputStream();
      socketChannel0.isOpen();
      StreamConnection streamConnection0 = socketChannel0.connection;
      socketChannel0.connection = null;
      socketChannel0.isOpen();
      socketChannel0.isOpen();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-85);
      byteArray0[3] = (byte)0;
      socketChannel0.sendContent(byteArray0);
      assertFalse(socketChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SocketStream socketStream0 = new SocketStream();
      SocketChannel socketChannel0 = new SocketChannel("_&PAHq}'1", socketStream0);
      byte[] byteArray0 = new byte[0];
      socketChannel0.sendContent(byteArray0);
      socketChannel0.getOutputStream();
      BaseChannel.Sender baseChannel_Sender0 = socketChannel0.new Sender(socketChannel0);
      // Undeclared exception!
      try { 
        baseChannel_Sender0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.transport.BaseChannel$Sender", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SocketChannel socketChannel0 = new SocketChannel((String) null, (TransportListener) null);
      InputStream inputStream0 = null;
      File file0 = new File("]'fY&?p");
      PrintStream printStream0 = null;
      try {
        printStream0 = new PrintStream(file0, "DIRECT_SOCKET");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // DIRECT_SOCKET
         //
         verifyException("java.io.PrintStream", e);
      }
  }
}