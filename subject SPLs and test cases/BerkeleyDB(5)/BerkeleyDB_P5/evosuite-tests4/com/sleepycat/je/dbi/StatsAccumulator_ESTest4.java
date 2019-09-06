/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:37:06 KST 2017
 */

package com.sleepycat.je.dbi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.BtreeStats;
import com.sleepycat.je.DatabaseStats;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.StatsAccumulator;
import com.sleepycat.je.tree.BIN;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.DIN;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.IN;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class StatsAccumulator_ESTest4 extends StatsAccumulator_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      BtreeStats btreeStats0 = (BtreeStats)databaseImpl0.getEmptyStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 0, btreeStats0);
      DIN dIN0 = new DIN();
      Long long0 = new Long(0L);
      statsAccumulator0.processIN(dIN0, long0, 8);
      int int0 = statsAccumulator0.getDuplicateTreeMaxDepth();
      //  // Unstable assertion: assertEquals(298L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertEquals(8, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 0, btreeStats0);
      statsAccumulator0.incrementDeletedLNCount();
      long long0 = statsAccumulator0.getDeletedLNCount();
      assertEquals(1L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-3943), btreeStats0);
      statsAccumulator0.copyToStats(btreeStats0);
      assertEquals(0L, btreeStats0.getDeletedLeafNodeCount());
      assertEquals(0, btreeStats0.getDuplicateTreeMaxDepth());
      assertEquals(0L, btreeStats0.getLeafNodeCount());
      assertEquals(0, btreeStats0.getMainTreeMaxDepth());
  }

  @Test
  public void test04()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      BtreeStats btreeStats0 = (BtreeStats)databaseImpl0.getEmptyStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 0, btreeStats0);
      DBIN dBIN0 = new DBIN();
      statsAccumulator0.hook366(dBIN0);
      //  // Unstable assertion: assertEquals(278L, dBIN0.getLastId());
      //  // Unstable assertion: assertEquals(278L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test05()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-624), btreeStats0);
      DIN dIN0 = new DIN();
      statsAccumulator0.hook365(dIN0);
      assertEquals(0, dIN0.getNEntries());
  }

  @Test
  public void test06()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 131072, btreeStats0);
      DBIN dBIN0 = new DBIN();
      statsAccumulator0.hook364(dBIN0);
      assertEquals(0, dBIN0.getNEntries());
  }

  @Test
  public void test07()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 0, (DatabaseStats) null);
      statsAccumulator0.hook363((IN) null);
  }

  @Test
  public void test08()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 1832, btreeStats0);
      int int0 = statsAccumulator0.getMainTreeMaxDepth();
      assertEquals(0, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-3943), btreeStats0);
      long long0 = statsAccumulator0.getLNCount();
      assertEquals(0L, long0);
  }

  @Test
  public void test10()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      BtreeStats btreeStats0 = (BtreeStats)databaseImpl0.getEmptyStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 0, btreeStats0);
      statsAccumulator0.getINsByLevel();
      //  // Unstable assertion: assertEquals(258L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      BtreeStats btreeStats0 = (BtreeStats)databaseImpl0.getEmptyStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 0, btreeStats0);
      statsAccumulator0.getINNodeIdsSeen();
      //  // Unstable assertion: assertEquals(238L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test12()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      BtreeStats btreeStats0 = (BtreeStats)databaseImpl0.getEmptyStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 0, btreeStats0);
      int int0 = statsAccumulator0.getDuplicateTreeMaxDepth();
      //  // Unstable assertion: assertEquals(214L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertEquals(0, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      BtreeStats btreeStats0 = (BtreeStats)databaseImpl0.getEmptyStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 0, btreeStats0);
      statsAccumulator0.getDupCountLNCount();
      //  // Unstable assertion: assertEquals(194L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test14()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-3943), btreeStats0);
      long long0 = statsAccumulator0.getDeletedLNCount();
      assertEquals(0L, long0);
  }

  @Test
  public void test15()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      BtreeStats btreeStats0 = (BtreeStats)databaseImpl0.getEmptyStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 0, btreeStats0);
      statsAccumulator0.getDINsByLevel();
      //  // Unstable assertion: assertEquals(174L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test16()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 1832, btreeStats0);
      Set set0 = statsAccumulator0.getDINNodeIdsSeen();
      assertEquals(0, set0.size());
  }

  @Test
  public void test17()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-2472), btreeStats0);
      long[] longArray0 = statsAccumulator0.getDBINsByLevel();
      assertNotNull(longArray0);
  }

  @Test
  public void test18()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-3943), btreeStats0);
      Set set0 = statsAccumulator0.getDBINNodeIdsSeen();
      assertTrue(set0.isEmpty());
  }

  @Test
  public void test19()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 74, btreeStats0);
      long[] longArray0 = statsAccumulator0.getBINsByLevel();
      assertNotNull(longArray0);
  }

  @Test
  public void test20()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 1, (DatabaseStats) null);
      Set set0 = statsAccumulator0.getBINNodeIdsSeen();
      assertTrue(set0.isEmpty());
  }

  @Test
  public void test21()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 496, (DatabaseStats) null);
      DBIN dBIN0 = new DBIN();
      Long long0 = new Long((long) 496);
      // Undeclared exception!
      try { 
        statsAccumulator0.processIN(dBIN0, long0, 190);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 190
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-1233), btreeStats0);
      DIN dIN0 = new DIN();
      Long long0 = new Long(1560L);
      // Undeclared exception!
      try { 
        statsAccumulator0.processDIN(dIN0, long0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 131072, btreeStats0);
      Long long0 = new Long(78L);
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        statsAccumulator0.processBIN(dBIN0, long0, (-21));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -21
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 1, (DatabaseStats) null);
      // Undeclared exception!
      try { 
        statsAccumulator0.incrementLNCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 136, (DatabaseStats) null);
      // Undeclared exception!
      try { 
        statsAccumulator0.copyToStats((DatabaseStats) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-3943), btreeStats0);
      statsAccumulator0.incrementLNCount();
      long long0 = statsAccumulator0.getLNCount();
      assertEquals(1L, long0);
  }

  @Test
  public void test27()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      BtreeStats btreeStats0 = (BtreeStats)databaseImpl0.getEmptyStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 0, btreeStats0);
      statsAccumulator0.incrementLNCount();
      //  // Unstable assertion: assertEquals(137L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test28()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 100, (DatabaseStats) null);
      DBIN dBIN0 = new DBIN();
      Long long0 = new Long((long) 100);
      // Undeclared exception!
      try { 
        statsAccumulator0.processDBIN(dBIN0, long0, 131028);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 65492
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 131072, btreeStats0);
      DIN dIN0 = new DIN();
      Long long0 = new Long(78L);
      statsAccumulator0.processDIN(dIN0, long0, 131072);
      statsAccumulator0.processDIN(dIN0, long0, (-2350));
      assertEquals("</din>", dIN0.endTag());
  }

  @Test
  public void test30()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      long[] longArray0 = new long[7];
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 1832, btreeStats0);
      statsAccumulator0.processDupCountLN((DupCountLN) null, (Long) longArray0[4]);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test
  public void test31()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 0, btreeStats0);
      Long long0 = new Long((long) 0);
      statsAccumulator0.processBIN((BIN) null, long0, 0);
      statsAccumulator0.processBIN((BIN) null, long0, (-1424));
  }

  @Test
  public void test32()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      BtreeStats btreeStats0 = (BtreeStats)databaseImpl0.getEmptyStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 0, btreeStats0);
      DupCountLN dupCountLN0 = new DupCountLN(0);
      statsAccumulator0.hook367(dupCountLN0);
      //  // Unstable assertion: assertEquals(90L, dupCountLN0.getLastId());
      //  // Unstable assertion: assertEquals(89L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test33()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-3943), btreeStats0);
      Long long0 = new Long(0L);
      DBIN dBIN0 = new DBIN();
      statsAccumulator0.processDBIN(dBIN0, long0, 0);
      statsAccumulator0.processDBIN(dBIN0, long0, (-3943));
      assertFalse(dBIN0.isRoot());
  }

  @Test
  public void test34()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      BtreeStats btreeStats0 = (BtreeStats)databaseImpl0.getEmptyStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 0, btreeStats0);
      DIN dIN0 = new DIN();
      Long long0 = new Long(0L);
      statsAccumulator0.processIN(dIN0, long0, 8);
      statsAccumulator0.processIN(dIN0, long0, 0);
      //  // Unstable assertion: assertEquals(1L, dIN0.getLastId());
      //  // Unstable assertion: assertEquals(1L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test35()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) pipedOutputStream0);
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 1, btreeStats0);
      statsAccumulator0.incrementLNCount();
      assertEquals(1L, btreeStats0.getLeafNodeCount());
  }

  @Test
  public void test36()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 131095, btreeStats0);
      DIN dIN0 = new DIN();
      Long long0 = new Long(78L);
      statsAccumulator0.processDIN(dIN0, long0, 131095);
      assertEquals(0L, dIN0.getNodeId());
  }
}
