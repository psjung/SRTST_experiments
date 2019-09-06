/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 18:13:12 KST 2018
 */

package it.yup.xmpp;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xmpp.packets.Message;
import it.yup.xmpp.packets.Presence;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MUC_ESTest4 extends MUC_ESTest_scaffolding4 {
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
      MUC mUC0 = new MUC("", "");
      mUC0.lastResource = "";
      Presence presence0 = new Presence("", "", "", "", 0);
      mUC0.updatePresence(presence0);
      // Undeclared exception!
      try { 
        mUC0.updatePresence(presence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MUC mUC0 = new MUC("", "");
      // Undeclared exception!
      try { 
        mUC0.addMessageToHistory("", (Message) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.MUC", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MUC mUC0 = new MUC("", "");
      Presence[] presenceArray0 = new Presence[0];
      mUC0.resources = presenceArray0;
      Presence presence0 = new Presence();
      mUC0.updatePresence(presence0);
      assertEquals("", mUC0.getPrintableName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MUC mUC0 = new MUC("", "");
      Presence presence0 = new Presence("unavailable", "", "", 0);
      // Undeclared exception!
      try { 
        mUC0.updatePresence(presence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MUC mUC0 = new MUC("", "");
      Presence presence0 = new Presence();
      Message message0 = new Message(presence0);
      mUC0.addMessageToHistory("", message0);
      assertEquals(0, message0.maxWait);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MUC mUC0 = new MUC("", "");
      Message message0 = new Message("", "");
      mUC0.addMessageToHistory("", message0);
      assertFalse(mUC0.pending_tasks);
  }
}
