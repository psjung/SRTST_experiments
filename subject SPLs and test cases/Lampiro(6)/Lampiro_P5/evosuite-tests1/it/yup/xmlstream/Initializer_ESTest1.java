/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 01:59:04 KST 2018
 */

package it.yup.xmlstream;

import static org.junit.Assert.assertFalse;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import java.util.Hashtable;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Initializer_ESTest1 extends Initializer_ESTest_scaffolding1 {
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
      AccountRegistration accountRegistration0 = new AccountRegistration();
      accountRegistration0.namespace = "[BasicXmlStream::promotePacket] RuntimeException: ";
      Hashtable<Object, Object> hashtable0 = new Hashtable<Object, Object>();
      hashtable0.put("[BasicXmlStream::promotePacket] RuntimeException: ", "");
      accountRegistration0.matchFeatures(hashtable0);
      assertFalse(accountRegistration0.optional);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SASLAuthenticator sASLAuthenticator0 = new SASLAuthenticator();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      sASLAuthenticator0.matchFeatures(hashtable0);
      assertFalse(sASLAuthenticator0.optional);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AccountRegistration accountRegistration0 = new AccountRegistration();
      // Undeclared exception!
      try { 
        accountRegistration0.matchFeatures((Hashtable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.Initializer", e);
      }
  }
}
