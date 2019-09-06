/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 15:34:14 KST 2018
 */

package com.substanceofcode.rssreader.businesslogic;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.PipedInputStream;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.businessentities.RssFeed;
import com.substanceofcode.rssreader.businessentities.RssItunesFeed;
import com.substanceofcode.utils.CauseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RssFeedParser_ESTest1 extends RssFeedParser_ESTest_scaffolding1 {
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
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      RssFeedParser rssFeedParser0 = new RssFeedParser(rssItunesFeed0);
      try { 
        rssFeedParser0.parseRssFeed(true, false, 0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Error while parsing RSS data: com.substanceofcode.utils.CauseException: Internal error while parsing : 
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.RssFeedParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      RssFeedParser rssFeedParser0 = new RssFeedParser(rssItunesFeed0);
      assertFalse(rssFeedParser0.isGetTitleOnly());
      
      rssFeedParser0.setGetTitleOnly(true);
      boolean boolean0 = rssFeedParser0.isGetTitleOnly();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RssFeedParser rssFeedParser0 = new RssFeedParser((RssItunesFeed) null);
      rssFeedParser0.getRssFeed();
      assertFalse(rssFeedParser0.isGetTitleOnly());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed((String) null, "", "", "", date0, "", date0, 1, true, "", "", "", "", "", "", (byte)0);
      RssFeedParser rssFeedParser0 = new RssFeedParser(rssItunesFeed0);
      rssFeedParser0.getRssFeed();
      assertFalse(rssFeedParser0.isGetTitleOnly());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", (String) null, "", "");
      RssFeedParser rssFeedParser0 = new RssFeedParser(rssItunesFeed0);
      rssFeedParser0.getRssFeed();
      assertFalse(rssFeedParser0.isGetTitleOnly());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RssFeedParser rssFeedParser0 = new RssFeedParser((RssItunesFeed) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      // Undeclared exception!
      try { 
        rssFeedParser0.parseRssFeedXml(pipedInputStream0, false, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.RssFeedParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RssFeedParser rssFeedParser0 = new RssFeedParser((RssItunesFeed) null);
      try { 
        rssFeedParser0.parseRssFeed(true, false, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.RssFeedParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(false, false, (String) null);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed(rssFeed0);
      RssFeedParser rssFeedParser0 = new RssFeedParser(rssItunesFeed0);
      try { 
        rssFeedParser0.parseRssFeedUrl("", false, true, 0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Error while parsing RSS data: com.substanceofcode.utils.CauseException: Internal error while parsing : 
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.RssFeedParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "", (Date) null, "", (Date) null, 0, false, "", "", "", "", "", "", (byte)0);
      RssFeedParser rssFeedParser0 = new RssFeedParser(rssItunesFeed0);
      try { 
        rssFeedParser0.parseRssFeedUrl("file://", false, false, 0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Error while parsing RSS data: com.substanceofcode.utils.CauseException: Internal error while parsing : file://
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.RssFeedParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", (String) null, "", "");
      RssFeedParser rssFeedParser0 = new RssFeedParser(rssItunesFeed0);
      try { 
        rssFeedParser0.parseRssFeed(true, true, 0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Error while parsing RSS data: com.substanceofcode.utils.CauseException: Internal error while parsing : null
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.RssFeedParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed((String) null, "", "", "", date0, "", date0, 0, true, "", "", "", "", "", "", (byte)0);
      RssFeedParser rssFeedParser0 = new RssFeedParser(rssItunesFeed0);
      rssFeedParser0.getRssFeed();
      assertFalse(rssFeedParser0.isGetTitleOnly());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      RssFeedParser rssFeedParser0 = new RssFeedParser(rssItunesFeed0);
      boolean boolean0 = rssFeedParser0.isGetTitleOnly();
      assertFalse(boolean0);
  }
}