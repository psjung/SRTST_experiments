/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 08:56:08 KST 2017
 */

package com.sleepycat.bind.serial;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class SerialOutput_ESTest5 extends SerialOutput_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      pipedOutputStream0.close();
      SerialOutput serialOutput0 = null;
      try {
        serialOutput0 = new SerialOutput((OutputStream) pipedOutputStream0, (ClassCatalog) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe closed
         //
         assertThrownBy("java.io.PipedInputStream", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      SerialOutput serialOutput0 = new SerialOutput((OutputStream) byteArrayOutputStream0, (ClassCatalog) null);
      // Undeclared exception!
      try { 
        serialOutput0.writeClassDescriptor((ObjectStreamClass) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.SerialOutput", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = SerialOutput.getStreamHeader();
      assertArrayEquals(new byte[] {(byte) (-84), (byte) (-19), (byte)0, (byte)5}, byteArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      SerialOutput serialOutput0 = null;
      try {
        serialOutput0 = new SerialOutput((OutputStream) null, (ClassCatalog) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.ObjectOutputStream$BlockDataOutputStream", e);
      }
  }
}
