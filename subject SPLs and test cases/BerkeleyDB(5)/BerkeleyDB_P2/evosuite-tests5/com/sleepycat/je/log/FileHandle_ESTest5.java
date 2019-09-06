/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:34:47 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.RandomAccessFile;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.latch.LatchException;
import com.sleepycat.je.latch.LatchNotHeldException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FileHandle_ESTest5 extends FileHandle_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, "", (EnvironmentImpl) null, false);
      boolean boolean0 = fileHandle0.isOldHeaderVersion();
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, "", (EnvironmentImpl) null, false);
      fileHandle0.hook444("", (EnvironmentImpl) null);
  }

  @Test
  public void test2()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, "", (EnvironmentImpl) null, true);
      fileHandle0.latch();
      try { 
        fileHandle0.latch();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // _fileHandle already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, "6tG&\no", (EnvironmentImpl) null, false);
      fileHandle0.close();
  }

  @Test
  public void test4()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, "", (EnvironmentImpl) null, true);
      boolean boolean0 = fileHandle0.isOldHeaderVersion();
      assertTrue(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, "", (EnvironmentImpl) null, false);
      fileHandle0.latch();
      fileHandle0.release();
  }

  @Test
  public void test6()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, "", (EnvironmentImpl) null, true);
      fileHandle0.latchNoWait();
      try { 
        fileHandle0.latchNoWait();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // _fileHandle already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, "", (EnvironmentImpl) null, false);
      try { 
        fileHandle0.release();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // _fileHandle not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, "", (EnvironmentImpl) null, false);
      RandomAccessFile randomAccessFile0 = fileHandle0.getFile();
      assertNull(randomAccessFile0);
  }
}
