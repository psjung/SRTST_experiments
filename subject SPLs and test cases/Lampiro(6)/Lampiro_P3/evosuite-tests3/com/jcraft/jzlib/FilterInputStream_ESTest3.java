/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 12:56:06 KST 2018
 */

package com.jcraft.jzlib;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jcraft.jzlib.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class FilterInputStream_ESTest3 extends FilterInputStream_ESTest_scaffolding3 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      filterInputStream0.reset();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      long long0 = filterInputStream0.skip(1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (-1));
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      long long0 = filterInputStream0.skip((byte)0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      FilterInputStream filterInputStream0 = new FilterInputStream(bufferedInputStream0);
      byte[] byteArray0 = new byte[0];
      int int0 = filterInputStream0.read(byteArray0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      int int0 = filterInputStream0.read(byteArray0, 0, (int) (byte)1);
      assertEquals(2, byteArrayInputStream0.available());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      FilterInputStream filterInputStream0 = new FilterInputStream(bufferedInputStream0);
      byte[] byteArray0 = new byte[0];
      int int0 = filterInputStream0.read(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 1);
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      int int0 = filterInputStream0.read(byteArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      int int0 = filterInputStream0.read();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      int int0 = filterInputStream0.read();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      FilterInputStream filterInputStream0 = new FilterInputStream(sequenceInputStream0);
      boolean boolean0 = filterInputStream0.markSupported();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)1);
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      int int0 = filterInputStream0.available();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 6, 0);
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      int int0 = filterInputStream0.available();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FilterInputStream filterInputStream0 = new FilterInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        filterInputStream0.skip(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 1);
      pipedInputStream0.close();
      FilterInputStream filterInputStream0 = new FilterInputStream(pipedInputStream0);
      try { 
        filterInputStream0.skip(1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe closed
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FilterInputStream filterInputStream0 = new FilterInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        filterInputStream0.reset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FilterInputStream filterInputStream0 = new FilterInputStream((InputStream) null);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        filterInputStream0.read(byteArray0, (int) (byte)0, (int) (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 0);
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        filterInputStream0.read(byteArray0, (int) (byte)0, (int) (byte) (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      FilterInputStream filterInputStream0 = new FilterInputStream(pipedInputStream0);
      byte[] byteArray0 = new byte[7];
      try { 
        filterInputStream0.read(byteArray0, 0, (int) (byte)1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FilterInputStream filterInputStream0 = new FilterInputStream((InputStream) null);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        filterInputStream0.read(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      FilterInputStream filterInputStream0 = new FilterInputStream(bufferedInputStream0);
      byte[] byteArray0 = new byte[0];
      filterInputStream0.close();
      try { 
        filterInputStream0.read(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 1);
      FilterInputStream filterInputStream0 = new FilterInputStream(pushbackInputStream0);
      try { 
        filterInputStream0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FilterInputStream filterInputStream0 = new FilterInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        filterInputStream0.markSupported();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)0);
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      filterInputStream0.in = (InputStream) byteArrayInputStream0;
      filterInputStream0.in = null;
      // Undeclared exception!
      try { 
        filterInputStream0.mark(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FilterInputStream filterInputStream0 = new FilterInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        filterInputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FilterInputStream filterInputStream0 = new FilterInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        filterInputStream0.available();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 0);
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      int int0 = filterInputStream0.read(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 0);
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      long long0 = filterInputStream0.skip(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 0);
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      filterInputStream0.read(byteArray0);
      int int0 = filterInputStream0.available();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 0);
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      boolean boolean0 = filterInputStream0.markSupported();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      FilterInputStream filterInputStream0 = new FilterInputStream(sequenceInputStream0);
      try { 
        filterInputStream0.reset();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // mark/reset not supported
         //
         verifyException("java.io.InputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      FilterInputStream filterInputStream0 = new FilterInputStream(sequenceInputStream0);
      filterInputStream0.mark(0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 0);
      FilterInputStream filterInputStream0 = new FilterInputStream(byteArrayInputStream0);
      int int0 = filterInputStream0.read();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null, 1);
      FilterInputStream filterInputStream0 = new FilterInputStream(bufferedInputStream0);
      try { 
        filterInputStream0.available();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }
}
