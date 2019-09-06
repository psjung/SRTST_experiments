/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:49:31 KST 2017
 */

package org.prevayler.implementation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.Transaction;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.SkaringaSerializer;
import org.prevayler.foundation.serialization.XStreamSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TransactionCapsule_ESTest1 extends TransactionCapsule_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Date date0 = new Date();
      // Undeclared exception!
      try { 
        transactionCapsule0.justExecute(byteArray0, "com.thoughtworks.xstream.converters.enums.EnumSetConverter", date0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [B cannot be cast to org.prevayler.Transaction
         //
         assertThrownBy("org.prevayler.implementation.TransactionCapsule", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("5,:m=E}vxc");
      TransactionCapsule transactionCapsule0 = null;
      try {
        transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) xStreamSerializer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unable to serialize transaction
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) xStreamSerializer0);
      Date date0 = new Date((-2733L));
      // Undeclared exception!
      try { 
        transactionCapsule0.justExecute((Object) null, transactionCapsule0, date0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionCapsule", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) skaringaSerializer0);
      TransactionCapsule transactionCapsule1 = (TransactionCapsule)transactionCapsule0.cleanCopy();
      assertSame(transactionCapsule0, transactionCapsule1);
  }
}
