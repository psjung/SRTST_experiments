/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:58:45 KST 2018
 */

package lancs.mobilemedia.core.threads;

import org.evosuite.runtime.EvoRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class BaseThread_ESTest2 extends BaseThread_ESTest_scaffolding2 {
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
      BaseThread baseThread0 = new BaseThread();
      baseThread0.run();
  }
}
