/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:34:54 KST 2017
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
public class DatabaseUtil_ESTest1 extends DatabaseUtil_ESTest_scaffolding1 {

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
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartial(true);
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
      byte[] byteArray0 = new byte[8];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 0, (int) (byte) (-30));
      DatabaseUtil.checkForPartialKey(databaseEntry0);
      assertEquals(0, databaseEntry0.getPartialOffset());
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseUtil.checkForNullDbt(databaseEntry0, "?G(tOakB~", true);
      assertEquals(0, databaseEntry0.getPartialOffset());
  }

  @Test
  public void test4()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DatabaseUtil.checkForNullDbt(databaseEntry0, " size=", false);
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        DatabaseUtil.checkForNullDbt((DatabaseEntry) null, "", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatabaseEntry  cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        DatabaseUtil.checkForNullDbt(databaseEntry0, " +;{49foPyq|M", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Data field for DatabaseEntry  +;{49foPyq|M cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        DatabaseUtil.checkForNullParam((Object) null, "Data field for DatabaseEntry ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Data field for DatabaseEntry  cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Object object0 = new Object();
      DatabaseUtil.checkForNullParam(object0, "");
  }

  @Test
  public void test9()  throws Throwable  {
      DatabaseUtil databaseUtil0 = new DatabaseUtil();
  }
}
