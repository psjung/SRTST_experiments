/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:11:04 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class PackedOffsets_ESTest4 extends PackedOffsets_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      PackedOffsets packedOffsets0 = new PackedOffsets();
      long[] longArray0 = new long[11];
      packedOffsets0.pack(longArray0);
      PackedOffsets.Iterator packedOffsets_Iterator0 = packedOffsets0.iterator();
      assertNotNull(packedOffsets_Iterator0);
  }

  @Test
  public void test01()  throws Throwable  {
      PackedOffsets packedOffsets0 = new PackedOffsets();
      long[] longArray0 = new long[3];
      longArray0[1] = (long) 8;
      packedOffsets0.pack(longArray0);
      long[] longArray1 = packedOffsets0.toArray();
      assertArrayEquals(new long[] {0L, 0L, 8L}, longArray1);
  }

  @Test
  public void test02()  throws Throwable  {
      PackedOffsets packedOffsets0 = new PackedOffsets();
      long[] longArray0 = new long[3];
      longArray0[0] = 1452L;
      longArray0[1] = 1291L;
      packedOffsets0.pack(longArray0);
      assertEquals((-1L), packedOffsets0.getTransactionId());
  }

  @Test
  public void test03()  throws Throwable  {
      PackedOffsets packedOffsets0 = new PackedOffsets();
      PackedOffsets.Iterator packedOffsets_Iterator0 = packedOffsets0.iterator();
      assertNotNull(packedOffsets_Iterator0);
  }

  @Test
  public void test04()  throws Throwable  {
      PackedOffsets packedOffsets0 = new PackedOffsets();
      // Undeclared exception!
      try { 
        packedOffsets0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      PackedOffsets packedOffsets0 = new PackedOffsets();
      // Undeclared exception!
      try { 
        packedOffsets0.readFromLog((ByteBuffer) null, (byte) (-55));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      PackedOffsets packedOffsets0 = new PackedOffsets();
      // Undeclared exception!
      try { 
        packedOffsets0.pack((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.PackedOffsets", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      PackedOffsets packedOffsets0 = new PackedOffsets();
      // Undeclared exception!
      try { 
        packedOffsets0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.PackedOffsets", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      PackedOffsets packedOffsets0 = new PackedOffsets();
      long[] longArray0 = new long[3];
      packedOffsets0.pack(longArray0);
      String string0 = packedOffsets0.toString();
      assertEquals("<offsets size=\"3\">0x0 0x0 0x0 </offsets>", string0);
  }

  @Test
  public void test09()  throws Throwable  {
      PackedOffsets packedOffsets0 = new PackedOffsets();
      long[] longArray0 = new long[1];
      packedOffsets0.pack(longArray0);
      // Undeclared exception!
      try { 
        packedOffsets0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.PackedOffsets", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      PackedOffsets packedOffsets0 = new PackedOffsets();
      long[] longArray0 = new long[1];
      packedOffsets0.pack(longArray0);
      int int0 = packedOffsets0.getLogSize();
      assertEquals(10, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      PackedOffsets packedOffsets0 = new PackedOffsets();
      int int0 = packedOffsets0.getLogSize();
      assertEquals(8, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      PackedOffsets packedOffsets0 = new PackedOffsets();
      long[] longArray0 = packedOffsets0.toArray();
      assertArrayEquals(new long[] {}, longArray0);
  }

  @Test
  public void test14()  throws Throwable  {
      PackedOffsets packedOffsets0 = new PackedOffsets();
      boolean boolean0 = packedOffsets0.logEntryIsTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      PackedOffsets packedOffsets0 = new PackedOffsets();
      long long0 = packedOffsets0.getTransactionId();
      assertEquals((-1L), long0);
  }
}
