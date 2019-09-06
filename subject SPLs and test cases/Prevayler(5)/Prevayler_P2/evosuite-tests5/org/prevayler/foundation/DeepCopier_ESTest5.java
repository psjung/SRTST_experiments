/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:19:31 KST 2017
 */

package org.prevayler.foundation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.NotSerializableException;
import java.io.PipedInputStream;
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
public class DeepCopier_ESTest5 extends DeepCopier_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      Object object0 = DeepCopier.deepCopy((Object) null, (Serializer) skaringaSerializer0);
      assertNull(object0);
  }

  @Test
  public void test01()  throws Throwable  {
      Object object0 = DeepCopier.deepCopy((Object) null);
      assertNull(object0);
  }

  @Test
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        DeepCopier.deepCopyParallel("", (Serializer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.DeepCopier", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("!T37JN.jD");
      try { 
        DeepCopier.deepCopyParallel("!T37JN.jD", xStreamSerializer0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // !T37JN.jD
         //
         assertThrownBy("sun.nio.cs.StreamEncoder", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      JavaSerializer javaSerializer0 = new JavaSerializer();
      try { 
        DeepCopier.deepCopyParallel(object0, javaSerializer0);
        fail("Expecting exception: NotSerializableException");
      
      } catch(NotSerializableException e) {
         //
         // java.lang.Object
         //
         assertThrownBy("java.io.ObjectOutputStream", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      DeepCopier deepCopier0 = new DeepCopier();
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("boolean");
      // Undeclared exception!
      try { 
        DeepCopier.deepCopy((Object) deepCopier0, (Serializer) xStreamSerializer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected Exception was thrown.
         //
         assertThrownBy("org.prevayler.foundation.Cool", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1667);
      // Undeclared exception!
      try { 
        DeepCopier.deepCopy((Object) pipedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected Exception was thrown.
         //
         assertThrownBy("org.prevayler.foundation.Cool", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer((-377));
      Integer integer1 = (Integer)DeepCopier.deepCopy((Object) integer0);
      assertEquals((-377), (int)integer1);
  }

  @Test
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      Object object1 = DeepCopier.deepCopy(object0, (Serializer) xStreamSerializer0);
      assertFalse(object1.equals((Object)object0));
  }
}
