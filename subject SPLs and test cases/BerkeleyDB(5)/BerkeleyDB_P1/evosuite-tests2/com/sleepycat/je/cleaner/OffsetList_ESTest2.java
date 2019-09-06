/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:16:55 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class OffsetList_ESTest2 extends OffsetList_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      offsetList0.add((-1L), true);
      offsetList0.size();
  }

  @Test
  public void test01()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      offsetList0.merge(offsetList0);
  }

  @Test
  public void test02()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      offsetList0.add((-1L), true);
      offsetList0.contains((-1L));
  }

  @Test
  public void test03()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      offsetList0.add((-1L), true);
      offsetList0.add(2374L, true);
  }

  @Test
  public void test04()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      offsetList0.add(2946L, true);
      offsetList0.merge(offsetList0);
      offsetList0.toArray();
  }

  @Test
  public void test05()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      // Undeclared exception!
      try { 
        offsetList0.merge((OffsetList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      offsetList0.add(803L, false);
      offsetList0.merge(offsetList0);
      offsetList0.merge(offsetList0);
      offsetList0.add(0L, true);
  }

  @Test
  public void test07()  throws Throwable  {
      OffsetList.Segment offsetList_Segment0 = new OffsetList.Segment();
      OffsetList.Segment offsetList_Segment1 = new OffsetList.Segment();
      offsetList_Segment1.setNext(offsetList_Segment0);
  }

  @Test
  public void test08()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      offsetList0.add(2946L, true);
      offsetList0.contains((-5455L));
  }

  @Test
  public void test09()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      offsetList0.toArray();
  }

  @Test
  public void test11()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      offsetList0.size();
  }
}
