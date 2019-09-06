/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:47:05 KST 2017
 */

package org.prevayler.foundation.serialization;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.io.PipedWriter;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.core.util.CustomObjectInputStream;
import com.thoughtworks.xstream.core.util.CustomObjectOutputStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.io.xml.XppDriver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class XStreamSerializer_ESTest2 extends XStreamSerializer_ESTest_scaffolding2 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void clearEvoSuiteFramework() {
String a = "aa";
}

  @Test
  public void test0()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("default");
      XStream xStream0 = new XStream((ReflectionProvider) null);
      PipedWriter pipedWriter0 = new PipedWriter();
      CustomObjectOutputStream customObjectOutputStream0 = (CustomObjectOutputStream)xStream0.createObjectOutputStream((Writer) pipedWriter0, "default");
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        xStreamSerializer0.writeObject(customObjectOutputStream0, byteArrayInputStream0);
        fail("Expecting exception: StreamException");
      
      } catch(StreamException e) {
         //
         //  : Pipe not connected
         //
         assertThrownBy("com.thoughtworks.xstream.core.util.QuickWriter", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        xStreamSerializer0.writeObject(pipedOutputStream0, xStreamSerializer0);
        fail("Expecting exception: ObjectAccessException");
      
      } catch(ObjectAccessException e) {
         //
         // Invalid final field org.prevayler.foundation.serialization.XStreamSerializer$1.this$0
         //
         assertThrownBy("com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      // Undeclared exception!
      try { 
        xStreamSerializer0.readObject((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.Reader", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte) (-35), 1);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) byteArrayInputStream0);
      // Undeclared exception!
      try { 
        xStreamSerializer0.readObject(pushbackInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 2070, 65534);
      // Undeclared exception!
      try { 
        xStreamSerializer0.readObject(byteArrayInputStream0);
        fail("Expecting exception: StreamException");
      
      } catch(StreamException e) {
         //
         //  : input contained no data
         //
         assertThrownBy("com.thoughtworks.xstream.io.xml.XppReader", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      XStream xStream0 = xStreamSerializer0.createXStream();
      CustomObjectInputStream customObjectInputStream0 = (CustomObjectInputStream)xStream0.createObjectInputStream((HierarchicalStreamReader) null);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) customObjectInputStream0);
      // Undeclared exception!
      try { 
        xStreamSerializer0.readObject(dataInputStream0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.thoughtworks.xstream.core.util.CustomObjectInputStream", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("");
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 869, (int) (byte)0);
      try { 
        xStreamSerializer0.readObject(byteArrayInputStream0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // 
         //
         assertThrownBy("sun.nio.cs.StreamDecoder", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      try { 
        xStreamSerializer0.writeObject(byteArrayOutputStream0, "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // 
         //
         assertThrownBy("sun.nio.cs.StreamEncoder", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer((String) null);
      XppDriver xppDriver0 = new XppDriver();
      XStream xStream0 = new XStream((HierarchicalStreamDriver) xppDriver0);
      CustomObjectOutputStream customObjectOutputStream0 = (CustomObjectOutputStream)xStream0.createObjectOutputStream((Writer) null);
      // Undeclared exception!
      try { 
        xStreamSerializer0.writeObject(customObjectOutputStream0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.thoughtworks.xstream.core.util.QuickWriter", e);
      }
  }

  @Test
  public void test9()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      xStreamSerializer0.writeObject(byteArrayOutputStream0, byteArrayOutputStream0);
      assertEquals(141, byteArrayOutputStream0.size());
  }
}
