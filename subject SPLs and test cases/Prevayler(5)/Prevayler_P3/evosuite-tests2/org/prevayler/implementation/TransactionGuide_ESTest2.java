/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:55:39 KST 2017
 */

package org.prevayler.implementation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.time.Instant;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.Transaction;
import org.prevayler.TransactionWithQuery;
import org.prevayler.foundation.Chunk;
import org.prevayler.foundation.Turn;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.XStreamSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TransactionGuide_ESTest2 extends TransactionGuide_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide((TransactionTimestamp) null, turn0);
      TransactionTimestamp transactionTimestamp0 = transactionGuide0.timestamp();
      assertNull(transactionTimestamp0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, 2044L, date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      TransactionTimestamp transactionTimestamp1 = transactionGuide0.timestamp();
      assertEquals(2044L, transactionTimestamp1.systemVersion());
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Instant instant0 = Instant.ofEpochSecond((-2106L));
      Date date0 = Date.from(instant0);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (-3608L), date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      TransactionTimestamp transactionTimestamp1 = transactionGuide0.timestamp();
      assertSame(transactionTimestamp1, transactionTimestamp0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Chunk chunk0 = new Chunk(byteArray0);
      TransactionCapsule transactionCapsule0 = (TransactionCapsule)Capsule.fromChunk(chunk0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (long) (byte) (-127), date0);
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, (Turn) null);
      // Undeclared exception!
      try { 
        transactionGuide0.checkSystemVersion((byte) (-5));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Attempted to process -127 when ready for -5
         //
         assertThrownBy("org.prevayler.implementation.TransactionGuide", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, 0L, date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      // Undeclared exception!
      try { 
        transactionGuide0.writeTo((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.Chunking", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      TransactionGuide transactionGuide0 = new TransactionGuide((TransactionTimestamp) null, (Turn) null);
      // Undeclared exception!
      try { 
        transactionGuide0.executionTime();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionGuide", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide((TransactionTimestamp) null, turn0);
      // Undeclared exception!
      try { 
        transactionGuide0.checkSystemVersion(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionGuide", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) xStreamSerializer0);
      Date date0 = new Date(836L);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, 1L, date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      // Undeclared exception!
      try { 
        transactionGuide0.checkSystemVersion((-538L));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Attempted to process 1 when ready for -538
         //
         assertThrownBy("org.prevayler.implementation.TransactionGuide", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, 0L, date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      transactionGuide0.checkSystemVersion(0L);
  }

  @Test
  public void test09()  throws Throwable  {
      Date date0 = new Date(0L);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, 0L, date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      TransactionTimestamp transactionTimestamp1 = transactionGuide0.timestamp();
      assertSame(transactionTimestamp0, transactionTimestamp1);
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Date date0 = new Date();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, (long) (byte)73, date0);
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, (Turn) null);
      Date date1 = transactionGuide0.executionTime();
      assertTrue(date0.equals((Object)date1));
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Date date0 = new Date();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, (long) (byte)73, date0);
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, (Turn) null);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, (int) (byte)73);
      transactionGuide0.writeTo(bufferedOutputStream0);
  }
}
