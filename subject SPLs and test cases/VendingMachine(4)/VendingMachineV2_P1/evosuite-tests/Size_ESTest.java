/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 16:01:50 KST 2018
 */


import org.evosuite.runtime.EvoRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Size_ESTest extends Size_ESTest_scaffolding {
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
      Size size0 = new Size();
      size0.setSize("");
  }
}