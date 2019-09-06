/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 15:54:42 KST 2018
 */

package it.yup.util;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MetaVector_ESTest4 extends MetaVector_ESTest_scaffolding4 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      Enumeration enumeration0 = metaVector0.elements();
      metaVector0.addElement(enumeration0);
      // Undeclared exception!
      try { 
        metaVector0.setElementAt(enumeration0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.MetaVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      metaVector0.addElement("");
      // Undeclared exception!
      try { 
        metaVector0.removeElementAt((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.MetaVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      Integer integer0 = new Integer(0);
      metaVector0.addElement(integer0);
      int int0 = metaVector0.lastIndexOf((Object) integer0, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      Integer integer0 = new Integer(0);
      int int0 = metaVector0.lastIndexOf((Object) integer0, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      // Undeclared exception!
      try { 
        metaVector0.insertElementAt(metaVector0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.MetaVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      metaVector0.addElement(linkedList0);
      Object object0 = metaVector0.lastElement();
      int int0 = metaVector0.indexOf(object0, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      metaVector0.addElement(linkedList0);
      // Undeclared exception!
      try { 
        metaVector0.elementAt(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.MetaVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      metaVector0.addElement(linkedList0);
      Object object0 = metaVector0.lastElement();
      int int0 = metaVector0.lastIndexOf(object0, 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Enumeration enumeration0 = metaVector0.elements();
      metaVector0.addElement(linkedList0);
      int int0 = metaVector0.indexOf((Object) enumeration0, 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      int int0 = metaVector0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      metaVector0.addElement("Multivector: ");
      boolean boolean0 = metaVector0.contains("Multivector: ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MetaVector metaVector0 = null;
      try {
        metaVector0 = new MetaVector((-1), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MetaVector metaVector0 = null;
      try {
        metaVector0 = new MetaVector((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      Integer integer0 = new Integer(0);
      metaVector0.addElement(integer0);
      int int0 = metaVector0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      Integer integer0 = new Integer(0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      metaVector0.addElement(linkedList0);
      int int0 = metaVector0.lastIndexOf((Object) integer0, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      Integer integer0 = new Integer(0);
      metaVector0.addElement(integer0);
      Object object0 = metaVector0.elementAt(0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      metaVector0.addElement("");
      String string0 = metaVector0.toString();
      assertEquals("Multivector:  ", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      Integer integer0 = new Integer(0);
      metaVector0.addElement(integer0);
      // Undeclared exception!
      try { 
        metaVector0.setElementAt(metaVector0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.MetaVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      metaVector0.addElement("");
      metaVector0.setElementAt("", 0);
      assertEquals(10, metaVector0.capacity());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      metaVector0.addElement("");
      metaVector0.removeElementAt(0);
      assertEquals(10, metaVector0.capacity());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      Integer integer0 = new Integer(0);
      metaVector0.addElement(integer0);
      boolean boolean0 = metaVector0.removeElement("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      metaVector0.insertElementAt(linkedList0, 0);
      boolean boolean0 = metaVector0.removeElement(metaVector0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      metaVector0.addElement("");
      Object object0 = new Object();
      int int0 = metaVector0.lastIndexOf(object0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        metaVector0.lastIndexOf((Object) linkedList0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.MetaVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      metaVector0.addElement("");
      boolean boolean0 = metaVector0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      boolean boolean0 = metaVector0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      metaVector0.addElement(linkedList0);
      // Undeclared exception!
      try { 
        metaVector0.insertElementAt("", (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.MetaVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      metaVector0.addElement("");
      metaVector0.insertElementAt("", 0);
      // Undeclared exception!
      try { 
        metaVector0.elementAt((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.MetaVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      Integer integer0 = new Integer(0);
      Predicate<Object> predicate0 = Predicate.isEqual((Object) integer0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      metaVector0.addElement(linkedList0);
      int int0 = metaVector0.indexOf((Object) predicate0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      metaVector0.addElement("");
      int int0 = metaVector0.indexOf((Object) "");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      Enumeration enumeration0 = metaVector0.elements();
      // Undeclared exception!
      try { 
        metaVector0.indexOf((Object) enumeration0, 1);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.MetaVector$MultiVectorEnumeration", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      metaVector0.addElement("");
      Object object0 = metaVector0.firstElement();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      metaVector0.addElement("");
      Object[] objectArray0 = new Object[6];
      metaVector0.copyInto(objectArray0);
      assertEquals(10, metaVector0.capacity());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      metaVector0.insertElementAt((Object) null, 0);
      Enumeration enumeration0 = metaVector0.elements();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      metaVector0.addElement("");
      Object object0 = new Object();
      boolean boolean0 = metaVector0.contains(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector(0, 0);
      MetaVector metaVector1 = new MetaVector();
      Object object0 = metaVector1.clone();
      metaVector0.add(0, object0);
      // Undeclared exception!
      try { 
        metaVector0.lastElement();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.MetaVector$MultiVectorEnumeration", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      // Undeclared exception!
      try { 
        metaVector0.firstElement();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.MetaVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector(0);
      metaVector0.insertElementAt("", 0);
      // Undeclared exception!
      try { 
        metaVector0.removeElementAt(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.util.MetaVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MetaVector metaVector0 = new MetaVector();
      metaVector0.removeAllElements();
      assertEquals(10, metaVector0.capacity());
  }
}
