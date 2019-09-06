/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:49:11 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.PreloadStats;
import com.sleepycat.je.PreloadStatus;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class PreloadStats_ESTest4 extends PreloadStats_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      assertEquals(0, preloadStats0.nLNsLoaded);
      
      preloadStats0.setNLNsLoaded(1);
      int int0 = preloadStats0.getNLNsLoaded();
      assertEquals(1, preloadStats0.nLNsLoaded);
      assertEquals(1, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.setNINsLoaded((-4213));
      int int0 = preloadStats0.getNINsLoaded();
      assertEquals((-4213), preloadStats0.nINsLoaded);
      assertEquals((-4213), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      assertEquals(0, preloadStats0.nDupCountLNsLoaded);
      
      preloadStats0.setNDupCountLNsLoaded(1);
      int int0 = preloadStats0.getNDupCountLNsLoaded();
      assertEquals(1, preloadStats0.nDupCountLNsLoaded);
      assertEquals(1, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.nDINsLoaded = (-1249);
      int int0 = preloadStats0.getNDINsLoaded();
      assertEquals((-1249), int0);
  }

  @Test
  public void test04()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.nDBINsLoaded = (-1532);
      int int0 = preloadStats0.getNDBINsLoaded();
      assertEquals((-1532), int0);
  }

  @Test
  public void test05()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.nBINsLoaded = (-1);
      int int0 = preloadStats0.getNBINsLoaded();
      assertEquals((-1), int0);
  }

  @Test
  public void test06()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      assertEquals(0, preloadStats0.nDBINsLoaded);
      
      preloadStats0.nDBINsLoaded = 10;
      String string0 = preloadStats0.toString();
      assertEquals("status=PreloadStatus.SUCCESS\nnINsLoaded=0\nnBINsLoaded=0\nnLNsLoaded=0\nnDINsLoaded=0\nnDBINsLoaded=10\nnDupCountLNsLoaded=0\n", string0);
  }

  @Test
  public void test07()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      assertEquals(0, preloadStats0.nBINsLoaded);
      
      preloadStats0.nBINsLoaded = (-1);
      String string0 = preloadStats0.toString();
      assertEquals("status=PreloadStatus.SUCCESS\nnINsLoaded=0\nnBINsLoaded=-1\nnLNsLoaded=0\nnDINsLoaded=0\nnDBINsLoaded=0\nnDupCountLNsLoaded=0\n", string0);
  }

  @Test
  public void test08()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.setNDupCountLNsLoaded((-1143));
      preloadStats0.toString();
      assertEquals((-1143), preloadStats0.nDupCountLNsLoaded);
  }

  @Test
  public void test09()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.setNLNsLoaded((-1143));
      preloadStats0.toString();
      assertEquals((-1143), preloadStats0.nLNsLoaded);
  }

  @Test
  public void test10()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.setNDINsLoaded(2046);
      preloadStats0.toString();
      assertEquals(2046, preloadStats0.nDINsLoaded);
  }

  @Test
  public void test11()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.nDBINsLoaded = 10;
      int int0 = preloadStats0.getNDBINsLoaded();
      assertEquals(10, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.setNDINsLoaded(2687);
      int int0 = preloadStats0.getNDINsLoaded();
      assertEquals(2687, preloadStats0.nDINsLoaded);
      assertEquals(2687, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.nBINsLoaded = 2046;
      int int0 = preloadStats0.getNBINsLoaded();
      assertEquals(2046, int0);
  }

  @Test
  public void test14()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.setNDINsLoaded((-1));
      int int0 = preloadStats0.getNBINsLoaded();
      assertEquals((-1), preloadStats0.nDINsLoaded);
      assertEquals(0, int0);
  }

  @Test
  public void test15()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.setNINsLoaded(2647);
      int int0 = preloadStats0.getNINsLoaded();
      assertEquals(2647, preloadStats0.nINsLoaded);
      assertEquals(2647, int0);
  }

  @Test
  public void test16()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      int int0 = preloadStats0.getNLNsLoaded();
      assertEquals(0, preloadStats0.nBINsLoaded);
      assertEquals(0, preloadStats0.nDupCountLNsLoaded);
      assertEquals(0, int0);
      assertEquals(0, preloadStats0.nDBINsLoaded);
      assertEquals(0, preloadStats0.nINsLoaded);
      assertEquals(0, preloadStats0.nDINsLoaded);
  }

  @Test
  public void test17()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.setNDBINsLoaded((-1249));
      assertEquals((-1249), preloadStats0.nDBINsLoaded);
  }

  @Test
  public void test18()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.setNDupCountLNsLoaded((-1143));
      int int0 = preloadStats0.getNDupCountLNsLoaded();
      assertEquals((-1143), preloadStats0.nDupCountLNsLoaded);
      assertEquals((-1143), int0);
  }

  @Test
  public void test19()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      int int0 = preloadStats0.getNDBINsLoaded();
      assertEquals(0, preloadStats0.nLNsLoaded);
      assertEquals(0, preloadStats0.nINsLoaded);
      assertEquals(0, preloadStats0.nBINsLoaded);
      assertEquals(0, preloadStats0.nDINsLoaded);
      assertEquals(0, preloadStats0.nDupCountLNsLoaded);
      assertEquals(0, int0);
  }

  @Test
  public void test20()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.setNLNsLoaded((-1143));
      int int0 = preloadStats0.getNLNsLoaded();
      assertEquals((-1143), preloadStats0.nLNsLoaded);
      assertEquals((-1143), int0);
  }

  @Test
  public void test21()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.setStatus((PreloadStatus) null);
      PreloadStatus preloadStatus0 = preloadStats0.getStatus();
      assertNull(preloadStatus0);
      assertEquals(0, preloadStats0.nBINsLoaded);
      assertEquals(0, preloadStats0.nDINsLoaded);
      assertEquals(0, preloadStats0.nINsLoaded);
      assertEquals(0, preloadStats0.nLNsLoaded);
      assertEquals(0, preloadStats0.nDupCountLNsLoaded);
      assertEquals(0, preloadStats0.nDBINsLoaded);
  }

  @Test
  public void test22()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.getStatus();
      assertEquals(0, preloadStats0.nBINsLoaded);
      assertEquals(0, preloadStats0.nLNsLoaded);
      assertEquals(0, preloadStats0.nDBINsLoaded);
      assertEquals(0, preloadStats0.nDupCountLNsLoaded);
      assertEquals(0, preloadStats0.nINsLoaded);
      assertEquals(0, preloadStats0.nDINsLoaded);
  }

  @Test
  public void test23()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      int int0 = preloadStats0.getNINsLoaded();
      assertEquals(0, preloadStats0.nDupCountLNsLoaded);
      assertEquals(0, preloadStats0.nDINsLoaded);
      assertEquals(0, preloadStats0.nLNsLoaded);
      assertEquals(0, preloadStats0.nDBINsLoaded);
      assertEquals(0, int0);
      assertEquals(0, preloadStats0.nBINsLoaded);
  }

  @Test
  public void test24()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      int int0 = preloadStats0.getNDINsLoaded();
      assertEquals(0, preloadStats0.nINsLoaded);
      assertEquals(0, preloadStats0.nLNsLoaded);
      assertEquals(0, int0);
      assertEquals(0, preloadStats0.nDupCountLNsLoaded);
      assertEquals(0, preloadStats0.nBINsLoaded);
      assertEquals(0, preloadStats0.nDBINsLoaded);
  }

  @Test
  public void test25()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      int int0 = preloadStats0.getNDupCountLNsLoaded();
      assertEquals(0, int0);
      assertEquals(0, preloadStats0.nLNsLoaded);
      assertEquals(0, preloadStats0.nINsLoaded);
      assertEquals(0, preloadStats0.nDBINsLoaded);
      assertEquals(0, preloadStats0.nDINsLoaded);
      assertEquals(0, preloadStats0.nBINsLoaded);
  }

  @Test
  public void test26()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      preloadStats0.setNBINsLoaded(2687);
      assertEquals(2687, preloadStats0.nBINsLoaded);
  }
}
