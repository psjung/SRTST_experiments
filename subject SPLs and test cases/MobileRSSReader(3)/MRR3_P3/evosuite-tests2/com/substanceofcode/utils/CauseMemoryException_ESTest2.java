/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:04:41 KST 2018
 */

package com.substanceofcode.utils;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CauseMemoryException_ESTest2 extends CauseMemoryException_ESTest_scaffolding2 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CauseMemoryException causeMemoryException0 = new CauseMemoryException("");
      assertEquals("", causeMemoryException0.getMessage());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CauseMemoryException causeMemoryException0 = new CauseMemoryException();
      CauseMemoryException causeMemoryException1 = new CauseMemoryException("", causeMemoryException0);
      assertFalse(causeMemoryException1.equals((Object)causeMemoryException0));
  }
}
