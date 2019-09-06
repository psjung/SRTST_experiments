/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:13:21 KST 2017
 */

package com.sleepycat.bind.tuple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.tuple.CharacterBinding;
import com.sleepycat.bind.tuple.TupleBase;
import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleOutput;
import com.sleepycat.je.DatabaseEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class CharacterBinding_ESTest4 extends CharacterBinding_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      CharacterBinding.charToEntry('6', databaseEntry0);
      char char0 = CharacterBinding.entryToChar(databaseEntry0);
      assertEquals('6', char0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-77);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      char char0 = CharacterBinding.entryToChar(databaseEntry0);
      assertEquals('\uB300', char0);
  }

  @Test
  public void test02()  throws Throwable  {
      CharacterBinding characterBinding0 = new CharacterBinding();
      Object object0 = new Object();
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      // Undeclared exception!
      try { 
        characterBinding0.objectToEntry(object0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Character
         //
         assertThrownBy("com.sleepycat.bind.tuple.CharacterBinding", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      CharacterBinding characterBinding0 = new CharacterBinding();
      // Undeclared exception!
      try { 
        characterBinding0.entryToObject((TupleInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.CharacterBinding", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      CharacterBinding characterBinding0 = new CharacterBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      // Undeclared exception!
      try { 
        characterBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      CharacterBinding characterBinding0 = new CharacterBinding();
      byte[] byteArray0 = new byte[8];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte) (-21), (int) (byte) (-20));
      // Undeclared exception!
      try { 
        characterBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -21
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        CharacterBinding.entryToChar(databaseEntry0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      CharacterBinding.charToEntry('6', databaseEntry0);
      databaseEntry0.setOffset((-1));
      // Undeclared exception!
      try { 
        CharacterBinding.entryToChar(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharacterBinding.charToEntry('a', (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      CharacterBinding characterBinding0 = new CharacterBinding();
      byte[] byteArray0 = new byte[3];
      TupleOutput tupleOutput0 = TupleBase.newOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeLong((byte) (-80));
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      Character character0 = (Character)characterBinding0.entryToObject(tupleInput0);
      characterBinding0.objectToEntry((Object) character0, tupleOutput0);
      assertSame(tupleOutput0, tupleOutput1);
  }

  @Test
  public void test10()  throws Throwable  {
      CharacterBinding characterBinding0 = new CharacterBinding();
      TupleOutput tupleOutput0 = characterBinding0.getTupleOutput((Object) null);
      // Undeclared exception!
      try { 
        characterBinding0.objectToEntry((Object) null, tupleOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.CharacterBinding", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      CharacterBinding.charToEntry('#', databaseEntry0);
      char char0 = CharacterBinding.entryToChar(databaseEntry0);
      assertEquals('#', char0);
  }

  @Test
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharacterBinding.entryToChar((DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }
}
