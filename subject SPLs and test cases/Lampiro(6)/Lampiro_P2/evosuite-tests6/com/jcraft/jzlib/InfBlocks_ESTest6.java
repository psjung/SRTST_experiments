/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 13:50:34 KST 2018
 */

package com.jcraft.jzlib;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class InfBlocks_ESTest6 extends InfBlocks_ESTest_scaffolding6 {
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
      byte[] byteArray0 = new byte[0];
      zStream0.next_out = byteArray0;
      infBlocks0.bitb = (-1);
      int int0 = infBlocks0.proc(zStream0, 0);
      assertEquals(0L, zStream0.total_in);
      assertEquals(0L, zStream0.total_out);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.avail_out = 1;
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
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
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      infBlocks0.write = (-1);
      int int0 = infBlocks0.sync_point();
      assertEquals(1L, zStream0.adler);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 1);
      int int0 = infBlocks0.sync_point();
      assertEquals(0L, zStream0.adler);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      infBlocks0.bitk = 1;
      int int0 = infBlocks0.sync_point();
      assertEquals(0, int0);
      assertEquals(0L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      // Undeclared exception!
      try { 
        infBlocks0.set_dictionary((byte[]) null, 0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.next_in_index = (-1);
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
  public void test07()  throws Throwable  {
      ZStream zStream0 = new ZStream();
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
  public void test08()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      infBlocks0.bitk = (-1);
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
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      long[] longArray0 = new long[6];
      infBlocks0.mode = 7;
      infBlocks0.reset(zStream0, longArray0);
      assertEquals(1L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.inflateInit(true);
      byte[] byteArray0 = new byte[7];
      zStream0.next_in = byteArray0;
      Inflate inflate0 = zStream0.istate;
      InfBlocks infBlocks0 = inflate0.blocks;
      infBlocks0.set_dictionary(zStream0.next_in, 0, 0);
      assertEquals(0L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      byte[] byteArray0 = new byte[0];
      zStream0.next_out = byteArray0;
      int int0 = infBlocks0.proc(zStream0, (-1));
      assertEquals((-1), int0);
      assertEquals(0, zStream0.avail_in);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[6];
      zStream0.next_out = byteArray0;
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      infBlocks0.inflate_flush(zStream0, (-1));
      assertEquals(1L, zStream0.adler);
      assertEquals(0, zStream0.avail_out);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.inflateInit(true);
      byte[] byteArray0 = new byte[7];
      Inflate inflate0 = zStream0.istate;
      InfBlocks infBlocks0 = inflate0.blocks;
      // Undeclared exception!
      try { 
        infBlocks0.set_dictionary(byteArray0, (byte) (-1), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
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
  public void test16()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      byte[] byteArray0 = new byte[0];
      zStream0.next_out = byteArray0;
      infBlocks0.inflate_flush(zStream0, 0);
      assertEquals(1L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[6];
      zStream0.next_out = byteArray0;
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 1);
      infBlocks0.inflate_flush(zStream0, 0);
      assertEquals(1L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, "", 0);
      infBlocks0.write = 1;
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      infBlocks0.write = (-1);
      // Undeclared exception!
      try { 
        infBlocks0.inflate_flush(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      infBlocks0.mode = 10;
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
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      infBlocks0.mode = 1;
      // Undeclared exception!
      try { 
        infBlocks0.proc(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      infBlocks0.free(zStream0);
      assertEquals(1L, zStream0.adler);
  }
}
