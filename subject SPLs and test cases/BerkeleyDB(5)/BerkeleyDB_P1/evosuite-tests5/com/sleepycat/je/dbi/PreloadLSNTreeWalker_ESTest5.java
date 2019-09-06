/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 08:46:18 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseConfig;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.PreloadConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class PreloadLSNTreeWalker_ESTest5 extends PreloadLSNTreeWalker_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      long long0 = 0L;
      DatabaseId databaseId0 = new DatabaseId();
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      EnvironmentImpl environmentImpl0 = null;
      DatabaseImpl databaseImpl0 = null;
      try {
        databaseImpl0 = new DatabaseImpl("&nk Gvto", databaseId0, (EnvironmentImpl) null, databaseConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PreloadLSNTreeWalker preloadLSNTreeWalker0 = null;
      try {
        preloadLSNTreeWalker0 = new PreloadLSNTreeWalker((DatabaseImpl) null, (SortedLSNTreeWalker.TreeNodeProcessor) null, (PreloadConfig) null);
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
      PreloadConfig preloadConfig0 = PreloadConfig.DEFAULT;
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
