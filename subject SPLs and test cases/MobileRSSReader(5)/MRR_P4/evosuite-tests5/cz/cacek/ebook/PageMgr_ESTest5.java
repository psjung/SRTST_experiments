/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:59:43 KST 2018
 */

package cz.cacek.ebook;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Gauge;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.List;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.presentation.RssReaderMIDlet;
import com.substanceofcode.testlcdui.Form;
import com.substanceofcode.testlcdui.TextBox;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class PageMgr_ESTest5 extends PageMgr_ESTest_scaffolding5 {
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
      PageMgr.addScrollDelay(1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TextBox textBox0 = new TextBox("", "", 0, 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, true, "", textBox0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, true, true, "", pageCustomItem0, textBox0, (RssReaderMIDlet) null);
      int int0 = pageMgr0.getPrefContentWidth((-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List list0 = new List("", 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem((String) null, 0, 0, 0, true, false, "", list0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, false, "", pageCustomItem0, list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, false, false, (String) null, pageCanvas0, list0, (RssReaderMIDlet) null);
      pageMgr0.messageOff();
      assertEquals(0, pageMgr0.getMinContentWidth());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Form form0 = new Form("");
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, true, "", form0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, true, "", pageCustomItem0, form0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, true, true, "", pageCanvas0, form0, (RssReaderMIDlet) null);
      pageMgr0.paint((Graphics) null, 0, (-1));
      assertEquals(0, pageMgr0.getMinContentWidth());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List list0 = new List("", 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, true, true, "", list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, true, true, "", pageCustomItem0, list0, (RssReaderMIDlet) null);
      pageMgr0.nextPage();
      //  // Unstable assertion: assertEquals((-50), pageMgr0.getScrollDelay());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      com.substanceofcode.testlcdui.List list0 = new com.substanceofcode.testlcdui.List((String) null, 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, false, "", list0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, false, "", pageCustomItem0, list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, false, false, "", pageCanvas0, list0, (RssReaderMIDlet) null);
      pageMgr0.nextLine();
      assertEquals(0, pageMgr0.getMinContentHeight());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextBox textBox0 = new TextBox("", "", 0, 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, true, "", textBox0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 1, 0, 0, true, true, "", pageCustomItem0, textBox0, (RssReaderMIDlet) null);
      int int0 = pageMgr0.getPrefContentWidth(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      com.substanceofcode.testlcdui.List list0 = new com.substanceofcode.testlcdui.List((String) null, 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, false, "", list0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, false, "", pageCustomItem0, list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", (-1), 0, 0, false, false, "", pageCanvas0, list0, (RssReaderMIDlet) null);
      int int0 = pageMgr0.getMinContentWidth();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      com.substanceofcode.testlcdui.List list0 = new com.substanceofcode.testlcdui.List((String) null, 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem((String) null, 0, 0, 0, false, false, (String) null, list0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas((String) null, 0, 0, 0, false, false, "", pageCustomItem0, list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, false, false, (String) null, pageCanvas0, pageCanvas0, (RssReaderMIDlet) null);
      // Undeclared exception!
      try { 
        pageMgr0.pointerPressed(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("cz.cacek.ebook.PageMgr", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, true, true, "", (PageImpl) null, (Displayable) null, (RssReaderMIDlet) null);
      // Undeclared exception!
      try { 
        pageMgr0.pauseOn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.util.ResourceProviderME", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PageMgr.setScrollDelay(50);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      com.substanceofcode.testlcdui.List list0 = new com.substanceofcode.testlcdui.List("", 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, false, "", list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, false, false, "", pageCustomItem0, list0, (RssReaderMIDlet) null);
      PageMgr.ScrollThread pageMgr_ScrollThread0 = pageMgr0.new ScrollThread("");
      pageMgr_ScrollThread0.setRun(false);
      assertTrue(pageMgr_ScrollThread0.isProcessing());
      assertFalse(pageMgr_ScrollThread0.canRun());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Form form0 = new Form("");
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, true, "", form0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, true, "", pageCustomItem0, form0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, true, true, "", pageCanvas0, form0, (RssReaderMIDlet) null);
      PageMgr.ScrollThread pageMgr_ScrollThread0 = pageMgr0.new ScrollThread();
      assertEquals(0, pageMgr_ScrollThread0.countStackFrames());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = PageMgr.getScrollDelay();
      //  // Unstable assertion: assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PageMgr.setScrollDelay(0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      com.substanceofcode.testlcdui.List list0 = new com.substanceofcode.testlcdui.List("", 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, false, "", list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, false, false, "", pageCustomItem0, list0, (RssReaderMIDlet) null);
      pageMgr0.messageOn("");
      assertEquals(0, pageMgr0.getMinContentWidth());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TextBox textBox0 = new TextBox("", "", 0, 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, true, "", textBox0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, true, true, "", pageCustomItem0, textBox0, (RssReaderMIDlet) null);
      Gauge gauge0 = new Gauge("", true, 0, 0);
      // Undeclared exception!
      try { 
        pageMgr0.commandAction((Command) null, gauge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.util.ResourceProviderME", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      List list0 = new List("", 0);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, true, true, "", (PageImpl) null, list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, true, true, "", pageCanvas0, pageCanvas0, (RssReaderMIDlet) null);
      // Undeclared exception!
      try { 
        pageMgr0.keyAutoRun(0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.util.ResourceProviderME", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      com.substanceofcode.testlcdui.List list0 = new com.substanceofcode.testlcdui.List((String) null, 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, false, "", list0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, false, "", pageCustomItem0, list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, false, false, "", pageCanvas0, list0, (RssReaderMIDlet) null);
      pageMgr0.key(0);
      assertEquals(0, pageMgr0.getHeight());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      com.substanceofcode.testlcdui.List list0 = new com.substanceofcode.testlcdui.List((String) null, 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, false, "", list0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, false, "", pageCustomItem0, list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, false, false, "", pageCanvas0, list0, (RssReaderMIDlet) null);
      int int0 = pageMgr0.getPrefContentHeight(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Form form0 = new Form("");
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, true, "", form0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, true, "", pageCustomItem0, form0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, true, true, "", pageCanvas0, form0, (RssReaderMIDlet) null);
      pageMgr0.paint((Graphics) null, 0, 0);
      assertEquals(0, pageMgr0.getMinContentWidth());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      List list0 = new List("", 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem((String) null, 0, 0, 0, true, false, "", list0, (RssReaderMIDlet) null);
      pageCustomItem0.sizeChanged(0, (-1));
      assertEquals((-1), pageCustomItem0.getMinContentHeight());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      com.substanceofcode.testlcdui.List list0 = new com.substanceofcode.testlcdui.List((String) null, 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, false, "", list0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, false, "", pageCustomItem0, list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, false, false, "", pageCanvas0, list0, (RssReaderMIDlet) null);
      int int0 = pageMgr0.getMinContentWidth();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List list0 = new List("", 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem((String) null, 0, 0, 0, true, false, "", list0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, false, "", pageCustomItem0, list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, false, false, (String) null, pageCanvas0, list0, (RssReaderMIDlet) null);
      int int0 = pageMgr0.getHeight();
      assertEquals(0, int0);
      assertEquals(0, pageMgr0.getMinContentWidth());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      com.substanceofcode.testlcdui.List list0 = new com.substanceofcode.testlcdui.List("", 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, false, "", list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, false, false, "", pageCustomItem0, list0, (RssReaderMIDlet) null);
      pageMgr0.prevPage();
      assertEquals(0, pageMgr0.getWidth());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Form form0 = new Form("");
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, true, "", form0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, true, "", pageCustomItem0, form0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, true, true, "", pageCanvas0, form0, (RssReaderMIDlet) null);
      pageMgr0.showNotify();
      assertEquals(0, pageMgr0.getWidth());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      List list0 = new List("", 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, true, "", list0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, true, false, (String) null, pageCustomItem0, list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, true, false, "", pageCanvas0, list0, (RssReaderMIDlet) null);
      PageMgr.ScrollThread pageMgr_ScrollThread0 = pageMgr0.new ScrollThread("");
      boolean boolean0 = pageMgr_ScrollThread0.canRun();
      assertEquals(0, pageMgr0.getMinContentWidth());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      List list0 = new List("", 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem((String) null, 0, 0, 0, true, false, "", list0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, false, "", pageCustomItem0, list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, false, false, (String) null, pageCanvas0, list0, (RssReaderMIDlet) null);
      pageMgr0.hideNotify();
      assertEquals(0, pageMgr0.getWidth());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      List list0 = new List("", 0);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, true, true, "", (PageImpl) null, list0, (RssReaderMIDlet) null);
      PageMgr pageMgr0 = new PageMgr("", 0, 0, 0, true, true, "", pageCanvas0, pageCanvas0, (RssReaderMIDlet) null);
      PageMgr.ScrollThread pageMgr_ScrollThread0 = pageMgr0.new ScrollThread("");
      pageMgr_ScrollThread0.setProcessing(true);
      assertTrue(pageMgr_ScrollThread0.isProcessing());
      assertEquals(0, pageMgr0.getWidth());
  }
}
