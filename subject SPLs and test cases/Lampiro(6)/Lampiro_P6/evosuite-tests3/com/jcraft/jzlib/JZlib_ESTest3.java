/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 13:03:33 KST 2018
 */

package com.jcraft.jzlib;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jcraft.jzlib.JZlib;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class JZlib_ESTest3 extends JZlib_ESTest_scaffolding3 {

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
