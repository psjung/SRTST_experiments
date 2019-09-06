/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 12:30:32 KST 2018
 */

package it.yup.xmpp;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xml.Element;
import it.yup.xmpp.packets.Message;
import it.yup.xmpp.packets.Presence;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Contact_ESTest2 extends Contact_ESTest_scaffolding2 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      Presence presence0 = new Presence("", "", "", "", 0);
      // Undeclared exception!
      try { 
        contact0.updatePresence(presence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Contact contact0 = new Contact("", "", "", (String[]) null);
      Presence presence0 = new Presence();
      contact0.handleError(presence0);
      assertEquals(5, contact0.getAvailability());
      assertFalse(contact0.pending_tasks);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      Presence presence0 = new Presence((String) null, "", "", 0);
      // Undeclared exception!
      try { 
        contact0.updateExistingPresence(presence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Contact.userhost("d");
      assertEquals("d", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      int int0 = contact0.compareTo(contact0);
      assertEquals(5, contact0.getAvailability());
      assertFalse(contact0.pending_tasks);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      Contact contact1 = new Contact("", "4", "", stringArray0);
      int int0 = contact0.compareTo(contact1);
      assertFalse(contact1.pending_tasks);
      assertEquals(5, contact1.getAvailability());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      Contact contact0 = new Contact("", "n", "", stringArray0);
      Contact contact1 = new Contact("", (String) null, (String) null, stringArray0);
      int int0 = contact0.compareTo(contact1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Contact.userhost((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Contact contact0 = new Contact("", "", "", (String[]) null);
      // Undeclared exception!
      try { 
        contact0.setGroups((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Contact contact0 = new Contact("", (String) null, "", stringArray0);
      // Undeclared exception!
      try { 
        contact0.handleResult((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Contact.domain((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      // Undeclared exception!
      try { 
        contact0.compileMessage("", (Message) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Contact contact0 = new Contact("", "", "", stringArray0);
      Message message0 = new Message("", (String) null);
      message0.addElement((Element) null);
      // Undeclared exception!
      try { 
        contact0.addMessageToHistory("", message0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      String string0 = contact0.getPrintableName();
      assertNotNull(string0);
      assertEquals(5, contact0.getAvailability());
      assertFalse(contact0.pending_tasks);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      Message message0 = new Message("", "");
      contact0.compileMessage("", message0, "");
      assertEquals(5, contact0.getAvailability());
      assertFalse(contact0.pending_tasks);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      boolean boolean0 = contact0.supportsMUC((Presence) null);
      assertEquals(5, contact0.getAvailability());
      assertFalse(contact0.pending_tasks);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      Presence presence0 = new Presence();
      boolean boolean0 = contact0.supportsMUC(presence0);
      assertFalse(boolean0);
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "b";
      Contact contact0 = new Contact("", "", "", stringArray0);
      boolean boolean0 = contact0.setGroups(stringArray0);
      assertFalse(boolean0);
      assertEquals(5, contact0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Contact contact0 = new Contact((String) null, "", (String) null, stringArray0);
      int int0 = contact0.mapAvailability((String) null);
      assertEquals(1, int0);
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      int int0 = contact0.mapAvailability("");
      assertEquals((-1), int0);
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = Contact.user("z@");
      assertEquals("z", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = Contact.user("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = Contact.resource("-/");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = Contact.resource("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = Contact.domain("c/");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = Contact.userhost("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      contact0.getPresence("");
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      int int0 = contact0.getAvailability("");
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      // Undeclared exception!
      try { 
        contact0.askCapabilities((Presence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      contact0.getCapabilities((Presence) null);
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      Presence presence0 = new Presence("", "", "", "", 0);
      contact0.getCapabilities(presence0);
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      contact0.getPresence();
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      Task[] taskArray0 = contact0.getTasks();
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
      assertEquals(0, taskArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      contact0.removeTask((Task) null);
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      assertFalse(contact0.pending_tasks);
      
      contact0.addTask((Task) null);
      assertTrue(contact0.pending_tasks);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      Presence[] presenceArray0 = new Presence[3];
      contact0.resources = presenceArray0;
      boolean boolean0 = contact0.isVisible();
      assertEquals(5, contact0.getAvailability());
      assertTrue(boolean0);
      assertFalse(contact0.pending_tasks);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Contact contact0 = new Contact((String) null, (String) null, (String) null, stringArray0);
      boolean boolean0 = contact0.isVisible();
      assertFalse(boolean0);
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      Presence[] presenceArray0 = new Presence[5];
      contact0.resources = presenceArray0;
      // Undeclared exception!
      try { 
        contact0.getFullJid();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      contact0.getFullJid();
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      Contact contact0 = new Contact("", "0", "", stringArray0);
      String string0 = contact0.getPrintableName();
      assertNotNull(string0);
      assertFalse(contact0.pending_tasks);
      assertEquals("0", string0);
      assertEquals(5, contact0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Contact contact0 = new Contact((String) null, (String) null, (String) null, stringArray0);
      // Undeclared exception!
      try { 
        contact0.compareTo(contact0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Contact contact0 = new Contact("", "", "", (String[]) null);
      int int0 = contact0.getHistoryLength("");
      assertEquals(0, int0);
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Contact contact0 = new Contact("", "", "", (String[]) null);
      Presence presence0 = new Presence((String) null, "", "", 0);
      Message message0 = new Message(presence0);
      contact0.addMessageToHistory("5", message0);
      Vector vector0 = contact0.getMessageHistory("");
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
      assertNull(vector0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Contact contact0 = new Contact("", "", "", (String[]) null);
      Presence presence0 = new Presence((String) null, "", "", 0);
      Message message0 = new Message(presence0);
      contact0.addMessageToHistory("", message0);
      Vector vector0 = contact0.getMessageHistory("");
      assertEquals(5, contact0.getAvailability());
      assertNotNull(vector0);
      assertFalse(contact0.pending_tasks);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      Message message0 = new Message("", "");
      contact0.addMessageToHistory("", message0);
      Vector vector0 = contact0.getAllConvs();
      //  // Unstable assertion: assertEquals("[[Ljava.lang.Object;@176cc492]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      Element element0 = contact0.store();
      // Undeclared exception!
      try { 
        contact0.handleResult(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String[] stringArray0 = new String[4];
      Contact contact0 = null;
      try {
        contact0 = new Contact("", "", "b", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Contact contact0 = new Contact((String) null, (String) null, (String) null, stringArray0);
      Presence presence0 = new Presence();
      Message message0 = new Message(presence0);
      contact0.addMessageToHistory((String) null, message0);
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Contact contact0 = new Contact("", "", "", (String[]) null);
      Presence presence0 = new Presence((String) null, "", "", 0);
      Message message0 = new Message(presence0);
      contact0.addMessageToHistory("", message0);
      boolean boolean0 = contact0.unread_msg();
      assertEquals(5, contact0.getAvailability());
      assertFalse(contact0.pending_tasks);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Contact contact0 = new Contact("", "", "", (String[]) null);
      int int0 = contact0.getAvailability();
      assertFalse(contact0.pending_tasks);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      contact0.getAllPresences();
      assertEquals(5, contact0.getAvailability());
      assertFalse(contact0.pending_tasks);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      contact0.getAllConvs();
      assertFalse(contact0.pending_tasks);
      assertEquals(5, contact0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      // Undeclared exception!
      try { 
        contact0.resetMessageHistory(contact0.jid);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.Contact", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      Contact contact0 = new Contact("", "", "", stringArray0);
      String[] stringArray1 = contact0.getGroups();
      assertEquals(5, contact0.getAvailability());
      assertFalse(contact0.pending_tasks);
      assertEquals(4, stringArray1.length);
  }
}