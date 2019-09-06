/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:40:56 KST 2018
 */

package it.yup.xmlstream;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.xmlstream.EventQueryRegistration;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class EventQueryRegistration_ESTest3 extends EventQueryRegistration_ESTest_scaffolding3 {
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
      Vector<Integer> vector0 = new Vector<Integer>();
      EventQueryRegistration eventQueryRegistration0 = new EventQueryRegistration(integer0, vector0);
      eventQueryRegistration0.remove();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EventQueryRegistration eventQueryRegistration0 = new EventQueryRegistration((Object) null, (Vector) null);
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
