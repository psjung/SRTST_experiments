/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:07:23 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.StringWriter;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class CmdUtil_ESTest3 extends CmdUtil_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      String string0 = CmdUtil.getArg(stringArray0, 0);
      assertEquals("", string0);
  }

  @Test
  public void test01()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)32;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(6, stringBuffer0.length());
      assertEquals("\\20\\00", stringWriter0.toString());
  }

  @Test
  public void test02()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-61);
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(34, stringBuffer0.capacity());
      assertEquals("\\00\\c3\\00\\00\\00\\00\\00", stringWriter0.toString());
  }

  @Test
  public void test03()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-33);
      CmdUtil.formatEntry(stringBuffer0, byteArray0, false);
      assertEquals("00df0000000000", stringBuffer0.toString());
      assertEquals("00df0000000000", stringWriter0.toString());
  }

  @Test
  public void test04()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(8);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte)82;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(18, stringBuffer0.capacity());
      assertEquals("\\00\\00\\00R\\00\\00", stringWriter0.toString());
  }

  @Test
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[1];
      try { 
        CmdUtil.getArg(stringArray0, 32);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String string0 = CmdUtil.getJavaCommand(class0);
      assertEquals("java { java.lang.Object | -jar je.jar Object }", string0);
  }

  @Test
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.readLongNumber((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.getArg((String[]) null, 32);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        CmdUtil.getArg(stringArray0, (-1295));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1295
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        CmdUtil.formatEntry((StringBuffer) null, byteArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(8);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)127;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(18, stringBuffer0.length());
      assertEquals("\\00\\7f\\00\\00\\00\\00", stringWriter0.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)16;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, false);
      assertEquals(14, stringBuffer0.length());
      assertEquals("10000000000000", stringWriter0.toString());
  }

  @Test
  public void test15()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(41);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte)16;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals("\\00\\00\\00\\00\\10", stringBuffer0.toString());
      assertEquals("\\00\\00\\00\\00\\10", stringWriter0.toString());
  }

  @Test
  public void test16()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(252);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)92;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(11, stringBuffer0.length());
      assertEquals("\\00\\00\\\\\\00", stringWriter0.toString());
  }

  @Test
  public void test17()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(41);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)110;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(13, stringBuffer0.length());
      assertEquals("\\00\\00n\\00\\00", stringWriter0.toString());
  }

  @Test
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.readLongNumber("0xja");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"ja\"
         //
         assertThrownBy("java.lang.NumberFormatException", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      long long0 = CmdUtil.readLongNumber("8");
      assertEquals(8L, long0);
  }

  @Test
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[2];
      String string0 = CmdUtil.getArg(stringArray0, 0);
      assertNull(string0);
  }

  @Test
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      try { 
        CmdUtil.getArg(stringArray0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      CmdUtil cmdUtil0 = new CmdUtil();
  }

  @Test
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.makeUtilityEnvironment((File) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      CmdUtil.hook855(environmentConfig0);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.getJavaCommand((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      CmdUtil.hook854(environmentConfig0);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test27()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      CmdUtil.hook853(environmentConfig0);
      assertFalse(environmentConfig0.getTxnNoSync());
  }
}