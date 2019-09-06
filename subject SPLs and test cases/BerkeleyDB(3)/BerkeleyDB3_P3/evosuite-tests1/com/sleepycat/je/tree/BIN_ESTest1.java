/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:18:15 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LogManager;

import de.ovgu.cide.jakutil.ReturnBoolean;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class BIN_ESTest1 extends BIN_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[6];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte)22, byteArray0, (int) (byte) (-1));
      dBIN0.getKeyComparator();
      //  // Unstable assertion: assertEquals(1490L, dBIN0.getNodeId());
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[3];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, 1025, byteArray0, (int) (byte) (-82));
      IN iN0 = new IN();
      dBIN0.getChildKey(iN0);
      //  // Unstable assertion: assertEquals(1478L, iN0.getLastId());
      //  // Unstable assertion: assertEquals(1477L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test02()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.canBeAncestor(true);
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test03()  throws Throwable  {
      BIN bIN0 = new BIN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[4];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte)100, byteArray0, (int) (byte)100);
      // Undeclared exception!
      try { 
        dBIN0.splitSpecial(bIN0, 1024, (byte) (-1), byteArray0, false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        bIN0.getKeyComparator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.descendOnParentSearch((SearchResult) null, false, false, 1899L, dBIN0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[8];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte)1, byteArray0, 16777214);
      DBIN dBIN1 = (DBIN)dBIN0.createNewInstance(byteArray0, (byte)1, (byte)1);
      //  // Unstable assertion: assertEquals(1164L, dBIN1.getNodeId());
  }

  @Test
  public void test08()  throws Throwable  {
      BIN bIN0 = new BIN();
      SearchResult searchResult0 = new SearchResult();
      // Undeclared exception!
      try { 
        bIN0.getChildKey(searchResult0.parent);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.nCursors();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test10()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[6];
      BIN bIN0 = new BIN(databaseImpl0, byteArray0, (int) (byte)100, (int) (byte)0);
      bIN0.hook608(true);
      //  // Unstable assertion: assertEquals(1151L, bIN0.getNodeId());
  }

  @Test
  public void test14()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.entryZeroKeyComparesLow();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.canBeAncestor(true);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertTrue(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.adjustCursors(dBIN0, 65536, 65536);
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test17()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.getCursorBINToBeRemoved((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[4];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, 57, byteArray0, (int) (byte) (-1));
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        dBIN0.setCursorBIN((CursorImpl) null, bIN0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.BIN cannot be cast to com.sleepycat.je.tree.DBIN
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[8];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte)1, byteArray0, 16777214);
      // Undeclared exception!
      try { 
        dBIN0.logInternal((LogManager) null, true, true, true, dBIN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[4];
      BIN bIN0 = new BIN(databaseImpl0, byteArray0, 21, 21);
      // Undeclared exception!
      try { 
        bIN0.createNewInstance(byteArray0, (-677), (-476));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      BIN bIN0 = new BIN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[3];
      BIN bIN1 = new BIN(databaseImpl0, byteArray0, 65536, (int) (byte) (-18));
      BINReference bINReference0 = bIN1.createReference();
      // Undeclared exception!
      try { 
        bIN0.compress(bINReference0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      BIN bIN0 = null;
      try {
        bIN0 = new BIN((DatabaseImpl) null, byteArray0, (-2087), (int) (byte)14);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[7];
      BIN bIN0 = null;
      try {
        bIN0 = new BIN(databaseImpl0, byteArray0, (-250), (-596));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.getKeyComparator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      BIN bIN0 = new BIN();
      String string0 = bIN0.shortClassName();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", string0);
  }

  @Test
  public void test26()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[8];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte)20, byteArray0, (int) (byte)20);
      ChildReference childReference0 = new ChildReference((Node) dBIN0, byteArray0, (-2574L));
      dBIN0.insertEntry(childReference0);
      // Undeclared exception!
      try { 
        dBIN0.hook607(1971, 14, false);
        fail("Expecting exception: ReturnBoolean");
      
      } catch(ReturnBoolean e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      BIN bIN0 = new BIN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[4];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, 131072, byteArray0, (int) (byte) (-121));
      bIN0.adjustCursorsForMutation(7, dBIN0, (byte) (-121), (CursorImpl) null);
      //  // Unstable assertion: assertEquals(806L, dBIN0.getNodeId());
      //  // Unstable assertion: assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test28()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.adjustCursorsForInsert((-2591));
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test29()  throws Throwable  {
      BIN bIN0 = new BIN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[4];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, 131072, byteArray0, (int) (byte)100);
      // Undeclared exception!
      try { 
        dBIN0.split(bIN0, 65536, 372);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN$IN_splitInternal", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      BIN bIN0 = new BIN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[4];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte)100, byteArray0, (int) (byte)100);
      // Undeclared exception!
      try { 
        dBIN0.splitSpecial(bIN0, 1024, (byte) (-1), byteArray0, true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.hasNonLNChildren();
      assertFalse(boolean0);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test32()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      boolean boolean0 = dBIN0.isEvictionProhibited();
      assertFalse(boolean0);
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test36()  throws Throwable  {
      BIN bIN0 = new BIN();
      SearchResult searchResult0 = new SearchResult();
      // Undeclared exception!
      try { 
        bIN0.descendOnParentSearch(searchResult0, false, false, 2083L, (Node) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      long long0 = dBIN0.getLastDeltaVersion();
      assertEquals((-1L), long0);
  }

  @Test
  public void test38()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.setProhibitNextDelta();
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test39()  throws Throwable  {
      BIN bIN0 = new BIN();
      SearchResult searchResult0 = new SearchResult();
      searchResult0.parent = (IN) bIN0;
      try { 
        bIN0.getChildKey(searchResult0.parent);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // BIN.getDupKey() called
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.clearKnownDeleted((-65537));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -65537
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[2];
      BIN bIN0 = new BIN(databaseImpl0, byteArray0, 45, 0);
      bIN0.getLogType();
      //  // Unstable assertion: assertEquals(353L, bIN0.getLastId());
  }

  @Test
  public void test43()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.setCursorIndex((CursorImpl) null, (-2002));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test44()  throws Throwable  {
      BIN bIN0 = new BIN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[4];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte)0, byteArray0, (int) (byte)0);
      // Undeclared exception!
      try { 
        dBIN0.splitSpecial(bIN0, 1024, (byte) (-1), byteArray0, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("com.sleepycat.je.tree.IN$IN_splitInternal", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        bIN0.createNewInstance(byteArray0, (byte) (-16), 169);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test46()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.hook610(0);
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test47()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.getBINDeltaType();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test48()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.removeCursor((CursorImpl) null);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test49()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        bIN0.splitSpecial((IN) null, (-185), 75, byteArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test50()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.createReference();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test51()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.getCursorBIN((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test52()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.isCompressible();
      assertTrue(boolean0);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test53()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.isValidForDelete();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        bIN0.createNewInstance(byteArray0, (byte) (-16), 169);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test54()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.setKnownDeleted(45);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 45
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test55()  throws Throwable  {
      BIN bIN0 = new BIN();
      String string0 = bIN0.beginTag();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("<bin>", string0);
  }

  @Test
  public void test56()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.getCursorSet();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test57()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.getCursorIndex((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test58()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.validateSubtreeBeforeDelete(0);
      assertTrue(boolean0);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test59()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.setCursorBIN((CursorImpl) null, (BIN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test61()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.accumulateStats((TreeWalkerStatsAccumulator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test62()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.setKnownDeletedLeaveTarget((-2493));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2493
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test63()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.addCursor((CursorImpl) null);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test64()  throws Throwable  {
      BIN bIN0 = new BIN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[4];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, 131072, byteArray0, (int) (byte)100);
      bIN0.getChildKey(dBIN0);
      //  // Unstable assertion: assertEquals(2L, dBIN0.getLastId());
      //  // Unstable assertion: assertEquals(2L, bIN0.getLastId());
  }

  @Test
  public void test65()  throws Throwable  {
      BIN bIN0 = new BIN();
      String string0 = bIN0.endTag();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("</bin>", string0);
  }
}
