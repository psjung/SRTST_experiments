/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 10:29:15 KST 2018
 */

package com.jcraft.jzlib;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jcraft.jzlib.Adler32;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Adler32_ESTest2 extends Adler32_ESTest_scaffolding2 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[20];
      byteArray0[3] = (byte) (-1);
      long long0 = adler32_0.adler32(0L, byteArray0, 0, (byte)16);
      assertEquals(217252095L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[20];
      byteArray0[2] = (byte)1;
      long long0 = adler32_0.adler32(0L, byteArray0, 0, (byte)16);
      assertEquals(917505L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-1);
      // Undeclared exception!
      try { 
        adler32_0.adler32(0L, byteArray0, 0, (byte)16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.jcraft.jzlib.Adler32", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)1;
      // Undeclared exception!
      try { 
        adler32_0.adler32(0L, byteArray0, 0, (byte)16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.jcraft.jzlib.Adler32", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        adler32_0.adler32((byte)1, byteArray0, 0, 16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.jcraft.jzlib.Adler32", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        adler32_0.adler32((-1L), byteArray0, 0, 16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.jcraft.jzlib.Adler32", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        adler32_0.adler32(0L, byteArray0, 0, 11104);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("com.jcraft.jzlib.Adler32", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[20];
      long long0 = adler32_0.adler32(0L, byteArray0, 0, (byte)16);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[10];
      long long0 = adler32_0.adler32(0L, byteArray0, (byte)0, (byte)2);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        adler32_0.adler32(0L, byteArray0, (byte)0, 5552);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.jcraft.jzlib.Adler32", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      long long0 = adler32_0.adler32((byte)0, (byte[]) null, (byte)0, (byte)0);
      assertEquals(1L, long0);
  }
}