/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:41:51 KST 2018
 */

package it.yup.xmlstream;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.xmlstream.BasicXmlStream;
import it.yup.xmlstream.SASLAuthenticator;
import it.yup.xmlstream.TLSInitializer;
import java.util.Hashtable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Initializer_ESTest3 extends Initializer_ESTest_scaffolding3 {
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
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      Object object0 = new Object();
      hashtable0.put("", object0);
      sASLAuthenticator0.namespace = "";
      sASLAuthenticator0.matchFeatures(hashtable0);
      assertFalse(sASLAuthenticator0.optional);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TLSInitializer tLSInitializer0 = new TLSInitializer();
      // Undeclared exception!
      try { 
        tLSInitializer0.start((BasicXmlStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.TLSInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TLSInitializer tLSInitializer0 = new TLSInitializer();
      // Undeclared exception!
      try { 
        tLSInitializer0.matchFeatures((Hashtable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.Initializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SASLAuthenticator sASLAuthenticator0 = new SASLAuthenticator();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      sASLAuthenticator0.matchFeatures(hashtable0);
      assertFalse(sASLAuthenticator0.optional);
  }
}
