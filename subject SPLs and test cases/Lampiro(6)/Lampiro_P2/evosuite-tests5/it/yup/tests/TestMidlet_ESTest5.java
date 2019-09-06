/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 17:19:49 KST 2018
 */

package it.yup.tests;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.tests.TestMidlet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class TestMidlet_ESTest5 extends TestMidlet_ESTest_scaffolding5 {
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
      TestMidlet testMidlet0 = new TestMidlet();
      testMidlet0.destroyApp(false);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TestMidlet testMidlet0 = new TestMidlet();
      testMidlet0.pauseApp();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TestMidlet testMidlet0 = new TestMidlet();
      // Undeclared exception!
      try { 
        testMidlet0.startApp();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.tests.TestMidlet", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TestMidlet testMidlet0 = new TestMidlet();
      testMidlet0.exit();
  }
}
