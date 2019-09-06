/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:05:08 KST 2017
 */

package com.sleepycat.je.cleaner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.cleaner.FileSelector;
import com.sleepycat.je.cleaner.LNInfo;
import com.sleepycat.je.cleaner.UtilizationProfile;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.FileSummaryLN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.NameLN;
import java.lang.reflect.Array;
import java.util.Set;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FileSelector_ESTest4 extends FileSelector_ESTest_scaffolding4 {

  @Test
  public void test01()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(3237L);
      fileSelector0.putBackFileForCleaning(long0);
      int int0 = fileSelector0.getBacklog();
      assertEquals(1, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseId databaseId0 = new DatabaseId((-1815));
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = new byte[6];
      boolean boolean0 = fileSelector0.addPendingLN(fileSummaryLN0, databaseId0, byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      boolean boolean0 = fileSelector0.hook165(true);
      assertTrue(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      fileSelector0.hook163();
  }

  @Test
  public void test08()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set<Object>[] setArray0 = (Set<Object>[]) Array.newInstance(Set.class, 0);
      // Undeclared exception!
      try { 
        fileSelector0.updateFilesAtCheckpointEnd(setArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSelector", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      // Undeclared exception!
      try { 
        fileSelector0.putBackFileForCleaning((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(4807L);
      fileSelector0.addCleanedFile((Long) null);
      // Undeclared exception!
      try { 
        fileSelector0.isFileCleaningInProgress(long0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      DupCountLN dupCountLN0 = new DupCountLN();
      DatabaseId databaseId0 = new DatabaseId((-2159));
      byte[] byteArray0 = new byte[0];
      fileSelector0.addPendingLN(dupCountLN0, databaseId0, byteArray0, byteArray0);
      fileSelector0.removePendingLN(1436L);
  }

  @Test
  public void test14()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set set0 = fileSelector0.copySafeToDeleteFiles();
      assertNull(set0);
  }

  @Test
  public void test15()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(2L);
      fileSelector0.addCleanedFile(long0);
      Set[] setArray0 = fileSelector0.getFilesAtCheckpointStart();
      fileSelector0.updateFilesAtCheckpointEnd(setArray0);
      Set set0 = fileSelector0.copySafeToDeleteFiles();
      assertFalse(set0.isEmpty());
  }

  @Test
  public void test16()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      DupCountLN dupCountLN0 = new DupCountLN();
      DatabaseId databaseId0 = new DatabaseId((-2159));
      byte[] byteArray0 = new byte[0];
      fileSelector0.addPendingLN(dupCountLN0, databaseId0, byteArray0, byteArray0);
      LNInfo[] lNInfoArray0 = fileSelector0.getPendingLNs();
      assertNotNull(lNInfoArray0);
  }

  @Test
  public void test17()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      LNInfo[] lNInfoArray0 = fileSelector0.getPendingLNs();
      assertNull(lNInfoArray0);
  }

  @Test
  public void test18()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      DatabaseId databaseId0 = new DatabaseId(0);
      NameLN nameLN0 = new NameLN();
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = fileSelector0.addPendingLN(nameLN0, databaseId0, byteArray0, byteArray0);
      assertFalse(boolean0);
      
      boolean boolean1 = fileSelector0.addPendingLN(nameLN0, databaseId0, byteArray0, byteArray0);
      assertTrue(boolean1);
  }

  @Test
  public void test20()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set<Object>[] setArray0 = (Set<Object>[]) Array.newInstance(Set.class, 3);
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      setArray0[1] = (Set<Object>) treeSet0;
      fileSelector0.updateFilesAtCheckpointEnd(setArray0);
  }

  @Test
  public void test21()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      fileSelector0.updateFilesAtCheckpointEnd((Set[]) null);
  }

  @Test
  public void test22()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set[] setArray0 = fileSelector0.getFilesAtCheckpointStart();
      assertNull(setArray0);
  }

  @Test
  public void test23()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      DupCountLN dupCountLN0 = new DupCountLN();
      DatabaseId databaseId0 = new DatabaseId((-2159));
      byte[] byteArray0 = new byte[0];
      fileSelector0.addPendingLN(dupCountLN0, databaseId0, byteArray0, byteArray0);
      Set[] setArray0 = fileSelector0.getFilesAtCheckpointStart();
      assertNull(setArray0);
  }

  @Test
  public void test24()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long((-1067L));
      fileSelector0.addCleanedFile(long0);
      boolean boolean0 = fileSelector0.isFileCleaningInProgress(long0);
      assertTrue(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(0L);
      fileSelector0.putBackFileForCleaning(long0);
      boolean boolean0 = fileSelector0.isFileCleaningInProgress(long0);
      assertTrue(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(4807L);
      boolean boolean0 = fileSelector0.isFileCleaningInProgress(long0);
      assertFalse(boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      // Undeclared exception!
      try { 
        fileSelector0.selectFileForCleaning((UtilizationProfile) null, false, true, (-1623));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSelector", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      // Undeclared exception!
      try { 
        fileSelector0.selectFileForCleaning((UtilizationProfile) null, false, false, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSelector", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set set0 = fileSelector0.getMustBeCleanedFiles();
      assertEquals(0, set0.size());
  }

  @Test
  public void test32()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      fileSelector0.removeDeletedFile((Long) null);
  }

  @Test
  public void test33()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set set0 = fileSelector0.getLowUtilizationFiles();
      assertTrue(set0.isEmpty());
  }
}
