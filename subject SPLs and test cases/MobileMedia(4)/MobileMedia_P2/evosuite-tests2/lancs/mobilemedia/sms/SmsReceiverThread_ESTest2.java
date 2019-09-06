/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 14 00:28:32 KST 2018
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
import lancs.mobilemedia.core.ui.datamodel.VideoAlbumData;
import lancs.mobilemedia.core.ui.screens.AlbumListScreen;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class SmsReceiverThread_ESTest2 extends SmsReceiverThread_ESTest_scaffolding2 {
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
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      VideoAlbumData videoAlbumData0 = new VideoAlbumData();
      SmsReceiverController smsReceiverController0 = new SmsReceiverController(mainUIMidlet0, videoAlbumData0, albumListScreen0);
      SmsReceiverThread smsReceiverThread0 = new SmsReceiverThread(mainUIMidlet0, videoAlbumData0, albumListScreen0, smsReceiverController0);
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
