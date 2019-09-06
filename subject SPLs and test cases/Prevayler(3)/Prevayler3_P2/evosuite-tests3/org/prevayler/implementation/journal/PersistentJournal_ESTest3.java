/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 18:47:13 KST 2017
 */

package org.prevayler.implementation.journal;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.foundation.monitor.Monitor;
import org.prevayler.foundation.monitor.NullMonitor;
import org.prevayler.foundation.monitor.SimpleMonitor;
import org.prevayler.implementation.PrevaylerDirectory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class PersistentJournal_ESTest3 extends PersistentJournal_ESTest_scaffolding3 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void clearEvoSuiteFramework() {
String a = "aa";
}

  @Test
  public void test0()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      SimpleMonitor simpleMonitor0 = new SimpleMonitor();
      PersistentJournal persistentJournal0 = null;
      try {
        persistentJournal0 = new PersistentJournal(prevaylerDirectory0, 0L, 806L, (String) null, (Monitor) simpleMonitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("");
      PersistentJournal persistentJournal0 = null;
      try {
        persistentJournal0 = new PersistentJournal(prevaylerDirectory0, 2L, 2L, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Journal filename suffix must match /[a-zA-Z0-9]*[Jj]ournal/, but '' does not
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      PersistentJournal persistentJournal0 = null;
      try {
        persistentJournal0 = new PersistentJournal(prevaylerDirectory0, 0L, (-2652L), "journal");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.FileManager", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("p");
      NullMonitor nullMonitor0 = new NullMonitor();
      PersistentJournal persistentJournal0 = null;
      try {
        persistentJournal0 = new PersistentJournal(prevaylerDirectory0, 0L, 2700L, "lKn", (Monitor) nullMonitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Journal filename suffix must match /[a-zA-Z0-9]*[Jj]ournal/, but 'lKn' does not
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }
}
