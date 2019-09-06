/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 17:39:07 KST 2017
 */

package org.prevayler.foundation.serialization;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.core.util.CustomObjectInputStream;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.io.xml.XppDomReader;
import com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class XStreamSerializer_ESTest3 extends XStreamSerializer_ESTest_scaffolding3 {
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
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      FileInputStream fileInputStream0 = new FileInputStream(fileDescriptor0);
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream((InputStream) fileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream Closed
         //
         assertThrownBy("java.io.FileInputStream", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      // Undeclared exception!
      try { 
        xStreamSerializer0.writeObject((OutputStream) null, xStreamSerializer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.Writer", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        xStreamSerializer0.writeObject(pipedOutputStream0, object0);
        fail("Expecting exception: StreamException");
      
      } catch(StreamException e) {
         //
         //  : Pipe not connected
         //
         assertThrownBy("com.thoughtworks.xstream.core.util.QuickWriter", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      // Undeclared exception!
      try { 
        xStreamSerializer0.writeObject(byteArrayOutputStream0, xStreamSerializer0);
        fail("Expecting exception: ObjectAccessException");
      
      } catch(ObjectAccessException e) {
         //
         // Invalid final field org.prevayler.foundation.serialization.XStreamSerializer$1.this$0
         //
         assertThrownBy("com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
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
  public void test5()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)1, (int) (byte)1);
      // Undeclared exception!
      try { 
        xStreamSerializer0.readObject(byteArrayInputStream0);
        fail("Expecting exception: StreamException");
      
      } catch(StreamException e) {
         //
         //  : only whitespace content allowed before start tag and not \\u0 (position: START_DOCUMENT seen \\u0... @1:1) 
         //
         assertThrownBy("com.thoughtworks.xstream.io.xml.XppReader", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("UxHO5");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        xStreamSerializer0.readObject(pipedInputStream0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // UxHO5
         //
         assertThrownBy("sun.nio.cs.StreamDecoder", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("d%K");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) bufferedOutputStream0);
      try { 
        xStreamSerializer0.writeObject(objectOutputStream0, (Object) null);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // d%K
         //
         assertThrownBy("sun.nio.cs.StreamEncoder", e);
      }
  }

  @Test
  public void test9()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer((String) null);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1213);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) byteArrayOutputStream0);
      PrintStream printStream0 = new PrintStream((OutputStream) bufferedOutputStream0);
      Object object0 = new Object();
      xStreamSerializer0.writeObject(printStream0, object0);
  }
}
