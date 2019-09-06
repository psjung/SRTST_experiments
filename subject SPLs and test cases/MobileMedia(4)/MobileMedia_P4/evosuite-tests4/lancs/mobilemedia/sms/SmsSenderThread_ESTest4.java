/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:37:37 KST 2018
 */

package lancs.mobilemedia.sms;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class SmsSenderThread_ESTest4 extends SmsSenderThread_ESTest_scaffolding4 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SmsSenderThread smsSenderThread0 = new SmsSenderThread("", "", "");
      smsSenderThread0.setSmsPort((String) null);
      String string0 = smsSenderThread0.getSmsPort();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SmsSenderThread smsSenderThread0 = new SmsSenderThread("", "", "");
      smsSenderThread0.setSmsPort("l");
      String string0 = smsSenderThread0.getSmsPort();
      assertEquals("l", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SmsSenderThread smsSenderThread0 = new SmsSenderThread((String) null, "", (String) null);
      String string0 = smsSenderThread0.getMessageText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SmsSenderThread smsSenderThread0 = new SmsSenderThread("", "", "S");
      String string0 = smsSenderThread0.getMessageText();
      assertEquals("S", string0);
      assertEquals("", smsSenderThread0.getSmsPort());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SmsSenderThread smsSenderThread0 = new SmsSenderThread("", "", "");
      // Undeclared exception!
      try { 
        smsSenderThread0.setBinaryData((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.sms.SmsSenderThread", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SmsSenderThread smsSenderThread0 = new SmsSenderThread("", "", "");
      smsSenderThread0.run();
      assertEquals("", smsSenderThread0.getMessageText());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SmsSenderThread smsSenderThread0 = new SmsSenderThread("", "", "");
      String string0 = smsSenderThread0.getSmsPort();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SmsSenderThread smsSenderThread0 = new SmsSenderThread("", "", "");
      smsSenderThread0.setMessageText((String) null);
      assertEquals("", smsSenderThread0.getSmsPort());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SmsSenderThread smsSenderThread0 = new SmsSenderThread("", "", "");
      byte[] byteArray0 = new byte[7];
      smsSenderThread0.setBinaryData(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SmsSenderThread smsSenderThread0 = new SmsSenderThread("", "", "");
      String string0 = smsSenderThread0.getMessageText();
      assertEquals("", string0);
  }
}