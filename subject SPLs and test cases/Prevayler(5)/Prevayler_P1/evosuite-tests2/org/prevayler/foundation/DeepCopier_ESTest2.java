/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:10:33 KST 2017
 */

package org.prevayler.foundation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.PipedInputStream;
import java.io.UnsupportedEncodingException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.SkaringaSerializer;
import org.prevayler.foundation.serialization.XStreamSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DeepCopier_ESTest2 extends DeepCopier_ESTest_scaffolding2 {

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
      JavaSerializer javaSerializer0 = new JavaSerializer();
      try { 
        DeepCopier.deepCopyParallel(javaSerializer0, javaSerializer0);
        fail("Expecting exception: NotSerializableException");
      
      } catch(NotSerializableException e) {
         //
         // org.prevayler.foundation.serialization.JavaSerializer
         //
         assertThrownBy("java.io.ObjectOutputStream", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("");
      // Undeclared exception!
      try { 
        DeepCopier.deepCopy(object0, (Serializer) xStreamSerializer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected Exception was thrown.
         //
         assertThrownBy("org.prevayler.foundation.Cool", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      String string0 = (String)DeepCopier.deepCopy((Object) "");
      assertEquals("", string0);
  }

  @Test
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer((-2183));
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      Integer integer1 = (Integer)DeepCopier.deepCopy((Object) integer0, (Serializer) skaringaSerializer0);
      assertTrue(integer1.equals((Object)integer0));
  }

  @Test
  public void test10()  throws Throwable  {
      DeepCopier deepCopier0 = new DeepCopier();
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("");
      try { 
        DeepCopier.deepCopyParallel(deepCopier0, xStreamSerializer0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // 
         //
         assertThrownBy("sun.nio.cs.StreamEncoder", e);
      }
  }
}
