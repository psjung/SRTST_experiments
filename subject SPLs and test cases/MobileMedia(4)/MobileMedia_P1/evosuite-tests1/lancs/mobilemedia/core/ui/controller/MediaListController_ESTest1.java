/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 18:44:09 KST 2018
 */

package lancs.mobilemedia.core.ui.controller;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.microedition.lcdui.Command;
import lancs.mobilemedia.core.ui.MainUIMidlet;
import lancs.mobilemedia.core.ui.controller.MediaController;
import lancs.mobilemedia.core.ui.controller.MediaListController;
import lancs.mobilemedia.core.ui.datamodel.ImageAlbumData;
import lancs.mobilemedia.core.ui.datamodel.MediaData;
import lancs.mobilemedia.core.ui.datamodel.MusicAlbumData;
import lancs.mobilemedia.core.ui.datamodel.VideoAlbumData;
import lancs.mobilemedia.core.ui.screens.AlbumListScreen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MediaListController_ESTest1 extends MediaListController_ESTest_scaffolding1 {
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
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, imageAlbumData0, albumListScreen0);
      MediaData[] mediaDataArray0 = new MediaData[5];
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaDataArray0[0] = mediaData0;
      mediaDataArray0[1] = mediaData0;
      MediaData mediaData1 = new MediaData(0, "", "");
      mediaDataArray0[2] = mediaData1;
      mediaData1.setNumberOfViews(1);
      // Undeclared exception!
      try { 
        mediaController0.bubbleSort(mediaDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      Command command0 = new Command("", 0, 0);
      VideoAlbumData videoAlbumData0 = new VideoAlbumData();
      MediaListController mediaListController0 = new MediaListController(mainUIMidlet0, videoAlbumData0, albumListScreen0);
      // Undeclared exception!
      try { 
        mediaListController0.handleCommand(command0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, imageAlbumData0, albumListScreen0);
      MediaData[] mediaDataArray0 = new MediaData[5];
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaDataArray0[0] = mediaData0;
      mediaDataArray0[1] = mediaData0;
      mediaDataArray0[2] = mediaData0;
      mediaDataArray0[3] = mediaData0;
      mediaDataArray0[4] = mediaDataArray0[0];
      mediaController0.bubbleSort(mediaDataArray0);
      assertEquals(5, mediaDataArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaListController mediaListController0 = new MediaListController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      // Undeclared exception!
      try { 
        mediaListController0.showMediaList((String) null, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.MediaAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      MediaListController mediaListController0 = new MediaListController(mainUIMidlet0, imageAlbumData0, (AlbumListScreen) null);
      // Undeclared exception!
      try { 
        mediaListController0.showMediaList((String) null, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.MediaAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      VideoAlbumData videoAlbumData0 = new VideoAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, videoAlbumData0, albumListScreen0);
      // Undeclared exception!
      try { 
        mediaController0.showMediaList("", true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.MediaAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, imageAlbumData0, albumListScreen0);
      MediaData[] mediaDataArray0 = new MediaData[5];
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaDataArray0[0] = mediaData0;
      mediaData0.increaseNumberOfViews();
      MediaData mediaData1 = new MediaData(0, "", "");
      mediaDataArray0[1] = mediaData1;
      // Undeclared exception!
      try { 
        mediaController0.bubbleSort(mediaDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
