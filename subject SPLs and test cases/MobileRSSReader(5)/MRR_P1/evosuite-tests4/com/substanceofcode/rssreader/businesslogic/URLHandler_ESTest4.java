/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:27:03 KST 2018
 */

package com.substanceofcode.rssreader.businesslogic;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.fail;

import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.businessentities.RssItunesFeed;
import com.substanceofcode.utils.CauseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class URLHandler_ESTest4 extends URLHandler_ESTest_scaffolding4 {
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
      OpmlParser opmlParser0 = new OpmlParser("", "", (String) null);
      opmlParser0.handleOpen("jar://", "", "");
      assertEquals(0L, opmlParser0.getLastMod());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", (String) null);
      lineByLineParser0.handleClose();
      assertEquals(0L, lineByLineParser0.getLastMod());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", (String) null);
      assertEquals(0L, lineByLineParser0.getLastMod());
      
      lineByLineParser0.setLastMod(1L);
      long long0 = lineByLineParser0.getLastMod();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      RssFeedParser rssFeedParser0 = new RssFeedParser(rssItunesFeed0);
      try { 
        rssFeedParser0.parseRssFeedUrl((String) null, false, false, 0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Error while parsing RSS data: com.substanceofcode.utils.CauseException: Internal error while parsing : null
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.RssFeedParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      RssFeedParser rssFeedParser0 = new RssFeedParser(rssItunesFeed0);
      try { 
        rssFeedParser0.handleOpen("https:", "", "");
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error while parsing : https:
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.URLHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      try { 
        lineByLineParser0.handleOpen("file://", "", "");
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error while parsing : file://
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.URLHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "", date0, "", date0, 0, false, "", "", "", "", "", (String) null, (byte)0);
      RssFeedParser rssFeedParser0 = new RssFeedParser(rssItunesFeed0);
      try { 
        rssFeedParser0.handleOpen("", "", "");
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error while parsing : 
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.URLHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OpmlParser opmlParser0 = new OpmlParser("", "", "");
      long long0 = opmlParser0.getLastMod();
      assertEquals(0L, long0);
  }

  
}
