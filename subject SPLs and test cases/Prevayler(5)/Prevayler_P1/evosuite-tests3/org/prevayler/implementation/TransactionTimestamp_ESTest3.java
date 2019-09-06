/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 18:42:56 KST 2017
 */

package org.prevayler.implementation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.TransactionWithQuery;
import org.prevayler.foundation.Chunk;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.XStreamSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TransactionTimestamp_ESTest3 extends TransactionTimestamp_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Chunk chunk0 = new Chunk(byteArray0);
      TransactionCapsule transactionCapsule0 = (TransactionCapsule)Capsule.fromChunk(chunk0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (long) (byte)0, date0);
      long long0 = transactionTimestamp0.systemVersion();
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) xStreamSerializer0);
      Date date0 = new Date((-2831L));
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, 740L, date0);
      long long0 = transactionTimestamp0.systemVersion();
      assertEquals(740L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Date date0 = new Date((-1L));
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (long) (byte)0, date0);
      Chunk chunk0 = transactionTimestamp0.toChunk();
      TransactionTimestamp transactionTimestamp1 = TransactionTimestamp.fromChunk(chunk0);
      assertEquals(0L, transactionTimestamp1.systemVersion());
  }

  @Test
  public void test03()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) xStreamSerializer0);
      Date date0 = new Date((-2831L));
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, 740L, date0);
      Chunk chunk0 = transactionTimestamp0.toChunk();
      TransactionTimestamp transactionTimestamp1 = TransactionTimestamp.fromChunk(chunk0);
      assertEquals(740L, transactionTimestamp0.systemVersion());
      assertEquals(740L, transactionTimestamp1.systemVersion());
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Date date0 = new Date((-1L));
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (long) (byte)0, date0);
      TransactionTimestamp transactionTimestamp1 = transactionTimestamp0.cleanCopy();
      assertEquals(0L, transactionTimestamp1.systemVersion());
  }

  @Test
  public void test05()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) xStreamSerializer0);
      Date date0 = new Date((-2831L));
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, 740L, date0);
      TransactionTimestamp transactionTimestamp1 = transactionTimestamp0.cleanCopy();
      assertEquals(740L, transactionTimestamp0.systemVersion());
      assertEquals(740L, transactionTimestamp1.systemVersion());
  }

  @Test
  public void test06()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      Date date0 = new Date(0L);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, 0L, date0);
      transactionTimestamp0.capsule();
      assertEquals(0L, transactionTimestamp0.systemVersion());
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, (-734L), date0);
      TransactionTimestamp transactionTimestamp1 = transactionTimestamp0.cleanCopy();
      assertEquals((-734L), transactionTimestamp0.systemVersion());
      assertEquals((-734L), transactionTimestamp1.systemVersion());
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Chunk chunk0 = new Chunk(byteArray0);
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      TransactionTimestamp transactionTimestamp0 = null;
      try {
        transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, 1L, (Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionTimestamp", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, (-734L), date0);
      long long0 = transactionTimestamp0.systemVersion();
      assertEquals((-734L), long0);
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Date date0 = new Date((-1L));
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (long) (byte)0, date0);
      Date date1 = transactionTimestamp0.executionTime();
      assertEquals(0L, transactionTimestamp0.systemVersion());
      assertEquals("Thu Jan 01 08:59:59 KST 1970", date1.toString());
  }

  @Test
  public void test13()  throws Throwable  {
      Date date0 = new Date((-2332L));
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, 0L, date0);
      transactionTimestamp0.capsule();
      assertEquals(0L, transactionTimestamp0.systemVersion());
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, (-734L), date0);
      Chunk chunk0 = transactionTimestamp0.toChunk();
      TransactionTimestamp.fromChunk(chunk0);
      //  // Unstable assertion: assertEquals("Fri Apr 07 18:42:50 KST 2017", date0.toString());
  }

  @Test
  public void test15()  throws Throwable  {
      Date date0 = new Date((-483L));
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, (-483L), date0);
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
