/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:21:01 KST 2018
 */

package com.substanceofcode.rssreader.presentation;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.testlcdui.List;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class PromptMgr_ESTest5 extends PromptMgr_ESTest_scaffolding5 {
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
      PromptMgr promptMgr0 = new PromptMgr((RssReaderMIDlet) null, form0);
      Command command0 = new Command("", 0, 0);
      promptMgr0.removeCommand(command0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PromptMgr promptMgr0 = new PromptMgr((RssReaderMIDlet) null, (Displayable) null);
      // Undeclared exception!
      try { 
        promptMgr0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.presentation.PromptMgr", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      List list0 = new List("", 0);
      PromptMgr promptMgr0 = new PromptMgr((RssReaderMIDlet) null, list0);
      // Undeclared exception!
      try { 
        promptMgr0.removeCommand((Command) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }
}
