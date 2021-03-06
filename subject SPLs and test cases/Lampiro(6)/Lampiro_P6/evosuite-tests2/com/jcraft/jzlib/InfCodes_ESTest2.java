/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 10:37:10 KST 2018
 */

package com.jcraft.jzlib;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jcraft.jzlib.InfBlocks;
import com.jcraft.jzlib.InfCodes;
import com.jcraft.jzlib.Inflate;
import com.jcraft.jzlib.ZStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class InfCodes_ESTest2 extends InfCodes_ESTest_scaffolding2 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[6];
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      infBlocks0.read = 2;
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 0, intArray0, 0, intArray0, 0, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[6];
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      infBlocks0.read = 1;
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 0, intArray0, 0, intArray0, 1, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[6];
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      infBlocks0.read = 1;
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 0, intArray0, 1, intArray0, 0, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[6];
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      infBlocks0.read = 1;
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(1, 0, intArray0, 0, intArray0, 0, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[6];
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      infBlocks0.read = 1;
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 1, intArray0, 0, intArray0, 0, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[0];
      ZStream zStream0 = new ZStream();
      infCodes0.get = 1;
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 0, intArray0, 0, intArray0, 0, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      infCodes0.lit = 1;
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 0, intArray0, 0, intArray0, 0, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      infCodes0.mode = (-1);
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 0, intArray0, 0, intArray0, 0, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      infCodes0.dtree_index = (-1);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 0, intArray0, 0, intArray0, 0, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[6];
      ZStream zStream0 = new ZStream();
      zStream0.avail_in = (-1);
      zStream0.inflateInit(false);
      Inflate inflate0 = zStream0.istate;
      InfBlocks infBlocks0 = inflate0.blocks;
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 0, (int[]) null, 0, intArray0, 0, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 0, (int[]) null, 0, (int[]) null, 1, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 0, (int[]) null, 1, (int[]) null, 0, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(1, 0, (int[]) null, 0, (int[]) null, 0, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[1];
      infCodes0.need = 1;
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 0, intArray0, 0, intArray0, 0, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[7];
      infCodes0.init(0, 0, intArray0, 1, intArray0, 0, zStream0);
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 0, intArray0, 0, intArray0, 0, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      infBlocks0.bitb = 1;
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 0, (int[]) null, 0, (int[]) null, 0, infBlocks0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      zStream0.avail_in = (-1);
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 258);
      // Undeclared exception!
      try { 
        infCodes0.proc(infBlocks0, zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      Inflate inflate0 = new Inflate();
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, inflate0, 259);
      // Undeclared exception!
      try { 
        infCodes0.proc(infBlocks0, zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, infCodes0, 0);
      infBlocks0.read = 2;
      // Undeclared exception!
      try { 
        infCodes0.proc(infBlocks0, zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, infCodes0, 0);
      infBlocks0.read = 1;
      // Undeclared exception!
      try { 
        infCodes0.proc(infBlocks0, zStream0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      zStream0.avail_in = 1;
      InfBlocks infBlocks0 = new InfBlocks(zStream0, infCodes0, 0);
      infBlocks0.read = 1;
      // Undeclared exception!
      try { 
        infCodes0.proc(infBlocks0, zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[9];
      ZStream zStream0 = new ZStream();
      infCodes0.init(0, 0, intArray0, 0, intArray0, (-1), zStream0);
      assertEquals(0, zStream0.next_out_index);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[4];
      int[] intArray1 = new int[6];
      infCodes0.init(0, 0, intArray0, 0, intArray1, 0, (ZStream) null);
      assertFalse(intArray0.equals((Object)intArray1));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      infCodes0.init(0, (-1), (int[]) null, 0, (int[]) null, 0, (ZStream) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[7];
      zStream0.next_out = byteArray0;
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[6];
      infCodes0.init((-129), 0, intArray0, 0, intArray0, 0, zStream0);
      int int0 = infCodes0.proc(infBlocks0, zStream0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      byte[] byteArray0 = new byte[7];
      zStream0.next_out = byteArray0;
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[6];
      infCodes0.init((-129), 0, intArray0, 0, intArray0, 0, zStream0);
      int int0 = infCodes0.proc(infBlocks0, zStream0, (byte)1);
      assertEquals(1, int0);
      assertEquals(0L, zStream0.total_in);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 17, intArray0, 0, intArray0, 0, infBlocks0, zStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 17
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 1);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[5];
      infCodes0.init(0, 0, intArray0, 0, intArray0, 0, zStream0);
      // Undeclared exception!
      try { 
        infCodes0.proc(infBlocks0, zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      infCodes0.mode = 9;
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      // Undeclared exception!
      try { 
        infCodes0.proc(infBlocks0, zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[7];
      intArray0[0] = 1;
      infCodes0.ltree = intArray0;
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      // Undeclared exception!
      try { 
        infCodes0.proc(infBlocks0, zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      infCodes0.mode = (-1);
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      // Undeclared exception!
      try { 
        infCodes0.proc(infBlocks0, zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      infCodes0.free(zStream0);
      assertEquals(0, zStream0.avail_out);
  }
}
