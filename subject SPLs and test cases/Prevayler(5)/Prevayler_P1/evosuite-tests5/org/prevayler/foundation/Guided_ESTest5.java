/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:23:12 KST 2017
 */

package org.prevayler.foundation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.implementation.Capsule;
import org.prevayler.implementation.TransactionGuide;
import org.prevayler.implementation.TransactionTimestamp;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Guided_ESTest5 extends Guided_ESTest_scaffolding5 {

  @Test
  public void test1()  throws Throwable  {
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide((TransactionTimestamp) null, turn0);
      transactionGuide0.startTurn();
  }

  @Test
  public void test2()  throws Throwable  {
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide((TransactionTimestamp) null, turn0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1471);
      // Undeclared exception!
      try { 
        transactionGuide0.writeTo(byteArrayOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionGuide", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide((TransactionTimestamp) null, turn0);
      transactionGuide0.endTurn();
  }

  @Test
  public void test4()  throws Throwable  {
      Date date0 = new Date((-2726L));
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, (-2726L), date0);
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, (Turn) null);
      // Undeclared exception!
      try { 
        transactionGuide0.startTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.Guided", e);
      }
  }
}
