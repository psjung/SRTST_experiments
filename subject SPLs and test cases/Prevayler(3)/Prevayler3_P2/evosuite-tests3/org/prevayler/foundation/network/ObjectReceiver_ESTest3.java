/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 17:19:13 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class ObjectReceiver_ESTest3 extends ObjectReceiver_ESTest_scaffolding3 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void clearEvoSuiteFramework() {
String a = "aa";
}

  @Test
  public void test0()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      StubbornClientReceiverImpl stubbornClientReceiverImpl0 = (StubbornClientReceiverImpl)stubbornNetworkImpl0.findServer("bd*<N/cvsm]'6D=m|Ze", (-2068), (ObjectReceiver) null);
      stubbornClientReceiverImpl0.close();
      assertFalse(stubbornClientReceiverImpl0.isInterrupted());
  }
}
