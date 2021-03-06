/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:15:06 KST 2018
 */

package it.yup.util;

import org.junit.Test;
import static org.junit.Assert.*;
import it.yup.util.RMSIndex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RMSIndex_ESTest3 extends RMSIndex_ESTest_scaffolding3 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("");
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-30);
      rMSIndex0.load(byteArray0);
      byteArray0[1] = (byte) (-106);
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte) (-106);
      rMSIndex0.store((byte[]) null, byteArray1);
      rMSIndex0.load(byteArray0);
      byteArray0[2] = (byte) (-118);
      rMSIndex0.close();
      rMSIndex0.delete(byteArray0);
      rMSIndex0.close();
      rMSIndex0.delete(byteArray0);
      rMSIndex0.load(byteArray0);
      rMSIndex0.delete(byteArray0);
      rMSIndex0.keys();
      rMSIndex0.open();
      rMSIndex0.close();
      rMSIndex0.load(byteArray0);
      rMSIndex0.delete((byte[]) null);
      rMSIndex0.delete((byte[]) null);
      rMSIndex0.load((byte[]) null);
      rMSIndex0.delete((byte[]) null);
      rMSIndex0.open();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("h!iyN_Gl8\"u$ZUyr5n'");
      byte[] byteArray0 = new byte[4];
      rMSIndex0.keys();
      byteArray0[0] = (byte)88;
      byteArray0[1] = (byte) (-21);
      byteArray0[2] = (byte)67;
      rMSIndex0.open();
      byteArray0[3] = (byte)79;
      rMSIndex0.load(byteArray0);
      rMSIndex0.getSizes();
      rMSIndex0.open();
      rMSIndex0.store((byte[]) null, byteArray0);
      rMSIndex0.keys();
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)67;
      byteArray1[1] = (byte) (-21);
      byteArray1[2] = (byte)79;
      byteArray1[3] = (byte)88;
      byteArray1[4] = (byte) (-21);
      byteArray1[5] = (byte)88;
      byteArray1[6] = (byte)79;
      rMSIndex0.delete(byteArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("+SkrH-W=jqemJ", 2957);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)1;
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)1;
      byteArray1[1] = (byte)1;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)1;
      byteArray1[4] = (byte)1;
      byteArray1[5] = (byte) (-119);
      byteArray1[6] = (byte)44;
      rMSIndex0.store(byteArray1, byteArray0);
      byteArray0[1] = (byte)0;
      byte[] byteArray2 = new byte[4];
      byteArray2[0] = (byte)0;
      byteArray2[1] = (byte)0;
      byteArray2[2] = (byte)23;
      byteArray2[3] = (byte)23;
      rMSIndex0.store(byteArray0, byteArray2);
      byteArray0[2] = (byte)23;
      byteArray0[3] = (byte)116;
      byteArray0[4] = (byte)63;
      rMSIndex0.load(byteArray0);
      rMSIndex0.open();
      rMSIndex0.close();
      RMSIndex.rmExist("SvM\"");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex((String) null, 663);
      rMSIndex0.open();
      byte[] byteArray0 = new byte[2];
      rMSIndex0.delete(byteArray0);
      rMSIndex0.keys();
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)67;
      rMSIndex0.store(byteArray0, byteArray0);
      byte[] byteArray1 = new byte[0];
      rMSIndex0.load(byteArray1);
      rMSIndex0.close();
      rMSIndex0.open();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("");
      RMSIndex.RecordType rMSIndex_RecordType0 = rMSIndex0.new RecordType();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("6Tnt[4x;Q}h`\u0005e", 0);
      byte[] byteArray0 = new byte[0];
      rMSIndex0.delete(byteArray0);
      rMSIndex0.getSizes();
      rMSIndex0.store(byteArray0, byteArray0);
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte) (-4);
      byteArray1[1] = (byte)4;
      rMSIndex0.store(byteArray0, byteArray1);
      rMSIndex0.store(byteArray1, byteArray0);
      rMSIndex0.close();
      rMSIndex0.open();
      rMSIndex0.open();
      RMSIndex.rmExist((String) null);
      RMSIndex.rmExist((String) null);
      rMSIndex0.open();
      RMSIndex.rmExist("hey9tBX9ud*e^sQI");
      RMSIndex.rmExist("@F%`");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("^pqS6X/WstyN/jpD");
      RMSIndex.rmExist((String) null);
      rMSIndex0.open();
      byte[] byteArray0 = new byte[0];
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.load(byteArray0);
      rMSIndex0.delete(byteArray0);
      rMSIndex0.open();
      rMSIndex0.load((byte[]) null);
      rMSIndex0.keys();
      rMSIndex0.close();
      rMSIndex0.close();
      rMSIndex0.store(byteArray0, byteArray0);
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)107;
      rMSIndex0.load((byte[]) null);
      byteArray1[1] = (byte)12;
      rMSIndex0.store(byteArray0, byteArray1);
      rMSIndex0.getSizes();
      rMSIndex0.delete((byte[]) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RMSIndex.rmExist("");
      RMSIndex rMSIndex0 = new RMSIndex("");
      byte[] byteArray0 = new byte[1];
      rMSIndex0.store(byteArray0, byteArray0);
      byteArray0[0] = (byte) (-107);
      rMSIndex0.delete(byteArray0);
      rMSIndex0.getSizes();
      rMSIndex0.keys();
      rMSIndex0.keys();
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.keys();
      rMSIndex0.getSizes();
      rMSIndex0.open();
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte) (-107);
      byteArray1[1] = (byte) (-107);
      byteArray1[2] = (byte)1;
      rMSIndex0.load(byteArray1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex((String) null);
      rMSIndex0.keys();
      rMSIndex0.store((byte[]) null, (byte[]) null);
      rMSIndex0.keys();
      rMSIndex0.keys();
      rMSIndex0.getSizes();
      rMSIndex0.close();
      rMSIndex0.store((byte[]) null, (byte[]) null);
      rMSIndex0.getSizes();
      rMSIndex0.delete((byte[]) null);
      rMSIndex0.close();
      rMSIndex0.open();
      rMSIndex0.load((byte[]) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("X~4$2;P1WPavL&s7&W+", 255);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-66);
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)1;
      byteArray1[1] = (byte) (-66);
      byteArray1[2] = (byte)1;
      rMSIndex0.getSizes();
      rMSIndex0.getSizes();
      byteArray1[3] = (byte)1;
      byteArray1[4] = (byte) (-66);
      RMSIndex.rmExist("X~4$2;P1WPavL&s7&W+");
      byteArray1[5] = (byte)1;
      rMSIndex0.store(byteArray0, byteArray1);
      RMSIndex.rmExist("X~4$2;P1WPavL&s7&W+");
      rMSIndex0.load(byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", (-770));
      RMSIndex.Item rMSIndex_Item0 = rMSIndex0.new Item();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)119;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)8;
      byteArray0[5] = (byte) (-6);
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte)119;
      rMSIndex0.store(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("wW>)ev");
      rMSIndex0.getSizes();
      rMSIndex0.keys();
      rMSIndex0.open();
      RMSIndex.rmExist("rz)?QK");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-128);
      byteArray0[1] = (byte)64;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      rMSIndex0.store(byteArray0, byteArray0);
      RMSIndex.rmExist("wW>)ev");
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte) (-1);
      byteArray1[1] = (byte)75;
      rMSIndex0.getSizes();
      RMSIndex.rmExist("rz)?QK");
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)30;
      rMSIndex0.getSizes();
      rMSIndex0.close();
      byteArray1[4] = (byte)36;
      rMSIndex0.getSizes();
      byteArray1[5] = (byte)0;
      rMSIndex0.load(byteArray1);
      rMSIndex0.close();
      rMSIndex0.open();
      rMSIndex0.store((byte[]) null, (byte[]) null);
      rMSIndex0.open();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("Uv=.4A{");
      byte[] byteArray0 = new byte[0];
      rMSIndex0.load(byteArray0);
      rMSIndex0.delete(byteArray0);
      rMSIndex0.getSizes();
      rMSIndex0.keys();
      RMSIndex.rmExist("nUE");
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)63;
      rMSIndex0.delete((byte[]) null);
      byteArray1[1] = (byte)82;
      byteArray1[2] = (byte)113;
      byteArray1[3] = (byte)28;
      rMSIndex0.delete(byteArray1);
      rMSIndex0.delete(byteArray1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex((String) null, 336);
      byte[] byteArray0 = new byte[8];
      rMSIndex0.getSizes();
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)23;
      rMSIndex0.open();
      byteArray0[2] = (byte)37;
      rMSIndex0.keys();
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte) (-31);
      byteArray0[5] = (byte) (-66);
      rMSIndex0.open();
      rMSIndex0.open();
      rMSIndex0.delete(byteArray0);
      byteArray0[6] = (byte) (-45);
      byteArray0[7] = (byte)0;
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.close();
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.keys();
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.delete(byteArray0);
      rMSIndex0.keys();
      rMSIndex0.getSizes();
      rMSIndex0.load(byteArray0);
      rMSIndex0.getSizes();
      rMSIndex0.open();
      rMSIndex0.store(byteArray0, byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RMSIndex.rmExist("uM}S6");
      RMSIndex rMSIndex0 = new RMSIndex("uM}S6");
      rMSIndex0.keys();
      RMSIndex.rmExist("");
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)55;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-32);
      byteArray0[3] = (byte) (-104);
      byteArray0[4] = (byte) (-65);
      byteArray0[5] = (byte) (-62);
      byteArray0[6] = (byte)8;
      rMSIndex0.delete(byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      rMSIndex0.load(byteArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex((String) null);
      rMSIndex0.open();
      RMSIndex.rmExist((String) null);
      byte[] byteArray0 = new byte[2];
      rMSIndex0.open();
      rMSIndex0.load(byteArray0);
      rMSIndex0.open();
      byteArray0[0] = (byte)0;
      rMSIndex0.keys();
      rMSIndex0.delete(byteArray0);
      rMSIndex0.store(byteArray0, byteArray0);
      byteArray0[1] = (byte)0;
      RMSIndex.rmExist((String) null);
      rMSIndex0.getSizes();
      rMSIndex0.open();
      rMSIndex0.load(byteArray0);
      rMSIndex0.keys();
      rMSIndex0.delete(byteArray0);
      RMSIndex.rmExist((String) null);
      RMSIndex.rmExist("y[zF^*4fah`][W");
      rMSIndex0.getSizes();
      RMSIndex.rmExist("y[zF^*4fah`][W");
      rMSIndex0.keys();
      RMSIndex.rmExist("y[zF^*4fah`][W");
      rMSIndex0.open();
      rMSIndex0.delete((byte[]) null);
      rMSIndex0.load(byteArray0);
      rMSIndex0.getSizes();
      rMSIndex0.keys();
      rMSIndex0.getSizes();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", (-1170));
      byte[] byteArray0 = new byte[6];
      RMSIndex.rmExist("");
      byteArray0[0] = (byte)0;
      rMSIndex0.open();
      rMSIndex0.delete(byteArray0);
      byteArray0[1] = (byte) (-49);
      byteArray0[2] = (byte)94;
      rMSIndex0.keys();
      byteArray0[3] = (byte)12;
      rMSIndex0.getSizes();
      byteArray0[4] = (byte)85;
      rMSIndex0.load(byteArray0);
      byteArray0[5] = (byte) (-8);
      rMSIndex0.keys();
      rMSIndex0.load(byteArray0);
      rMSIndex0.open();
      rMSIndex0.open();
      rMSIndex0.getSizes();
      int[] intArray0 = rMSIndex0.getSizes();
      rMSIndex0.load(byteArray0);
      rMSIndex0.store((byte[]) null, (byte[]) null);
      rMSIndex0.store(byteArray0, byteArray0);
      int[] intArray1 = rMSIndex0.getSizes();
      assertFalse(intArray1.equals((Object)intArray0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("");
      byte[] byteArray0 = new byte[1];
      RMSIndex.rmExist("");
      rMSIndex0.delete(byteArray0);
      rMSIndex0.keys();
      RMSIndex.rmExist("");
      byteArray0[0] = (byte) (-108);
      rMSIndex0.close();
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.close();
      rMSIndex0.getSizes();
      RMSIndex.rmExist("");
      rMSIndex0.delete(byteArray0);
      rMSIndex0.getSizes();
      rMSIndex0.close();
      rMSIndex0.keys();
      rMSIndex0.keys();
      rMSIndex0.open();
      rMSIndex0.delete(byteArray0);
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.open();
      rMSIndex0.store(byteArray0, byteArray0);
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-108);
      byteArray1[1] = (byte) (-108);
      byteArray1[2] = (byte) (-108);
      byteArray1[3] = (byte)44;
      byteArray1[4] = (byte) (-108);
      rMSIndex0.delete(byteArray1);
      rMSIndex0.keys();
      rMSIndex0.open();
      rMSIndex0.keys();
      rMSIndex0.store(byteArray0, byteArray0);
      assertEquals(1, byteArray0.length);
  }
}
