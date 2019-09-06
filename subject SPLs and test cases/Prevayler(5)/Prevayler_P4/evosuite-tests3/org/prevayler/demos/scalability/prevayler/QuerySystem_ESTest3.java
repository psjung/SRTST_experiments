/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 16:38:42 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.demos.scalability.RecordIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class QuerySystem_ESTest3 extends QuerySystem_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      QuerySystem querySystem0 = new QuerySystem();
      // Undeclared exception!
      try { 
        querySystem0.replaceAllRecords((RecordIterator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.prevayler.QuerySystem", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      QuerySystem querySystem0 = new QuerySystem();
      List list0 = querySystem0.queryByName("s:C%tC8v*pQ{{;8o");
      assertNull(list0);
  }

  @Test
  public void test2()  throws Throwable  {
      QuerySystem querySystem0 = new QuerySystem();
      RecordIterator recordIterator0 = new RecordIterator(1);
      querySystem0.replaceAllRecords(recordIterator0);
      assertFalse(recordIterator0.hasNext());
  }

  @Test
  public void test3()  throws Throwable  {
      QuerySystem querySystem0 = new QuerySystem();
      RecordIterator recordIterator0 = new RecordIterator(100000);
      // Undeclared exception!
      try { 
        querySystem0.replaceAllRecords(recordIterator0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }
}
