/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 08:44:54 KST 2017
 */

package com.sleepycat.bind.serial;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.io.StreamCorruptedException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class SerialInput_ESTest3 extends SerialInput_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      ClassCatalog classCatalog0 = null;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) null, (ClassCatalog) null, classLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.ObjectInputStream$PeekInputStream", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) byteArrayInputStream0, (ClassCatalog) null, (ClassLoader) null);
        fail("Expecting exception: StreamCorruptedException");
      
      } catch(StreamCorruptedException e) {
         //
         // invalid stream header: 00000000
         //
         assertThrownBy("java.io.ObjectInputStream", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) pipedInputStream0, (ClassCatalog) null, classLoader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         assertThrownBy("java.io.PipedInputStream", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)0, (int) (byte) (-51));
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) byteArrayInputStream0, (ClassCatalog) null, classLoader0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.ObjectInputStream$PeekInputStream", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) null, (ClassCatalog) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.ObjectInputStream$PeekInputStream", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream((InputStream) pipedInputStream0, (InputStream) pipedInputStream0);
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) sequenceInputStream0, (ClassCatalog) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         assertThrownBy("java.io.PipedInputStream", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) byteArrayInputStream0, (ClassCatalog) null);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.ObjectInputStream$PeekInputStream", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)ClassLoader.getSystemResourceAsStream("");
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) byteArrayInputStream0, (ClassCatalog) null);
        fail("Expecting exception: StreamCorruptedException");
      
      } catch(StreamCorruptedException e) {
         //
         // invalid stream header: 636F6D0A
         //
         assertThrownBy("java.io.ObjectInputStream", e);
      }
  }
}
