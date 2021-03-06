/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 14:38:21 KST 2018
 */

package it.yup.xmlstream;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.yup.xmlstream.CompressionInitializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CompressionInitializer_ESTest3 extends CompressionInitializer_ESTest_scaffolding3 {
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
      Object[] objectArray0 = new Object[5];
      String[][] stringArray0 = new String[3][0];
      it.yup.xml.Element element0 = new it.yup.xml.Element("", "compressed", objectArray0, stringArray0);
      CompressionInitializer compressionInitializer0 = new CompressionInitializer();
      // Undeclared exception!
      try { 
        compressionInitializer0.packetReceived(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.xmlstream.CompressionInitializer", e);
      }
  }
}
