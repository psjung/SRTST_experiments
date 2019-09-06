/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:48:53 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class SecondaryDatabase_ESTest3 extends SecondaryDatabase_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      Environment environment0 = null;
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      Database database0 = secondaryConfig0.getForeignKeyDatabase();
      SecondaryDatabase secondaryDatabase0 = null;
      try {
        secondaryDatabase0 = new SecondaryDatabase(environment0, secondaryConfig0, database0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        SecondaryDatabase.notAllowedException();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Operation not allowed on a secondary
         //
         assertThrownBy("com.sleepycat.je.SecondaryDatabase", e);
      }
  }
}
