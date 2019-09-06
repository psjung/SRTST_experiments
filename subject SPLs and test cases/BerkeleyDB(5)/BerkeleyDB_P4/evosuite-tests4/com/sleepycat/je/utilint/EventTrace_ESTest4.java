/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 16:59:04 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class EventTrace_ESTest4 extends EventTrace_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      EventTrace eventTrace0 = new EventTrace();
      String string0 = eventTrace0.toString();
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      EventTrace.addEvent((String) null);
  }

  @Test
  public void test2()  throws Throwable  {
      EventTrace eventTrace0 = new EventTrace((String) null);
      EventTrace.addEvent(eventTrace0);
  }

  @Test
  public void test3()  throws Throwable  {
      EventTrace.dumpEvents();
  }

  @Test
  public void test4()  throws Throwable  {
      EventTrace eventTrace0 = new EventTrace();
      String string0 = "";
      EventTrace eventTrace1 = new EventTrace("");
      EventTrace.dumpEvents();
      EventTrace eventTrace2 = new EventTrace(string0);
      String string1 = eventTrace2.toString();
      assertSame(string1, string0);
  }

  @Test
  public void test5()  throws Throwable  {
      EventTrace.ExceptionEventTrace eventTrace_ExceptionEventTrace0 = new EventTrace.ExceptionEventTrace();
  }
}
