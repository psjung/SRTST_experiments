/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 15:52:40 KST 2018
 */

package com.substanceofcode.testlcdui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ChoiceGroup_ESTest1 extends ChoiceGroup_ESTest_scaffolding1 {
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
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      choiceGroup0.setSelectedIndex((-1), true);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      boolean[] booleanArray0 = new boolean[3];
      choiceGroup0.setSelectedFlags(booleanArray0);
      assertEquals(3, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Image[] imageArray0 = new Image[0];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
      choiceGroup0.delete((-1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Image[] imageArray0 = new Image[0];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
      boolean boolean0 = choiceGroup0.isSelected((-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Image[] imageArray0 = new Image[0];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
      choiceGroup0.set((-1), "", (Image) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      choiceGroup0.insert(1, "", (Image) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      // Undeclared exception!
      try { 
        choiceGroup0.setSelectedFlags((boolean[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.ChoiceGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      // Undeclared exception!
      try { 
        choiceGroup0.getSelectedFlags((boolean[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.ChoiceGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      boolean[] booleanArray0 = new boolean[4];
      int int0 = choiceGroup0.getSelectedFlags(booleanArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, (Image[]) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      StringItem stringItem0 = new StringItem("", "");
      Command command0 = javax.microedition.lcdui.List.SELECT_COMMAND;
      // Undeclared exception!
      try { 
        choiceGroup0.commandAction(command0, stringItem0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.ChoiceGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Image[] imageArray0 = new Image[1];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, (String[]) null, imageArray0);
      choiceGroup0.setSelectedIndex(0, true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      StringItem stringItem0 = new StringItem("", "");
      choiceGroup0.setItemCommandListener(stringItem0);
      stringItem0.setItemCommandListener(choiceGroup0);
      Command command0 = new Command("", 0, 0);
      // Undeclared exception!
      choiceGroup0.commandAction(command0, stringItem0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Image[] imageArray0 = new Image[0];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
      choiceGroup0.deleteAll();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      int int0 = choiceGroup0.getSelectedIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      choiceGroup0.insert(0, "", (Image) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      int int0 = choiceGroup0.append("", (Image) null);
      assertEquals(0, int0);
  }
}
