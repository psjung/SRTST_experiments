/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:55:00 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FileHeader_ESTest4 extends FileHeader_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader();
      long long0 = fileHeader0.getLastEntryInPrevFileOffset();
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader();
      try { 
        fileHeader0.validate("<FileHeader num=\"0x0\" lastEntryInPrevFileOffset=\"0x0\" logVersion=\"0x0\" time=\"null\"/>", (-2320L));
        fail("Expecting exception: LogException");
      
      } catch(LogException e) {
         //
         // Wrong filenum in header for file <FileHeader num=\"0x0\" lastEntryInPrevFileOffset=\"0x0\" logVersion=\"0x0\" time=\"null\"/> expected -2320 got 0
         //
         assertThrownBy("com.sleepycat.je.log.FileHeader", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader(1151L, 3959L);
      long long0 = fileHeader0.getLastEntryInPrevFileOffset();
      assertEquals(3959L, long0);
  }

  @Test
  public void test03()  throws Throwable  {
      int int0 = FileHeader.entrySize();
      assertEquals(24, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader();
      // Undeclared exception!
      try { 
        fileHeader0.readFromLog((ByteBuffer) null, (byte)1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader();
      // Undeclared exception!
      try { 
        fileHeader0.dumpLog((StringBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileHeader", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader(6L, 6L);
      boolean boolean0 = fileHeader0.validate("<FileHeader num=\"0x6\" lastEntryInPrevFileOffset=\"0x6\" logVersion=\"0x3\" time=\"2017-04-22 14:54:51.098\"/>", 6L);
      assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader((-1465L), (-1465L));
      try { 
        fileHeader0.validate("0OZYF7s#m..", (byte) (-52));
        fail("Expecting exception: LogException");
      
      } catch(LogException e) {
         //
         // Wrong filenum in header for file 0OZYF7s#m.. expected -52 got -1465
         //
         assertThrownBy("com.sleepycat.je.log.FileHeader", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader();
      boolean boolean0 = fileHeader0.validate("OhcFGwHyuZB?<32e_~", 0L);
      assertTrue(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader(6L, 6L);
      fileHeader0.postLogWork(6L);
      assertTrue(fileHeader0.marshallOutsideWriteLatch());
  }

  @Test
  public void test10()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader((-1465L), (-1465L));
      long long0 = fileHeader0.getLastEntryInPrevFileOffset();
      assertEquals((-1465L), long0);
  }

  @Test
  public void test11()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader(6L, 6L);
      boolean boolean0 = fileHeader0.logEntryIsTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader();
      LogEntryType logEntryType0 = fileHeader0.getLogType();
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test13()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader();
      String string0 = fileHeader0.toString();
      assertEquals("<FileHeader num=\"0x0\" lastEntryInPrevFileOffset=\"0x0\" logVersion=\"0x0\" time=\"null\"/>", string0);
  }

  @Test
  public void test14()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader();
      boolean boolean0 = fileHeader0.marshallOutsideWriteLatch();
      assertTrue(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader((-1465L), (-1465L));
      long long0 = fileHeader0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test16()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader(0L, 0L);
      boolean boolean0 = fileHeader0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader(0L, 0L);
      // Undeclared exception!
      try { 
        fileHeader0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader((-1465L), (-1465L));
      int int0 = fileHeader0.getLogSize();
      assertEquals(24, int0);
  }
}