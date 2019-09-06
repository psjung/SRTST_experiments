/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Aug 12 19:21:14 KST 2018
 */

package com.substanceofcode.rssreader.businesslogic;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class URLHandler_ESTest_scaffolding3 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.substanceofcode.rssreader.businesslogic.URLHandler"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(URLHandler_ESTest_scaffolding3.class.getClassLoader() ,
      "com.substanceofcode.rssreader.businesslogic.OpmlParser",
      "com.substanceofcode.utils.CauseException",
      "com.substanceofcode.rssreader.businesslogic.URLHandler",
      "net.sf.jlogmicro.util.exception.CauseRuntimeException",
      "cz.cacek.ebook.util.ResourceProviderME",
      "com.substanceofcode.rssreader.businessentities.RssStoreInfo",
      "com.substanceofcode.utils.CauseMemoryException",
      "com.substanceofcode.rssreader.businesslogic.FeedFormatParser",
      "com.substanceofcode.rssreader.businessentities.RssFeed",
      "net.sf.jlogmicro.util.logging.Logger",
      "net.sf.jlogmicro.util.logging.LogManager",
      "com.substanceofcode.utils.EncodingUtil",
      "com.substanceofcode.rssreader.businesslogic.FeedListParser",
      "com.substanceofcode.rssreader.businesslogic.RssFeedParser",
      "com.substanceofcode.utils.CauseRuntimeException",
      "com.substanceofcode.rssreader.businessentities.RssItunesFeed",
      "net.sf.jlogmicro.util.exception.CauseException",
      "com.substanceofcode.rssreader.businesslogic.LineByLineParser",
      "com.substanceofcode.rssreader.businessentities.RssShortItem",
      "net.sf.jlogmicro.util.logging.Level",
      "com.substanceofcode.rssreader.presentation.RssReaderMIDlet"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Enumeration", false, URLHandler_ESTest_scaffolding3.class.getClassLoader()));
  }
}
