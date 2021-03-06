/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 13:59:31 KST 2018
 */

package com.jcraft.jzlib;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Tree_ESTest6 extends Tree_ESTest_scaffolding6 {
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
      int int0 = Tree.d_code(0);
      assertEquals(0, int0);
      
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      short[] shortArray0 = new short[15];
      short short0 = (short) (-3373);
      tree0.stat_desc = null;
      shortArray0[0] = (short) (-3373);
      tree0.dyn_tree = shortArray0;
      StaticTree staticTree0 = StaticTree.static_l_desc;
      assertNotNull(staticTree0);
      
      tree0.stat_desc = staticTree0;
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      // Undeclared exception!
      try { 
        tree0.build_tree(deflate0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Tree.d_code(745);
      //  // Unstable assertion: assertEquals(18, int0);
      
      Tree tree0 = new Tree();
      //  // Unstable assertion: assertNotNull(tree0);
      
      StaticTree staticTree0 = StaticTree.static_bl_desc;
      //  // Unstable assertion: assertNotNull(staticTree0);
      
      tree0.stat_desc = staticTree0;
      tree0.max_code = (-438);
      Deflate deflate0 = new Deflate();
      //  // Unstable assertion: assertNotNull(deflate0);
      
      deflate0.heap_max = 745;
      deflate0.matches = 745;
      StaticTree staticTree1 = StaticTree.static_d_desc;
      //  // Unstable assertion: assertNotNull(staticTree1);
      //  // Unstable assertion: assertSame(staticTree1, staticTree0);
      
      int int1 = Tree.bi_reverse(40, 243);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertEquals(0, int1);
      
      tree0.stat_desc = staticTree1;
      // Undeclared exception!
      try { 
        tree0.build_tree(deflate0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      deflate0.method = (byte) (-48);
      StaticTree staticTree0 = StaticTree.static_bl_desc;
      assertNotNull(staticTree0);
      
      tree0.max_code = (int) (byte) (-48);
      tree0.stat_desc = staticTree0;
      short[] shortArray0 = new short[3];
      shortArray0[0] = (short) (byte) (-48);
      shortArray0[1] = (short) (byte) (-48);
      shortArray0[2] = (short) (byte) (-48);
      tree0.dyn_tree = shortArray0;
      // Undeclared exception!
      try { 
        tree0.gen_bitlen(deflate0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Tree.d_code(745);
      //  // Unstable assertion: assertEquals(18, int0);
      
      Tree tree0 = new Tree();
      //  // Unstable assertion: assertNotNull(tree0);
      
      StaticTree staticTree0 = StaticTree.static_bl_desc;
      //  // Unstable assertion: assertNotNull(staticTree0);
      
      tree0.stat_desc = staticTree0;
      Deflate deflate0 = new Deflate();
      //  // Unstable assertion: assertNotNull(deflate0);
      
      deflate0.heap_max = 745;
      deflate0.matches = 745;
      StaticTree staticTree1 = StaticTree.static_d_desc;
      //  // Unstable assertion: assertNotNull(staticTree1);
      //  // Unstable assertion: assertSame(staticTree1, staticTree0);
      
      tree0.stat_desc = staticTree1;
      short[] shortArray0 = new short[5];
      shortArray0[0] = (short) (-2326);
      shortArray0[1] = (short)11;
      shortArray0[2] = (short)2030;
      shortArray0[3] = (short)731;
      shortArray0[4] = (short)1310;
      tree0.dyn_tree = shortArray0;
      // Undeclared exception!
      try { 
        tree0.build_tree(deflate0);
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = Tree.d_code(0);
      assertEquals(0, int0);
      
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      short[] shortArray0 = new short[1];
      tree0.stat_desc = null;
      shortArray0[0] = (short) (-3381);
      tree0.dyn_tree = shortArray0;
      StaticTree staticTree0 = StaticTree.static_l_desc;
      assertNotNull(staticTree0);
      
      tree0.stat_desc = staticTree0;
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      // Undeclared exception!
      try { 
        tree0.build_tree(deflate0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      byte byte0 = (byte) (-48);
      StaticTree staticTree0 = StaticTree.static_bl_desc;
      assertNotNull(staticTree0);
      
      tree0.stat_desc = staticTree0;
      short[] shortArray0 = new short[3];
      shortArray0[0] = (short) (byte) (-48);
      shortArray0[2] = (short) (byte)0;
      tree0.dyn_tree = shortArray0;
      // Undeclared exception!
      try { 
        tree0.gen_bitlen(deflate0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      byte byte0 = (byte) (-48);
      deflate0.method = (byte) (-48);
      StaticTree staticTree0 = StaticTree.static_bl_desc;
      assertNotNull(staticTree0);
      
      deflate0.pending_out = 13;
      short[] shortArray0 = new short[8];
      shortArray0[0] = (short) (byte) (-48);
      shortArray0[1] = (short) (byte) (-48);
      shortArray0[2] = (short) (byte) (-48);
      shortArray0[3] = (short) (byte) (-48);
      shortArray0[4] = (short) (byte) (-48);
      shortArray0[5] = (short) (byte) (-48);
      shortArray0[6] = (short) (byte) (-48);
      shortArray0[7] = (short) (byte) (-48);
      tree0.dyn_tree = shortArray0;
      tree0.stat_desc = staticTree0;
      short[] shortArray1 = new short[3];
      assertFalse(shortArray1.equals((Object)shortArray0));
      
      shortArray1[0] = (short) (byte) (-48);
      shortArray1[1] = (short) (byte) (-48);
      shortArray1[2] = (short) (byte) (-48);
      tree0.dyn_tree = shortArray1;
      // Undeclared exception!
      try { 
        tree0.gen_bitlen(deflate0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      byte byte0 = (byte) (-48);
      deflate0.method = (byte) (-48);
      StaticTree staticTree0 = StaticTree.static_bl_desc;
      assertNotNull(staticTree0);
      
      tree0.stat_desc = staticTree0;
      short[] shortArray0 = new short[4];
      shortArray0[0] = (short) (byte) (-48);
      shortArray0[1] = (short) (byte) (-48);
      shortArray0[2] = (short) (byte) (-48);
      tree0.dyn_tree = shortArray0;
      tree0.gen_bitlen(deflate0);
      int int0 = (-2639);
      int int1 = Tree.bi_reverse(13, (-2639));
      assertFalse(int1 == int0);
      assertEquals(1, int1);
      
      tree0.gen_bitlen(deflate0);
      // Undeclared exception!
      try { 
        deflate0._tr_align();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Deflate", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      StaticTree staticTree0 = StaticTree.static_bl_desc;
      assertNotNull(staticTree0);
      
      tree0.stat_desc = staticTree0;
      short[] shortArray0 = new short[3];
      shortArray0[1] = (short) (byte)0;
      shortArray0[1] = (short) (byte)0;
      tree0.dyn_tree = shortArray0;
      int int0 = (-2639);
      int int1 = Tree.bi_reverse(13, (-2639));
      assertFalse(int1 == int0);
      assertEquals(1, int1);
      
      // Undeclared exception!
      try { 
        tree0.gen_bitlen(deflate0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = Tree.bi_reverse(453, 453);
      assertEquals(0, int0);
      
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      short[] shortArray0 = new short[3];
      shortArray0[0] = (short)873;
      shortArray0[1] = (short)873;
      int int1 = Tree.bi_reverse(472, 264);
      assertTrue(int1 == int0);
      assertEquals(0, int1);
      
      int int2 = Tree.d_code((short)873);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(19, int2);
      
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)61;
      byteArray0[1] = (byte) (-103);
      byteArray0[2] = (byte)0;
      deflate0.window = byteArray0;
      shortArray0[2] = (short)873;
      Tree tree0 = deflate0.bl_desc;
      assertNotNull(tree0);
      
      tree0.dyn_tree = shortArray0;
      tree0.dyn_tree = shortArray0;
      StaticTree staticTree0 = StaticTree.static_d_desc;
      assertNotNull(staticTree0);
      
      int[] intArray0 = new int[1];
      intArray0[0] = 453;
      deflate0.heap = intArray0;
      tree0.stat_desc = staticTree0;
      StaticTree.static_bl_desc = staticTree0;
      deflate0.matches = 392;
      // Undeclared exception!
      try { 
        tree0.build_tree(deflate0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      byte byte0 = (byte) (-48);
      deflate0.method = (byte) (-48);
      StaticTree staticTree0 = StaticTree.static_bl_desc;
      assertNotNull(staticTree0);
      
      tree0.stat_desc = staticTree0;
      short[] shortArray0 = new short[3];
      shortArray0[0] = (short) (byte) (-48);
      shortArray0[1] = (short) (byte) (-48);
      shortArray0[2] = (short) (byte) (-48);
      tree0.dyn_tree = shortArray0;
      // Undeclared exception!
      try { 
        tree0.gen_bitlen(deflate0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      Tree tree0 = deflate0.d_desc;
      assertNotNull(tree0);
      
      short[] shortArray0 = new short[7];
      shortArray0[0] = (short)0;
      shortArray0[1] = (short)3943;
      shortArray0[2] = (short)0;
      shortArray0[3] = (short) (-1495);
      shortArray0[4] = (short) (-4442);
      shortArray0[5] = (short)1506;
      shortArray0[6] = (short)340;
      int[] intArray0 = new int[2];
      intArray0[0] = (int) (short)1506;
      intArray0[1] = (int) (short)0;
      StaticTree staticTree0 = new StaticTree(shortArray0, intArray0, (short) (-4442), (short)0, 1506);
      assertArrayEquals(new short[] {(short)0, (short)3943, (short)0, (short) (-1495), (short) (-4442), (short)1506, (short)340}, shortArray0);
      assertArrayEquals(new int[] {1506, 0}, intArray0);
      assertNotNull(staticTree0);
      assertEquals(7, shortArray0.length);
      assertEquals(2, intArray0.length);
      
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
  public void test12()  throws Throwable  {
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      Tree tree0 = deflate0.d_desc;
      assertNotNull(tree0);
      
      short[] shortArray0 = new short[9];
      shortArray0[0] = (short) (-3671);
      shortArray0[1] = (short) (-42);
      shortArray0[2] = (short)285;
      shortArray0[3] = (short)308;
      shortArray0[4] = (short)1418;
      shortArray0[5] = (short)0;
      shortArray0[6] = (short)337;
      shortArray0[7] = (short)0;
      shortArray0[8] = (short)724;
      int[] intArray0 = new int[3];
      intArray0[0] = 397;
      intArray0[1] = 493;
      intArray0[2] = (int) (short)1418;
      StaticTree staticTree0 = new StaticTree(shortArray0, intArray0, (short)0, (short)724, 467);
      assertArrayEquals(new short[] {(short) (-3671), (short) (-42), (short)285, (short)308, (short)1418, (short)0, (short)337, (short)0, (short)724}, shortArray0);
      assertArrayEquals(new int[] {397, 493, 1418}, intArray0);
      assertNotNull(staticTree0);
      assertEquals(9, shortArray0.length);
      assertEquals(3, intArray0.length);
      
      tree0.stat_desc = staticTree0;
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
  public void test13()  throws Throwable  {
      int int0 = 789;
      int int1 = Tree.bi_reverse(789, 789);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
      
      short[] shortArray0 = null;
      // Undeclared exception!
      try { 
        Tree.gen_codes((short[]) null, 473, (short[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = Tree.bi_reverse((-1019), (-1019));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = Tree.bi_reverse(650, 650);
      assertEquals(0, int0);
      
      short[] shortArray0 = new short[6];
      shortArray0[0] = (short)607;
      shortArray0[1] = (short)0;
      shortArray0[2] = (short)2435;
      shortArray0[3] = (short)157;
      shortArray0[4] = (short)76;
      shortArray0[5] = (short)1247;
      // Undeclared exception!
      try { 
        Tree.gen_codes(shortArray0, 349, shortArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = 65280;
      // Undeclared exception!
      Tree.bi_reverse(65280, 65280);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      deflate0.set_data_type();
      Tree tree0 = deflate0.d_desc;
      assertNotNull(tree0);
      
      StaticTree staticTree0 = StaticTree.static_bl_desc;
      assertNotNull(staticTree0);
      
      tree0.stat_desc = staticTree0;
      deflate0.data_type = (byte)116;
      tree0.max_code = 0;
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
  public void test18()  throws Throwable  {
      int int0 = Tree.bi_reverse(419, 419);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      // Undeclared exception!
      try { 
        Tree.d_code((-1023));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1023
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = 232;
      int int1 = Tree.d_code(232);
      assertFalse(int1 == int0);
      assertEquals(15, int1);
      
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
  public void test21()  throws Throwable  {
      int int0 = 1536;
      int int1 = Tree.d_code(1536);
      assertFalse(int1 == int0);
      assertEquals(21, int1);
      
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
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
  public void test22()  throws Throwable  {
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      ZStream zStream0 = new ZStream();
      assertNotNull(zStream0);
      assertEquals(0, zStream0.avail_out);
      assertEquals(0, zStream0.next_out_index);
      assertEquals(0L, zStream0.adler);
      assertEquals(0L, zStream0.total_out);
      assertEquals(0, zStream0.next_in_index);
      assertEquals(0L, zStream0.total_in);
      assertEquals(0, zStream0.avail_in);
      
      Deflate deflate0 = zStream0.dstate;
      assertNull(deflate0);
      
      // Undeclared exception!
      try { 
        tree0.gen_bitlen((Deflate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      Tree tree0 = deflate0.d_desc;
      assertNotNull(tree0);
      
      StaticTree staticTree0 = tree0.stat_desc;
      assertNull(staticTree0);
      
      tree0.stat_desc = null;
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
  public void test24()  throws Throwable  {
      int int0 = Tree.d_code(440);
      assertEquals(17, int0);
      
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      short[] shortArray0 = new short[1];
      shortArray0[0] = (short)1039;
      short[] shortArray1 = new short[8];
      assertFalse(shortArray1.equals((Object)shortArray0));
      
      shortArray1[0] = (short)1039;
      shortArray1[1] = (short)1039;
      shortArray1[2] = (short)1039;
      shortArray1[3] = (short) (-735);
      shortArray1[4] = (short)1039;
      shortArray1[5] = (short)1039;
      shortArray1[6] = (short)1039;
      shortArray1[7] = (short)1039;
      // Undeclared exception!
      try { 
        Tree.gen_codes(shortArray0, 450, shortArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        Tree.gen_codes(shortArray0, 2923, shortArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = Tree.d_code(0);
      assertEquals(0, int0);
      
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      StaticTree staticTree0 = StaticTree.static_d_desc;
      assertNotNull(staticTree0);
      
      StaticTree.static_l_desc = staticTree0;
      tree0.stat_desc = staticTree0;
      int int1 = Tree.bi_reverse(0, 0);
      assertTrue(int1 == int0);
      assertEquals(0, int1);
      
      int int2 = Tree.d_code(0);
      assertTrue(int2 == int1);
      assertTrue(int2 == int0);
      assertEquals(0, int2);
      
      short[] shortArray0 = new short[7];
      shortArray0[0] = (short)99;
      shortArray0[1] = (short)1008;
      shortArray0[2] = (short)0;
      shortArray0[3] = (short)395;
      shortArray0[4] = (short)294;
      shortArray0[5] = (short)0;
      shortArray0[6] = (short)165;
      short[] shortArray1 = new short[18];
      assertFalse(shortArray1.equals((Object)shortArray0));
      
      shortArray1[0] = (short)395;
      // Undeclared exception!
      try { 
        Tree.gen_codes(shortArray0, 339, shortArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1008
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = Tree.bi_reverse(293, 293);
      assertEquals(0, int0);
      
      int int1 = Tree.bi_reverse(0, 318);
      assertTrue(int1 == int0);
      assertEquals(0, int1);
      
      int int2 = Tree.d_code(293);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(16, int2);
      
      int int3 = Tree.d_code(16);
      assertFalse(int3 == int0);
      assertFalse(int3 == int1);
      assertFalse(int3 == int2);
      assertEquals(8, int3);
      
      short[] shortArray0 = new short[9];
      shortArray0[0] = (short)26;
      shortArray0[1] = (short)4912;
      shortArray0[2] = (short)1804;
      shortArray0[3] = (short)338;
      shortArray0[4] = (short)13;
      shortArray0[5] = (short)2107;
      shortArray0[6] = (short) (-1468);
      shortArray0[7] = (short)24;
      shortArray0[8] = (short) (-958);
      // Undeclared exception!
      try { 
        Tree.gen_codes(shortArray0, 411, shortArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = Tree.d_code(745);
      //  // Unstable assertion: assertEquals(18, int0);
      
      Tree tree0 = new Tree();
      //  // Unstable assertion: assertNotNull(tree0);
      
      StaticTree staticTree0 = StaticTree.static_bl_desc;
      //  // Unstable assertion: assertNotNull(staticTree0);
      
      tree0.stat_desc = staticTree0;
      Deflate deflate0 = new Deflate();
      //  // Unstable assertion: assertNotNull(deflate0);
      
      deflate0.heap_max = 745;
      StaticTree.static_l_desc = tree0.stat_desc;
      deflate0.matches = 745;
      StaticTree staticTree1 = StaticTree.static_d_desc;
      //  // Unstable assertion: assertFalse(staticTree1.equals((Object)staticTree0));
      //  // Unstable assertion: assertNotNull(staticTree1);
      //  // Unstable assertion: assertNotSame(staticTree1, staticTree0);
      
      tree0.stat_desc = staticTree1;
      StaticTree staticTree2 = StaticTree.static_d_desc;
      //  // Unstable assertion: assertFalse(staticTree2.equals((Object)staticTree0));
      //  // Unstable assertion: assertNotNull(staticTree2);
      //  // Unstable assertion: assertSame(staticTree2, staticTree1);
      //  // Unstable assertion: assertNotSame(staticTree2, staticTree0);
      
      StaticTree.static_bl_desc = staticTree2;
      // Undeclared exception!
      try { 
        tree0.build_tree(deflate0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = Tree.d_code(745);
      //  // Unstable assertion: assertEquals(18, int0);
      
      Tree tree0 = new Tree();
      //  // Unstable assertion: assertNotNull(tree0);
      
      StaticTree staticTree0 = StaticTree.static_bl_desc;
      //  // Unstable assertion: assertNotNull(staticTree0);
      
      tree0.stat_desc = staticTree0;
      Deflate deflate0 = new Deflate();
      //  // Unstable assertion: assertNotNull(deflate0);
      
      deflate0.heap_max = 745;
      deflate0.matches = 745;
      StaticTree staticTree1 = StaticTree.static_d_desc;
      //  // Unstable assertion: assertFalse(staticTree1.equals((Object)staticTree0));
      //  // Unstable assertion: assertNotNull(staticTree1);
      //  // Unstable assertion: assertNotSame(staticTree1, staticTree0);
      
      tree0.stat_desc = staticTree1;
      // Undeclared exception!
      try { 
        tree0.build_tree(deflate0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Tree", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      short[] shortArray0 = new short[9];
      shortArray0[0] = (short)0;
      shortArray0[1] = (short)2139;
      shortArray0[2] = (short)2449;
      shortArray0[3] = (short)0;
      shortArray0[4] = (short)39;
      shortArray0[1] = (short)0;
      shortArray0[6] = (short) (-2980);
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-3);
      deflate0.window = byteArray0;
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
  public void test31()  throws Throwable  {
      Tree tree0 = new Tree();
      assertNotNull(tree0);
      
      Deflate deflate0 = new Deflate();
      assertNotNull(deflate0);
      
      byte byte0 = (byte) (-48);
      deflate0.method = (byte) (-48);
      StaticTree staticTree0 = StaticTree.static_bl_desc;
      assertNotNull(staticTree0);
      
      tree0.stat_desc = staticTree0;
      short[] shortArray0 = new short[4];
      shortArray0[0] = (short) (byte) (-48);
      shortArray0[1] = (short) (byte) (-48);
      shortArray0[2] = (short) (byte) (-48);
      tree0.dyn_tree = shortArray0;
      tree0.gen_bitlen(deflate0);
      int int0 = (-2639);
      int int1 = Tree.bi_reverse(13, (-2639));
      assertFalse(int1 == int0);
      assertEquals(1, int1);
      
      staticTree0.max_length = 427;
      tree0.gen_bitlen(deflate0);
      tree0.gen_bitlen(deflate0);
      // Undeclared exception!
      try { 
        deflate0._tr_align();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jcraft.jzlib.Deflate", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Tree.bi_reverse(2520, 2520);
      Tree tree0 = new Tree();
      Deflate deflate0 = new Deflate();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-20);
      byteArray0[4] = (byte)53;
      byteArray0[5] = (byte)7;
      byteArray0[6] = (byte)53;
      deflate0.window = byteArray0;
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
  public void test33()  throws Throwable  {
      int int0 = Tree.d_code(767);
      assertEquals(18, int0);
  }
}
