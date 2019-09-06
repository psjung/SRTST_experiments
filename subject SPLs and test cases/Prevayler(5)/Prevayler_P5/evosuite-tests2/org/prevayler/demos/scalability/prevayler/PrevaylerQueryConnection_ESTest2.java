/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 19:55:18 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class PrevaylerQueryConnection_ESTest2 extends PrevaylerQueryConnection_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      QuerySystem querySystem0 = new QuerySystem();
      PrevaylerQueryConnection prevaylerQueryConnection0 = new PrevaylerQueryConnection(querySystem0);
      List list0 = prevaylerQueryConnection0.queryByName("");
      assertNull(list0);
  }

  @Test
  public void test1()  throws Throwable  {
      PrevaylerQueryConnection prevaylerQueryConnection0 = new PrevaylerQueryConnection((QuerySystem) null);
      // Undeclared exception!
      try { 
        prevaylerQueryConnection0.queryByName("3P*1");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.prevayler.PrevaylerQueryConnection", e);
      }
  }
}
