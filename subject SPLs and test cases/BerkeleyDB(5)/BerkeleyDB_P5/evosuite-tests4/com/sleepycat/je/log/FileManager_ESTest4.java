/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:56:22 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.FileManager;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FileManager_ESTest4 extends FileManager_ESTest_scaffolding4 {

  @Test
  public void test01()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("O-");
      FileManager.FileManager_writeToFile fileManager_FileManager_writeToFile0 = new FileManager.FileManager_writeToFile((FileManager) null, (RandomAccessFile) null, byteBuffer0, 0);
      fileManager_FileManager_writeToFile0.pos = (-3507);
      int int0 = fileManager_FileManager_writeToFile0.execute();
      assertEquals(0, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("y");
      FileManager.FileManager_writeToFile fileManager_FileManager_writeToFile0 = new FileManager.FileManager_writeToFile((FileManager) null, (RandomAccessFile) null, byteBuffer0, 0L);
      fileManager_FileManager_writeToFile0.size = (-369);
      int int0 = fileManager_FileManager_writeToFile0.execute();
      assertEquals(0, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("O-");
      FileManager.FileManager_writeToFile fileManager_FileManager_writeToFile0 = new FileManager.FileManager_writeToFile((FileManager) null, (RandomAccessFile) null, byteBuffer0, 0);
      fileManager_FileManager_writeToFile0.origLimit = (-1893);
      int int0 = fileManager_FileManager_writeToFile0.execute();
      assertEquals(0, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("O-");
      FileManager.FileManager_writeToFile fileManager_FileManager_writeToFile0 = new FileManager.FileManager_writeToFile((FileManager) null, (RandomAccessFile) null, byteBuffer0, 0);
      fileManager_FileManager_writeToFile0.bytesWritten = 10;
      int int0 = fileManager_FileManager_writeToFile0.execute();
      assertEquals(0, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      FileManager.FileManager_writeToFile fileManager_FileManager_writeToFile0 = new FileManager.FileManager_writeToFile((FileManager) null, (RandomAccessFile) null, (ByteBuffer) null, (-2157L));
  }

  @Test
  public void test06()  throws Throwable  {
      FileManager fileManager0 = null;
      try {
        fileManager0 = new FileManager((EnvironmentImpl) null, (File) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      FileManager.FileMode fileManager_FileMode0 = FileManager.FileMode.READ_MODE;
      String string0 = fileManager_FileMode0.getModeValue();
      assertEquals("r", string0);
  }

  @Test
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        FileManager.listFiles((File) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = FileManager.getFileName(0, "O-");
      assertEquals("00000000O-", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = FileManager.firstLogEntryOffset();
      assertEquals(38, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("-");
      FileManager.FileManager_readFromFile fileManager_FileManager_readFromFile0 = new FileManager.FileManager_readFromFile((FileManager) null, (RandomAccessFile) null, byteBuffer0, (-2018L));
      fileManager_FileManager_readFromFile0.execute();
  }
}
