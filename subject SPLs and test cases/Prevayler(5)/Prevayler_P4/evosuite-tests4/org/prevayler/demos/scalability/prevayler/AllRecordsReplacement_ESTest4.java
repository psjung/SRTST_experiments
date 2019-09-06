/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 10:23:35 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class AllRecordsReplacement_ESTest4 extends AllRecordsReplacement_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      AllRecordsReplacement allRecordsReplacement0 = new AllRecordsReplacement(2797);
      Date date0 = new Date();
      // Undeclared exception!
      try { 
        allRecordsReplacement0.executeOn((Object) null, date0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.prevayler.AllRecordsReplacement", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      AllRecordsReplacement allRecordsReplacement0 = new AllRecordsReplacement((-1407));
      Date date0 = new Date((long) (-1407));
      // Undeclared exception!
      try { 
        allRecordsReplacement0.executeOn(allRecordsReplacement0, date0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.prevayler.demos.scalability.prevayler.AllRecordsReplacement cannot be cast to org.prevayler.demos.scalability.prevayler.ScalabilitySystem
         //
         assertThrownBy("org.prevayler.demos.scalability.prevayler.AllRecordsReplacement", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      AllRecordsReplacement allRecordsReplacement0 = new AllRecordsReplacement(1);
      TransactionSystem transactionSystem0 = new TransactionSystem();
      Date date0 = new Date();
      allRecordsReplacement0.executeOn(transactionSystem0, date0);
      //  // Unstable assertion: assertEquals("Fri Apr 07 10:23:32 KST 2017", date0.toString());
  }
}