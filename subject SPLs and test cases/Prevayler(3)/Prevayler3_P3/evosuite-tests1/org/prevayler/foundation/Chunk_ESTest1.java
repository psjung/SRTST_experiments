/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:14:39 KST 2017
 */

package org.prevayler.foundation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Chunk_ESTest1 extends Chunk_ESTest_scaffolding1 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void clearEvoSuiteFramework() {
String a = "aa";
}

  @Test
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Chunk chunk0 = new Chunk(byteArray0, (Map) null);
      Map map0 = chunk0.getParameters();
      assertNull(map0);
  }

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Chunk chunk0 = new Chunk(byteArray0, (Map) hashMap0);
      chunk0.setParameter("D4i]Ef", "D4i]Ef");
      String string0 = chunk0.getParameter("D4i]Ef");
      assertEquals("D4i]Ef", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Chunk chunk0 = new Chunk(byteArray0);
      byte[] byteArray1 = chunk0.getBytes();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Chunk chunk0 = new Chunk(byteArray0, (Map) hashMap0);
      byte[] byteArray1 = chunk0.getBytes();
      assertSame(byteArray0, byteArray1);
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Chunk chunk0 = new Chunk(byteArray0, (Map) hashMap0);
      chunk0.setParameter("^[`|{FY", "D4i]Ef");
  }

  @Test
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Chunk chunk0 = new Chunk(byteArray0, (Map) null);
      // Undeclared exception!
      try { 
        chunk0.setParameter((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.Chunk", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Chunk chunk0 = new Chunk(byteArray0, (Map) null);
      // Undeclared exception!
      try { 
        chunk0.getParameter((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.Chunk", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Chunk chunk0 = new Chunk(byteArray0, (Map) hashMap0);
      String string0 = chunk0.getParameter("D4i]Ef");
      assertNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      Chunk chunk0 = new Chunk((byte[]) null);
      Map map0 = chunk0.getParameters();
      assertEquals(0, map0.size());
  }

  @Test
  public void test9()  throws Throwable  {
      Chunk chunk0 = new Chunk((byte[]) null);
      byte[] byteArray0 = chunk0.getBytes();
      assertNull(byteArray0);
  }
}
