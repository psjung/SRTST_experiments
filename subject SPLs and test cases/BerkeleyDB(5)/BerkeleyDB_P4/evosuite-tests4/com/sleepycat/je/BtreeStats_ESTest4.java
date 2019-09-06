/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:27:28 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.BtreeStats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class BtreeStats_ESTest4 extends BtreeStats_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setMainTreeMaxDepth(1);
      int int0 = btreeStats0.getMainTreeMaxDepth();
      assertEquals(1, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setMainTreeMaxDepth((-987));
      int int0 = btreeStats0.getMainTreeMaxDepth();
      assertEquals((-987), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setLeafNodeCount(1495);
      long long0 = btreeStats0.getLeafNodeCount();
      assertEquals(1495L, long0);
  }

  @Test
  public void test03()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setLeafNodeCount((-1L));
      long long0 = btreeStats0.getLeafNodeCount();
      assertEquals((-1L), long0);
  }

  @Test
  public void test04()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setInternalNodeCount(1089);
      long long0 = btreeStats0.getInternalNodeCount();
      assertEquals(1089L, long0);
  }

  @Test
  public void test05()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setInternalNodeCount((-1L));
      long long0 = btreeStats0.getInternalNodeCount();
      assertEquals((-1L), long0);
  }

  @Test
  public void test06()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long[] longArray0 = new long[2];
      btreeStats0.setINsByLevel(longArray0);
      long[] longArray1 = btreeStats0.getINsByLevel();
      assertSame(longArray1, longArray0);
  }

  @Test
  public void test07()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setDuplicateTreeMaxDepth(2781);
      int int0 = btreeStats0.getDuplicateTreeMaxDepth();
      assertEquals(2781, int0);
  }

  @Test
  public void test08()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setDuplicateTreeMaxDepth((-102));
      int int0 = btreeStats0.getDuplicateTreeMaxDepth();
      assertEquals((-102), int0);
  }

  @Test
  public void test09()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setDuplicateInternalNodeCount((-4002L));
      long long0 = btreeStats0.getDuplicateInternalNodeCount();
      assertEquals((-4002L), long0);
  }

  @Test
  public void test10()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setDuplicateBottomInternalNodeCount(2547L);
      long long0 = btreeStats0.getDuplicateBottomInternalNodeCount();
      assertEquals(2547L, long0);
  }

  @Test
  public void test11()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setDuplicateBottomInternalNodeCount((-29L));
      long long0 = btreeStats0.getDuplicateBottomInternalNodeCount();
      assertEquals((-29L), long0);
  }

  @Test
  public void test12()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setDupCountLeafNodeCount(1081L);
      long long0 = btreeStats0.getDupCountLeafNodeCount();
      assertEquals(1081L, long0);
  }

  @Test
  public void test13()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setDupCountLeafNodeCount((-1L));
      long long0 = btreeStats0.getDupCountLeafNodeCount();
      assertEquals((-1L), long0);
  }

  @Test
  public void test14()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setDeletedLeafNodeCount(2916L);
      long long0 = btreeStats0.getDeletedLeafNodeCount();
      assertEquals(2916L, long0);
  }

  @Test
  public void test15()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setDeletedLeafNodeCount((-107));
      long long0 = btreeStats0.getDeletedLeafNodeCount();
      assertEquals((-107L), long0);
  }

  @Test
  public void test16()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long[] longArray0 = new long[2];
      btreeStats0.setDINsByLevel(longArray0);
      long[] longArray1 = btreeStats0.getDINsByLevel();
      assertSame(longArray1, longArray0);
  }

  @Test
  public void test17()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long[] longArray0 = new long[3];
      btreeStats0.setDBINsByLevel(longArray0);
      long[] longArray1 = btreeStats0.getDBINsByLevel();
      assertArrayEquals(new long[] {0L, 0L, 0L}, longArray1);
  }

  @Test
  public void test18()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long[] longArray0 = new long[0];
      btreeStats0.setDBINsByLevel(longArray0);
      long[] longArray1 = btreeStats0.getDBINsByLevel();
      assertSame(longArray1, longArray0);
  }

  @Test
  public void test19()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setBottomInternalNodeCount(1L);
      long long0 = btreeStats0.getBottomInternalNodeCount();
      assertEquals(1L, long0);
  }

  @Test
  public void test20()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setBottomInternalNodeCount((-1L));
      long long0 = btreeStats0.getBottomInternalNodeCount();
      assertEquals((-1L), long0);
  }

  @Test
  public void test21()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long[] longArray0 = new long[6];
      btreeStats0.setBINsByLevel(longArray0);
      long[] longArray1 = btreeStats0.getBINsByLevel();
      assertSame(longArray1, longArray0);
  }

  @Test
  public void test22()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setDuplicateBottomInternalNodeCount((-938L));
      String string0 = btreeStats0.toString();
      assertEquals("numLeafNodes=0\nnumDeletedLeafNodes=0\nnumDuplicateCountLeafNodes=0\nmainTreeMaxDepth=0\nduplicateTreeMaxDepth=0\n", string0);
  }

  @Test
  public void test23()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setDuplicateInternalNodeCount((-1L));
      String string0 = btreeStats0.toString();
      assertEquals("numLeafNodes=0\nnumDeletedLeafNodes=0\nnumDuplicateCountLeafNodes=0\nmainTreeMaxDepth=0\nduplicateTreeMaxDepth=0\n", string0);
  }

  @Test
  public void test24()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setInternalNodeCount((-2001L));
      String string0 = btreeStats0.toString();
      assertEquals("numLeafNodes=0\nnumDeletedLeafNodes=0\nnumDuplicateCountLeafNodes=0\nmainTreeMaxDepth=0\nduplicateTreeMaxDepth=0\n", string0);
  }

  @Test
  public void test25()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setBottomInternalNodeCount((-946L));
      String string0 = btreeStats0.toString();
      assertEquals("numLeafNodes=0\nnumDeletedLeafNodes=0\nnumDuplicateCountLeafNodes=0\nmainTreeMaxDepth=0\nduplicateTreeMaxDepth=0\n", string0);
  }

  @Test
  public void test26()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long[] longArray0 = new long[2];
      longArray0[1] = (-1304L);
      btreeStats0.setINsByLevel(longArray0);
      btreeStats0.setInternalNodeCount(2500L);
      btreeStats0.toString();
      assertEquals(2500L, btreeStats0.getInternalNodeCount());
  }

  @Test
  public void test27()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setDuplicateBottomInternalNodeCount(2547L);
      // Undeclared exception!
      try { 
        btreeStats0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.BtreeStats", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setDuplicateInternalNodeCount(1L);
      // Undeclared exception!
      try { 
        btreeStats0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.BtreeStats", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setBottomInternalNodeCount(1L);
      long[] longArray0 = new long[3];
      longArray0[0] = 1L;
      btreeStats0.setBINsByLevel(longArray0);
      btreeStats0.toString();
      assertEquals(1L, btreeStats0.getBottomInternalNodeCount());
  }

  @Test
  public void test30()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      btreeStats0.setDuplicateInternalNodeCount(770L);
      long long0 = btreeStats0.getDuplicateInternalNodeCount();
      assertEquals(770L, long0);
  }

  @Test
  public void test31()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long[] longArray0 = btreeStats0.getDINsByLevel();
      assertNull(longArray0);
  }

  @Test
  public void test32()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long long0 = btreeStats0.getLeafNodeCount();
      assertEquals(0L, long0);
  }

  @Test
  public void test33()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long[] longArray0 = btreeStats0.getBINsByLevel();
      assertNull(longArray0);
  }

  @Test
  public void test34()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long long0 = btreeStats0.getBottomInternalNodeCount();
      assertEquals(0L, long0);
  }

  @Test
  public void test35()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long long0 = btreeStats0.getDeletedLeafNodeCount();
      assertEquals(0L, long0);
  }

  @Test
  public void test36()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      int int0 = btreeStats0.getMainTreeMaxDepth();
      assertEquals(0, int0);
  }

  @Test
  public void test37()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long[] longArray0 = new long[0];
      btreeStats0.setBINsByLevel(longArray0);
      long[] longArray1 = btreeStats0.getBINsByLevel();
      assertArrayEquals(new long[] {}, longArray1);
  }

  @Test
  public void test38()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      int int0 = btreeStats0.getDuplicateTreeMaxDepth();
      assertEquals(0, int0);
  }

  @Test
  public void test39()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long[] longArray0 = btreeStats0.getINsByLevel();
      assertNull(longArray0);
  }

  @Test
  public void test40()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long long0 = btreeStats0.getDupCountLeafNodeCount();
      assertEquals(0L, long0);
  }

  @Test
  public void test41()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long long0 = btreeStats0.getDuplicateInternalNodeCount();
      assertEquals(0L, long0);
  }

  @Test
  public void test42()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long[] longArray0 = btreeStats0.getDBINsByLevel();
      assertNull(longArray0);
  }

  @Test
  public void test43()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long long0 = btreeStats0.getDuplicateBottomInternalNodeCount();
      assertEquals(0L, long0);
  }

  @Test
  public void test44()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long[] longArray0 = new long[0];
      btreeStats0.setDINsByLevel(longArray0);
      long[] longArray1 = btreeStats0.getDINsByLevel();
      assertArrayEquals(new long[] {}, longArray1);
  }

  @Test
  public void test45()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long[] longArray0 = new long[0];
      btreeStats0.setINsByLevel(longArray0);
      long[] longArray1 = btreeStats0.getINsByLevel();
      assertArrayEquals(new long[] {}, longArray1);
  }

  @Test
  public void test46()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long long0 = btreeStats0.getInternalNodeCount();
      assertEquals(0L, long0);
  }
}
