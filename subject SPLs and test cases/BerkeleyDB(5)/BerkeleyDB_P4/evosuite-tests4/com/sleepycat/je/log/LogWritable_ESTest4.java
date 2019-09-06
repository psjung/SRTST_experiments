/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:14:40 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.log.FileHeader;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LogWritable_ESTest4 extends LogWritable_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader();
      int int0 = fileHeader0.getLogSize();
      assertEquals(24, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader((-1494L), 0L);
      // Undeclared exception!
      try { 
        fileHeader0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }
}