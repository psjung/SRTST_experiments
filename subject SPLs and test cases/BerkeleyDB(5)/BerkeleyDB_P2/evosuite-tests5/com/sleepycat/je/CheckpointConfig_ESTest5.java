/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:19:36 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class CheckpointConfig_ESTest5 extends CheckpointConfig_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      int int0 = checkpointConfig0.getMinutes();
      assertEquals(0, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      checkpointConfig0.setMinutes((-2148));
      int int0 = checkpointConfig0.getMinutes();
      assertEquals((-2148), int0);
  }

  @Test
  public void test2()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      assertFalse(checkpointConfig0.getMinimizeRecoveryTime());
      
      checkpointConfig0.setMinimizeRecoveryTime(true);
      boolean boolean0 = checkpointConfig0.getMinimizeRecoveryTime();
      assertTrue(boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      checkpointConfig0.setKBytes(2173);
      int int0 = checkpointConfig0.getKBytes();
      assertEquals(2173, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      checkpointConfig0.setKBytes((-993));
      int int0 = checkpointConfig0.getKBytes();
      assertEquals((-993), int0);
  }

  @Test
  public void test5()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      assertFalse(checkpointConfig0.getForce());
      
      checkpointConfig0.setForce(true);
      boolean boolean0 = checkpointConfig0.getForce();
      assertTrue(boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      int int0 = checkpointConfig0.getMinutes();
      assertEquals(0, int0);
      assertEquals(0, checkpointConfig0.getKBytes());
      assertFalse(checkpointConfig0.getForce());
      assertFalse(checkpointConfig0.getMinimizeRecoveryTime());
  }

  @Test
  public void test7()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      boolean boolean0 = checkpointConfig0.getMinimizeRecoveryTime();
      assertFalse(checkpointConfig0.getForce());
      assertEquals(0, checkpointConfig0.getKBytes());
      assertFalse(boolean0);
      assertEquals(0, checkpointConfig0.getMinutes());
  }

  @Test
  public void test8()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      boolean boolean0 = checkpointConfig0.getForce();
      assertEquals(0, checkpointConfig0.getMinutes());
      assertEquals(0, checkpointConfig0.getKBytes());
      assertFalse(checkpointConfig0.getMinimizeRecoveryTime());
      assertFalse(boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      int int0 = checkpointConfig0.getKBytes();
      assertFalse(checkpointConfig0.getForce());
      assertEquals(0, int0);
      assertEquals(0, checkpointConfig0.getMinutes());
      assertFalse(checkpointConfig0.getMinimizeRecoveryTime());
  }
}
