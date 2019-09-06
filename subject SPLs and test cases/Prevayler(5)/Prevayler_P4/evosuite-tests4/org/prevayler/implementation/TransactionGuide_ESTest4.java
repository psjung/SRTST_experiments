/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 12:19:21 KST 2017
 */

package org.prevayler.implementation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.TransactionWithQuery;
import org.prevayler.foundation.Chunk;
import org.prevayler.foundation.Turn;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.XStreamSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TransactionGuide_ESTest4 extends TransactionGuide_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide((TransactionTimestamp) null, turn0);
      TransactionTimestamp transactionTimestamp0 = transactionGuide0.timestamp();
      assertNull(transactionTimestamp0);
  }

  @Test
  public void test01()  throws Throwable  {
      Date date0 = new Date(0L);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, 0L, date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      TransactionTimestamp transactionTimestamp1 = transactionGuide0.timestamp();
      assertSame(transactionTimestamp0, transactionTimestamp1);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      Date date0 = new Date((long) (byte)0);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, (long) (byte)1, date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      TransactionTimestamp transactionTimestamp1 = transactionGuide0.timestamp();
      assertSame(transactionTimestamp1, transactionTimestamp0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      Date date0 = new Date((-1L));
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, 0L, date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      // Undeclared exception!
      try { 
        transactionGuide0.checkSystemVersion((-1L));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Attempted to process 0 when ready for -1
         //
         assertThrownBy("org.prevayler.implementation.TransactionGuide", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide((TransactionTimestamp) null, turn0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        transactionGuide0.writeTo(pipedOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionGuide", e);
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
        transactionGuide0.checkSystemVersion((-4150L));
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
      byte[] byteArray0 = new byte[2];
      Chunk chunk0 = new Chunk(byteArray0);
      TransactionCapsule transactionCapsule0 = (TransactionCapsule)Capsule.fromChunk(chunk0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (-3032L), date0);
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, (Turn) null);
      // Undeclared exception!
      try { 
        transactionGuide0.checkSystemVersion(2302L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Attempted to process -3032 when ready for 2302
         //
         assertThrownBy("org.prevayler.implementation.TransactionGuide", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      Date date0 = new Date((-1L));
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, 0L, date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      transactionGuide0.checkSystemVersion((byte)0);
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (long) (byte) (-71), date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      TransactionTimestamp transactionTimestamp1 = transactionGuide0.timestamp();
      assertSame(transactionTimestamp1, transactionTimestamp0);
  }

  @Test
  public void test10()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) xStreamSerializer0);
      Date date0 = new Date(0L);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, 0L, date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      Date date1 = transactionGuide0.executionTime();
      assertNotSame(date0, date1);
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (long) (byte)0, date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) pipedOutputStream0, true);
      transactionGuide0.writeTo(printStream0);
  }
}