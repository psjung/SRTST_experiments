/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:58:33 KST 2017
 */

package com.sleepycat.je.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DuplicateEntryException_ESTest4 extends DuplicateEntryException_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      DuplicateEntryException duplicateEntryException0 = new DuplicateEntryException("a}i?");
      assertEquals("a}i?", duplicateEntryException0.getMessage());
  }

  @Test
  public void test1()  throws Throwable  {
      DuplicateEntryException duplicateEntryException0 = new DuplicateEntryException();
      assertNull(duplicateEntryException0.getMessage());
  }
}
