/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 04:10:15 KST 2017
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
public class Cursor_ESTest3 extends Cursor_ESTest_scaffolding3 {

  @Test
  public void test3()  throws Throwable  {
      Cursor cursor0 = null;
      try {
        cursor0 = new Cursor((Cursor) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Cursor", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
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
  public void test7()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.READ_UNCOMMITTED;
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

  
}
