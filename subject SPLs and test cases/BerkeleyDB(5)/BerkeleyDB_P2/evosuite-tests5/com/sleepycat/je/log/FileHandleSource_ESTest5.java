/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:35:28 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FileHandleSource_ESTest5 extends FileHandleSource_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      FileHandleSource fileHandleSource0 = null;
      try {
        fileHandleSource0 = new FileHandleSource((FileHandle) null, 344, (FileManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileHandleSource", e);
      }
  }
}
