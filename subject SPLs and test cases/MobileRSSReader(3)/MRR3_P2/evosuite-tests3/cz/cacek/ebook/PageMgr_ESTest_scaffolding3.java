/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Aug 12 20:02:50 KST 2018
 */

package cz.cacek.ebook;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class PageMgr_ESTest_scaffolding3 {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "cz.cacek.ebook.PageMgr"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PageMgr_ESTest_scaffolding3.class.getClassLoader() ,
      "com.substanceofcode.utils.CauseException",
      "com.substanceofcode.rssreader.presentation.UiUtil",
      "cz.cacek.ebook.AbstractView",
      "cz.cacek.ebook.PageCustomItem",
      "cz.cacek.ebook.PageImpl",
      "cz.cacek.ebook.Common",
      "cz.cacek.ebook.PageMgr",
      "cz.cacek.ebook.PageMgr$ScrollThread",
      "com.substanceofcode.utils.CauseRuntimeException",
      "cz.cacek.ebook.PositionForm",
      "com.substanceofcode.rssreader.presentation.RssReaderMIDlet",
      "net.eiroca.j2me.RSSReader.presentation.RenderedWord",
      "cz.cacek.ebook.HtmlView",
      "com.substanceofcode.testlcdui.Form",
      "cz.cacek.ebook.PageCanvas",
      "com.substanceofcode.rssreader.presentation.HelpForm",
      "net.sf.jlogmicro.util.exception.CauseRuntimeException",
      "cz.cacek.ebook.util.ResourceProviderME",
      "cz.cacek.ebook.View",
      "com.substanceofcode.utils.CauseMemoryException",
      "net.sf.jlogmicro.util.logging.Logger",
      "net.sf.jlogmicro.util.logging.LogManager",
      "cz.cacek.ebook.Page$PageHolder",
      "com.substanceofcode.testutil.TestOutput",
      "net.sf.jlogmicro.util.exception.CauseException",
      "cz.cacek.ebook.Page",
      "net.sf.jlogmicro.util.logging.Level",
      "com.substanceofcode.testlcdui.ChoiceGroup",
      "com.substanceofcode.testlcdui.List"
    );
  } 
}
