/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:07:35 KST 2017
 */

package com.sleepycat.je.cleaner;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.cleaner.LNInfo;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.FileSummaryLN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.NameLN;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LNInfo_ESTest4 extends LNInfo_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      LNInfo lNInfo0 = new LNInfo((LN) null, databaseId0, byteArray0, byteArray0);
      LN lN0 = lNInfo0.getLN();
      assertNull(lN0);
  }

  @Test
  public void test01()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      byte[] byteArray0 = new byte[8];
      LNInfo lNInfo0 = new LNInfo((LN) dupCountLN0, (DatabaseId) null, (byte[]) null, byteArray0);
      DupCountLN dupCountLN1 = (DupCountLN)lNInfo0.getLN();
      assertEquals("</dupCountLN>", dupCountLN1.endTag());
  }

  @Test
  public void test02()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1767);
      byte[] byteArray0 = new byte[0];
      LNInfo lNInfo0 = new LNInfo((LN) dupCountLN0, (DatabaseId) null, (byte[]) null, byteArray0);
      lNInfo0.getKey();
      //  // Unstable assertion: assertEquals(33L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertEquals(33L, dupCountLN0.getLastId());
  }

  @Test
  public void test03()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      byte[] byteArray0 = new byte[0];
      LNInfo lNInfo0 = new LNInfo((LN) nameLN0, databaseId0, byteArray0, byteArray0);
      lNInfo0.getKey();
      //  // Unstable assertion: assertEquals(30L, nameLN0.getLastId());
      //  // Unstable assertion: assertEquals(30L, nameLN0.getNodeId());
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      LNInfo lNInfo0 = new LNInfo((LN) null, (DatabaseId) null, byteArray0, (byte[]) null);
      byte[] byteArray1 = lNInfo0.getDupKey();
      assertNull(byteArray1);
  }

  @Test
  public void test05()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      byte[] byteArray0 = new byte[0];
      LNInfo lNInfo0 = new LNInfo((LN) fileSummaryLN0, (DatabaseId) null, byteArray0, byteArray0);
      byte[] byteArray1 = lNInfo0.getDupKey();
      assertSame(byteArray0, byteArray1);
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      LNInfo lNInfo0 = new LNInfo((LN) null, (DatabaseId) null, byteArray0, (byte[]) null);
      DatabaseId databaseId0 = lNInfo0.getDbId();
      assertNull(databaseId0);
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      LNInfo lNInfo0 = new LNInfo((LN) null, databaseId0, byteArray0, byteArray0);
      DatabaseId databaseId1 = lNInfo0.getDbId();
      assertEquals(0, databaseId1.getId());
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LN lN0 = new LN(databaseEntry0);
      DatabaseId databaseId0 = new DatabaseId(28);
      LNInfo lNInfo0 = new LNInfo(lN0, databaseId0, byteArray0, byteArray0);
      lNInfo0.getDbId();
      //  // Unstable assertion: assertEquals(27L, lN0.getNodeId());
      //  // Unstable assertion: assertEquals(27L, lN0.getLastId());
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      LNInfo lNInfo0 = new LNInfo((LN) null, (DatabaseId) null, byteArray0, (byte[]) null);
      int int0 = lNInfo0.getMemorySize();
      assertEquals(80, int0);
  }

  @Test
  public void test10()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1767);
      byte[] byteArray0 = new byte[0];
      LNInfo lNInfo0 = new LNInfo((LN) dupCountLN0, (DatabaseId) null, (byte[]) null, byteArray0);
      int int0 = lNInfo0.getMemorySize();
      //  // Unstable assertion: assertEquals(1L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertEquals(112, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[2];
      LNInfo lNInfo0 = new LNInfo((LN) null, databaseId0, byteArray0, byteArray0);
      byte[] byteArray1 = lNInfo0.getKey();
      assertSame(byteArray1, byteArray0);
  }

  @Test
  public void test12()  throws Throwable  {
      LN lN0 = new LN();
      DatabaseId databaseId0 = new DatabaseId(562);
      byte[] byteArray0 = new byte[0];
      LNInfo lNInfo0 = new LNInfo(lN0, databaseId0, byteArray0, byteArray0);
      LN lN1 = lNInfo0.getLN();
      assertEquals("<ln>", lN1.beginTag());
  }

  @Test
  public void test13()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[2];
      LNInfo lNInfo0 = new LNInfo((LN) null, databaseId0, byteArray0, byteArray0);
      byte[] byteArray1 = lNInfo0.getDupKey();
      assertSame(byteArray1, byteArray0);
  }

  @Test
  public void test14()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseId databaseId0 = new DatabaseId((-1263));
      byte[] byteArray0 = new byte[8];
      LNInfo lNInfo0 = new LNInfo((LN) fileSummaryLN0, databaseId0, byteArray0, byteArray0);
      DatabaseId databaseId1 = lNInfo0.getDbId();
      assertFalse(databaseId1.logEntryIsTransactional());
  }
}
