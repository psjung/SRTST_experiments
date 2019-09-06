/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:23:15 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DbTree;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.tree.DIN;
import com.sleepycat.je.tree.FileSummaryLN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.MapLN;
import com.sleepycat.je.tree.TreeLocation;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FileProcessor_ESTest2 extends FileProcessor_ESTest_scaffolding2 {

  @Test
  public void test01()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("({", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Long long0 = new Long((long) (byte)0);
      TreeLocation treeLocation0 = new TreeLocation();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseId databaseId0 = DbTree.NAME_DB_ID;
      LNInfo lNInfo0 = new LNInfo((LN) fileSummaryLN0, databaseId0, (byte[]) null, (byte[]) null);
      Object object0 = new Object();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN(fileProcessor0, long0, treeLocation0, (Long) treeLocation0.childLsn, lNInfo0, object0, hashMap0);
  }

  @Test
  public void test04()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("({", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      Long long0 = new Long(0L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile(fileProcessor0, long0);
  }

  @Test
  public void test06()  throws Throwable  {
      Long long0 = new Long(3688L);
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, (DatabaseId) null, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, (Long) (-1L), lNInfo0, "", (Map) null);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processLN0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Long long0 = new Long(249L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, (DatabaseId) null, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, (Long) null, treeLocation0, (Long) (-1L), lNInfo0, "{a\"d54,KX9`\"zBGEVg", (Map) null);
      DIN dIN0 = new DIN();
      fileProcessor_FileProcessor_processLN0.parentDIN = dIN0;
      fileProcessor_FileProcessor_processLN0.hook135();
      //  // Unstable assertion: assertEquals(94L, mapLN0.getLastId());
  }

  @Test
  public void test10()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, (DatabaseId) null, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, (Long) null, treeLocation0, (Long) (-1L), lNInfo0, "{a\"d54,KX9`\"zBGEVg", (Map) null);
      fileProcessor_FileProcessor_processLN0.hook150();
      //  // Unstable assertion: assertEquals(81L, mapLN0.getLastId());
  }

  @Test
  public void test11()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, (DatabaseId) null, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, (Long) null, treeLocation0, (Long) (-1L), lNInfo0, "", (Map) null);
      fileProcessor_FileProcessor_processLN0.hook148();
      //  // Unstable assertion: assertEquals(68L, mapLN0.getLastId());
  }

  @Test
  public void test12()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, (DatabaseId) null, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, (Long) null, treeLocation0, (Long) (-1L), lNInfo0, "{a\"d54,KX9`\"zBGEVg", (Map) null);
      fileProcessor_FileProcessor_processLN0.hook149();
      //  // Unstable assertion: assertEquals(55L, mapLN0.getLastId());
  }

  @Test
  public void test13()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, (DatabaseId) null, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, (Long) null, treeLocation0, (Long) (-1L), lNInfo0, "{a\"d54,KX9`\"zBGEVg", (Map) null);
      fileProcessor_FileProcessor_processLN0.hook126();
      //  // Unstable assertion: assertEquals(42L, mapLN0.getLastId());
  }

  @Test
  public void test14()  throws Throwable  {
      Long long0 = new Long(3688L);
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, (DatabaseId) null, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, (Long) (-1L), lNInfo0, "", (Map) null);
      fileProcessor_FileProcessor_processLN0.hook135();
      //  // Unstable assertion: assertEquals(27L, mapLN0.getLastId());
  }

  @Test
  public void test16()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, (DatabaseId) null, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, (Long) null, treeLocation0, (Long) (-1L), lNInfo0, "{\"d54,KX9`\"zBGEVg", (Map) null);
      fileProcessor_FileProcessor_processLN0.hook133();
      //  // Unstable assertion: assertEquals(1L, mapLN0.getLastId());
  }

  @Test
  public void test17()  throws Throwable  {
      Long long0 = new Long(254L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook137();
  }

  @Test
  public void test18()  throws Throwable  {
      Long long0 = new Long(254L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook154();
      fileProcessor_FileProcessor_processFile0.hook155();
  }

  @Test
  public void test19()  throws Throwable  {
      Long long0 = new Long(3689L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook129();
  }

  @Test
  public void test20()  throws Throwable  {
      Long long0 = new Long(3689L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook128();
  }

  @Test
  public void test21()  throws Throwable  {
      Long long0 = new Long(3673L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook130();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      Long long0 = new Long(249L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook127();
  }

  @Test
  public void test24()  throws Throwable  {
      Long long0 = new Long(500000L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook147();
  }

  @Test
  public void test25()  throws Throwable  {
      Long long0 = new Long(3701L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook146();
  }

  @Test
  public void test26()  throws Throwable  {
      Long long0 = new Long(249L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook145();
  }

  @Test
  public void test29()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("({", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook138();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test30()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("({", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook142();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test31()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("({", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook144();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test35()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("({", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook151();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }
}
