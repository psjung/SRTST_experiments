/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:17:24 KST 2017
 */

package com.sleepycat.je.config;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class ShortConfigParam_ESTest1 extends ShortConfigParam_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      Short short0 = new Short((short) (-1377));
      Short short1 = new Short((short)3959);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("X", short0, short1, short0, false, "X");
      shortConfigParam0.validate();
      assertEquals("X", shortConfigParam0.getName());
  }

  @Test
  public void test1()  throws Throwable  {
      Short short0 = new Short((short) (-3566));
      Short short1 = new Short((short)0);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("(!;y1", short0, short1, short1, true, "}");
      shortConfigParam0.validate();
      assertEquals("}", shortConfigParam0.getDescription());
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = "";
      Short short0 = new Short((short)3017);
      Short short1 = new Short((short)2220);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("^_\"W,bT", short0, short1, short0, true, "^_\"W,bT");
      try { 
        shortConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam: param ^_\"W,bT doesn't validate, 3017 is greater than max of 2220
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Short short0 = new Short((short) (-3566));
      ShortConfigParam shortConfigParam0 = null;
      try {
        shortConfigParam0 = new ShortConfigParam("# minimum = -3566\n# maximum = 0", short0, (Short) null, (Short) null, true, "U9ff?OX/8T0T;");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Short short0 = new Short((short)0);
      ShortConfigParam shortConfigParam0 = null;
      try {
        shortConfigParam0 = new ShortConfigParam((String) null, short0, short0, short0, true, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Short short0 = new Short((short) (-1377));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("X", short0, short0, short0, false, "X");
      try { 
        shortConfigParam0.validateValue(" param ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam:  param  not valid value for X
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Short short0 = new Short((short)2502);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam(": ", (Short) null, short0, short0, true, "\"M Uk!");
      String string0 = shortConfigParam0.getExtraDescription();
      assertEquals("# maximum = 2502", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Short short0 = new Short((short) (-1377));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("X", short0, short0, short0, false, "X");
      String string0 = shortConfigParam0.getExtraDescription();
      assertEquals("# minimum = -1377\n# maximum = -1377", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      Short short0 = new Short((short)2502);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("\"M Uk!", (Short) null, (Short) null, short0, true, "\"M Uk!");
      String string0 = shortConfigParam0.getExtraDescription();
      assertEquals("", string0);
  }

  @Test
  public void test9()  throws Throwable  {
      Short short0 = new Short((short)1565);
      Short short1 = new Short((short) (-3157));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("# minimum = ", short0, short0, short1, true, "# minimum = ");
      try { 
        shortConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam: param # minimum =  doesn't validate, -3157 is less than min of 1565
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }
}
