/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:04:14 KST 2018
 */

package it.yup.util;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import it.yup.util.MemoryLogConsumer;
import it.yup.util.StderrConsumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class LogConsumer_ESTest3 extends LogConsumer_ESTest_scaffolding3 {
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
      StderrConsumer stderrConsumer0 = new StderrConsumer();
      stderrConsumer0.setExiting();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MemoryLogConsumer memoryLogConsumer0 = MemoryLogConsumer.getConsumer();
      memoryLogConsumer0.gotMessage("", 0);
      assertEquals(30, memoryLogConsumer0.max_size);
  }
}
