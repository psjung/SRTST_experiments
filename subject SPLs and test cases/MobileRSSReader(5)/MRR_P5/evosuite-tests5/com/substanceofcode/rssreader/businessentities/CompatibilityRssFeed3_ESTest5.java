/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 17:34:13 KST 2018
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
public class CompatibilityRssFeed3_ESTest5 extends CompatibilityRssFeed3_ESTest_scaffolding5 {
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
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      String[] stringArray0 = new String[6];
      stringArray0[1] = "";
      compatibilityRssFeed3_0.init(false, 0, false, true, true, stringArray0);
      compatibilityRssFeed3_0.setLink("");
      assertEquals(8, RssItunesFeed.INAME_OFFSET);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      compatibilityRssFeed3_0.init(false, 0, false, true, true, stringArray0);
      compatibilityRssFeed3_0.setLink("");
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getLink());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      Date date0 = new Date(0);
      compatibilityRssFeed3_0.setUpddate(date0);
      Date date1 = compatibilityRssFeed3_0.getUpddate();
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertNotNull(date1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      compatibilityRssFeed3_0.m_itunes = true;
      Instant instant0 = Instant.EPOCH;
      Date date0 = Date.from(instant0);
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3("", "1", "", "", date0, "", date0, 0);
      boolean boolean0 = compatibilityRssFeed3_0.equals(compatibilityRssFeed3_1);
      assertEquals(0, compatibilityRssFeed3_1.getCategory());
      assertEquals("1", compatibilityRssFeed3_1.getUrl());
      assertEquals("", compatibilityRssFeed3_1.getName());
      assertFalse(boolean0);
      assertEquals("", compatibilityRssFeed3_1.getUsername());
      assertEquals("", compatibilityRssFeed3_1.getLink());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_1.getPassword());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      compatibilityRssFeed3_0.setLink("O");
      compatibilityRssFeed3_0.copyTo(compatibilityRssFeed3_0);
      assertEquals("O", compatibilityRssFeed3_0.getLink());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(true, true, "");
      Date date0 = new Date(0);
      compatibilityRssFeed3_0.setDate(date0);
      compatibilityRssFeed3_0.copyTo(compatibilityRssFeed3_0);
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals("", compatibilityRssFeed3_0.getLink());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      String string0 = compatibilityRssFeed3_0.getStoreString(true, false);
      assertEquals("||||||||", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "", date0, "", date0, (-1));
      Vector<CompatibilityRssItunesItem3> vector0 = new Vector<CompatibilityRssItunesItem3>();
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3("", "", "", date0, "", false, true, "", "", "", (byte)0, "");
      vector0.add(compatibilityRssItunesItem3_0);
      compatibilityRssFeed3_0.setItems(vector0);
      //  // Unstable assertion: assertEquals("[true||||0||Sun Aug 12 17:33:37 KST 2018||false|]", vector0.toString());
      
      String string0 = compatibilityRssFeed3_0.getStoreString(true, true);
      //  // Unstable assertion: assertEquals("||||1652d44f00a||1652d44f00a||MXx8fHwwfHx8fDE2NTJkNDRmMDBhfHwwfA==.", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      
      String[] stringArray0 = new String[9];
      compatibilityRssFeed3_0.init(true, 1, false, false, false, stringArray0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(false, true, (String) null);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(true, true, "");
      compatibilityRssFeed3_0.m_username = null;
      String string0 = compatibilityRssFeed3_0.getUsername();
      assertNull(string0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "P", (String) null);
      String string0 = compatibilityRssFeed3_0.getUsername();
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals("P", string0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      String[] stringArray0 = new String[4];
      compatibilityRssFeed3_0.init(true, 0, true, false, true, stringArray0);
      String string0 = compatibilityRssFeed3_0.getUrl();
      assertNull(string0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(false, false, "");
      compatibilityRssFeed3_0.setUrl("u");
      compatibilityRssFeed3_0.getUrl();
      assertEquals("u", compatibilityRssFeed3_0.getUrl());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      compatibilityRssFeed3_0.getUpddate();
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "q");
      String string0 = compatibilityRssFeed3_0.getPassword();
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("q", string0);
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals("", compatibilityRssFeed3_0.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      String string0 = compatibilityRssFeed3_0.getPassword();
      assertEquals("", string0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      String[] stringArray0 = new String[4];
      compatibilityRssFeed3_0.init(true, 0, true, false, true, stringArray0);
      String string0 = compatibilityRssFeed3_0.getName();
      assertNull(string0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("E", "", "", "");
      String string0 = compatibilityRssFeed3_0.getName();
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("E", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "", date0, "u", date0, 0);
      String string0 = compatibilityRssFeed3_0.getLink();
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("u", string0);
      assertEquals(0, compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals("", compatibilityRssFeed3_0.getName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      Vector<String> vector0 = new Vector<String>();
      vector0.add("");
      compatibilityRssFeed3_0.setItems(vector0);
      Vector vector1 = compatibilityRssFeed3_0.getItems();
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals(1, vector1.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      Date date0 = new Date(0L);
      compatibilityRssFeed3_0.m_date = date0;
      Date date1 = compatibilityRssFeed3_0.getDate();
      assertNotNull(date1);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "", date0, "", date0, 0);
      int int0 = compatibilityRssFeed3_0.getCategory();
      assertEquals("", compatibilityRssFeed3_0.getLink());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      
      compatibilityRssFeed3_0.setCategory(1);
      int int0 = compatibilityRssFeed3_0.getCategory();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(true, false, "");
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) "");
      compatibilityRssFeed3_0.setItems(vector0);
      // Undeclared exception!
      try { 
        compatibilityRssFeed3_0.toString();
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      // Undeclared exception!
      try { 
        compatibilityRssFeed3_0.setLink((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", (String) null);
      // Undeclared exception!
      try { 
        compatibilityRssFeed3_0.equals(compatibilityRssFeed3_0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "", date0, "", date0, 0);
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
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(true, true, (String) null);
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(rssFeed0);
      compatibilityRssFeed3_0.setLink("");
      assertEquals("", compatibilityRssFeed3_0.getAuthor());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      Date date0 = new Date();
      compatibilityRssFeed3_0.setUpddate(date0);
      //  // Unstable assertion: assertEquals("Sun Aug 12 17:33:31 KST 2018", date0.toString());
      
      String string0 = compatibilityRssFeed3_0.toString();
      //  // Unstable assertion: assertEquals("||||1652d44db21||-1||", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(false, false, "");
      Date date0 = new Date(0L);
      compatibilityRssFeed3_0.setDate(date0);
      String string0 = compatibilityRssFeed3_0.toString();
      assertEquals("||||||-1|0|", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      Vector<RssItunesItem> vector0 = new Vector<RssItunesItem>();
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      vector0.add((RssItunesItem) compatibilityRssItunesItem3_0);
      compatibilityRssFeed3_0.setItems(vector0);
      String string0 = compatibilityRssFeed3_0.toString();
      assertEquals("||||||-1||false||||-1||null||false|.", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(rssFeed0);
      Date date0 = new Date();
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3("", "", "", "", date0, "", date0, 0);
      compatibilityRssFeed3_0.copyTo(compatibilityRssFeed3_1);
      compatibilityRssFeed3_0.setCategory(0);
      boolean boolean0 = compatibilityRssFeed3_0.equals(compatibilityRssFeed3_1);
      assertEquals(0, compatibilityRssFeed3_0.getCategory());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(true, true, (String) null);
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(rssFeed0);
      Date date0 = new Date();
      compatibilityRssFeed3_0.setDate(date0);
      //  // Unstable assertion: assertEquals("Sun Aug 12 17:33:29 KST 2018", date0.toString());
      
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3(compatibilityRssFeed3_0);
      boolean boolean0 = compatibilityRssFeed3_0.equals(compatibilityRssFeed3_1);
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(true, true, "");
      Date date0 = new Date(0);
      compatibilityRssFeed3_0.setDate(date0);
      boolean boolean0 = compatibilityRssFeed3_0.equals(compatibilityRssFeed3_0);
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", ")", "");
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3(compatibilityRssFeed3_0);
      boolean boolean0 = compatibilityRssFeed3_0.equals(compatibilityRssFeed3_1);
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals(")", compatibilityRssFeed3_0.getUsername());
      assertFalse(boolean0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3(false, false, ".");
      boolean boolean0 = compatibilityRssFeed3_1.equals(compatibilityRssFeed3_0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertFalse(boolean0);
      assertEquals((-1), compatibilityRssFeed3_1.getCategory());
      assertEquals("", compatibilityRssFeed3_1.getUrl());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", (String) null, date0, "", date0, 0);
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3();
      Vector<RssItunesItem> vector0 = new Vector<RssItunesItem>();
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      vector0.add((RssItunesItem) compatibilityRssItunesItem3_0);
      compatibilityRssFeed3_1.setItems(vector0);
      // Undeclared exception!
      compatibilityRssFeed3_1.copyTo(compatibilityRssFeed3_0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", (String) null, date0, (String) null, date0, 0);
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3();
      Vector<RssItunesItem> vector0 = new Vector<RssItunesItem>();
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("", (String) null, "", date0, "", false);
      vector0.add((RssItunesItem) compatibilityRssItem3_0);
      compatibilityRssFeed3_1.setItems(vector0);
      // Undeclared exception!
      compatibilityRssFeed3_1.copyTo(compatibilityRssFeed3_0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      CompatibilityRssFeed3 compatibilityRssFeed3_1 = new CompatibilityRssFeed3("", "", "", "");
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) "");
      compatibilityRssFeed3_0.setItems(vector0);
      // Undeclared exception!
      try { 
        compatibilityRssFeed3_0.copyTo(compatibilityRssFeed3_1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.substanceofcode.rssreader.businessentities.RssItem
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed3", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "", date0, "", date0, 0);
      Vector<CompatibilityRssItunesItem3> vector0 = new Vector<CompatibilityRssItunesItem3>();
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3("", "", "", date0, "", false, true, "", "", "", (byte)0, "");
      vector0.add(compatibilityRssItunesItem3_0);
      compatibilityRssFeed3_0.setItems(vector0);
      //  // Unstable assertion: assertEquals("[true||||0||Sun Aug 12 17:33:23 KST 2018||false|]", vector0.toString());
      
      String string0 = compatibilityRssFeed3_0.getStoreString(true, true);
      //  // Unstable assertion: assertEquals("||||1652d44b881||1652d44b881|0|MXx8fHwwfHx8fDE2NTJkNDRiODgxfHwwfA==.", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      String[] stringArray0 = new String[9];
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = ".";
      compatibilityRssFeed3_0.init(false, 0, true, false, true, stringArray0);
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      String[] stringArray0 = new String[8];
      stringArray0[4] = "";
      compatibilityRssFeed3_0.init(false, 0, false, false, false, stringArray0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(rssFeed0);
      String[] stringArray0 = new String[6];
      stringArray0[4] = "u";
      compatibilityRssFeed3_0.init(false, 0, false, true, true, stringArray0);
      assertFalse(compatibilityRssFeed3_0.isItunes());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(true, false, "");
      String string0 = compatibilityRssFeed3_0.getStoreString(false, true);
      assertEquals("||||||||", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", (String) null, date0, (String) null, date0, 0);
      String string0 = compatibilityRssFeed3_0.getPassword();
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertNull(string0);
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals(0, compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", (String) null, date0, (String) null, date0, 0);
      String string0 = compatibilityRssFeed3_0.getUsername();
      assertEquals("", string0);
      assertEquals(0, compatibilityRssFeed3_0.getCategory());
      assertNotNull(string0);
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals("", compatibilityRssFeed3_0.getName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      String string0 = compatibilityRssFeed3_0.getUrl();
      assertEquals("", string0);
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      String string0 = compatibilityRssFeed3_0.getName();
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      compatibilityRssFeed3_0.getDate();
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, "");
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed(rssFeed0);
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3(rssItunesFeed0);
      String string0 = compatibilityRssFeed3_0.getLink();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      compatibilityRssFeed3_0.setName((String) null);
      // Undeclared exception!
      try { 
        compatibilityRssFeed3_0.getStoreString(false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed3", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      compatibilityRssFeed3_0.getItems();
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getUrl());
      assertEquals((-1), compatibilityRssFeed3_0.getCategory());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals("", compatibilityRssFeed3_0.getName());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3("", "", "", "");
      int int0 = compatibilityRssFeed3_0.getCategory();
      assertEquals("", compatibilityRssFeed3_0.getName());
      assertEquals("", compatibilityRssFeed3_0.getUsername());
      assertEquals("", compatibilityRssFeed3_0.getPassword());
      assertEquals((-1), int0);
      assertEquals("", compatibilityRssFeed3_0.getUrl());
  }
}
