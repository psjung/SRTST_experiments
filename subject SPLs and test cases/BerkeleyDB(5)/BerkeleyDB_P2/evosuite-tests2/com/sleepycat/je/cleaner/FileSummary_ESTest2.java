/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:19:54 KST 2017
 */

package com.sleepycat.je.cleaner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.cleaner.FileSummary;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FileSummary_ESTest2 extends FileSummary_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = (-2898);
      fileSummary0.totalSize = (-2898);
      fileSummary0.totalSize = 2444;
      fileSummary0.totalLNCount = 32;
      fileSummary0.totalLNSize = 89;
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(-8061, fileSummary0.getObsoleteLNSize());
      assertEquals((-5706), int0);
  }

  @Test
  public void test01()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = (-2898);
      fileSummary0.totalLNCount = (-134);
      fileSummary0.totalLNSize = 2764;
      int int0 = fileSummary0.getObsoleteLNSize();
      assertEquals(59771, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = (-2898);
      fileSummary0.obsoleteLNCount = 32;
      fileSummary0.totalLNCount = (-2898);
      fileSummary0.totalLNSize = 89;
      int int0 = fileSummary0.getObsoleteLNSize();
      assertEquals((-1), int0);
  }

  @Test
  public void test03()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNSize = 89;
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"89\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test04()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = 3499;
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"3499\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test05()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINSize = (-4140);
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"-4140\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test06()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = 2198;
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"2198\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test07()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalCount = (-1);
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"-1\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test08()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNSize = 1;
      // Undeclared exception!
      try { 
        fileSummary0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = 2452;
      // Undeclared exception!
      try { 
        fileSummary0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = (-1);
      // Undeclared exception!
      try { 
        fileSummary0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummary fileSummary1 = new FileSummary();
      fileSummary1.totalLNSize = 48;
      fileSummary0.add(fileSummary1);
      assertEquals(48, fileSummary0.totalLNSize);
  }

  @Test
  public void test12()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummary fileSummary1 = new FileSummary();
      fileSummary1.totalLNCount = (-694);
      fileSummary0.add(fileSummary1);
      assertEquals((-694), fileSummary0.totalLNCount);
  }

  @Test
  public void test13()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINSize = (-1268);
      fileSummary0.add(fileSummary0);
      assertEquals((-2536), fileSummary0.totalINSize);
  }

  @Test
  public void test14()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummary fileSummary1 = new FileSummary();
      fileSummary1.totalLNCount = (-694);
      fileSummary1.add(fileSummary0);
      assertEquals((-694), fileSummary1.totalLNCount);
  }

  @Test
  public void test15()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummary fileSummary1 = new FileSummary();
      fileSummary1.totalSize = 1246;
      fileSummary0.add(fileSummary1);
      // Undeclared exception!
      try { 
        fileSummary0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalCount = 1118;
      fileSummary0.add(fileSummary0);
      assertFalse(fileSummary0.isEmpty());
  }

  @Test
  public void test17()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = 301;
      fileSummary0.add(fileSummary0);
      assertEquals(602, fileSummary0.totalINCount);
  }

  @Test
  public void test18()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummary fileSummary1 = new FileSummary();
      fileSummary1.totalLNSize = 48;
      fileSummary1.add(fileSummary0);
      assertEquals(48, fileSummary1.totalLNSize);
  }

  @Test
  public void test19()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = 8;
      fileSummary0.add(fileSummary0);
      assertFalse(fileSummary0.isEmpty());
  }

  @Test
  public void test20()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummary fileSummary1 = new FileSummary();
      fileSummary1.totalSize = 1246;
      fileSummary1.add(fileSummary0);
      assertFalse(fileSummary1.isEmpty());
  }

  @Test
  public void test21()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = 2198;
      fileSummary0.add(fileSummary0);
      assertFalse(fileSummary0.isEmpty());
  }

  @Test
  public void test22()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = (-481);
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(481, int0);
  }

  @Test
  public void test23()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalCount = (-1);
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(0, int0);
  }

  @Test
  public void test24()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = (-1550);
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(0, int0);
  }

  @Test
  public void test25()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = 1;
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals((-1), int0);
  }

  @Test
  public void test26()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = 3499;
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(3499, int0);
  }

  @Test
  public void test27()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNCount = (-4140);
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals((-4140), int0);
  }

  @Test
  public void test28()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalCount = 2764;
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals(2764, int0);
  }

  @Test
  public void test29()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNSize = 173;
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals(0, int0);
  }

  @Test
  public void test30()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = (-2898);
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals((-2898), int0);
  }

  @Test
  public void test31()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = 2198;
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals(0, int0);
  }

  @Test
  public void test32()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = (-509);
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals((-509), int0);
  }

  @Test
  public void test33()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = (-1550);
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(0, int0);
  }

  @Test
  public void test34()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalCount = (-1);
      fileSummary0.totalSize = 3499;
      fileSummary0.totalINCount = 3499;
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(3499, int0);
  }

  @Test
  public void test35()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = (-2898);
      fileSummary0.totalLNSize = 89;
      int int0 = fileSummary0.getObsoleteINSize();
      assertEquals(0, int0);
  }

  @Test
  public void test36()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = (-1);
      fileSummary0.obsoleteLNCount = (-2898);
      int int0 = fileSummary0.getObsoleteINSize();
      assertEquals(0, int0);
  }

  @Test
  public void test37()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINSize = (-4140);
      fileSummary0.totalSize = 3499;
      fileSummary0.totalINCount = 3499;
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(3499, int0);
  }

  @Test
  public void test38()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.obsoleteLNCount = 2452;
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test39()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummary fileSummary1 = new FileSummary();
      fileSummary1.obsoleteINCount = 1361;
      fileSummary0.add(fileSummary1);
      boolean boolean0 = fileSummary0.isEmpty();
      assertEquals(1361, fileSummary0.obsoleteINCount);
      assertFalse(boolean0);
  }

  @Test
  public void test40()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.totalSize = (-2898);
      fileSummary0.totalSize = 2444;
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test41()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      ByteBuffer byteBuffer0 = null;
      // Undeclared exception!
      try { 
        fileSummary0.readFromLog((ByteBuffer) null, (byte) (-92));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      // Undeclared exception!
      try { 
        fileSummary0.add((FileSummary) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSummary", e);
      }
  }

  @Test
  public void test43()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      int int0 = fileSummary0.getObsoleteINSize();
      assertEquals(0, int0);
  }

  @Test
  public void test44()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNCount = (-2898);
      int int0 = fileSummary0.getObsoleteLNSize();
      assertEquals(0, int0);
  }

  @Test
  public void test45()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      // Undeclared exception!
      try { 
        fileSummary0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSummary", e);
      }
  }

  @Test
  public void test46()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = (-2898);
      fileSummary0.totalINSize = (-2898);
      fileSummary0.totalSize = 2444;
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(2444, int0);
  }

  @Test
  public void test47()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(0, int0);
  }

  @Test
  public void test48()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      int int0 = fileSummary0.getObsoleteLNSize();
      assertEquals(0, int0);
  }

  @Test
  public void test49()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.obsoleteLNCount = (-154);
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test50()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.obsoleteINCount = (-1);
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test51()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.totalSize = (-2898);
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test52()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      boolean boolean0 = fileSummary0.isEmpty();
      assertTrue(boolean0);
  }

  @Test
  public void test53()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.totalCount = 2764;
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test54()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      long long0 = fileSummary0.getTransactionId();
      assertEquals((-1L), long0);
  }

  @Test
  public void test55()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      int int0 = fileSummary0.getLogSize();
      assertEquals(32, int0);
  }

  @Test
  public void test56()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      boolean boolean0 = fileSummary0.logEntryIsTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test57()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.reset();
      assertEquals(0, fileSummary0.getNonObsoleteCount());
      assertTrue(fileSummary0.isEmpty());
      assertEquals(0, fileSummary0.totalLNSize);
      assertEquals(0, fileSummary0.totalINSize);
  }
}
