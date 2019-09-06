/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:16:58 KST 2017
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
public class ConfigParam_ESTest4 extends ConfigParam_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("TjWCH9$'9FK4d- ", "TjWCH9$'9FK4d- ", true, "IOwu6In");
      assertEquals("TjWCH9$'9FK4d- ", configParam0.getName());
      
      configParam0.name = null;
      String string0 = configParam0.toString();
      assertTrue(configParam0.isMutable());
      assertEquals("IOwu6In", configParam0.getDescription());
      assertEquals("TjWCH9$'9FK4d- ", configParam0.getDefault());
      assertNull(string0);
  }

  @Test
  public void test01()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("SxC?~Opdw<U$9l s", "SxC?~Opdw<U$9l s", true, "SxC?~Opdw<U$9l s");
      boolean boolean0 = configParam0.isMutable();
      assertTrue(boolean0);
      assertEquals("SxC?~Opdw<U$9l s", configParam0.getDescription());
      assertEquals("SxC?~Opdw<U$9l s", configParam0.getDefault());
      assertEquals("SxC?~Opdw<U$9l s", configParam0.getName());
  }

  @Test
  public void test02()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("phqm", "phqm", true, "# minimum = ");
      assertEquals("phqm", configParam0.getName());
      
      configParam0.name = null;
      configParam0.getName();
      assertEquals("# minimum = ", configParam0.getDescription());
      assertTrue(configParam0.isMutable());
      assertEquals("phqm", configParam0.getDefault());
  }

  @Test
  public void test03()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(":}@4R)5iDHNn)Hn*ut(", "O*", false, (String) null);
      String string0 = configParam0.getDescription();
      assertEquals("O*", configParam0.getDefault());
      assertNull(string0);
      assertFalse(configParam0.isMutable());
      assertEquals(":}@4R)5iDHNn)Hn*ut(", configParam0.getName());
  }

  @Test
  public void test04()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("GhL4L", (String) null, true, (String) null);
      String string0 = configParam0.getDefault();
      assertNull(string0);
      assertEquals("GhL4L", configParam0.getName());
      assertTrue(configParam0.isMutable());
  }

  @Test
  public void test05()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(":}@4R)5iDHNn)Hn*ut(", ":}@4R)5iDHNn)Hn*ut(", false, ":}@4R)5iDHNn)Hn*ut(");
      assertEquals(":}@4R)5iDHNn)Hn*ut(", configParam0.toString());
      
      configParam0.name = "l,";
      configParam0.validate();
      assertEquals("l,", configParam0.getName());
  }

  @Test
  public void test06()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(":}@4R)5iDHNn)Hn*ut(", ":}@4R)5iDHNn)Hn*ut(", false, ":}@4R)5iDHNn)Hn*ut(");
      assertEquals(":}@4R)5iDHNn)Hn*ut(", configParam0.toString());
      
      configParam0.name = "l,";
      String string0 = configParam0.getDefault();
      assertEquals(":}@4R)5iDHNn)Hn*ut(", string0);
  }

  @Test
  public void test07()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(":}@4R)5iDHNn)Hn*ut(", ":}@4R)5iDHNn)Hn*ut(", false, ":}@4R)5iDHNn)Hn*ut(");
      assertEquals(":}@4R)5iDHNn)Hn*ut(", configParam0.toString());
      
      configParam0.name = "l,";
      String string0 = configParam0.getDescription();
      assertEquals(":}@4R)5iDHNn)Hn*ut(", string0);
  }

  @Test
  public void test08()  throws Throwable  {
      ConfigParam configParam0 = null;
      try {
        configParam0 = new ConfigParam("", "", true, " A configuration parameter name can't be null or 0 length");
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
      ConfigParam configParam0 = new ConfigParam("ZTzH", "ZTzH", true, "ZTzH");
      String string0 = configParam0.getName();
      assertTrue(configParam0.isMutable());
      assertEquals("ZTzH", string0);
      assertEquals("ZTzH", configParam0.getDescription());
      assertEquals("ZTzH", configParam0.getDefault());
      assertNotNull(string0);
  }

  @Test
  public void test10()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(":}@4R)5iDHNn)Hn*ut(", ":}@4R)5iDHNn)Hn*ut(", false, ":}@4R)5iDHNn)Hn*ut(");
      configParam0.validateValue("x+m^u MeEi)v");
      assertEquals(":}@4R)5iDHNn)Hn*ut(", configParam0.getDefault());
      assertEquals(":}@4R)5iDHNn)Hn*ut(", configParam0.getName());
      assertFalse(configParam0.isMutable());
      assertEquals(":}@4R)5iDHNn)Hn*ut(", configParam0.getDescription());
  }

  @Test
  public void test11()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("# The minimum age of a file (number of files between it and the\n# active file) to qualify it for cleaning under any conditions.\n# The default is set to 2.", "XTJ'0E!M[.'!.d*", true, "# The minimum age of a file (number of files between it and the\n# active file) to qualify it for cleaning under any conditions.\n# The default is set to 2.");
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
  public void test12()  throws Throwable  {
      ConfigParam configParam0 = null;
      try {
        configParam0 = new ConfigParam((String) null, "", true, "K2h|bc=27ICW");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("TjWCH9$'9FK4d- ", "TjWCH9$'9FK4d- ", true, "IOwu6In");
      String string0 = configParam0.toString();
      assertTrue(configParam0.isMutable());
      assertEquals("TjWCH9$'9FK4d- ", configParam0.getDefault());
      assertEquals("IOwu6In", configParam0.getDescription());
      assertEquals("TjWCH9$'9FK4d- ", string0);
      assertNotNull(string0);
      assertEquals("TjWCH9$'9FK4d- ", configParam0.getName());
  }

  @Test
  public void test14()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(":}@4R)5iDHNn)Hn*ut(", ":}@4R)5iDHNn)Hn*ut(", false, ":}@4R)5iDHNn)Hn*ut(");
      boolean boolean0 = configParam0.isMutable();
      assertEquals(":}@4R)5iDHNn)Hn*ut(", configParam0.getName());
      assertFalse(boolean0);
      assertEquals(":}@4R)5iDHNn)Hn*ut(", configParam0.getDefault());
      assertEquals(":}@4R)5iDHNn)Hn*ut(", configParam0.getDescription());
  }

  @Test
  public void test15()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam(":}@4R)5iDHNn)Hn*ut(", ":}@4R)5iDHNn)Hn*ut(", false, ":}@4R)5iDHNn)Hn*ut(");
      configParam0.getExtraDescription();
      assertFalse(configParam0.isMutable());
      assertEquals(":}@4R)5iDHNn)Hn*ut(", configParam0.getDescription());
      assertEquals(":}@4R)5iDHNn)Hn*ut(", configParam0.getName());
      assertEquals(":}@4R)5iDHNn)Hn*ut(", configParam0.getDefault());
  }
}