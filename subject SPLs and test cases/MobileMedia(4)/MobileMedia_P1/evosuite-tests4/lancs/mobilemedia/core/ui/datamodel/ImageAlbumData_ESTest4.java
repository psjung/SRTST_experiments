/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:19:35 KST 2018
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
public class ImageAlbumData_ESTest4 extends ImageAlbumData_ESTest_scaffolding4 {
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
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      // Undeclared exception!
      try { 
        imageAlbumData0.getImageFromRecordStore((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      try { 
        imageAlbumData0.getImageFromRecordStore("", "");
        fail("Expecting exception: ImageNotFoundException");
      
      } catch(ImageNotFoundException e) {
         //
         //  was NULL in ImageAccessor Hashtable.
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.MediaAccessor", e);
      }
  }
}