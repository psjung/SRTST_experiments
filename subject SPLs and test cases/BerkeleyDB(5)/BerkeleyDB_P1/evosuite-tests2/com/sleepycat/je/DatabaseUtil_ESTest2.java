/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:46:06 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DatabaseUtil_ESTest2 extends DatabaseUtil_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        DatabaseUtil.checkForPartialKey((DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setPartial(0, 0, true);
      // Undeclared exception!
      try { 
        DatabaseUtil.checkForPartialKey(databaseEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A partial key DatabaseEntry is not allowed
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DatabaseUtil.checkForPartialKey(databaseEntry0);
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test3()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        DatabaseUtil.checkForNullDbt(databaseEntry0, "ttTJ.3N_[I0y", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Data field for DatabaseEntry ttTJ.3N_[I0y cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseUtil.checkForNullDbt(databaseEntry0, "_)", false);
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        DatabaseUtil.checkForNullDbt((DatabaseEntry) null, "<DatabaseEntry dlen=0 doff=0 doff=0 offset=0 size=0>", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatabaseEntry <DatabaseEntry dlen=0 doff=0 doff=0 offset=0 size=0> cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 749, 1050);
      DatabaseUtil.checkForNullDbt(databaseEntry0, "(", true);
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        DatabaseUtil.checkForNullParam((Object) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      DatabaseUtil.checkForNullParam("A partial key DatabaseEntry is not allowed", "DatabaseEntry ");
  }

  @Test
  public void test9()  throws Throwable  {
      DatabaseUtil databaseUtil0 = new DatabaseUtil();
  }
}
