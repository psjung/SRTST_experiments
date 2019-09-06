/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 10:14:35 KST 2017
 */

package org.prevayler.demos.scalability;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Record_ESTest4 extends Record_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      Record record0 = new Record(0L);
      record0.getString1();
  }

  @Test
  public void test01()  throws Throwable  {
      Record record0 = new Record(0L);
      record0.getName();
  }

  @Test
  public void test02()  throws Throwable  {
      Record record0 = new Record(0L);
      record0.getId();
  }

  @Test
  public void test03()  throws Throwable  {
      Record record0 = new Record(730L);
      long long0 = record0.getId();
      assertEquals(730L, long0);
  }

  @Test
  public void test04()  throws Throwable  {
      Date date0 = new Date();
      Record record0 = new Record((-451L), (String) null, "&$ug-exrI)tAa^", (BigDecimal) null, (BigDecimal) null, date0, date0);
      record0.getBigDecimal2();
      assertEquals((-451L), record0.getId());
  }

  @Test
  public void test05()  throws Throwable  {
      Date date0 = new Date();
      Record record0 = new Record((-451L), (String) null, "&$ug-exrI)tAa^", (BigDecimal) null, (BigDecimal) null, date0, date0);
      record0.getBigDecimal1();
      assertEquals((-451L), record0.getId());
  }

  @Test
  public void test06()  throws Throwable  {
      Date date0 = new Date(0L);
      Record record0 = new Record(0L, (String) null, (String) null, (BigDecimal) null, (BigDecimal) null, date0, date0);
      // Undeclared exception!
      try { 
        record0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.Record", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Record record0 = null;
      try {
        record0 = new Record((-1L), (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.Record", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Random random0 = new Random(0L);
      Record record0 = new Record(0L, random0);
      assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0", record0.getString1());
  }

  @Test
  public void test10()  throws Throwable  {
      Record record0 = new Record(730L);
      record0.hashCode();
      assertEquals(730L, record0.getId());
  }

  @Test
  public void test11()  throws Throwable  {
      Date date0 = new Date(0L);
      Record record0 = new Record(0L, (String) null, (String) null, (BigDecimal) null, (BigDecimal) null, date0, date0);
      String string0 = record0.getString1();
      assertNull(string0);
  }

  @Test
  public void test12()  throws Throwable  {
      Record record0 = new Record(730L);
      Date date0 = record0.getDate1();
      //  // Unstable assertion: assertEquals("Thu Jan 01 11:06:57 KST 1970", date0.toString());
  }

  @Test
  public void test13()  throws Throwable  {
      Record record0 = new Record((-176L));
      long long0 = record0.getId();
      assertEquals((-176L), long0);
  }

  @Test
  public void test14()  throws Throwable  {
      Record record0 = new Record(730L);
      BigDecimal bigDecimal0 = record0.getBigDecimal2();
      //  // Unstable assertion: assertEquals(-95, bigDecimal0.byteValue());
  }

  @Test
  public void test15()  throws Throwable  {
      Record record0 = new Record((-176L));
      Date date0 = record0.getDate2();
      //  // Unstable assertion: assertEquals("Thu Jan 01 09:02:14 KST 1970", date0.toString());
  }

  @Test
  public void test16()  throws Throwable  {
      Record record0 = new Record((-176L));
      BigDecimal bigDecimal0 = record0.getBigDecimal1();
      //  // Unstable assertion: assertEquals(1118, bigDecimal0.shortValue());
  }

  @Test
  public void test17()  throws Throwable  {
      Date date0 = new Date(0L);
      Record record0 = new Record(0L, (String) null, (String) null, (BigDecimal) null, (BigDecimal) null, date0, date0);
      String string0 = record0.getName();
      assertNull(string0);
  }
}
