/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:25:27 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LogManager_ESTest3 extends LogManager_ESTest_scaffolding3 {

  @Test
  public void test1()  throws Throwable  {
      File file0 = null;
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl(file0, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      LogManager.LogManager_getLogEntryFromLogSource logManager_LogManager_getLogEntryFromLogSource0 = new LogManager.LogManager_getLogEntryFromLogSource((LogManager) null, (-18L), (LogSource) null);
      try { 
        logManager_LogManager_getLogEntryFromLogSource0.execute();
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.lang.NullPointerException
         //
         assertThrownBy("com.sleepycat.je.log.LogManager$LogManager_getLogEntryFromLogSource", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      LogManager.LogManager_getLogEntryFromLogSource logManager_LogManager_getLogEntryFromLogSource0 = new LogManager.LogManager_getLogEntryFromLogSource((LogManager) null, (-1780L), (LogSource) null);
      logManager_LogManager_getLogEntryFromLogSource0.hook508();
  }

  
}
