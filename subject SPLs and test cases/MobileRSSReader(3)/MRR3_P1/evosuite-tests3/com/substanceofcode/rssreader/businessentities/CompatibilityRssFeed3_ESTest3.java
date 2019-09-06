/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:44:57 KST 2018
 */

package com.substanceofcode.rssreader.businessentities;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.Instant;
import java.util.Date;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CompatibilityRssFeed3_ESTest3 extends CompatibilityRssFeed3_ESTest_scaffolding3 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Date date0 = new Date();
      Date date1 = new Date(0L);
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", (String) null, date0, "", date0, 0);
      compatibilityRssFeed3_0.setUpddate(date1);
      Date date2 = compatibilityRssFeed3_0.getDate();
      //  // Unstable assertion: assertEquals(0, compatibilityRssFeed3_0.getCategory());
      //  // Unstable assertion: assertEquals("", compatibilityRssFeed3_0.getName());
      //  // Unstable assertion: assertEquals("Sun Aug 12 18:44:21 KST 2018", date2.toString());
      //  // Unstable assertion: assertEquals("", compatibilityRssFeed3_0.getUrl());
      //  // Unstable assertion: assertEquals("", compatibilityRssFeed3_0.getLink());
      //  // Unstable assertion: assertNotNull(date2);
      //  // Unstable assertion: assertEquals("", compatibilityRssFeed3_0.getUsername());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Date date0 = new Date();
      Date date1 = new Date(0L);
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", (String) null, date0, "", date0, 0);
      compatibilityRssFeed3_0.setUpddate(date1);
      String string0 = compatibilityRssFeed3_0.toString();
      //  // Unstable assertion: assertEquals("|||null|0||0|1652d85b0df|", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(true, true, "");
      Date date0 = new Date();
      compatibilityRssFeed3_0.m_date = date0;
      String string0 = compatibilityRssFeed3_0.toString();
      //  // Unstable assertion: assertEquals("||||||-1|1652d85af95|", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      String string0 = compatibilityRssFeed3_0.toString();
      assertEquals("||||||-1||", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      
      compatibilityRssFeed3_0.setCategory(1);
      assertEquals(1, compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      Date date0 = new Date();
      compatibilityRssFeed3_0.setDate(date0);
      //  // Unstable assertion: assertEquals("Sun Aug 12 18:44:19 KST 2018", date0.toString());
      
      compatibilityRssFeed3_0.copyTo(compatibilityRssFeed3_0);
      //  // Unstable assertion: assertEquals("", compatibilityRssFeed3_0.getUsername());
      //  // Unstable assertion: assertEquals("", compatibilityRssFeed3_0.getLink());
      //  // Unstable assertion: assertEquals("", compatibilityRssFeed3_0.getName());
      //  // Unstable assertion: assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      //  // Unstable assertion: assertEquals("", compatibilityRssFeed3_0.getUrl());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      String string0 = compatibilityRssFeed3_0.getStoreString(true, true);
      assertEquals("||||||||", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("v$A", "v$A", "u:rbZ.kD$Z=1'5%[4.", "u:rbZ.kD$Z=1'5%[4.");
      String string0 = compatibilityRssFeed3_0.getName();
      assertEquals("v$A", string0);
      
      String string1 = compatibilityRssFeed3_0.getStoreString(true, true);
      assertEquals("v$A|v$A|u:rbZ.kD$Z=1'5%[4.|dTpyYloua0QkWj0xJzUlWzQu|||||", string1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      
      String[] stringArray0 = new String[8];
      compatibilityRssFeed3_0.init(false, 1, false, true, true, stringArray0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getName());
      
      String[] stringArray0 = new String[9];
      compatibilityRssFeed3_0.init(true, 1, true, true, false, stringArray0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getName());
      
      String[] stringArray0 = new String[5];
      compatibilityRssFeed3_0.init(false, 0, false, true, true, stringArray0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      compatibilityRssFeed3_0.modifyItunes(true, "", "", "", "", "", "", (byte)0);
      String[] stringArray0 = new String[9];
      compatibilityRssFeed3_0.init(true, (int) (byte)0, false, true, false, stringArray0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      String[] stringArray0 = new String[7];
      stringArray0[2] = "";
      stringArray0[3] = "";
      compatibilityRssFeed3_0.init(true, 0, true, true, true, stringArray0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(true, false, (String) null);
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3((String) null, (String) null, (String) null, "");
      String string0 = compatibilityRssFeed3_0.getUsername();
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertNull(string0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      String[] stringArray0 = new String[7];
      stringArray0[2] = "Z";
      compatibilityRssFeed3_0.init(true, 0, true, true, true, stringArray0);
      compatibilityRssFeed3_0.getUsername();
      assertEquals("Z", compatibilityRssFeed3_0.getUsername());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(false, true, "|X");
      String string0 = compatibilityRssFeed3_0.getUrl();
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("X", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      
      compatibilityRssFeed3_0.m_password = null;
      String string0 = compatibilityRssFeed3_0.getPassword();
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertNull(string0);
      assertEquals("", compatibilityRssFeed3_0.getUsername());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      compatibilityRssFeed3_0.m_password = "x";
      compatibilityRssFeed3_0.getPassword();
      assertEquals("x", compatibilityRssFeed3_0.getPassword());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("v", "", "", "");
      String string0 = compatibilityRssFeed3_0.getName();
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("v", string0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "", (Date) null, " ", (Date) null, 0);
      String string0 = compatibilityRssFeed3_0.getLink();
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals(0, compatibilityRssFeed3_0.getCategory());
      assertEquals(" ", string0);
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      compatibilityRssFeed3_0.getDate();
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(true, true, "");
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      
      compatibilityRssFeed3_0.setCategory(0);
      int int0 = compatibilityRssFeed3_0.getCategory();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "", (Date) null, "", (Date) null, 1);
      int int0 = compatibilityRssFeed3_0.getCategory();
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals(1, int0);
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getLink());
      assertEquals("", compatibilityRssFeed3_0.getName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "", date0, "", date0, 0);
      compatibilityRssFeed3_0.m_items = null;
      // Undeclared exception!
      try { 
        compatibilityRssFeed3_0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed3", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      Vector<String> vector0 = new Vector<String>();
      compatibilityRssFeed3_0.m_items = vector0;
      vector0.add("");
      // Undeclared exception!
      try { 
        compatibilityRssFeed3_0.toString();
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      // Undeclared exception!
      try { 
        compatibilityRssFeed3_0.setLink((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      // Undeclared exception!
      try { 
        compatibilityRssFeed3_0.equals((CompatibilityRssFeed3) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed3", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      // Undeclared exception!
      try { 
        compatibilityRssFeed3_0.copyTo((CompatibilityRssFeed3) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed3", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = null;
      try {
        compatibilityRssFeed3_0 = new CompatibilityRssFeed3((RssFeed) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed3", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      Instant instant0 = Instant.ofEpochMilli(0);
      Date date0 = Date.from(instant0);
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3("I", "", "", "", date0, (String) null, date0, 0);
      boolean boolean0 = compatibilityRssFeed3_0.equals(compatibilityRssFeed3_1);
      assertFalse(boolean0);
      assertEquals("I", compatibilityRssFeed3_1.getName());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_1.getUsername());
      assertEquals("", compatibilityRssFeed3_1.getUrl());
      assertEquals("", compatibilityRssFeed3_1.getPassword());
      assertEquals(0, compatibilityRssFeed3_1.getCategory());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "", date0, "", date0, 0);
      compatibilityRssFeed3_0.setLink("");
      assertEquals(0, compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getLink());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "", date0, "", date0, 0);
      String string0 = compatibilityRssFeed3_0.toString();
      assertEquals("||||0||0|0|", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      Vector<CompatibilityRssItunesItem3> vector0 = new Vector<CompatibilityRssItunesItem3>();
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      vector0.add(compatibilityRssItunesItem3_0);
      compatibilityRssFeed3_0.setItems(vector0);
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3();
      boolean boolean0 = compatibilityRssFeed3_0.equals(compatibilityRssFeed3_1);
      assertEquals((-1), compatibilityRssFeed3_1.getCategory());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3(false, false, "");
      compatibilityRssFeed3_0.copyTo(compatibilityRssFeed3_1);
      compatibilityRssFeed3_1.setLink("T");
      boolean boolean0 = compatibilityRssFeed3_0.equals(compatibilityRssFeed3_1);
      assertEquals("T", compatibilityRssFeed3_1.getLink());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "", date0, "", date0, 0);
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3(compatibilityRssFeed3_0);
      compatibilityRssFeed3_0.equals(compatibilityRssFeed3_1);
      assertEquals(0, compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getLink());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      
      Instant instant0 = Instant.ofEpochMilli(0);
      Date date0 = Date.from(instant0);
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3("", "", "", "", date0, "", date0, 0);
      compatibilityRssFeed3_1.copyTo(compatibilityRssFeed3_0);
      boolean boolean0 = compatibilityRssFeed3_0.equals(compatibilityRssFeed3_1);
      assertEquals(0, compatibilityRssFeed3_0.getCategory());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      compatibilityRssFeed3_0.m_password = "7";
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3();
      boolean boolean0 = compatibilityRssFeed3_0.equals(compatibilityRssFeed3_1);
      assertEquals((-1), compatibilityRssFeed3_1.getCategory());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "R", "");
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3();
      boolean boolean0 = compatibilityRssFeed3_0.equals(compatibilityRssFeed3_1);
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertFalse(boolean0);
      assertEquals((-1), compatibilityRssFeed3_1.getCategory());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals("R", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      Instant instant0 = Instant.ofEpochMilli(0);
      Date date0 = Date.from(instant0);
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3("", "3", "", "", date0, "", date0, 0);
      boolean boolean0 = compatibilityRssFeed3_0.equals(compatibilityRssFeed3_1);
      assertEquals("", compatibilityRssFeed3_1.getLink());
      assertEquals("", compatibilityRssFeed3_1.getPassword());
      assertEquals("3", compatibilityRssFeed3_1.getUrl());
      assertEquals("", compatibilityRssFeed3_1.getName());
      assertFalse(boolean0);
      assertEquals("", compatibilityRssFeed3_1.getUsername());
      assertEquals(0, compatibilityRssFeed3_1.getCategory());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "", date0, "", date0, 0);
      String string0 = compatibilityRssFeed3_0.getStoreString(true, true);
      //  // Unstable assertion: assertEquals("||||1652d857cc4||1652d857cc4|0|", string0);
      //  // Unstable assertion: assertEquals("Sun Aug 12 18:44:07 KST 2018", date0.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(false, true, "");
      Vector<String> vector0 = new Vector<String>();
      vector0.add((String) null);
      compatibilityRssFeed3_0.setItems(vector0);
      // Undeclared exception!
      try { 
        compatibilityRssFeed3_0.getStoreString(true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed3", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      String string0 = compatibilityRssFeed3_0.getStoreString(false, false);
      assertEquals("||||||||", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(false, false, "|||||");
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getName());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      
      String[] stringArray0 = new String[5];
      stringArray0[4] = "n";
      compatibilityRssFeed3_0.init(false, 0, false, true, true, stringArray0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(true, true, "");
      compatibilityRssFeed3_0.getUpddate();
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "", date0, "", date0, 0);
      String string0 = compatibilityRssFeed3_0.getUsername();
      assertEquals(0, compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals("", string0);
      assertEquals("", compatibilityRssFeed3_0.getLink());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(true, true, "");
      Date date0 = new Date(0);
      compatibilityRssFeed3_0.setUpddate(date0);
      Date date1 = compatibilityRssFeed3_0.getUpddate();
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertNotNull(date1);
      assertEquals("", compatibilityRssFeed3_0.getName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      compatibilityRssFeed3_0.setUrl("");
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      String string0 = compatibilityRssFeed3_0.getUrl();
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", string0);
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      String string0 = compatibilityRssFeed3_0.getName();
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      String string0 = compatibilityRssFeed3_0.getPassword();
      assertEquals("", string0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      String string0 = compatibilityRssFeed3_0.getLink();
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", string0);
      assertEquals("", compatibilityRssFeed3_0.getUsername());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      compatibilityRssFeed3_0.setName("");
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3(compatibilityRssFeed3_0);
      Date date0 = new Date();
      compatibilityRssFeed3_1.m_date = date0;
      //  // Unstable assertion: assertEquals("Sun Aug 12 18:44:01 KST 2018", compatibilityRssFeed3_1.m_date.toString());
      
      compatibilityRssFeed3_0.equals(compatibilityRssFeed3_1);
      //  // Unstable assertion: assertEquals("", compatibilityRssFeed3_0.getName());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      compatibilityRssFeed3_0.getItems();
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      int int0 = compatibilityRssFeed3_0.getCategory();
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals((-1), int0);
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
  }
}
