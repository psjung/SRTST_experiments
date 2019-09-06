/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 17:04:05 KST 2018
 */

package com.jcraft.jzlib;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jcraft.jzlib.Adler32;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Adler32_ESTest4 extends Adler32_ESTest_scaffolding4 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[17];
      byteArray0[4] = (byte)1;
      long long0 = adler32_0.adler32(0L, byteArray0, 1, 16);
      assertEquals(851969L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[17];
      byteArray0[3] = (byte) (-1);
      long long0 = adler32_0.adler32(0L, byteArray0, 1, 16);
      assertEquals(233963775L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[17];
      byteArray0[1] = (byte)1;
      long long0 = adler32_0.adler32(0L, byteArray0, 1, 16);
      assertEquals(1048577L, long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[17];
      byteArray0[1] = (byte)1;
      // Undeclared exception!
      try { 
        adler32_0.adler32(0L, byteArray0, 0, 32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 17
         //
         verifyException("com.jcraft.jzlib.Adler32", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Adler32 adler32_0 = new Adler32();
      // Undeclared exception!
      try { 
        adler32_0.adler32(0, byteArray0, 0, 11104);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.jcraft.jzlib.Adler32", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[17];
      long long0 = adler32_0.adler32((-1L), byteArray0, 0, 0);
      assertEquals(4294967295L, long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[27];
      long long0 = adler32_0.adler32((byte)0, byteArray0, (byte)0, 2);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[21];
      // Undeclared exception!
      try { 
        adler32_0.adler32(0L, byteArray0, 0, 5552);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 21
         //
         verifyException("com.jcraft.jzlib.Adler32", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      long long0 = adler32_0.adler32(0, (byte[]) null, 0, 0);
      assertEquals(1L, long0);
  }
}
