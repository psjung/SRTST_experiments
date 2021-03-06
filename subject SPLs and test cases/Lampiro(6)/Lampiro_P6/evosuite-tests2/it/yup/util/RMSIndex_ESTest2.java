/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 11:51:25 KST 2018
 */

package it.yup.util;

import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RMSIndex_ESTest2 extends RMSIndex_ESTest_scaffolding2 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("utf-8", 0);
      RMSIndex.RecordType rMSIndex_RecordType0 = rMSIndex0.new RecordType();
      rMSIndex0.getSizes();
      rMSIndex0.close();
      rMSIndex0.open();
      rMSIndex0.keys();
      RMSIndex.rmExist("utf-8");
      byte[] byteArray0 = new byte[0];
      rMSIndex0.delete(byteArray0);
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.open();
      rMSIndex0.load(byteArray0);
      rMSIndex0.keys();
      rMSIndex0.getSizes();
      rMSIndex0.getSizes();
      rMSIndex0.store(byteArray0, (byte[]) null);
      rMSIndex0.close();
      rMSIndex0.delete((byte[]) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex((String) null);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      rMSIndex0.getSizes();
      rMSIndex0.getSizes();
      byteArray0[2] = (byte) (-37);
      rMSIndex0.keys();
      rMSIndex0.getSizes();
      byteArray0[3] = (byte) (-127);
      rMSIndex0.load(byteArray0);
      rMSIndex0.open();
      rMSIndex0.close();
      rMSIndex0.keys();
      rMSIndex0.getSizes();
      rMSIndex0.keys();
      rMSIndex0.store((byte[]) null, byteArray0);
      RMSIndex.rmExist((String) null);
      rMSIndex0.delete(byteArray0);
      rMSIndex0.keys();
      rMSIndex0.close();
      rMSIndex0.close();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("P fz5{RN,x");
      rMSIndex0.keys();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)82;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.close();
      rMSIndex0.load((byte[]) null);
      rMSIndex0.keys();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("A2|-)c/W[i<}titB", 1);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)57;
      byteArray0[2] = (byte)1;
      rMSIndex0.store(byteArray0, byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("q=2AM'VJ");
      byte[] byteArray0 = new byte[0];
      rMSIndex0.store(byteArray0, byteArray0);
      byte[] byteArray1 = new byte[0];
      RMSIndex.rmExist("q=2AM'VJ");
      rMSIndex0.delete(byteArray1);
      rMSIndex0.load(byteArray1);
      rMSIndex0.store(byteArray1, byteArray1);
      rMSIndex0.delete(byteArray1);
      rMSIndex0.getSizes();
      rMSIndex0.keys();
      rMSIndex0.close();
      rMSIndex0.keys();
      rMSIndex0.close();
      rMSIndex0.getSizes();
      rMSIndex0.load(byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex(":,6W");
      RMSIndex.rmExist((String) null);
      rMSIndex0.keys();
      RMSIndex.RecordType rMSIndex_RecordType0 = rMSIndex0.new RecordType();
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)0;
      byteArray1[5] = (byte)0;
      byteArray1[6] = (byte)0;
      rMSIndex0.store(byteArray0, byteArray1);
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)97;
      rMSIndex0.load(byteArray0);
      rMSIndex0.close();
      rMSIndex0.open();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("utf-8", 1361);
      rMSIndex0.open();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)13;
      rMSIndex0.store(byteArray0, byteArray0);
      byteArray0[1] = (byte)123;
      byteArray0[2] = (byte)18;
      byteArray0[3] = (byte)72;
      byteArray0[4] = (byte) (-94);
      rMSIndex0.open();
      rMSIndex0.keys();
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      rMSIndex0.store(byteArray0, byteArray0);
      byteArray0[7] = (byte) (-63);
      byteArray0[8] = (byte)98;
      rMSIndex0.load(byteArray0);
      byte[] byteArray1 = new byte[0];
      rMSIndex0.store(byteArray1, byteArray1);
      RMSIndex.rmExist("utf-8");
      rMSIndex0.store(byteArray0, byteArray1);
      rMSIndex0.open();
      rMSIndex0.open();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("S.8Z#u8.");
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      rMSIndex0.store(byteArray0, byteArray0);
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte)30;
      rMSIndex0.delete(byteArray1);
      rMSIndex0.keys();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("2PWXIq:fA");
      rMSIndex0.keys();
      rMSIndex0.keys();
      RMSIndex.Item rMSIndex_Item0 = rMSIndex0.new Item();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex((String) null);
      rMSIndex0.load((byte[]) null);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)102;
      byteArray0[3] = (byte) (-25);
      rMSIndex0.delete((byte[]) null);
      byteArray0[4] = (byte) (-118);
      byteArray0[5] = (byte)0;
      rMSIndex0.store(byteArray0, (byte[]) null);
      rMSIndex0.keys();
      rMSIndex0.keys();
      rMSIndex0.keys();
      rMSIndex0.open();
      rMSIndex0.open();
      RMSIndex.rmExist((String) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex((String) null);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-54);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-26);
      rMSIndex0.store(byteArray0, byteArray0);
      byte[] byteArray1 = new byte[3];
      rMSIndex0.load(byteArray1);
      byteArray1[0] = (byte) (-35);
      rMSIndex0.load(byteArray1);
      rMSIndex0.delete((byte[]) null);
      byteArray1[1] = (byte) (-13);
      rMSIndex0.store(byteArray1, byteArray1);
      byteArray1[2] = (byte) (-88);
      rMSIndex0.delete(byteArray1);
      RMSIndex.RecordType rMSIndex_RecordType0 = rMSIndex0.new RecordType();
      rMSIndex0.getSizes();
      rMSIndex0.keys();
      rMSIndex0.open();
      rMSIndex0.delete(byteArray1);
      rMSIndex0.delete(byteArray1);
      rMSIndex0.store(byteArray1, byteArray1);
      rMSIndex0.getSizes();
      rMSIndex0.delete(byteArray1);
      rMSIndex0.load(byteArray1);
      RMSIndex.rmExist((String) null);
      rMSIndex0.delete((byte[]) null);
      rMSIndex0.close();
      rMSIndex0.getSizes();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("");
      rMSIndex0.getSizes();
      rMSIndex0.open();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)24;
      rMSIndex0.open();
      byteArray0[1] = (byte)101;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)1;
      rMSIndex0.delete(byteArray0);
      rMSIndex0.getSizes();
      rMSIndex0.open();
      rMSIndex0.close();
      rMSIndex0.open();
      rMSIndex0.delete(byteArray0);
      rMSIndex0.open();
      RMSIndex.rmExist("");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("");
      rMSIndex0.open();
      RMSIndex.rmExist("");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)127;
      byteArray0[1] = (byte)22;
      byteArray0[2] = (byte) (-34);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-2);
      rMSIndex0.store(byteArray0, byteArray0);
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte) (-26);
      byteArray1[1] = (byte)98;
      rMSIndex0.load(byteArray1);
      rMSIndex0.store(byteArray1, byteArray1);
      rMSIndex0.close();
      rMSIndex0.close();
      rMSIndex0.close();
      rMSIndex0.close();
      rMSIndex0.close();
      RMSIndex.rmExist("");
      rMSIndex0.open();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("0N-,d\".#_4", 0);
      byte[] byteArray0 = new byte[9];
      rMSIndex0.store(byteArray0, byteArray0);
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)72;
      byteArray0[2] = (byte) (-95);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)1;
      byteArray0[7] = (byte)0;
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte) (-1);
      byteArray1[1] = (byte)1;
      byteArray1[2] = (byte) (-1);
      byteArray1[3] = (byte) (-95);
      byteArray1[4] = (byte)72;
      byteArray1[5] = (byte) (-95);
      byteArray1[6] = (byte)0;
      byteArray1[7] = (byte)0;
      byteArray1[8] = (byte)72;
      rMSIndex0.load(byteArray1);
      byteArray0[8] = (byte)22;
      rMSIndex0.load(byteArray0);
      rMSIndex0.keys();
      rMSIndex0.close();
      rMSIndex0.open();
      rMSIndex0.open();
      rMSIndex0.open();
      rMSIndex0.open();
      rMSIndex0.getSizes();
      rMSIndex0.getSizes();
      rMSIndex0.close();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("4G", 0);
      rMSIndex0.close();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-117);
      byteArray0[1] = (byte) (-43);
      byteArray0[2] = (byte) (-63);
      byteArray0[3] = (byte)63;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      rMSIndex0.load(byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", (-1041));
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)63;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)54;
      rMSIndex0.delete(byteArray0);
      RMSIndex.rmExist("");
      rMSIndex0.open();
      rMSIndex0.close();
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-110);
      byteArray1[1] = (byte) (-28);
      rMSIndex0.store(byteArray1, byteArray1);
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)10;
      byteArray1[4] = (byte)39;
      rMSIndex0.delete(byteArray1);
      rMSIndex0.getSizes();
      byte[] byteArray2 = rMSIndex0.load(byteArray1);
      assertNull(byteArray2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("2GZ]6L:hVQinR!/", 8);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-84);
      byte[] byteArray1 = rMSIndex0.load(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("");
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-31);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)87;
      byteArray0[4] = (byte)25;
      byte[] byteArray1 = rMSIndex0.load(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 1910);
  }
}
