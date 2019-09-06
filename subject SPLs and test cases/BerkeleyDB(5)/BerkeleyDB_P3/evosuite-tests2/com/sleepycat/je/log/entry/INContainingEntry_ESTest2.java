/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:13:42 KST 2017
 */

package com.sleepycat.je.log.entry;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.tree.IN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class INContainingEntry_ESTest2 extends INContainingEntry_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      long long0 = iNLogEntry0.getLsnOfIN(32767L);
      assertEquals(32767L, long0);
  }

  @Test
  public void test1()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      IN iN0 = iNLogEntry0.getIN((EnvironmentImpl) null);
      assertNull(iN0);
  }

  @Test
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      DatabaseId databaseId0 = iNLogEntry0.getDbId();
      assertNull(databaseId0);
  }

  @Test
  public void test3()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getLsnOfIN(589L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
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
  public void test5()  throws Throwable  {
      Class<Object> class0 = Object.class;
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
}
