/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:44:42 KST 2017
 */

package com.sleepycat.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.util.UtfOps;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class UtfOps_ESTest1 extends UtfOps_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      UtfOps.getZeroTerminatedByteLength(byteArray0, (byte)0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      UtfOps.getCharLength(byteArray0, 0, 0);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      UtfOps.getCharLength(byteArray0);
  }

  @Test
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[0];
      UtfOps.getByteLength(charArray0);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      char[] charArray0 = new char[1];
      UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, (byte) (-1), 0, true);
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      char[] charArray0 = new char[3];
      UtfOps.bytesToChars(byteArray0, (byte) (-96), charArray0, (byte) (-46), (-1297), false);
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      char[] charArray0 = new char[3];
      UtfOps.charsToBytes(charArray0, 2, byteArray0, 0, (byte)0);
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte) (-25);
      byteArray0[4] = (byte)49;
      try { 
        UtfOps.bytesToString(byteArray0, (byte)0, 5);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-46);
      byteArray0[2] = (byte) (-46);
      try { 
        UtfOps.bytesToString(byteArray0, (byte)0, 2);
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
      byte[] byteArray0 = new byte[0];
      UtfOps.bytesToString(byteArray0, (-2962), (-2962));
  }

  @Test
  public void test10()  throws Throwable  {
      UtfOps.stringToBytes("*fH3wm88");
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-128);
      byteArray0[1] = (byte)12;
      UtfOps.getZeroTerminatedByteLength(byteArray0, 0);
  }

  @Test
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("Djm%rNw-]'");
      try { 
        UtfOps.getZeroTerminatedByteLength(byteArray0, (-1305));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1305
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
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        UtfOps.bytesToString((byte[]) null, (-2414), 1042);
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
      byte[] byteArray0 = new byte[0];
      try { 
        UtfOps.bytesToString(byteArray0, (-3888), 6089);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3888
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = new char[3];
      charArray0[0] = '`';
      // Undeclared exception!
      try { 
        UtfOps.charsToBytes(charArray0, 0, byteArray0, (-1), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        UtfOps.charsToBytes(charArray0, 0, byteArray0, (-1), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      char[] charArray0 = new char[3];
      UtfOps.bytesToChars(byteArray0, 2, charArray0, (-3765), (byte)0, false);
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-41);
      UtfOps.getCharLength(byteArray0, 0, 1);
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)31;
      try { 
        UtfOps.getCharLength(byteArray0, 0, (int) (byte)11);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-110);
      try { 
        UtfOps.getCharLength(byteArray0, (int) (byte)0, 1556);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-64);
      try { 
        UtfOps.getCharLength(byteArray0, 0, 1760);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[10];
      UtfOps.getByteLength(charArray0, 2, 2);
  }

  @Test
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'H';
      // Undeclared exception!
      try { 
        UtfOps.getByteLength(charArray0, 0, 3278);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[3];
      UtfOps.getByteLength(charArray0, (int) (byte) (-96), (-592));
  }

  @Test
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[1];
      UtfOps.getByteLength(charArray0);
  }

  @Test
  public void test30()  throws Throwable  {
      UtfOps.stringToBytes("");
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      UtfOps.bytesToString(byteArray0, 4, 0);
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-46);
      byteArray0[2] = (byte) (-96);
      UtfOps.bytesToString(byteArray0, (byte)0, 7);
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-1);
      char[] charArray0 = new char[5];
      try { 
        UtfOps.bytesToChars(byteArray0, 0, charArray0, 1278, 416, false);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-20);
      char[] charArray0 = new char[5];
      try { 
        UtfOps.bytesToChars(byteArray0, 0, charArray0, 1278, 416, false);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-46);
      try { 
        UtfOps.bytesToString(byteArray0, (byte)0, 2);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-53);
      try { 
        UtfOps.bytesToString(byteArray0, (byte)0, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-88);
      char[] charArray0 = new char[0];
      try { 
        UtfOps.bytesToChars(byteArray0, 0, charArray0, (byte)0, (byte)1, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-110);
      char[] charArray0 = new char[2];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, 0, 1464, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-120);
      char[] charArray0 = new char[5];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)1, charArray0, 0, 686, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)125;
      // Undeclared exception!
      try { 
        UtfOps.bytesToChars(byteArray0, 0, (char[]) null, 0, (byte)125, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes(":_MC[n=XGbiSy9G");
      char[] charArray0 = new char[6];
      try { 
        UtfOps.bytesToChars(byteArray0, 1, charArray0, 1, 255, false);
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
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)33;
      char[] charArray0 = new char[8];
      try { 
        UtfOps.bytesToChars(byteArray0, 0, charArray0, 1, (byte)33, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)24;
      char[] charArray0 = new char[5];
      try { 
        UtfOps.bytesToChars(byteArray0, 0, charArray0, 1278, 416, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1278
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-1);
      try { 
        UtfOps.getCharLength(byteArray0, 0, (int) (byte)11);
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
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte) (-23);
      try { 
        UtfOps.getCharLength(byteArray0, 0, 2277);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-53);
      int int0 = UtfOps.getCharLength(byteArray0);
      assertEquals(2, int0);
  }

  @Test
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte) (-75);
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
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-96);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-124);
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
      byte[] byteArray0 = UtfOps.stringToBytes("_> *01mqj4I(S~sx");
      try { 
        UtfOps.getCharLength(byteArray0, 0, 63);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test51()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("\u0000\u04A0");
      assertArrayEquals(new byte[] {(byte) (-64), (byte) (-128), (byte) (-46), (byte) (-96)}, byteArray0);
  }

  @Test
  public void test52()  throws Throwable  {
      UtfOps utfOps0 = new UtfOps();
  }
}
