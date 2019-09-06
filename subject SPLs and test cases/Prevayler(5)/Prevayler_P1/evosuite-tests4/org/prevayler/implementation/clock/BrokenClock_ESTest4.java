/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 12:21:24 KST 2017
 */

package org.prevayler.implementation.clock;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.Instant;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class BrokenClock_ESTest4 extends BrokenClock_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      BrokenClock brokenClock0 = new BrokenClock();
      // Undeclared exception!
      try { 
        brokenClock0.advanceTo((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.clock.BrokenClock", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      BrokenClock brokenClock0 = null;
      try {
        brokenClock0 = new BrokenClock((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.clock.BrokenClock", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Date date0 = new Date(1726L);
      BrokenClock brokenClock0 = new BrokenClock(date0);
  }

  @Test
  public void test3()  throws Throwable  {
      BrokenClock brokenClock0 = new BrokenClock();
      Instant instant0 = Instant.ofEpochSecond((-7021L));
      Date date0 = Date.from(instant0);
      brokenClock0.advanceTo(date0);
      brokenClock0.advanceTo(date0);
      assertEquals("Thu Jan 01 07:02:59 KST 1970", date0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      BrokenClock brokenClock0 = new BrokenClock();
      Date date0 = new Date(849L);
      brokenClock0.advanceTo(date0);
      assertEquals("Thu Jan 01 09:00:00 KST 1970", date0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      BrokenClock brokenClock0 = new BrokenClock();
      Date date0 = brokenClock0.time();
      assertEquals("Thu Jan 01 09:00:00 KST 1970", date0.toString());
  }
}
