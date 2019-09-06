/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:16:59 KST 2017
 */

package com.sleepycat.je.config;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class IntConfigParam_ESTest5 extends IntConfigParam_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer((-397));
      Integer integer1 = new Integer((-946));
      IntConfigParam intConfigParam0 = new IntConfigParam(".l", (Integer) null, integer0, integer1, true, ".l");
      intConfigParam0.validate();
      assertTrue(intConfigParam0.isMutable());
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "";
      Integer integer0 = Integer.valueOf(0);
      Integer integer1 = new Integer(4411);
      IntConfigParam intConfigParam0 = new IntConfigParam("5Luc'[-", integer0, integer0, integer1, false, "5Luc'[-");
      try { 
        intConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.IntConfigParam: param 5Luc'[- doesn't validate, 4411 is greater than max of 0
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(0);
      IntConfigParam intConfigParam0 = null;
      try {
        intConfigParam0 = new IntConfigParam("@VEr L&/;e$a", integer0, (Integer) null, (Integer) null, false, "@VEr L&/;e$a");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer(367);
      IntConfigParam intConfigParam0 = null;
      try {
        intConfigParam0 = new IntConfigParam((String) null, integer0, integer0, integer0, true, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer(0);
      IntConfigParam intConfigParam0 = new IntConfigParam("k/Hj#S+>? ]x*QL", integer0, integer0, integer0, true, "k/Hj#S+>? ]x*QL");
      try { 
        intConfigParam0.validateValue("YoUP?r9?E|QW8U\bM.F");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.IntConfigParam: YoUP?r9?E|QW8U\bM.F not valid value for k/Hj#S+>? ]x*QL
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Integer integer0 = new Integer((-1939));
      IntConfigParam intConfigParam0 = new IntConfigParam("Pl<47=48('OPI1", integer0, (Integer) null, integer0, true, "Pl<47=48('OPI1");
      String string0 = intConfigParam0.getExtraDescription();
      assertEquals("# minimum = -1939", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      Integer integer0 = new Integer(0);
      IntConfigParam intConfigParam0 = new IntConfigParam(" is less than min of ", integer0, integer0, integer0, false, " is less than min of ");
      String string0 = intConfigParam0.getExtraDescription();
      assertEquals("# minimum = 0\n# maximum = 0", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Integer integer0 = new Integer((-667));
      IntConfigParam intConfigParam0 = new IntConfigParam("Q93RJ1^3}A", (Integer) null, integer0, integer0, false, "Q93RJ1^3}A");
      String string0 = intConfigParam0.getExtraDescription();
      assertEquals("# maximum = -667", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      Integer integer0 = new Integer(1394);
      Integer integer1 = new Integer(15);
      IntConfigParam intConfigParam0 = new IntConfigParam("# If true, starts up the evictor.\n# This parameter is false by default\n# (deprecated, eviction is performed in-line", integer0, integer1, integer1, true, "# If true, starts up the evictor.\n# This parameter is false by default\n# (deprecated, eviction is performed in-line");
      try { 
        intConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.IntConfigParam: param # If true, starts up the evictor.
         // # This parameter is false by default
         // # (deprecated, eviction is performed in-line doesn't validate, 15 is less than min of 1394
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test9()  throws Throwable  {
      Integer integer0 = new Integer(0);
      IntConfigParam intConfigParam0 = new IntConfigParam("k/Hj#S+>? ]x*QL", integer0, integer0, integer0, true, "k/Hj#S+>? ]x*QL");
      intConfigParam0.validate();
      assertTrue(intConfigParam0.isMutable());
  }
}
