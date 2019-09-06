/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 17:29:57 KST 2018
 */

package com.substanceofcode.rssreader.businessentities;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CompatibilityRssFeed1_ESTest5 extends CompatibilityRssFeed1_ESTest_scaffolding5 {
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
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = new CompatibilityRssFeed1();
      CompatibilityRssFeed1 compatibilityRssFeed1_1 = new CompatibilityRssFeed1();
      compatibilityRssFeed1_0.m_password = "d";
      boolean boolean0 = compatibilityRssFeed1_0.equals((RssFeed) compatibilityRssFeed1_1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = new CompatibilityRssFeed1();
      compatibilityRssFeed1_0.m_password = "";
      boolean boolean0 = compatibilityRssFeed1_0.equals((RssFeed) compatibilityRssFeed1_0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = new CompatibilityRssFeed1();
      compatibilityRssFeed1_0.setLink("0");
      boolean boolean0 = compatibilityRssFeed1_0.equals((RssFeed) compatibilityRssFeed1_0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = new CompatibilityRssFeed1("", "", "", "");
      RssFeed rssFeed0 = new RssFeed("g", "", "", "");
      boolean boolean0 = compatibilityRssFeed1_0.equals(rssFeed0);
      assertEquals("", compatibilityRssFeed1_0.getName());
      assertEquals("", compatibilityRssFeed1_0.getPassword());
      assertEquals("", compatibilityRssFeed1_0.getUrl());
      assertFalse(boolean0);
      assertEquals("", compatibilityRssFeed1_0.getUsername());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = new CompatibilityRssFeed1("", "", "", "");
      String string0 = compatibilityRssFeed1_0.getStoreString(false);
      assertEquals("||||", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = new CompatibilityRssFeed1();
      Vector<Object> vector0 = new Vector<Object>();
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1("", "", "");
      vector0.add((Object) compatibilityRssItem1_0);
      vector0.addElement(compatibilityRssItem1_0);
      compatibilityRssFeed1_0.setItems(vector0);
      String string0 = compatibilityRssFeed1_0.getStoreString(true);
      assertEquals("||||fHx8.fHx8.", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = new CompatibilityRssFeed1();
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) "");
      compatibilityRssFeed1_0.setItems(vector0);
      // Undeclared exception!
      try { 
        compatibilityRssFeed1_0.getStoreString(true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.substanceofcode.rssreader.businessentities.CompatibilityRssItem1
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed1", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = new CompatibilityRssFeed1();
      RssFeed rssFeed0 = new RssFeed(compatibilityRssFeed1_0);
      rssFeed0.m_name = null;
      // Undeclared exception!
      try { 
        compatibilityRssFeed1_0.equals(rssFeed0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = null;
      try {
        compatibilityRssFeed1_0 = new CompatibilityRssFeed1("||||Error ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unexpected code:  
         //
         verifyException("com.substanceofcode.utils.CompatibilityBase64", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = null;
      try {
        compatibilityRssFeed1_0 = new CompatibilityRssFeed1((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.utils.StringUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = null;
      try {
        compatibilityRssFeed1_0 = new CompatibilityRssFeed1("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed1", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = null;
      try {
        compatibilityRssFeed1_0 = new CompatibilityRssFeed1((RssFeed) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed1", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = new CompatibilityRssFeed1();
      Vector<Object> vector0 = new Vector<Object>();
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1("", "", "");
      boolean boolean0 = vector0.add((Object) compatibilityRssItem1_0);
      compatibilityRssFeed1_0.setItems(vector0);
      boolean boolean1 = compatibilityRssFeed1_0.equals((RssFeed) compatibilityRssFeed1_0);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = new CompatibilityRssFeed1();
      CompatibilityRssFeed1 compatibilityRssFeed1_1 = new CompatibilityRssFeed1(compatibilityRssFeed1_0);
      compatibilityRssFeed1_1.setName("b");
      boolean boolean0 = compatibilityRssFeed1_0.equals((RssFeed) compatibilityRssFeed1_1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = null;
      try {
        compatibilityRssFeed1_0 = new CompatibilityRssFeed1("||||E");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = new CompatibilityRssFeed1("||||");
      assertEquals(0, RssFeed.NAME_OFFSET);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed(true, true, "");
      Vector<Integer> vector0 = new Vector<Integer>();
      vector0.add((Integer) 0);
      rssFeed0.setItems(vector0);
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = null;
      try {
        compatibilityRssFeed1_0 = new CompatibilityRssFeed1(rssFeed0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to com.substanceofcode.rssreader.businessentities.RssItem
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed1", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = new CompatibilityRssFeed1();
      CompatibilityRssFeed1 compatibilityRssFeed1_1 = new CompatibilityRssFeed1(compatibilityRssFeed1_0);
      compatibilityRssFeed1_0.m_url = "|";
      boolean boolean0 = compatibilityRssFeed1_0.equals((RssFeed) compatibilityRssFeed1_1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompatibilityRssFeed1 compatibilityRssFeed1_0 = new CompatibilityRssFeed1("", "", "", "");
      CompatibilityRssFeed1 compatibilityRssFeed1_1 = new CompatibilityRssFeed1(compatibilityRssFeed1_0);
      assertEquals("", compatibilityRssFeed1_1.getUsername());
      
      compatibilityRssFeed1_1.m_username = "d";
      boolean boolean0 = compatibilityRssFeed1_1.equals((RssFeed) compatibilityRssFeed1_0);
      assertFalse(boolean0);
  }
}
