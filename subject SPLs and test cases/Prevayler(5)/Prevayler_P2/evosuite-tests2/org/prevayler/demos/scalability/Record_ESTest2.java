/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 19:42:57 KST 2017
 */

package org.prevayler.demos.scalability;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Record_ESTest2 extends Record_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      Record record0 = new Record(0L);
      record0.getString1();
  }

  @Test
  public void test01()  throws Throwable  {
      Record record0 = new Record((-85L));
      Date date0 = record0.getDate2();
      BigDecimal bigDecimal0 = record0.getBigDecimal2();
      Record record1 = new Record((-85L), (String) null, (String) null, bigDecimal0, bigDecimal0, date0, date0);
      record1.getName();
      //  // Unstable assertion: assertEquals(-84, bigDecimal0.byteValue());
      //  // Unstable assertion: assertEquals("Thu Jan 01 10:39:02 KST 1970", date0.toString());
  }

  @Test
  public void test02()  throws Throwable  {
      Record record0 = new Record(10000L);
      record0.getId();
  }

  @Test
  public void test03()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      Clock clock0 = Clock.tickSeconds(zoneId0);
      Instant instant0 = Instant.now(clock0);
      Date date0 = Date.from(instant0);
      Record record0 = new Record(4478L, "", "m-7EASm6$/CwckhNT", (BigDecimal) null, (BigDecimal) null, date0, date0);
      record0.getBigDecimal2();
      assertEquals(4478L, record0.getId());
      assertEquals("m-7EASm6$/CwckhNT", record0.getString1());
  }

  @Test
  public void test04()  throws Throwable  {
      Record record0 = new Record(953L);
      BigDecimal bigDecimal0 = record0.getBigDecimal1();
      //  // Unstable assertion: assertEquals(-8379, bigDecimal0.shortValue());
  }

  @Test
  public void test05()  throws Throwable  {
      Date date0 = new Date(4631L);
      Record record0 = new Record(6009L, (String) null, "", (BigDecimal) null, (BigDecimal) null, date0, date0);
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
  public void test06()  throws Throwable  {
      Record record0 = null;
      try {
        record0 = new Record(1705L, (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.Record", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Record record0 = null;
      try {
        record0 = new Record(1984L, "oiiPExPbb'q", "snapshot", (BigDecimal) null, (BigDecimal) null, (Date) null, (Date) null);
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
      Random random0 = new Random((-85L));
      Record record0 = new Record((-85L), random0);
      assertEquals((-85L), record0.getId());
  }

  @Test
  public void test09()  throws Throwable  {
      Random random0 = new Random(0L);
      Record record0 = new Record(0L, random0);
      assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0", record0.getString1());
  }

  @Test
  public void test10()  throws Throwable  {
      Record record0 = new Record((-85L));
      record0.hashCode();
      assertEquals((-85L), record0.getId());
  }

  @Test
  public void test11()  throws Throwable  {
      Record record0 = new Record((-85L));
      String string0 = record0.getString1();
      assertEquals((-85L), record0.getId());
      assertNull(string0);
  }

  @Test
  public void test12()  throws Throwable  {
      Record record0 = new Record((-85L));
      Date date0 = record0.getDate1();
      //  // Unstable assertion: assertEquals("Thu Jan 01 10:46:28 KST 1970", date0.toString());
  }

  @Test
  public void test13()  throws Throwable  {
      Record record0 = new Record((-85L));
      long long0 = record0.getId();
      assertEquals((-85L), long0);
  }

  @Test
  public void test14()  throws Throwable  {
      Record record0 = new Record((-85L));
      Date date0 = record0.getDate2();
      BigDecimal bigDecimal0 = record0.getBigDecimal2();
      Record record1 = new Record(0L, (String) null, "1", bigDecimal0, (BigDecimal) null, date0, date0);
      record1.getId();
      //  // Unstable assertion: assertEquals(-49, bigDecimal0.byteValue());
      //  // Unstable assertion: assertEquals((-85L), record0.getId());
  }

  @Test
  public void test15()  throws Throwable  {
      Date date0 = new Date();
      Record record0 = new Record(0L, "snapshot", "snapshot", (BigDecimal) null, (BigDecimal) null, date0, date0);
      BigDecimal bigDecimal0 = record0.getBigDecimal1();
      assertNull(bigDecimal0);
  }

  @Test
  public void test16()  throws Throwable  {
      Record record0 = new Record((-85L));
      String string0 = record0.getName();
      assertEquals((-85L), record0.getId());
      assertNotNull(string0);
  }
}