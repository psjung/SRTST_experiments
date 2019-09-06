/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 18:18:18 KST 2018
 */

package it.yup.util;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xml.Element;
import it.yup.xmpp.Contact;
import it.yup.xmpp.packets.Iq;
import it.yup.xmpp.packets.Presence;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Utils_ESTest5 extends Utils_ESTest_scaffolding5 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      Contact contact0 = new Contact("", "0", "", stringArray0);
      Contact contact1 = new Contact("", "", "", contact0.availability_mapping);
      boolean boolean0 = Utils.compareTo(contact0, contact1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      String string0 = Utils.flags2str(booleanArray0, 1);
      assertEquals("2", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean[] booleanArray0 = Utils.str2flags("0", 0, 32);
      assertEquals(32, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean[] booleanArray0 = Utils.str2flags("0", 1, 1);
      assertTrue(Arrays.equals(new boolean[] {false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean[] booleanArray0 = Utils.str2flags("0", 1, 0);
      assertEquals(0, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "j!";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      Vector vector0 = Utils.tokenize("j!", stringArray0, true);
      assertEquals("[j!]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "j";
      // Undeclared exception!
      try { 
        Utils.tokenize("j", stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-";
      stringArray0[1] = "";
      Vector vector0 = Utils.tokenize("-", stringArray0, false);
      assertTrue(vector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      String string0 = Utils.getStringUTF8(byteArray0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = Utils.getBytesUtf8("m");
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Presence presence0 = new Presence();
      Iq iq0 = Utils.easyReply(presence0);
      assertEquals(0L, iq0.queueTime);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = Utils.digest("", "md5");
      assertNotNull(byteArray0);
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = Utils.bytesToHex(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.tokenize((String) null, 'q');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.str2flags("", 0, 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.str2flags("0", 0, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.is_jid((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.is_email((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.getStringUTF8((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.getBytesUtf8((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.flags2str((boolean[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.find_urls((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        Utils.digest(byteArray0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.digest((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      Contact contact0 = new Contact((String) null, (String) null, "", stringArray0);
      // Undeclared exception!
      try { 
        Utils.compareTo(contact0, contact0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.bytesToHex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector vector0 = Utils.tokenize("i", 'L');
      assertEquals("[i]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      String string0 = Utils.bytesToHex(byteArray0);
      assertEquals("00000000000000", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = Utils.digest(byteArray0, "sha1");
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = Utils.digest("", "");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      Contact contact0 = new Contact("O", (String) null, (String) null, stringArray0);
      Contact contact1 = new Contact("", (String) null, "", stringArray0);
      boolean boolean0 = Utils.compareTo(contact1, contact0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      boolean boolean0 = Utils.compareTo(contact0, contact0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = Utils.getBytesUtf8("");
      String string0 = Utils.getStringUTF8(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Vector vector0 = Utils.find_urls("");
      assertEquals(10, vector0.capacity());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector vector0 = Utils.find_urls("c");
      assertEquals("[]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[1] = true;
      String string0 = Utils.flags2str(booleanArray0, 0);
      assertEquals("2", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean boolean0 = Utils.is_email("O@&");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = Utils.is_email("e@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = Utils.is_email("@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = Utils.is_email("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = Utils.is_jid("w.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = Utils.is_jid(".");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      Vector vector0 = Utils.tokenize("<", stringArray0, false);
      assertEquals(0, vector0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Vector vector0 = Utils.tokenize("90", stringArray0, true);
      assertEquals("[90]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "A";
      // Undeclared exception!
      try { 
        Utils.tokenize("L", stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector vector0 = Utils.tokenize("J", 'J');
      assertEquals("[, ]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      boolean boolean0 = Utils.is_jid("6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = Utils.getBytesUtf8("");
      byte[] byteArray1 = Utils.digest(byteArray0, "md5");
      assertEquals(16, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = Utils.hexDigest("", "sha1");
      assertEquals("da39a3ee5e6b4b0d3255bfef95601890afd80709", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = Utils.digest(byteArray0, "");
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.hexDigest("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.easyReply((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.Utils", e);
      }
  }
}
