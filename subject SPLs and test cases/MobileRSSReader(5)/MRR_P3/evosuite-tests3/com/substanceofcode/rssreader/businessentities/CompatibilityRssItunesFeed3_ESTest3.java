/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:52:32 KST 2018
 */

package com.substanceofcode.rssreader.businessentities;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.Date;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CompatibilityRssItunesFeed3_ESTest3 extends CompatibilityRssItunesFeed3_ESTest_scaffolding3 {
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
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      compatibilityRssItunesFeed3_0.modifyItunes(false, "", "", "", "", "", "", (byte) (-2));
      String string0 = compatibilityRssItunesFeed3_0.toString();
      assertEquals("false|||||||-2|||||||-1||", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(false, "");
      compatibilityRssItunesFeed3_0.m_explicit = (byte) (-2);
      String string0 = compatibilityRssItunesFeed3_0.getStoreString(false, true);
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
      //  // Unstable assertion: assertEquals("1|||||||-2|||||||||", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(false, "|||||||9");
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3(compatibilityRssFeed3_0);
      boolean boolean0 = compatibilityRssItunesFeed3_0.isItunes();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      compatibilityRssItunesFeed3_0.modifyItunes(false, (String) null, (String) null, "", "", "", (String) null, (byte)0);
      compatibilityRssItunesFeed3_0.getTitle();
      assertEquals("no", compatibilityRssItunesFeed3_0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "n";
      compatibilityRssItunesFeed3_0.init(false, false, stringArray0);
      compatibilityRssItunesFeed3_0.getTitle();
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      compatibilityRssItunesFeed3_0.modifyItunes(false, (String) null, (String) null, "", "", "", (String) null, (byte)0);
      compatibilityRssItunesFeed3_0.getSummary();
      assertEquals("no", compatibilityRssItunesFeed3_0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(false, "");
      compatibilityRssItunesFeed3_0.modifyItunes(true, "", "", "", "", (String) null, "u", (byte)0);
      compatibilityRssItunesFeed3_0.getSummary();
      assertEquals("no", compatibilityRssItunesFeed3_0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3("", "", "", "", (Date) null, "", (Date) null, 0, true, "", "", "", "", (String) null, "", (byte)0);
      String string0 = compatibilityRssItunesFeed3_0.getSubtitle();
      assertEquals("", compatibilityRssItunesFeed3_0.getSummary());
      assertEquals("", compatibilityRssItunesFeed3_0.getTitle());
      assertNull(string0);
      assertTrue(compatibilityRssItunesFeed3_0.isItunes());
      assertEquals("", compatibilityRssItunesFeed3_0.getAuthor());
      assertEquals("", compatibilityRssItunesFeed3_0.getLanguage());
      assertEquals("", compatibilityRssItunesFeed3_0.getDescription());
      assertEquals("no", compatibilityRssItunesFeed3_0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(false, "");
      compatibilityRssItunesFeed3_0.modifyItunes(false, "", "", "", "", "|", "", (byte)0);
      compatibilityRssItunesFeed3_0.getSubtitle();
      assertEquals("no", compatibilityRssItunesFeed3_0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(false, "");
      compatibilityRssItunesFeed3_0.modifyItunes(false, "", "", "t", "", "", "", (byte)0);
      compatibilityRssItunesFeed3_0.getLanguage();
      assertEquals("no", compatibilityRssItunesFeed3_0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(false, "");
      compatibilityRssItunesFeed3_0.setDescription((String) null);
      String string0 = compatibilityRssItunesFeed3_0.getDescription();
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
      //  // Unstable assertion: assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(false, "");
      compatibilityRssItunesFeed3_0.modifyItunes(true, "", "|", "", "", (String) null, "", (byte)0);
      compatibilityRssItunesFeed3_0.getDescription();
      assertEquals("no", compatibilityRssItunesFeed3_0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompatibilityRssFeed3 compatibilityRssFeed3_0 = new CompatibilityRssFeed3();
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3(compatibilityRssFeed3_0);
      compatibilityRssItunesFeed3_0.setCategory(1);
      int int0 = compatibilityRssItunesFeed3_0.getCategory();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(true, "");
      int int0 = compatibilityRssItunesFeed3_0.getCategory();
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
      //  // Unstable assertion: assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3((String) null, (String) null, "", "", date0, "", date0, 0, true, "", "", "", (String) null, "", "", (byte)0);
      String string0 = compatibilityRssItunesFeed3_0.getAuthor();
      assertNull(string0);
      assertTrue(compatibilityRssItunesFeed3_0.isItunes());
      assertEquals("", compatibilityRssItunesFeed3_0.getDescription());
      assertEquals("", compatibilityRssItunesFeed3_0.getLanguage());
      assertEquals("", compatibilityRssItunesFeed3_0.getSummary());
      assertEquals("", compatibilityRssItunesFeed3_0.getTitle());
      assertEquals("no", compatibilityRssItunesFeed3_0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      compatibilityRssItunesFeed3_0.modifyItunes(true, "", "", "", "x", "", "", (byte)0);
      compatibilityRssItunesFeed3_0.getAuthor();
      assertEquals("no", compatibilityRssItunesFeed3_0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(false, (String) null);
      assertNull(compatibilityRssItunesFeed3_0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(true, "");
      compatibilityRssItunesFeed3_0.m_items = null;
      // Undeclared exception!
      try { 
        compatibilityRssItunesFeed3_0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed3", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      Vector<TemporalField> vector0 = new Vector<TemporalField>();
      ChronoField chronoField0 = ChronoField.SECOND_OF_MINUTE;
      vector0.add((TemporalField) chronoField0);
      compatibilityRssItunesFeed3_0.setItems(vector0);
      // Undeclared exception!
      try { 
        compatibilityRssItunesFeed3_0.toString();
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3("", "", "", (String) null);
      // Undeclared exception!
      try { 
        compatibilityRssItunesFeed3_0.getStoreString(true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed3", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(true, "");
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) "");
      compatibilityRssItunesFeed3_0.setItems(vector0);
      // Undeclared exception!
      try { 
        compatibilityRssItunesFeed3_0.getStoreString(true, true);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3(rssItunesFeed0);
      // Undeclared exception!
      try { 
        compatibilityRssItunesFeed3_0.equals((CompatibilityRssItunesFeed3) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed3", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3("", "", "", "");
      // Undeclared exception!
      try { 
        compatibilityRssItunesFeed3_0.copyTo((CompatibilityRssItunesFeed3) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed3", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = null;
      try {
        compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3((RssItunesFeed) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssItunesFeed3", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3("", (String) null, "", (String) null);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      compatibilityRssItunesFeed3_0.init(true, true, stringArray0);
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3("", "", "", "");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      compatibilityRssItunesFeed3_0.init(false, false, stringArray0);
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3("", "", "", "");
      compatibilityRssItunesFeed3_0.m_explicit = (byte)2;
      compatibilityRssItunesFeed3_0.getExplicit();
      assertEquals("yes", compatibilityRssItunesFeed3_0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(true, "");
      String string0 = compatibilityRssItunesFeed3_0.getExplicit();
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
      //  // Unstable assertion: assertEquals("unspecified", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      compatibilityRssItunesFeed3_0.setExplicit(0);
      compatibilityRssItunesFeed3_0.getExplicit();
      assertEquals("no", compatibilityRssItunesFeed3_0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(true, "");
      compatibilityRssItunesFeed3_0.m_explicit = (byte)0;
      String string0 = compatibilityRssItunesFeed3_0.toString();
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
      //  // Unstable assertion: assertEquals("true|||||||0|||||||-1||", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_1 = new CompatibilityRssItunesFeed3("", "", (String) null, "");
      compatibilityRssItunesFeed3_0.setSummary((String) null);
      compatibilityRssItunesFeed3_0.copyTo((CompatibilityRssFeed3) compatibilityRssItunesFeed3_1);
      boolean boolean0 = compatibilityRssItunesFeed3_0.equals(compatibilityRssItunesFeed3_1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      compatibilityRssItunesFeed3_0.m_author = "r";
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_1 = new CompatibilityRssItunesFeed3();
      boolean boolean0 = compatibilityRssItunesFeed3_0.equals(compatibilityRssItunesFeed3_1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_1 = CompatibilityRssItunesFeed3.deserialize3(true, "");
      boolean boolean0 = compatibilityRssItunesFeed3_0.equals(compatibilityRssItunesFeed3_1);
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_1.isItunes());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_1 = CompatibilityRssItunesFeed3.deserialize3(true, "");
      compatibilityRssItunesFeed3_1.m_password = "b";
      boolean boolean0 = compatibilityRssItunesFeed3_0.equals(compatibilityRssItunesFeed3_1);
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_1.isItunes());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(true, "");
      boolean boolean0 = compatibilityRssItunesFeed3_0.equals(compatibilityRssItunesFeed3_0);
      //  // Unstable assertion: assertTrue(boolean0);
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(true, "");
      compatibilityRssItunesFeed3_0.setExplicit(0);
      compatibilityRssItunesFeed3_0.getStoreString(true, true);
      assertEquals("no", compatibilityRssItunesFeed3_0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3("", "", "", "", date0, "", date0, 0, false, "", "", "", "", "", "", (byte)0);
      compatibilityRssItunesFeed3_0.setItunes(true);
      String string0 = compatibilityRssItunesFeed3_0.getStoreString(false, false);
      //  // Unstable assertion: assertEquals("1||||||||||||1652d8c7f0a||1652d8c7f0a|0|", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "a";
      compatibilityRssItunesFeed3_0.init(true, false, stringArray0);
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(true, "|\n|||||");
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_0.getAuthor());
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_0.getDescription());
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_0.getLanguage());
      //  // Unstable assertion: assertEquals("|", compatibilityRssItunesFeed3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(true, "");
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = ",,]";
      compatibilityRssItunesFeed3_0.init(true, true, stringArray0);
      //  // Unstable assertion: assertFalse(compatibilityRssItunesFeed3_0.isItunes());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(true, "\n");
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      compatibilityRssItunesFeed3_0.setAuthor("");
      assertEquals("", compatibilityRssItunesFeed3_0.getAuthor());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3("", "", "", "", date0, "", date0, 0, true, "", "", "", "", "", "", (byte)0);
      int int0 = compatibilityRssItunesFeed3_0.getCategory();
      assertEquals("", compatibilityRssItunesFeed3_0.getSummary());
      assertEquals("no", compatibilityRssItunesFeed3_0.getExplicit());
      assertEquals("", compatibilityRssItunesFeed3_0.getAuthor());
      assertEquals("", compatibilityRssItunesFeed3_0.getTitle());
      assertTrue(compatibilityRssItunesFeed3_0.isItunes());
      assertEquals(0, int0);
      assertEquals("", compatibilityRssItunesFeed3_0.getLanguage());
      assertEquals("", compatibilityRssItunesFeed3_0.getDescription());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(true, "");
      String string0 = compatibilityRssItunesFeed3_0.getSubtitle();
      //  // Unstable assertion: assertEquals("", string0);
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      compatibilityRssItunesFeed3_0.setLanguage("");
      assertEquals("", compatibilityRssItunesFeed3_0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3("", "", "", "", date0, "", date0, 0, true, "", "", "", "", "", "", (byte)0);
      boolean boolean0 = compatibilityRssItunesFeed3_0.isItunes();
      //  // Unstable assertion: assertEquals("Sun Aug 12 18:51:44 KST 2018", date0.toString());
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_0.getDescription());
      //  // Unstable assertion: assertEquals("no", compatibilityRssItunesFeed3_0.getExplicit());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3("", "", "", "", date0, "", date0, 0, true, "", "", "", "", "", "", (byte)0);
      String string0 = compatibilityRssItunesFeed3_0.getTitle();
      assertEquals("", compatibilityRssItunesFeed3_0.getSummary());
      assertEquals("", compatibilityRssItunesFeed3_0.getLanguage());
      assertTrue(compatibilityRssItunesFeed3_0.isItunes());
      assertEquals("", compatibilityRssItunesFeed3_0.getDescription());
      assertEquals("no", compatibilityRssItunesFeed3_0.getExplicit());
      assertEquals("", compatibilityRssItunesFeed3_0.getAuthor());
      assertEquals("", compatibilityRssItunesFeed3_0.getSubtitle());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3("", "", "", "", date0, "", date0, 0, true, "", "", "", "", "", "", (byte)0);
      compatibilityRssItunesFeed3_0.setTitle("");
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_0.getLanguage());
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_0.getSummary());
      //  // Unstable assertion: assertEquals("Sun Aug 12 18:51:43 KST 2018", date0.toString());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(true, "");
      compatibilityRssItunesFeed3_0.copyTo(compatibilityRssItunesFeed3_0);
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_0.getTitle());
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_0.getLanguage());
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_0.getDescription());
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_0.getAuthor());
      //  // Unstable assertion: assertEquals("unspecified", compatibilityRssItunesFeed3_0.getExplicit());
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_0.getSummary());
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_0.getSubtitle());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(false, "");
      String string0 = compatibilityRssItunesFeed3_0.getDescription();
      //  // Unstable assertion: assertEquals("", string0);
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = CompatibilityRssItunesFeed3.deserialize3(true, "");
      //  // Unstable assertion: assertNotNull(compatibilityRssItunesFeed3_0);
      
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_1 = new CompatibilityRssItunesFeed3(compatibilityRssItunesFeed3_0);
      compatibilityRssItunesFeed3_1.setExplicit((-2));
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_2 = new CompatibilityRssItunesFeed3(compatibilityRssItunesFeed3_1);
      compatibilityRssItunesFeed3_0.copyTo(compatibilityRssItunesFeed3_1);
      compatibilityRssItunesFeed3_1.equals(compatibilityRssItunesFeed3_2);
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_1.getTitle());
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_1.getSubtitle());
      //  // Unstable assertion: assertEquals("unspecified", compatibilityRssItunesFeed3_1.getExplicit());
      //  // Unstable assertion: assertEquals("", compatibilityRssItunesFeed3_1.getDescription());
      //  // Unstable assertion: assertTrue(compatibilityRssItunesFeed3_0.isItunes());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      compatibilityRssItunesFeed3_0.setSubtitle("");
      assertEquals("", compatibilityRssItunesFeed3_0.getSubtitle());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      String string0 = compatibilityRssItunesFeed3_0.getLanguage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      String string0 = compatibilityRssItunesFeed3_0.getAuthor();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CompatibilityRssItunesFeed3 compatibilityRssItunesFeed3_0 = new CompatibilityRssItunesFeed3();
      String string0 = compatibilityRssItunesFeed3_0.getSummary();
      assertEquals("", string0);
  }
}