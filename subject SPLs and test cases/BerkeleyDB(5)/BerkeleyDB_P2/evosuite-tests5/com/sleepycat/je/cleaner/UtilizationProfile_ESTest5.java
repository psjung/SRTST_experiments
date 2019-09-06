/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:12:16 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class UtilizationProfile_ESTest5 extends UtilizationProfile_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      int int0 = UtilizationProfile.utilization((-374L), (-105L));
      assertEquals((-256), int0);
  }

  @Test
  public void test01()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 142L, true);
      UtilizationProfile.UtilizationProfile_putFileSummary utilizationProfile_UtilizationProfile_putFileSummary0 = new UtilizationProfile.UtilizationProfile_putFileSummary((UtilizationProfile) null, trackedFileSummary0);
  }

  @Test
  public void test02()  throws Throwable  {
      int int0 = UtilizationProfile.utilization(3377L, (-4823L));
      assertEquals(170, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      int int0 = UtilizationProfile.utilization(0L, 1L);
      assertEquals(100, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      int int0 = UtilizationProfile.utilization((-1L), (-1L));
      assertEquals(0, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "";
      EnvironmentImpl environmentImpl0 = null;
      Cleaner cleaner0 = null;
      try {
        cleaner0 = new Cleaner(environmentImpl0, string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      UtilizationProfile.UtilizationProfile_putFileSummary utilizationProfile_UtilizationProfile_putFileSummary0 = new UtilizationProfile.UtilizationProfile_putFileSummary((UtilizationProfile) null, (TrackedFileSummary) null);
      // Undeclared exception!
      try { 
        utilizationProfile_UtilizationProfile_putFileSummary0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      UtilizationProfile.UtilizationProfile_populateCache utilizationProfile_UtilizationProfile_populateCache0 = new UtilizationProfile.UtilizationProfile_populateCache((UtilizationProfile) null);
      // Undeclared exception!
      try { 
        utilizationProfile_UtilizationProfile_populateCache0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      int int0 = UtilizationProfile.utilization(1L, 0L);
      assertEquals(0, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      UtilizationProfile.UtilizationProfile_clearCache utilizationProfile_UtilizationProfile_clearCache0 = new UtilizationProfile.UtilizationProfile_clearCache((UtilizationProfile) null);
      // Undeclared exception!
      try { 
        utilizationProfile_UtilizationProfile_clearCache0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      UtilizationProfile.UtilizationProfile_populateCache utilizationProfile_UtilizationProfile_populateCache0 = new UtilizationProfile.UtilizationProfile_populateCache((UtilizationProfile) null);
      // Undeclared exception!
      try { 
        utilizationProfile_UtilizationProfile_populateCache0.hook185();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile$UtilizationProfile_populateCache", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      UtilizationProfile.UtilizationProfile_populateCache utilizationProfile_UtilizationProfile_populateCache0 = new UtilizationProfile.UtilizationProfile_populateCache((UtilizationProfile) null);
      // Undeclared exception!
      try { 
        utilizationProfile_UtilizationProfile_populateCache0.hook195();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      UtilizationProfile.UtilizationProfile_populateCache utilizationProfile_UtilizationProfile_populateCache0 = new UtilizationProfile.UtilizationProfile_populateCache((UtilizationProfile) null);
      // Undeclared exception!
      try { 
        utilizationProfile_UtilizationProfile_populateCache0.hook194();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      UtilizationProfile.UtilizationProfile_populateCache utilizationProfile_UtilizationProfile_populateCache0 = new UtilizationProfile.UtilizationProfile_populateCache((UtilizationProfile) null);
      // Undeclared exception!
      try { 
        utilizationProfile_UtilizationProfile_populateCache0.hook191();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile$UtilizationProfile_populateCache", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      UtilizationProfile.UtilizationProfile_populateCache utilizationProfile_UtilizationProfile_populateCache0 = new UtilizationProfile.UtilizationProfile_populateCache((UtilizationProfile) null);
      // Undeclared exception!
      try { 
        utilizationProfile_UtilizationProfile_populateCache0.hook183();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile$UtilizationProfile_populateCache", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      UtilizationProfile.UtilizationProfile_populateCache utilizationProfile_UtilizationProfile_populateCache0 = new UtilizationProfile.UtilizationProfile_populateCache((UtilizationProfile) null);
      // Undeclared exception!
      try { 
        utilizationProfile_UtilizationProfile_populateCache0.hook182();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile$UtilizationProfile_populateCache", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      UtilizationProfile.UtilizationProfile_populateCache utilizationProfile_UtilizationProfile_populateCache0 = new UtilizationProfile.UtilizationProfile_populateCache((UtilizationProfile) null);
      // Undeclared exception!
      try { 
        utilizationProfile_UtilizationProfile_populateCache0.hook184();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile$UtilizationProfile_populateCache", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      UtilizationProfile.UtilizationProfile_populateCache utilizationProfile_UtilizationProfile_populateCache0 = new UtilizationProfile.UtilizationProfile_populateCache((UtilizationProfile) null);
      // Undeclared exception!
      try { 
        utilizationProfile_UtilizationProfile_populateCache0.hook181();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile$UtilizationProfile_populateCache", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      UtilizationProfile utilizationProfile0 = null;
      try {
        utilizationProfile0 = new UtilizationProfile((EnvironmentImpl) null, (UtilizationTracker) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      UtilizationProfile.UtilizationProfile_putFileSummary utilizationProfile_UtilizationProfile_putFileSummary0 = new UtilizationProfile.UtilizationProfile_putFileSummary((UtilizationProfile) null, (TrackedFileSummary) null);
      // Undeclared exception!
      try { 
        utilizationProfile_UtilizationProfile_putFileSummary0.hook193();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      Long long0 = new Long(1L);
      UtilizationProfile.UtilizationProfile_removeFile utilizationProfile_UtilizationProfile_removeFile0 = new UtilizationProfile.UtilizationProfile_removeFile((UtilizationProfile) null, long0);
      // Undeclared exception!
      try { 
        utilizationProfile_UtilizationProfile_removeFile0.hook192();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      UtilizationProfile.UtilizationProfile_removeFile utilizationProfile_UtilizationProfile_removeFile0 = new UtilizationProfile.UtilizationProfile_removeFile((UtilizationProfile) null, (Long) null);
      // Undeclared exception!
      try { 
        utilizationProfile_UtilizationProfile_removeFile0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile$UtilizationProfile_removeFile", e);
      }
  }
}
