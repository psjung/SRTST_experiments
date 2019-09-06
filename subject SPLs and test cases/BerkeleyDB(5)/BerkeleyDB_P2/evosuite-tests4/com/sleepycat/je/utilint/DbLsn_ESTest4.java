/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 16:57:51 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.log.FileManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbLsn_ESTest4 extends DbLsn_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      long long0 = DbLsn.makeLsn(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      long long0 = DbLsn.makeLsn(1, 1);
      assertEquals(4294967297L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      Long long0 = new Long(0L);
      long long1 = DbLsn.longToLsn(long0);
      assertTrue(long0.equals((Object)long1));
  }

  @Test
  public void test03()  throws Throwable  {
      long long0 = DbLsn.getFileOffset((-1392L));
      assertEquals(4294965904L, long0);
  }

  @Test
  public void test04()  throws Throwable  {
      long long0 = DbLsn.getFileNumber(0);
      assertEquals(0L, long0);
  }

  @Test
  public void test05()  throws Throwable  {
      long long0 = DbLsn.getWithCleaningDistance(795L, (FileManager) null, 795L, 795L);
      assertEquals(0L, long0);
  }

  @Test
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbLsn.getWithCleaningDistance((-4111L), (FileManager) null, 795L, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.DbLsn", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      long long0 = DbLsn.getNoCleaningDistance(1L, 4294967296L, 0L);
      assertEquals((-1L), long0);
  }

  @Test
  public void test08()  throws Throwable  {
      long long0 = DbLsn.getNoCleaningDistance((-4989L), 4294967423L, 521L);
      assertEquals(2241972922354L, long0);
  }

  @Test
  public void test09()  throws Throwable  {
      long long0 = DbLsn.getNoCleaningDistance((-5029406702939L), 677L, 4294967295L);
      assertEquals((-5033701669741L), long0);
  }

  @Test
  public void test10()  throws Throwable  {
      long long0 = DbLsn.getNoCleaningDistance(0L, 0L, 1L);
      assertEquals(0L, long0);
  }

  @Test
  public void test11()  throws Throwable  {
      long long0 = DbLsn.getNoCleaningDistance(127L, 648L, 127L);
      assertEquals(521L, long0);
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = DbLsn.compareTo(1884L, 0);
      assertEquals(1, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbLsn.dumpString(2561L, (-3259));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3259
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      long long0 = DbLsn.getFileNumber((-1L));
      assertEquals(4294967295L, long0);
  }

  @Test
  public void test15()  throws Throwable  {
      long long0 = DbLsn.getWithCleaningDistance(1160L, (FileManager) null, (-1L), 5514738009348L);
      assertEquals(1160L, long0);
  }

  @Test
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbLsn.getWithCleaningDistance(4294967295L, (FileManager) null, (-4709L), (-1108L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.DbLsn", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      long long0 = DbLsn.getNoCleaningDistance((-255L), (-1L), 5514738009348L);
      assertEquals(4294965757L, long0);
  }

  @Test
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbLsn.compareTo(1714L, (-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.DbLsn", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbLsn.compareTo((-1L), (-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.DbLsn", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      int int0 = DbLsn.compareTo((-2424L), (-2424L));
      assertEquals(0, int0);
  }

  @Test
  public void test23()  throws Throwable  {
      int int0 = DbLsn.compareTo(4294967423L, (-4989L));
      assertEquals((-1), int0);
  }

  @Test
  public void test24()  throws Throwable  {
      int int0 = DbLsn.compareTo((-1083L), 1L);
      assertEquals(1, int0);
  }

  @Test
  public void test25()  throws Throwable  {
      long long0 = DbLsn.longToLsn((Long) null);
      assertEquals((-1L), long0);
  }

  @Test
  public void test26()  throws Throwable  {
      Long long0 = new Long(1894L);
      long long1 = DbLsn.longToLsn(long0);
      assertEquals(1894L, long1);
  }

  @Test
  public void test27()  throws Throwable  {
      String string0 = DbLsn.dumpString(127L, 1);
      assertEquals(" <DbLsn val=\"0x0/0x7f\"/>", string0);
  }

  @Test
  public void test28()  throws Throwable  {
      long long0 = DbLsn.makeLsn((-4089L), 0L);
      assertEquals((-17562121273344L), long0);
  }

  @Test
  public void test29()  throws Throwable  {
      long long0 = DbLsn.getNoCleaningDistance(4294967296L, (-4089L), (-4089L));
      assertEquals((-17557826301959L), long0);
  }

  @Test
  public void test30()  throws Throwable  {
      String string0 = DbLsn.getNoFormatString((-17562121273344L));
      assertEquals("0xfffff007/0x0", string0);
  }

  @Test
  public void test31()  throws Throwable  {
      String string0 = DbLsn.toString(0L);
      assertEquals("<DbLsn val=\"0x0/0x0\"/>", string0);
  }

  @Test
  public void test32()  throws Throwable  {
      long long0 = DbLsn.getFileOffset(4294967296L);
      assertEquals(0L, long0);
  }
}
