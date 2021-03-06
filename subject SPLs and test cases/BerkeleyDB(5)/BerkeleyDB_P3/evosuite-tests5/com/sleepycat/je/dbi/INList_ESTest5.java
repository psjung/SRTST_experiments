/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:31:05 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.SortedSet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.latch.LatchNotHeldException;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.IN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class INList_ESTest5 extends INList_ESTest_scaffolding5 {

  @Test
  public void test02()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.latchMinorAndDumpAddedINs();
  }

  @Test
  public void test03()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.hook338((EnvironmentImpl) null);
  }

  @Test
  public void test05()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      try { 
        iNList0.releaseMajorLatch();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // com.sleepycat.je.dbi.INList Major Latch not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      int int0 = iNList0.getSize();
      assertEquals(0, int0);
  }

  @Test
  public void test07()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.releaseMajorLatchIfHeld();
  }

  @Test
  public void test08()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        iNList0.latchMajor();
       //  fail("Expecting exception: AssertionError");
       // Unstable assertion
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.INList", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      boolean boolean0 = iNList0.hook341((IN) null, true);
      assertTrue(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      INList.INList_add iNList_INList_add0 = new INList.INList_add((INList) null, dBIN0);
      iNList_INList_add0.enteredWithLatchHeld = true;
      // Undeclared exception!
      try { 
        iNList_INList_add0.hook343();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.INList", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      try { 
        iNList0.hook342();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // com.sleepycat.je.dbi.INList Minor Latch not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.dump();
  }

  @Test
  public void test16()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      boolean boolean0 = iNList0.hook341((IN) null, false);
      assertFalse(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      SortedSet sortedSet0 = iNList0.getINs();
      assertEquals(0, sortedSet0.size());
  }

  @Test
  public void test18()  throws Throwable  {
      INList iNList0 = null;
      try {
        iNList0 = new INList((INList) null, (EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.INList", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.hook339((EnvironmentImpl) null);
  }

  @Test
  public void test21()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.hook340();
  }

  
}
