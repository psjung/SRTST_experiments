/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 09:12:42 GMT 2016
 */


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Sprach_ESTest3   {
	@BeforeClass
	public static void initEvoSuiteFramework() { 
		
	}
	@AfterClass
	public static void exitEvoSuiteFramework() { 
		
	}
  //Test case number: 0
  /*
   * 4 covered goals:
   * Goal 1. Sprach.<init>()V: root-Branch
   * Goal 2. Branch Sprach.<init>()V: root-Branch in context: Sprach:<init>()V
   * Goal 3. [METHOD] Sprach.<init>()V
   * Goal 4. [METHODNOEX] Sprach.<init>()V
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Sprach sprach0 = new Sprach();
  }
}
