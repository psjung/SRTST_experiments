/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 17:48:00 KST 2018
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
import java.time.ZoneId;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.utils.CauseException;

import net.sf.jlogmicro.util.logging.LogManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RssFeed_ESTest5 extends RssFeed_ESTest_scaffolding5 {
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
      RssFeed rssFeed0 = new RssFeed();
      Date date0 = new Date();
      rssFeed0.setDate(date0);
      Date date1 = rssFeed0.getDate();
      assertNotNull(date1);
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, "");
      Date date0 = new Date(0L);
      rssFeed0.m_upddate = date0;
      String string0 = rssFeed0.toString();
      assertEquals("||||0||-1||", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      Date date0 = new Date(0L);
      rssFeed0.m_upddate = date0;
      Date date1 = rssFeed0.getUpddate();
      assertNotNull(date1);
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      Instant instant0 = Instant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      rssFeed0.setUpddate(date0);
      rssFeed0.copyTo(rssFeed0);
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUsername());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getUrl());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed((String) null, (String) null, (String) null, (String) null);
      String string0 = rssFeed0.getUsername();
      assertNull(string0);
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "I", "", date0, "", date0, 0);
      String string0 = rssFeed0.getUsername();
      assertEquals("", rssFeed0.getLink());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("I", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed((String) null, (String) null, (String) null, (String) null);
      String string0 = rssFeed0.getUrl();
      assertEquals((-1), rssFeed0.getCategory());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "H", "", "", date0, "", date0, 0);
      String string0 = rssFeed0.getUrl();
      assertEquals("H", string0);
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getLink());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUsername());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      rssFeed0.getUpddate();
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed((String) null, (String) null, (String) null, (String) null);
      String string0 = rssFeed0.getPassword();
      assertNull(string0);
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "H", date0, "", date0, 0);
      String string0 = rssFeed0.getPassword();
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("H", string0);
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getUsername());
      assertEquals(0, rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed((String) null, (String) null, (String) null, "");
      String string0 = rssFeed0.getName();
      assertEquals("", rssFeed0.getPassword());
      assertNull(string0);
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("I", "", "", "", date0, "", date0, 0);
      String string0 = rssFeed0.getName();
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("I", string0);
      assertEquals("", rssFeed0.getUsername());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUrl());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "H", date0, 0);
      String string0 = rssFeed0.getLink();
      assertEquals("H", string0);
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUsername());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUrl());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      LogManager logManager0 = LogManager.getLogManager();
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) logManager0);
      rssFeed0.m_items = vector0;
      rssFeed0.getItems();
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUrl());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUsername());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      assertEquals((-1), rssFeed0.getCategory());
      
      rssFeed0.setCategory(0);
      int int0 = rssFeed0.getCategory();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 1);
      int int0 = rssFeed0.getCategory();
      assertEquals("", rssFeed0.getLink());
      assertEquals(1, int0);
      assertEquals("", rssFeed0.getUsername());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getPassword());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      LogManager logManager0 = LogManager.getLogManager();
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) logManager0);
      rssFeed0.m_items = vector0;
      // Undeclared exception!
      try { 
        rssFeed0.toString();
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed((String) null, (String) null, (String) null, (String) null);
      // Undeclared exception!
      try { 
        rssFeed0.setLink((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      rssFeed0.setName((String) null);
      // Undeclared exception!
      try { 
        rssFeed0.getStoreString(true, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(true, true, "");
      // Undeclared exception!
      try { 
        rssFeed0.equals((RssFeed) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      // Undeclared exception!
      try { 
        rssFeed0.copyTo((RssFeed) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      Instant instant0 = Instant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Vector<String> vector0 = new Vector<String>();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      vector0.addAll(0, (Collection<? extends String>) set0);
      rssFeed0.setItems(vector0);
      RssFeed rssFeed1 = new RssFeed("", "", "", "", date0, "", date0, 0);
      // Undeclared exception!
      try { 
        rssFeed0.copyTo(rssFeed1);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RssFeed rssFeed0 = null;
      try {
        rssFeed0 = new RssFeed((RssFeed) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      rssFeed0.setLink("");
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      String string0 = rssFeed0.toString();
      assertEquals("||||0||0|0|", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(true, true, "");
      String string0 = rssFeed0.toString();
      assertEquals("||||||-1||", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      Vector<Object> vector0 = new Vector<Object>();
      vector0.setSize(1);
      rssFeed0.m_items = vector0;
      // Undeclared exception!
      try { 
        rssFeed0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      assertEquals((-1), rssFeed0.getCategory());
      
      rssFeed0.setCategory(0);
      RssFeed rssFeed1 = new RssFeed(false, false, "");
      boolean boolean0 = rssFeed0.equals(rssFeed1);
      assertEquals(0, rssFeed0.getCategory());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Date date0 = new Date();
      RssFeed rssFeed0 = new RssFeed("", " ", "", "", date0, " ", date0, 0);
      RssFeed rssFeed1 = new RssFeed(rssFeed0);
      rssFeed1.setLink("");
      boolean boolean0 = rssFeed0.equals(rssFeed1);
      assertEquals("", rssFeed1.getLink());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, "");
      Date date0 = new Date(0);
      rssFeed0.setDate(date0);
      boolean boolean0 = rssFeed0.equals(rssFeed0);
      assertTrue(boolean0);
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      RssFeed rssFeed1 = new RssFeed();
      Date date0 = new Date();
      rssFeed1.m_date = date0;
      rssFeed1.equals(rssFeed0);
      assertEquals((-1), rssFeed1.getCategory());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      RssFeed rssFeed1 = new RssFeed();
      Date date0 = new Date();
      rssFeed1.m_date = date0;
      rssFeed0.equals(rssFeed1);
      assertEquals((-1), rssFeed1.getCategory());
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      Date date0 = new Date(0L);
      RssFeed rssFeed1 = new RssFeed("", "", "", "u", date0, "", date0, 0);
      rssFeed0.equals(rssFeed1);
      assertEquals("", rssFeed1.getUrl());
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed1.getName());
      assertEquals("u", rssFeed1.getPassword());
      assertEquals(0, rssFeed1.getCategory());
      assertEquals("", rssFeed1.getUsername());
      assertEquals("", rssFeed1.getLink());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("a", "", "", "");
      RssFeed rssFeed1 = new RssFeed();
      boolean boolean0 = rssFeed0.equals(rssFeed1);
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getUsername());
      assertEquals("a", rssFeed0.getName());
      assertEquals("", rssFeed0.getUrl());
      assertFalse(boolean0);
      assertEquals((-1), rssFeed1.getCategory());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(true, true, "");
      RssFeed rssFeed1 = new RssFeed("", "R", "", "");
      boolean boolean0 = rssFeed0.equals(rssFeed1);
      assertFalse(boolean0);
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed1.getName());
      assertEquals("R", rssFeed1.getUrl());
      assertEquals("", rssFeed1.getPassword());
      assertEquals("", rssFeed1.getUsername());
      assertEquals((-1), rssFeed1.getCategory());
      assertEquals("", rssFeed0.getName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Date date0 = new Date();
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      String string0 = rssFeed0.getStoreString(true, false, true);
      //  // Unstable assertion: assertEquals("||||1652d516277||1652d516277|0|", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      String string0 = rssFeed0.getStoreString(false, true, false);
      assertEquals("||||||||", string0);
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      String string0 = rssFeed0.getStoreString(true, false, true);
      assertEquals("||||||||", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      String[] stringArray0 = new String[6];
      try { 
        rssFeed0.init(false, 0, false, false, false, stringArray0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error during initialize of RssFeed
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      rssFeed0.init(true, 0, true, true, false, stringArray0);
      rssFeed0.getDate();
      assertEquals("", rssFeed0.getUsername());
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(true, false, "");
      String string0 = rssFeed0.getLink();
      assertEquals("", rssFeed0.getName());
      assertEquals("", string0);
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      Date date0 = new Date(0);
      rssFeed0.setDate(date0);
      String string0 = rssFeed0.toString();
      assertEquals("||||||-1|0|", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      int int0 = rssFeed0.getCategory();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      rssFeed0.setUrl("");
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getUsername());
      assertEquals(0, rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      String string0 = rssFeed0.getUsername();
      assertEquals("", string0);
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUrl());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed((String) null, (String) null, (String) null, (String) null);
      rssFeed0.getItems();
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      String string0 = rssFeed0.getName();
      assertEquals("", string0);
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      String string0 = rssFeed0.getPassword();
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      String string0 = rssFeed0.getUrl();
      assertEquals("", string0);
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getName());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getUsername());
  }
}