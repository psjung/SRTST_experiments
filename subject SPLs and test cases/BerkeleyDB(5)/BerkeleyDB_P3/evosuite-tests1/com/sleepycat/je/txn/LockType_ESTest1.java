/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:08:01 KST 2017
 */

package com.sleepycat.je.txn;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.txn.LockConflict;
import com.sleepycat.je.txn.LockType;
import com.sleepycat.je.txn.LockUpgrade;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LockType_ESTest1 extends LockType_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      LockType lockType0 = LockType.RANGE_WRITE;
      boolean boolean0 = lockType0.isWriteLock();
      assertTrue(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      LockType lockType0 = LockType.READ;
      LockType lockType1 = LockType.RANGE_WRITE;
      LockUpgrade lockUpgrade0 = lockType0.getUpgrade(lockType1);
      assertNotNull(lockUpgrade0);
  }

  @Test
  public void test02()  throws Throwable  {
      LockType lockType0 = LockType.RANGE_INSERT;
      LockType lockType1 = LockType.RANGE_WRITE;
      LockConflict lockConflict0 = lockType0.getConflict(lockType1);
      assertNotNull(lockConflict0);
  }

  @Test
  public void test03()  throws Throwable  {
      LockType lockType0 = LockType.RANGE_READ;
      boolean boolean0 = lockType0.getCausesRestart();
      assertTrue(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      LockType lockType0 = LockType.RANGE_READ;
      // Undeclared exception!
      try { 
        lockType0.getUpgrade((LockType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.LockType", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      LockType lockType0 = LockType.READ;
      LockType lockType1 = LockType.NONE;
      // Undeclared exception!
      try { 
        lockType1.getUpgrade(lockType0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         assertThrownBy("com.sleepycat.je.txn.LockType", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      LockType lockType0 = LockType.RANGE_INSERT;
      // Undeclared exception!
      try { 
        lockType0.getConflict((LockType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.LockType", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      LockType lockType0 = LockType.WRITE;
      LockType lockType1 = LockType.NONE;
      // Undeclared exception!
      try { 
        lockType0.getConflict(lockType1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         assertThrownBy("com.sleepycat.je.txn.LockType", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      LockType lockType0 = LockType.RANGE_INSERT;
      String string0 = lockType0.toString();
      assertEquals("RANGE_INSERT", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      LockType lockType0 = LockType.RANGE_INSERT;
      LockUpgrade lockUpgrade0 = lockType0.getUpgrade(lockType0);
      assertNotNull(lockUpgrade0);
  }

  @Test
  public void test11()  throws Throwable  {
      LockType lockType0 = LockType.RANGE_INSERT;
      LockConflict lockConflict0 = lockType0.getConflict(lockType0);
      assertNotNull(lockConflict0);
  }

  @Test
  public void test12()  throws Throwable  {
      LockType lockType0 = LockType.READ;
      boolean boolean0 = lockType0.getCausesRestart();
      assertFalse(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      LockType lockType0 = LockType.READ;
      boolean boolean0 = lockType0.isWriteLock();
      assertFalse(boolean0);
  }
}
