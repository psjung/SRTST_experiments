/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:49:04 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.DatabaseEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DatabaseEntry_ESTest2 extends DatabaseEntry_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 1086, 1086);
      int int0 = databaseEntry0.getSize();
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(1086, int0);
      assertEquals(1086, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)106, (int) (byte) (-60));
      int int0 = databaseEntry0.getSize();
      assertEquals(106, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
      assertEquals((-60), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)1, 255);
      databaseEntry0.setPartial(2313, (int) (byte)23, true);
      int int0 = databaseEntry0.getPartialOffset();
      assertEquals(23, databaseEntry0.getPartialLength());
      assertEquals(2313, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 0, (int) (byte)0);
      databaseEntry0.setPartialOffset((byte) (-1));
      int int0 = databaseEntry0.getPartialOffset();
      assertEquals((-1), int0);
  }

  @Test
  public void test04()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setPartial(1678, 5052, true);
      int int0 = databaseEntry0.getPartialLength();
      assertEquals(5052, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setPartial((-1150), (-1150), false);
      int int0 = databaseEntry0.getPartialLength();
      assertEquals(-1150, databaseEntry0.getPartialOffset());
      assertEquals((-1150), int0);
  }

  @Test
  public void test06()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      assertFalse(databaseEntry0.getPartial());
      
      databaseEntry0.setPartial(true);
      boolean boolean0 = databaseEntry0.getPartial();
      assertTrue(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[0];
      databaseEntry0.setData(byteArray0, (-1), 554);
      int int0 = databaseEntry0.getOffset();
      assertEquals(554, databaseEntry0.getSize());
      assertEquals((-1), int0);
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setData(byteArray0, (int) (byte)0, (int) (byte)0);
      databaseEntry0.getData();
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getSize());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 0, 0);
      databaseEntry0.getData();
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getSize());
  }

  @Test
  public void test10()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      assertEquals(0, databaseEntry0.getSize());
      
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-106);
      databaseEntry0.setData(byteArray0);
      databaseEntry0.hashCode();
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setData(byteArray0, 641, (-1));
      databaseEntry0.hashCode();
      assertEquals(-1, databaseEntry0.getSize());
  }

  @Test
  public void test12()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      assertEquals(0, databaseEntry0.getSize());
      
      byte[] byteArray0 = new byte[4];
      databaseEntry0.setData(byteArray0);
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte) (-1);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray1);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertFalse(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      assertEquals(0, databaseEntry0.getSize());
      
      byte[] byteArray0 = new byte[4];
      databaseEntry0.setData(byteArray0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0, (int) (byte)0, (-113));
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertFalse(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      databaseEntry0.setPartial((-1522), (-1522), true);
      databaseEntry1.setPartial(true);
      boolean boolean0 = databaseEntry1.equals(databaseEntry0);
      assertFalse(databaseEntry1.equals((Object)databaseEntry0));
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setData(byteArray0, 641, 4);
      // Undeclared exception!
      try { 
        databaseEntry0.hashCode();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 641
         //
         assertThrownBy("com.sleepycat.je.DatabaseEntry", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.hashCode();
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test17()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      assertEquals(0, databaseEntry0.getSize());
      
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-1);
      databaseEntry0.setData(byteArray0);
      byte[] byteArray1 = new byte[4];
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray1);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertFalse(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      assertEquals(0, databaseEntry0.getSize());
      
      byte[] byteArray0 = new byte[4];
      databaseEntry0.setData(byteArray0);
      boolean boolean0 = databaseEntry0.equals(databaseEntry0);
      assertTrue(boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[4];
      databaseEntry0.setData(byteArray0, (int) (byte)5, 7);
      // Undeclared exception!
      try { 
        databaseEntry0.equals(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         assertThrownBy("com.sleepycat.je.DatabaseEntry", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 825, (-46));
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0, (-46), (-1));
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertFalse(databaseEntry1.getPartial());
      assertEquals(0, databaseEntry1.getPartialLength());
      assertFalse(boolean0);
      assertEquals(-46, databaseEntry1.getOffset());
      assertEquals(0, databaseEntry1.getPartialOffset());
      assertFalse(databaseEntry1.equals((Object)databaseEntry0));
      assertEquals(-1, databaseEntry1.getSize());
  }

  @Test
  public void test21()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0, (-1), (int) (byte) (-14));
      boolean boolean0 = databaseEntry1.equals(databaseEntry0);
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry1.getPartialLength());
      assertEquals(-1, databaseEntry1.getOffset());
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, databaseEntry1.getPartialOffset());
      assertEquals(-14, databaseEntry1.getSize());
      assertFalse(databaseEntry1.getPartial());
      assertEquals(0, databaseEntry0.getOffset());
      assertFalse(boolean0);
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test22()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0, (-1), (int) (byte) (-14));
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertFalse(boolean0);
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry1.getPartial());
      assertEquals(-14, databaseEntry1.getSize());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry1.getPartialLength());
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, databaseEntry1.getPartialOffset());
      assertEquals(0, databaseEntry0.getOffset());
      assertFalse(databaseEntry1.equals((Object)databaseEntry0));
      assertEquals(-1, databaseEntry1.getOffset());
  }

  @Test
  public void test23()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[3];
      databaseEntry0.setData(byteArray0, (int) (byte)60, (int) (byte) (-35));
      boolean boolean0 = databaseEntry0.equals(databaseEntry0);
      assertEquals(-35, databaseEntry0.getSize());
      assertTrue(boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      databaseEntry0.setPartial((-1536), (-1536), true);
      databaseEntry1.setPartialLength((-1536));
      databaseEntry1.setPartial(true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(-1536, databaseEntry1.getPartialLength());
      assertFalse(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      databaseEntry0.setPartial((-1522), (-1522), true);
      databaseEntry1.setPartial(true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(-1522, databaseEntry0.getPartialOffset());
      assertFalse(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-104), (int) (byte) (-104));
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0);
      databaseEntry1.setPartial((-111), 1, true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(-111, databaseEntry1.getPartialOffset());
      assertFalse(boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 825, (-46));
      boolean boolean0 = databaseEntry0.equals(byteArray0);
      assertEquals(825, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(-46, databaseEntry0.getSize());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(boolean0);
  }

  @Test
  public void test28()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      boolean boolean0 = databaseEntry0.equals(databaseEntry0);
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertTrue(boolean0);
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test29()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setData((byte[]) null);
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getSize());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test30()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry((byte[]) null);
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getSize());
  }

  @Test
  public void test31()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.getData();
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test32()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      int int0 = databaseEntry0.getSize();
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, int0);
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)1, 255);
      int int0 = databaseEntry0.getPartialOffset();
      assertEquals(0, int0);
      assertEquals(255, databaseEntry0.getSize());
      assertEquals(1, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test34()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      int int0 = databaseEntry0.getPartialLength();
      assertEquals(0, int0);
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getSize());
  }

  @Test
  public void test35()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      String string0 = databaseEntry0.toString();
      assertEquals("<DatabaseEntry dlen=0 doff=0 doff=0 offset=0 size=0>", string0);
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test36()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setPartial((-1536), (-1536), true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry0);
      assertEquals(-1536, databaseEntry0.getPartialLength());
      assertTrue(boolean0);
  }

  @Test
  public void test37()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      boolean boolean0 = databaseEntry0.getPartial();
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(boolean0);
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getSize());
  }

  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 0, 0);
      databaseEntry0.setOffset(9);
      int int0 = databaseEntry0.getOffset();
      assertEquals(9, int0);
  }

  @Test
  public void test39()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      int int0 = databaseEntry0.getOffset();
      assertEquals(0, int0);
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getSize());
  }

  @Test
  public void test40()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.dumpData();
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getSize());
  }

  @Test
  public void test41()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setSize(0);
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
  }
}
