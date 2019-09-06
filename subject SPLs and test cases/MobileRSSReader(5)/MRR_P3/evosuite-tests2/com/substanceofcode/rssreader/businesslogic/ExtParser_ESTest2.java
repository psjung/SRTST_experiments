/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 17:25:44 KST 2018
 */

package com.substanceofcode.rssreader.businesslogic;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.Instant;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.businessentities.RssItunesFeed;
import com.substanceofcode.rssreader.businessentities.RssItunesItem;
import com.substanceofcode.utils.XmlParser;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ExtParser_ESTest2 extends ExtParser_ESTest_scaffolding2 {
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
      ExtParser extParser0 = new ExtParser(false);
      Instant instant0 = Instant.now();
      Date date0 = Date.from(instant0);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", (String) null, "", date0, "", date0, 1, false, (String) null, "", "", "", "", "", (byte)0);
      RssItunesFeed rssItunesFeed1 = extParser0.getFeedInstance(rssItunesFeed0, "", "", "");
      assertFalse(extParser0.isHasExt());
      assertFalse(rssItunesFeed1.isItunes());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(true);
      extParser0.setDate("u");
      extParser0.getDate();
      assertEquals("u", extParser0.getDate());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(false);
      // Undeclared exception!
      try { 
        extParser0.parseNamespaces((XmlParser) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.ExtParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(false);
      // Undeclared exception!
      try { 
        extParser0.parseExtItem((XmlParser) null, '[', (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.ExtParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(false);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      // Undeclared exception!
      try { 
        extParser0.getFeedInstance(rssItunesFeed0, (String) null, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.ExtParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(false);
      // Undeclared exception!
      try { 
        extParser0.createItem((String) null, (String) null, "", (Date) null, "", false, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(false);
      extParser0.parseExtItem((XmlParser) null, 's', "");
      assertFalse(extParser0.isHasExt());
      assertFalse(extParser0.isItunes());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(true);
      RssItunesItem rssItunesItem0 = extParser0.createItem("p", "", "", (Date) null, "", true, "");
      assertEquals("p", rssItunesItem0.getTitle());
      assertFalse(extParser0.isHasExt());
      assertFalse(rssItunesItem0.isItunes());
      assertFalse(extParser0.isItunes());
      assertTrue(rssItunesItem0.isUnreadItem());
      assertEquals("", rssItunesItem0.getLink());
      assertEquals("", rssItunesItem0.getDescription());
      assertEquals("", rssItunesItem0.getEnclosure());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(true);
      RssItunesItem rssItunesItem0 = extParser0.createItem("", "", "", (Date) null, "", true, "");
      assertEquals("", rssItunesItem0.getTitle());
      assertFalse(rssItunesItem0.isItunes());
      assertFalse(extParser0.isItunes());
      assertTrue(rssItunesItem0.isUnreadItem());
      assertEquals("", rssItunesItem0.getLink());
      assertFalse(extParser0.isHasExt());
      assertEquals("", rssItunesItem0.getDescription());
      assertEquals("", rssItunesItem0.getEnclosure());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(false);
      Date date0 = new Date();
      RssItunesItem rssItunesItem0 = extParser0.createItem("", "", "7", date0, "", false, "");
      assertEquals("", rssItunesItem0.getEnclosure());
      assertFalse(extParser0.isHasExt());
      assertFalse(rssItunesItem0.isItunes());
      assertEquals("", rssItunesItem0.getTitle());
      assertEquals("", rssItunesItem0.getLink());
      assertFalse(rssItunesItem0.isUnreadItem());
      assertFalse(extParser0.isItunes());
      assertEquals("7", rssItunesItem0.getDescription());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(true);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      RssItunesFeed rssItunesFeed1 = extParser0.getFeedInstance(rssItunesFeed0, "", "", "");
      assertFalse(rssItunesFeed1.isItunes());
      assertFalse(extParser0.isHasExt());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(false);
      Instant instant0 = Instant.now();
      Date date0 = Date.from(instant0);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", (String) null, "", date0, "", date0, 0, false, (String) null, "", "", "", "", "", (byte)0);
      extParser0.getFeedInstance(rssItunesFeed0, "T", "", "");
      //  // Unstable assertion: assertFalse(extParser0.isHasExt());
      //  // Unstable assertion: assertEquals("Sun Aug 12 17:25:24 KST 2018", date0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(false);
      extParser0.setDate((String) null);
      String string0 = extParser0.getDate();
      assertFalse(extParser0.isHasExt());
      assertNull(string0);
      assertFalse(extParser0.isItunes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(false);
      boolean boolean0 = extParser0.isItunes();
      assertFalse(extParser0.isHasExt());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(false);
      boolean boolean0 = extParser0.isHasExt();
      assertFalse(boolean0);
      assertFalse(extParser0.isItunes());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(false);
      extParser0.reset();
      assertFalse(extParser0.isItunes());
      assertFalse(extParser0.isHasExt());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(false);
      assertFalse(extParser0.isHasExt());
      
      extParser0.setHasExt(true);
      boolean boolean0 = extParser0.isHasExt();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(false);
      extParser0.setItunes(true);
      assertFalse(extParser0.isHasExt());
      assertFalse(extParser0.isItunes());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExtParser extParser0 = new ExtParser(false);
      String string0 = extParser0.getDate();
      assertEquals("", string0);
      assertFalse(extParser0.isHasExt());
      assertFalse(extParser0.isItunes());
  }
}
