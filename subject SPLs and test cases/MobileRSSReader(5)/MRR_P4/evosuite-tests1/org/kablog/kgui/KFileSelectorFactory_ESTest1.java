/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:36:06 KST 2018
 */

package org.kablog.kgui;

import static org.junit.Assert.assertNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.microedition.midlet.MIDlet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class KFileSelectorFactory_ESTest1 extends KFileSelectorFactory_ESTest_scaffolding1 {
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
      KFileSelector kFileSelector0 = KFileSelectorFactory.getInstance((MIDlet) null, "", "", "");
      assertNull(kFileSelector0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KFileSelectorFactory kFileSelectorFactory0 = new KFileSelectorFactory();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      KFileSelector kFileSelector0 = KFileSelectorFactory.getInstance();
      assertNull(kFileSelector0);
  }
}
