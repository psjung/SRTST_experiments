/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 19:03:46 KST 2018
 */

package com.substanceofcode.rssreader.businessentities;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.presentation.RssReaderMIDlet;
import com.substanceofcode.utils.CauseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RssItunesFeed_ESTest3 extends RssItunesFeed_ESTest_scaffolding3 {
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
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "", date0, "", date0, 0, true, "", "", "", "", "", "", (byte)0);
      rssItunesFeed0.setExplicit((-514));
      String string0 = rssItunesFeed0.toString();
      //  // Unstable assertion: assertEquals("true|||||||-2|||||1652d97007c||0|1652d97007c|", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = true;
      String string0 = "clean";
      // Undeclared exception!
      try { 
        RssItunesFeed.getStoreStringInfo(true, true, "clean", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssItunesFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      try { 
        RssItunesFeed.deserialize(false, (String) null);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error during deserialize
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssItunesFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      assertFalse(rssItunesFeed0.isItunes());
      
      rssItunesFeed0.setItunes(true);
      boolean boolean0 = rssItunesFeed0.isItunes();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Date date0 = new Date();
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed((String) null, (String) null, "", (String) null, date0, "", date0, 0, true, (String) null, (String) null, "", "", "", "", (byte)0);
      String string0 = rssItunesFeed0.getTitle();
      //  // Unstable assertion: assertTrue(rssItunesFeed0.isItunes());
      //  // Unstable assertion: assertEquals("Sun Aug 12 19:03:14 KST 2018", date0.toString());
      //  // Unstable assertion: assertNull(string0);
      //  // Unstable assertion: assertEquals("", rssItunesFeed0.getSummary());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Date date0 = new Date();
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "", date0, "", date0, 0, true, "e", "", "", "", "", "", (byte)0);
      String string0 = rssItunesFeed0.getTitle();
      assertEquals("e", string0);
      assertTrue(rssItunesFeed0.isItunes());
      assertEquals("", rssItunesFeed0.getLanguage());
      assertEquals("", rssItunesFeed0.getAuthor());
      assertEquals("", rssItunesFeed0.getDescription());
      assertEquals("", rssItunesFeed0.getSummary());
      assertEquals("", rssItunesFeed0.getSubtitle());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      rssItunesFeed0.modifyItunes(false, "", "", "", "", "", "1", (byte)0);
      rssItunesFeed0.getSummary();
      assertEquals("no", rssItunesFeed0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", (String) null, (Date) null, (String) null, (Date) null, 0, true, "", "", "", "", "s", "", (byte)0);
      String string0 = rssItunesFeed0.getSubtitle();
      assertEquals("", rssItunesFeed0.getTitle());
      assertEquals("", rssItunesFeed0.getSummary());
      assertEquals("s", string0);
      assertTrue(rssItunesFeed0.isItunes());
      assertEquals("no", rssItunesFeed0.getExplicit());
      assertEquals("", rssItunesFeed0.getLanguage());
      assertEquals("", rssItunesFeed0.getDescription());
      assertEquals("", rssItunesFeed0.getAuthor());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", (String) null, (Date) null, (String) null, (Date) null, 0, true, "", "", "V", "", "", "", (byte)0);
      String string0 = rssItunesFeed0.getLanguage();
      assertNotNull(string0);
      assertEquals("", rssItunesFeed0.getAuthor());
      assertEquals("", rssItunesFeed0.getDescription());
      assertEquals("V", string0);
      assertEquals("", rssItunesFeed0.getSubtitle());
      assertEquals("", rssItunesFeed0.getSummary());
      assertEquals("", rssItunesFeed0.getTitle());
      assertTrue(rssItunesFeed0.isItunes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Date date0 = new Date();
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "", date0, "", date0, 0, true, "", "V", "", "", "", "", (byte)0);
      String string0 = rssItunesFeed0.getDescription();
      assertEquals("", rssItunesFeed0.getSubtitle());
      assertEquals("no", rssItunesFeed0.getExplicit());
      assertEquals("", rssItunesFeed0.getSummary());
      assertEquals("", rssItunesFeed0.getAuthor());
      assertEquals("", rssItunesFeed0.getTitle());
      assertEquals("", rssItunesFeed0.getLanguage());
      assertEquals("V", string0);
      assertTrue(rssItunesFeed0.isItunes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      rssItunesFeed0.setCategory(1);
      int int0 = rssItunesFeed0.getCategory();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Date date0 = new Date();
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "", date0, "", date0, 0, true, "", "", "", "C", "", "", (byte)0);
      rssItunesFeed0.getAuthor();
      //  // Unstable assertion: assertEquals("Sun Aug 12 19:03:12 KST 2018", date0.toString());
      //  // Unstable assertion: assertEquals("", rssItunesFeed0.getSummary());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        RssItunesFeed.getStoreStringInfo(true, false, (String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.utils.StringUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Date date0 = new Date();
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed((String) null, "", "", "", date0, "", date0, 0, false, "", "", "", "", "", "", (byte)0);
      // Undeclared exception!
      try { 
        rssItunesFeed0.getStoreString(false, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      // Undeclared exception!
      try { 
        rssItunesFeed0.copyTo((RssItunesFeed) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = null;
      try {
        rssItunesFeed0 = new RssItunesFeed((RssFeed) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", (String) null, "");
      String string0 = rssItunesFeed0.getExplicit();
      assertEquals("unspecified", string0);
      assertFalse(rssItunesFeed0.isItunes());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
      
      rssItunesFeed0.m_explicit = (byte)0;
      String string0 = rssItunesFeed0.getExplicit();
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed(rssFeed0);
      String string0 = rssItunesFeed0.toString();
      assertEquals("false||||||||||||||-1||", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed((String) null, (String) null, "", "");
      rssItunesFeed0.modifyItunes(true, "", "", "", "", "", "", (byte)0);
      rssItunesFeed0.toString();
      assertEquals("no", rssItunesFeed0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      boolean boolean0 = rssItunesFeed0.equals(rssItunesFeed0);
      assertTrue(boolean0);
      assertFalse(rssItunesFeed0.isItunes());
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Date date0 = new Date();
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "", date0, "", date0, 0, true, "", "", "", "", "", "", (byte)0);
      RssItunesFeed rssItunesFeed1 = new RssItunesFeed();
      rssItunesFeed0.copyTo(rssItunesFeed1);
      boolean boolean0 = rssItunesFeed1.equals(rssItunesFeed0);
      assertEquals(0, rssItunesFeed1.getCategory());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RssShortItem[] rssShortItemArray0 = RssItunesFeed.getShortItems((RssReaderMIDlet) null, "");
      assertEquals(0, rssShortItemArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RssStoreInfo rssStoreInfo0 = RssItunesFeed.getStoreStringInfo(false, false, "||||||||", false);
      //  // Unstable assertion: assertEquals(0L, rssStoreInfo0.getJoinTime());
      //  // Unstable assertion: assertEquals("||||||||", rssStoreInfo0.getStoreString());
      //  // Unstable assertion: assertEquals("", rssStoreInfo0.getName());
      //  // Unstable assertion: assertEquals(0L, rssStoreInfo0.getEncodeTime());
      //  // Unstable assertion: assertEquals(0L, rssStoreInfo0.getSplitTime());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RssStoreInfo rssStoreInfo0 = RssItunesFeed.getStoreStringInfo(false, false, "||||||||", true);
      //  // Unstable assertion: assertEquals("||||||||", rssStoreInfo0.getStoreString());
      //  // Unstable assertion: assertEquals("", rssStoreInfo0.getName());
      //  // Unstable assertion: assertEquals(0L, rssStoreInfo0.getEncodeTime());
      //  // Unstable assertion: assertEquals(0L, rssStoreInfo0.getJoinTime());
      //  // Unstable assertion: assertEquals(0L, rssStoreInfo0.getSplitTime());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "", date0, "", date0, 0, true, "", "", "", "", "", "", (byte) (-2));
      String string0 = rssItunesFeed0.getStoreString(true, true, false);
      assertEquals("1|||||||-2|||||0||0|0|", string0);
      assertTrue(rssItunesFeed0.isItunes());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      assertFalse(rssItunesFeed0.isItunes());
      
      rssItunesFeed0.setItunes(true);
      rssItunesFeed0.getStoreString(true, true, false);
      assertTrue(rssItunesFeed0.isItunes());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      String string0 = rssItunesFeed0.getStoreString(true, true, false);
      assertEquals("||||||||||||||||", string0);
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[7] = "l";
      try { 
        rssItunesFeed0.init(false, false, stringArray0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error during initialize of RssItunesFeed
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssItunesFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      try { 
        rssItunesFeed0.init(true, true, stringArray0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error during initialize of RssFeed
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      try { 
        RssItunesFeed.deserialize(false, "");
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error during initialize of RssItunesFeed
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssItunesFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "", (Date) null, "", (Date) null, 0, true, "", "", "", "", "", "", (byte)0);
      RssItunesFeed rssItunesFeed1 = new RssItunesFeed(rssItunesFeed0);
      assertEquals("", rssItunesFeed1.getLanguage());
      assertEquals("", rssItunesFeed1.getAuthor());
      assertEquals("no", rssItunesFeed1.getExplicit());
      assertTrue(rssItunesFeed1.isItunes());
      assertEquals("", rssItunesFeed0.getDescription());
      assertEquals("", rssItunesFeed1.getSummary());
      assertEquals("", rssItunesFeed1.getSubtitle());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      RssItunesFeed rssItunesFeed1 = new RssItunesFeed(rssItunesFeed0);
      assertEquals("unspecified", rssItunesFeed1.getExplicit());
      assertFalse(rssItunesFeed1.isItunes());
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed(rssFeed0);
      RssItunesFeed rssItunesFeed1 = new RssItunesFeed();
      rssItunesFeed0.m_url = null;
      boolean boolean0 = rssItunesFeed0.equals(rssItunesFeed1);
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
      assertFalse(rssItunesFeed1.isItunes());
      assertEquals("unspecified", rssItunesFeed1.getExplicit());
      assertFalse(boolean0);
      assertFalse(rssItunesFeed0.isItunes());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      String string0 = rssItunesFeed0.getTitle();
      assertFalse(rssItunesFeed0.isItunes());
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      rssItunesFeed0.setLanguage("");
      assertEquals("", rssItunesFeed0.getLanguage());
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
      assertFalse(rssItunesFeed0.isItunes());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      String string0 = rssItunesFeed0.getAuthor();
      assertEquals("", string0);
      assertFalse(rssItunesFeed0.isItunes());
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      rssItunesFeed0.setSummary("");
      assertEquals("", rssItunesFeed0.getSummary());
      assertFalse(rssItunesFeed0.isItunes());
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", (String) null, (Date) null, (String) null, (Date) null, 0, true, "", "", "", "", "", "", (byte)0);
      String string0 = rssItunesFeed0.getLanguage();
      assertNotNull(string0);
      assertEquals("", rssItunesFeed0.getDescription());
      assertEquals("", rssItunesFeed0.getSubtitle());
      assertTrue(rssItunesFeed0.isItunes());
      assertEquals("no", rssItunesFeed0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed((String) null, (String) null, "", "");
      String string0 = rssItunesFeed0.getSummary();
      assertEquals("", string0);
      assertNotNull(string0);
      assertFalse(rssItunesFeed0.isItunes());
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", (String) null, (Date) null, (String) null, (Date) null, 0, true, "", "", "", "", "", "", (byte)0);
      rssItunesFeed0.setTitle("");
      assertEquals("", rssItunesFeed0.getSummary());
      assertEquals("", rssItunesFeed0.getDescription());
      assertEquals("no", rssItunesFeed0.getExplicit());
      assertTrue(rssItunesFeed0.isItunes());
      assertEquals("", rssItunesFeed0.getAuthor());
      assertEquals("", rssItunesFeed0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Date date0 = new Date();
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed((String) null, "", "", "", date0, "", date0, 0, false, "", "", "", "", "", "", (byte)0);
      boolean boolean0 = rssItunesFeed0.isItunes();
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      rssItunesFeed0.setSubtitle("");
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
      assertFalse(rssItunesFeed0.isItunes());
      assertEquals("", rssItunesFeed0.getSubtitle());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      int int0 = rssItunesFeed0.getCategory();
      assertEquals((-1), int0);
      assertFalse(rssItunesFeed0.isItunes());
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      rssItunesFeed0.setAuthor("");
      assertFalse(rssItunesFeed0.isItunes());
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
      assertEquals("", rssItunesFeed0.getAuthor());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      String string0 = rssItunesFeed0.getDescription();
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
      assertFalse(rssItunesFeed0.isItunes());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", (String) null, (Date) null, (String) null, (Date) null, 0, true, "", "", "", "", "", "", (byte)0);
      String string0 = rssItunesFeed0.getSubtitle();
      assertEquals("no", rssItunesFeed0.getExplicit());
      assertEquals("", rssItunesFeed0.getSummary());
      assertEquals("", rssItunesFeed0.getTitle());
      assertNotNull(string0);
      assertTrue(rssItunesFeed0.isItunes());
      assertEquals("", rssItunesFeed0.getDescription());
      assertEquals("", rssItunesFeed0.getLanguage());
      assertEquals("", rssItunesFeed0.getAuthor());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      rssItunesFeed0.setDescription("");
      assertEquals("", rssItunesFeed0.getDescription());
      assertFalse(rssItunesFeed0.isItunes());
      assertEquals("unspecified", rssItunesFeed0.getExplicit());
  }
}
