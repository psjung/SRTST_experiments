/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:46:30 KST 2017
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

import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.DbConfigManager;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.latch.LatchException;
import com.sleepycat.je.latch.LatchNotHeldException;
import com.sleepycat.je.log.LogManager;

import de.ovgu.cide.jakutil.ReturnBoolean;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class BIN_ESTest4 extends BIN_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.getChildKey(dBIN0);
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test01()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.canBeAncestor(true);
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertTrue(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      BIN bIN0 = new BIN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[7];
      DBIN dBIN0 = null;
      try {
        dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) byteArray0[3], byteArray0, (int) byteArray0[3]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      BIN bIN0 = new BIN();
      CursorImpl cursorImpl0 = null;
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
  public void test05()  throws Throwable  {
      BIN bIN0 = new BIN();
      CursorImpl cursorImpl0 = null;
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
  public void test06()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.updateEntry(866, 0L, (byte) (-70));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3464
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.setKnownDeletedLeaveTarget((-9));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -9
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      BIN bIN0 = new BIN();
      CursorImpl cursorImpl0 = null;
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
  public void test09()  throws Throwable  {
      BIN bIN0 = new BIN();
      DBIN dBIN0 = new DBIN();
      bIN0.getChildKey(dBIN0);
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "";
      DatabaseId databaseId0 = new DatabaseId();
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = 0;
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.setKnownDeletedLeaveTarget((-9));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -9
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      BIN bIN0 = new BIN();
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = new byte[8];
      SearchResult searchResult0 = new SearchResult();
      try { 
        bIN0.descendOnParentSearch(searchResult0, false, false, 866, dBIN0, false);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // BIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      File file0 = null;
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl(file0, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.getLogType();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test15()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.log((LogManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        dBIN0.splitSpecial(dBIN0, 866, 866, byteArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.latch(true);
      try { 
        bIN0.hook608(true);
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // BIN0 already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      try { 
        dBIN0.hook606();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // DBIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      try { 
        dBIN0.hook605();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // DBIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      try { 
        dBIN0.hook604();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // DBIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.hook603((Node) null);
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
      BIN bIN0 = new BIN();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LN lN0 = new LN(databaseEntry0);
      // Undeclared exception!
      try { 
        bIN0.hook603(lN0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.LN cannot be cast to com.sleepycat.je.tree.IN
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      BIN bIN0 = new BIN();
      try { 
        bIN0.getChildKey(bIN0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // BIN.getDupKey() called
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.getChildEvictionType();
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
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        bIN0.createNewInstance(byteArray0, (byte) (-12), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        BIN.computeOverhead((DbConfigManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      BIN bIN0 = new BIN();
      DatabaseId databaseId0 = new DatabaseId(866);
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference(866, databaseId0, byteArray0);
      // Undeclared exception!
      try { 
        bIN0.compress(bINReference0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[9];
      BIN bIN0 = null;
      try {
        bIN0 = new BIN(databaseImpl0, byteArray0, 0, 686);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      BIN bIN0 = new BIN();
      String string0 = bIN0.shortClassName();
      assertEquals("BIN", string0);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test30()  throws Throwable  {
      BIN bIN0 = new BIN();
      String string0 = bIN0.endTag();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals("</bin>", string0);
  }

  @Test
  public void test31()  throws Throwable  {
      BIN bIN0 = new BIN();
      String string0 = bIN0.beginTag();
      assertEquals("<bin>", string0);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test32()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.verifyCursors();
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test33()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.latchNoWait();
      // Undeclared exception!
      try { 
        dBIN0.evictLNs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test35()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.latch(true);
      boolean boolean0 = bIN0.isValidForDelete();
      //  // Unstable assertion: assertEquals(316L, bIN0.getGeneration());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test36()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.hook607(1, 1, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.hook607(1000000, 1000000, false);
        fail("Expecting exception: ReturnBoolean");
      
      } catch(ReturnBoolean e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test39()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.latch();
      dBIN0.adjustCursorsForMutation(866, dBIN0, (-2317), (CursorImpl) null);
      //  // Unstable assertion: assertEquals(83L, dBIN0.getGeneration());
  }

  @Test
  public void test41()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.hook608(true);
      dBIN0.adjustCursorsForInsert(866);
      //  // Unstable assertion: assertEquals(53L, dBIN0.getGeneration());
  }

  @Test
  public void test46()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.hasNonLNChildren();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
      assertFalse(boolean0);
  }

  @Test
  public void test47()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.isEvictionProhibited();
      assertFalse(boolean0);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test48()  throws Throwable  {
      BIN bIN0 = new BIN();
      DBIN dBIN0 = new DBIN();
      SearchResult searchResult0 = new SearchResult();
      try { 
        bIN0.descendOnParentSearch(searchResult0, false, false, 866, dBIN0, false);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // BIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test49()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      SearchResult searchResult0 = new SearchResult();
      // Undeclared exception!
      try { 
        dBIN0.descendOnParentSearch(searchResult0, true, true, 266L, (Node) null, true);
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
      DBIN dBIN0 = new DBIN();
      SearchResult searchResult0 = new SearchResult();
      IN iN0 = new IN();
      try { 
        dBIN0.descendOnParentSearch(searchResult0, true, true, 0, iN0, false);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // IN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test51()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      SearchResult searchResult0 = new SearchResult();
      searchResult0.parent = (IN) dBIN0;
      dBIN0.descendOnParentSearch(searchResult0, true, true, 266L, searchResult0.parent, false);
      assertFalse(searchResult0.keepSearching);
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test52()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.setProhibitNextDelta();
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test53()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.latch();
      dBIN0.addCursor((CursorImpl) null);
      //  // Unstable assertion: assertEquals(44L, dBIN0.getGeneration());
  }

  @Test
  public void test54()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.hook610((-235));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -235
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test55()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.latch();
      dBIN0.hook604();
      //  // Unstable assertion: assertEquals(38L, dBIN0.getGeneration());
  }

  @Test
  public void test56()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.getBINDeltaType();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test57()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.latch();
      SearchResult searchResult0 = new SearchResult();
      IN iN0 = new IN();
      dBIN0.descendOnParentSearch(searchResult0, false, true, 0, iN0, false);
      //  // Unstable assertion: assertEquals(20L, dBIN0.getGeneration());
  }

  @Test
  public void test58()  throws Throwable  {
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
  public void test59()  throws Throwable  {
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
  public void test60()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.isCompressible();
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertTrue(boolean0);
  }

  @Test
  public void test61()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[0];
      BIN bIN0 = null;
      try {
        bIN0 = new BIN(databaseImpl0, byteArray0, (-2247), (-2247));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test62()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.latch();
      dBIN0.removeCursor((CursorImpl) null);
      //  // Unstable assertion: assertEquals(11L, dBIN0.getGeneration());
  }

  @Test
  public void test63()  throws Throwable  {
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
  public void test64()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.getChildKey((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test65()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.hook601(0L);
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals(0L, bIN0.getInMemorySize());
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test66()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      long long0 = BIN.computeOverhead(dbConfigManager0);
      assertEquals(2728L, long0);
  }

  @Test
  public void test67()  throws Throwable  {
      BIN bIN0 = new BIN();
      long long0 = bIN0.getLastDeltaVersion();
      assertEquals((-1L), long0);
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test68()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.clearKnownDeleted(866);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 866
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test69()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.canBeAncestor(false);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test70()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.setCursorIndex((CursorImpl) null, (-235));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test71()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.entryZeroKeyComparesLow();
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertFalse(boolean0);
  }

  @Test
  public void test72()  throws Throwable  {
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
  public void test73()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.hook602(866);
      assertEquals((-866L), bIN0.getInMemorySize());
  }

  @Test
  public void test74()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.evictLN((-611));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test75()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.nCursors();
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test76()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.setKnownDeleted((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test77()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.getCursorSet();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test78()  throws Throwable  {
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
  public void test79()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      boolean boolean0 = dBIN0.validateSubtreeBeforeDelete(2448);
      assertTrue(boolean0);
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test80()  throws Throwable  {
      BIN bIN0 = new BIN();
      try { 
        bIN0.hook603(bIN0);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // BIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test81()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.hook608(true);
      bIN0.hook606();
      //  // Unstable assertion: assertEquals(0L, bIN0.getGeneration());
  }
}
