/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Aug 12 19:24:52 KST 2018
 */

package com.substanceofcode.rssreader.presentation;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class ImportFeedsForm_ESTest_scaffolding3 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.substanceofcode.rssreader.presentation.ImportFeedsForm"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 


  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ImportFeedsForm_ESTest_scaffolding3.class.getClassLoader() ,
      "com.substanceofcode.rssreader.businesslogic.OpmlParser",
      "com.substanceofcode.utils.CauseException",
      "com.substanceofcode.testlcdui.StringItem",
      "com.substanceofcode.rssreader.businessentities.RssFeedStore",
      "com.substanceofcode.rssreader.businessentities.RssFeed",
      "com.substanceofcode.rssreader.businessentities.RssReaderSettings",
      "com.substanceofcode.utils.CauseRuntimeException",
      "com.substanceofcode.rssreader.presentation.PromptList",
      "com.substanceofcode.utils.CauseRecStoreException",
      "com.substanceofcode.rssreader.businesslogic.LineByLineParser",
      "com.substanceofcode.rssreader.presentation.PromptMgr",
      "com.substanceofcode.rssreader.presentation.RssReaderMIDlet$LoadingForm",
      "com.substanceofcode.rssreader.presentation.RssReaderMIDlet",
      "com.substanceofcode.testlcdui.Form",
      "com.substanceofcode.rssreader.businesslogic.URLHandler",
      "com.substanceofcode.rssreader.presentation.ImportFeedsForm",
      "net.sf.jlogmicro.util.exception.CauseRuntimeException",
      "com.substanceofcode.utils.CauseMemoryException",
      "com.substanceofcode.rssreader.presentation.RssReaderMIDlet$HeaderList",
      "net.sf.jlogmicro.util.logging.Logger",
      "net.sf.jlogmicro.util.logging.LogManager",
      "com.substanceofcode.testlcdui.TextField",
      "com.substanceofcode.rssreader.presentation.RssReaderMIDlet$BMForm",
      "com.substanceofcode.rssreader.businesslogic.FeedListParser",
      "com.substanceofcode.testutil.TestOutput",
      "com.substanceofcode.rssreader.businessentities.RssItunesFeed",
      "net.sf.jlogmicro.util.exception.CauseException",
      "net.sf.jlogmicro.util.logging.Level",
      "com.substanceofcode.testlcdui.ChoiceGroup",
      "com.substanceofcode.utils.Settings",
      "com.substanceofcode.rssreader.presentation.PromptForm",
      "com.substanceofcode.testlcdui.List"
    );
  } 
}
