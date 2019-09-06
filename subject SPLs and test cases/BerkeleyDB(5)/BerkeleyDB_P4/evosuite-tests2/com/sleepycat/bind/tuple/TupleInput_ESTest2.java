/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:02:05 KST 2017
 */

package com.sleepycat.bind.tuple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleOutput;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TupleInput_ESTest2 extends TupleInput_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedInt(0L);
      char[] charArray0 = new char[3];
      tupleOutput0.writeFloat(1.0F);
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      tupleInput0.readString();
      tupleInput0.readBytes(charArray0);
      tupleInput0.readShort();
      int int0 = tupleInput0.readUnsignedShort();
      assertEquals(0, tupleInput0.available());
      assertEquals(0, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      long long0 = tupleInput0.readUnsignedInt();
      assertEquals(0L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeChar(0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      int int0 = tupleInput0.readUnsignedByte();
      assertEquals(0, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      String string0 = tupleInput0.readString();
      assertEquals("", string0);
      assertEquals(0, tupleInput0.available());
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeInt((byte)32);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      short short0 = tupleInput0.readShort();
      assertEquals((short)0, short0);
  }

  @Test
  public void test05()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[1];
      byte[] byteArray0 = new byte[2];
      tupleOutput0.writeFast(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeChars(charArray0);
      TupleOutput tupleOutput2 = tupleOutput1.writeInt(0);
      TupleOutput tupleOutput3 = tupleOutput2.writeUnsignedInt(0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput3);
      tupleInput0.readFloat();
      long long0 = tupleInput0.readLong();
      assertEquals(0L, long0);
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-4);
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      byte byte0 = tupleInput0.readByte();
      assertEquals((byte) (-128), byte0);
      
      int int0 = tupleInput0.readInt();
      assertEquals(2080374784, int0);
  }

  @Test
  public void test07()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[1];
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-64);
      tupleOutput0.writeFast(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeChars(charArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      float float0 = tupleInput0.readFloat();
      assertEquals((-2.0F), float0, 0.01F);
  }

  @Test
  public void test08()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.writeBoolean(true);
      char[] charArray0 = new char[7];
      charArray0[2] = '1';
      tupleOutput0.writeChars(charArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      float float0 = tupleInput0.readFloat();
      assertEquals(2.3509887E-38F, float0, 0.01F);
      
      boolean boolean0 = tupleInput0.readBoolean();
      assertFalse(boolean0);
      
      char char0 = tupleInput0.readChar();
      assertEquals('1', char0);
  }

  @Test
  public void test09()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeBoolean(true);
      TupleOutput tupleOutput2 = tupleOutput1.writeChar(0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput2);
      char char0 = tupleInput0.readChar();
      assertEquals('\u0100', char0);
  }

  @Test
  public void test10()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeChars(".");
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      try { 
        tupleInput0.readBytes(2836);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedInt((-2412L));
      TupleOutput tupleOutput2 = tupleOutput1.writeShort((-1315));
      tupleOutput2.writeUnsignedShort((-2100));
      TupleInput tupleInput0 = new TupleInput(tupleOutput2);
      long long0 = tupleInput0.readLong();
      assertEquals(9223361679455025100L, long0);
  }

  @Test
  public void test12()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeChars("4xt");
      char[] charArray0 = new char[2];
      TupleOutput tupleOutput2 = tupleOutput1.writeString(charArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput2);
      double double0 = tupleInput0.readDouble();
      assertEquals(1.1126387865636956E-307, double0, 0.01D);
  }

  @Test
  public void test13()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeByte((-2219));
      TupleOutput tupleOutput2 = tupleOutput1.writeString("");
      char[] charArray0 = new char[4];
      charArray0[1] = '8';
      tupleOutput2.write(0);
      tupleOutput2.writeChars(charArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      double double0 = tupleInput0.readDouble();
      assertEquals((-2.799680927731167E101), double0, 0.01D);
  }

  @Test
  public void test14()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeChars("4xt");
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      try { 
        tupleInput0.readDouble();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.writeInt(0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      int int0 = tupleInput0.readInt();
      assertEquals(0, int0);
  }

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-1);
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      short short0 = tupleInput0.readShort();
      assertEquals((short)32512, short0);
  }

  @Test
  public void test17()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.writeByte((-2219));
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      byte byte0 = tupleInput0.readByte();
      assertEquals((byte)85, byte0);
  }

  @Test
  public void test18()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedInt((-4424L));
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      try { 
        tupleInput0.readString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-47);
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      try { 
        tupleInput0.readString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.writeFloat(2050.4158F);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      int int0 = tupleInput0.readInt();
      assertEquals((-989845849), int0);
  }

  @Test
  public void test21()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[4];
      tupleOutput0.writeChars(charArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      double double0 = tupleInput0.readDouble();
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (-13), 31);
      try { 
        tupleInput0.readUnsignedInt();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (-457), (int) (byte)82);
      try { 
        tupleInput0.readUnsignedByte();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeInt((byte) (-128));
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      char[] charArray0 = new char[5];
      try { 
        tupleInput0.readString(charArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      char[] charArray0 = new char[6];
      try { 
        tupleInput0.readString(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        tupleInput0.readString((-2334));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-76);
      tupleOutput0.write(byteArray0);
      try { 
        tupleInput0.readString(32);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      try { 
        tupleInput0.readString(53504);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      tupleInput0.readShort();
      try { 
        tupleInput0.readShort();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 0, 1109);
      try { 
        tupleInput0.readLong();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte) (-6), (int) (byte)0);
      try { 
        tupleInput0.readInt();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 2181, (-226));
      tupleInput0.skip((-2147483648L));
      try { 
        tupleInput0.readFloat();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 0, 48);
      try { 
        tupleInput0.readDouble();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test34()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        tupleInput0.readChars((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (-1), 300);
      char[] charArray0 = new char[9];
      try { 
        tupleInput0.readChars(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      // Undeclared exception!
      try { 
        tupleInput0.readChars(2138995570);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Java heap space
         //
      }
  }

  @Test
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      // Undeclared exception!
      try { 
        tupleInput0.readChars((int) (byte) (-39));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte) (-45), 192);
      try { 
        tupleInput0.readChars(6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      try { 
        tupleInput0.readChar();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (-1160), (int) (byte)127);
      try { 
        tupleInput0.readChar();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test41()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        tupleInput0.readBytes((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte) (-106), (int) (byte)0);
      char[] charArray0 = new char[7];
      try { 
        tupleInput0.readBytes(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test43()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        tupleInput0.readBytes(2130165231);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Java heap space
         //
      }
  }

  @Test
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      // Undeclared exception!
      try { 
        tupleInput0.readBytes((int) (byte) (-42));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 40, (int) (byte)94);
      try { 
        tupleInput0.readByte();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (-961), (int) (byte) (-19));
      try { 
        tupleInput0.readBoolean();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test47()  throws Throwable  {
      TupleInput tupleInput0 = null;
      try {
        tupleInput0 = new TupleInput((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test48()  throws Throwable  {
      TupleInput tupleInput0 = null;
      try {
        tupleInput0 = new TupleInput((TupleOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test49()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedInt(0L);
      char[] charArray0 = new char[3];
      tupleOutput0.writeFloat(1.0F);
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      tupleInput0.readBytes(charArray0);
      tupleInput0.readShort();
      try { 
        tupleInput0.readUnsignedInt();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test50()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.writeBytes("e6c{bKe(");
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      long long0 = tupleInput0.readUnsignedInt();
      assertEquals(1698063227L, long0);
  }

  @Test
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 2946, (int) (byte)0);
      try { 
        tupleInput0.readUnsignedShort();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test52()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeLong(0L);
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      tupleInput0.readUnsignedShort();
      try { 
        tupleInput0.readLong();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      tupleInput0.readByte();
      try { 
        tupleInput0.readUnsignedByte();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeInt((byte) (-128));
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      int int0 = tupleInput0.readUnsignedByte();
      assertEquals(127, int0);
  }

  @Test
  public void test55()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[3];
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      tupleInput0.readString(charArray0);
      assertEquals(3, tupleInput0.getBufferOffset());
  }

  @Test
  public void test56()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[7];
      TupleOutput tupleOutput1 = tupleOutput0.writeChars(charArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      tupleInput0.readChars(charArray0);
      assertEquals(0, tupleInput0.available());
  }

  @Test
  public void test57()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.writeLong(0);
      char[] charArray0 = new char[2];
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      tupleInput0.readBytes(charArray0);
      assertEquals(6, tupleInput0.available());
  }

  @Test
  public void test58()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[2];
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      try { 
        tupleInput0.readBytes(charArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test59()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      String string0 = tupleInput0.readChars(0);
      assertEquals("", string0);
  }

  @Test
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      try { 
        tupleInput0.readChars((int) (byte)56);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test61()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      String string0 = tupleInput0.readBytes(0);
      assertEquals("", string0);
  }

  @Test
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte) (-73), (int) (byte)0);
      try { 
        tupleInput0.readBytes(1667);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[22];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      char char0 = tupleInput0.readChar();
      assertEquals('\u0000', char0);
  }

  @Test
  public void test64()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.writeBoolean(true);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      boolean boolean0 = tupleInput0.readBoolean();
      assertTrue(boolean0);
  }

  @Test
  public void test65()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      try { 
        tupleInput0.readBoolean();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test66()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedByte(2047);
      tupleOutput1.writeUnsignedInt(2047);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      tupleInput0.readString();
      assertEquals(3, tupleInput0.available());
  }

  @Test
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedByte(2047);
      tupleOutput0.writeChar(2047);
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      try { 
        tupleInput0.readString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test68()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (-1274), 2163);
      try { 
        tupleInput0.readShort();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test69()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      try { 
        tupleInput0.readFloat();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test70()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 16, (int) (byte)24);
      try { 
        tupleInput0.readUnsignedShort();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test71()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      try { 
        tupleInput0.readInt();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test72()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[4];
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      try { 
        tupleInput0.readChars(charArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test73()  throws Throwable  {
      byte[] byteArray0 = new byte[22];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      long long0 = tupleInput0.readLong();
      assertEquals((-9223372036854775808L), long0);
  }

  @Test
  public void test74()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      try { 
        tupleInput0.readByte();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test75()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      tupleInput0.readString(40);
      assertEquals(40, tupleInput0.getBufferOffset());
  }
}
