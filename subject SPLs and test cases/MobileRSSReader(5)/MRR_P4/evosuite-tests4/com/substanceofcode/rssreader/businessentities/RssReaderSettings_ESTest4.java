/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:09:55 KST 2018
 */

package com.substanceofcode.rssreader.businessentities;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;

import javax.microedition.midlet.MIDlet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RssReaderSettings_ESTest4 extends RssReaderSettings_ESTest_scaffolding4 {
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
      RssReaderSettings rssReaderSettings0 = RssReaderSettings.getInstance((MIDlet) null);
      // Undeclared exception!
      try { 
        rssReaderSettings0.getFontSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssReaderSettings", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RssReaderSettings rssReaderSettings0 = RssReaderSettings.getInstance((MIDlet) null);
      // Undeclared exception!
      try { 
        rssReaderSettings0.getSettingMemInfo();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssReaderSettings", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RssReaderSettings rssReaderSettings0 = RssReaderSettings.getInstance((MIDlet) null);
      // Undeclared exception!
      try { 
        rssReaderSettings0.setPageEnabled(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssReaderSettings", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RssReaderSettings rssReaderSettings0 = RssReaderSettings.getInstance((MIDlet) null);
      // Undeclared exception!
      try { 
        rssReaderSettings0.getFeedListOpen();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssReaderSettings", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RssReaderSettings rssReaderSettings0 = RssReaderSettings.getInstance((MIDlet) null);
      // Undeclared exception!
      try { 
        rssReaderSettings0.setFeedListOpen(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssReaderSettings", e);
      }
  }
}
