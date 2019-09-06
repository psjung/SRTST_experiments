/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:58:21 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Iterator;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class BINReference_ESTest3 extends BINReference_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      long long0 = bINReference0.getNodeId();
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-1));
      byte[] byteArray0 = new byte[6];
      BINReference bINReference0 = new BINReference(1L, databaseId0, byteArray0);
      long long0 = bINReference0.getNodeId();
      assertEquals(1L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      BINReference bINReference0 = new BINReference((byte) (-3), (DatabaseId) null, (byte[]) null);
      bINReference0.getKey();
      assertEquals((-3L), bINReference0.getNodeId());
  }

  @Test
  public void test03()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      byte[] byteArray1 = bINReference0.getKey();
      assertSame(byteArray0, byteArray1);
  }

  @Test
  public void test04()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[1];
      BINReference bINReference0 = new BINReference((-1142L), databaseId0, byteArray0);
      bINReference0.getDatabaseId();
      assertEquals((-1142L), bINReference0.getNodeId());
  }

  @Test
  public void test05()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(1);
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference(255L, databaseId0, byteArray0);
      bINReference0.getDatabaseId();
      assertEquals(255L, bINReference0.getNodeId());
  }

  @Test
  public void test06()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-1073741823));
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      DatabaseId databaseId1 = bINReference0.getDatabaseId();
      assertFalse(databaseId1.logEntryIsTransactional());
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      BINReference bINReference0 = new BINReference((-29L), (DatabaseId) null, byteArray0);
      BINReference bINReference1 = new BINReference((byte)1, (DatabaseId) null, byteArray0);
      boolean boolean0 = bINReference1.equals(bINReference0);
      assertFalse(bINReference0.equals((Object)bINReference1));
      assertEquals(1L, bINReference1.getNodeId());
      assertFalse(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      BINReference bINReference0 = new BINReference((byte) (-1), (DatabaseId) null, byteArray0);
      BINReference bINReference1 = new BINReference((byte) (-1), (DatabaseId) null, byteArray0);
      bINReference0.addDeletedKeys(bINReference1);
      bINReference1.addDeletedKeys(bINReference0);
      assertEquals((-1L), bINReference1.getNodeId());
  }

  @Test
  public void test09()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[2];
      BINReference bINReference0 = new BINReference((-276L), databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      Key key1 = new Key((byte[]) null);
      // Undeclared exception!
      try { 
        bINReference0.removeDeletedKey(key1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Key", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(0);
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      bINReference0.addDeletedKey((Key) null);
      // Undeclared exception!
      try { 
        bINReference0.hasDeletedKey((Key) null);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(1310);
      byte[] byteArray0 = new byte[1];
      BINReference bINReference0 = new BINReference(147L, databaseId0, byteArray0);
      // Undeclared exception!
      try { 
        bINReference0.addDeletedKeys((BINReference) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BINReference", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[8];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      BINReference bINReference1 = new BINReference(0L, databaseId0, byteArray0);
      boolean boolean0 = bINReference0.equals(bINReference1);
      assertTrue(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      BINReference bINReference0 = new BINReference(60L, (DatabaseId) null, byteArray0);
      BINReference bINReference1 = new BINReference((byte)1, (DatabaseId) null, byteArray0);
      boolean boolean0 = bINReference1.equals(bINReference0);
      assertFalse(bINReference0.equals((Object)bINReference1));
      assertFalse(boolean0);
      assertEquals(1L, bINReference1.getNodeId());
  }

  @Test
  public void test14()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[8];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      boolean boolean0 = bINReference0.equals(bINReference0);
      assertTrue(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[2];
      BINReference bINReference0 = new BINReference((-276L), databaseId0, byteArray0);
      Object object0 = new Object();
      boolean boolean0 = bINReference0.equals(object0);
      assertFalse(boolean0);
      assertEquals((-276L), bINReference0.getNodeId());
  }

  @Test
  public void test16()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      bINReference0.addDeletedKeys(bINReference0);
      Iterator iterator0 = bINReference0.getDeletedKeyIterator();
      assertNotNull(iterator0);
  }

  @Test
  public void test17()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      Iterator iterator0 = bINReference0.getDeletedKeyIterator();
      assertNull(iterator0);
  }

  @Test
  public void test18()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[2];
      BINReference bINReference0 = new BINReference((-279L), databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      boolean boolean0 = bINReference0.deletedKeysExist();
      assertTrue(boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference((-2300L), (DatabaseId) null, byteArray0);
      bINReference0.addDeletedKeys(bINReference0);
      boolean boolean0 = bINReference0.deletedKeysExist();
      assertEquals((-2300L), bINReference0.getNodeId());
      assertFalse(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference(264L, (DatabaseId) null, byteArray0);
      boolean boolean0 = bINReference0.deletedKeysExist();
      assertEquals(264L, bINReference0.getNodeId());
      assertFalse(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(3160);
      byte[] byteArray0 = new byte[1];
      BINReference bINReference0 = new BINReference(449L, databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      boolean boolean0 = bINReference0.hasDeletedKey(key0);
      assertTrue(boolean0);
      assertEquals(449L, bINReference0.getNodeId());
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference((-2300L), (DatabaseId) null, byteArray0);
      bINReference0.addDeletedKeys(bINReference0);
      boolean boolean0 = bINReference0.hasDeletedKey((Key) null);
      assertFalse(boolean0);
      assertEquals((-2300L), bINReference0.getNodeId());
  }

  @Test
  public void test23()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      boolean boolean0 = bINReference0.hasDeletedKey(key0);
      assertFalse(boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[2];
      BINReference bINReference0 = new BINReference((-23L), databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      bINReference0.removeDeletedKey((Key) null);
      assertTrue(bINReference0.deletedKeysExist());
  }

  @Test
  public void test25()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[2];
      BINReference bINReference0 = new BINReference((-276L), databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      bINReference0.removeDeletedKey(key0);
      assertEquals((-276L), bINReference0.getNodeId());
  }

  @Test
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference((-2300L), (DatabaseId) null, byteArray0);
      Key key0 = new Key((byte[]) null);
      bINReference0.removeDeletedKey(key0);
      assertEquals((-2300L), bINReference0.getNodeId());
  }

  @Test
  public void test27()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      bINReference0.addDeletedKeys(bINReference0);
      bINReference0.addDeletedKeys(bINReference0);
      assertFalse(bINReference0.deletedKeysExist());
  }

  @Test
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference((-2300L), (DatabaseId) null, byteArray0);
      Key key0 = new Key((byte[]) null);
      // Undeclared exception!
      try { 
        bINReference0.addDeletedKey(key0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Key", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(3160);
      byte[] byteArray0 = new byte[1];
      BINReference bINReference0 = new BINReference(449L, databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKeys(bINReference0);
      bINReference0.addDeletedKey(key0);
      assertEquals(449L, bINReference0.getNodeId());
  }

  @Test
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference((-2300L), (DatabaseId) null, byteArray0);
      String string0 = bINReference0.toString();
      assertEquals("idKey=key=<key v=\"0 0 0 0 0 \"/> nodeId = -2300 db=null deletedKeys=null", string0);
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference((-2300L), (DatabaseId) null, byteArray0);
      bINReference0.getDatabaseId();
      assertEquals((-2300L), bINReference0.getNodeId());
  }

  @Test
  public void test32()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[1];
      BINReference bINReference0 = new BINReference((-1142L), databaseId0, byteArray0);
      long long0 = bINReference0.getNodeId();
      assertEquals((-1142L), long0);
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference((-2300L), (DatabaseId) null, byteArray0);
      bINReference0.getData();
      assertEquals((-2300L), bINReference0.getNodeId());
  }

  @Test
  public void test34()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[3];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      bINReference0.hashCode();
  }

  @Test
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference((-2300L), (DatabaseId) null, byteArray0);
      byte[] byteArray1 = bINReference0.getKey();
      assertEquals((-2300L), bINReference0.getNodeId());
      assertNotNull(byteArray1);
  }
}
