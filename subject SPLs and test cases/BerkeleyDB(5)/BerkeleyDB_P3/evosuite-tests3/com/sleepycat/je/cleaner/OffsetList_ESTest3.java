/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:36:35 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class OffsetList_ESTest3 extends OffsetList_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      offsetList0.add((-1L), true);
      offsetList0.merge(offsetList0);
      offsetList0.add((-1L), false);
      offsetList0.merge(offsetList0);
      offsetList0.add(489L, false);
      OffsetList offsetList1 = new OffsetList();
      offsetList0.merge(offsetList1);
      offsetList0.add((-1L), false);
      offsetList0.toArray();
      offsetList0.toArray();
      offsetList0.toArray();
      offsetList0.size();
      offsetList0.add(2878L, false);
      offsetList0.size();
      // Undeclared exception!
      try { 
        offsetList0.contains(1L);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      OffsetList offsetList1 = new OffsetList();
      offsetList0.merge(offsetList1);
      offsetList1.add(0L, false);
      offsetList0.add(0L, false);
      OffsetList offsetList2 = new OffsetList();
      offsetList1.merge(offsetList2);
      offsetList0.merge(offsetList1);
      offsetList0.toArray();
      offsetList0.contains(0L);
      OffsetList offsetList3 = new OffsetList();
  }

  @Test
  public void test03()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      offsetList0.toArray();
  }

  @Test
  public void test04()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      // Undeclared exception!
      try { 
        offsetList0.merge((OffsetList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.OffsetList", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      offsetList0.add(1L, true);
      offsetList0.add((-1050L), false);
      OffsetList offsetList1 = new OffsetList();
      offsetList1.add((-213L), false);
      offsetList0.merge(offsetList1);
      offsetList1.merge(offsetList0);
      offsetList1.add(304L, false);
      offsetList0.size();
      offsetList0.size();
      offsetList0.merge(offsetList1);
      offsetList0.contains(2435L);
      offsetList0.toArray();
      offsetList0.add((-746L), true);
      offsetList0.contains(2878L);
      offsetList0.contains(3);
  }

  @Test
  public void test07()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      offsetList0.add((-1L), true);
      offsetList0.merge(offsetList0);
      offsetList0.add((-1L), false);
      offsetList0.merge(offsetList0);
      offsetList0.add(489L, false);
      offsetList0.add((-1L), false);
      offsetList0.toArray();
      // Undeclared exception!
      try { 
        offsetList0.merge(offsetList0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      OffsetList.Segment offsetList_Segment0 = new OffsetList.Segment();
      OffsetList offsetList0 = new OffsetList();
      OffsetList offsetList1 = new OffsetList();
      offsetList0.merge(offsetList1);
      offsetList0.merge(offsetList1);
      offsetList1.add(0L, false);
      offsetList0.merge(offsetList1);
      offsetList1.toArray();
      OffsetList.Segment offsetList_Segment1 = offsetList_Segment0.add(0L);
      offsetList_Segment1.add(0L);
      offsetList0.toArray();
      int int0 = offsetList1.size();
      assertEquals(1, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      OffsetList offsetList1 = new OffsetList();
      offsetList1.merge(offsetList0);
      offsetList0.merge(offsetList1);
      OffsetList.Segment offsetList_Segment0 = new OffsetList.Segment();
      offsetList_Segment0.add((-3068L));
      offsetList0.add((-1800L), false);
      boolean boolean0 = offsetList1.merge(offsetList0);
      assertEquals(1, offsetList1.size());
      assertTrue(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      OffsetList offsetList1 = new OffsetList();
      offsetList0.merge(offsetList1);
      offsetList1.add((-1587L), false);
      offsetList0.add((-543L), true);
      offsetList1.merge(offsetList0);
      offsetList1.merge(offsetList0);
      offsetList1.merge(offsetList0);
      offsetList0.merge(offsetList1);
      offsetList0.merge(offsetList1);
      offsetList0.merge(offsetList1);
      offsetList1.merge(offsetList0);
      offsetList1.merge(offsetList0);
      OffsetList.Segment offsetList_Segment0 = new OffsetList.Segment();
      OffsetList.Segment offsetList_Segment1 = new OffsetList.Segment();
      offsetList_Segment0.setNext(offsetList_Segment1);
      offsetList_Segment1.setNext(offsetList_Segment0);
      offsetList_Segment0.setNext(offsetList_Segment1);
      assertFalse(offsetList_Segment0.equals((Object)offsetList_Segment1));
  }
}
