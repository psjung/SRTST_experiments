/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:12:08 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TrackedFileSummary_ESTest4 extends TrackedFileSummary_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, false);
      trackedFileSummary0.getFileNumber();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test01()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, false);
      assertTrue(trackedFileSummary0.getAllowFlush());
      
      trackedFileSummary0.setAllowFlush(false);
      boolean boolean0 = trackedFileSummary0.getAllowFlush();
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      trackedFileSummary0.totalCount = (-13);
      trackedFileSummary0.hook168();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test16()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      trackedFileSummary0.totalINSize = 875;
      trackedFileSummary0.hook168();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test17()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      trackedFileSummary0.totalINCount = 435;
      trackedFileSummary0.hook168();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test18()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      trackedFileSummary0.totalLNSize = (-1);
      trackedFileSummary0.hook168();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test19()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      trackedFileSummary0.obsoleteLNCount = 1;
      trackedFileSummary0.hook168();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test20()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      trackedFileSummary0.totalSize = 5066;
      trackedFileSummary0.hook168();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test21()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      trackedFileSummary0.obsoleteINCount = 4562;
      trackedFileSummary0.hook168();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test23()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      TrackedFileSummary trackedFileSummary1 = new TrackedFileSummary((UtilizationTracker) null, 0, true);
      trackedFileSummary0.addTrackedSummary(trackedFileSummary1);
      assertTrue(trackedFileSummary1.getAllowFlush());
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test24()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, (-2902L), true);
      // Undeclared exception!
      try { 
        trackedFileSummary0.trackObsolete(388);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.TrackedFileSummary$TrackedFileSummary_trackObsolete", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 1, false);
      trackedFileSummary0.trackObsolete(1);
      assertTrue(trackedFileSummary0.getAllowFlush());
      assertEquals(1L, trackedFileSummary0.getFileNumber());
  }

  @Test
  public void test26()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 1, false);
      // Undeclared exception!
      try { 
        trackedFileSummary0.reset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.TrackedFileSummary", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      // Undeclared exception!
      try { 
        trackedFileSummary0.addTrackedSummary((TrackedFileSummary) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSummary", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 4562, false);
      boolean boolean0 = trackedFileSummary0.containsObsoleteOffset(0L);
      assertEquals(4562L, trackedFileSummary0.getFileNumber());
      assertFalse(boolean0);
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test30()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 4562, false);
      trackedFileSummary0.getObsoleteOffsets();
      assertEquals(4562L, trackedFileSummary0.getFileNumber());
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test31()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 4562, true);
      long long0 = trackedFileSummary0.getFileNumber();
      assertTrue(trackedFileSummary0.getAllowFlush());
      assertEquals(4562L, long0);
  }

  @Test
  public void test32()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, false);
      boolean boolean0 = trackedFileSummary0.getAllowFlush();
      assertTrue(boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      TrackedFileSummary.TrackedFileSummary_trackObsolete trackedFileSummary_TrackedFileSummary_trackObsolete0 = new TrackedFileSummary.TrackedFileSummary_trackObsolete((TrackedFileSummary) null, (-35L));
      trackedFileSummary_TrackedFileSummary_trackObsolete0.hook172();
  }
}
