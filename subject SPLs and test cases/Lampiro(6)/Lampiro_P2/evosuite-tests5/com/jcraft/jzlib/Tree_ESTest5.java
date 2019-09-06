/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 17:05:55 KST 2018
 */

package com.jcraft.jzlib;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jcraft.jzlib.Deflate;
import com.jcraft.jzlib.StaticTree;
import com.jcraft.jzlib.Tree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Tree_ESTest5 extends Tree_ESTest_scaffolding5 {
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
      short[] shortArray0 = new short[9];
      shortArray0[1] = (short)1;
      // Undeclared exception!
      try { 
        Tree.gen_codes(shortArray0, 0, shortArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      short[] shortArray0 = new short[8];
      short[] shortArray1 = new short[1];
      assertFalse(shortArray1.equals((Object)shortArray0));
      
      // Undeclared exception!
      try { 
        Tree.gen_codes(shortArray0, 0, shortArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      short[] shortArray0 = new short[3];
      StaticTree staticTree0 = new StaticTree(shortArray0, (int[]) null, (short)0, 4, 0);
      assertEquals(3, shortArray0.length);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0}, shortArray0);
      assertNotNull(staticTree0);
      
      tree0.stat_desc = staticTree0;
      short[] shortArray1 = new short[9];
      assertFalse(shortArray1.equals((Object)shortArray0));
      
      shortArray1[6] = (short) (-1);
      tree0.dyn_tree = shortArray1;
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      // Undeclared exception!
      try { 
        tree0.build_tree(deflate0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      Tree tree0 = deflate0.l_desc;
      assertNotNull(tree0);
      
      short[] shortArray0 = new short[6];
      int[] intArray0 = new int[8];
      StaticTree staticTree0 = new StaticTree(shortArray0, intArray0, (short)0, (-1), 0);
      assertEquals(6, shortArray0.length);
      assertEquals(8, intArray0.length);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertNotNull(staticTree0);
      
      tree0.stat_desc = staticTree0;
      // Undeclared exception!
      try { 
        tree0.build_tree(deflate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = Tree.d_code(257);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = Tree.bi_reverse((-379), 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tree.gen_codes((short[]) null, 0, (short[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      Tree tree0 = deflate0.d_desc;
      assertNotNull(tree0);
      
      // Undeclared exception!
      try { 
        tree0.gen_bitlen(deflate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tree.d_code((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = Tree.bi_reverse(0, 2);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      short[] shortArray0 = new short[15];
      Tree.gen_codes(shortArray0, 0, shortArray0);
      assertEquals(15, shortArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Tree tree0 = new Tree();
      short[] shortArray0 = new short[3];
      StaticTree staticTree0 = new StaticTree(shortArray0, (int[]) null, (short)0, 3, 0);
      tree0.stat_desc = staticTree0;
      short[] shortArray1 = new short[9];
      shortArray1[4] = (short)1;
      tree0.dyn_tree = shortArray1;
      Deflate deflate0 = new Deflate();
      // Undeclared exception!
      try { 
        tree0.build_tree(deflate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Deflate deflate0 = new Deflate();
      Tree tree0 = deflate0.l_desc;
      short[] shortArray0 = new short[6];
      int[] intArray0 = new int[8];
      tree0.max_code = (int) (short) (-1);
      tree0.dyn_tree = shortArray0;
      StaticTree staticTree0 = new StaticTree(shortArray0, intArray0, (short)0, 0, (short)0);
      tree0.stat_desc = staticTree0;
      // Undeclared exception!
      try { 
        tree0.gen_bitlen(deflate0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Deflate deflate0 = new Deflate();
      Tree tree0 = deflate0.bl_desc;
      short[] shortArray0 = new short[7];
      tree0.dyn_tree = shortArray0;
      StaticTree staticTree0 = StaticTree.static_d_desc;
      tree0.stat_desc = staticTree0;
      // Undeclared exception!
      try { 
        tree0.build_tree(deflate0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = Tree.d_code(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = Tree.d_code(256);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Deflate deflate0 = new Deflate();
      deflate0.tr_init();
      Tree tree0 = deflate0.bl_desc;
      tree0.gen_bitlen(deflate0);
  }
}
