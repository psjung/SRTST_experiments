/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:28:06 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.txn.Locker;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Cursor_ESTest1 extends Cursor_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      Cursor cursor0 = null;
      try {
        cursor0 = new Cursor((Database) null, (Locker) null, (CursorConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Cursor", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.DEFAULT;
      Cursor cursor0 = null;
      try {
        cursor0 = new Cursor((Database) null, (Locker) null, cursorConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Cursor", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Cursor cursor0 = null;
      try {
        cursor0 = new Cursor((Cursor) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Cursor", e);
      }
  }

  
}
