/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 16:16:41 KST 2018
 */

package it.yup.xmpp.packets;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xml.Element;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Stanza_ESTest6 extends Stanza_ESTest_scaffolding6 {
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
      Stanza stanza0 = null;
      try {
        stanza0 = new Stanza((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      Object object0 = new Object();
      objectArray0[3] = object0;
      String[][] stringArray0 = new String[7][1];
      String[] stringArray1 = new String[4];
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray0[0];
      stringArray0[2] = stringArray0[0];
      stringArray0[3] = stringArray0[0];
      stringArray0[4] = stringArray0[0];
      stringArray0[5] = stringArray0[0];
      stringArray0[6] = stringArray0[4];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Stanza stanza0 = null;
      try {
        stanza0 = new Stanza(element0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Stanza stanza0 = new Stanza((String) null, "", "", "");
      Stanza stanza1 = new Stanza(stanza0);
      assertFalse(stanza1.equals((Object)stanza0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Stanza stanza0 = new Stanza("", (String) null, (String) null, (String) null);
      assertEquals(0L, stanza0.queueTime);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      String[][] stringArray0 = new String[7][1];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      Stanza stanza0 = null;
      try {
        stanza0 = new Stanza(element0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
