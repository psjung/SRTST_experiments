/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:18:28 KST 2018
 */

package com.substanceofcode.rssreader.businesslogic;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.utils.CauseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class FeedListParser_ESTest4 extends FeedListParser_ESTest_scaffolding4 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OpmlParser opmlParser0 = new OpmlParser("", "", "");
      opmlParser0.m_location = "";
      opmlParser0.run();
      assertFalse(opmlParser0.isSuccessfull());
      assertFalse(opmlParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", (String) null, (String) null);
      lineByLineParser0.setFeedNameFilter("3");
      String string0 = lineByLineParser0.getFeedNameFilter();
      assertFalse(lineByLineParser0.isSuccessfull());
      assertFalse(lineByLineParser0.isRedirectHtml());
      assertNotNull(string0);
      assertEquals("3", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OpmlParser opmlParser0 = new OpmlParser("", "", "");
      opmlParser0.run();
      CauseException causeException0 = opmlParser0.getEx();
      assertFalse(opmlParser0.isSuccessfull());
      assertFalse(opmlParser0.isRedirectHtml());
      assertEquals("com.substanceofcode.utils.CauseException: Error while parsing feed ", causeException0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser((String) null, (String) null, "");
      lineByLineParser0.startParsing();
      // Undeclared exception!
      try { 
        lineByLineParser0.startParsing();
        fail("Expecting exception: IllegalThreadStateException");
      
      } catch(IllegalThreadStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser((String) null, (String) null, "");
      boolean boolean0 = lineByLineParser0.isRedirectHtml();
      assertFalse(boolean0);
      assertFalse(lineByLineParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser((String) null, (String) null, "");
      String string0 = lineByLineParser0.getFeedURLFilter();
      assertFalse(lineByLineParser0.isSuccessfull());
      assertNull(string0);
      assertFalse(lineByLineParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser((String) null, (String) null, "");
      lineByLineParser0.getFeeds();
      assertFalse(lineByLineParser0.isSuccessfull());
      assertFalse(lineByLineParser0.isRedirectHtml());
  }
}