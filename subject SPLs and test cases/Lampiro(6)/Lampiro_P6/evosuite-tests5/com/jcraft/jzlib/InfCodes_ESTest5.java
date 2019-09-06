/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 16:59:05 KST 2018
 */

package com.jcraft.jzlib;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jcraft.jzlib.InfBlocks;
import com.jcraft.jzlib.InfCodes;
import com.jcraft.jzlib.ZStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class InfCodes_ESTest5 extends InfCodes_ESTest_scaffolding5 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[7];
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
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[7];
      infBlocks0.read = 1;
      infCodes0.get = 1;
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
  public void test02()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      zStream0.next_in_index = 1;
      int[] intArray0 = new int[7];
      infBlocks0.read = 1;
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
  public void test03()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[7];
      infBlocks0.read = 1;
      infCodes0.init(0, 0, intArray0, 0, intArray0, 1, zStream0);
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
  public void test04()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[7];
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
  public void test05()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[7];
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
  public void test06()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[7];
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
  public void test07()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[7];
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
  public void test08()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      infCodes0.lit = 1;
      int[] intArray0 = new int[4];
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
  public void test09()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[7];
      infCodes0.len = (-1);
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
  public void test10()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      zStream0.next_in_index = 1;
      int[] intArray0 = new int[7];
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
  public void test11()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[2];
      ZStream zStream0 = new ZStream();
      infCodes0.init(0, 0, intArray0, 0, intArray0, (-1), zStream0);
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
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
  public void test12()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[0];
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      // Undeclared exception!
      try { 
        infCodes0.inflate_fast(0, 0, intArray0, 0, intArray0, (-1), infBlocks0, zStream0);
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
      int[] intArray0 = new int[0];
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      infBlocks0.bitk = 1;
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
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, infCodes0, 0);
      int[] intArray0 = new int[6];
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
  public void test15()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[0];
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
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
  public void test16()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, infCodes0, 0);
      infCodes0.dist = 1;
      int[] intArray0 = new int[6];
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
  public void test17()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[2];
      ZStream zStream0 = new ZStream();
      infCodes0.init(0, 0, intArray0, (-1), intArray0, 0, zStream0);
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
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
  public void test18()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      zStream0.avail_in = 10;
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 258);
      InfCodes infCodes0 = infBlocks0.codes;
      infCodes0.get = 1;
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
      ZStream zStream0 = new ZStream();
      zStream0.avail_in = 11;
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 258);
      InfCodes infCodes0 = infBlocks0.codes;
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
  public void test20()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, infCodes0, 259);
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
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      infBlocks0.read = 1;
      infCodes0.get = 1;
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
  public void test22()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
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
  public void test23()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[7];
      infBlocks0.read = 1;
      infCodes0.init(0, 0, intArray0, 0, intArray0, 1, zStream0);
      // Undeclared exception!
      try { 
        infCodes0.proc(infBlocks0, zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      infCodes0.lit = 1;
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, infCodes0, 0);
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
  public void test25()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      infCodes0.len = 1;
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
  public void test26()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      // Undeclared exception!
      try { 
        infCodes0.proc(infBlocks0, zStream0, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      zStream0.next_in_index = (-1);
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
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
  public void test28()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      infCodes0.dist = 1;
      InfBlocks infBlocks0 = new InfBlocks(zStream0, "", 0);
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
  public void test29()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      infCodes0.need = (-1);
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
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
  public void test30()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      int[] intArray0 = new int[0];
      infCodes0.init(0, 0, intArray0, 0, intArray0, (-1), zStream0);
      InfBlocks infBlocks0 = new InfBlocks(zStream0, "", 0);
      // Undeclared exception!
      try { 
        infCodes0.proc(infBlocks0, zStream0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      int[] intArray0 = new int[0];
      infCodes0.init(0, 0, intArray0, 1, intArray0, 0, zStream0);
      InfBlocks infBlocks0 = new InfBlocks(zStream0, "", 0);
      // Undeclared exception!
      try { 
        infCodes0.proc(infBlocks0, zStream0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[3];
      int[] intArray1 = new int[0];
      infCodes0.init(0, 0, intArray0, 0, intArray1, 0, zStream0);
      assertEquals(3, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      int[] intArray0 = new int[0];
      infCodes0.init(0, 1, intArray0, 0, intArray0, 0, zStream0);
      assertEquals(0L, zStream0.adler);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[7];
      infCodes0.init(0, 0, intArray0, 0, intArray0, 0, zStream0);
      InfBlocks infBlocks1 = new InfBlocks(zStream0, (Object) null, 1);
      // Undeclared exception!
      try { 
        infBlocks0.codes.proc(infBlocks1, zStream0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[0];
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, zStream0, 0);
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
  public void test36()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      Object object0 = new Object();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, object0, 0);
      InfCodes infCodes0 = infBlocks0.codes;
      int[] intArray0 = new int[7];
      infBlocks0.read = 2;
      infCodes0.init(0, 0, intArray0, 0, intArray0, 0, zStream0);
      // Undeclared exception!
      try { 
        infCodes0.proc(infBlocks0, zStream0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.jcraft.jzlib.InfCodes", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      int[] intArray0 = new int[1];
      ZStream zStream0 = new ZStream();
      infCodes0.init(513, 0, intArray0, 0, intArray0, 0, zStream0);
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
  public void test38()  throws Throwable  {
      InfCodes infCodes0 = new InfCodes();
      ZStream zStream0 = new ZStream();
      infCodes0.free(zStream0);
      assertEquals(0L, zStream0.total_in);
  }
}