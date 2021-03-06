/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 01:58:01 KST 2018
 */

package it.yup.xmlstream;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class EventQueryRegistration_ESTest1 extends EventQueryRegistration_ESTest_scaffolding1 {
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
      Integer integer0 = new Integer(0);
      Vector<String> vector0 = new Vector<String>();
      EventQueryRegistration eventQueryRegistration0 = new EventQueryRegistration(integer0, vector0);
      eventQueryRegistration0.remove();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EventQueryRegistration eventQueryRegistration0 = new EventQueryRegistration("", (Vector) null);
      // Undeclared exception!
      try { 
        eventQueryRegistration0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.EventQueryRegistration", e);
      }
  }
}
