/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 17:16:53 KST 2018
 */

package com.jcraft.jzlib;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import com.jcraft.jzlib.StaticTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class StaticTree_ESTest4 extends StaticTree_ESTest_scaffolding4 {
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
      short[] shortArray0 = new short[3];
      int[] intArray0 = new int[1];
      StaticTree staticTree0 = new StaticTree(shortArray0, intArray0, 0, 0, 0);
  }
}