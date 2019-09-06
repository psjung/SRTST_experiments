/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 16:53:13 KST 2017
 */

package org.prevayler.foundation;

import static org.junit.Assert.assertFalse;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Turn_ESTest3 extends Turn_ESTest_scaffolding3 {
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
      Turn turn0 = Turn.first();
      turn0.next();
      Turn turn1 = turn0.next();
      assertFalse(turn1.equals((Object)turn0));
  }

  @Test
  public void test1()  throws Throwable  {
      Turn turn0 = Turn.first();
      Turn turn1 = turn0.next();
      turn1.alwaysSkip();
      turn0.end();
      assertFalse(turn0.equals((Object)turn1));
  }

  @Test
  public void test2()  throws Throwable  {
      Turn turn0 = Turn.first();
      turn0.start();
  }
}
