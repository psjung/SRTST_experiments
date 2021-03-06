/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 00:50:07 KST 2018
 */

package it.yup.ui;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Semaphore_ESTest1 extends Semaphore_ESTest_scaffolding1 {
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
      long long0 = 0L;
      Semaphore semaphore0 = new Semaphore(0L);
      semaphore0.attempt(0L);
      semaphore0.permits_ = 0L;
      long long1 = 1L;
      // Undeclared exception!
      try { 
        semaphore0.release((-249L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative argument
         //
         verifyException("it.yup.ui.Semaphore", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      long long0 = 0L;
      Semaphore semaphore0 = new Semaphore(0L);
      semaphore0.release(1L);
      semaphore0.release(0L);
      semaphore0.attempt(0L);
      long long1 = 1L;
      semaphore0.release(0L);
      semaphore0.release();
      semaphore0.release();
      semaphore0.release(1L);
      semaphore0.release(1L);
      long long2 = (-2357L);
      // Undeclared exception!
      try { 
        semaphore0.release((-2357L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative argument
         //
         verifyException("it.yup.ui.Semaphore", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Semaphore semaphore0 = new Semaphore(0L);
      semaphore0.permits();
      semaphore0.permits();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      long long0 = (-1508L);
      Semaphore semaphore0 = new Semaphore((-1508L));
      // Undeclared exception!
      try { 
        semaphore0.release((-1508L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative argument
         //
         verifyException("it.yup.ui.Semaphore", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Semaphore semaphore0 = new Semaphore((-619L));
      semaphore0.attempt((-1L));
      semaphore0.permits_ = (-619L);
      semaphore0.release();
      semaphore0.release(1816L);
      semaphore0.acquire();
      semaphore0.release();
      semaphore0.acquire();
      semaphore0.release();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      long long0 = 495L;
      Semaphore semaphore0 = new Semaphore(495L);
      semaphore0.acquire();
      semaphore0.permits_ = 0L;
      semaphore0.release();
      semaphore0.release();
      semaphore0.attempt(495L);
      semaphore0.attempt((-1678L));
      semaphore0.attempt(495L);
      semaphore0.attempt((-291L));
      semaphore0.attempt(495L);
      semaphore0.permits();
      semaphore0.permits();
      semaphore0.release();
      semaphore0.acquire();
      // Undeclared exception!
      try { 
        semaphore0.release((-291L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative argument
         //
         verifyException("it.yup.ui.Semaphore", e);
      }
  }
}
