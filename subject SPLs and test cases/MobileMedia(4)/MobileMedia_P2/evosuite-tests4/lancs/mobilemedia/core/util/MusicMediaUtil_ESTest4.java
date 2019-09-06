/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:32:38 KST 2018
 */

package lancs.mobilemedia.core.util;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.core.ui.datamodel.MediaData;
import lancs.mobilemedia.lib.exceptions.InvalidArrayFormatException;
import lancs.mobilemedia.lib.exceptions.InvalidImageDataException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MusicMediaUtil_ESTest4 extends MusicMediaUtil_ESTest_scaffolding4 {
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
      MusicMediaUtil musicMediaUtil0 = new MusicMediaUtil();
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setRecordId(1);
      byte[] byteArray0 = musicMediaUtil0.getBytesFromMediaInfo(mediaData0);
      MediaData mediaData1 = musicMediaUtil0.getMultiMediaInfoFromBytes(byteArray0);
      assertFalse(mediaData1.isFavorite());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MusicMediaUtil musicMediaUtil0 = new MusicMediaUtil();
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setRecordId((-1));
      byte[] byteArray0 = musicMediaUtil0.getBytesFromMediaInfo(mediaData0);
      MediaData mediaData1 = musicMediaUtil0.getMultiMediaInfoFromBytes(byteArray0);
      assertEquals(0, mediaData1.getNumberOfViews());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MusicMediaUtil musicMediaUtil0 = new MusicMediaUtil();
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.increaseNumberOfViews();
      byte[] byteArray0 = musicMediaUtil0.getBytesFromMediaInfo(mediaData0);
      MediaData mediaData1 = musicMediaUtil0.getMultiMediaInfoFromBytes(byteArray0);
      assertEquals(1, mediaData1.getNumberOfViews());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MusicMediaUtil musicMediaUtil0 = new MusicMediaUtil();
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setNumberOfViews((-1));
      byte[] byteArray0 = musicMediaUtil0.getBytesFromMediaInfo(mediaData0);
      MediaData mediaData1 = musicMediaUtil0.getMultiMediaInfoFromBytes(byteArray0);
      assertNotSame(mediaData1, mediaData0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MusicMediaUtil musicMediaUtil0 = new MusicMediaUtil();
      MediaData mediaData0 = new MediaData((-1), "", "");
      byte[] byteArray0 = musicMediaUtil0.getBytesFromMediaInfo(mediaData0);
      MediaData mediaData1 = musicMediaUtil0.getMultiMediaInfoFromBytes(byteArray0);
      assertFalse(mediaData1.isFavorite());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MusicMediaUtil musicMediaUtil0 = new MusicMediaUtil();
      byte[] byteArray0 = new byte[8];
      try { 
        musicMediaUtil0.getMultiMediaInfoFromBytes(byteArray0);
        fail("Expecting exception: InvalidArrayFormatException");
      
      } catch(InvalidArrayFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MusicMediaUtil musicMediaUtil0 = new MusicMediaUtil();
      try { 
        musicMediaUtil0.getBytesFromMediaInfo((MediaData) null);
        fail("Expecting exception: InvalidImageDataException");
      
      } catch(InvalidImageDataException e) {
         //
         // The provided data are not valid
         //
         verifyException("lancs.mobilemedia.core.util.MusicMediaUtil", e);
      }
  }

  
}
