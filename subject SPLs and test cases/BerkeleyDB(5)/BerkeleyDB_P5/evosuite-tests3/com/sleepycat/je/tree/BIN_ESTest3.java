/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:54:32 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.StringWriter;
import java.util.Properties;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.latch.LatchException;
import com.sleepycat.je.latch.LatchNotHeldException;
import com.sleepycat.je.log.LogManager;

import de.ovgu.cide.jakutil.ReturnBoolean;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class BIN_ESTest3 extends BIN_ESTest_scaffolding3 {

  @Test
  public void test01()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)0;
      StringWriter stringWriter0 = null;
      try {
        stringWriter0 = new StringWriter((-3631));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative buffer size
         //
         assertThrownBy("java.io.StringWriter", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.setKnownDeletedLeaveTarget(2639);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2639
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      BIN bIN0 = new BIN();
      TreeLocation treeLocation0 = new TreeLocation();
      BIN bIN1 = null;
      try {  
      bIN1 = treeLocation0.bin;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test04()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      CursorImpl cursorImpl0 = null;
      TreeLocation treeLocation0 = new TreeLocation();
      BIN bIN0 = null;
      try {  
      bIN0 = treeLocation0.bin;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test05()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      BIN bIN0 = null;
      try {  
      bIN0 = treeLocation0.bin;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test06()  throws Throwable  {
      BIN bIN0 = new BIN();
      File file0 = null;
      Properties properties0 = null;
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig(properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.clearKnownDeleted(bIN0.ACCUMULATED_LIMIT);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1000
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.log((LogManager) null, false, false, false, (IN) null);
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
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        bIN0.splitSpecial((IN) null, (-2180), 425, byteArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      BIN bIN0 = new BIN();
      DBIN dBIN0 = new DBIN();
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
  public void test11()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.latchNoWait();
      try { 
        dBIN0.hook608(true);
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // DBIN0 already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.hook603((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[2];
      LN lN0 = new LN(byteArray0);
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
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = new byte[1];
      BINReference bINReference0 = new BINReference(76, (DatabaseId) null, byteArray0);
      // Undeclared exception!
      try { 
        dBIN0.compress(bINReference0, false);
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
      byte[] byteArray0 = new byte[4];
      BIN bIN0 = null;
      try {
        bIN0 = new BIN((DatabaseImpl) null, byteArray0, (int) (byte) (-51), (int) (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[6];
      BIN bIN0 = null;
      try {
        bIN0 = new BIN(databaseImpl0, byteArray0, (int) (byte) (-69), (int) (byte) (-69));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      BIN bIN0 = new BIN();
      String string0 = bIN0.shortClassName();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", string0);
  }

  @Test
  public void test23()  throws Throwable  {
      BIN bIN0 = new BIN();
      String string0 = bIN0.endTag();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("</bin>", string0);
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test25()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.nCursors();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test26()  throws Throwable  {
      BIN bIN0 = new BIN();
      String string0 = bIN0.beginTag();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("<bin>", string0);
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test27()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.latchNoWait();
      // Undeclared exception!
      try { 
        bIN0.hook607((-1918), 859, true);
        fail("Expecting exception: ReturnBoolean");
      
      } catch(ReturnBoolean e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.hook607(76, 76, true);
        fail("Expecting exception: ReturnBoolean");
      
      } catch(ReturnBoolean e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.latchNoWait();
      DBIN dBIN0 = new DBIN();
      bIN0.adjustCursorsForMutation(2041, dBIN0, 76, (CursorImpl) null);
      //  // Unstable assertion: assertEquals(510L, bIN0.getGeneration());
  }

  @Test
  public void test32()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.latchNoWait(false);
      bIN0.adjustCursorsForInsert(0);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test34()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.latchNoWait();
      DBIN dBIN0 = new DBIN();
      dBIN0.hook608(true);
      bIN0.adjustCursors(dBIN0, (-3946), (-18));
      //  // Unstable assertion: assertEquals(365L, dBIN0.getGeneration());
      //  // Unstable assertion: assertEquals(364L, bIN0.getGeneration());
  }

  @Test
  public void test38()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.hasNonLNChildren();
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertFalse(boolean0);
  }

  @Test
  public void test39()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.isEvictionProhibited();
      assertFalse(boolean0);
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test40()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      SearchResult searchResult0 = new SearchResult();
      searchResult0.parent = (IN) dBIN0;
      dBIN0.descendOnParentSearch(searchResult0, true, true, 0L, searchResult0.parent, false);
      assertFalse(searchResult0.keepSearching);
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test41()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      SearchResult searchResult0 = new SearchResult();
      searchResult0.parent = (IN) dBIN0;
      try { 
        dBIN0.descendOnParentSearch(searchResult0, false, false, 0L, searchResult0.parent, true);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // DBIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.latchNoWait();
      DBIN dBIN0 = new DBIN();
      SearchResult searchResult0 = new SearchResult();
      dBIN0.descendOnParentSearch(searchResult0, true, true, (-4129L), bIN0, false);
      //  // Unstable assertion: assertFalse(searchResult0.keepSearching);
      //  // Unstable assertion: assertEquals(229L, bIN0.getGeneration());
  }

  @Test
  public void test43()  throws Throwable  {
      BIN bIN0 = new BIN();
      DBIN dBIN0 = new DBIN();
      SearchResult searchResult0 = new SearchResult();
      try { 
        dBIN0.descendOnParentSearch(searchResult0, true, false, (-4129L), bIN0, false);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // DBIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test44()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      SearchResult searchResult0 = new SearchResult();
      // Undeclared exception!
      try { 
        dBIN0.descendOnParentSearch(searchResult0, false, false, 0L, (Node) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      BIN bIN0 = new BIN();
      long long0 = bIN0.getLastDeltaVersion();
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), long0);
  }

  @Test
  public void test46()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.setProhibitNextDelta();
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test47()  throws Throwable  {
      BIN bIN0 = new BIN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      // Undeclared exception!
      try { 
        bIN0.hook609((BINReference) null, databaseImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test48()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.getLogType();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test49()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.canBeAncestor(true);
      assertTrue(boolean0);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test50()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.setCursorIndex((CursorImpl) null, 3);
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
      boolean boolean0 = bIN0.entryZeroKeyComparesLow();
      assertFalse(boolean0);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test52()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        bIN0.createNewInstance(byteArray0, (byte)1, (byte)1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test53()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.latch();
      dBIN0.addCursor((CursorImpl) null);
      //  // Unstable assertion: assertEquals(220L, dBIN0.getGeneration());
  }

  @Test
  public void test55()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.latchNoWait();
      bIN0.hook604();
      //  // Unstable assertion: assertEquals(213L, bIN0.getGeneration());
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
      BIN bIN0 = new BIN();
      bIN0.latchNoWait(false);
      bIN0.hook605();
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), bIN0.getLastDeltaVersion());
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
  public void test60()  throws Throwable  {
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
  public void test61()  throws Throwable  {
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
  public void test62()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.isCompressible();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertTrue(boolean0);
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test63()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.isValidForDelete();
      //  // Unstable assertion: assertEquals(117L, bIN0.getGeneration());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test64()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.hook607((byte)16, 1, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test65()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.setKnownDeleted(76);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 76
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test66()  throws Throwable  {
      BIN bIN0 = new BIN();
      try { 
        bIN0.hook605();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // BIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test67()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.getCursorSet();
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test68()  throws Throwable  {
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
  public void test70()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.validateSubtreeBeforeDelete(65536);
      assertTrue(boolean0);
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test71()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.hook608(true);
      dBIN0.removeCursor((CursorImpl) null);
      //  // Unstable assertion: assertEquals(7L, dBIN0.getGeneration());
  }

  @Test
  public void test72()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.latchNoWait();
      DBIN dBIN0 = new DBIN();
      dBIN0.hook603(bIN0);
      //  // Unstable assertion: assertEquals(0L, bIN0.getGeneration());
  }

  @Test
  public void test73()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.setCursorBIN((CursorImpl) null, bIN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test74()  throws Throwable  {
      BIN bIN0 = new BIN();
      DBIN dBIN0 = new DBIN();
      try { 
        dBIN0.hook603(bIN0);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // BIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test75()  throws Throwable  {
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
  public void test76()  throws Throwable  {
      BIN bIN0 = new BIN();
      DBIN dBIN0 = new DBIN();
      bIN0.getChildKey(dBIN0);
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }
}
