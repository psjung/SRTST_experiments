/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:58:23 KST 2018
 */

package com.substanceofcode.utils;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;

import javax.microedition.midlet.MIDlet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Settings_ESTest4 extends Settings_ESTest_scaffolding4 {
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
      try { 
        Settings.getInstance((MIDlet) null);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error while loading region=0
         //
         verifyException("com.substanceofcode.utils.Settings", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Settings.deleteStore();
  }
}
