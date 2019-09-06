/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:21:12 KST 2018
 */

package cz.cacek.ebook;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Command;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.presentation.RssReaderMIDlet;
import com.substanceofcode.testlcdui.Form;
import com.substanceofcode.testlcdui.List;
import com.substanceofcode.testlcdui.TextBox;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class PageCanvas_ESTest1 extends PageCanvas_ESTest_scaffolding1 {
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
      List list0 = new List((String) null, 0);
      PageCanvas pageCanvas0 = new PageCanvas((String) null, 0, 0, 0, true, true, (String) null, (PageImpl) null, list0, (RssReaderMIDlet) null);
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
  public void test01()  throws Throwable  {
      List list0 = new List((String) null, 0);
      PageCanvas pageCanvas0 = new PageCanvas((String) null, 0, 0, 0, true, true, (String) null, (PageImpl) null, list0, (RssReaderMIDlet) null);
      // Undeclared exception!
      try { 
        pageCanvas0.pointerPressed((-2), 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("cz.cacek.ebook.PageMgr", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TextBox textBox0 = new TextBox("", "", 0, 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem((String) null, 0, 0, 0, false, true, (String) null, textBox0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas((String) null, 0, 0, 0, false, true, (String) null, pageCustomItem0, textBox0, (RssReaderMIDlet) null);
      pageCanvas0.key(1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List list0 = new List((String) null, 0);
      PageCanvas pageCanvas0 = new PageCanvas((String) null, 0, 0, 0, true, true, (String) null, (PageImpl) null, list0, (RssReaderMIDlet) null);
      pageCanvas0.keyRepeated((-1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextBox textBox0 = new TextBox("", "", 0, 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem((String) null, 0, 0, 0, false, true, (String) null, textBox0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas((String) null, 0, 0, 0, false, true, (String) null, pageCustomItem0, textBox0, (RssReaderMIDlet) null);
      pageCanvas0.keyPressed(1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextBox textBox0 = new TextBox((String) null, "", 0, 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, true, true, "", textBox0, (RssReaderMIDlet) null);
      Form form0 = new Form("");
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, true, "", pageCustomItem0, form0, (RssReaderMIDlet) null);
      // Undeclared exception!
      try { 
        pageCanvas0.commandAction((Command) null, textBox0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // cz.cacek.ebook.PageCanvas cannot be cast to javax.microedition.lcdui.Item
         //
         verifyException("cz.cacek.ebook.PageMgr", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextBox textBox0 = new TextBox("", "", 0, 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem((String) null, 0, 0, 0, false, true, (String) null, textBox0, (RssReaderMIDlet) null);
      PageCanvas pageCanvas0 = new PageCanvas((String) null, 0, 0, 0, false, true, (String) null, pageCustomItem0, textBox0, (RssReaderMIDlet) null);
      pageCanvas0.keyPressed(0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextBox textBox0 = new TextBox((String) null, "", 0, 0);
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, true, true, "", textBox0, (RssReaderMIDlet) null);
      Form form0 = new Form("");
      PageCanvas pageCanvas0 = new PageCanvas("", 0, 0, 0, false, true, "", pageCustomItem0, form0, (RssReaderMIDlet) null);
      pageCanvas0.key(0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List list0 = new List((String) null, 0);
      PageCanvas pageCanvas0 = new PageCanvas((String) null, 0, 0, 0, true, true, (String) null, (PageImpl) null, list0, (RssReaderMIDlet) null);
      pageCanvas0.hideNotify();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      List list0 = new List((String) null, 0);
      PageCanvas pageCanvas0 = new PageCanvas((String) null, 0, 0, 0, true, true, (String) null, (PageImpl) null, list0, (RssReaderMIDlet) null);
      Command command0 = new Command((String) null, "", 0, 0);
      pageCanvas0.commandAction(command0, list0);
      assertNull(list0.getTitle());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List list0 = new List((String) null, 0);
      PageCanvas pageCanvas0 = new PageCanvas((String) null, 0, 0, 0, true, true, (String) null, (PageImpl) null, list0, (RssReaderMIDlet) null);
      pageCanvas0.svcRepaint();
  }
}
