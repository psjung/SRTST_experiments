/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 02:04:56 KST 2018
 */

package it.yup.xmlstream;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class SASLAuthenticator_ESTest1 extends SASLAuthenticator_ESTest_scaffolding1 {
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
      SASLAuthenticator sASLAuthenticator0 = new SASLAuthenticator();
      SocketStream socketStream0 = new SocketStream();
      // Undeclared exception!
      try { 
        sASLAuthenticator0.start(socketStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.SASLAuthenticator", e);
      }
  }
}