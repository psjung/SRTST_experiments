/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 17:31:35 KST 2018
 */

package com.substanceofcode.rssreader.businessentities;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Date;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CompatibilityRssFeed2_ESTest5 extends CompatibilityRssFeed2_ESTest_scaffolding5 {
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
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("", "", "", "");
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = new CompatibilityRssFeed2(compatibilityRssFeed2_0);
      assertEquals("", compatibilityRssFeed2_0.getUsername());
      
      compatibilityRssFeed2_0.m_username = "3";
      boolean boolean0 = compatibilityRssFeed2_1.equals((RssFeed) compatibilityRssFeed2_0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("", "", "", "");
      String string0 = compatibilityRssFeed2_0.getStoreString(false);
      assertEquals("|||||", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2((String) null, (String) null, "", "");
      // Undeclared exception!
      try { 
        compatibilityRssFeed2_0.getStoreString(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed2", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2(rssFeed0);
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = new CompatibilityRssFeed2(rssFeed0);
      compatibilityRssFeed2_1.m_url = null;
      // Undeclared exception!
      try { 
        compatibilityRssFeed2_0.equals((RssFeed) compatibilityRssFeed2_1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("", "", "", "");
      Vector<String> vector0 = new Vector<String>();
      vector0.add("");
      compatibilityRssFeed2_0.setItems(vector0);
      // Undeclared exception!
      try { 
        compatibilityRssFeed2_0.equals((RssFeed) compatibilityRssFeed2_0);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = null;
      try {
        compatibilityRssFeed2_0 = new CompatibilityRssFeed2((RssFeed) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed2", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2(rssFeed0);
      Date date0 = new Date(0);
      rssFeed0.m_upddate = date0;
      boolean boolean0 = compatibilityRssFeed2_0.equals(rssFeed0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2(rssFeed0);
      Date date0 = new Date();
      compatibilityRssFeed2_0.m_upddate = date0;
      boolean boolean0 = compatibilityRssFeed2_0.equals(rssFeed0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Date date0 = new Date(0L);
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2(rssFeed0);
      boolean boolean0 = compatibilityRssFeed2_0.equals(rssFeed0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = new CompatibilityRssFeed2(compatibilityRssFeed2_0);
      compatibilityRssFeed2_1.m_password = "m";
      boolean boolean0 = compatibilityRssFeed2_1.equals((RssFeed) compatibilityRssFeed2_0);
      assertFalse(boolean0);
      assertEquals("", compatibilityRssFeed2_1.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = new CompatibilityRssFeed2(".");
      boolean boolean0 = compatibilityRssFeed2_1.equals((RssFeed) compatibilityRssFeed2_0);
      assertFalse(boolean0);
      assertEquals("", compatibilityRssFeed2_1.getUrl());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("|0");
      RssFeed rssFeed0 = new RssFeed();
      boolean boolean0 = compatibilityRssFeed2_0.equals(rssFeed0);
      assertEquals("", compatibilityRssFeed2_0.getUsername());
      assertFalse(boolean0);
      assertEquals("", compatibilityRssFeed2_0.getName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed();
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2(rssFeed0);
      Date date0 = new Date();
      compatibilityRssFeed2_0.m_upddate = date0;
      String string0 = compatibilityRssFeed2_0.getStoreString(true);
      //  // Unstable assertion: assertEquals("||||1534062676546|", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      Vector<Integer> vector0 = new Vector<Integer>();
      compatibilityRssFeed2_0.m_items = vector0;
      vector0.add((Integer) 0);
      // Undeclared exception!
      try { 
        compatibilityRssFeed2_0.getStoreString(true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to com.substanceofcode.rssreader.businessentities.RssItem
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed2", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      String string0 = compatibilityRssFeed2_0.getStoreString(true);
      assertEquals("|||||", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("||||0|");
      assertEquals("", compatibilityRssFeed2_0.getName());
      assertEquals("", compatibilityRssFeed2_0.getPassword());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("|||||");
      assertEquals("", compatibilityRssFeed2_0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("", "", "", "");
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = new CompatibilityRssFeed2(compatibilityRssFeed2_0);
      Vector<String> vector0 = new Vector<String>();
      vector0.add("");
      compatibilityRssFeed2_1.setItems(vector0);
      compatibilityRssFeed2_1.equals((RssFeed) compatibilityRssFeed2_0);
      assertEquals("", compatibilityRssFeed2_1.getUsername());
      assertEquals("", compatibilityRssFeed2_1.getName());
      assertEquals("", compatibilityRssFeed2_1.getPassword());
      assertEquals("", compatibilityRssFeed2_1.getUrl());
  }
}
