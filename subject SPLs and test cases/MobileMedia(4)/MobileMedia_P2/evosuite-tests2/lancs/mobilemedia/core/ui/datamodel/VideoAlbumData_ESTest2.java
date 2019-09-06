/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 14 00:14:35 KST 2018
 */

package lancs.mobilemedia.core.ui.datamodel;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.lib.exceptions.ImageNotFoundException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class VideoAlbumData_ESTest2 extends VideoAlbumData_ESTest_scaffolding2 {
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
      VideoAlbumData videoAlbumData0 = new VideoAlbumData();
      try { 
        videoAlbumData0.getVideoFromRecordStore("", "");
        fail("Expecting exception: ImageNotFoundException");
      
      } catch(ImageNotFoundException e) {
         //
         //  was NULL in ImageAccessor Hashtable.
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.MediaAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VideoAlbumData videoAlbumData0 = new VideoAlbumData();
      // Undeclared exception!
      try { 
        videoAlbumData0.getVideoFromRecordStore("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
