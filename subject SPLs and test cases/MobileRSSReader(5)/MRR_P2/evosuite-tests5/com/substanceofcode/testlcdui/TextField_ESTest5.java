/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:33:08 KST 2018
 */

package com.substanceofcode.testlcdui;

import static org.junit.Assert.assertNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Command;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class TextField_ESTest5 extends TextField_ESTest_scaffolding5 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TextField textField0 = new TextField("", "", 0, 0);
      Command command0 = new Command("", "", 0, 0);
      textField0.setItemCommandListener(textField0);
      // Undeclared exception!
      textField0.commandAction(command0, textField0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TextField textField0 = new TextField("", "", 0, 0);
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      Command command0 = new Command("", 0, 0);
      // Undeclared exception!
      try { 
        textField0.commandAction(command0, choiceGroup0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TextField textField0 = new TextField("", "", 0, 0);
      String string0 = textField0.getString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TextField textField0 = new TextField("", "", 0, 0);
      textField0.setString("");
  }
}
