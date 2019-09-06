/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:30:19 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.DIN;
import com.sleepycat.je.tree.IN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class INList_ESTest1 extends INList_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      boolean boolean0 = iNList0.hook341((IN) null, false);
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[2];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte)10, byteArray0, (int) (byte)10);
      iNList0.add(dBIN0);
      INList.INList_add iNList_INList_add0 = new INList.INList_add(iNList0, dBIN0);
      iNList0.remove(dBIN0);
      iNList_INList_add0.hook345();
      int int0 = iNList0.getSize();
      assertEquals(1, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[2];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte)9, byteArray0, (int) (byte)9);
      iNList0.add(dBIN0);
      INList.INList_add iNList_INList_add0 = new INList.INList_add(iNList0, dBIN0);
      iNList0.remove(dBIN0);
      iNList_INList_add0.hook345();
      DBIN dBIN1 = (DBIN)iNList0.first();
      //  // Unstable assertion: assertEquals(82L, dBIN1.getLastId());
  }

  @Test
  public void test03()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[2];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte)0, byteArray0, (int) (byte)9);
      iNList0.add(dBIN0);
      INList.INList_add iNList_INList_add0 = new INList.INList_add(iNList0, dBIN0);
      iNList0.remove(dBIN0);
      iNList_INList_add0.hook345();
      iNList0.dump();
  }

  @Test
  public void test04()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DIN dIN0 = new DIN();
      iNList0.add(dIN0);
      DIN dIN1 = (DIN)iNList0.first();
      assertEquals(0, dIN1.getNEntries());
  }

  @Test
  public void test05()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[2];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte)9, byteArray0, (int) (byte)9);
      iNList0.hook346(dBIN0);
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test06()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DIN dIN0 = new DIN();
      boolean boolean0 = iNList0.hook341(dIN0, true);
      assertTrue(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.hook340();
  }

  @Test
  public void test08()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.hook339((EnvironmentImpl) null);
  }

  @Test
  public void test09()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.hook338((EnvironmentImpl) null);
  }

  @Test
  public void test10()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        iNList0.tailSet((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        iNList0.removeLatchAlreadyHeld((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        iNList0.remove((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        iNList0.add((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
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
      SortedSet sortedSet0 = iNList0.getINs();
      assertEquals(0, sortedSet0.size());
  }

  @Test
  public void test18()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DBIN dBIN0 = new DBIN();
      iNList0.add(dBIN0);
      // Undeclared exception!
      try { 
        iNList0.dump();
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
      iNList0.clear();
  }

  @Test
  public void test20()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.hook342();
  }

  @Test
  public void test21()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[2];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte)0, byteArray0, (int) (byte)9);
      SortedSet sortedSet0 = iNList0.tailSet(dBIN0);
      assertEquals(0, sortedSet0.size());
  }

  @Test
  public void test23()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        iNList0.first();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      int int0 = iNList0.getSize();
      assertEquals(0, int0);
  }

  @Test
  public void test25()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      Iterator iterator0 = iNList0.iterator();
      assertNotNull(iterator0);
  }

  @Test
  public void test26()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      INList iNList1 = new INList(iNList0, (EnvironmentImpl) null);
      assertFalse(iNList0.equals((Object)iNList1));
  }

  @Test
  public void test27()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DIN dIN0 = new DIN();
      iNList0.add(dIN0);
      iNList0.removeLatchAlreadyHeld(dIN0);
      assertEquals(0L, dIN0.getTransactionId());
  }
}
