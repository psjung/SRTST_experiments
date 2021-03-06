/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:59:48 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FileProcessor_ESTest5 extends FileProcessor_ESTest_scaffolding5 {

  @Test
  public void test05()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      Long long0 = new Long((-1L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile(fileProcessor0, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processFile", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor(".<p?;x]|hY2m", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.doClean(true, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Long long0 = new Long(0L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook137();
  }

  @Test
  public void test17()  throws Throwable  {
      Long long0 = new Long(0L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook119();
  }

  @Test
  public void test18()  throws Throwable  {
      Long long0 = new Long((long) 868);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook147();
  }

  @Test
  public void test19()  throws Throwable  {
      Long long0 = new Long((long) 868);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook154();
      fileProcessor_FileProcessor_processFile0.hook155();
  }

  @Test
  public void test20()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) (-1L));
      fileProcessor_FileProcessor_processFile0.hook129();
  }

  @Test
  public void test21()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) (-1L));
      fileProcessor_FileProcessor_processFile0.hook120();
  }

  @Test
  public void test22()  throws Throwable  {
      Long long0 = new Long(67108869L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook130();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      // Undeclared exception!
      try { 
        fileProcessor0.nDeadlockRetries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.clearEnv();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test29()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      String string0 = fileProcessor0.toString();
      assertEquals("<Cleaner name=\"jHX<C@!I*3\"/>", string0);
  }

  @Test
  public void test31()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook144();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test32()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      // Undeclared exception!
      try { 
        fileProcessor0.onWakeup();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook152();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test34()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook142();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test36()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      try { 
        fileProcessor0.addToQueue(fileProcessor0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Cleaner.addToQueue should never be called.
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook153();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test39()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook151();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test40()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook143();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test41()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook138();
      assertFalse(fileProcessor0.isRunning());
  }
}
