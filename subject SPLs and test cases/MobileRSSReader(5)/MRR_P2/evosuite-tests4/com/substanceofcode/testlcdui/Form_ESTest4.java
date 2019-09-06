/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:44:05 KST 2018
 */

package com.substanceofcode.testlcdui;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.DateField;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.ImageItem;
import javax.microedition.lcdui.Item;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Form_ESTest4 extends Form_ESTest_scaffolding4 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Form form0 = new Form("J", (Item[]) null);
      String string0 = form0.getTitle();
      assertEquals("J", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Form form0 = new Form("", (Item[]) null);
      String string0 = form0.getTitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Form form0 = new Form("");
      List list0 = new List("", 0);
      // Undeclared exception!
      try { 
        form0.outputCmdAct((Command) null, list0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.Form", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Form form0 = new Form("");
      // Undeclared exception!
      try { 
        form0.insert(0, (Item) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.Form", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Form form0 = new Form("");
      // Undeclared exception!
      try { 
        form0.append((Item) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.Form", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Form form0 = new Form("");
      String string0 = form0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Form form0 = new Form("");
      TextBox textBox0 = new TextBox((String) null, "", 0, 0);
      Command command0 = new Command("", (String) null, 0, 0);
      form0.outputCmdAct(command0, textBox0);
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Form form0 = new Form("");
      Command command0 = new Command((String) null, "", 0, 0);
      form0.outputCmdAct(command0, form0);
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Form form0 = new Form("", (Item[]) null);
      DateField dateField0 = new DateField("", 0);
      form0.set(0, dateField0);
      assertEquals("", form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      TextField textField0 = new TextField((String) null, (String) null, 0, 0);
      itemArray0[0] = (Item) textField0;
      Form form0 = new Form((String) null, itemArray0);
      form0.set(0, itemArray0[0]);
      assertEquals(1, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Form form0 = new Form("");
      StringItem stringItem0 = new StringItem("", "");
      form0.set(0, stringItem0);
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Form form0 = new Form("");
      ImageItem imageItem0 = new ImageItem("", (Image) null, 0, "", 0);
      form0.insert(0, imageItem0);
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Form form0 = new Form("");
      javax.microedition.lcdui.ChoiceGroup choiceGroup0 = new javax.microedition.lcdui.ChoiceGroup((String) null, 0);
      form0.insert(0, choiceGroup0);
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      TextField textField0 = new TextField((String) null, (String) null, 0, 0);
      Form form0 = new Form((String) null, itemArray0);
      form0.insert(0, textField0);
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Form form0 = new Form("");
      StringItem stringItem0 = new StringItem("", "");
      form0.insert(0, stringItem0);
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Form form0 = new Form("");
      ImageItem imageItem0 = new ImageItem("", (Image) null, 0, "", 0);
      int int0 = form0.append((Item) imageItem0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Form form0 = new Form("");
      javax.microedition.lcdui.ChoiceGroup choiceGroup0 = new javax.microedition.lcdui.ChoiceGroup((String) null, 0);
      int int0 = form0.append((Item) choiceGroup0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      TextField textField0 = new TextField((String) null, (String) null, 0, 0);
      itemArray0[0] = (Item) textField0;
      Form form0 = new Form((String) null, itemArray0);
      int int0 = form0.append(itemArray0[0]);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Form form0 = new Form("");
      StringItem stringItem0 = new StringItem("", "");
      int int0 = form0.append((Item) stringItem0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Form form0 = new Form("");
      form0.delete(0);
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Form form0 = new Form("");
      TextBox textBox0 = new TextBox((String) null, "", 0, 0);
      form0.setCommandListener(textBox0);
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Form form0 = new Form((String) null, itemArray0);
      form0.deleteAll();
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Form form0 = new Form("");
      int int0 = form0.append("");
      assertEquals(0, int0);
  }
}
