/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 19:40:42 KST 2017
 */

package org.prevayler.demos.scalability;

import java.util.concurrent.Future;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Main_ESTest2 extends Main_ESTest_scaffolding2 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void clearEvoSuiteFramework() {
String a = "aa";
}

  @Test
  public void test0()  throws Throwable  {
	{
          String[] stringArray0 = new String[1];
          Main.main(stringArray0);
      } 
  }

  @Test
  public void test1()  throws Throwable  {
      Main main0 = new Main();
  }
}
