/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 19:05:31 KST 2018
 */

package it.yup.xmpp;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xmpp.packets.Message;
import it.yup.xmpp.packets.Presence;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MUC_ESTest5 extends MUC_ESTest_scaffolding5 {
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
      Presence presence0 = new Presence("", "", "", 0);
      mUC0.updatePresence(presence0);
      mUC0.lastResource = "";
      // Undeclared exception!
      try { 
        mUC0.updatePresence(presence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.MUC", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MUC mUC0 = new MUC("", "");
      Message message0 = new Message("", "");
      message0.addElement((String) null, (String) null);
      // Undeclared exception!
      try { 
        mUC0.addMessageToHistory("", message0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MUC mUC0 = new MUC("", "");
      Presence presence0 = new Presence();
      Presence[] presenceArray0 = new Presence[0];
      mUC0.resources = presenceArray0;
      mUC0.updatePresence(presence0);
      assertEquals(1, mUC0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MUC mUC0 = new MUC("", "");
      Presence presence0 = new Presence("", "unavailable", "", "", 0);
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
      assertEquals(5, mUC0.getAvailability());
  }
}