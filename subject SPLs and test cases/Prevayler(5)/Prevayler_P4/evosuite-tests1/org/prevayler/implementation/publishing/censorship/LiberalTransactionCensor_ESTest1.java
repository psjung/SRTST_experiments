/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 08 00:04:42 KST 2017
 */

package org.prevayler.implementation.publishing.censorship;

import static org.junit.Assert.assertEquals;

import java.time.Instant;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.implementation.Capsule;
import org.prevayler.implementation.TransactionTimestamp;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LiberalTransactionCensor_ESTest1 extends LiberalTransactionCensor_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      LiberalTransactionCensor liberalTransactionCensor0 = new LiberalTransactionCensor();
      Instant instant0 = Instant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, 0L, date0);
      liberalTransactionCensor0.approve(transactionTimestamp0);
      assertEquals(0L, transactionTimestamp0.systemVersion());
  }
}