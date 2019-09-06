/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:41:24 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Comparator;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Key_ESTest1 extends Key_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      Key key0 = new Key((byte[]) null);
      byte[] byteArray0 = key0.getKey();
      assertNull(byteArray0);
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = Key.makeKey(databaseEntry0);
      Key key0 = new Key(byteArray0);
      byte[] byteArray1 = key0.getKey();
      assertNotSame(byteArray1, byteArray0);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Key key0 = new Key(byteArray0);
      byte[] byteArray1 = new byte[0];
      Key key1 = new Key(byteArray1);
      int int0 = key1.compareTo(key0);
      assertFalse(key0.equals((Object)key1));
      assertEquals((-5), int0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[2];
      int int0 = Key.compareKeys(byteArray1, byteArray0, (Comparator) null);
      assertEquals(1, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[2];
      int int0 = Key.compareKeys(byteArray0, byteArray1, (Comparator) null);
      assertEquals((-1), int0);
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      String string0 = Key.getNoFormatString(byteArray0);
      assertEquals("key=<key v=\"0 \"/>", string0);
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Key key0 = new Key(byteArray0);
      byte[] byteArray1 = new byte[0];
      Key key1 = new Key(byteArray1);
      int int0 = key0.compareTo(key1);
      assertEquals(1, int0);
      assertFalse(key1.equals((Object)key0));
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)1;
      Key key0 = new Key(byteArray0);
      key0.hashCode();
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte) (-126);
      Key key0 = new Key(byteArray0);
      byte[] byteArray1 = new byte[7];
      Key key1 = new Key(byteArray1);
      boolean boolean0 = key0.equals(key1);
      assertFalse(boolean0);
      assertFalse(key1.equals((Object)key0));
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      byte[] byteArray1 = Key.makeKey(databaseEntry0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray1);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Key.makeKey((DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Key", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-67), (-1));
      // Undeclared exception!
      try { 
        Key.makeKey(databaseEntry0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Key", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Key key0 = new Key((byte[]) null);
      // Undeclared exception!
      try { 
        key0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Key", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Key key0 = new Key((byte[]) null);
      // Undeclared exception!
      try { 
        key0.equals(key0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        Key.dumpString(byteArray0, 1907);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 1907
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Key key0 = new Key(byteArray0);
      Integer integer0 = new Integer((int) (byte) (-127));
      // Undeclared exception!
      try { 
        key0.compareTo(integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to com.sleepycat.je.tree.Key
         //
         assertThrownBy("com.sleepycat.je.tree.Key", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        Key.compareKeys((byte[]) null, byteArray0, (Comparator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Key key0 = new Key(byteArray0);
      int int0 = key0.compareTo(key0);
      assertEquals(0, int0);
  }

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = Key.dumpString(byteArray0, (byte)1);
      assertEquals(" <key v=\"0 0 \"/>", string0);
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = Key.dumpString((byte[]) null, (byte)1);
      assertEquals(" <key v=\"<null>\"/>", string0);
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Key key0 = new Key(byteArray0);
      byte[] byteArray1 = new byte[7];
      byteArray1[1] = (byte) (-118);
      Key key1 = new Key(byteArray1);
      boolean boolean0 = key0.equals(key1);
      assertFalse(key1.equals((Object)key0));
      assertFalse(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = Key.compareKeys(byteArray0, byteArray0, (Comparator) null);
      assertEquals(0, int0);
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Key key0 = new Key(byteArray0);
      key0.hashCode();
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Key key0 = new Key(byteArray0);
      boolean boolean0 = key0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Key key0 = new Key(byteArray0);
      // Undeclared exception!
      try { 
        key0.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Key", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Key key0 = new Key(byteArray0);
      boolean boolean0 = key0.equals(key0);
      assertTrue(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)0, 976);
      // Undeclared exception!
      try { 
        Key.makeKey(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      Key key0 = new Key((byte[]) null);
      // Undeclared exception!
      try { 
        key0.compareTo(key0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Key key0 = new Key(byteArray0);
      byte[] byteArray1 = key0.getKey();
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray1);
      assertNotNull(byteArray1);
  }
}
