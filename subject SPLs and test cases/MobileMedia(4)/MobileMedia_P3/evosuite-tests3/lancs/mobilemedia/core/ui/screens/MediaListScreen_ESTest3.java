/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 18:55:50 KST 2018
 */

package lancs.mobilemedia.core.ui.screens;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import lancs.mobilemedia.core.ui.screens.MediaListScreen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MediaListScreen_ESTest3 extends MediaListScreen_ESTest_scaffolding3 {
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
      MediaListScreen mediaListScreen0 = new MediaListScreen(3);
      mediaListScreen0.initMenu();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MediaListScreen mediaListScreen0 = new MediaListScreen(1);
      mediaListScreen0.initMenu();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MediaListScreen mediaListScreen0 = new MediaListScreen(2);
      mediaListScreen0.initMenu();
  }
}