/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 18:38:11 KST 2018
 */

package it.yup.xmlstream;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CompressionInitializer_ESTest5 extends CompressionInitializer_ESTest_scaffolding5 {
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
      CompressionInitializer compressionInitializer0 = new CompressionInitializer();
      Object[] objectArray0 = new Object[6];
      String[][] stringArray0 = new String[1][4];
      it.yup.xml.Element element0 = new it.yup.xml.Element("", "compressed", objectArray0, stringArray0);
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
