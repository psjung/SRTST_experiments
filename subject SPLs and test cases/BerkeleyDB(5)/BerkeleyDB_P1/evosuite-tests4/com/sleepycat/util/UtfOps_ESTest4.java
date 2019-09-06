/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 17:11:00 KST 2017
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
public class UtfOps_ESTest4 extends UtfOps_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      UtfOps.getCharLength(byteArray0, 1551, (int) (byte)0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      UtfOps.getCharLength(byteArray0);
  }

  @Test
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[0];
      UtfOps.getByteLength(charArray0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = new char[0];
      UtfOps.bytesToChars(byteArray0, 0, charArray0, 2133, 0, false);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      char[] charArray0 = new char[7];
      UtfOps.bytesToChars(byteArray0, (-1080), charArray0, 12, (-1), false);
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      UtfOps.bytesToString(byteArray0, (-2532), (-1063));
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte) (-14);
      byteArray0[3] = (byte) (-17);
      char[] charArray0 = new char[9];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, (byte)1, 127, false);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-24);
      byteArray0[2] = (byte) (-5);
      char[] charArray0 = new char[3];
      try { 
        UtfOps.bytesToChars(byteArray0, 0, charArray0, (byte)82, (byte)82, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-40);
      byteArray0[1] = (byte)91;
      char[] charArray0 = new char[5];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, (byte)0, (byte)119, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      UtfOps.stringToBytes("_9w");
  }

  @Test
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[7];
      UtfOps.getByteLength(charArray0, (-755), (-755));
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-1);
      UtfOps.getZeroTerminatedByteLength(byteArray0, 0);
  }

  @Test
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[1];
      UtfOps.getByteLength(charArray0);
  }

  @Test
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        UtfOps.getCharLength((byte[]) null, 1264, 1264);
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
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      try { 
        UtfOps.bytesToString(byteArray0, 0, 192);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      char[] charArray0 = new char[8];
      charArray0[1] = '4';
      // Undeclared exception!
      try { 
        UtfOps.charsToBytes(charArray0, 1, byteArray0, (byte)90, 3114);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 90
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[5];
      byte[] byteArray0 = new byte[21];
      UtfOps.charsToBytes(charArray0, 14, byteArray0, (-16), 0);
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)71;
      char[] charArray0 = new char[3];
      try { 
        UtfOps.bytesToChars(byteArray0, 0, charArray0, (byte)82, (byte)82, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 82
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte) (-82);
      try { 
        UtfOps.getCharLength(byteArray0, 0, 1169);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-35);
      try { 
        UtfOps.getCharLength(byteArray0, 0, 172);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)28;
      try { 
        UtfOps.getCharLength(byteArray0, 0, 172);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-50);
      try { 
        UtfOps.getCharLength(byteArray0, (int) (byte)0, 3487);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("hbVIz;'?`");
      try { 
        UtfOps.getCharLength(byteArray0, 0, 255);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("vzSs/S.:mdj]B,^ccZ");
      UtfOps.getCharLength(byteArray0, 1, 1);
  }

  @Test
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[1] = '3';
      UtfOps.getByteLength(charArray0, 1, 1);
  }

  @Test
  public void test27()  throws Throwable  {
      UtfOps.stringToBytes("");
  }

  @Test
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      UtfOps.bytesToString(byteArray0, 1950, 0);
  }

  @Test
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      char[] charArray0 = new char[2];
      charArray0[0] = '\u0083';
      // Undeclared exception!
      try { 
        UtfOps.charsToBytes(charArray0, 0, byteArray0, 1, 1018);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte) (-14);
      char[] charArray0 = new char[8];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, (byte)1, 127, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte) (-75);
      char[] charArray0 = new char[8];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, (byte)1, 127, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte) (-82);
      char[] charArray0 = new char[8];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, (byte)1, 127, false);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-109);
      char[] charArray0 = new char[7];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)1, charArray0, (byte)49, (byte)73, false);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-113);
      char[] charArray0 = new char[7];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)1, charArray0, (byte)1, (byte)73, false);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)126;
      char[] charArray0 = new char[7];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)1, charArray0, (byte)1, (byte)73, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)96;
      char[] charArray0 = new char[3];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, 14, 1, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 14
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("%kY=>^[{ NoCk%+");
      char[] charArray0 = new char[5];
      try { 
        UtfOps.bytesToChars(byteArray0, 2, charArray0, (-1203), 2710, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1203
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)63;
      char[] charArray0 = new char[3];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, 14, 1, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 14
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)41;
      char[] charArray0 = new char[9];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, (byte)1, 127, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)26;
      char[] charArray0 = new char[9];
      UtfOps.bytesToChars(byteArray0, (byte)1, charArray0, 0, 1, false);
  }

  @Test
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-1);
      try { 
        UtfOps.getCharLength(byteArray0, 0, 4216);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-29);
      try { 
        UtfOps.getCharLength(byteArray0, 0, 1169);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-47);
      int int0 = UtfOps.getCharLength(byteArray0);
      assertEquals(2, int0);
  }

  @Test
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-50);
      try { 
        UtfOps.bytesToString(byteArray0, 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[6] = (byte) (-69);
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
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte) (-106);
      try { 
        UtfOps.getCharLength(byteArray0, 0, 172);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-124);
      try { 
        UtfOps.getCharLength(byteArray0, (int) (byte)0, 224);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test48()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[2] = '\u008B';
      // Undeclared exception!
      try { 
        UtfOps.getByteLength(charArray0, 0, 3487);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = UtfOps.getZeroTerminatedByteLength(byteArray0, 0);
      assertEquals(0, int0);
  }

  @Test
  public void test50()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("vzSs/S.:mdj]B,^ccZ");
      try { 
        UtfOps.getZeroTerminatedByteLength(byteArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 18
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test51()  throws Throwable  {
      UtfOps utfOps0 = new UtfOps();
  }

  @Test
  public void test52()  throws Throwable  {
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
}
