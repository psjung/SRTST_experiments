/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 14 00:12:34 KST 2018
 */

package lancs.mobilemedia.core.ui.datamodel;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MediaData_ESTest2 extends MediaData_ESTest_scaffolding2 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.toggleFavorite();
      boolean boolean0 = mediaData0.isFavorite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setRecordId(1);
      int int0 = mediaData0.getRecordId();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setRecordId((-1));
      int int0 = mediaData0.getRecordId();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MediaData mediaData0 = new MediaData(0, "", "");
      assertEquals(0, mediaData0.getForeignRecordId());
      
      mediaData0.setForeignRecordId(1);
      int int0 = mediaData0.getForeignRecordId();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MediaData mediaData0 = new MediaData(0, "", "");
      assertEquals(0, mediaData0.getForeignRecordId());
      
      mediaData0.setForeignRecordId((-1));
      int int0 = mediaData0.getForeignRecordId();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.toggleFavorite();
      assertTrue(mediaData0.isFavorite());
      
      mediaData0.toggleFavorite();
      assertEquals(0, mediaData0.getForeignRecordId());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MediaData mediaData0 = new MediaData(0, "", "");
      assertFalse(mediaData0.isFavorite());
      
      mediaData0.setFavorite(true);
      assertTrue(mediaData0.isFavorite());
  }
}