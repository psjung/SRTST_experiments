/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:18:14 KST 2017
 */

package org.prevayler.foundation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Cool_ESTest5 extends Cool_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      Exception exception0 = new Exception((Throwable) null);
      StackTraceElement stackTraceElement0 = new StackTraceElement("", "", "snapshot", 0);
      // Undeclared exception!
      try { 
        exception0.addSuppressed((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot suppress a null exception.
         //
         assertThrownBy("java.lang.Throwable", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Exception exception0 = new Exception((Throwable) null);
      // Undeclared exception!
      try { 
        exception0.addSuppressed((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot suppress a null exception.
         //
         assertThrownBy("java.lang.Throwable", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        Cool.wait(object0);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.Object", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        Cool.sleep((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout value is negative
         //
         assertThrownBy("java.lang.Thread", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Cool.startDaemon((Runnable) null);
  }

  @Test
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        Cool.wait((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.Cool", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Cool cool0 = new Cool();
  }

  @Test
  public void test7()  throws Throwable  {
      Exception exception0 = new Exception("");
      // Undeclared exception!
      try { 
        Cool.unexpected(exception0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected Exception was thrown.
         //
         assertThrownBy("org.prevayler.foundation.Cool", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Cool.sleep(0L);
  }
}
