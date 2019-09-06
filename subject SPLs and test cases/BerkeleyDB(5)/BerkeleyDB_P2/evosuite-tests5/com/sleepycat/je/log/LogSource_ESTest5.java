/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:55:18 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.Test;
import org.junit.runner.RunWith;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LogSource_ESTest5 extends LogSource_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 0, (FileManager) null);
      fileSource0.release();
  }

  @Test
  public void test1()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 0, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileSource", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 0, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) 0, (-1344));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.ByteBuffer", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 0, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((-547L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileSource", e);
      }
  }
}
