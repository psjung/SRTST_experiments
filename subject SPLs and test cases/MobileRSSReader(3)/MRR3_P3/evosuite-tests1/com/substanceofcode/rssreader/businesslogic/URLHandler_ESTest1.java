/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 15:37:07 KST 2018
 */

package com.substanceofcode.rssreader.businesslogic;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.businessentities.RssItunesFeed;
import com.substanceofcode.utils.CauseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class URLHandler_ESTest1 extends URLHandler_ESTest_scaffolding1 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OpmlParser opmlParser0 = new OpmlParser((String) null, (String) null, "");
      assertEquals(0L, opmlParser0.getLastMod());
      
      opmlParser0.setLastMod(1L);
      long long0 = opmlParser0.getLastMod();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser((String) null, (String) null, (String) null);
      lineByLineParser0.handleClose();
      assertEquals(0L, lineByLineParser0.getLastMod());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", (String) null);
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
  public void test3()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      RssFeedParser rssFeedParser0 = new RssFeedParser(rssItunesFeed0);
      try { 
        rssFeedParser0.parseRssFeedUrl("", true, true, 0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Error while parsing RSS data: com.substanceofcode.utils.CauseException: Internal error while parsing : 
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.RssFeedParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      RssFeedParser rssFeedParser0 = new RssFeedParser(rssItunesFeed0);
      try { 
        rssFeedParser0.parseRssFeedUrl("https:", true, true, 0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Error while parsing RSS data: com.substanceofcode.utils.CauseException: Internal error while parsing : https:
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.RssFeedParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "jar://", "", "");
      RssFeedParser rssFeedParser0 = new RssFeedParser(rssItunesFeed0);
      try { 
        rssFeedParser0.parseRssFeed(false, true, 0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Error while parsing RSS data: java.lang.NoClassDefFoundError: Could not initialize class com.substanceofcode.utils.EncodingUtil
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.RssFeedParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OpmlParser opmlParser0 = new OpmlParser("", "", "");
      try { 
        opmlParser0.handleOpen("file://", "", "");
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error while parsing : file://
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.URLHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser((String) null, (String) null, (String) null);
      long long0 = lineByLineParser0.getLastMod();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)0);
      try { 
        lineByLineParser0.parseHTMLRedirect("", byteArrayInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error HTML not supported with this version.
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.URLHandler", e);
      }
  }
}
