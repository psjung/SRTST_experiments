/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 17:11:44 KST 2018
 */

package com.jcraft.jzlib;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jcraft.jzlib.ZStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ZStream_ESTest5 extends ZStream_ESTest_scaffolding5 {
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
      ZStream zStream0 = new ZStream();
      zStream0.deflateInit(0, true);
      // Undeclared exception!
      try { 
        zStream0.read_buf(zStream0.next_out, (-1), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[3];
      zStream0.deflateInit(0, true);
      // Undeclared exception!
      try { 
        zStream0.read_buf(byteArray0, 0, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.deflateInit(0, 0);
      zStream0.avail_in = (int) (byte)1;
      // Undeclared exception!
      try { 
        zStream0.read_buf(zStream0.next_out, (byte)0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.next_in_index = 1;
      zStream0.deflateInit(0, 0);
      // Undeclared exception!
      try { 
        zStream0.read_buf(zStream0.next_out, 0, (byte) (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.avail_in = (int) (byte)1;
      // Undeclared exception!
      try { 
        zStream0.read_buf(zStream0.next_in, (byte)0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.ZStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.read_buf(zStream0.next_out, (byte)0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.avail_out = 1;
      zStream0.deflateInit(0, true);
      zStream0.flush_pending();
      assertEquals(1L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.deflateInit(0, true);
      zStream0.avail_in = 1;
      zStream0.flush_pending();
      assertEquals(1L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.deflateInit(0, true);
      zStream0.next_out_index = (-1);
      zStream0.flush_pending();
      assertEquals(1L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.deflateInit(0, true);
      zStream0.deflateSetDictionary(zStream0.next_in, (byte) (-1));
      assertEquals(1L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.deflateInit(0, 0, true);
      int int0 = zStream0.deflateParams(0, (-1));
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.deflateInit(0, 0, true);
      int int0 = zStream0.deflateParams((-1), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.deflateInit(0, 0);
      int int0 = zStream0.deflate(1);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.deflateInit((int) (byte)0);
      zStream0.next_out_index = 1;
      zStream0.deflate((byte)0);
      assertEquals(1L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.inflateInit(0);
      int int0 = zStream0.inflateSetDictionary((byte[]) null, (-1));
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[9];
      zStream0.inflateInit();
      zStream0.inflateSetDictionary(byteArray0, 0);
      assertEquals(1L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.avail_out = 1;
      zStream0.inflateInit();
      int int0 = zStream0.inflateEnd();
      assertEquals(1L, zStream0.adler);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.inflateInit(true);
      zStream0.avail_in = (-1);
      int int1 = zStream0.inflateEnd();
      assertEquals(0L, zStream0.adler);
      assertTrue(int1 == int0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.deflateInit((int) (byte)0);
      zStream0.inflateInit(true);
      int int0 = zStream0.inflateEnd();
      assertEquals(1L, zStream0.adler);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.next_out_index = (int) (byte)1;
      zStream0.inflateInit(0);
      int int0 = zStream0.inflateEnd();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.inflateInit(true);
      assertEquals(0, int0);
      
      zStream0.inflate((byte)1);
      assertEquals(0L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.inflateInit(8, true);
      assertEquals(0L, zStream0.adler);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.inflateInit((int) (byte)8);
      assertEquals(1L, zStream0.adler);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[3];
      zStream0.deflateInit(0, false);
      int int0 = zStream0.deflateSetDictionary(byteArray0, (byte)0);
      assertEquals(1L, zStream0.adler);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.deflateInit((-2), true);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.deflateInit((int) (byte)0, 9, false);
      assertEquals(1L, zStream0.adler);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.deflateInit(10);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[0];
      zStream0.next_in = byteArray0;
      zStream0.deflateInit(0, false);
      // Undeclared exception!
      try { 
        zStream0.read_buf(byteArray0, 0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.inflateInit();
      zStream0.avail_in = 1;
      // Undeclared exception!
      try { 
        zStream0.inflateSync();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Inflate", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.free();
      // Undeclared exception!
      try { 
        zStream0.inflateInit(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfBlocks", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.free();
      // Undeclared exception!
      try { 
        zStream0.inflateInit();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfBlocks", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.inflateInit();
      zStream0.free();
      // Undeclared exception!
      try { 
        zStream0.inflateEnd();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfBlocks", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.inflateInit(true);
      byte[] byteArray0 = new byte[8];
      zStream0.next_in = byteArray0;
      // Undeclared exception!
      try { 
        zStream0.inflate((byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[5];
      zStream0.deflateInit((int) (byte)0, false);
      zStream0.free();
      // Undeclared exception!
      try { 
        zStream0.deflateSetDictionary(byteArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Deflate", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.free();
      // Undeclared exception!
      try { 
        zStream0.deflateInit(0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Deflate", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.inflateInit(0, false);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.deflateInit((int) (byte)0, (int) (byte)0, false);
      zStream0.avail_out = (int) (byte) (-1);
      // Undeclared exception!
      try { 
        zStream0.flush_pending();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.ZStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.deflateSetDictionary(zStream0.next_out, (byte)0);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.deflateParams(0, 0);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.deflateEnd();
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.deflateInit(0, (int) (byte)0, false);
      int int0 = zStream0.deflateEnd();
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.deflate(0);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.inflateSetDictionary((byte[]) null, 0);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.inflateSync();
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.inflateEnd();
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.inflate(0);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.inflateInit(0, true);
      zStream0.next_in_index = 1;
      int int0 = zStream0.inflateEnd();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.free();
      // Undeclared exception!
      try { 
        zStream0.deflateInit(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Deflate", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.deflateInit(0);
      int int0 = zStream0.deflateEnd();
      assertEquals(1L, zStream0.adler);
      assertEquals(0, int0);
  }
}
