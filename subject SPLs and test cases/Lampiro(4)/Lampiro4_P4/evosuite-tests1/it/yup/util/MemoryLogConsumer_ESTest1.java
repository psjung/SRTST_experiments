/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 01:23:49 KST 2018
 */

package it.yup.util;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MemoryLogConsumer_ESTest1 extends MemoryLogConsumer_ESTest_scaffolding1 {
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
      MemoryLogConsumer memoryLogConsumer0 = MemoryLogConsumer.getConsumer();
      Vector<Integer> vector0 = new Vector<Integer>();
      memoryLogConsumer0.gotMessage("ehznm[", 617);
      assertEquals(30, memoryLogConsumer0.max_size);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MemoryLogConsumer memoryLogConsumer0 = MemoryLogConsumer.getConsumer();
      memoryLogConsumer0.setExiting();
      assertEquals(30, memoryLogConsumer0.max_size);
  }
}
