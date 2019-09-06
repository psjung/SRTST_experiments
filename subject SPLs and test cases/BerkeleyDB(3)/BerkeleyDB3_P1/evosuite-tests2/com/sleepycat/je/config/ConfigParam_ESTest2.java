/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:46:13 KST 2017
 */

package com.sleepycat.je.config;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class ConfigParam_ESTest2 extends ConfigParam_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(".'+t", ".'+t", true, (String) null);
      assertEquals(".'+t", configParam0.getName());
      assertEquals(".'+t", configParam0.toString());
      
      configParam0.name = null;
      configParam0.toString();
      assertEquals(".'+t", configParam0.getDefault());
      assertTrue(configParam0.isMutable());
  }

  @Test
  public void test01()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("# The lock timeout in microseconds.", "2W", true, "# The lock timeout in microseconds.");
      boolean boolean0 = configParam0.isMutable();
      assertEquals("# The lock timeout in microseconds.", configParam0.getName());
      assertTrue(boolean0);
      assertEquals("2W", configParam0.getDefault());
      assertEquals("# The lock timeout in microseconds.", configParam0.getDescription());
  }

  @Test
  public void test02()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(".'+t", ".'+t", true, (String) null);
      assertEquals(".'+t", configParam0.getName());
      
      configParam0.name = null;
      configParam0.getName();
      assertEquals(".'+t", configParam0.getDefault());
      assertTrue(configParam0.isMutable());
  }

  @Test
  public void test03()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("'yZNn$^dYjnU\"", "'yZNn$^dYjnU\"", false, "");
      String string0 = configParam0.getDefault();
      assertEquals("'yZNn$^dYjnU\"", configParam0.getName());
      assertEquals("'yZNn$^dYjnU\"", string0);
      assertEquals("", configParam0.getDescription());
      assertFalse(configParam0.isMutable());
  }

  @Test
  public void test04()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("pa6+0,Bztm9", "", true, (String) null);
      String string0 = configParam0.getDescription();
      assertEquals("pa6+0,Bztm9", configParam0.getName());
      assertNull(string0);
      assertTrue(configParam0.isMutable());
      assertEquals("", configParam0.getDefault());
  }

  @Test
  public void test05()  throws Throwable  {
      ConfigParam configParam0 = null;
      try {
        configParam0 = new ConfigParam("", "zYtI9", false, "zYtI9");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(".'+t", ".'+t", true, (String) null);
      String string0 = configParam0.getName();
      assertEquals(".'+t", string0);
      assertTrue(configParam0.isMutable());
      assertEquals(".'+t", configParam0.getDefault());
      assertNotNull(string0);
  }

  @Test
  public void test07()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("je.cleaner.readSize", "je.cleaner.readSize", true, "je.cleaner.readSize");
      configParam0.validateValue("c");
      assertEquals("je.cleaner.readSize", configParam0.getName());
      assertTrue(configParam0.isMutable());
      assertEquals("je.cleaner.readSize", configParam0.getDescription());
      assertEquals("je.cleaner.readSize", configParam0.getDefault());
  }

  @Test
  public void test08()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("'yZNn$^dYjnU\"", "'yZNn$^dYjnU\"", false, "");
      configParam0.name = "'yZNn$^dYjnU\"";
      configParam0.name = "";
      try { 
        configParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      ConfigParam configParam0 = null;
      try {
        configParam0 = new ConfigParam((String) null, (String) null, true, ",eKV");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(",", ",", true, ",");
      String string0 = configParam0.getDescription();
      assertEquals(",", string0);
      assertEquals(",", configParam0.getName());
      assertEquals(",", configParam0.getDefault());
      assertTrue(configParam0.isMutable());
  }

  @Test
  public void test11()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(";SC,$", (String) null, false, "Qize}Wnbbv5wbQ6`kn");
      String string0 = configParam0.toString();
      assertEquals(";SC,$", configParam0.getName());
      assertEquals(";SC,$", string0);
      assertFalse(configParam0.isMutable());
      assertEquals("Qize}Wnbbv5wbQ6`kn", configParam0.getDescription());
  }

  @Test
  public void test12()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(";SC,$", (String) null, false, "Qize}Wnbbv5wbQ6`kn");
      String string0 = configParam0.getDefault();
      assertEquals(";SC,$", configParam0.getName());
      assertEquals("Qize}Wnbbv5wbQ6`kn", configParam0.getDescription());
      assertNull(string0);
      assertFalse(configParam0.isMutable());
  }

  @Test
  public void test13()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(";SC,$", (String) null, false, "Qize}Wnbbv5wbQ6`kn");
      boolean boolean0 = configParam0.isMutable();
      assertEquals(";SC,$", configParam0.getName());
      assertFalse(boolean0);
      assertEquals("Qize}Wnbbv5wbQ6`kn", configParam0.getDescription());
  }

  @Test
  public void test14()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(";SC,$", (String) null, false, "Qize}Wnbbv5wbQ6`kn");
      configParam0.getExtraDescription();
      assertEquals(";SC,$", configParam0.getName());
      assertFalse(configParam0.isMutable());
      assertEquals("Qize}Wnbbv5wbQ6`kn", configParam0.getDescription());
  }

  @Test
  public void test15()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(";SC,$", (String) null, false, "Qize}Wnbbv5wbQ6`kn");
      configParam0.validate();
      assertFalse(configParam0.isMutable());
      assertEquals(";SC,$", configParam0.getName());
      assertEquals("Qize}Wnbbv5wbQ6`kn", configParam0.getDescription());
  }
}
