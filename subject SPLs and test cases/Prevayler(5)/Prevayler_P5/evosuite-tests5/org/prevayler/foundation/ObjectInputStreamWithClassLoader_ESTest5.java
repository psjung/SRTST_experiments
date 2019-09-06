/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:25:10 KST 2017
 */

package org.prevayler.foundation;

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
public class ObjectInputStreamWithClassLoader_ESTest5 extends ObjectInputStreamWithClassLoader_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ObjectInputStreamWithClassLoader objectInputStreamWithClassLoader0 = null;
      try {
        objectInputStreamWithClassLoader0 = new ObjectInputStreamWithClassLoader((InputStream) null, classLoader0);
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
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), (int) (byte)69);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ObjectInputStreamWithClassLoader objectInputStreamWithClassLoader0 = null;
      try {
        objectInputStreamWithClassLoader0 = new ObjectInputStreamWithClassLoader((InputStream) byteArrayInputStream0, classLoader0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ObjectInputStreamWithClassLoader objectInputStreamWithClassLoader0 = null;
      try {
        objectInputStreamWithClassLoader0 = new ObjectInputStreamWithClassLoader((InputStream) pipedInputStream0, classLoader0);
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
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ObjectInputStreamWithClassLoader objectInputStreamWithClassLoader0 = null;
      try {
        objectInputStreamWithClassLoader0 = new ObjectInputStreamWithClassLoader((InputStream) byteArrayInputStream0, classLoader0);
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
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)classLoader0.getResourceAsStream("");
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream((InputStream) byteArrayInputStream0, (InputStream) byteArrayInputStream0);
      ObjectInputStreamWithClassLoader objectInputStreamWithClassLoader0 = null;
      try {
        objectInputStreamWithClassLoader0 = new ObjectInputStreamWithClassLoader((InputStream) sequenceInputStream0, classLoader0);
        fail("Expecting exception: StreamCorruptedException");
      
      } catch(StreamCorruptedException e) {
         //
         // invalid stream header: 6F72670A
         //
         assertThrownBy("java.io.ObjectInputStream", e);
      }
  }
}
