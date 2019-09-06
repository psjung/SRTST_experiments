/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 02:29:01 KST 2018
 */

package it.yup.xmpp.packets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Iq_ESTest1 extends Iq_ESTest_scaffolding1 {

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
      assertEquals(0L, iq0.queueTime);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Iq iq0 = new Iq("", "");
      assertEquals(0L, iq0.queueTime);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Iq iq0 = new Iq((String) null, "set");
      assertEquals(0L, iq0.queueTime);
  }
}
