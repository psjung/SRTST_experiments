/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:19:18 KST 2017
 */

package com.sleepycat.je.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.config.LongConfigParam;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LongConfigParam_ESTest4 extends LongConfigParam_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      Long long0 = new Long(0L);
      Long long1 = new Long((-450L));
      LongConfigParam longConfigParam0 = new LongConfigParam("# minimum = 0\n# maximum = -450", long1, long0, long1, false, "# minimum = 0\n# maximum = -450");
      longConfigParam0.validate();
      assertEquals("# minimum = 0\n# maximum = -450", longConfigParam0.getDescription());
  }

  @Test
  public void test1()  throws Throwable  {
      Long long0 = new Long(1105L);
      LongConfigParam longConfigParam0 = null;
      try {
        longConfigParam0 = new LongConfigParam((String) null, long0, long0, (Long) null, false, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Long long0 = new Long(78L);
      LongConfigParam longConfigParam0 = null;
      try {
        longConfigParam0 = new LongConfigParam("", long0, long0, long0, false, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Long long0 = new Long(0L);
      LongConfigParam longConfigParam0 = new LongConfigParam("2qX!gc8r.TI?{~T{2?", long0, long0, long0, true, "2qX!gc8r.TI?{~T{2?");
      try { 
        longConfigParam0.validateValue("# minimum = 0\n# maximum = -450");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: # minimum = 0
         // # maximum = -450 not valid value for 2qX!gc8r.TI?{~T{2?
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Long long0 = new Long((-15L));
      LongConfigParam longConfigParam0 = new LongConfigParam("# The maximum size of each individual JE log file, in bytes.", long0, (Long) null, long0, true, "# The maximum size of each individual JE log file, in bytes.");
      String string0 = longConfigParam0.getExtraDescription();
      assertEquals("# minimum = -15", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      Long long0 = new Long(0L);
      LongConfigParam longConfigParam0 = new LongConfigParam("2qX!gc8r.TI?{~T{2?", long0, long0, long0, true, "2qX!gc8r.TI?{~T{2?");
      String string0 = longConfigParam0.getExtraDescription();
      assertEquals("# minimum = 0\n# maximum = 0", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      Long long0 = new Long((-705L));
      LongConfigParam longConfigParam0 = new LongConfigParam("yflc`HaF4~P`", (Long) null, long0, long0, false, "yflc`HaF4~P`");
      String string0 = longConfigParam0.getExtraDescription();
      assertEquals("# maximum = -705", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Long long0 = new Long((-1759L));
      Long long1 = new Long((-1073L));
      LongConfigParam longConfigParam0 = new LongConfigParam("je.env.runEvictor", long0, long0, long1, false, "je.env.runEvictor");
      try { 
        longConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param je.env.runEvictor doesn't validate, -1073 is greater than max  of -1759
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Long long0 = new Long(0L);
      Long long1 = new Long((-1L));
      LongConfigParam longConfigParam0 = new LongConfigParam("uYY~$K+1p`}LRORRS1;", long0, long0, long1, true, "uYY~$K+1p`}LRORRS1;");
      try { 
        longConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param uYY~$K+1p`}LRORRS1; doesn't validate, -1 is less than min of 0
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test9()  throws Throwable  {
      Long long0 = new Long(0L);
      LongConfigParam longConfigParam0 = new LongConfigParam("2qX!gc8r.TI?{~T{2?", long0, long0, long0, true, "2qX!gc8r.TI?{~T{2?");
      longConfigParam0.validate();
      assertEquals("2qX!gc8r.TI?{~T{2?", longConfigParam0.getName());
  }
}
