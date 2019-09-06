/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:24:30 KST 2018
 */

package it.yup.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.xml.BSerializer;
import it.yup.xml.Element;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class BSerializer_ESTest3 extends BSerializer_ESTest_scaffolding3 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      String[][] stringArray0 = new String[5][7];
      String[] stringArray1 = new String[6];
      stringArray1[1] = "";
      stringArray1[2] = "";
      stringArray0[0] = stringArray1;
      String[] stringArray2 = new String[1];
      stringArray0[1] = stringArray2;
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        BSerializer.toXml(element0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("it.yup.xml.BSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      Object object0 = new Object();
      objectArray0[0] = object0;
      String[][] stringArray0 = new String[0][7];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        BSerializer.toXml(element0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xml.BSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      String[][] stringArray0 = new String[0][2];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      byte[] byteArray0 = BSerializer.toXml(element0);
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      String[][] stringArray0 = new String[0][7];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        BSerializer.toXml(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xml.BSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BSerializer bSerializer0 = new BSerializer();
  }
}