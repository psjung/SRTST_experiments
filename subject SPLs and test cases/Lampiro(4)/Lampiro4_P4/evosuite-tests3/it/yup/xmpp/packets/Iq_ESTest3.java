/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 15:14:45 KST 2018
 */

package it.yup.xmpp.packets;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Iq_ESTest3 extends Iq_ESTest_scaffolding3 {
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
      Iq iq0 = null;
      try {
        iq0 = new Iq("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.packets.Iq", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Iq iq0 = new Iq("", "get");
      assertEquals(0, iq0.maxWait);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Iq iq0 = new Iq("", "");
      assertEquals(0L, iq0.queueTime);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Iq iq0 = new Iq("", "set");
      assertEquals(0, iq0.maxWait);
  }
}
