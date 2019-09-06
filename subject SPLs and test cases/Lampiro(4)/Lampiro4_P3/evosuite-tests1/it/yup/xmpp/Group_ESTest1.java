/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 02:16:42 KST 2018
 */

package it.yup.xmpp;

import static org.junit.Assert.assertSame;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import java.util.Hashtable;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Group_ESTest1 extends Group_ESTest_scaffolding1 {
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
      // Undeclared exception!
      try { 
        Group.getGroup((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Group group0 = Group.getGroup(" KeBQVpyPnQ_=");
      Group group1 = Group.getGroup(" KeBQVpyPnQ_=");
      group0.addElement(" KeBQVpyPnQ_=");
      assertSame(group0, group1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Group group0 = Group.getGroup("");
      group0.removeElement("");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Hashtable hashtable0 = Group.getGroups();
      //  // Unstable assertion: assertEquals(0, hashtable0.size());
  }
}
