/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 19:01:05 KST 2018
 */

package cz.cacek.ebook;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;

import javax.microedition.lcdui.Form;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.presentation.RssReaderMIDlet;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class PositionForm_ESTest5 extends PositionForm_ESTest_scaffolding5 {
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
      PageCustomItem pageCustomItem0 = new PageCustomItem("", 0, 0, 0, false, false, "", form0, (RssReaderMIDlet) null);
      PositionForm positionForm0 = null;
      try {
        positionForm0 = new PositionForm("", (AbstractView) null, pageCustomItem0, (RssReaderMIDlet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.util.ResourceProviderME", e);
      }
  }
}
