/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 10:40:53 KST 2018
 */

package com.jcraft.jzlib;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class JZlib_ESTest2 extends JZlib_ESTest_scaffolding2 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = JZlib.version();
      assertEquals("1.0.2", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JZlib jZlib0 = new JZlib();
      assertEquals("1.0.2", jZlib0.version());
  }
}