/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 10:12:20 KST 2017
 */

package org.prevayler.demos.scalability;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Main_ESTest4 extends Main_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[5];
          Main.main(stringArray0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test1()  throws Throwable  {
      Main main0 = new Main();
  }
}
