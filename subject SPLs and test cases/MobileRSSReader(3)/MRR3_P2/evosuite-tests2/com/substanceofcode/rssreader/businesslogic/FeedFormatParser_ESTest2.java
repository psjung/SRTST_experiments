/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 17:26:29 KST 2018
 */

package com.substanceofcode.rssreader.businesslogic;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.businessentities.RssFeed;
import com.substanceofcode.rssreader.businessentities.RssItunesFeed;
import com.substanceofcode.utils.XmlParser;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class FeedFormatParser_ESTest2 extends FeedFormatParser_ESTest_scaffolding2 {
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
      RssFormatParser rssFormatParser0 = new RssFormatParser();
      RssFeed rssFeed0 = new RssFeed(false, false, "");
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed(rssFeed0);
      // Undeclared exception!
      try { 
        rssFormatParser0.parse((XmlParser) null, rssItunesFeed0, true, 0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.ExtParser", e);
      }
  }
}
