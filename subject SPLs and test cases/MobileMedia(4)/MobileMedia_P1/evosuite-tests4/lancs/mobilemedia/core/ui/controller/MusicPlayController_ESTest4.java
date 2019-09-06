/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:15:45 KST 2018
 */

package lancs.mobilemedia.core.ui.controller;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.PipedInputStream;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.core.ui.MainUIMidlet;
import lancs.mobilemedia.core.ui.datamodel.AlbumData;
import lancs.mobilemedia.core.ui.datamodel.ImageAlbumData;
import lancs.mobilemedia.core.ui.datamodel.MusicAlbumData;
import lancs.mobilemedia.core.ui.screens.AlbumListScreen;
import lancs.mobilemedia.core.ui.screens.PlayMediaScreen;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MusicPlayController_ESTest4 extends MusicPlayController_ESTest_scaffolding4 {
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
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      SelectMediaController selectMediaController0 = new SelectMediaController(mainUIMidlet0, (AlbumData) null, albumListScreen0);
      PlayMediaScreen playMediaScreen0 = new PlayMediaScreen(mainUIMidlet0, dataInputStream0, "", selectMediaController0);
      MusicPlayController musicPlayController0 = new MusicPlayController(mainUIMidlet0, musicAlbumData0, albumListScreen0, playMediaScreen0);
      musicPlayController0.setMediaName("t");
      String string0 = musicPlayController0.getMediaName();
      assertEquals("t", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      String[] stringArray0 = new String[6];
      List list0 = new List("", 0, stringArray0, (Image[]) null);
      MusicPlayController musicPlayController0 = new MusicPlayController(mainUIMidlet0, musicAlbumData0, list0, (PlayMediaScreen) null);
      musicPlayController0.setMediaName("");
      String string0 = musicPlayController0.getMediaName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PlayMediaScreen playMediaScreen0 = new PlayMediaScreen(mainUIMidlet0, byteArrayInputStream0, "", (AbstractController) null);
      MusicPlayController musicPlayController0 = new MusicPlayController(mainUIMidlet0, imageAlbumData0, albumListScreen0, playMediaScreen0);
      Command command0 = AlbumListScreen.deleteAlbumCommand;
      // Undeclared exception!
      try { 
        musicPlayController0.handleCommand(command0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      MusicPlayController musicPlayController0 = new MusicPlayController(mainUIMidlet0, musicAlbumData0, (List) null, (PlayMediaScreen) null);
      String string0 = musicPlayController0.getMediaName();
      assertNull(string0);
  }
}
