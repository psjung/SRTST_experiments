/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 19:58:06 KST 2018
 */

package cz.cacek.ebook;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Displayable;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.presentation.RssReaderMIDlet;
import com.substanceofcode.testlcdui.Form;
import com.substanceofcode.testlcdui.List;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class PageCanvas_ESTest3 extends PageCanvas_ESTest_scaffolding3 {
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
      Form form0 = new Form("");
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, true, "", form0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, false, "", pageCustomItem0, form0, (RssReaderMIDlet) null);
      // Undeclared exception!
      try { 
        pageCanvas0.pointerPressed(1, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("cz.cacek.ebook.PageMgr", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Form form0 = new Form("");
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, true, "", form0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, false, "", pageCustomItem0, form0, (RssReaderMIDlet) null);
      // Undeclared exception!
      try { 
        pageCanvas0.pointerPressed(0, (-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("cz.cacek.ebook.PageMgr", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, true, "", (Displayable) null, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, true, true, "", pageCustomItem0, (Displayable) null, (RssReaderMIDlet) null);
      pageCanvas0.key((-1));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      List list0 = new List("", 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, true, false, "", list0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, true, true, "", pageCustomItem0, list0, (RssReaderMIDlet) null);
      pageCanvas0.keyRepeated(1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Form form0 = new Form("");
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, true, false, "", form0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, true, true, "", pageCustomItem0, form0, (RssReaderMIDlet) null);
      pageCanvas0.keyPressed(0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Form form0 = new Form("");
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, true, false, "", form0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, true, true, "", pageCustomItem0, form0, (RssReaderMIDlet) null);
      pageCanvas0.hideNotify();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Alert alert0 = new Alert((String) null);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, true, "", alert0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, true, true, "", pageCustomItem0, alert0, (RssReaderMIDlet) null);
      Command command0 = new Command("", 0, 0);
      pageCanvas0.commandAction(command0, alert0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Form form0 = new Form("");
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, true, "", form0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, false, "", pageCustomItem0, form0, (RssReaderMIDlet) null);
      pageCanvas0.svcRepaint();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Form form0 = new Form("");
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, true, "", form0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, false, "", pageCustomItem0, form0, (RssReaderMIDlet) null);
      pageCanvas0.keyRepeated(0);
  }
}
