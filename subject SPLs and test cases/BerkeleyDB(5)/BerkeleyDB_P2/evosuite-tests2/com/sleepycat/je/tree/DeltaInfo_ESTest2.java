/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:39:13 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DeltaInfo_ESTest2 extends DeltaInfo_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, 877L, (byte) (-65));
      boolean boolean0 = deltaInfo0.isKnownDeleted();
      assertTrue(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      DeltaInfo deltaInfo0 = new DeltaInfo();
      byte byte0 = deltaInfo0.getState();
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, 0L, (byte)16);
      byte byte0 = deltaInfo0.getState();
      assertEquals((byte)16, byte0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte)0, (byte)78);
      long long0 = deltaInfo0.getLsn();
      assertEquals(0L, long0);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, 877L, (byte) (-65));
      long long0 = deltaInfo0.getLsn();
      assertEquals(877L, long0);
  }

  @Test
  public void test05()  throws Throwable  {
      DeltaInfo deltaInfo0 = new DeltaInfo();
      byte[] byteArray0 = deltaInfo0.getKey();
      assertNull(byteArray0);
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte)0, (byte)1);
      byte[] byteArray1 = deltaInfo0.getKey();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, 877L, (byte) (-65));
      // Undeclared exception!
      try { 
        deltaInfo0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DeltaInfo", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, 877L, (byte) (-65));
      int int0 = deltaInfo0.getLogSize();
      assertEquals(13, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      DeltaInfo deltaInfo0 = new DeltaInfo();
      // Undeclared exception!
      try { 
        deltaInfo0.readFromLog((ByteBuffer) null, (byte)4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DeltaInfo deltaInfo0 = new DeltaInfo();
      boolean boolean0 = deltaInfo0.isKnownDeleted();
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte)0, (byte)78);
      // Undeclared exception!
      try { 
        deltaInfo0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DeltaInfo deltaInfo0 = new DeltaInfo();
      // Undeclared exception!
      try { 
        deltaInfo0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DeltaInfo deltaInfo0 = new DeltaInfo();
      long long0 = deltaInfo0.getLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte) (-95), (byte) (-95));
      byte byte0 = deltaInfo0.getState();
      assertEquals((byte) (-95), byte0);
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, 2933L, (byte) (-60));
      byte[] byteArray1 = deltaInfo0.getKey();
      assertSame(byteArray0, byteArray1);
  }

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, 877L, (byte) (-65));
      long long0 = deltaInfo0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte)0, (byte)1);
      boolean boolean0 = deltaInfo0.logEntryIsTransactional();
      assertFalse(boolean0);
  }
}
