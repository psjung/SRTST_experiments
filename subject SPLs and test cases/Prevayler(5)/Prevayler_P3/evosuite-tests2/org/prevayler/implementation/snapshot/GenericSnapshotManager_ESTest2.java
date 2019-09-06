/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 21:47:02 KST 2017
 */

package org.prevayler.implementation.snapshot;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.XStreamSerializer;
import org.prevayler.implementation.PrevalentSystemGuard;
import org.prevayler.implementation.PrevaylerDirectory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class GenericSnapshotManager_ESTest2 extends GenericSnapshotManager_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      GenericSnapshotManager genericSnapshotManager0 = new GenericSnapshotManager(". =S#w1Tg0q16V");
      // Undeclared exception!
      try { 
        genericSnapshotManager0.writeSnapshot((Object) null, 1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.snapshot.GenericSnapshotManager", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      HashMap<Object, JavaSerializer> hashMap0 = new HashMap<Object, JavaSerializer>();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      hashMap0.put(javaSerializer0, javaSerializer0);
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("Q<I'U73N!A");
      GenericSnapshotManager genericSnapshotManager0 = null;
      try {
        genericSnapshotManager0 = new GenericSnapshotManager((Map) hashMap0, "Q<I'U73N!A", (Object) byteArrayInputStream0, prevaylerDirectory0, (Serializer) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.prevayler.foundation.serialization.JavaSerializer cannot be cast to java.lang.String
         //
         assertThrownBy("org.prevayler.implementation.snapshot.GenericSnapshotManager", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      GenericSnapshotManager genericSnapshotManager0 = null;
      try {
        genericSnapshotManager0 = new GenericSnapshotManager((Map) hashMap0, "%Zv]0+H4-;pG0W,", (Object) null, (PrevaylerDirectory) null, (Serializer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Primary suffix '%Zv]0+H4-;pG0W,' does not appear in strategies map
         //
         assertThrownBy("org.prevayler.implementation.snapshot.GenericSnapshotManager", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      HashMap<XStreamSerializer, InputStream> hashMap0 = new HashMap<XStreamSerializer, InputStream>();
      Object object0 = new Object();
      hashMap0.put((XStreamSerializer) null, (InputStream) null);
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      GenericSnapshotManager genericSnapshotManager0 = null;
      try {
        genericSnapshotManager0 = new GenericSnapshotManager((Map) hashMap0, "cw", object0, prevaylerDirectory0, (Serializer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      GenericSnapshotManager genericSnapshotManager0 = new GenericSnapshotManager(". =S#w1Tg0q16V");
      PrevalentSystemGuard prevalentSystemGuard0 = genericSnapshotManager0.recoveredPrevalentSystem();
      assertNotNull(prevalentSystemGuard0);
  }

  @Test
  public void test5()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      GenericSnapshotManager genericSnapshotManager0 = new GenericSnapshotManager(javaSerializer0);
      JavaSerializer javaSerializer1 = (JavaSerializer)genericSnapshotManager0.primarySerializer();
      assertNotSame(javaSerializer1, javaSerializer0);
  }
}
