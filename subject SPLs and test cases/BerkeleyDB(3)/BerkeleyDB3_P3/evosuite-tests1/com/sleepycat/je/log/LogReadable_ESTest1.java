/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:51:34 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LogReadable_ESTest1 extends LogReadable_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader();
      boolean boolean0 = fileHeader0.logEntryIsTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader(0L, 0L);
      long long0 = fileHeader0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test2()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader();
      // Undeclared exception!
      try { 
        fileHeader0.readFromLog((ByteBuffer) null, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader(0L, 0L);
      // Undeclared exception!
      try { 
        fileHeader0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileHeader", e);
      }
  }
}
