/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:36:47 KST 2018
 */

package lancs.mobilemedia.sms;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.core.ui.MainUIMidlet;
import lancs.mobilemedia.core.ui.datamodel.AlbumData;
import lancs.mobilemedia.core.ui.screens.AlbumListScreen;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class SmsReceiverThread_ESTest4 extends SmsReceiverThread_ESTest_scaffolding4 {
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
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      SmsReceiverController smsReceiverController0 = new SmsReceiverController((MainUIMidlet) null, (AlbumData) null, albumListScreen0);
      SmsReceiverThread smsReceiverThread0 = new SmsReceiverThread((MainUIMidlet) null, (AlbumData) null, albumListScreen0, smsReceiverController0);
      // Undeclared exception!
      try { 
        smsReceiverThread0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.sms.SmsMessaging", e);
      }
  }
}