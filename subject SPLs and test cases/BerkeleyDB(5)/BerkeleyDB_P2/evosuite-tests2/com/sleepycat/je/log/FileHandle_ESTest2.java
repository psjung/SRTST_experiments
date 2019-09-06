/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:46:48 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.latch.LatchException;
import com.sleepycat.je.latch.LatchNotHeldException;
import com.sleepycat.je.log.FileHandle;
import java.io.RandomAccessFile;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FileHandle_ESTest2 extends FileHandle_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, (String) null, (EnvironmentImpl) null, false);
      boolean boolean0 = fileHandle0.isOldHeaderVersion();
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, (String) null, (EnvironmentImpl) null, true);
      fileHandle0.hook444((String) null, (EnvironmentImpl) null);
  }

  @Test
  public void test2()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, (String) null, (EnvironmentImpl) null, true);
      fileHandle0.latch();
      fileHandle0.release();
  }

  @Test
  public void test3()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, (String) null, (EnvironmentImpl) null, true);
      fileHandle0.latch();
      try { 
        fileHandle0.latchNoWait();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // null_fileHandle already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, (String) null, (EnvironmentImpl) null, true);
      fileHandle0.close();
  }

  @Test
  public void test5()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, (String) null, (EnvironmentImpl) null, true);
      boolean boolean0 = fileHandle0.isOldHeaderVersion();
      assertTrue(boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, (String) null, (EnvironmentImpl) null, true);
      fileHandle0.latch();
      try { 
        fileHandle0.latch();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // null_fileHandle already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, (String) null, (EnvironmentImpl) null, true);
      boolean boolean0 = fileHandle0.latchNoWait();
      assertTrue(boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, (String) null, (EnvironmentImpl) null, true);
      try { 
        fileHandle0.release();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // null_fileHandle not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test9()  throws Throwable  {
      FileHandle fileHandle0 = new FileHandle((RandomAccessFile) null, (String) null, (EnvironmentImpl) null, true);
      RandomAccessFile randomAccessFile0 = fileHandle0.getFile();
      assertNull(randomAccessFile0);
  }
}