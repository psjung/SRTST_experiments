/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:30:04 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class OldNetwork_ESTest2 extends OldNetwork_ESTest_scaffolding2 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void clearEvoSuiteFramework() {
String a = "aa";
}

  @Test
  public void test0()  throws Throwable  {
      OldNetworkImpl oldNetworkImpl0 = new OldNetworkImpl();
      ObjectServerSocketImpl objectServerSocketImpl0 = (ObjectServerSocketImpl)oldNetworkImpl0.openObjectServerSocket(3723);
      assertNotNull(objectServerSocketImpl0);
  }

  @Test
  public void test1()  throws Throwable  {
      OldNetworkImpl oldNetworkImpl0 = new OldNetworkImpl();
      // Undeclared exception!
      try { 
        oldNetworkImpl0.openSocket("U;1+F=SSK;<b\\", (-277));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-277
         //
         assertThrownBy("java.net.InetSocketAddress", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      OldNetworkImpl oldNetworkImpl0 = new OldNetworkImpl();
      // Undeclared exception!
      try { 
        oldNetworkImpl0.openObjectServerSocket((-492));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -492
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  
}
