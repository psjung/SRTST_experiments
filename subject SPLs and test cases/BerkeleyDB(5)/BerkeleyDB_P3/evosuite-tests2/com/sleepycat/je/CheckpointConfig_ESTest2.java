/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:53:45 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.CheckpointConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class CheckpointConfig_ESTest2 extends CheckpointConfig_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      checkpointConfig0.setMinutes(3134);
      int int0 = checkpointConfig0.getMinutes();
      assertEquals(3134, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      checkpointConfig0.setMinutes((-1));
      int int0 = checkpointConfig0.getMinutes();
      assertEquals((-1), int0);
  }

  @Test
  public void test04()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      boolean boolean0 = checkpointConfig0.getForce();
      assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      assertFalse(checkpointConfig0.getForce());
      
      checkpointConfig0.setForce(true);
      assertTrue(checkpointConfig0.getForce());
  }

  @Test
  public void test10()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      assertFalse(checkpointConfig0.getMinimizeRecoveryTime());
      
      checkpointConfig0.setMinimizeRecoveryTime(true);
      boolean boolean0 = checkpointConfig0.getMinimizeRecoveryTime();
      assertTrue(boolean0);
  }
}
