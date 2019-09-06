/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:20:19 KST 2017
 */

package com.sleepycat.je.log.entry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LogReadable;
import com.sleepycat.je.log.entry.BINDeltaLogEntry;
import com.sleepycat.je.tree.BINDelta;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.IN;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class BINDeltaLogEntry_ESTest4 extends BINDeltaLogEntry_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      Class<BINDelta> class0 = BINDelta.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      BINDelta bINDelta0 = new BINDelta();
      bINDeltaLogEntry0.item = (LogReadable) bINDelta0;
      long long0 = bINDeltaLogEntry0.getLsnOfIN(3068L);
      assertEquals((-1L), long0);
  }

  @Test
  public void test1()  throws Throwable  {
      Class<BINDelta> class0 = BINDelta.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      BINDelta bINDelta0 = new BINDelta();
      bINDeltaLogEntry0.item = (LogReadable) bINDelta0;
      DatabaseId databaseId0 = bINDeltaLogEntry0.getDbId();
      assertEquals(0L, databaseId0.getTransactionId());
  }

  @Test
  public void test2()  throws Throwable  {
      Class<String> class0 = String.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      DupCountLN dupCountLN0 = new DupCountLN(1608);
      bINDeltaLogEntry0.item = (LogReadable) dupCountLN0;
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getLsnOfIN((-2532L));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.DupCountLN cannot be cast to com.sleepycat.je.tree.BINDelta
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Class<String> class0 = String.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      DupCountLN dupCountLN0 = new DupCountLN();
      bINDeltaLogEntry0.item = (LogReadable) dupCountLN0;
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getIN((EnvironmentImpl) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.DupCountLN cannot be cast to com.sleepycat.je.tree.BINDelta
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      IN iN0 = new IN();
      bINDeltaLogEntry0.item = (LogReadable) iN0;
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getDbId();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.IN cannot be cast to com.sleepycat.je.tree.BINDelta
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Class<BINDelta> class0 = BINDelta.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getDbId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Class<String> class0 = String.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getIN((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      Class<BINDelta> class0 = BINDelta.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getLsnOfIN(3068L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }
}
