/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:26:16 KST 2017
 */

package com.sleepycat.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class UtfOps_ESTest3 extends UtfOps_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      UtfOps.getZeroTerminatedByteLength(byteArray0, (byte)0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      UtfOps.getCharLength(byteArray0, 0, 3);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("");
      UtfOps.getCharLength(byteArray0);
  }

  @Test
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[0];
      UtfOps.getByteLength(charArray0);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      char[] charArray0 = new char[2];
      UtfOps.bytesToChars(byteArray0, 2884, charArray0, (byte) (-1), 0, true);
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      char[] charArray0 = new char[2];
      UtfOps.bytesToChars(byteArray0, (byte) (-103), charArray0, 0, (byte) (-103), false);
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-28);
      byteArray0[3] = (byte)77;
      char[] charArray0 = new char[3];
      try { 
        UtfOps.bytesToChars(byteArray0, 0, charArray0, (byte)0, 459, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      UtfOps.stringToBytes("c.u/A/944KBbg1");
  }

  @Test
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[1];
      UtfOps.getByteLength(charArray0, (-1631), (-1631));
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)28;
      byteArray0[2] = (byte) (-1);
      UtfOps.getZeroTerminatedByteLength(byteArray0, 1);
  }

  @Test
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        UtfOps.stringToBytes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        UtfOps.getZeroTerminatedByteLength((byte[]) null, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        UtfOps.getCharLength((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        UtfOps.getByteLength(charArray0, 1218, 1218);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1218
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        UtfOps.getByteLength((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-104);
      try { 
        UtfOps.bytesToString(byteArray0, (byte)2, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      try { 
        UtfOps.bytesToString(byteArray0, 2042, (byte)77);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2042
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        UtfOps.bytesToChars((byte[]) null, 0, charArray0, (byte)0, 459, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("T~HtQt*lY|k");
      char[] charArray0 = new char[2];
      charArray0[0] = 'i';
      // Undeclared exception!
      try { 
        UtfOps.charsToBytes(charArray0, 0, byteArray0, (-1622), 1780);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1622
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      char[] charArray0 = new char[1];
      UtfOps.charsToBytes(charArray0, 0, byteArray0, 0, 0);
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = new char[3];
      UtfOps.bytesToChars(byteArray0, 0, charArray0, 0, 0, false);
  }

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)127;
      try { 
        UtfOps.getCharLength(byteArray0, 0, (int) (byte)127);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-36);
      try { 
        UtfOps.getCharLength(byteArray0, (int) (byte)0, 2279);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)66;
      try { 
        UtfOps.getCharLength(byteArray0, 0, (int) (byte)66);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)106;
      try { 
        UtfOps.getCharLength(byteArray0, 0, (int) (byte)106);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)94;
      try { 
        UtfOps.getCharLength(byteArray0, 0, (int) (byte)94);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("T~HtQt*lY|k");
      UtfOps.getCharLength(byteArray0, 2, (-1622));
  }

  @Test
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '%';
      UtfOps.getByteLength(charArray0, 0, 1);
  }

  @Test
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[1];
      UtfOps.getByteLength(charArray0, 0, 1);
  }

  @Test
  public void test29()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("");
      try { 
        UtfOps.getZeroTerminatedByteLength(byteArray0, (-26));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -26
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      UtfOps.bytesToString(byteArray0, 0, 0);
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      char[] charArray0 = new char[17];
      // Undeclared exception!
      try { 
        UtfOps.charsToBytes(charArray0, 4, byteArray0, 0, (byte)28);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-2);
      char[] charArray0 = new char[3];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, (byte)0, 459, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-87);
      char[] charArray0 = new char[2];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, (-26), 555, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-103);
      char[] charArray0 = new char[2];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, 0, 555, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[5] = (byte) (-128);
      char[] charArray0 = new char[8];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, 1, 1548, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)113;
      char[] charArray0 = new char[20];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, 0, '1', true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("o4I~j9f|2");
      char[] charArray0 = new char[0];
      try { 
        UtfOps.bytesToChars(byteArray0, 0, charArray0, 0, 1, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)85;
      char[] charArray0 = new char[3];
      try { 
        UtfOps.bytesToChars(byteArray0, 0, charArray0, (byte)0, 458, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)77;
      char[] charArray0 = new char[3];
      try { 
        UtfOps.bytesToChars(byteArray0, 0, charArray0, (byte)0, 459, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)63;
      char[] charArray0 = new char[8];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, 1, 1548, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte)32;
      char[] charArray0 = new char[8];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, 1, 1548, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)23;
      char[] charArray0 = new char[3];
      try { 
        UtfOps.bytesToChars(byteArray0, 0, charArray0, (byte)0, 459, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-79);
      char[] charArray0 = new char[8];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, 1, 1548, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test44()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("T~HtQt*lY|k");
      UtfOps.bytesToString(byteArray0, (-204), (-576));
  }

  @Test
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-15);
      try { 
        UtfOps.getCharLength(byteArray0, (int) (byte)0, 192);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-17);
      UtfOps.getCharLength(byteArray0);
  }

  @Test
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte) (-62);
      UtfOps.getCharLength(byteArray0);
  }

  @Test
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-76);
      try { 
        UtfOps.getCharLength(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte) (-90);
      try { 
        UtfOps.getCharLength(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-121);
      try { 
        UtfOps.getCharLength(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)49;
      int int0 = UtfOps.getCharLength(byteArray0);
      assertEquals(6, int0);
  }

  @Test
  public void test52()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("`|_ZUtc!LjypG)");
      int int0 = UtfOps.getCharLength(byteArray0);
      assertEquals(14, int0);
  }

  @Test
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte)18;
      int int0 = UtfOps.getCharLength(byteArray0);
      assertEquals(7, int0);
  }

  @Test
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-104);
      try { 
        UtfOps.getCharLength(byteArray0, 1, 874);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = '\u0088';
      int int0 = UtfOps.getByteLength(charArray0);
      assertEquals(4, int0);
  }

  @Test
  public void test56()  throws Throwable  {
      UtfOps utfOps0 = new UtfOps();
  }
}
