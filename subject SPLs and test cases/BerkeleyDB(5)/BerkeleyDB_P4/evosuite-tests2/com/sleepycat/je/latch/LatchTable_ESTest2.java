/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:41:29 KST 2017
 */

package com.sleepycat.je.latch;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.latch.LatchTable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LatchTable_ESTest2 extends LatchTable_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      LatchTable latchTable0 = new LatchTable("BEr^b6NE'IfSm-zY\"u");
      boolean boolean0 = latchTable0.noteLatch("BEr^b6NE'IfSm-zY\"u");
      assertTrue(boolean0);
      
      boolean boolean1 = latchTable0.unNoteLatch("BEr^b6NE'IfSm-zY\"u", "BEr^b6NE'IfSm-zY\"u");
      assertTrue(boolean1 == boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      LatchTable latchTable0 = new LatchTable("");
      Integer integer0 = new Integer(0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedList0.add((Object) linkedHashSet0);
      linkedList0.add((Object) "");
      String string0 = latchTable0.toString("", (Object) integer0, (List) linkedList0, 0);
      assertEquals("<LATCH [name: ] [owner: 0] [waiters: []  ]>", string0);
  }

  @Test
  public void test02()  throws Throwable  {
      LatchTable latchTable0 = new LatchTable("'Fmq]6En?$7WvG,E9?");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      String string0 = latchTable0.toString("'Fmq]6En?$7WvG,E9?", (Object) "'Fmq]6En?$7WvG,E9?", (List) linkedList0, 359);
      assertEquals("<LATCH [name: 'Fmq]6En?$7WvG,E9?] [owner: 'Fmq]6En?$7WvG,E9?]>", string0);
  }

  @Test
  public void test05()  throws Throwable  {
      LatchTable latchTable0 = new LatchTable("");
      String string0 = latchTable0.toString("", (Object) latchTable0, (List) null, (-2412));
      assertNotNull(string0);
  }

  @Test
  public void test06()  throws Throwable  {
      LatchTable latchTable0 = new LatchTable("Wgt4oUk-");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      String string0 = latchTable0.toString("Wgt4oUk-", (Object) latchTable0, (List) linkedList0, 0);
      assertNotNull(string0);
  }

  @Test
  public void test07()  throws Throwable  {
      LatchTable latchTable0 = new LatchTable("Wgt4oUk-");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        latchTable0.toString((String) null, (Object) integer0, (List) linkedList0, (-464));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -464, Size: 0
         //
         assertThrownBy("java.util.LinkedList", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      LatchTable latchTable0 = new LatchTable("BEr^b6NE'IfSm-zY\"u");
      String string0 = latchTable0.getNameString("1{'-5v:/QEjgCaj0m]");
      assertEquals("BEr^b6NE'IfSm-zY\"u(1{'-5v:/QEjgCaj0m])", string0);
  }

  @Test
  public void test09()  throws Throwable  {
      LatchTable latchTable0 = new LatchTable("BEr^b6NE'IfSm-zY\"u");
      String string0 = latchTable0.getNameString((String) null);
      assertEquals("BEr^b6NE'IfSm-zY\"u", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      LatchTable latchTable0 = new LatchTable("BEr^b6NE'IfSm-zY\"u");
      latchTable0.noteLatch(latchTable0);
      String string0 = latchTable0.latchesHeldToString();
      assertNotNull(string0);
  }

  @Test
  public void test11()  throws Throwable  {
      LatchTable latchTable0 = new LatchTable((String) null);
      String string0 = latchTable0.latchesHeldToString();
      assertEquals("", string0);
  }

  @Test
  public void test12()  throws Throwable  {
      LatchTable latchTable0 = new LatchTable("BEr^b6NE'IfSm-zY\"u");
      latchTable0.noteLatch(latchTable0);
      int int0 = latchTable0.countLatchesHeld();
      assertEquals(1, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      LatchTable latchTable0 = new LatchTable("Wgt4oUk-");
      int int0 = latchTable0.countLatchesHeld();
      assertEquals(0, int0);
  }

  @Test
  public void test14()  throws Throwable  {
      LatchTable latchTable0 = new LatchTable("BEr^b6NE'IfSm-zY\"u");
      boolean boolean0 = latchTable0.unNoteLatch(latchTable0, "BEr^b6NE'IfSm-zY\"u");
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      LatchTable latchTable0 = new LatchTable("BEr^b6NE'IfSm-zY\"u");
      latchTable0.noteLatch(latchTable0);
      boolean boolean0 = latchTable0.noteLatch("BEr^b6NE'IfSm-zY\"u");
      assertTrue(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      LatchTable latchTable0 = new LatchTable("");
      latchTable0.clearNotes();
  }
}
