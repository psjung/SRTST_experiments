/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:45:31 KST 2018
 */

package com.substanceofcode.utils;

import static org.junit.Assert.assertArrayEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class SortUtil_ESTest5 extends SortUtil_ESTest_scaffolding5 {
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
      int[] intArray0 = new int[5];
      long[] longArray0 = new long[9];
      SortUtil.sortLongs(intArray0, longArray0, 0, 2);
      assertEquals(5, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[5];
      long[] longArray0 = new long[9];
      SortUtil.sortLongs(intArray0, longArray0, 0, (-1));
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      long[] longArray0 = new long[9];
      // Undeclared exception!
      try { 
        SortUtil.sortLongs((int[]) null, longArray0, 0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.utils.SortUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[1] = 1;
      long[] longArray0 = new long[8];
      longArray0[0] = (long) 1;
      SortUtil.sortLongs(intArray0, longArray0, 0, 2);
      assertArrayEquals(new int[] {1, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[1] = 1;
      long[] longArray0 = new long[9];
      longArray0[0] = (long) 1;
      SortUtil.sortLongs(intArray0, longArray0, 0, 1);
      SortUtil.sortLongs(intArray0, longArray0, 0, 2);
      assertArrayEquals(new int[] {1, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[7];
      long[] longArray0 = new long[3];
      // Undeclared exception!
      try { 
        SortUtil.sortLongs(intArray0, longArray0, (-69), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -34
         //
         verifyException("com.substanceofcode.utils.SortUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[7];
      long[] longArray0 = new long[3];
      SortUtil.sortLongs(intArray0, longArray0, 0, 0);
      assertEquals(7, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SortUtil sortUtil0 = new SortUtil();
  }
}
