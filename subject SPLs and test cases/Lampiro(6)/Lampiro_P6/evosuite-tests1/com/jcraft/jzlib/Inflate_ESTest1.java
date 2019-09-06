/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 00:21:26 KST 2018
 */

package com.jcraft.jzlib;

import static org.junit.Assert.assertEquals;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Inflate_ESTest1 extends Inflate_ESTest_scaffolding1 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      zStream0.avail_in = 1;
      zStream0.inflateInit();
      inflate0.marker = (-1);
      // Undeclared exception!
      try { 
        inflate0.inflateSync(zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Inflate", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-1);
      zStream0.next_in = byteArray0;
      zStream0.inflateInit(0);
      zStream0.avail_in = 2;
      // Undeclared exception!
      try { 
        zStream0.inflateSync();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.jcraft.jzlib.Inflate", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      inflate0.method = (-1);
      zStream0.avail_in = 1;
      zStream0.inflateInit();
      // Undeclared exception!
      try { 
        inflate0.inflateSync(zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Inflate", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      zStream0.avail_in = (-1);
      zStream0.inflateInit();
      // Undeclared exception!
      try { 
        inflate0.inflateSync(zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Inflate", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      zStream0.inflateInit(0, true);
      int int0 = inflate0.inflateInit(zStream0, (-1));
      int int1 = inflate0.inflateSetDictionary(zStream0, (byte[]) null, 0);
      assertTrue(int1 == int0);
      assertEquals((-2), int1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      int int0 = inflate0.inflateSetDictionary(zStream0, (byte[]) null, (-1));
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[8];
      zStream0.istate = inflate0;
      zStream0.next_in = byteArray0;
      int int0 = inflate0.inflate(zStream0, 5);
      assertEquals((-5), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[8];
      zStream0.istate = inflate0;
      zStream0.next_in = byteArray0;
      int int0 = inflate0.inflate(zStream0, 1);
      assertEquals((-5), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      zStream0.inflateInit();
      int int0 = inflate0.inflateReset(zStream0);
      assertEquals(1L, zStream0.adler);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.inflateInit(true);
      assertEquals(0, int0);
      
      int int1 = inflate0.inflateInit(zStream0, 8);
      assertEquals(0L, zStream0.adler);
      assertEquals(0, int1);
      assertEquals(0L, zStream0.total_in);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      zStream0.inflateInit(16);
      // Undeclared exception!
      try { 
        inflate0.inflateReset(zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Inflate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      // Undeclared exception!
      try { 
        inflate0.inflateInit(zStream0, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Inflate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      zStream0.istate = inflate0;
      int int0 = inflate0.inflateSyncPoint(zStream0);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.inflateInit(true);
      assertEquals(0, int0);
      
      int int1 = inflate0.inflateSyncPoint(zStream0);
      assertEquals(0L, zStream0.adler);
      assertEquals(0L, zStream0.total_in);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      int int0 = inflate0.inflateSyncPoint(zStream0);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      int int0 = inflate0.inflateSyncPoint((ZStream) null);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-1);
      zStream0.next_in = byteArray0;
      zStream0.inflateInit(0);
      zStream0.avail_in = 1;
      int int0 = zStream0.inflateSync();
      assertEquals(1, zStream0.next_in_index);
      assertEquals((-3), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.inflateInit(0);
      assertEquals((-2), int0);
      
      Inflate inflate0 = zStream0.istate;
      inflate0.inflateSync(zStream0);
      int int1 = inflate0.inflateSync(zStream0);
      assertEquals((-5), int1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      int int0 = inflate0.inflateSync(zStream0);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      int int0 = inflate0.inflateSync((ZStream) null);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      byte[] byteArray0 = new byte[5];
      int int0 = inflate0.inflateSetDictionary((ZStream) null, byteArray0, (byte)0);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[8];
      zStream0.next_out = byteArray0;
      int int0 = zStream0.inflateInit(true);
      assertEquals(0, int0);
      
      zStream0.next_in = byteArray0;
      int int1 = inflate0.inflate(zStream0, 0);
      assertEquals(0L, zStream0.adler);
      assertEquals((-5), int1);
      assertEquals(0L, zStream0.total_out);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[8];
      zStream0.istate = inflate0;
      zStream0.istate.mode = (-1);
      zStream0.next_in = byteArray0;
      int int0 = inflate0.inflate(zStream0, 0);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[8];
      zStream0.inflateInit(true);
      zStream0.next_in = byteArray0;
      // Undeclared exception!
      try { 
        inflate0.inflate(zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      zStream0.inflateInit();
      int int0 = inflate0.inflate(zStream0, 0);
      assertEquals(1L, zStream0.adler);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      int int0 = inflate0.inflate(zStream0, 0);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      int int0 = inflate0.inflate((ZStream) null, 0);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      inflate0.blocks = infBlocks0;
      int int0 = inflate0.inflateEnd(zStream0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      int int0 = inflate0.inflateReset(zStream0);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      int int0 = zStream0.inflateInit(true);
      assertEquals(0, int0);
      
      int int1 = zStream0.inflateSetDictionary(zStream0.next_in, 0);
      assertEquals(0L, zStream0.adler);
      assertEquals(0L, zStream0.total_in);
      assertEquals((-2), int1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Inflate inflate0 = new Inflate();
      int int0 = inflate0.inflateReset((ZStream) null);
      assertEquals((-2), int0);
  }
}
