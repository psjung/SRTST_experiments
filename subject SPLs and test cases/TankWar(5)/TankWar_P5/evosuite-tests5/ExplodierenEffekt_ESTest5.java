/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 04 14:32:57 KST 2016
 */


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class ExplodierenEffekt_ESTest5   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  @Test
  public void test0()  throws Throwable  {
      ExplodierenEffekt explodierenEffekt0 = null;
      try {
        explodierenEffekt0 = new ExplodierenEffekt((TankManager) null, (-731), (-731));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("ExplodierenEffekt$$explodieren", e);
      }
  }
}
