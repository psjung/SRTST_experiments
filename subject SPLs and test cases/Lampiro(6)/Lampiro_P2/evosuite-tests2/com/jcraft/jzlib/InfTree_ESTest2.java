/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 10:40:18 KST 2018
 */

package com.jcraft.jzlib;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class InfTree_ESTest2 extends InfTree_ESTest_scaffolding2 {
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
      int[] intArray0 = new int[0];
      int[][] intArray1 = new int[1][2];
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

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InfTree infTree0 = new InfTree();
      // Undeclared exception!
      try { 
        infTree0.inflate_trees_dynamic(0, 0, infTree0.hn, infTree0.hn, infTree0.hn, infTree0.hn, infTree0.hn, infTree0.hn, (ZStream) null);
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
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      InfTree infTree0 = infBlocks0.inftree;
      int[] intArray0 = new int[21];
      infTree0.inflate_trees_bits(intArray0, intArray0, intArray0, intArray0, zStream0);
      // Undeclared exception!
      try { 
        infTree0.inflate_trees_dynamic(0, 0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, zStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 21
         //
         verifyException("com.jcraft.jzlib.InfTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      InfTree infTree0 = infBlocks0.inftree;
      int[] intArray0 = new int[21];
      int int0 = infTree0.inflate_trees_dynamic(1, 0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, zStream0);
      int int1 = infTree0.inflate_trees_bits(intArray0, intArray0, intArray0, intArray0, zStream0);
      assertTrue(int1 == int0);
      assertEquals((-3), int1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[][] intArray0 = new int[1][8];
      ZStream zStream0 = new ZStream();
      int[] intArray1 = new int[20];
      InfTree infTree0 = new InfTree();
      int[] intArray2 = new int[5];
      InfTree.inflate_trees_fixed(intArray2, intArray1, intArray0, intArray0, zStream0);
      // Undeclared exception!
      try { 
        infTree0.inflate_trees_bits(intArray1, intArray2, intArray1, intArray2, zStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[][] intArray0 = new int[1][8];
      ZStream zStream0 = new ZStream();
      int[] intArray1 = new int[20];
      InfTree.inflate_trees_fixed(intArray1, intArray1, intArray0, intArray0, zStream0);
      InfTree infTree0 = new InfTree();
      int[] intArray2 = new int[5];
      // Undeclared exception!
      try { 
        infTree0.inflate_trees_bits(intArray1, intArray2, intArray1, intArray2, zStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ZStream zStream0 = new ZStream();
      InfBlocks infBlocks0 = new InfBlocks(zStream0, (Object) null, 0);
      InfTree infTree0 = infBlocks0.inftree;
      int[] intArray0 = new int[21];
      int[][] intArray1 = new int[2][4];
      InfTree.inflate_trees_fixed(intArray0, intArray0, intArray1, intArray1, zStream0);
      int int0 = infTree0.inflate_trees_bits(intArray0, intArray0, intArray1[0], intArray1[0], zStream0);
      assertEquals((-3), int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InfTree infTree0 = new InfTree();
      ZStream zStream0 = new ZStream();
      // Undeclared exception!
      try { 
        infTree0.inflate_trees_bits((int[]) null, (int[]) null, (int[]) null, (int[]) null, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int[] intArray0 = new int[1];
      ZStream zStream0 = new ZStream();
      // Undeclared exception!
      try { 
        InfTree.inflate_trees_fixed(intArray0, intArray0, (int[][]) null, (int[][]) null, zStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.InfTree", e);
      }
  }
}
