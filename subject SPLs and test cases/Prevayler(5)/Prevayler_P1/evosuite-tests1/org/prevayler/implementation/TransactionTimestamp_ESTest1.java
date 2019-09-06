/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:51:31 KST 2017
 */

package org.prevayler.implementation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.chrono.MinguoChronology;
import java.time.chrono.MinguoDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.Transaction;
import org.prevayler.TransactionWithQuery;
import org.prevayler.foundation.Chunk;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.XStreamSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TransactionTimestamp_ESTest1 extends TransactionTimestamp_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (long) (byte)0, date0);
      long long0 = transactionTimestamp0.systemVersion();
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) javaSerializer0);
      Date date0 = new Date((-1895L));
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, 792L, date0);
      long long0 = transactionTimestamp0.systemVersion();
      assertEquals(792L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (long) (byte)0, date0);
      Chunk chunk0 = transactionTimestamp0.toChunk();
      TransactionTimestamp transactionTimestamp1 = TransactionTimestamp.fromChunk(chunk0);
      assertEquals(0L, transactionTimestamp1.systemVersion());
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (long) (byte)71, date0);
      Chunk chunk0 = transactionTimestamp0.toChunk();
      TransactionTimestamp transactionTimestamp1 = TransactionTimestamp.fromChunk(chunk0);
      assertEquals(71L, transactionTimestamp0.systemVersion());
      assertEquals(71L, transactionTimestamp1.systemVersion());
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (long) (byte)0, date0);
      TransactionTimestamp transactionTimestamp1 = transactionTimestamp0.cleanCopy();
      assertEquals(0L, transactionTimestamp1.systemVersion());
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (long) (byte)71, date0);
      TransactionTimestamp transactionTimestamp1 = transactionTimestamp0.cleanCopy();
      assertEquals(71L, transactionTimestamp1.systemVersion());
      assertEquals(71L, transactionTimestamp0.systemVersion());
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (long) (byte)0, date0);
      transactionTimestamp0.capsule();
      assertEquals(0L, transactionTimestamp0.systemVersion());
  }

  @Test
  public void test07()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, (-935L), date0);
      TransactionTimestamp transactionTimestamp1 = transactionTimestamp0.cleanCopy();
      assertEquals((-935L), transactionTimestamp0.systemVersion());
      assertEquals((-935L), transactionTimestamp1.systemVersion());
  }

  @Test
  public void test08()  throws Throwable  {
      Date date0 = new Date(1241L);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, 1765L, date0);
      // Undeclared exception!
      try { 
        transactionTimestamp0.toChunk();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionTimestamp", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) xStreamSerializer0);
      Chunk chunk0 = transactionCapsule0.toChunk();
      // Undeclared exception!
      try { 
        TransactionTimestamp.fromChunk(chunk0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         assertThrownBy("java.lang.Long", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        TransactionTimestamp.fromChunk((Chunk) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      HashMap<String, MinguoDate> hashMap0 = new HashMap<String, MinguoDate>();
      Chunk chunk0 = new Chunk(byteArray0, (Map) hashMap0);
      MinguoChronology minguoChronology0 = MinguoChronology.INSTANCE;
      MinguoDate minguoDate0 = minguoChronology0.dateEpochDay((byte) (-23));
      hashMap0.put("systemVersion", minguoDate0);
      // Undeclared exception!
      try { 
        TransactionTimestamp.fromChunk(chunk0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.time.chrono.MinguoDate cannot be cast to java.lang.String
         //
         assertThrownBy("org.prevayler.foundation.Chunk", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      TransactionTimestamp transactionTimestamp0 = null;
      try {
        transactionTimestamp0 = new TransactionTimestamp((Capsule) null, 1342L, (Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionTimestamp", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, (-935L), date0);
      long long0 = transactionTimestamp0.systemVersion();
      assertEquals((-935L), long0);
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (long) (byte)0, date0);
      Date date1 = transactionTimestamp0.executionTime();
      //  // Unstable assertion: assertEquals("Fri Apr 07 23:51:25 KST 2017", date1.toString());
      //  // Unstable assertion: assertEquals(0L, transactionTimestamp0.systemVersion());
  }

  @Test
  public void test15()  throws Throwable  {
      Date date0 = new Date(1241L);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, 1765L, date0);
      transactionTimestamp0.capsule();
      assertEquals(1765L, transactionTimestamp0.systemVersion());
  }

  @Test
  public void test16()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, (-935L), date0);
      Chunk chunk0 = transactionTimestamp0.toChunk();
      TransactionTimestamp transactionTimestamp1 = TransactionTimestamp.fromChunk(chunk0);
      assertEquals((-935L), transactionTimestamp1.systemVersion());
      assertEquals((-935L), transactionTimestamp0.systemVersion());
  }

  @Test
  public void test17()  throws Throwable  {
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, 1L, date0);
      // Undeclared exception!
      try { 
        transactionTimestamp0.cleanCopy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionTimestamp", e);
      }
  }
}
