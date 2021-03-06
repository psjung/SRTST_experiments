/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 00:17:36 KST 2018
 */

package com.jcraft.jzlib;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jcraft.jzlib.InfBlocks;
import com.jcraft.jzlib.ZStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class InfBlocks_ESTest1 extends InfBlocks_ESTest_scaffolding1 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      byte[] byteArray0 = new byte[4];
      infBlocks0.table = (int) (byte)1;
      zStream0.next_out = byteArray0;
      infBlocks0.proc(zStream0, 0);
      assertEquals(0L, zStream0.total_out);
      assertEquals(0, zStream0.next_in_index);
      assertEquals(0L, zStream0.total_in);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      byte[] byteArray0 = new byte[4];
      zStream0.next_out = byteArray0;
      infBlocks0.left = 1;
      int int0 = infBlocks0.proc(zStream0, 0);
      assertEquals(0, zStream0.next_out_index);
      assertEquals(0, int0);
      assertEquals(0, zStream0.next_in_index);
      assertEquals(0L, zStream0.total_in);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      byte[] byteArray0 = new byte[4];
      zStream0.next_out = byteArray0;
      infBlocks0.mode = (int) (byte) (-1);
      int int0 = infBlocks0.proc(zStream0, 0);
      assertEquals((-2), int0);
      assertEquals(0, zStream0.avail_out);
      assertEquals(0L, zStream0.total_out);
      assertEquals(0, zStream0.next_out_index);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      infBlocks0.mode = 1;
      int int0 = infBlocks0.sync_point();
      assertEquals(1L, zStream0.adler);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      // Undeclared exception!
      try { 
        infBlocks0.set_dictionary(zStream0.next_out, 0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.next_in_index = (-1);
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      infBlocks0.read = 2;
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      infBlocks0.read = 1;
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      infBlocks0.index = (-1);
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, "", 0);
      infBlocks0.bitk = (-1);
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
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      infBlocks0.mode = 7;
      infBlocks0.free(zStream0);
      assertEquals(0, zStream0.next_out_index);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InfBlocks infBlocks0 = new InfBlocks((ZStream) null, (Object) null, 0);
      long[] longArray0 = new long[5];
      infBlocks0.reset((ZStream) null, longArray0);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      byte[] byteArray0 = new byte[8];
      infBlocks0.set_dictionary(byteArray0, 0, 0);
      assertEquals(1L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      byte[] byteArray0 = new byte[6];
      zStream0.next_out = byteArray0;
      int int0 = infBlocks0.proc(zStream0, (-1));
      assertEquals(0, zStream0.next_in_index);
      assertEquals((-1), int0);
      assertEquals(0, zStream0.avail_in);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      byte[] byteArray0 = new byte[6];
      zStream0.next_out = byteArray0;
      infBlocks0.inflate_flush(zStream0, (byte)1);
      assertEquals(1L, zStream0.adler);
      assertEquals(0L, zStream0.total_out);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        infBlocks0.set_dictionary(byteArray0, 7, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      // Undeclared exception!
      try { 
        infBlocks0.inflate_flush(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      zStream0.free();
      // Undeclared exception!
      try { 
        infBlocks0.free(zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfBlocks", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InfBlocks infBlocks0 = null;
      try {
        infBlocks0 = new InfBlocks((ZStream) null, (Object) null, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfBlocks", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 1);
      byte[] byteArray0 = new byte[4];
      zStream0.next_out = byteArray0;
      int int0 = infBlocks0.proc(zStream0, 0);
      assertEquals(0, zStream0.avail_out);
      assertEquals(0, int0);
      assertEquals(0L, zStream0.total_out);
      assertEquals(0, zStream0.avail_in);
      assertEquals(0L, zStream0.total_in);
      assertEquals(0, zStream0.next_in_index);
      assertEquals(0, zStream0.next_out_index);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      int int0 = infBlocks0.sync_point();
      assertEquals(1L, zStream0.adler);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      zStream0.avail_in = (-1);
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
  public void test22()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      infBlocks0.mode = 1;
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
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
  public void test24()  throws Throwable  {
      Object object0 = new Object();
      InfBlocks infBlocks0 = null;
      try {
        infBlocks0 = new InfBlocks((ZStream) null, object0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfBlocks", e);
      }
  }
}
