/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:17:20 KST 2017
 */

package com.sleepycat.je.recovery;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.Properties;
import java.util.logging.Level;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.latch.LatchException;
import com.sleepycat.je.tree.DIN;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.NameLN;
import com.sleepycat.je.tree.TreeLocation;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class RecoveryManager_ESTest5 extends RecoveryManager_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      treeLocation0.childLsn = (long) 0;
      treeLocation0.childLsn = (long) (byte)1;
      DIN dIN0 = new DIN();
      boolean boolean0 = RecoveryManager.hook592(treeLocation0, 0L, 1L, false, dIN0);
      //  // Unstable assertion: assertEquals(56L, dIN0.getGeneration());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      File file0 = null;
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      Level level0 = Level.FINER;
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      TreeLocation treeLocation0 = new TreeLocation();
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      // Undeclared exception!
      try { 
        RecoveryManager.hook584(level0, databaseImpl0, treeLocation0, (LN) null, (byte[]) null, (byte[]) null, (-1L), (-1L), false, recoveryInfo0, false, false, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RecoveryManager$RecoveryManager_trace", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        RecoveryManager.hook592(treeLocation0, (-1L), (-1L), true, dIN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.DbLsn", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      DIN dIN0 = new DIN();
      dIN0.latch();
      try { 
        RecoveryManager.hook592(treeLocation0, (-6L), (-1L), false, dIN0);
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // DIN0 already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      Level level0 = Level.INFO;
      TreeLocation treeLocation0 = new TreeLocation();
      DupCountLN dupCountLN0 = new DupCountLN();
      // Undeclared exception!
      try { 
        RecoveryManager.hook555(level0, (DatabaseImpl) null, treeLocation0, dupCountLN0, (-1L), (-1L), false, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RecoveryManager$RecoveryManager_trace", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      treeLocation0.childLsn = (long) 0;
      DIN dIN0 = new DIN();
      boolean boolean0 = RecoveryManager.hook592(treeLocation0, 0L, 0L, false, dIN0);
      assertTrue(dIN0.getDirty());
      assertTrue(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      treeLocation0.childLsn = (long) 0;
      DIN dIN0 = new DIN();
      boolean boolean0 = RecoveryManager.hook592(treeLocation0, (byte) (-65), 1L, false, dIN0);
      //  // Unstable assertion: assertEquals(0L, dIN0.getGeneration());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      Level level0 = Level.INFO;
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      TreeLocation treeLocation0 = new TreeLocation();
      DupCountLN dupCountLN0 = new DupCountLN(0);
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      // Undeclared exception!
      try { 
        RecoveryManager.hook584(level0, databaseImpl0, treeLocation0, dupCountLN0, (byte[]) null, (byte[]) null, (-1), (-1), true, recoveryInfo0, true, true, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RecoveryManager$RecoveryManager_trace", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      RecoveryManager.RecoveryManager_traceINDeleteReplay recoveryManager_RecoveryManager_traceINDeleteReplay0 = new RecoveryManager.RecoveryManager_traceINDeleteReplay((RecoveryManager) null, 1024L, 1024L, false, false, 65535, false);
      // Undeclared exception!
      try { 
        recoveryManager_RecoveryManager_traceINDeleteReplay0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RecoveryManager", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      RecoveryManager recoveryManager0 = null;
      try {
        recoveryManager0 = new RecoveryManager((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RecoveryManager", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Level level0 = Level.SEVERE;
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      // Undeclared exception!
      try { 
        RecoveryManager.traceRootDeletion(level0, databaseImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RecoveryManager$RecoveryManager_traceRootDeletion", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      TreeLocation treeLocation0 = new TreeLocation();
      // Undeclared exception!
      try { 
        RecoveryManager.hook595(databaseImpl0, treeLocation0, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RecoveryManager", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        RecoveryManager.hook592((TreeLocation) null, 0L, 0L, false, (DIN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RecoveryManager", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Level level0 = Level.ALL;
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      TreeLocation treeLocation0 = new TreeLocation();
      NameLN nameLN0 = new NameLN((DatabaseId) null);
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      // Undeclared exception!
      try { 
        RecoveryManager.undo(level0, databaseImpl0, treeLocation0, nameLN0, treeLocation0.lnKey, (byte[]) null, (byte) (-1), (byte)0, false, recoveryInfo0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RecoveryManager$RecoveryManager_trace", e);
      }
  }
}
