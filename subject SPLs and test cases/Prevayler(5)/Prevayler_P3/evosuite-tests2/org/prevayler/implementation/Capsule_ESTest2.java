/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:47:48 KST 2017
 */

package org.prevayler.implementation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.Date;

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
public class Capsule_ESTest2 extends Capsule_ESTest_scaffolding2 {

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
      JavaSerializer javaSerializer0 = new JavaSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      TransactionWithQueryCapsule transactionWithQueryCapsule1 = (TransactionWithQueryCapsule)transactionWithQueryCapsule0.cleanCopy();
      assertFalse(transactionWithQueryCapsule0.equals((Object)transactionWithQueryCapsule1));
  }

  @Test
  public void test02()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("qpoi~d{ \"");
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
  public void test03()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) javaSerializer0);
      Chunk chunk0 = transactionCapsule0.toChunk();
      Date date0 = new Date();
      // Undeclared exception!
      try { 
        transactionCapsule0.justExecute((Object) null, chunk0, date0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionCapsule", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      Integer integer0 = new Integer(666);
      Date date0 = new Date((-1104L));
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.justExecute((Object) null, integer0, date0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionWithQueryCapsule", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Chunk chunk0 = transactionCapsule0.toChunk();
      Object object0 = new Object();
      Date date0 = new Date((-1L));
      // Undeclared exception!
      try { 
        transactionCapsule0.justExecute(chunk0, object0, date0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.prevayler.foundation.Chunk cannot be cast to org.prevayler.Transaction
         //
         assertThrownBy("org.prevayler.implementation.TransactionCapsule", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      Date date0 = new Date((long) (byte)0);
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.justExecute(transactionWithQueryCapsule0, transactionWithQueryCapsule0, date0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.prevayler.implementation.TransactionWithQueryCapsule cannot be cast to org.prevayler.TransactionWithQuery
         //
         assertThrownBy("org.prevayler.implementation.TransactionWithQueryCapsule", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      Date date0 = new Date((-1819L));
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.executeOn((Object) null, date0, javaSerializer0);
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
      byte[] byteArray0 = new byte[4];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("Unable to deserialize transaction");
      // Undeclared exception!
      try { 
        transactionCapsule0.executeOn("", (Date) null, xStreamSerializer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unable to deserialize transaction
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      JavaSerializer javaSerializer0 = new JavaSerializer();
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.deserialize(javaSerializer0);
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
      JavaSerializer javaSerializer0 = new JavaSerializer();
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) javaSerializer0);
      Object object0 = transactionCapsule0.deserialize(javaSerializer0);
      assertNull(object0);
  }

  @Test
  public void test12()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      Chunk chunk0 = transactionWithQueryCapsule0.toChunk();
      TransactionWithQueryCapsule transactionWithQueryCapsule1 = (TransactionWithQueryCapsule)Capsule.fromChunk(chunk0);
      assertFalse(transactionWithQueryCapsule1.equals((Object)transactionWithQueryCapsule0));
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Chunk chunk0 = transactionCapsule0.toChunk();
      TransactionCapsule transactionCapsule1 = (TransactionCapsule)Capsule.fromChunk(chunk0);
      assertFalse(transactionCapsule0.equals((Object)transactionCapsule1));
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      byte[] byteArray1 = transactionCapsule0.serialized();
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test
  public void test15()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) xStreamSerializer0);
      Date date0 = new Date();
      // Undeclared exception!
      try { 
        transactionCapsule0.executeOn(transactionCapsule0, date0, xStreamSerializer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionCapsule", e);
      }
  }
}
