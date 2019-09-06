/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:10:45 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class SortedLSNTreeWalker_ESTest3 extends SortedLSNTreeWalker_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      SortedLSNTreeWalker sortedLSNTreeWalker0 = null;
      try {
        sortedLSNTreeWalker0 = new SortedLSNTreeWalker((DatabaseImpl) null, true, true, 0L, (SortedLSNTreeWalker.TreeNodeProcessor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.SortedLSNTreeWalker", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      SortedLSNTreeWalker sortedLSNTreeWalker0 = null;
      try {
        sortedLSNTreeWalker0 = new SortedLSNTreeWalker(databaseImpl0, false, false, (-1L), (SortedLSNTreeWalker.TreeNodeProcessor) null);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // environmentImpl is null for target db null
         //
         assertThrownBy("com.sleepycat.je.dbi.SortedLSNTreeWalker", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SortedLSNTreeWalker.SortedLSNTreeWalker_extractINsForDb sortedLSNTreeWalker_SortedLSNTreeWalker_extractINsForDb0 = new SortedLSNTreeWalker.SortedLSNTreeWalker_extractINsForDb((SortedLSNTreeWalker) null, (INList) null);
      sortedLSNTreeWalker_SortedLSNTreeWalker_extractINsForDb0.hook361();
  }

  @Test
  public void test3()  throws Throwable  {
      SortedLSNTreeWalker.SortedLSNTreeWalker_extractINsForDb sortedLSNTreeWalker_SortedLSNTreeWalker_extractINsForDb0 = new SortedLSNTreeWalker.SortedLSNTreeWalker_extractINsForDb((SortedLSNTreeWalker) null, (INList) null);
      sortedLSNTreeWalker_SortedLSNTreeWalker_extractINsForDb0.hook362();
  }

  @Test
  public void test4()  throws Throwable  {
      SortedLSNTreeWalker.SortedLSNTreeWalker_extractINsForDb sortedLSNTreeWalker_SortedLSNTreeWalker_extractINsForDb0 = new SortedLSNTreeWalker.SortedLSNTreeWalker_extractINsForDb((SortedLSNTreeWalker) null, (INList) null);
      // Undeclared exception!
      try { 
        sortedLSNTreeWalker_SortedLSNTreeWalker_extractINsForDb0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.SortedLSNTreeWalker$SortedLSNTreeWalker_extractINsForDb", e);
      }
  }

  
}
