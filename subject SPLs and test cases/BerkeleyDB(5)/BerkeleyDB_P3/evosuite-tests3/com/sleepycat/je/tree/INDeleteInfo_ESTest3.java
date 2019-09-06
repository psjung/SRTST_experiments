/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:14:33 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class INDeleteInfo_ESTest3 extends INDeleteInfo_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(4294967317L, byteArray0, (DatabaseId) null);
      long long0 = iNDeleteInfo0.getDeletedNodeId();
      assertEquals(4294967317L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      DatabaseId databaseId0 = new DatabaseId((int) (byte) (-50));
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-1945L), byteArray0, databaseId0);
      long long0 = iNDeleteInfo0.getDeletedNodeId();
      assertEquals((-1945L), long0);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-27L), byteArray0, databaseId0);
      iNDeleteInfo0.getDeletedIdKey();
      assertEquals((-27L), iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(0L, byteArray0, databaseId0);
      byte[] byteArray1 = iNDeleteInfo0.getDeletedIdKey();
      assertSame(byteArray1, byteArray0);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-856L), byteArray0, (DatabaseId) null);
      iNDeleteInfo0.getDatabaseId();
      assertEquals((-856L), iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-3L), byteArray0, databaseId0);
      iNDeleteInfo0.getDatabaseId();
      assertEquals((-3L), iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseId databaseId0 = new DatabaseId((int) (byte) (-73));
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(477L, byteArray0, databaseId0);
      iNDeleteInfo0.getDatabaseId();
      assertEquals(477L, iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test07()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      // Undeclared exception!
      try { 
        iNDeleteInfo0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      byte[] byteArray0 = iNDeleteInfo0.getDeletedIdKey();
      assertNull(byteArray0);
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-27L), byteArray0, databaseId0);
      boolean boolean0 = iNDeleteInfo0.logEntryIsTransactional();
      assertFalse(boolean0);
      assertEquals((-27L), iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-856L), byteArray0, (DatabaseId) null);
      // Undeclared exception!
      try { 
        iNDeleteInfo0.dumpLog((StringBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.INDeleteInfo", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseId databaseId0 = new DatabaseId((int) (byte)93);
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(1L, byteArray0, databaseId0);
      long long0 = iNDeleteInfo0.getTransactionId();
      assertEquals(0L, long0);
      assertEquals(1L, iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseId databaseId0 = new DatabaseId((int) (byte)93);
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(1L, byteArray0, databaseId0);
      iNDeleteInfo0.getDatabaseId();
      assertEquals(1L, iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseId databaseId0 = new DatabaseId((int) (byte)93);
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(1L, byteArray0, databaseId0);
      int int0 = iNDeleteInfo0.getLogSize();
      assertEquals(1L, iNDeleteInfo0.getDeletedNodeId());
      assertEquals(18, int0);
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(4294967317L, byteArray0, (DatabaseId) null);
      iNDeleteInfo0.postLogWork((byte)127);
      assertEquals(4294967317L, iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-27L), byteArray0, databaseId0);
      boolean boolean0 = iNDeleteInfo0.marshallOutsideWriteLatch();
      assertEquals((-27L), iNDeleteInfo0.getDeletedNodeId());
      assertTrue(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      iNDeleteInfo0.countAsObsoleteWhenLogged();
      // Undeclared exception!
      try { 
        iNDeleteInfo0.readFromLog((ByteBuffer) null, (byte)120);
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
      byte[] byteArray0 = new byte[4];
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(4294967317L, byteArray0, (DatabaseId) null);
      // Undeclared exception!
      try { 
        iNDeleteInfo0.writeToLog((ByteBuffer) null);
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
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      long long0 = iNDeleteInfo0.getDeletedNodeId();
      assertEquals(0L, long0);
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-27L), byteArray0, databaseId0);
      iNDeleteInfo0.getLogType();
      assertEquals((-27L), iNDeleteInfo0.getDeletedNodeId());
  }
}