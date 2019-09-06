/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:22:54 KST 2018
 */

package it.yup.ui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Semaphore_ESTest6 extends Semaphore_ESTest_scaffolding6 {
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
      Semaphore semaphore0 = new Semaphore(0L);
      semaphore0.permits_ = 0L;
      semaphore0.release(0L);
      semaphore0.attempt(0L);
      semaphore0.release();
      semaphore0.permits_ = (-1636L);
      long long0 = (-777L);
      semaphore0.attempt((-738L));
      // Undeclared exception!
      try { 
        semaphore0.release((-777L));
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
      Semaphore semaphore0 = new Semaphore(0L);
      semaphore0.permits_ = 0L;
      semaphore0.permits_ = (-632L);
      semaphore0.attempt(0L);
      semaphore0.permits_ = (-632L);
      semaphore0.permits_ = 1L;
      semaphore0.permits_ = 2578L;
      semaphore0.attempt(0L);
      semaphore0.attempt(2578L);
      semaphore0.acquire();
      semaphore0.release(1L);
      semaphore0.attempt((-1368L));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      long long0 = 3045L;
      Semaphore semaphore0 = new Semaphore(3045L);
      semaphore0.release(3045L);
      semaphore0.attempt(3045L);
      semaphore0.release(3045L);
      semaphore0.release();
      semaphore0.release(1904L);
      long long1 = 0L;
      semaphore0.attempt(0L);
      semaphore0.release(966L);
      semaphore0.permits();
      semaphore0.attempt(966L);
      semaphore0.release();
      // Undeclared exception!
      semaphore0.release(1616L);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Semaphore semaphore0 = new Semaphore(1643L);
      semaphore0.release();
      semaphore0.acquire();
      // Undeclared exception!
      try { 
        semaphore0.release((-2657L));
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
      Semaphore semaphore0 = new Semaphore(0L);
      semaphore0.attempt(0L);
      semaphore0.permits_ = 0L;
      semaphore0.release();
      semaphore0.attempt(109L);
      semaphore0.permits_ = 0L;
      semaphore0.attempt(0L);
      semaphore0.permits_ = 109L;
      semaphore0.release();
      long long0 = 536L;
      semaphore0.attempt(536L);
      semaphore0.attempt(0L);
      semaphore0.release(0L);
      semaphore0.release(0L);
      semaphore0.release(1L);
      semaphore0.release();
      semaphore0.release();
      semaphore0.release();
      // Undeclared exception!
      try { 
        semaphore0.release((-2680L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative argument
         //
         verifyException("it.yup.ui.Semaphore", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Semaphore semaphore0 = new Semaphore(0L);
      semaphore0.release();
      semaphore0.release();
      semaphore0.release();
      semaphore0.attempt((-1L));
      semaphore0.release(0L);
      semaphore0.acquire();
      semaphore0.attempt(0L);
      semaphore0.release();
      semaphore0.release();
      semaphore0.release();
      semaphore0.attempt((-1L));
      semaphore0.acquire();
      semaphore0.release(0L);
      semaphore0.release();
      semaphore0.acquire();
      semaphore0.release();
      semaphore0.attempt((-1L));
      semaphore0.release(0L);
      semaphore0.permits();
      semaphore0.attempt(647L);
      // Undeclared exception!
      try { 
        semaphore0.release((-1294L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative argument
         //
         verifyException("it.yup.ui.Semaphore", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      long long0 = (-1L);
      Semaphore semaphore0 = new Semaphore((-1L));
      semaphore0.release();
      semaphore0.release();
      semaphore0.acquire();
      semaphore0.attempt(1234L);
      long long1 = 0L;
      long long2 = (-1928L);
      // Undeclared exception!
      try { 
        semaphore0.release((-1928L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative argument
         //
         verifyException("it.yup.ui.Semaphore", e);
      }
  }
}
