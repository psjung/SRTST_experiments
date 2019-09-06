/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:34:06 KST 2017
 */

package org.prevayler.foundation.monitor;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.PrintStream;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class SimpleMonitor_ESTest5 extends SimpleMonitor_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      SimpleMonitor simpleMonitor0 = new SimpleMonitor();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        simpleMonitor0.error(class0, (String) null, (Exception) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.monitor.SimpleMonitor", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SimpleMonitor simpleMonitor0 = new SimpleMonitor((PrintStream) null);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        simpleMonitor0.info(class0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.monitor.SimpleMonitor", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SimpleMonitor simpleMonitor0 = new SimpleMonitor();
      Class<Object> class0 = Object.class;
      Exception exception0 = new Exception();
      simpleMonitor0.error(class0, "0~%iN5", exception0);
      assertNull(exception0.getMessage());
  }

  @Test
  public void test3()  throws Throwable  {
      SimpleMonitor simpleMonitor0 = new SimpleMonitor();
      Class<Object> class0 = Object.class;
      simpleMonitor0.info(class0, "0~%iN5");
  }
}