/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 22:57:09 KST 2017
 */

package org.prevayler.implementation.clock;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class MachineClock_ESTest5 extends MachineClock_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      Clock clock0 = Clock.systemDefaultZone();
      ChronoUnit chronoUnit0 = ChronoUnit.YEARS;
      Duration duration0 = chronoUnit0.getDuration();
      Clock clock1 = Clock.offset(clock0, duration0);
      Instant instant0 = clock1.instant();
      Date date0 = Date.from(instant0);
      machineClock0.advanceTo(date0);
      Date date1 = machineClock0.time();
      //  // Unstable assertion: assertEquals("Thu Apr 06 22:57:07 KST 2017", date1.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      Date date0 = machineClock0.time();
      Date date1 = machineClock0.time();
      //  // Unstable assertion: assertNotSame(date1, date0);
      //  // Unstable assertion: assertEquals("Thu Apr 06 22:57:07 KST 2017", date1.toString());
  }
}
