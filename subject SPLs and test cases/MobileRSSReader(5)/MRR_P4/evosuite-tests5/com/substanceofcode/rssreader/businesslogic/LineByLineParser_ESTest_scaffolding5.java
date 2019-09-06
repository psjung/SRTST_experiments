/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Aug 12 18:06:38 KST 2018
 */

package com.substanceofcode.rssreader.businesslogic;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class LineByLineParser_ESTest_scaffolding5 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.substanceofcode.rssreader.businesslogic.LineByLineParser"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LineByLineParser_ESTest_scaffolding5.class.getClassLoader() ,
      "com.substanceofcode.rssreader.businesslogic.FeedListParser",
      "com.substanceofcode.utils.CauseException",
      "com.substanceofcode.rssreader.businesslogic.URLHandler",
      "com.substanceofcode.rssreader.businessentities.RssItunesFeed",
      "com.substanceofcode.rssreader.businesslogic.LineByLineParser",
      "net.sf.jlogmicro.util.exception.CauseException",
      "net.sf.jlogmicro.util.logging.Level",
      "com.substanceofcode.utils.CauseMemoryException",
      "com.substanceofcode.rssreader.businessentities.RssFeed",
      "net.sf.jlogmicro.util.logging.Logger",
      "net.sf.jlogmicro.util.logging.LogManager",
      "com.substanceofcode.utils.EncodingUtil"
    );
  } 
}
