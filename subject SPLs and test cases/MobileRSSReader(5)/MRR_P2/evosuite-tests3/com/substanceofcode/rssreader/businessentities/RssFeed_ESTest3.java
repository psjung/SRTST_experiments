/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:57:54 KST 2018
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

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.utils.CauseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RssFeed_ESTest3 extends RssFeed_ESTest_scaffolding3 {
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
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      Date date0 = new Date();
      rssFeed0.setDate(date0);
      Date date1 = rssFeed0.getDate();
      assertNotNull(date1);
      assertEquals("", rssFeed0.getUrl());
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getUsername());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      Date date0 = new Date(0);
      rssFeed0.setUpddate(date0);
      String string0 = rssFeed0.toString();
      assertEquals("||||0||-1||", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      Date date0 = new Date();
      rssFeed0.setDate(date0);
      Date date1 = rssFeed0.getUpddate();
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUsername());
      assertEquals("", rssFeed0.getPassword());
      assertNull(date1);
      assertEquals("", rssFeed0.getUrl());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Date date0 = new Date();
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      boolean boolean0 = rssFeed0.equals(rssFeed0);
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getLink());
      assertTrue(boolean0);
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUsername());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      Date date0 = new Date();
      rssFeed0.setUpddate(date0);
      rssFeed0.copyTo(rssFeed0);
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUsername());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getPassword());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Date date0 = new Date();
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, (String) null, date0, 0);
      rssFeed0.copyTo(rssFeed0);
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getName());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUsername());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", (String) null, "");
      String string0 = rssFeed0.getUsername();
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getPassword());
      assertNull(string0);
      assertEquals("", rssFeed0.getUrl());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Date date0 = new Date();
      RssFeed rssFeed0 = new RssFeed("", "", "u", "", date0, "", date0, 0);
      String string0 = rssFeed0.getUsername();
      //  // Unstable assertion: assertEquals("Sun Aug 12 18:57:14 KST 2018", date0.toString());
      //  // Unstable assertion: assertEquals(0, rssFeed0.getCategory());
      //  // Unstable assertion: assertEquals("u", string0);
      //  // Unstable assertion: assertEquals("", rssFeed0.getName());
      //  // Unstable assertion: assertEquals("", rssFeed0.getLink());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      rssFeed0.setUrl((String) null);
      String string0 = rssFeed0.getUrl();
      assertNull(string0);
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "e", "", (String) null, date0, "", date0, 0);
      String string0 = rssFeed0.getUrl();
      assertEquals("e", string0);
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getName());
      assertNotNull(string0);
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUsername());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed((String) null, "", "", (String) null);
      String string0 = rssFeed0.getPassword();
      assertEquals("", rssFeed0.getUsername());
      assertEquals("", rssFeed0.getUrl());
      assertNull(string0);
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Date date0 = new Date();
      RssFeed rssFeed0 = new RssFeed("", "", "", "8", date0, "", date0, 0);
      String string0 = rssFeed0.getPassword();
      //  // Unstable assertion: assertEquals("", rssFeed0.getLink());
      //  // Unstable assertion: assertEquals("Sun Aug 12 18:57:13 KST 2018", date0.toString());
      //  // Unstable assertion: assertEquals("8", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed((String) null, (String) null, (String) null, (String) null);
      String string0 = rssFeed0.getName();
      assertEquals((-1), rssFeed0.getCategory());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("C", "", "", "", date0, (String) null, date0, 0);
      String string0 = rssFeed0.getName();
      assertEquals("", rssFeed0.getPassword());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getUsername());
      assertEquals("C", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "", (Date) null, (String) null, (Date) null, 0);
      String string0 = rssFeed0.getLink();
      assertEquals("", rssFeed0.getUsername());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUrl());
      assertNull(string0);
      assertEquals("", rssFeed0.getPassword());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "2", date0, 0);
      String string0 = rssFeed0.getLink();
      assertEquals("", rssFeed0.getPassword());
      assertEquals("2", string0);
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUrl());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUsername());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, "");
      assertEquals((-1), rssFeed0.getCategory());
      
      rssFeed0.m_category = 1;
      int int0 = rssFeed0.getCategory();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      int int0 = rssFeed0.getCategory();
      assertEquals((-1), int0);
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUsername());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      Vector<Object> vector0 = new Vector<Object>();
      rssFeed0.m_items = vector0;
      vector0.add((Object) "");
      // Undeclared exception!
      try { 
        rssFeed0.toString();
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, "");
      // Undeclared exception!
      try { 
        rssFeed0.setLink((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed((String) null, (String) null, (String) null, "");
      // Undeclared exception!
      try { 
        rssFeed0.getStoreString(false, true, true);
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
      RssFeed rssFeed0 = new RssFeed(true, false, "");
      Vector<String> vector0 = new Vector<String>();
      vector0.add("");
      rssFeed0.setItems(vector0);
      // Undeclared exception!
      try { 
        rssFeed0.getStoreString(true, true, false);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed((String) null, "", "", "");
      // Undeclared exception!
      try { 
        rssFeed0.equals(rssFeed0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) rssFeed0);
      rssFeed0.setItems(vector0);
      RssFeed rssFeed1 = new RssFeed();
      // Undeclared exception!
      try { 
        rssFeed0.copyTo(rssFeed1);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", (String) null, "", "", (Date) null, "", (Date) null, 0);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Vector<Object> vector0 = new Vector<Object>(linkedHashSet0);
      vector0.add((Object) "");
      rssFeed0.setItems(vector0);
      RssFeed rssFeed1 = null;
      try {
        rssFeed1 = new RssFeed(rssFeed0);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, "");
      String string0 = rssFeed0.getUrl();
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getName());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      rssFeed0.setLink("z");
      assertEquals("z", rssFeed0.getLink());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "unequal feed.m_name,this=", "", "");
      rssFeed0.setLink("unequal feed.m_name,this=");
      assertEquals("", rssFeed0.getUsername());
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getPassword());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, "");
      Date date0 = new Date(0L);
      rssFeed0.setUpddate(date0);
      rssFeed0.setDate(rssFeed0.m_upddate);
      String string0 = rssFeed0.toString();
      assertEquals("||||0||-1|0|", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, "");
      String string0 = rssFeed0.toString();
      assertEquals("||||||-1||", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed((String) null, (String) null, "", "", (Date) null, "", (Date) null, 0);
      Vector<String> vector0 = new Vector<String>();
      vector0.add((String) null);
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
  public void test33()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      RssFeed rssFeed1 = new RssFeed("", (String) null, "", "");
      rssFeed0.copyTo(rssFeed1);
      rssFeed0.setCategory((-2));
      boolean boolean0 = rssFeed0.equals(rssFeed1);
      assertFalse(boolean0);
      assertEquals((-2), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      RssFeed rssFeed1 = new RssFeed(rssFeed0);
      Date date0 = new Date(0);
      rssFeed1.setDate(date0);
      boolean boolean0 = rssFeed0.equals(rssFeed1);
      assertFalse(boolean0);
      assertEquals("", rssFeed1.getUrl());
      assertEquals("", rssFeed1.getUsername());
      assertEquals("", rssFeed1.getPassword());
      assertEquals("", rssFeed1.getName());
      assertEquals("", rssFeed1.getLink());
      assertEquals((-1), rssFeed1.getCategory());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      RssFeed rssFeed1 = new RssFeed(rssFeed0);
      Date date0 = new Date(0);
      rssFeed1.setDate(date0);
      boolean boolean0 = rssFeed1.equals(rssFeed0);
      assertEquals("", rssFeed1.getUsername());
      assertEquals("", rssFeed1.getName());
      assertEquals("", rssFeed1.getUrl());
      assertEquals("", rssFeed1.getLink());
      assertEquals("", rssFeed1.getPassword());
      assertEquals((-1), rssFeed1.getCategory());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, "");
      RssFeed rssFeed1 = new RssFeed("u", "", "", "");
      boolean boolean0 = rssFeed0.equals(rssFeed1);
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed0.getName());
      assertFalse(boolean0);
      assertEquals("", rssFeed1.getUsername());
      assertEquals("", rssFeed1.getUrl());
      assertEquals((-1), rssFeed1.getCategory());
      assertEquals("u", rssFeed1.getName());
      assertEquals("", rssFeed1.getPassword());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "L", "", "");
      RssFeed rssFeed1 = new RssFeed(true, false, "");
      boolean boolean0 = rssFeed0.equals(rssFeed1);
      assertEquals("L", rssFeed0.getUrl());
      assertFalse(boolean0);
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUsername());
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", rssFeed1.getName());
      assertEquals((-1), rssFeed1.getCategory());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      String string0 = rssFeed0.getStoreString(true, true, true);
      assertEquals("||||0||0|0|", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(true, false, "");
      String string0 = rssFeed0.getStoreString(true, true, false);
      assertEquals("||||||||", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, "");
      String string0 = rssFeed0.getStoreString(false, false, true);
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("||||||||", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, "");
      String[] stringArray0 = new String[9];
      stringArray0[4] = "q";
      try { 
        rssFeed0.init(false, 0, false, false, true, stringArray0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error during initialize of RssFeed
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, "");
      String[] stringArray0 = new String[9];
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "P";
      try { 
        rssFeed0.init(false, (-1), true, true, false, stringArray0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error during initialize of RssFeed
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      String[] stringArray0 = new String[7];
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
  public void test44()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      String[] stringArray0 = new String[9];
      rssFeed0.init(true, 0, false, true, true, stringArray0);
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      String string0 = rssFeed0.getLink();
      assertEquals("", string0);
      assertEquals("", rssFeed0.getUsername());
      assertEquals("", rssFeed0.getUrl());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getPassword());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      Date date1 = rssFeed0.getUpddate();
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getName());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getUsername());
      assertEquals("", rssFeed0.getLink());
      assertNotNull(date1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, "");
      Date date0 = new Date(0L);
      rssFeed0.setDate(date0);
      String string0 = rssFeed0.toString();
      assertEquals("||||||-1|0|", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed((String) null, "", "", (String) null, (Date) null, (String) null, (Date) null, 0);
      int int0 = rssFeed0.getCategory();
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getUsername());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      String string0 = rssFeed0.getUsername();
      assertEquals("", string0);
      assertEquals("", rssFeed0.getPassword());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getLink());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      rssFeed0.getDate();
      assertEquals((-1), rssFeed0.getCategory());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      Vector vector0 = rssFeed0.getItems();
      rssFeed0.setItems(vector0);
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getPassword());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUsername());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      rssFeed0.setName("");
      assertEquals("", rssFeed0.getName());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", rssFeed0.getLink());
      assertEquals("", rssFeed0.getUsername());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getPassword());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      RssFeed rssFeed1 = new RssFeed(rssFeed0);
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) null);
      rssFeed0.setItems(vector0);
      rssFeed0.copyTo(rssFeed1);
      assertEquals((-1), rssFeed1.getCategory());
      assertEquals("", rssFeed1.getName());
      assertEquals("", rssFeed1.getUsername());
      assertEquals("", rssFeed1.getLink());
      assertEquals("", rssFeed1.getUrl());
      assertEquals("", rssFeed1.getPassword());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      String string0 = rssFeed0.getName();
      assertEquals("", rssFeed0.getUsername());
      assertEquals(0, rssFeed0.getCategory());
      assertEquals("", rssFeed0.getUrl());
      assertEquals("", string0);
      assertEquals("", rssFeed0.getPassword());
      assertEquals("", rssFeed0.getLink());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      String string0 = rssFeed0.getPassword();
      assertEquals((-1), rssFeed0.getCategory());
      assertEquals("", string0);
  }
}
