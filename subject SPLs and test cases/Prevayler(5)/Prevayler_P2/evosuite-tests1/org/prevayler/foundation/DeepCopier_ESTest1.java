/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:19:55 KST 2017
 */

package org.prevayler.foundation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.NotSerializableException;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.SkaringaSerializer;
import org.prevayler.foundation.serialization.XStreamSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DeepCopier_ESTest1 extends DeepCopier_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer((ClassLoader) null);
      Object object0 = DeepCopier.deepCopy((Object) null, (Serializer) javaSerializer0);
      assertNull(object0);
  }

  @Test
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = (Integer)DeepCopier.deepCopy((Object) integer0);
      assertTrue(integer0.equals((Object)integer1));
  }

  @Test
  public void test2()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("N?9Xx=I3YC\"2}9<");
      byte[] byteArray0 = new byte[0];
      try { 
        DeepCopier.deepCopyParallel(byteArray0, xStreamSerializer0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // N?9Xx=I3YC\"2}9<
         //
         assertThrownBy("sun.nio.cs.StreamEncoder", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      JavaSerializer javaSerializer0 = new JavaSerializer();
      // Undeclared exception!
      try { 
        DeepCopier.deepCopy(object0, (Serializer) javaSerializer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected Exception was thrown.
         //
         assertThrownBy("org.prevayler.foundation.Cool", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DeepCopier.deepCopy(object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected Exception was thrown.
         //
         assertThrownBy("org.prevayler.foundation.Cool", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Integer integer0 = new Integer(1);
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      Integer integer1 = (Integer)DeepCopier.deepCopy((Object) integer0, (Serializer) xStreamSerializer0);
      assertTrue(integer1.equals((Object)integer0));
  }

  @Test
  public void test7()  throws Throwable  {
      Object object0 = DeepCopier.deepCopy((Object) null);
      assertNull(object0);
  }

  @Test
  public void test8()  throws Throwable  {
      DeepCopier deepCopier0 = new DeepCopier();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      try { 
        DeepCopier.deepCopyParallel(deepCopier0, javaSerializer0);
        fail("Expecting exception: NotSerializableException");
      
      } catch(NotSerializableException e) {
         //
         // org.prevayler.foundation.DeepCopier
         //
         assertThrownBy("java.io.ObjectOutputStream", e);
      }
  }
}
