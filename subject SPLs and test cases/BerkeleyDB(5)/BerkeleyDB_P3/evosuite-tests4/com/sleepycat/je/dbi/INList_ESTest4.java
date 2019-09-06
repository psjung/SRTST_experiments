/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:30:25 KST 2017
 */

package com.sleepycat.je.dbi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.dbi.INList;
import com.sleepycat.je.latch.LatchNotHeldException;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.DIN;
import com.sleepycat.je.tree.IN;
import com.sleepycat.je.tree.Tree;
import java.util.SortedSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class INList_ESTest4 extends INList_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      IN iN0 = null;
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
  public void test01()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.hook338((EnvironmentImpl) null);
  }

  @Test
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      int int0 = iNList0.getSize();
      assertEquals(0, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.releaseMajorLatchIfHeld();
  }

  @Test
  public void test06()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      Tree tree0 = new Tree();
      tree0.getRootIN(false);
      iNList0.hook341((IN) null, false);
      iNList0.dump();
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
  public void test08()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      boolean boolean0 = iNList0.hook341((IN) null, true);
      assertTrue(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      INList.INList_add iNList_INList_add0 = new INList.INList_add((INList) null, (IN) null);
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
      INList iNList1 = new INList(iNList0, (EnvironmentImpl) null);
      iNList1.hook346((IN) null);
      assertNotSame(iNList0, iNList1);
  }

  @Test
  public void test15()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      SortedSet sortedSet0 = iNList0.getINs();
      assertTrue(sortedSet0.isEmpty());
  }

  @Test
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.hook339((EnvironmentImpl) null);
  }

  @Test
  public void test19()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.hook340();
  }

  
}
