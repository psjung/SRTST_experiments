/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:05:45 KST 2018
 */

package com.substanceofcode.utils;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CauseRuntimeException_ESTest2 extends CauseRuntimeException_ESTest_scaffolding2 {
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
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException("", (Throwable) null);
      Throwable throwable0 = causeRuntimeException0.initCause((Throwable) null);
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      Throwable throwable0 = causeRuntimeException0.initCause(causeRuntimeException0);
      Throwable throwable1 = causeRuntimeException0.getCause();
      assertSame(throwable1, throwable0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      Throwable throwable0 = causeRuntimeException0.getCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      CauseRuntimeException causeRuntimeException1 = new CauseRuntimeException("", causeRuntimeException0);
      Throwable throwable0 = causeRuntimeException1.getFirstCause();
      assertEquals("com.substanceofcode.utils.CauseRuntimeException", throwable0.toString());
      assertNotNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      Throwable throwable0 = new Throwable(causeRuntimeException0);
      causeRuntimeException0.initCause(throwable0);
      Throwable throwable1 = causeRuntimeException0.getFirstCause();
      assertEquals("java.lang.Throwable: com.substanceofcode.utils.CauseRuntimeException", throwable1.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      Throwable throwable0 = causeRuntimeException0.getFirstCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      causeRuntimeException0.initCause(causeRuntimeException0);
      Throwable throwable0 = causeRuntimeException0.getFirstCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException("");
      CauseException causeException0 = new CauseException("", causeRuntimeException0);
      CauseRuntimeException causeRuntimeException1 = new CauseRuntimeException("", causeException0);
      Throwable throwable0 = causeRuntimeException1.getFirstCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CauseException causeException0 = new CauseException();
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException("", causeException0);
      Throwable throwable0 = causeRuntimeException0.getFirstCause();
      assertSame(throwable0, causeException0);
  }
}
