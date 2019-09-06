/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:10:30 KST 2018
 */

package lancs.mobilemedia.core.ui.controller;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.microedition.lcdui.Command;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.core.ui.MainUIMidlet;
import lancs.mobilemedia.core.ui.datamodel.AlbumData;
import lancs.mobilemedia.core.ui.screens.AlbumListScreen;
import lancs.mobilemedia.core.ui.screens.PlayMediaScreen;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class AlbumController_ESTest4 extends AlbumController_ESTest_scaffolding4 {
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
      Command command0 = PlayMediaScreen.start;
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      AlbumController albumController0 = new AlbumController(mainUIMidlet0, (AlbumData) null, albumListScreen0);
      // Undeclared exception!
      try { 
        albumController0.handleCommand(command0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}