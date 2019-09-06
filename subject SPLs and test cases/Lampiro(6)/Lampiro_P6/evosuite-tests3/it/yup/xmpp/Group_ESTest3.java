/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 15:03:06 KST 2018
 */

package it.yup.xmpp;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.fail;

import java.util.Hashtable;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Group_ESTest3 extends Group_ESTest_scaffolding3 {

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
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Group group0 = Group.getGroup("");
      group0.addElement("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Group group0 = Group.getGroup("");
      group0.removeElement("");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Hashtable hashtable0 = Group.getGroups();
      //  // Unstable assertion: assertTrue(hashtable0.isEmpty());
  }
}
