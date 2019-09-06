/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:10:54 KST 2017
 */

package com.sleepycat.je.recovery;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.CheckpointConfig;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.DbConfigManager;
import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Checkpointer_ESTest1 extends Checkpointer_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[6];
      Checkpointer.CheckpointReference checkpointer_CheckpointReference0 = new Checkpointer.CheckpointReference(databaseImpl0, 1L, true, true, byteArray0, byteArray0);
      checkpointer_CheckpointReference0.nodeId = (long) (byte)31;
      Checkpointer.CheckpointReference checkpointer_CheckpointReference1 = new Checkpointer.CheckpointReference(databaseImpl0, 1L, true, true, byteArray0, byteArray0);
      boolean boolean0 = checkpointer_CheckpointReference0.equals(checkpointer_CheckpointReference1);
      //  // Unstable assertion: assertEquals(108L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = new byte[2];
      Checkpointer.CheckpointReference checkpointer_CheckpointReference0 = new Checkpointer.CheckpointReference(databaseImpl0, 1573L, false, false, byteArray0, byteArray1);
      //  // Unstable assertion: assertEquals(90L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[0];
      Checkpointer.CheckpointReference checkpointer_CheckpointReference0 = new Checkpointer.CheckpointReference(databaseImpl0, (-239L), true, false, byteArray0, byteArray0);
      //  // Unstable assertion: assertEquals(72L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test03()  throws Throwable  {
      EnvironmentImpl environmentImpl0 = null;
      Checkpointer checkpointer0 = null;
      try {
        checkpointer0 = new Checkpointer((EnvironmentImpl) null, 3070L, "g)YGS!8#[ FQv;I6!$");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Checkpointer.Checkpointer_selectDirtyINs checkpointer_Checkpointer_selectDirtyINs0 = new Checkpointer.Checkpointer_selectDirtyINs((Checkpointer) null, true, true);
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_selectDirtyINs0.hook530();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer$Checkpointer_selectDirtyINs", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      Checkpointer.Checkpointer_selectDirtyINs checkpointer_Checkpointer_selectDirtyINs0 = new Checkpointer.Checkpointer_selectDirtyINs((Checkpointer) null, false, false);
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_selectDirtyINs0.hook528();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer$Checkpointer_selectDirtyINs", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, true, "_|*TW=");
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_doCheckpoint0.hook525();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, true, "");
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_doCheckpoint0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[6];
      Checkpointer.CheckpointReference checkpointer_CheckpointReference0 = new Checkpointer.CheckpointReference(databaseImpl0, 1L, true, true, byteArray0, byteArray0);
      checkpointer_CheckpointReference0.nodeId = (long) (byte) (-3);
      Checkpointer.CheckpointReference checkpointer_CheckpointReference1 = new Checkpointer.CheckpointReference(databaseImpl0, 1L, true, true, byteArray0, byteArray0);
      boolean boolean0 = checkpointer_CheckpointReference0.equals(checkpointer_CheckpointReference1);
      //  // Unstable assertion: assertEquals(47L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[8];
      Checkpointer.CheckpointReference checkpointer_CheckpointReference0 = new Checkpointer.CheckpointReference(databaseImpl0, 1573L, false, false, byteArray0, byteArray0);
      boolean boolean0 = checkpointer_CheckpointReference0.equals(byteArray0);
      //  // Unstable assertion: assertEquals(27L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      Checkpointer.Checkpointer_selectDirtyINs checkpointer_Checkpointer_selectDirtyINs0 = new Checkpointer.Checkpointer_selectDirtyINs((Checkpointer) null, false, true);
      checkpointer_Checkpointer_selectDirtyINs0.hook554();
  }

  @Test
  public void test11()  throws Throwable  {
      Checkpointer.Checkpointer_selectDirtyINs checkpointer_Checkpointer_selectDirtyINs0 = new Checkpointer.Checkpointer_selectDirtyINs((Checkpointer) null, true, true);
      checkpointer_Checkpointer_selectDirtyINs0.hook529();
  }

  @Test
  public void test12()  throws Throwable  {
      Checkpointer.Checkpointer_selectDirtyINs checkpointer_Checkpointer_selectDirtyINs0 = new Checkpointer.Checkpointer_selectDirtyINs((Checkpointer) null, true, true);
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_selectDirtyINs0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Checkpointer.Checkpointer_selectDirtyINs checkpointer_Checkpointer_selectDirtyINs0 = new Checkpointer.Checkpointer_selectDirtyINs((Checkpointer) null, false, true);
      checkpointer_Checkpointer_selectDirtyINs0.hook553();
  }

  @Test
  public void test14()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      long long0 = Checkpointer.getWakeupPeriod(dbConfigManager0);
      assertEquals(0L, long0);
  }

  @Test
  public void test15()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_isRunnable checkpointer_Checkpointer_isRunnable0 = new Checkpointer.Checkpointer_isRunnable((Checkpointer) null, checkpointConfig0);
      boolean boolean0 = checkpointer_Checkpointer_isRunnable0.execute();
      assertFalse(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_isRunnable checkpointer_Checkpointer_isRunnable0 = new Checkpointer.Checkpointer_isRunnable((Checkpointer) null, checkpointConfig0);
      checkpointer_Checkpointer_isRunnable0.hook543();
  }

  @Test
  public void test17()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, false, "");
      checkpointer_Checkpointer_doCheckpoint0.hook549();
  }

  @Test
  public void test18()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, true, "g)YGS!8#[ FQv;I6!$");
      checkpointer_Checkpointer_doCheckpoint0.hook548();
  }

  @Test
  public void test19()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, false, "jF-qC)9iHiA(");
      checkpointer_Checkpointer_doCheckpoint0.hook536();
  }

  @Test
  public void test20()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, false, "4&;O-],Vw");
      checkpointer_Checkpointer_doCheckpoint0.hook534();
  }

  @Test
  public void test21()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, false, "@  bCdaxLMPyd");
      checkpointer_Checkpointer_doCheckpoint0.hook535();
  }

  @Test
  public void test22()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, true, "<");
      checkpointer_Checkpointer_doCheckpoint0.hook523();
  }

  @Test
  public void test23()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, false, "S\u0004%vQuc8?+>");
      checkpointer_Checkpointer_doCheckpoint0.hook522();
  }

  @Test
  public void test24()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, false, "^6FU=KZaq_O;Bi4N");
      checkpointer_Checkpointer_doCheckpoint0.hook524();
  }

  @Test
  public void test25()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, true, "s");
      checkpointer_Checkpointer_doCheckpoint0.hook550();
  }

  @Test
  public void test26()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, true, "Can't replace a duplicate with different data.");
      checkpointer_Checkpointer_doCheckpoint0.hook551();
  }

  @Test
  public void test27()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, true, "<");
      checkpointer_Checkpointer_doCheckpoint0.hook552();
  }

  @Test
  public void test28()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[6];
      Checkpointer.CheckpointReference checkpointer_CheckpointReference0 = new Checkpointer.CheckpointReference(databaseImpl0, 1L, true, true, byteArray0, byteArray0);
      boolean boolean0 = checkpointer_CheckpointReference0.equals(checkpointer_CheckpointReference0);
      //  // Unstable assertion: assertEquals(1L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertTrue(boolean0);
  }
}
