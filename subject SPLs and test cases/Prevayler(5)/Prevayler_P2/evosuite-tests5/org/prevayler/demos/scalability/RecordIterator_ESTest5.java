/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 19:57:29 KST 2017
 */

package org.prevayler.demos.scalability;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class RecordIterator_ESTest5 extends RecordIterator_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      RecordIterator recordIterator0 = new RecordIterator((-1458));
      recordIterator0.hasNext();
  }

  @Test
  public void test1()  throws Throwable  {
      RecordIterator recordIterator0 = new RecordIterator(1251);
      recordIterator0.hasNext();
  }

  @Test
  public void test2()  throws Throwable  {
      RecordIterator recordIterator0 = new RecordIterator(0);
      recordIterator0.hasNext();
  }

  @Test
  public void test3()  throws Throwable  {
      RecordIterator recordIterator0 = new RecordIterator(1251);
      recordIterator0.next();
      Record record0 = recordIterator0.next();
      assertEquals("NAME1", record0.getName());
  }
}
