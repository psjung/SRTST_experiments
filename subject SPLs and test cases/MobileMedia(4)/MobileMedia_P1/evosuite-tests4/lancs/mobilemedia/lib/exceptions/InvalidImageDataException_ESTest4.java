/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:33:26 KST 2018
 */

package lancs.mobilemedia.lib.exceptions;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class InvalidImageDataException_ESTest4 extends InvalidImageDataException_ESTest_scaffolding4 {
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
      InvalidImageDataException invalidImageDataException0 = new InvalidImageDataException("");
      Throwable throwable0 = invalidImageDataException0.getCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InvalidImageDataException invalidImageDataException0 = new InvalidImageDataException();
      assertEquals("lancs.mobilemedia.lib.exceptions.InvalidImageDataException", invalidImageDataException0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Throwable throwable0 = new Throwable("");
      InvalidImageDataException invalidImageDataException0 = new InvalidImageDataException(throwable0);
      Throwable throwable1 = invalidImageDataException0.getCause();
      assertSame(throwable1, throwable0);
  }
}