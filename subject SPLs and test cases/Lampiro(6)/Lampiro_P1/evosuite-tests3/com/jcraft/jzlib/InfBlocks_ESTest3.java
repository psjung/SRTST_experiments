/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 12:57:58 KST 2018
 */

package com.jcraft.jzlib;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jcraft.jzlib.InfBlocks;
import com.jcraft.jzlib.ZStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class InfBlocks_ESTest3 extends InfBlocks_ESTest_scaffolding3 {
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
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      byte[] byteArray0 = new byte[4];
      infBlocks0.bitk = 1;
      zStream0.next_out = byteArray0;
      infBlocks0.inflate_flush(zStream0, 0);
      assertEquals(0, zStream0.next_out_index);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      zStream0.next_out_index = 1;
      // Undeclared exception!
      try { 
        infBlocks0.inflate_flush(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      infBlocks0.read = (-1);
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      infBlocks0.read = 1;
      // Undeclared exception!
      try { 
        infBlocks0.inflate_flush(zStream0, (-6));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      infBlocks0.write = 1;
      // Undeclared exception!
      try { 
        infBlocks0.inflate_flush(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      infBlocks0.bitb = 1;
      int int0 = infBlocks0.sync_point();
      assertEquals(1L, zStream0.adler);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, "", 1);
      int int0 = infBlocks0.sync_point();
      assertEquals(1L, zStream0.adler);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      infBlocks0.bitk = 1;
      int int0 = infBlocks0.sync_point();
      assertEquals(1L, zStream0.adler);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InfBlocks infBlocks0 = new InfBlocks((ZStream) null, (Object) null, 0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        infBlocks0.set_dictionary(byteArray0, 1, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[7];
      zStream0.next_in = byteArray0;
      zStream0.avail_in = 2;
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[7];
      zStream0.next_in = byteArray0;
      zStream0.avail_in = 1;
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 1);
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      infBlocks0.read = 2;
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 1);
      infBlocks0.read = 1;
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      infBlocks0.read = 1;
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      infBlocks0.read = 1;
      infBlocks0.index = (-1);
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      infBlocks0.index = (-1);
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      infBlocks0.bitb = 1;
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      infBlocks0.last = 1;
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      long[] longArray0 = new long[3];
      infBlocks0.write = 1;
      infBlocks0.reset(zStream0, longArray0);
      assertEquals(0, zStream0.avail_in);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      long[] longArray0 = new long[6];
      infBlocks0.bitb = 1;
      infBlocks0.reset(zStream0, longArray0);
      assertEquals(1L, zStream0.adler);
      assertArrayEquals(new long[] {1L, 0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      long[] longArray0 = new long[6];
      infBlocks0.left = (int) (byte) (-1);
      infBlocks0.reset(zStream0, longArray0);
      assertEquals(0L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      infBlocks0.read = 1;
      infBlocks0.reset(zStream0, (long[]) null);
      assertEquals(0L, zStream0.total_out);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      infBlocks0.bitk = 1;
      infBlocks0.free(zStream0);
      assertEquals(1L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      byte[] byteArray0 = new byte[4];
      zStream0.next_out = byteArray0;
      int int0 = infBlocks0.inflate_flush(zStream0, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, "", 0);
      // Undeclared exception!
      try { 
        infBlocks0.set_dictionary((byte[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InfBlocks infBlocks0 = new InfBlocks((ZStream) null, (Object) null, 0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        infBlocks0.set_dictionary(byteArray0, 0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      long[] longArray0 = new long[6];
      zStream0.free();
      // Undeclared exception!
      try { 
        infBlocks0.reset(zStream0, longArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfBlocks", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        infBlocks0.reset(zStream0, longArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.jcraft.jzlib.InfBlocks", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InfBlocks infBlocks0 = null;
      try {
        infBlocks0 = new InfBlocks((ZStream) null, "", 0);
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
      InfBlocks infBlocks0 = null;
      try {
        infBlocks0 = new InfBlocks(zStream0, zStream0, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfBlocks", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 1);
      byte[] byteArray0 = new byte[4];
      zStream0.next_out = byteArray0;
      infBlocks0.inflate_flush(zStream0, 0);
      assertEquals(1L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      zStream0.avail_in = 1;
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      infBlocks0.bitk = 3;
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfBlocks", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)22;
      zStream0.next_in = byteArray0;
      zStream0.avail_in = 1;
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)2;
      zStream0.next_in = byteArray0;
      zStream0.avail_in = 1;
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      infBlocks0.mode = 10;
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InfBlocks infBlocks0 = new InfBlocks((ZStream) null, (Object) null, 0);
      byte[] byteArray0 = new byte[0];
      infBlocks0.set_dictionary(byteArray0, 0, 0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }
}