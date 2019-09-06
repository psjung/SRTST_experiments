/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:00:50 KST 2018
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

import com.substanceofcode.utils.CauseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RssFeed_ESTest4 extends RssFeed_ESTest_scaffolding4 {
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
      Instant instant0 = Instant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Date date1 = new Date();
      RssFeed rssFeed0 = new RssFeed((String) null, "", "", (String) null, date0, (String) null, date1, 0);
      Date date2 = rssFeed0.getDate();
      //  // Unstable assertion: assertEquals("", rssFeed0.getUrl());
      //  // Unstable assertion: assertNotNull(date2);
      //  // Unstable assertion: assertEquals("", rssFeed0.getUsername());
      //  // Unstable assertion: assertEquals("Sun Aug 12 16:00:21 KST 2018", date2.toString());
      //  // Unstable assertion: assertEquals(0, rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      Date date0 = new Date(0);
      rssFeed0.setUpddate(date0);
      String string0 = rssFeed0.toString();
      assertEquals("||||0||-1||", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Date date0 = new Date();
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      String string0 = rssFeed0.toString();
      //  // Unstable assertion: assertEquals("||||1652cef8ca9||0|1652cef8ca9|", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Date date0 = new Date();
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      boolean boolean0 = rssFeed0.equals(rssFeed0);
      assertTrue(boolean0);
      assertEquals("", rssFeed0.getUrl());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUsername());
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Date date0 = new Date();
      Date date1 = new Date();
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      rssFeed0.setUpddate(date1);
      rssFeed0.copyTo(rssFeed0);
      //  // Unstable assertion: assertEquals("Sun Aug 12 16:00:20 KST 2018", date0.toString());
      //  // Unstable assertion: assertEquals("", rssFeed0.getUsername());
      //  // Unstable assertion: assertEquals(0, rssFeed0.getCategory());
      //  // Unstable assertion: assertEquals("", rssFeed0.getPassword());
      //  // Unstable assertion: assertEquals("", rssFeed0.getUrl());
      //  // Unstable assertion: assertTrue(date0.equals((Object)date1));
      //  // Unstable assertion: assertEquals("", rssFeed0.getName());
      //  // Unstable assertion: assertEquals("", rssFeed0.getLink());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      RssFeed rssFeed1 = new RssFeed("", "", "", "", date0, "", date0, 0);
      rssFeed1.copyTo(rssFeed0);
      assertEquals("", rssFeed0.getUsername());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getPassword());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      rssFeed0.setUrl("");
      rssFeed0.copyTo(rssFeed0);
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getUsername());
      assertEquals(0, rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Date date0 = new Date();
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      String string0 = rssFeed0.getStoreString(true, true, true);
      //  // Unstable assertion: assertEquals("||||1652cef87d2||1652cef87d2|0|", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      String string0 = rssFeed0.getStoreString(false, false, true);
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("||||||||", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      RssFeed rssFeed1 = new RssFeed("]YPek5*ERpS?BN~|[tt", "Error while rssfeed initialization : ", "startIndex,nodes.length,first nodes=", "]YPek5*ERpS?BN~|[tt");
      rssFeed1.setLink("Error while rssfeed initialization : ");
      rssFeed0.copyTo(rssFeed1);
      rssFeed0.equals(rssFeed1);
      rssFeed0.setName("/^R2");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "startIndex,nodes.length,first nodes=";
      stringArray0[2] = "]YPek5*ERpS?BN~|[tt";
      stringArray0[3] = "]YPek5*ERpS?BN~|[tt";
      stringArray0[4] = "Error while rssfeed initialization : ";
      stringArray0[5] = "Error while rssfeed initialization : ";
      stringArray0[6] = "]YPek5*ERpS?BN~|[tt";
      try { 
        rssFeed1.init(true, 0, true, true, true, stringArray0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error during initialize of RssFeed
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      RssFeed rssFeed1 = new RssFeed(false, false, "");
      rssFeed1.m_link = "y";
      rssFeed0.equals(rssFeed1);
      assertEquals((-1), rssFeed1.getCategory());
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", (String) null, "");
      String string0 = rssFeed0.getUsername();
      assertNull(string0);
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getPassword());
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "o", "");
      String string0 = rssFeed0.getUsername();
      assertEquals("o", string0);
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getUrl());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond(0L, 0L);
      Date date0 = Date.from(instant0);
      RssFeed rssFeed0 = new RssFeed("", (String) null, (String) null, "", date0, "", date0, 0);
      String string0 = rssFeed0.getUrl();
      assertEquals(0, rssFeed0.getCategory());
      assertNull(string0);
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getLink());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      rssFeed0.setUrl("L");
      rssFeed0.getUrl();
      assertEquals("L", rssFeed0.getUrl());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      Date date1 = rssFeed0.getUpddate();
      assertNotNull(date1);
      assertEquals("", rssFeed0.getUsername());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getPassword());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Date date0 = new Date();
      RssFeed rssFeed0 = new RssFeed("", "", (String) null, (String) null, date0, (String) null, date0, 0);
      String string0 = rssFeed0.getPassword();
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getName());
      assertNull(string0);
      assertEquals(0, rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "2");
      String string0 = rssFeed0.getPassword();
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("2", string0);
      assertEquals("", rssFeed0.getUsername());
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Date date0 = new Date();
      RssFeed rssFeed0 = new RssFeed("Q", "", "", "", date0, "", date0, 0);
      String string0 = rssFeed0.getName();
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("Q", string0);
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getUsername());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Date date0 = new Date();
      RssFeed rssFeed0 = new RssFeed("", "", (String) null, (String) null, date0, (String) null, date0, 0);
      String string0 = rssFeed0.getLink();
      assertNull(string0);
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getName());
      assertEquals(0, rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      rssFeed0.setLink("K");
      rssFeed0.getLink();
      assertEquals("K", rssFeed0.getLink());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      rssFeed0.setItems((Vector) null);
      Vector vector0 = rssFeed0.getItems();
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getUsername());
      assertNull(vector0);
      assertEquals(0, rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      rssFeed0.getDate();
      assertEquals("", rssFeed0.getUsername());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getPassword());
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed((String) null, (String) null, "", (String) null, date0, "", date0, 0);
      int int0 = rssFeed0.getCategory();
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getUsername());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Date date0 = new Date();
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 1);
      int int0 = rssFeed0.getCategory();
      //  // Unstable assertion: assertEquals("", rssFeed0.getUrl());
      //  // Unstable assertion: assertEquals("", rssFeed0.getPassword());
      //  // Unstable assertion: assertEquals("", rssFeed0.getName());
      //  // Unstable assertion: assertEquals("", rssFeed0.getLink());
      //  // Unstable assertion: assertEquals("", rssFeed0.getUsername());
      //  // Unstable assertion: assertEquals(1, int0);
      //  // Unstable assertion: assertEquals("Sun Aug 12 16:00:16 KST 2018", date0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      rssFeed0.m_items = null;
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
  public void test26()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      Vector<Integer> vector0 = new Vector<Integer>();
      vector0.add((Integer) 0);
      rssFeed0.setItems(vector0);
      // Undeclared exception!
      try { 
        rssFeed0.toString();
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(true, true, (String) null);
      // Undeclared exception!
      try { 
        rssFeed0.setLink((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      RssFeed rssFeed0 = new RssFeed((String) null, "", "", (String) null, date0, (String) null, date0, 0);
      // Undeclared exception!
      try { 
        rssFeed0.getStoreString(false, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(true, true, "");
      Vector<Object> vector0 = new Vector<Object>();
      Object object0 = new Object();
      vector0.add(object0);
      rssFeed0.setItems(vector0);
      // Undeclared exception!
      try { 
        rssFeed0.getStoreString(true, true, true);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
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
  public void test31()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      rssFeed0.m_items = null;
      RssFeed rssFeed1 = new RssFeed(true, true, "");
      // Undeclared exception!
      try { 
        rssFeed0.copyTo(rssFeed1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      Vector<String> vector0 = new Vector<String>();
      vector0.add("");
      rssFeed0.setItems(vector0);
      RssFeed rssFeed1 = new RssFeed(true, false, (String) null);
      // Undeclared exception!
      try { 
        rssFeed0.copyTo(rssFeed1);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      RssFeed rssFeed1 = new RssFeed(rssFeed0);
      rssFeed0.m_username = "Y";
      boolean boolean0 = rssFeed0.equals(rssFeed1);
      assertEquals("", rssFeed1.getUrl());
      assertFalse(boolean0);
      assertEquals("", rssFeed1.getLink());
      assertEquals("", rssFeed1.getName());
      assertEquals("", rssFeed1.getPassword());
      assertEquals("", rssFeed1.getUsername());
      assertEquals((-1), rssFeed1.getCategory());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond(0L, 0L);
      Date date0 = Date.from(instant0);
      RssFeed rssFeed0 = new RssFeed("", (String) null, (String) null, "", date0, "", date0, 0);
      String string0 = rssFeed0.toString();
      assertEquals("|null|null||0||0|0|", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, true, "");
      Date date0 = new Date(0L);
      rssFeed0.setDate(date0);
      String string0 = rssFeed0.toString();
      assertEquals("||||||-1|0|", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      RssFeed rssFeed1 = new RssFeed();
      rssFeed0.setCategory(0);
      boolean boolean0 = rssFeed0.equals(rssFeed1);
      assertFalse(boolean0);
      assertEquals(0, rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, (String) null);
      Instant instant0 = Instant.ofEpochSecond((long) 0);
      Date date0 = Date.from(instant0);
      rssFeed0.setDate(date0);
      RssFeed rssFeed1 = new RssFeed(true, true, (String) null);
      boolean boolean0 = rssFeed0.equals(rssFeed1);
      assertFalse(boolean0);
      assertEquals("", rssFeed1.getName());
      assertEquals((-1), rssFeed1.getCategory());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "N");
      RssFeed rssFeed1 = new RssFeed();
      boolean boolean0 = rssFeed0.equals(rssFeed1);
      assertEquals("", rssFeed0.getName());
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("N", rssFeed0.getPassword());
      assertEquals((-1), rssFeed1.getCategory());
      assertFalse(boolean0);
      assertEquals("", rssFeed0.getUsername());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(true, true, "");
      boolean boolean0 = rssFeed0.equals(rssFeed0);
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, true, "C");
      RssFeed rssFeed1 = new RssFeed(false, false, "");
      boolean boolean0 = rssFeed0.equals(rssFeed1);
      assertEquals((-1), rssFeed1.getCategory());
      assertFalse(boolean0);
      assertEquals("", rssFeed0.getUrl());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      RssFeed rssFeed1 = new RssFeed("", "u", "", "");
      boolean boolean0 = rssFeed0.equals(rssFeed1);
      assertFalse(boolean0);
      assertEquals("", rssFeed1.getUsername());
      assertEquals("", rssFeed1.getName());
      assertEquals("", rssFeed1.getPassword());
      assertEquals("u", rssFeed1.getUrl());
      assertEquals((-1), rssFeed1.getCategory());
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(true, true, "");
      assertEquals((-1), rssFeed0.getCategory());
      
      rssFeed0.setCategory(0);
      rssFeed0.getStoreString(true, true, true);
      assertEquals(0, rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      Date date0 = new Date(0);
      rssFeed0.setUpddate(date0);
      String string0 = rssFeed0.getStoreString(true, true, true);
      assertEquals("||||0||||", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      Date date0 = new Date();
      rssFeed0.setDate(date0);
      String string0 = rssFeed0.getStoreString(true, false, false);
      //  // Unstable assertion: assertEquals("||||||1652cef6a08||", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, true, "||||");
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getName());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, "");
      String[] stringArray0 = new String[5];
      try { 
        rssFeed0.init(false, 0, true, false, false, stringArray0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error during initialize of RssFeed
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      String[] stringArray0 = new String[9];
      try { 
        rssFeed0.init(true, 0, true, true, true, stringArray0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error during initialize of RssFeed
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, true, "||");
      assertEquals("", rssFeed0.getName());
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, true, "");
      assertEquals("", rssFeed0.getName());
      
      String[] stringArray0 = new String[6];
      rssFeed0.init(true, 0, false, true, false, stringArray0);
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      String string0 = rssFeed0.getLink();
      assertEquals("", string0);
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUsername());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUrl());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      rssFeed0.getUpddate();
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUsername());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getPassword());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      Instant instant0 = Instant.ofEpochMilli(0L);
      Date date0 = Date.from(instant0);
      rssFeed0.setDate(date0);
      Date date1 = rssFeed0.getUpddate();
      assertEquals("", rssFeed0.getUsername());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getPassword());
      assertNull(date1);
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      int int0 = rssFeed0.getCategory();
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getUsername());
      assertEquals((-1), int0);
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUrl());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      String string0 = rssFeed0.getUsername();
      assertEquals("", string0);
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      Vector vector0 = rssFeed0.getItems();
      rssFeed0.setItems(vector0);
      assertEquals("", rssFeed0.getUsername());
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUrl());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      String string0 = rssFeed0.getName();
      assertEquals("", string0);
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      String string0 = rssFeed0.getPassword();
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", string0);
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUsername());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      String string0 = rssFeed0.getUrl();
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", string0);
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUsername());
      assertEquals("", rssFeed0.getName());
  }
}
