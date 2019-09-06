/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:21:49 KST 2017
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

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class BINReference_ESTest1 extends BINReference_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-1656));
      byte[] byteArray0 = new byte[2];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      long long0 = bINReference0.getNodeId();
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(0);
      byte[] byteArray0 = new byte[1];
      BINReference bINReference0 = new BINReference(431L, databaseId0, byteArray0);
      long long0 = bINReference0.getNodeId();
      assertEquals(431L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      BINReference bINReference0 = new BINReference((byte)89, (DatabaseId) null, (byte[]) null);
      bINReference0.getKey();
      assertEquals(89L, bINReference0.getNodeId());
  }

  @Test
  public void test03()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-29));
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference((-1L), databaseId0, byteArray0);
      byte[] byteArray1 = bINReference0.getKey();
      assertEquals((-1L), bINReference0.getNodeId());
      assertNotNull(byteArray1);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      BINReference bINReference0 = new BINReference(15L, (DatabaseId) null, byteArray0);
      bINReference0.getDatabaseId();
      assertEquals(15L, bINReference0.getNodeId());
  }

  @Test
  public void test05()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference((-1L), databaseId0, byteArray0);
      bINReference0.getDatabaseId();
      assertEquals((-1L), bINReference0.getNodeId());
  }

  @Test
  public void test06()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(2374);
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference((-1L), databaseId0, byteArray0);
      bINReference0.getDatabaseId();
      assertEquals((-1L), bINReference0.getNodeId());
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-3109));
      byte[] byteArray0 = new byte[7];
      BINReference bINReference0 = new BINReference(842L, databaseId0, byteArray0);
      BINReference bINReference1 = new BINReference((byte)0, databaseId0, bINReference0.idKey);
      boolean boolean0 = bINReference0.equals(bINReference1);
      assertFalse(bINReference1.equals((Object)bINReference0));
      assertFalse(boolean0);
      assertEquals(842L, bINReference0.getNodeId());
  }

  @Test
  public void test08()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[18];
      BINReference bINReference0 = new BINReference(2270L, databaseId0, byteArray0);
      BINReference bINReference1 = new BINReference((-1L), databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      bINReference1.addDeletedKeys(bINReference0);
      assertTrue(bINReference1.deletedKeysExist());
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference(0L, (DatabaseId) null, byteArray0);
      Key key0 = new Key((byte[]) null);
      bINReference0.addDeletedKeys(bINReference0);
      // Undeclared exception!
      try { 
        bINReference0.removeDeletedKey(key0);
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
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[18];
      BINReference bINReference0 = new BINReference(2270L, databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      Key key1 = new Key((byte[]) null);
      // Undeclared exception!
      try { 
        bINReference0.hasDeletedKey(key1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Key", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference(1L, (DatabaseId) null, byteArray0);
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
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference(0L, (DatabaseId) null, byteArray0);
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
  public void test13()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[1];
      BINReference bINReference0 = new BINReference((byte)76, databaseId0, byteArray0);
      BINReference bINReference1 = new BINReference((byte)76, databaseId0, bINReference0.idKey);
      boolean boolean0 = bINReference0.equals(bINReference1);
      assertEquals(76L, bINReference1.getNodeId());
      assertTrue(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference(0L, (DatabaseId) null, byteArray0);
      BINReference bINReference1 = new BINReference((byte)89, (DatabaseId) null, (byte[]) null);
      boolean boolean0 = bINReference0.equals(bINReference1);
      assertEquals(89L, bINReference1.getNodeId());
      assertFalse(bINReference1.equals((Object)bINReference0));
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference((-1820L), databaseId0, byteArray0);
      boolean boolean0 = bINReference0.equals(bINReference0);
      assertTrue(boolean0);
      assertEquals((-1820L), bINReference0.getNodeId());
  }

  @Test
  public void test16()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[18];
      BINReference bINReference0 = new BINReference(2270L, databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      boolean boolean0 = bINReference0.equals(key0);
      assertFalse(boolean0);
      assertEquals(2270L, bINReference0.getNodeId());
  }

  @Test
  public void test17()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(0);
      byte[] byteArray0 = new byte[1];
      Key key0 = new Key(byteArray0);
      BINReference bINReference0 = new BINReference((byte) (-84), databaseId0, byteArray0);
      bINReference0.addDeletedKey(key0);
      bINReference0.getDeletedKeyIterator();
      assertEquals((-84L), bINReference0.getNodeId());
  }

  @Test
  public void test18()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-3109));
      byte[] byteArray0 = new byte[7];
      BINReference bINReference0 = new BINReference(842L, databaseId0, byteArray0);
      bINReference0.getDeletedKeyIterator();
      assertEquals(842L, bINReference0.getNodeId());
  }

  @Test
  public void test19()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(0);
      byte[] byteArray0 = new byte[23];
      BINReference bINReference0 = new BINReference(1873L, databaseId0, byteArray0);
      bINReference0.addDeletedKeys(bINReference0);
      boolean boolean0 = bINReference0.deletedKeysExist();
      assertFalse(boolean0);
      assertEquals(1873L, bINReference0.getNodeId());
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference(0L, (DatabaseId) null, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      boolean boolean0 = bINReference0.deletedKeysExist();
      assertTrue(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[18];
      BINReference bINReference0 = new BINReference(2270L, databaseId0, byteArray0);
      boolean boolean0 = bINReference0.deletedKeysExist();
      assertEquals(2270L, bINReference0.getNodeId());
      assertFalse(boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[17];
      BINReference bINReference0 = new BINReference(65L, databaseId0, byteArray0);
      bINReference0.addDeletedKeys(bINReference0);
      Key key0 = new Key(byteArray0);
      boolean boolean0 = bINReference0.hasDeletedKey(key0);
      assertFalse(boolean0);
      assertEquals(65L, bINReference0.getNodeId());
  }

  @Test
  public void test23()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[18];
      BINReference bINReference0 = new BINReference(2270L, databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      boolean boolean0 = bINReference0.hasDeletedKey(key0);
      assertEquals(2270L, bINReference0.getNodeId());
      assertTrue(boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-1656));
      byte[] byteArray0 = new byte[2];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      Key key0 = new Key(bINReference0.idKey);
      boolean boolean0 = bINReference0.hasDeletedKey(key0);
      assertFalse(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      BINReference bINReference0 = new BINReference(15L, (DatabaseId) null, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      bINReference0.removeDeletedKey((Key) null);
      assertTrue(bINReference0.deletedKeysExist());
  }

  @Test
  public void test26()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[18];
      BINReference bINReference0 = new BINReference(2270L, databaseId0, byteArray0);
      bINReference0.addDeletedKeys(bINReference0);
      Key key0 = new Key(byteArray0);
      bINReference0.removeDeletedKey(key0);
      assertEquals(2270L, bINReference0.getNodeId());
  }

  @Test
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference(0L, (DatabaseId) null, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.removeDeletedKey(key0);
      assertFalse(bINReference0.deletedKeysExist());
  }

  @Test
  public void test28()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[18];
      BINReference bINReference0 = new BINReference(2270L, databaseId0, byteArray0);
      BINReference bINReference1 = new BINReference((-1L), databaseId0, byteArray0);
      bINReference1.addDeletedKeys(bINReference0);
      assertEquals((-1L), bINReference1.getNodeId());
  }

  @Test
  public void test29()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[18];
      BINReference bINReference0 = new BINReference(2270L, databaseId0, byteArray0);
      bINReference0.addDeletedKeys(bINReference0);
      bINReference0.addDeletedKeys(bINReference0);
      assertEquals(2270L, bINReference0.getNodeId());
  }

  @Test
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      BINReference bINReference0 = new BINReference(15L, (DatabaseId) null, byteArray0);
      bINReference0.addDeletedKey((Key) null);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      assertEquals(15L, bINReference0.getNodeId());
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference(0L, (DatabaseId) null, byteArray0);
      String string0 = bINReference0.toString();
      assertEquals("idKey=key=<key v=\"0 0 0 0 0 \"/> nodeId = 0 db=null deletedKeys=null", string0);
  }

  @Test
  public void test32()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-832));
      byte[] byteArray0 = new byte[1];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      DatabaseId databaseId1 = bINReference0.getDatabaseId();
      assertEquals(-832, databaseId1.getId());
  }

  @Test
  public void test33()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(0);
      byte[] byteArray0 = new byte[1];
      BINReference bINReference0 = new BINReference((byte) (-84), databaseId0, byteArray0);
      long long0 = bINReference0.getNodeId();
      assertEquals((-84L), long0);
  }

  @Test
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference(0L, (DatabaseId) null, byteArray0);
      byte[] byteArray1 = bINReference0.getData();
      assertNull(byteArray1);
  }

  @Test
  public void test35()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(0);
      byte[] byteArray0 = new byte[1];
      BINReference bINReference0 = new BINReference(431L, databaseId0, byteArray0);
      bINReference0.hashCode();
      assertEquals(431L, bINReference0.getNodeId());
  }

  @Test
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference(0L, (DatabaseId) null, byteArray0);
      byte[] byteArray1 = bINReference0.getKey();
      assertSame(byteArray0, byteArray1);
  }
}
