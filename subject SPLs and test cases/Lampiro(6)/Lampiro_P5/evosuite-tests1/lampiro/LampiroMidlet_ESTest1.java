/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 02:32:56 KST 2018
 */

package lampiro;

import org.evosuite.runtime.EvoRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class LampiroMidlet_ESTest1 extends LampiroMidlet_ESTest_scaffolding1 {
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
      LampiroMidlet lampiroMidlet0 = LampiroMidlet._lampiro;
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LampiroMidlet.changeColor((-1));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LampiroMidlet.changeColor(3);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LampiroMidlet.changeColor(2);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LampiroMidlet.changeColor(1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LampiroMidlet.changeFont(2);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LampiroMidlet.changeFont(1);
  }
}