/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:00:50 KST 2018
 */

package lancs.mobilemedia.lib.exceptions;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class InvalidImageFormatException_ESTest3 extends InvalidImageFormatException_ESTest_scaffolding3 {
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
      InvalidImageFormatException invalidImageFormatException0 = new InvalidImageFormatException("");
      assertEquals("lancs.mobilemedia.lib.exceptions.InvalidImageFormatException: ", invalidImageFormatException0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InvalidImageFormatException invalidImageFormatException0 = new InvalidImageFormatException();
      InvalidImageFormatException invalidImageFormatException1 = new InvalidImageFormatException(invalidImageFormatException0);
      assertFalse(invalidImageFormatException1.equals((Object)invalidImageFormatException0));
  }
}
