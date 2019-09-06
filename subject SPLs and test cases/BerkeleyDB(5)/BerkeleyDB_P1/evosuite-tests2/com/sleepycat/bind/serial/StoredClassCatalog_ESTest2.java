/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:15:02 KST 2017
 */

package com.sleepycat.bind.serial;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.Database;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class StoredClassCatalog_ESTest2 extends StoredClassCatalog_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      StoredClassCatalog storedClassCatalog0 = null;
      try {
        storedClassCatalog0 = new StoredClassCatalog((Database) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.StoredClassCatalog", e);
      }
  }
}
