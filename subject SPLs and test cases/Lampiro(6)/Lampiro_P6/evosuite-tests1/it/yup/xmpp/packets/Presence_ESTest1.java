/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 02:31:24 KST 2018
 */

package it.yup.xmpp.packets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xml.Element;
import static org.evosuite.runtime.EvoAssertions.*;
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Presence_ESTest1 extends Presence_ESTest_scaffolding1 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Presence presence0 = new Presence("", "", "", "g", 0);
      String string0 = presence0.getStatus();
      assertNotNull(string0);
      assertEquals("g", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Presence presence0 = new Presence("", "", "g", "", 0);
      String string0 = presence0.getShow();
      assertEquals("g", string0);
      assertNotNull(string0);
      assertEquals(0, presence0.pType);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Presence presence0 = new Presence();
      presence0.setPriority((short)1);
      int int0 = presence0.getPriority();
      assertEquals(1, int0);
      assertEquals(0, presence0.pType);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Presence presence0 = new Presence("", "", "", "", (-1));
      presence0.setPriority((-1));
      int int0 = presence0.getPriority();
      assertEquals((-1), int0);
      assertEquals(0, presence0.pType);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Presence presence0 = new Presence();
      presence0.addText((String) null);
      // Undeclared exception!
      try { 
        presence0.setStatus("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Presence presence0 = new Presence();
      presence0.addText((String) null);
      // Undeclared exception!
      try { 
        presence0.setShow("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Presence presence0 = new Presence("", "", "", "", 0);
      presence0.addElement((Element) presence0);
      presence0.setStatus("");
      presence0.setShow("");
      presence0.addText((String) null);
      // Undeclared exception!
      try { 
        presence0.getStatus();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Presence presence0 = new Presence();
      presence0.setShow((String) null);
      // Undeclared exception!
      try { 
        presence0.getShow();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Presence presence0 = new Presence();
      presence0.addElement((String) null, (String) null);
      // Undeclared exception!
      try { 
        presence0.getResource();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Presence presence0 = new Presence();
      presence0.addElementAndContent("", (String) null, "");
      // Undeclared exception!
      try { 
        presence0.getPriority();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      Object object0 = new Object();
      objectArray0[4] = object0;
      String[][] stringArray0 = new String[1][1];
      String[] stringArray1 = new String[4];
      stringArray0[0] = stringArray1;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Presence presence0 = null;
      try {
        presence0 = new Presence(element0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      String[][] stringArray0 = new String[9][0];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Presence presence0 = null;
      try {
        presence0 = new Presence(element0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Presence presence0 = new Presence("", "", "", "", 0);
      Presence presence1 = new Presence(presence0);
      assertEquals(0, presence1.pType);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Presence presence0 = new Presence("", "", "", 0);
      String string0 = presence0.getStatus();
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Presence presence0 = new Presence("", "", "", "", 0);
      presence0.addElement((Element) presence0);
      presence0.setStatus("");
      presence0.setShow("");
      String string0 = presence0.getStatus();
      assertNull(string0);
      assertEquals(0, presence0.pType);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Presence presence0 = new Presence("", "", "", "", 0);
      int int0 = presence0.getPriority();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Presence presence0 = new Presence();
      int int0 = presence0.getPriority();
      assertEquals(0, presence0.pType);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Presence presence0 = new Presence((String) null, (String) null, (String) null, (String) null, 0);
      assertEquals(0, presence0.pType);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Presence presence0 = new Presence();
      presence0.getShow();
      assertEquals(0, presence0.pType);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Presence presence0 = null;
      try {
        presence0 = new Presence((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Presence presence0 = new Presence("", "", "", 0);
      String string0 = presence0.getShow();
      assertNotNull(string0);
      assertEquals("", string0);
      assertEquals(0, presence0.pType);
  }
}
