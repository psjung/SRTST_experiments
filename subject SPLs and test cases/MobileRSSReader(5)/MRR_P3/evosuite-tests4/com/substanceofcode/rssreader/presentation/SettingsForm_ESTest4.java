/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:40:01 KST 2018
 */

package com.substanceofcode.rssreader.presentation;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class SettingsForm_ESTest4 extends SettingsForm_ESTest_scaffolding4 {
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
      SettingsForm settingsForm0 = null;
      try {
        settingsForm0 = new SettingsForm((RssReaderMIDlet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.util.ResourceProviderME", e);
      }
  }
}
