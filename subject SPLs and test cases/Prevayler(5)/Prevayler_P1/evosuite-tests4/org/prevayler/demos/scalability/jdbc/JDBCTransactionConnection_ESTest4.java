/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 10:22:28 KST 2017
 */

package org.prevayler.demos.scalability.jdbc;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.sql.Connection;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class JDBCTransactionConnection_ESTest4 extends JDBCTransactionConnection_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      JDBCTransactionConnection jDBCTransactionConnection0 = null;
      try {
        jDBCTransactionConnection0 = new JDBCTransactionConnection((Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.jdbc.JDBCScalabilityConnection", e);
      }
  }
}
