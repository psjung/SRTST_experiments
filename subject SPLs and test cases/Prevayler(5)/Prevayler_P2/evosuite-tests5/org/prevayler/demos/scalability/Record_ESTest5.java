/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 19:56:26 KST 2017
 */

package org.prevayler.demos.scalability;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.Random;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Record_ESTest5 extends Record_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      Record record0 = new Record((-1125L));
      String string0 = record0.getString1();
      assertEquals((-1125L), record0.getId());
      assertNull(string0);
  }

  @Test
  public void test01()  throws Throwable  {
      Record record0 = new Record((-1125L));
      String string0 = record0.getName();
      assertNotNull(string0);
      assertEquals((-1125L), record0.getId());
  }

  @Test
  public void test02()  throws Throwable  {
      Record record0 = new Record(147L);
      long long0 = record0.getId();
      assertEquals(147L, long0);
  }

  @Test
  public void test03()  throws Throwable  {
      Date date0 = new Date();
      Record record0 = new Record(1L, "", "", (BigDecimal) null, (BigDecimal) null, date0, date0);
      record0.getBigDecimal2();
      assertEquals(1L, record0.getId());
  }

  @Test
  public void test04()  throws Throwable  {
      Record record0 = new Record(147L);
      BigDecimal bigDecimal0 = record0.getBigDecimal1();
      //  // Unstable assertion: assertEquals(-12048, bigDecimal0.shortValue());
  }

  @Test
  public void test05()  throws Throwable  {
      Date date0 = new Date();
      Record record0 = new Record(1L, "", "", (BigDecimal) null, (BigDecimal) null, date0, date0);
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
      Random random0 = new Random();
      Record record0 = new Record((-839L), random0);
      assertEquals((-839L), record0.getId());
  }

  @Test
  public void test09()  throws Throwable  {
      Record record0 = new Record((-1L));
      long long0 = record0.getId();
      assertEquals((-1L), long0);
  }

  @Test
  public void test10()  throws Throwable  {
      Record record0 = new Record(0L);
      record0.hashCode();
  }

  @Test
  public void test11()  throws Throwable  {
      Record record0 = new Record(0L);
      record0.getString1();
  }

  @Test
  public void test12()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      Instant instant0 = Instant.now();
      Date date0 = Date.from(instant0);
      Record record0 = new Record((-3255L), (String) null, (String) null, bigDecimal0, bigDecimal0, date0, date0);
      Date date1 = record0.getDate1();
      //  // Unstable assertion: assertEquals("Thu Apr 06 19:56:13 KST 2017", date1.toString());
      //  // Unstable assertion: assertEquals((-3255L), record0.getId());
  }

  @Test
  public void test13()  throws Throwable  {
      Record record0 = new Record(0L);
      record0.getId();
  }

  @Test
  public void test14()  throws Throwable  {
      Random random0 = new Random((-1L));
      Record record0 = new Record(0L, random0);
      record0.getBigDecimal2();
  }

  @Test
  public void test15()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      Instant instant0 = Instant.now();
      Date date0 = Date.from(instant0);
      Record record0 = new Record((-3255L), (String) null, (String) null, bigDecimal0, bigDecimal0, date0, date0);
      Date date1 = record0.getDate2();
      //  // Unstable assertion: assertEquals("Thu Apr 06 19:56:07 KST 2017", date1.toString());
      //  // Unstable assertion: assertEquals((-3255L), record0.getId());
  }

  @Test
  public void test16()  throws Throwable  {
      Instant instant0 = Instant.now();
      Date date0 = Date.from(instant0);
      Record record0 = new Record(517L, "", "", (BigDecimal) null, (BigDecimal) null, date0, date0);
      record0.getBigDecimal1();
      assertEquals(517L, record0.getId());
  }

  @Test
  public void test17()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      Instant instant0 = Instant.now();
      Date date0 = Date.from(instant0);
      Record record0 = new Record((-3255L), (String) null, (String) null, bigDecimal0, bigDecimal0, date0, date0);
      record0.getName();
      assertEquals((-3255L), record0.getId());
  }
}
