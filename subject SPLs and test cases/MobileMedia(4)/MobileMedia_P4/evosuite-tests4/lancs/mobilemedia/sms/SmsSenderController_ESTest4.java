/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:37:22 KST 2018
 */

package lancs.mobilemedia.sms;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.microedition.lcdui.Command;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.core.ui.MainUIMidlet;
import lancs.mobilemedia.core.ui.datamodel.ImageAlbumData;
import lancs.mobilemedia.core.ui.screens.AlbumListScreen;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class SmsSenderController_ESTest4 extends SmsSenderController_ESTest_scaffolding4 {
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
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      SmsSenderController smsSenderController0 = new SmsSenderController(mainUIMidlet0, imageAlbumData0, (AlbumListScreen) null, "");
      NetworkScreen networkScreen0 = new NetworkScreen("");
      Command command0 = networkScreen0.ok;
      // Undeclared exception!
      try { 
        smsSenderController0.handleCommand(command0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
