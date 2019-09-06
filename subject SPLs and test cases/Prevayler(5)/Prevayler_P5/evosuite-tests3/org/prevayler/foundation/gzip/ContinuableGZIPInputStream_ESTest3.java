/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 16:55:01 KST 2017
 */

package org.prevayler.foundation.gzip;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.util.zip.ZipException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class ContinuableGZIPInputStream_ESTest3 extends ContinuableGZIPInputStream_ESTest_scaffolding3 {

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ContinuableGZIPInputStream continuableGZIPInputStream0 = null;
      try {
        continuableGZIPInputStream0 = new ContinuableGZIPInputStream((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Not in GZIP format
         //
         assertThrownBy("java.util.zip.GZIPInputStream", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ContinuableGZIPInputStream continuableGZIPInputStream0 = null;
      try {
        continuableGZIPInputStream0 = new ContinuableGZIPInputStream((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         assertThrownBy("java.io.PipedInputStream", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)1, (-4045));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) byteArrayInputStream0);
      ContinuableGZIPInputStream continuableGZIPInputStream0 = null;
      try {
        continuableGZIPInputStream0 = new ContinuableGZIPInputStream((InputStream) bufferedInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.zip.GZIPInputStream", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ContinuableGZIPInputStream continuableGZIPInputStream0 = null;
      try {
        continuableGZIPInputStream0 = new ContinuableGZIPInputStream((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.zip.InflaterInputStream", e);
      }
  }
}
