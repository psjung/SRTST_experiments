/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:52:58 KST 2018
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
public class CauseException_ESTest4 extends CauseException_ESTest_scaffolding4 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CauseException causeException0 = new CauseException();
      Throwable throwable0 = causeException0.initCause((Throwable) null);
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CauseException causeException0 = new CauseException();
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException("", causeException0);
      Throwable throwable0 = causeException0.initCause(causeRuntimeException0);
      Throwable throwable1 = causeException0.getCause();
      assertSame(throwable1, throwable0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CauseException causeException0 = new CauseException();
      Throwable throwable0 = causeException0.getCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      CauseException causeException0 = new CauseException("", causeRuntimeException0);
      Throwable throwable0 = causeException0.getFirstCause();
      assertSame(throwable0, causeRuntimeException0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CauseException causeException0 = new CauseException();
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException("", causeException0);
      causeException0.initCause(causeRuntimeException0);
      CauseException causeException1 = new CauseException("", causeException0);
      Throwable throwable0 = causeException1.getFirstCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CauseException causeException0 = new CauseException();
      Throwable throwable0 = causeException0.getFirstCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CauseException causeException0 = new CauseException();
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException("", causeException0);
      causeException0.initCause(causeRuntimeException0);
      Throwable throwable0 = causeException0.getFirstCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CauseException causeException0 = new CauseException();
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException("", causeException0);
      CauseException causeException1 = new CauseException("", causeException0);
      Throwable throwable0 = causeException1.initCause(causeRuntimeException0);
      assertEquals("com.substanceofcode.utils.CauseRuntimeException: ", throwable0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Throwable throwable0 = new Throwable("");
      CauseException causeException0 = new CauseException("", throwable0);
      Throwable throwable1 = causeException0.getFirstCause();
      assertEquals("java.lang.Throwable: ", throwable1.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CauseException causeException0 = new CauseException("");
      assertEquals("com.substanceofcode.utils.CauseException: ", causeException0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CauseException causeException0 = new CauseException();
      CauseException causeException1 = new CauseException("", causeException0);
      Throwable throwable0 = causeException1.getFirstCause();
      assertEquals("com.substanceofcode.utils.CauseException", throwable0.toString());
      assertNotNull(throwable0);
  }
}
