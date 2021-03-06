/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 12:39:41 KST 2018
 */

package it.yup.xmpp;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xml.Element;
import it.yup.xmpp.packets.Message;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class SimpleDataFormExecutor_ESTest2 extends SimpleDataFormExecutor_ESTest_scaffolding2 {
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
      Message message0 = new Message((String) null, (String) null);
      SimpleDataFormExecutor simpleDataFormExecutor0 = null;
      try {
        simpleDataFormExecutor0 = new SimpleDataFormExecutor(message0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmpp.packets.DataForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      objectArray0[4] = (Object) "";
      Object object0 = new Object();
      objectArray0[5] = object0;
      String[][] stringArray0 = new String[3][5];
      Element element0 = new Element("", "", objectArray0, stringArray0);
      SimpleDataFormExecutor simpleDataFormExecutor0 = null;
      try {
        simpleDataFormExecutor0 = new SimpleDataFormExecutor(element0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to it.yup.xml.Element
         //
         verifyException("it.yup.xml.Element", e);
      }
  }
}
