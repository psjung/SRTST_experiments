/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 17:23:09 KST 2018
 */

package com.jcraft.jzlib;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jcraft.jzlib.ZOutputStream;
import com.jcraft.jzlib.ZStreamException;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ZOutputStream_ESTest4 extends ZOutputStream_ESTest_scaffolding4 {
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
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(byteArrayOutputStream0, 0, false);
      zOutputStream0.write(0);
      long long0 = zOutputStream0.getTotalOut();
      assertEquals(1L, zOutputStream0.getTotalIn());
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(byteArrayOutputStream0, 0, false);
      zOutputStream0.write(0);
      long long0 = zOutputStream0.getTotalIn();
      assertEquals(2L, zOutputStream0.getTotalOut());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      ZOutputStream zOutputStream0 = new ZOutputStream(pipedOutputStream0, 0, false);
      assertEquals(0, zOutputStream0.getFlushMode());
      
      zOutputStream0.flush = 1;
      int int0 = zOutputStream0.getFlushMode();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(byteArrayOutputStream0, 0, true);
      zOutputStream0.setFlushMode((-1));
      int int0 = zOutputStream0.getFlushMode();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZOutputStream zOutputStream0 = new ZOutputStream((OutputStream) null, 10);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      zOutputStream0.write(byteArray0, 0, 1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(dataOutputStream0, 1);
      PrintStream printStream0 = new PrintStream(bufferedOutputStream0);
      ZOutputStream zOutputStream0 = new ZOutputStream(printStream0, 10);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        zOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte) (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(pipedOutputStream0, 0);
      ZOutputStream zOutputStream1 = new ZOutputStream(zOutputStream0);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        zOutputStream1.write(byteArray0, (int) (byte) (-1), (int) (byte)1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.jcraft.jzlib.Inflate", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ZOutputStream zOutputStream0 = new ZOutputStream(byteArrayOutputStream0, (-2), false);
      // Undeclared exception!
      zOutputStream0.write(0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZOutputStream zOutputStream0 = new ZOutputStream((OutputStream) null, 0);
      zOutputStream0.end();
      // Undeclared exception!
      try { 
        zOutputStream0.write(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.ZOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(byteArrayOutputStream0, 0, false);
      zOutputStream0.bufsize = (-1);
      // Undeclared exception!
      try { 
        zOutputStream0.write(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZOutputStream zOutputStream0 = new ZOutputStream((OutputStream) null, 0, false);
      zOutputStream0.setFlushMode((-1));
      try { 
        zOutputStream0.write(0);
        fail("Expecting exception: ZStreamException");
      
      } catch(ZStreamException e) {
         //
         // deflating: null
         //
         verifyException("com.jcraft.jzlib.ZOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(pipedOutputStream0, 0, false);
      zOutputStream0.close();
      // Undeclared exception!
      try { 
        zOutputStream0.getTotalOut();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.ZOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      ZOutputStream zOutputStream0 = new ZOutputStream(pipedOutputStream0, 0, false);
      zOutputStream0.end();
      // Undeclared exception!
      try { 
        zOutputStream0.getTotalIn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.ZOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZOutputStream zOutputStream0 = new ZOutputStream((OutputStream) null, 0);
      // Undeclared exception!
      try { 
        zOutputStream0.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.ZOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ZOutputStream zOutputStream0 = new ZOutputStream(byteArrayOutputStream0, 10, false);
      // Undeclared exception!
      try { 
        zOutputStream0.finish();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Deflate", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(byteArrayOutputStream0, 0, true);
      byte[] byteArray0 = new byte[2];
      zOutputStream0.buf = byteArray0;
      // Undeclared exception!
      try { 
        zOutputStream0.finish();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(pipedOutputStream0, 0);
      try { 
        zOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PrintStream printStream0 = new PrintStream(pipedOutputStream0);
      ZOutputStream zOutputStream0 = new ZOutputStream(printStream0);
      ZOutputStream zOutputStream1 = new ZOutputStream(zOutputStream0, 10, true);
      // Undeclared exception!
      try { 
        zOutputStream1.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Deflate", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PrintStream printStream0 = new PrintStream(pipedOutputStream0);
      ZOutputStream zOutputStream0 = new ZOutputStream(printStream0);
      zOutputStream0.end();
      assertEquals(0, zOutputStream0.getFlushMode());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZOutputStream zOutputStream0 = new ZOutputStream((OutputStream) null);
      try { 
        zOutputStream0.finish();
        fail("Expecting exception: ZStreamException");
      
      } catch(ZStreamException e) {
         //
         // inflating: null
         //
         verifyException("com.jcraft.jzlib.ZOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(byteArrayOutputStream0, 0, true);
      byte[] byteArray0 = new byte[2];
      zOutputStream0.write(byteArray0);
      assertEquals(2L, zOutputStream0.getTotalIn());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZOutputStream zOutputStream0 = new ZOutputStream((OutputStream) null, 0);
      zOutputStream0.end();
      zOutputStream0.end();
      assertEquals(0, zOutputStream0.getFlushMode());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(byteArrayOutputStream0, 0, true);
      zOutputStream0.finish();
      zOutputStream0.finish();
      assertEquals(5L, zOutputStream0.getTotalOut());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZOutputStream zOutputStream0 = new ZOutputStream((OutputStream) null);
      zOutputStream0.compress = true;
      try { 
        zOutputStream0.finish();
        fail("Expecting exception: ZStreamException");
      
      } catch(ZStreamException e) {
         //
         // deflating: null
         //
         verifyException("com.jcraft.jzlib.ZOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZOutputStream zOutputStream0 = new ZOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        zOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.ZOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(pipedOutputStream0, 0);
      ZOutputStream zOutputStream1 = new ZOutputStream(zOutputStream0);
      byte[] byteArray0 = new byte[7];
      try { 
        zOutputStream1.write(byteArray0, (int) (byte)0, (int) (byte)1);
        fail("Expecting exception: ZStreamException");
      
      } catch(ZStreamException e) {
         //
         // inflating: unknown compression method
         //
         verifyException("com.jcraft.jzlib.ZOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(byteArrayOutputStream0, 0, true);
      byte[] byteArray0 = new byte[0];
      zOutputStream0.write(byteArray0, 0, 0);
      assertEquals(0, zOutputStream0.getFlushMode());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(byteArrayOutputStream0, 0, true);
      zOutputStream0.getTotalIn();
      assertEquals(0, zOutputStream0.getFlushMode());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(byteArrayOutputStream0, 0, true);
      int int0 = zOutputStream0.getFlushMode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(byteArrayOutputStream0, 0, true);
      zOutputStream0.flush();
      assertEquals(0, zOutputStream0.getFlushMode());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(byteArrayOutputStream0, 0, true);
      zOutputStream0.getTotalOut();
      assertEquals(0, zOutputStream0.getFlushMode());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ZOutputStream zOutputStream0 = new ZOutputStream(byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(zOutputStream0);
      PrintStream printStream0 = new PrintStream(dataOutputStream0);
      ZOutputStream zOutputStream1 = new ZOutputStream(printStream0, 0);
      try { 
        zOutputStream1.write((byte[]) null, 0, 1);
        fail("Expecting exception: ZStreamException");
      
      } catch(ZStreamException e) {
         //
         // deflating: stream error
         //
         verifyException("com.jcraft.jzlib.ZOutputStream", e);
      }
  }
}
