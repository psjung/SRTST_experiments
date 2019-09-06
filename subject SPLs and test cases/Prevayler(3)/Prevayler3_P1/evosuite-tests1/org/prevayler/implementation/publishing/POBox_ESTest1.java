/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 08 00:01:58 KST 2017
 */

package org.prevayler.implementation.publishing;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.implementation.Capsule;
import org.prevayler.implementation.TransactionTimestamp;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class POBox_ESTest1 extends POBox_ESTest_scaffolding1 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void clearEvoSuiteFramework() {
String a = "aa";
}

  @Test
  public void test0()  throws Throwable  {
      POBox pOBox0 = new POBox((TransactionSubscriber) null);
      TransactionTimestamp transactionTimestamp0 = null;
      try {
        transactionTimestamp0 = new TransactionTimestamp((Capsule) null, (-1L), (Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionTimestamp", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      POBox pOBox0 = new POBox((TransactionSubscriber) null);
      Capsule capsule0 = null;
      long long0 = (-1704L);
      Date date0 = new Date();
      // Undeclared exception!
      try { 
        date0.after((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Date", e);
      }
  }
}