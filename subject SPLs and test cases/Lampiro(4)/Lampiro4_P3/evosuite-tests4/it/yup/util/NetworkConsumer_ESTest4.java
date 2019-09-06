/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 15:55:25 KST 2018
 */

package it.yup.util;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class NetworkConsumer_ESTest4 extends NetworkConsumer_ESTest_scaffolding4 {
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
      NetworkConsumer networkConsumer0 = new NetworkConsumer();
      // Undeclared exception!
      try { 
        networkConsumer0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.NetworkConsumer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NetworkConsumer networkConsumer0 = new NetworkConsumer();
      networkConsumer0.gotMessage("", 0);
      //  // Unstable assertion: assertFalse(networkConsumer0.isDaemon());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NetworkConsumer networkConsumer0 = new NetworkConsumer();
      networkConsumer0.setExiting();
      networkConsumer0.gotMessage("", 0);
      //  // Unstable assertion: assertFalse(networkConsumer0.isDaemon());
  }
}
