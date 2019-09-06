/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Aug 12 06:48:42 GMT+00:00 2018
 */

package com.substanceofcode.rssreader.businessentities;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class CompatibilityRssFeed3_ESTest_scaffolding4 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed3"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CompatibilityRssFeed3_ESTest_scaffolding4.class.getClassLoader() ,
      "com.substanceofcode.utils.CauseException",
      "com.substanceofcode.utils.CompatibilityBase64",
      "net.sf.jlogmicro.util.exception.CauseRuntimeException",
      "com.substanceofcode.rssreader.businessentities.RssStoreInfo",
      "com.substanceofcode.rssreader.businessentities.RssItem",
      "com.substanceofcode.utils.Base64",
      "com.substanceofcode.utils.CauseMemoryException",
      "com.substanceofcode.rssreader.businessentities.CompatibilityRssItunesItem3",
      "com.substanceofcode.rssreader.businessentities.RssFeed",
      "net.sf.jlogmicro.util.logging.Logger",
      "net.sf.jlogmicro.util.logging.LogManager",
      "com.substanceofcode.rssreader.businessentities.RssItunesItem",
      "com.substanceofcode.utils.CauseRuntimeException",
      "com.substanceofcode.rssreader.businessentities.RssItunesFeed",
      "net.sf.jlogmicro.util.exception.CauseException",
      "com.substanceofcode.rssreader.businessentities.RssShortItem",
      "net.sf.jlogmicro.util.logging.Level",
      "com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed3",
      "com.substanceofcode.rssreader.presentation.RssReaderMIDlet",
      "com.substanceofcode.rssreader.businessentities.CompatibilityRssItem3",
      "com.substanceofcode.utils.StringUtil"
    );
  } 
}
