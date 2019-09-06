/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:55:35 KST 2017
 */

package com.sleepycat.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FastInputStream_ESTest2 extends FastInputStream_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      long long0 = fastInputStream0.skip((byte)107);
      assertEquals(4, fastInputStream0.getBufferOffset());
      assertEquals(4L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.readFast(byteArray0, 0, 0);
      assertEquals(0, int0);
      assertEquals(4, fastInputStream0.available());
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.readFast(byteArray0, (int) (byte)1, (int) (byte)1);
      assertEquals(5, fastInputStream0.available());
      assertEquals(1, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (int) (byte)19, (int) (byte)19);
      fastInputStream0.reset();
      int int0 = fastInputStream0.readFast(byteArray0);
      assertEquals(18, fastInputStream0.available());
      assertEquals(1, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-1);
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.readFast();
      assertEquals(1, fastInputStream0.getBufferOffset());
      assertEquals(255, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (-2828), 255);
      assertEquals(-2828, fastInputStream0.getBufferOffset());
      
      byte[] byteArray1 = new byte[1];
      fastInputStream0.off = 0;
      int int0 = fastInputStream0.read(byteArray1, 0, 0);
      assertEquals(0, int0);
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 1, 0);
      int int0 = fastInputStream0.read(byteArray0, 0, 0);
      assertEquals((-1), int0);
      assertEquals(-1, fastInputStream0.available());
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.read(byteArray0);
      assertEquals(7, fastInputStream0.getBufferOffset());
      assertEquals(7, int0);
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.read();
      assertEquals(1, fastInputStream0.getBufferOffset());
      assertEquals(0, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)88;
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.read();
      assertEquals(1, fastInputStream0.getBufferOffset());
      assertEquals(88, int0);
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.getBufferOffset();
      assertEquals(0, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 1859, (int) (byte) (-8));
      assertEquals(-1867, fastInputStream0.available());
      
      fastInputStream0.skip(0L);
      int int0 = fastInputStream0.getBufferOffset();
      assertEquals((-8), int0);
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.getBufferLength();
      assertEquals(0, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 0, (-322));
      int int0 = fastInputStream0.getBufferLength();
      assertEquals((-322), int0);
      assertEquals(0, fastInputStream0.getBufferOffset());
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (-2828), 255);
      byte[] byteArray1 = new byte[1];
      fastInputStream0.buf = byteArray0;
      fastInputStream0.buf = byteArray1;
      fastInputStream0.getBufferBytes();
      assertEquals(3083, fastInputStream0.available());
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (int) (byte) (-1), (int) (byte) (-1));
      int int0 = fastInputStream0.available();
      assertEquals(0, int0);
  }

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (int) (byte)54, 1289);
      fastInputStream0.len = (-2176);
      int int0 = fastInputStream0.available();
      assertEquals((-2230), int0);
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (-2828), 255);
      byte[] byteArray1 = new byte[1];
      fastInputStream0.off = 0;
      fastInputStream0.buf = byteArray0;
      fastInputStream0.buf = byteArray1;
      fastInputStream0.off = (int) (byte)0;
      fastInputStream0.off = (int) (byte)0;
      fastInputStream0.off = 1;
      int int0 = fastInputStream0.read(byteArray0);
      assertEquals(1, fastInputStream0.getBufferOffset());
      assertEquals(0, int0);
  }

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.read(byteArray0, (int) (byte)0, 1);
      assertEquals(1, fastInputStream0.getBufferOffset());
      assertEquals(1, int0);
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 1859, (int) (byte) (-8));
      long long0 = fastInputStream0.skip(0L);
      assertEquals((-1867L), long0);
      
      int int0 = fastInputStream0.readFast();
      assertEquals(-8, fastInputStream0.getBufferOffset());
      assertEquals((-1), int0);
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 1859, (int) (byte) (-8));
      // Undeclared exception!
      try { 
        fastInputStream0.readFast((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.skip((-748L));
      // Undeclared exception!
      try { 
        fastInputStream0.readFast(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (int) (byte) (-20), 0);
      // Undeclared exception!
      try { 
        fastInputStream0.readFast();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -20
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      // Undeclared exception!
      try { 
        fastInputStream0.read((byte[]) null, (int) (byte)1, 1722);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      // Undeclared exception!
      try { 
        fastInputStream0.read((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 1, 489);
      byte[] byteArray1 = new byte[3];
      // Undeclared exception!
      try { 
        fastInputStream0.read(byteArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      FastInputStream fastInputStream0 = new FastInputStream((byte[]) null, (int) (byte)0, (int) (byte)21);
      // Undeclared exception!
      try { 
        fastInputStream0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      FastInputStream fastInputStream0 = null;
      try {
        fastInputStream0 = new FastInputStream((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (-204), 718);
      // Undeclared exception!
      try { 
        fastInputStream0.readFast(byteArray0, 0, 3454);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 1859, (int) (byte) (-8));
      fastInputStream0.mark = (int) (byte) (-37);
      fastInputStream0.reset();
      // Undeclared exception!
      try { 
        fastInputStream0.readFast((byte[]) null, (int) (byte)0, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (-1), (-1));
      int int0 = fastInputStream0.readFast(byteArray0, 255, 255);
      assertEquals((-1), int0);
      assertEquals(0, fastInputStream0.available());
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.readFast();
      assertEquals(3, fastInputStream0.available());
      assertEquals(0, int0);
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 1859, (int) (byte) (-8));
      int int0 = fastInputStream0.readFast();
      assertEquals((-1), int0);
      assertEquals(-1867, fastInputStream0.available());
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 1859, (int) (byte) (-8));
      int int0 = fastInputStream0.read();
      assertEquals(-1867, fastInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 1859, (int) (byte) (-8));
      long long0 = fastInputStream0.skip(0L);
      assertEquals((-1867L), long0);
      
      long long1 = fastInputStream0.skip(0L);
      assertEquals(-8, fastInputStream0.getBufferOffset());
      assertEquals(0L, long1);
  }

  @Test
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 1859, (int) (byte) (-8));
      int int0 = fastInputStream0.readFast(byteArray0);
      assertEquals(-1867, fastInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (int) (byte)54, 1289);
      int int0 = fastInputStream0.available();
      assertEquals(1235, int0);
  }

  @Test
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (-2828), 255);
      boolean boolean0 = fastInputStream0.markSupported();
      assertEquals(3083, fastInputStream0.available());
      assertTrue(boolean0);
  }

  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (-2828), 255);
      int int0 = fastInputStream0.getBufferLength();
      assertEquals(255, int0);
      assertEquals(3083, fastInputStream0.available());
  }

  @Test
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (-2828), 255);
      byte[] byteArray1 = new byte[1];
      // Undeclared exception!
      try { 
        fastInputStream0.read(byteArray1, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 1859, (int) (byte) (-8));
      int int0 = fastInputStream0.read(byteArray0);
      assertEquals((-1), int0);
      assertEquals(-1867, fastInputStream0.available());
  }

  @Test
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (-2828), 255);
      // Undeclared exception!
      try { 
        fastInputStream0.read();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2828
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (-2828), 255);
      fastInputStream0.mark((-1724));
      assertEquals(3083, fastInputStream0.available());
  }

  @Test
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (-2828), 255);
      byte[] byteArray1 = fastInputStream0.getBufferBytes();
      assertEquals(3083, fastInputStream0.available());
      assertNotNull(byteArray1);
  }

  @Test
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      byte[] byteArray1 = new byte[0];
      int int0 = fastInputStream0.readFast(byteArray1);
      assertEquals(0, int0);
      assertEquals(9, fastInputStream0.available());
  }

  @Test
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 1859, (int) (byte) (-8));
      int int0 = fastInputStream0.getBufferOffset();
      assertEquals(-1867, fastInputStream0.available());
      assertEquals(1859, int0);
  }
}
