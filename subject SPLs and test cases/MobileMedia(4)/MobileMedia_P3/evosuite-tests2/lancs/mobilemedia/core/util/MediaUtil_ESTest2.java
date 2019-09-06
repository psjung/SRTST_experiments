/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 14 00:23:18 KST 2018
 */

package lancs.mobilemedia.core.util;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.core.ui.datamodel.MediaData;
import lancs.mobilemedia.lib.exceptions.ImagePathNotValidException;
import lancs.mobilemedia.lib.exceptions.InvalidArrayFormatException;
import lancs.mobilemedia.lib.exceptions.InvalidImageDataException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MediaUtil_ESTest2 extends MediaUtil_ESTest_scaffolding2 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MediaUtil mediaUtil0 = new MediaUtil();
      MediaData mediaData0 = new MediaData(0, "a", "");
      byte[] byteArray0 = mediaUtil0.getBytesFromMediaInfo(mediaData0);
      MediaData mediaData1 = mediaUtil0.getMediaInfoFromBytes(byteArray0);
      //  // Unstable assertion: assertEquals("", mediaData1.getMediaLabel());
      //  // Unstable assertion: assertEquals(14, byteArray0.length);
      //  // Unstable assertion: assertEquals("a", mediaData1.getParentAlbumName());
      //  // Unstable assertion: assertEquals(0, mediaData1.getRecordId());
      //  // Unstable assertion: assertTrue(mediaData1.isFavorite());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MediaUtil mediaUtil0 = new MediaUtil();
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setRecordId(1);
      byte[] byteArray0 = mediaUtil0.getBytesFromMediaInfo(mediaData0);
      MediaData mediaData1 = mediaUtil0.getMediaInfoFromBytes(byteArray0);
      //  // Unstable assertion: assertEquals(0, mediaData1.getForeignRecordId());
      //  // Unstable assertion: assertTrue(mediaData1.isFavorite());
      //  // Unstable assertion: assertEquals("", mediaData1.getMediaLabel());
      //  // Unstable assertion: assertEquals(1, mediaData1.getRecordId());
      //  // Unstable assertion: assertEquals("", mediaData1.getParentAlbumName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MediaUtil mediaUtil0 = new MediaUtil();
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setRecordId((-1));
      byte[] byteArray0 = mediaUtil0.getBytesFromMediaInfo(mediaData0);
      MediaData mediaData1 = mediaUtil0.getMediaInfoFromBytes(byteArray0);
      //  // Unstable assertion: assertTrue(mediaData1.isFavorite());
      //  // Unstable assertion: assertEquals(14, byteArray0.length);
      //  // Unstable assertion: assertEquals("", mediaData1.getMediaLabel());
      //  // Unstable assertion: assertEquals((-1), mediaData1.getRecordId());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MediaUtil mediaUtil0 = new MediaUtil();
      MediaData mediaData0 = new MediaData(1, "", "");
      byte[] byteArray0 = mediaUtil0.getBytesFromMediaInfo(mediaData0);
      MediaData mediaData1 = mediaUtil0.getMediaInfoFromBytes(byteArray0);
      //  // Unstable assertion: assertEquals(0, mediaData1.getRecordId());
      //  // Unstable assertion: assertEquals(1, mediaData1.getForeignRecordId());
      //  // Unstable assertion: assertEquals("", mediaData1.getParentAlbumName());
      //  // Unstable assertion: assertTrue(mediaData1.isFavorite());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MediaUtil mediaUtil0 = new MediaUtil();
      MediaData mediaData0 = new MediaData((-1), "", "");
      byte[] byteArray0 = mediaUtil0.getBytesFromMediaInfo(mediaData0);
      MediaData mediaData1 = mediaUtil0.getMediaInfoFromBytes(byteArray0);
      //  // Unstable assertion: assertEquals(0, mediaData1.getRecordId());
      //  // Unstable assertion: assertEquals("", mediaData1.getParentAlbumName());
      //  // Unstable assertion: assertEquals((-1), mediaData1.getForeignRecordId());
      //  // Unstable assertion: assertEquals("", mediaData1.getMediaLabel());
      //  // Unstable assertion: assertTrue(mediaData1.isFavorite());
      //  // Unstable assertion: assertEquals(14, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MediaUtil mediaUtil0 = new MediaUtil();
      try { 
        mediaUtil0.readMediaAsByteArray("g");
        fail("Expecting exception: ImagePathNotValidException");
      
      } catch(ImagePathNotValidException e) {
         //
         // Path not valid for this file:g
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MediaUtil mediaUtil0 = new MediaUtil();
      byte[] byteArray0 = new byte[1];
      try { 
        mediaUtil0.getMediaInfoFromBytes(byteArray0);
        fail("Expecting exception: InvalidArrayFormatException");
      
      } catch(InvalidArrayFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MediaUtil mediaUtil0 = new MediaUtil();
      try { 
        mediaUtil0.getBytesFromMediaInfo((MediaData) null);
        fail("Expecting exception: InvalidImageDataException");
      
      } catch(InvalidImageDataException e) {
         //
         // The provided data are not valid
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MediaUtil mediaUtil0 = new MediaUtil();
      MediaData mediaData0 = new MediaData(0, "", "*");
      byte[] byteArray0 = mediaUtil0.getBytesFromMediaInfo(mediaData0);
      MediaData mediaData1 = mediaUtil0.getMediaInfoFromBytes(byteArray0);
      //  // Unstable assertion: assertTrue(mediaData1.isFavorite());
      //  // Unstable assertion: assertEquals(0, mediaData1.getRecordId());
      //  // Unstable assertion: assertEquals(14, byteArray0.length);
      //  // Unstable assertion: assertEquals("", mediaData1.getParentAlbumName());
      //  // Unstable assertion: assertEquals(0, mediaData1.getForeignRecordId());
      //  // Unstable assertion: assertEquals("", mediaData1.getMediaLabel());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MediaUtil mediaUtil0 = new MediaUtil();
      byte[] byteArray0 = mediaUtil0.readMediaAsByteArray("");
      assertEquals(1000, byteArray0.length);
  }
}