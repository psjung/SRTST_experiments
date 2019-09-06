/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:50:14 KST 2017
 */

package com.sleepycat.je.cleaner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.cleaner.TrackedFileSummary;
import com.sleepycat.je.cleaner.UtilizationProfile;
import com.sleepycat.je.cleaner.UtilizationTracker;
import com.sleepycat.je.dbi.EnvironmentImpl;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class UtilizationProfile_ESTest2 extends UtilizationProfile_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      UtilizationProfile.UtilizationProfile_populateCache utilizationProfile_UtilizationProfile_populateCache0 = new UtilizationProfile.UtilizationProfile_populateCache((UtilizationProfile) null);
      utilizationProfile_UtilizationProfile_populateCache0.isOldVersion = true;
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
  public void test01()  throws Throwable  {
      int int0 = UtilizationProfile.utilization(1024L, (-1L));
      assertEquals(102500, int0);
  }

  @Test
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      UtilizationProfile utilizationProfile0 = null;
      TrackedFileSummary trackedFileSummary0 = null;
      UtilizationProfile.UtilizationProfile_putFileSummary utilizationProfile_UtilizationProfile_putFileSummary0 = new UtilizationProfile.UtilizationProfile_putFileSummary(utilizationProfile0, trackedFileSummary0);
      File file0 = null;
      try {  
      file0 = utilizationProfile_UtilizationProfile_putFileSummary0.file;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test04()  throws Throwable  {
      Long long0 = new Long(4574L);
      UtilizationProfile.UtilizationProfile_removeFile utilizationProfile_UtilizationProfile_removeFile0 = new UtilizationProfile.UtilizationProfile_removeFile((UtilizationProfile) null, long0);
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

  @Test
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      int int0 = UtilizationProfile.utilization(1024L, 3L);
      assertEquals((-34033), int0);
  }

  @Test
  public void test07()  throws Throwable  {
      int int0 = UtilizationProfile.utilization(0, 0);
      assertEquals(0, int0);
  }

  @Test
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      UtilizationProfile.UtilizationProfile_putFileSummary utilizationProfile_UtilizationProfile_putFileSummary0 = new UtilizationProfile.UtilizationProfile_putFileSummary((UtilizationProfile) null, trackedFileSummary0);
  }

  @Test
  public void test20()  throws Throwable  {
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
}
