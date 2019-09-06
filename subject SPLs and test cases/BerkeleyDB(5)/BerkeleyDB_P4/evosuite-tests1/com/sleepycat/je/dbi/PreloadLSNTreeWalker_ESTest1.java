/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:32:09 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.PreloadConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class PreloadLSNTreeWalker_ESTest1 extends PreloadLSNTreeWalker_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      DatabaseImpl databaseImpl0 = null;
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PreloadConfig preloadConfig0 = new PreloadConfig();
      PreloadLSNTreeWalker preloadLSNTreeWalker0 = null;
      try {
        preloadLSNTreeWalker0 = new PreloadLSNTreeWalker((DatabaseImpl) null, (SortedLSNTreeWalker.TreeNodeProcessor) null, preloadConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.PreloadLSNTreeWalker", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      PreloadConfig preloadConfig0 = new PreloadConfig();
      PreloadLSNTreeWalker preloadLSNTreeWalker0 = null;
      try {
        preloadLSNTreeWalker0 = new PreloadLSNTreeWalker(databaseImpl0, (SortedLSNTreeWalker.TreeNodeProcessor) null, preloadConfig0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // environmentImpl is null for target db null
         //
         assertThrownBy("com.sleepycat.je.dbi.SortedLSNTreeWalker", e);
      }
  }
}
