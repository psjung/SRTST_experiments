/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:27:12 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Adler32_ESTest1 extends Adler32_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)3;
      adler32_0.update(byteArray0, 0, (int) (byte)3);
      assertEquals(786436L, adler32_0.getValue());
  }

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      Adler32 adler32_0 = new Adler32();
      // Undeclared exception!
      try { 
        adler32_0.update(byteArray0, (int) (byte)82, 5552);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 82
         //
         assertThrownBy("com.sleepycat.je.utilint.Adler32", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      Adler32 adler32_0 = new Adler32();
      adler32_0.update(byteArray0, (int) (byte) (-50), (int) (byte) (-50));
      assertEquals(1L, adler32_0.getValue());
  }

  @Test
  public void test3()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      adler32_0.update((-2488));
      adler32_0.update(2328);
      assertEquals(11141217L, adler32_0.getValue());
  }

  @Test
  public void test4()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      // Undeclared exception!
      try { 
        adler32_0.update((byte[]) null, (int) (byte)1, (int) (byte)1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.Adler32", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        adler32_0.update(byteArray0, (int) (byte) (-15), 131072);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -15
         //
         assertThrownBy("com.sleepycat.je.utilint.Adler32", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      java.util.zip.Adler32 adler32_0 = (java.util.zip.Adler32)Adler32.makeChecksum();
      assertEquals(1L, adler32_0.getValue());
  }

  @Test
  public void test7()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      adler32_0.reset();
      assertEquals(1L, adler32_0.getValue());
  }

  @Test
  public void test8()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      long long0 = adler32_0.getValue();
      assertEquals(1L, long0);
  }
}
