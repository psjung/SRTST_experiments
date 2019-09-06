/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 12:13:44 KST 2017
 */

package org.prevayler.implementation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.chrono.HijrahDate;
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
import org.prevayler.foundation.serialization.SkaringaSerializer;
import org.prevayler.foundation.serialization.XStreamSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Capsule_ESTest4 extends Capsule_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) javaSerializer0);
      byte[] byteArray0 = transactionCapsule0.serialized();
      assertArrayEquals(new byte[] {(byte) (-84), (byte) (-19), (byte)0, (byte)5, (byte)112}, byteArray0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      HashMap<BufferedInputStream, Object> hashMap0 = new HashMap<BufferedInputStream, Object>(1);
      Chunk chunk0 = new Chunk(byteArray0, (Map) hashMap0);
      TransactionCapsule transactionCapsule0 = (TransactionCapsule)Capsule.fromChunk(chunk0);
      byte[] byteArray1 = transactionCapsule0.serialized();
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test
  public void test02()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) xStreamSerializer0);
      Object object0 = transactionCapsule0.deserialize(xStreamSerializer0);
      assertNull(object0);
  }

  @Test
  public void test03()  throws Throwable  {
      TransactionCapsule transactionCapsule0 = null;
      try {
        transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unable to serialize transaction
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Date date0 = new Date((long) (byte) (-21));
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
  public void test05()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) xStreamSerializer0);
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.justExecute((Object) null, (Object) null, (Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionWithQueryCapsule", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Chunk chunk0 = new Chunk(byteArray0);
      TransactionCapsule transactionCapsule0 = (TransactionCapsule)Capsule.fromChunk(chunk0);
      Instant instant0 = Instant.ofEpochSecond((long) (byte)23, (-1L));
      Date date0 = Date.from(instant0);
      // Undeclared exception!
      try { 
        transactionCapsule0.justExecute(chunk0, (Object) null, date0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.prevayler.foundation.Chunk cannot be cast to org.prevayler.Transaction
         //
         assertThrownBy("org.prevayler.implementation.TransactionCapsule", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      MinguoDate minguoDate0 = MinguoDate.now();
      Date date0 = new Date((long) (byte) (-1));
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.justExecute(transactionWithQueryCapsule0, minguoDate0, date0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.prevayler.implementation.TransactionWithQueryCapsule cannot be cast to org.prevayler.TransactionWithQuery
         //
         assertThrownBy("org.prevayler.implementation.TransactionWithQueryCapsule", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Capsule.fromChunk((Chunk) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) javaSerializer0);
      Instant instant0 = Instant.now();
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(0, 0);
      Clock clock0 = Clock.fixed(instant0, zoneOffset0);
      HijrahDate hijrahDate0 = HijrahDate.now(clock0);
      Date date0 = new Date();
      // Undeclared exception!
      try { 
        transactionCapsule0.executeOn(hijrahDate0, date0, javaSerializer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionCapsule", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      Date date0 = new Date((long) (byte) (-10));
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.executeOn(byteArray0, date0, xStreamSerializer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unable to deserialize transaction
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      HashMap<BufferedInputStream, Object> hashMap0 = new HashMap<BufferedInputStream, Object>(1);
      Chunk chunk0 = new Chunk(byteArray0, (Map) hashMap0);
      TransactionCapsule transactionCapsule0 = (TransactionCapsule)Capsule.fromChunk(chunk0);
      TransactionCapsule transactionCapsule1 = (TransactionCapsule)transactionCapsule0.cleanCopy();
      assertSame(transactionCapsule1, transactionCapsule0);
  }

  @Test
  public void test12()  throws Throwable  {
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) skaringaSerializer0);
      Chunk chunk0 = transactionWithQueryCapsule0.toChunk();
      TransactionWithQueryCapsule transactionWithQueryCapsule1 = (TransactionWithQueryCapsule)Capsule.fromChunk(chunk0);
      assertNotSame(transactionWithQueryCapsule1, transactionWithQueryCapsule0);
  }

  @Test
  public void test13()  throws Throwable  {
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((byte[]) null);
      byte[] byteArray0 = transactionCapsule0.serialized();
      assertNull(byteArray0);
  }

  @Test
  public void test14()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) xStreamSerializer0);
      Date date0 = new Date();
      // Undeclared exception!
      try { 
        transactionCapsule0.executeOn((Object) null, date0, xStreamSerializer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((byte[]) null);
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      // Undeclared exception!
      try { 
        transactionCapsule0.deserialize(skaringaSerializer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unable to deserialize transaction
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }
}
