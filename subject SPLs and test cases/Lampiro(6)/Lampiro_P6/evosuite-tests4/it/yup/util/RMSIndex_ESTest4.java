/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 15:59:51 KST 2018
 */

package it.yup.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RMSIndex_ESTest4 extends RMSIndex_ESTest_scaffolding4 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("");
      byte[] byteArray0 = new byte[2];
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.load(byteArray0);
      rMSIndex0.close();
      rMSIndex0.delete(byteArray0);
      byteArray0[0] = (byte)127;
      RMSIndex.rmExist("");
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte)57;
      byteArray1[1] = (byte)57;
      byteArray1[2] = (byte)57;
      byte[] byteArray2 = new byte[2];
      byteArray2[0] = (byte)127;
      byteArray2[1] = (byte)57;
      rMSIndex0.store(byteArray1, byteArray2);
      byteArray0[1] = (byte)57;
      rMSIndex0.close();
      rMSIndex0.delete(byteArray0);
      rMSIndex0.close();
      rMSIndex0.keys();
      rMSIndex0.delete(byteArray0);
      rMSIndex0.keys();
      rMSIndex0.load(byteArray0);
      rMSIndex0.close();
      rMSIndex0.delete(byteArray0);
      rMSIndex0.getSizes();
      rMSIndex0.load(byteArray2);
      rMSIndex0.store(byteArray0, (byte[]) null);
      rMSIndex0.keys();
      rMSIndex0.close();
      rMSIndex0.store((byte[]) null, (byte[]) null);
      rMSIndex0.delete((byte[]) null);
      rMSIndex0.delete(byteArray0);
      rMSIndex0.load(byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex((String) null, 64535);
      RMSIndex.Item rMSIndex_Item0 = rMSIndex0.new Item();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("e/&T!rOX4)_<");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-37);
      byteArray0[1] = (byte)29;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-48);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-89);
      byteArray0[7] = (byte)25;
      rMSIndex0.store(byteArray0, byteArray0);
      byte[] byteArray1 = new byte[5];
      rMSIndex0.open();
      rMSIndex0.keys();
      byteArray1[0] = (byte) (-78);
      rMSIndex0.delete(byteArray1);
      rMSIndex0.close();
      rMSIndex0.store(byteArray1, byteArray1);
      byteArray1[1] = (byte) (-59);
      rMSIndex0.close();
      byteArray1[2] = (byte) (-109);
      rMSIndex0.keys();
      RMSIndex.rmExist("");
      byteArray1[3] = (byte) (-61);
      rMSIndex0.load(byteArray1);
      rMSIndex0.load(byteArray1);
      rMSIndex0.open();
      rMSIndex0.close();
      rMSIndex0.store(byteArray1, byteArray1);
      byteArray1[4] = (byte) (-1);
      rMSIndex0.delete(byteArray1);
      rMSIndex0.delete(byteArray1);
      RMSIndex.rmExist("");
      RMSIndex.rmExist("");
      rMSIndex0.load((byte[]) null);
      rMSIndex0.store((byte[]) null, (byte[]) null);
      rMSIndex0.keys();
      rMSIndex0.keys();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("L");
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      rMSIndex0.open();
      byteArray0[1] = (byte) (-61);
      byteArray0[2] = (byte)107;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.delete((byte[]) null);
      rMSIndex0.close();
      RMSIndex.rmExist("'eMnP-Uk>Ew1%1`n");
      rMSIndex0.close();
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte) (-61);
      byteArray1[2] = (byte)0;
      rMSIndex0.load(byteArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 770);
      rMSIndex0.open();
      rMSIndex0.getSizes();
      byte[] byteArray0 = new byte[1];
      rMSIndex0.getSizes();
      byte[] byteArray1 = new byte[5];
      rMSIndex0.open();
      byteArray1[0] = (byte)0;
      RMSIndex.rmExist("");
      byteArray1[1] = (byte)0;
      rMSIndex0.getSizes();
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)0;
      rMSIndex0.delete(byteArray1);
      byteArray0[0] = (byte)0;
      rMSIndex0.close();
      rMSIndex0.delete(byteArray0);
      rMSIndex0.getSizes();
      rMSIndex0.getSizes();
      rMSIndex0.open();
      byte[] byteArray2 = new byte[0];
      rMSIndex0.store(byteArray2, byteArray2);
      rMSIndex0.store(byteArray0, byteArray1);
      RMSIndex.rmExist("");
      rMSIndex0.keys();
      rMSIndex0.getSizes();
      rMSIndex0.getSizes();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("7[(");
      rMSIndex0.close();
      rMSIndex0.close();
      byte[] byteArray0 = new byte[1];
      RMSIndex.rmExist("l::Bo");
      rMSIndex0.open();
      byteArray0[0] = (byte)0;
      rMSIndex0.store((byte[]) null, byteArray0);
      rMSIndex0.close();
      rMSIndex0.load(byteArray0);
      rMSIndex0.close();
      rMSIndex0.getSizes();
      rMSIndex0.delete((byte[]) null);
      RMSIndex.rmExist("7[(");
      rMSIndex0.open();
      rMSIndex0.store(byteArray0, (byte[]) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)1;
      rMSIndex0.load(byteArray0);
      rMSIndex0.open();
      rMSIndex0.load(byteArray0);
      byteArray0[1] = (byte)0;
      rMSIndex0.delete(byteArray0);
      RMSIndex.rmExist("utf-8");
      byte[] byteArray1 = new byte[0];
      rMSIndex0.store(byteArray1, byteArray1);
      rMSIndex0.getSizes();
      rMSIndex0.open();
      byte[] byteArray2 = new byte[2];
      byteArray2[0] = (byte)1;
      byteArray2[1] = (byte)1;
      rMSIndex0.delete(byteArray2);
      rMSIndex0.close();
      rMSIndex0.delete(byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 1609);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.keys();
      rMSIndex0.getSizes();
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)0;
      byteArray1[5] = (byte)6;
      byteArray1[6] = (byte)0;
      rMSIndex0.delete(byteArray1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 4);
      byte[] byteArray0 = new byte[1];
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.keys();
      rMSIndex0.getSizes();
      byteArray0[0] = (byte)80;
      rMSIndex0.delete(byteArray0);
      rMSIndex0.open();
      rMSIndex0.getSizes();
      RMSIndex.rmExist("");
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.close();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("*vP-U}FK1C)>F");
      RMSIndex.RecordType rMSIndex_RecordType0 = rMSIndex0.new RecordType();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RMSIndex.rmExist("e$U<?^bbS)ySK");
      RMSIndex rMSIndex0 = new RMSIndex("y%L}9_MO8w", 1);
      byte[] byteArray0 = new byte[2];
      RMSIndex.rmExist("e$U<?^bbS)ySK");
      rMSIndex0.close();
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)3;
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.store(byteArray0, byteArray0);
      rMSIndex0.getSizes();
      rMSIndex0.close();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("%sz>PY+;|y'`/c!C");
      RMSIndex.rmExist("%sz>PY+;|y'`/c!C");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)91;
      byteArray0[1] = (byte)73;
      rMSIndex0.close();
      RMSIndex.rmExist("");
      rMSIndex0.close();
      rMSIndex0.store(byteArray0, byteArray0);
      byteArray0[2] = (byte) (-21);
      rMSIndex0.keys();
      RMSIndex.rmExist("@hBJ~X");
      rMSIndex0.store(byteArray0, byteArray0);
      byteArray0[3] = (byte)0;
      rMSIndex0.load(byteArray0);
      rMSIndex0.getSizes();
      rMSIndex0.delete((byte[]) null);
      rMSIndex0.keys();
      RMSIndex.rmExist("jS''");
      rMSIndex0.close();
      RMSIndex.rmExist("jS''");
      rMSIndex0.load((byte[]) null);
      rMSIndex0.open();
      rMSIndex0.load((byte[]) null);
      rMSIndex0.close();
      rMSIndex0.getSizes();
      rMSIndex0.open();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("", 0);
      rMSIndex0.keys();
      rMSIndex0.getSizes();
      rMSIndex0.getSizes();
      rMSIndex0.close();
      rMSIndex0.getSizes();
      rMSIndex0.close();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("");
      byte[] byteArray0 = new byte[2];
      rMSIndex0.keys();
      byteArray0[0] = (byte) (-73);
      byteArray0[1] = (byte)0;
      rMSIndex0.store(byteArray0, byteArray0);
      byte[] byteArray1 = new byte[5];
      rMSIndex0.getSizes();
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte) (-47);
      rMSIndex0.close();
      byteArray1[2] = (byte)0;
      RMSIndex.rmExist("");
      rMSIndex0.close();
      byteArray1[3] = (byte) (-120);
      byteArray1[4] = (byte)90;
      rMSIndex0.store(byteArray1, byteArray1);
      rMSIndex0.close();
      rMSIndex0.delete(byteArray0);
      rMSIndex0.load(byteArray0);
      rMSIndex0.store(byteArray0, (byte[]) null);
      rMSIndex0.load(byteArray0);
      rMSIndex0.open();
      rMSIndex0.delete((byte[]) null);
      rMSIndex0.delete(byteArray0);
      rMSIndex0.load(byteArray0);
      rMSIndex0.store(byteArray0, (byte[]) null);
      rMSIndex0.keys();
      rMSIndex0.keys();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RMSIndex rMSIndex0 = new RMSIndex("G[Kz,6\"", (-379));
      RMSIndex.rmExist("");
      rMSIndex0.getSizes();
      rMSIndex0.open();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-70);
      byteArray0[1] = (byte)17;
      byteArray0[2] = (byte)0;
      rMSIndex0.getSizes();
      rMSIndex0.close();
      rMSIndex0.delete(byteArray0);
      rMSIndex0.open();
      rMSIndex0.getSizes();
      rMSIndex0.keys();
      rMSIndex0.open();
      rMSIndex0.getSizes();
      rMSIndex0.keys();
      RMSIndex.rmExist("");
      rMSIndex0.getSizes();
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)17;
      byteArray1[4] = (byte)17;
      byteArray1[5] = (byte)3;
      byteArray1[6] = (byte) (-14);
      byteArray1[7] = (byte) (-70);
      byteArray1[8] = (byte)17;
      rMSIndex0.store(byteArray0, byteArray1);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RMSIndex.rmExist("");
      RMSIndex rMSIndex0 = new RMSIndex("", (-360));
      rMSIndex0.keys();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-17);
      byteArray0[2] = (byte)0;
      byte[] byteArray1 = rMSIndex0.load(byteArray0);
      assertNull(byteArray1);
  }
}
