/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:40:07 KST 2018
 */

package com.substanceofcode.utils;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CauseRecStoreException_ESTest5 extends CauseRecStoreException_ESTest_scaffolding5 {
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
      CauseRecStoreException causeRecStoreException0 = new CauseRecStoreException((String) null);
      assertEquals("com.substanceofcode.utils.CauseRecStoreException", causeRecStoreException0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CauseRecStoreException causeRecStoreException0 = new CauseRecStoreException();
      CauseRecStoreException causeRecStoreException1 = new CauseRecStoreException("", causeRecStoreException0);
      assertEquals("com.substanceofcode.utils.CauseRecStoreException: ", causeRecStoreException1.toString());
  }
}