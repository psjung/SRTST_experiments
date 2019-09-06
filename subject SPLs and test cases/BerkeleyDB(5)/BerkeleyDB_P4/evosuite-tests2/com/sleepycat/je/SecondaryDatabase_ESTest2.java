/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:30:49 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.Database;
import com.sleepycat.je.Environment;
import com.sleepycat.je.SecondaryConfig;
import com.sleepycat.je.SecondaryDatabase;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class SecondaryDatabase_ESTest2 extends SecondaryDatabase_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      SecondaryDatabase secondaryDatabase0 = null;
      try {
        secondaryDatabase0 = new SecondaryDatabase((Environment) null, secondaryConfig0, (Database) null);
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
