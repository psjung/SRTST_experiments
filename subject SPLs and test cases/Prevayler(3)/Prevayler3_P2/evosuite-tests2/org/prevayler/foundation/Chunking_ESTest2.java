/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:06:53 KST 2017
 */

package org.prevayler.foundation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Chunking_ESTest2 extends Chunking_ESTest_scaffolding2 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void clearEvoSuiteFramework() {
String a = "aa";
}

  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        Chunking.writeChunk((OutputStream) null, (Chunk) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.Chunking", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Chunking.readChunk((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.Chunking", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte) (-69), 1);
      // Undeclared exception!
      try { 
        Chunking.readChunk(byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) byteArrayInputStream0, (int) (byte)21);
      try { 
        Chunking.readChunk(pushbackInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // Unexpected end of stream in chunk header
         //
         assertThrownBy("org.prevayler.foundation.Chunking", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), (-1));
      Chunk chunk0 = Chunking.readChunk(byteArrayInputStream0);
      assertNull(chunk0);
  }

  @Test
  public void test5()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)classLoader0.getResourceAsStream("");
      try { 
        Chunking.readChunk(byteArrayInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Chunk header corrupted
         //
         assertThrownBy("org.prevayler.foundation.Chunking", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[0];
      Chunk chunk0 = new Chunk(byteArray0);
      chunk0.setParameter("US-ASCII", ".e-QGN+j[S");
      try { 
        Chunking.writeChunk(byteArrayOutputStream0, chunk0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid parameter value '.e-QGN+j[S'
         //
         assertThrownBy("org.prevayler.foundation.Chunking", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[0];
      Chunk chunk0 = new Chunk(byteArray0);
      chunk0.setParameter("<tb", ".e-QGN+j[S");
      try { 
        Chunking.writeChunk(byteArrayOutputStream0, chunk0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid parameter name '<tb'
         //
         assertThrownBy("org.prevayler.foundation.Chunking", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[0];
      Chunk chunk0 = new Chunk(byteArray0);
      chunk0.setParameter("snapshot", "k");
      Chunking.writeChunk(byteArrayOutputStream0, chunk0);
      assertEquals(16, byteArrayOutputStream0.size());
      assertEquals("0;snapshot=k\r\n\r\n", byteArrayOutputStream0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      Chunking chunking0 = new Chunking();
  }
}