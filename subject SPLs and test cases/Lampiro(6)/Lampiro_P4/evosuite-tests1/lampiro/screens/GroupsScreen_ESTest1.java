/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 02:34:50 KST 2018
 */

package lampiro.screens;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xmpp.Contact;
import static org.evosuite.runtime.EvoAssertions.*;
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class GroupsScreen_ESTest1 extends GroupsScreen_ESTest_scaffolding1 {
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
      GroupsScreen groupsScreen0 = null;
      try {
        groupsScreen0 = new GroupsScreen((Contact) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.ui.UIScreen", e);
      }
  }
}
