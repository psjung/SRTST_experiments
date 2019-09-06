/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:32:59 KST 2017
 */

package org.prevayler.foundation.monitor;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Log4jMonitor_ESTest5 extends Log4jMonitor_ESTest_scaffolding5 {

  @Test
  public void test1()  throws Throwable  {
      Log4jMonitor log4jMonitor0 = new Log4jMonitor();
      Exception exception0 = new Exception();
      // Undeclared exception!
      try { 
        log4jMonitor0.error((Class) null, "", exception0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.apache.log4j.Logger", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Log4jMonitor log4jMonitor0 = new Log4jMonitor();
      Class<Log4jMonitor> class0 = Log4jMonitor.class;
      log4jMonitor0.info(class0, "Could not instantiate appender named \"");
  }

  @Test
  public void test3()  throws Throwable  {
      Log4jMonitor log4jMonitor0 = new Log4jMonitor();
      // Undeclared exception!
      try { 
        log4jMonitor0.isInfoEnabled((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.apache.log4j.Logger", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Log4jMonitor log4jMonitor0 = new Log4jMonitor();
      Class<Object> class0 = Object.class;
      Exception exception0 = new Exception("");
      log4jMonitor0.error(class0, "", exception0);
      assertEquals("", exception0.getMessage());
  }
}