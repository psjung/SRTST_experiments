/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 13:55:38 KST 2018
 */

package com.jcraft.jzlib;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class InfTree_ESTest6 extends InfTree_ESTest_scaffolding6 {
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
      int[][] intArray1 = new int[6][3];
      int int0 = InfTree.inflate_trees_fixed(intArray0, intArray0, intArray1, intArray1, (ZStream) null);
      assertArrayEquals(new int[] {5, 0, 0, 0, 0}, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[][] intArray0 = new int[6][5];
      ZStream zStream0 = new ZStream();
      // Undeclared exception!
      try { 
        InfTree.inflate_trees_fixed((int[]) null, (int[]) null, intArray0, intArray0, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InfTree infTree0 = new InfTree();
      ZStream zStream0 = new ZStream();
      // Undeclared exception!
      try { 
        infTree0.inflate_trees_bits((int[]) null, (int[]) null, (int[]) null, infTree0.c, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InfTree infTree0 = new InfTree();
      int[] intArray0 = new int[5];
      ZStream zStream0 = new ZStream();
      // Undeclared exception!
      try { 
        infTree0.inflate_trees_bits(intArray0, intArray0, intArray0, intArray0, zStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.jcraft.jzlib.InfTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[2];
      int[][] intArray1 = new int[4][7];
      InfTree infTree0 = new InfTree();
      infTree0.hn = intArray0;
      infTree0.v = intArray0;
      // Undeclared exception!
      try { 
        infTree0.inflate_trees_dynamic(0, 0, intArray0, intArray0, intArray0, intArray0, intArray1[3], intArray0, (ZStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      InfTree infTree0 = new InfTree();
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        infTree0.inflate_trees_dynamic(0, 0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (ZStream) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.jcraft.jzlib.InfTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[][] intArray1 = new int[5][7];
      ZStream zStream0 = new ZStream();
      // Undeclared exception!
      try { 
        InfTree.inflate_trees_fixed(intArray0, intArray0, intArray1, intArray1, zStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.jcraft.jzlib.InfTree", e);
      }
  }
}