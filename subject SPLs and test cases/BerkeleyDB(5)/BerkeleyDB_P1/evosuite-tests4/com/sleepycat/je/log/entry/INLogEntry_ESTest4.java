/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:23:07 KST 2017
 */

package com.sleepycat.je.log.entry;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.IN;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class INLogEntry_ESTest4 extends INLogEntry_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      long long0 = iNLogEntry0.getLsnOfIN(62L);
      assertEquals(62L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      long long0 = iNLogEntry0.getLsnOfIN((-985L));
      assertEquals((-985L), long0);
  }

  @Test
  public void test02()  throws Throwable  {
      Class<String> class0 = String.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("ps`");
      // Undeclared exception!
      try { 
        iNLogEntry0.readEntry(byteBuffer0, 1540, (byte)2, false);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      // Undeclared exception!
      try { 
        iNLogEntry0.marshallOutsideWriteLatch();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      // Undeclared exception!
      try { 
        iNLogEntry0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("=$]:U-`qtC&[rz6O :");
      // Undeclared exception!
      try { 
        iNLogEntry0.readEntry(byteBuffer0, (-398), (byte)36, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to com.sleepycat.je.tree.IN
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      try { 
        iNLogEntry0.readEntry((ByteBuffer) null, 570, (byte)0, true);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.lang.InstantiationException: java.lang.Integer
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      // Undeclared exception!
      try { 
        iNLogEntry0.getLogType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        iNLogEntry0.readEntry(byteBuffer0, 13, (byte)8, false);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Class<String> class0 = String.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("kLle\u0007|n~wis1\"(&");
      // Undeclared exception!
      try { 
        iNLogEntry0.readEntry(byteBuffer0, 1, (byte)1, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Class<IN> class0 = IN.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      // Undeclared exception!
      try { 
        iNLogEntry0.readEntry((ByteBuffer) null, 1966, (byte) (-122), true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Class<String> class0 = String.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("kLle\u0007|n~wis1\"(&");
      // Undeclared exception!
      try { 
        iNLogEntry0.readEntry(byteBuffer0, 1, (byte)0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Class<String> class0 = String.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      boolean boolean0 = iNLogEntry0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      Class<String> class0 = String.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        iNLogEntry0.dumpEntry(stringBuffer0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      // Undeclared exception!
      try { 
        iNLogEntry0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      INLogEntry iNLogEntry0 = null;
      try {
        iNLogEntry0 = new INLogEntry((IN) dBIN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      DatabaseId databaseId0 = iNLogEntry0.getDbId();
      assertNull(databaseId0);
  }

  @Test
  public void test17()  throws Throwable  {
      Class<String> class0 = String.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      boolean boolean0 = iNLogEntry0.isTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      Class<String> class0 = String.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      long long0 = iNLogEntry0.getObsoleteLsn();
      assertEquals(0L, long0);
  }

  @Test
  public void test19()  throws Throwable  {
      Class<String> class0 = String.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      long long0 = iNLogEntry0.getNodeId();
      assertEquals(0L, long0);
  }

  @Test
  public void test20()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      iNLogEntry0.postLogWork((-573L));
      assertEquals(0L, iNLogEntry0.getObsoleteLsn());
  }

  @Test
  public void test21()  throws Throwable  {
      Class<String> class0 = String.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      long long0 = iNLogEntry0.getLsnOfIN(0L);
      assertEquals(0L, long0);
  }

  @Test
  public void test22()  throws Throwable  {
      Class<String> class0 = String.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      INLogEntry iNLogEntry1 = (INLogEntry)iNLogEntry0.clone();
      assertEquals(0L, iNLogEntry1.getTransactionId());
  }

  @Test
  public void test23()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      IN iN0 = iNLogEntry0.getIN((EnvironmentImpl) null);
      assertNull(iN0);
  }

  @Test
  public void test24()  throws Throwable  {
      Class<String> class0 = String.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      long long0 = iNLogEntry0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test25()  throws Throwable  {
      Class<String> class0 = String.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      Object object0 = iNLogEntry0.getMainItem();
      assertNull(object0);
  }
}
