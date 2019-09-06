/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:52:39 KST 2017
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

import com.sleepycat.je.dbi.EnvironmentImpl;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LogSource_ESTest1 extends LogSource_ESTest_scaffolding1 {

  @Test
  public void test1()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, 1620L);
      // Undeclared exception!
      try { 
        logBuffer0.getBytes(0L, (-1125));
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, 0L);
      // Undeclared exception!
      try { 
        logBuffer0.getBytes(1000000L, 3299);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 56, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes(6144L, (-235));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.ByteBuffer", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 574, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) 574);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileSource", e);
      }
  }
}
