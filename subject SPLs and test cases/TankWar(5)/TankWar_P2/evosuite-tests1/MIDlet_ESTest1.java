/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 09:55:25 GMT 2016
 */


import org.evosuite.runtime.EvoRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MIDlet_ESTest1   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  //Test case number: 0
  /*
   * 4 covered goals:
   * Goal 1. MIDlet.<init>()V: root-Branch
   * Goal 2. Branch MIDlet.<init>()V: root-Branch in context: MIDlet:<init>()V
   * Goal 3. [METHOD] MIDlet.<init>()V
   * Goal 4. [METHODNOEX] MIDlet.<init>()V
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MIDlet mIDlet0 = new MIDlet();
  }
}
