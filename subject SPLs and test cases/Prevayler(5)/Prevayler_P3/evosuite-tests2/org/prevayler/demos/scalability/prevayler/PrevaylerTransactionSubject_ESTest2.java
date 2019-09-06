/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 19:59:18 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class PrevaylerTransactionSubject_ESTest2 extends PrevaylerTransactionSubject_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      PrevaylerTransactionSubject prevaylerTransactionSubject0 = null;
      try {
        prevaylerTransactionSubject0 = new PrevaylerTransactionSubject("", "");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
         //
         // 
         //
         assertThrownBy("java.lang.Class", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PrevaylerTransactionSubject prevaylerTransactionSubject0 = null;
      try {
        prevaylerTransactionSubject0 = new PrevaylerTransactionSubject((String) null, "d{19}.[a-zA-Z0-9]*[Jj]ournal");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.File", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PrevaylerTransactionSubject prevaylerTransactionSubject0 = null;
      try {
        prevaylerTransactionSubject0 = new PrevaylerTransactionSubject("zd($T7CC", "com.thoughtworks.xstream.converters.extended.ThrowableConverter");
        fail("Expecting exception: InstantiationException");
      
      } catch(InstantiationException e) {
         //
         // com.thoughtworks.xstream.converters.extended.ThrowableConverter
         //
         assertThrownBy("java.lang.Class", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      PrevaylerTransactionSubject prevaylerTransactionSubject0 = null;
      try {
        prevaylerTransactionSubject0 = new PrevaylerTransactionSubject("java.util.LinkedHashMap", "java.util.LinkedHashMap");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.LinkedHashMap cannot be cast to org.prevayler.foundation.serialization.Serializer
         //
         assertThrownBy("org.prevayler.demos.scalability.prevayler.PrevaylerTransactionSubject", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      PrevaylerTransactionSubject prevaylerTransactionSubject0 = null;
      try {
        prevaylerTransactionSubject0 = new PrevaylerTransactionSubject("java.util.Calendar", "java.util.Calendar");
        fail("Expecting exception: IllegalAccessException");
      
      } catch(IllegalAccessException e) {
         //
         // Class org.prevayler.demos.scalability.prevayler.PrevaylerTransactionSubject can not access a member of class java.util.Calendar with modifiers \"protected\"
         //
         assertThrownBy("sun.reflect.Reflection", e);
      }
  }
}
