/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:37:30 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DatabaseId_ESTest2 extends DatabaseId_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      int int0 = databaseId0.getId();
      assertEquals(0, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(356);
      int int0 = databaseId0.getId();
      assertEquals(356, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(340);
      DatabaseId databaseId1 = new DatabaseId();
      boolean boolean0 = databaseId0.equals(databaseId1);
      assertFalse(databaseId1.equals((Object)databaseId0));
      assertFalse(boolean0);
      assertEquals(340, databaseId0.getId());
  }

  @Test
  public void test03()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      ByteBuffer byteBuffer0 = null;
      // Undeclared exception!
      try { 
        databaseId0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      StringBuffer stringBuffer0 = null;
      // Undeclared exception!
      try { 
        databaseId0.dumpLog((StringBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseId", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(0);
      byte[] byteArray0 = databaseId0.getBytes();
      // Undeclared exception!
      try { 
        databaseId0.compareTo(byteArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [B cannot be cast to com.sleepycat.je.dbi.DatabaseId
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseId", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      String string0 = databaseId0.toString();
      assertEquals("0", string0);
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      DatabaseId databaseId1 = new DatabaseId((-1));
      int int0 = databaseId0.compareTo(databaseId1);
      assertEquals(1, int0);
      assertEquals(-1, databaseId1.getId());
  }

  @Test
  public void test08()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-1));
      DatabaseId databaseId1 = new DatabaseId();
      int int0 = databaseId0.compareTo(databaseId1);
      assertEquals((-1), int0);
      assertEquals(-1, databaseId0.getId());
  }

  @Test
  public void test09()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(103);
      // Undeclared exception!
      try { 
        databaseId0.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseId", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-1));
      int int0 = databaseId0.compareTo(databaseId0);
      assertEquals(-1, databaseId0.getId());
      assertEquals(0, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      DatabaseId databaseId1 = new DatabaseId();
      boolean boolean0 = databaseId0.equals(databaseId1);
      assertTrue(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = databaseId0.getBytes();
      boolean boolean0 = databaseId0.equals(byteArray0);
      assertFalse(boolean0);
      assertArrayEquals(new byte[] {(byte)48}, byteArray0);
  }

  @Test
  public void test13()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      boolean boolean0 = databaseId0.equals(databaseId0);
      assertTrue(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-1));
      DatabaseId databaseId1 = new DatabaseId();
      boolean boolean0 = databaseId0.equals(databaseId1);
      assertEquals("-1", databaseId0.toString());
      assertFalse(databaseId1.equals((Object)databaseId0));
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-2533));
      boolean boolean0 = databaseId0.logEntryIsTransactional();
      assertFalse(boolean0);
      assertEquals(-2533, databaseId0.getId());
  }

  @Test
  public void test16()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-2533));
      databaseId0.getLogSize();
      assertEquals("-2533", databaseId0.toString());
  }

  @Test
  public void test17()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-1));
      // Undeclared exception!
      try { 
        databaseId0.readFromLog((ByteBuffer) null, (byte) (-83));
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
      DatabaseId databaseId0 = new DatabaseId(103);
      long long0 = databaseId0.getTransactionId();
      assertEquals(0L, long0);
      assertEquals("103", databaseId0.toString());
  }

  @Test
  public void test19()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-2533));
      int int0 = databaseId0.getId();
      assertEquals((-2533), int0);
  }

  @Test
  public void test20()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      databaseId0.hashCode();
  }
}
