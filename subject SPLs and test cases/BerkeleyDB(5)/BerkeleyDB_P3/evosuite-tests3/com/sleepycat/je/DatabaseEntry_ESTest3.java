/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 04:06:05 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DatabaseEntry_ESTest3 extends DatabaseEntry_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setSize(2965);
      int int0 = databaseEntry0.getSize();
      assertEquals(2965, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setSize((-83));
      int int0 = databaseEntry0.getSize();
      assertEquals((-83), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)82, (int) (byte)82);
      databaseEntry0.setPartial((int) (byte)82, 4044, true);
      int int0 = databaseEntry0.getPartialOffset();
      assertEquals(4044, databaseEntry0.getPartialLength());
      assertEquals(82, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setPartial((-1), (-1), true);
      int int0 = databaseEntry0.getPartialOffset();
      assertEquals(-1, databaseEntry0.getPartialLength());
      assertEquals((-1), int0);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)82, (int) (byte)82);
      databaseEntry0.setPartial((int) (byte)82, 4044, true);
      int int0 = databaseEntry0.getPartialLength();
      assertEquals(4044, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)82, (int) (byte)82);
      databaseEntry0.setPartial(1807, (-3383), true);
      int int0 = databaseEntry0.getPartialLength();
      assertEquals(1807, databaseEntry0.getPartialOffset());
      assertEquals((-3383), int0);
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      assertFalse(databaseEntry0.getPartial());
      
      databaseEntry0.setPartial(true);
      boolean boolean0 = databaseEntry0.getPartial();
      assertTrue(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)82, (int) (byte)82);
      int int0 = databaseEntry0.getOffset();
      assertEquals(82, int0);
      assertEquals(82, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setData(byteArray0, (int) (byte) (-55), 1);
      int int0 = databaseEntry0.getOffset();
      assertEquals((-55), int0);
  }

  @Test
  public void test09()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.getData();
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getOffset());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.getData();
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-55);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.hashCode();
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
  }

  @Test
  public void test12()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[5];
      databaseEntry0.setData(byteArray0, (-1289), (-770));
      databaseEntry0.hashCode();
      assertEquals(-1289, databaseEntry0.getOffset());
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)1;
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setOffset((byte)1);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0);
      boolean boolean0 = databaseEntry1.equals(databaseEntry0);
      assertEquals(1, databaseEntry0.getOffset());
      assertFalse(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[1];
      databaseEntry0.setData(byteArray0, 0, (int) (byte) (-1));
      boolean boolean0 = databaseEntry0.equals(databaseEntry0);
      assertEquals(-1, databaseEntry0.getSize());
      assertTrue(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)67, (int) (byte)0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0, (int) (byte)67, 2553);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(0, databaseEntry1.getPartialOffset());
      assertEquals(0, databaseEntry1.getPartialLength());
      assertEquals(67, databaseEntry1.getOffset());
      assertFalse(databaseEntry1.getPartial());
      assertFalse(boolean0);
      assertEquals(2553, databaseEntry1.getSize());
  }

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartial((-1), 3085, true);
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      databaseEntry1.setPartial(true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(3085, databaseEntry0.getPartialLength());
      assertFalse(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[4];
      databaseEntry0.setData(byteArray0);
      databaseEntry0.setOffset((byte) (-1));
      // Undeclared exception!
      try { 
        databaseEntry0.hashCode();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("com.sleepycat.je.DatabaseEntry", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[0];
      databaseEntry0.setData(byteArray0, 3149, 3149);
      // Undeclared exception!
      try { 
        databaseEntry0.equals(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3149
         //
         assertThrownBy("com.sleepycat.je.DatabaseEntry", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartialOffset((byte)0);
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test20()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      assertEquals(0, databaseEntry0.getSize());
      
      byte[] byteArray0 = new byte[4];
      databaseEntry0.setData(byteArray0);
      databaseEntry0.hashCode();
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test21()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.hashCode();
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)1;
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setOffset((byte)1);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(1, databaseEntry0.getOffset());
      assertFalse(boolean0);
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 1521, (int) (byte) (-1));
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0, (-133), (int) (byte) (-87));
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertFalse(databaseEntry1.getPartial());
      assertEquals(0, databaseEntry1.getPartialOffset());
      assertFalse(databaseEntry1.equals((Object)databaseEntry0));
      assertFalse(boolean0);
      assertEquals(0, databaseEntry1.getPartialLength());
      assertEquals(-133, databaseEntry1.getOffset());
      assertEquals(-87, databaseEntry1.getSize());
  }

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(0, databaseEntry1.getOffset());
      assertEquals(0, databaseEntry1.getSize());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry1.getPartialOffset());
      assertEquals(0, databaseEntry1.getPartialLength());
      assertFalse(databaseEntry1.getPartial());
      assertFalse(boolean0);
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test25()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      byte[] byteArray0 = new byte[6];
      databaseEntry1.setData(byteArray0, (int) (byte)0, (int) (byte)34);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(34, databaseEntry1.getSize());
      assertFalse(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      boolean boolean0 = databaseEntry0.equals(databaseEntry0);
      assertEquals(0, databaseEntry0.getSize());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getOffset());
      assertTrue(boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartial(true);
      databaseEntry1.setPartial(75, 0, true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertFalse(databaseEntry1.equals((Object)databaseEntry0));
      assertFalse(boolean0);
  }

  @Test
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartial(true);
      databaseEntry1.setPartial(75, 0, true);
      databaseEntry0.setPartialLength(816);
      boolean boolean0 = databaseEntry1.equals(databaseEntry0);
      assertEquals(816, databaseEntry0.getPartialLength());
      assertFalse(boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartial(true);
      boolean boolean0 = databaseEntry1.equals(databaseEntry0);
      assertFalse(databaseEntry1.equals((Object)databaseEntry0));
      assertFalse(boolean0);
  }

  @Test
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      assertFalse(databaseEntry0.getPartial());
      
      databaseEntry0.setPartial(true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry0);
      assertTrue(databaseEntry0.getPartial());
      assertTrue(boolean0);
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      Object object0 = new Object();
      boolean boolean0 = databaseEntry0.equals(object0);
      assertEquals(0, databaseEntry0.getOffset());
      assertFalse(boolean0);
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
  }

  @Test
  public void test32()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setData((byte[]) null);
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getSize());
  }

  @Test
  public void test33()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry((byte[]) null);
      assertEquals(0, databaseEntry0.getOffset());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getSize());
  }

  @Test
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.getData();
      assertEquals(5, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test35()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      int int0 = databaseEntry0.getSize();
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, int0);
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test36()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      int int0 = databaseEntry0.getPartialOffset();
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, int0);
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      String string0 = databaseEntry0.toString();
      assertEquals("<DatabaseEntry dlen=0 doff=0 doff=0 offset=0 size=7>", string0);
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      boolean boolean0 = databaseEntry0.getPartial();
      assertEquals(5, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(boolean0);
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      int int0 = databaseEntry0.getOffset();
      assertEquals(0, int0);
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(5, databaseEntry0.getSize());
  }

  @Test
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.dumpData();
      assertEquals(7, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test41()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      int int0 = databaseEntry0.getPartialLength();
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, int0);
      assertEquals(0, databaseEntry0.getSize());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
  }
}