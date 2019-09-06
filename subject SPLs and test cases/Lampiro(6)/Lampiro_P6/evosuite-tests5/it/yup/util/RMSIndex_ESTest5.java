/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 18:15:11 KST 2018
 */

package it.yup.util;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Enumeration;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RMSIndex_ESTest5 extends RMSIndex_ESTest_scaffolding5 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 1);
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[2];
      rMSIndex0.store(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 0);
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[2];
      rMSIndex0.store(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("");
      byte[] byteArray0 = new byte[0];
      rMSIndex0.store(byteArray0, byteArray0);
      byte[] byteArray1 = new byte[3];
      rMSIndex0.store(byteArray1, byteArray1);
      rMSIndex0.load(byteArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("");
      byte[] byteArray0 = new byte[0];
      rMSIndex0.store(byteArray0, byteArray0);
      byte[] byteArray1 = new byte[3];
      byte[] byteArray2 = new byte[0];
      rMSIndex0.store(byteArray1, byteArray2);
      rMSIndex0.store(byteArray2, (byte[]) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("");
      RMSIndex.Item rMSIndex_Item0 = rMSIndex0.new Item();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 1);
      byte[] byteArray0 = new byte[7];
      rMSIndex0.store(byteArray0, byteArray0);
      byte[] byteArray1 = rMSIndex0.load((byte[]) null);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("");
      boolean boolean0 = rMSIndex0.open();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("");
      byte[] byteArray0 = new byte[0];
      rMSIndex0.store(byteArray0, byteArray0);
      byte[] byteArray1 = new byte[1];
      rMSIndex0.store(byteArray1, byteArray1);
      byte[] byteArray2 = new byte[4];
      rMSIndex0.store(byteArray2, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 1);
      byte[] byteArray0 = new byte[4];
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.delete(byteArray0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 0);
      rMSIndex0.store((byte[]) null, (byte[]) null);
      rMSIndex0.delete((byte[]) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 0);
      rMSIndex0.store((byte[]) null, (byte[]) null);
      byte[] byteArray0 = rMSIndex0.load((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 0);
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = rMSIndex0.load(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 1);
      byte[] byteArray0 = new byte[4];
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.store(byteArray0, byteArray0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 4);
      byte[] byteArray0 = new byte[4];
      rMSIndex0.store(byteArray0, byteArray0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex((String) null, 1);
      byte[] byteArray0 = new byte[6];
      rMSIndex0.store(byteArray0, byteArray0);
      byte[] byteArray1 = new byte[4];
      rMSIndex0.store(byteArray1, byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 1);
      byte[] byteArray0 = new byte[4];
      rMSIndex0.store(byteArray0, byteArray0);
      Enumeration enumeration0 = rMSIndex0.keys();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = RMSIndex.rmExist("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 0);
      RMSIndex.RecordType rMSIndex_RecordType0 = rMSIndex0.new RecordType();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 0);
      boolean boolean0 = rMSIndex0.close();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 0);
      int[] intArray0 = rMSIndex0.getSizes();
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 0);
      Enumeration enumeration0 = rMSIndex0.keys();
      assertNotNull(enumeration0);
  }
}