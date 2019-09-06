/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 16:12:48 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.INList;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Node_ESTest4 extends Node_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      fileSummaryLN0.marshallOutsideWriteLatch();
      assertEquals(0L, fileSummaryLN0.getNodeId());
  }

  @Test
  public void test01()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1636);
      dupCountLN0.getMemorySizeIncludedByParent();
      //  // Unstable assertion: assertEquals(4294969223L, dupCountLN0.getNodeId());
  }

  @Test
  public void test02()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      mapLN0.makeDeleted();
      Node.getLastId();
      Node.setLastNodeId(4294969221L);
      // Undeclared exception!
      try { 
        mapLN0.copyData();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.LN", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      TreeLocation treeLocation0 = new TreeLocation();
      dBIN0.matchLNByNodeId(treeLocation0, (-1604));
      //  // Unstable assertion: assertEquals(3L, dBIN0.getLastId());
  }

  @Test
  public void test04()  throws Throwable  {
      LN lN0 = new LN();
      int int0 = lN0.getLogSize();
      assertEquals(9, int0);
      assertEquals(0L, lN0.getNodeId());
  }

  @Test
  public void test05()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-1524));
      NameLN nameLN0 = new NameLN(databaseId0);
      nameLN0.rebuildINList((INList) null);
      //  // Unstable assertion: assertEquals(8L, nameLN0.getNodeId());
  }

  @Test
  public void test06()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      fileSummaryLN0.isValidForDelete();
      //  // Unstable assertion: assertEquals(6L, fileSummaryLN0.getLastId());
  }

  @Test
  public void test07()  throws Throwable  {
      IN iN0 = new IN();
      iN0.isSoughtNode((-1207L), false);
      assertEquals(0L, iN0.getNodeId());
  }

  @Test
  public void test08()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      MapLN mapLN0 = new MapLN(databaseImpl0);
      mapLN0.canBeAncestor(false);
      //  // Unstable assertion: assertEquals(6L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertEquals(7L, mapLN0.getLastId());
  }

  @Test
  public void test09()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("/");
      // Undeclared exception!
      try { 
        dupCountLN0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      BIN bIN0 = new BIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(" index=");
      // Undeclared exception!
      try { 
        bIN0.readFromLog(byteBuffer0, (byte)1);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      MapLN mapLN0 = new MapLN(databaseImpl0);
      // Undeclared exception!
      try { 
        mapLN0.postFetchInit(databaseImpl0, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      LN lN0 = new LN(byteArray0);
      // Undeclared exception!
      try { 
        lN0.dumpString((-1987), false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1985
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      IN iN0 = new IN();
      // Undeclared exception!
      try { 
        iN0.dump((-1604));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1604
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      long long0 = Node.getNextNodeId();
      //  // Unstable assertion: assertEquals(11L, long0);
  }

  @Test
  public void test15()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.getType();
      //  // Unstable assertion: assertEquals(9L, dBIN0.getLastId());
  }

  @Test
  public void test16()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("nhSU(o{k:9wJ#zB5RG");
      // Undeclared exception!
      try { 
        dupCountLN0.writeToLog(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      // Undeclared exception!
      try { 
        dupCountLN0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      int int0 = mapLN0.getLevel();
      //  // Unstable assertion: assertEquals(10L, mapLN0.getLastId());
      //  // Unstable assertion: assertEquals(0, int0);
  }

  @Test
  public void test19()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      boolean boolean0 = fileSummaryLN0.containsDuplicates();
      assertFalse(boolean0);
      assertEquals(0L, fileSummaryLN0.getNodeId());
  }

  @Test
  public void test20()  throws Throwable  {
      LN lN0 = new LN();
      String string0 = lN0.toString();
      //  // Unstable assertion: assertEquals("<ln>\n  <node>0</node>\n</ln>", string0);
      //  // Unstable assertion: assertEquals(7L, lN0.getLastId());
  }

  @Test
  public void test21()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      byte[] byteArray0 = new byte[8];
      dupCountLN0.verify(byteArray0);
      //  // Unstable assertion: assertEquals(6L, dupCountLN0.getLastId());
  }

  @Test
  public void test22()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      StringWriter stringWriter0 = new StringWriter((int) (byte)101);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dupCountLN0.dumpLog(stringBuffer0, true);
      //  // Unstable assertion: assertEquals(53, stringBuffer0.length());
      //  // Unstable assertion: assertEquals(5L, dupCountLN0.getLastId());
  }

  @Test
  public void test23()  throws Throwable  {
      IN iN0 = new IN();
      String string0 = iN0.shortDescription();
      assertEquals("<com.sleepycat.je.tree.IN/0", string0);
  }

  @Test
  public void test24()  throws Throwable  {
      NameLN nameLN0 = new NameLN((DatabaseId) null);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("YS(-[<#::6");
      // Undeclared exception!
      try { 
        nameLN0.readFromLog(byteBuffer0, (byte)49);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.NameLN", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      IN iN0 = new IN();
      iN0.dump(0);
      //  // Unstable assertion: assertEquals(1L, iN0.getLastId());
  }

  @Test
  public void test26()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      dupCountLN0.postLogWork((byte)101);
      //  // Unstable assertion: assertEquals(0L, dupCountLN0.getLastId());
  }

  @Test
  public void test27()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      boolean boolean0 = dupCountLN0.marshallOutsideWriteLatch();
      //  // Unstable assertion: assertTrue(boolean0);
      //  // Unstable assertion: assertEquals((-1L), dupCountLN0.getLastId());
  }

  @Test
  public void test28()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1636);
      //  // Unstable assertion: assertEquals(5L, dupCountLN0.getNodeId());
      
      dupCountLN0.setNodeId(0L);
      //  // Unstable assertion: assertEquals(5L, dupCountLN0.getLastId());
  }

  @Test
  public void test29()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      dupCountLN0.postFetchInit((DatabaseImpl) null, (-1360L));
      //  // Unstable assertion: assertEquals(3L, dupCountLN0.getLastId());
  }

  @Test
  public void test30()  throws Throwable  {
      BIN bIN0 = new BIN();
      TreeLocation treeLocation0 = new TreeLocation();
      try { 
        bIN0.matchLNByNodeId(treeLocation0, (-1604));
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // matchLNByNodeId called on non DIN/DBIN
         //
         assertThrownBy("com.sleepycat.je.tree.Node", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.countAsObsoleteWhenLogged();
      //  // Unstable assertion: assertEquals(1L, bIN0.getLastId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test32()  throws Throwable  {
      IN iN0 = new IN();
      long long0 = iN0.getMemorySizeIncludedByParent();
      //  // Unstable assertion: assertEquals(0L, long0);
      //  // Unstable assertion: assertEquals(0L, iN0.getLastId());
  }
}
