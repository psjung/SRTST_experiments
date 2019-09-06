/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 09:58:14 GMT 2016
 */


import java.awt.Image;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Option_ESTest1   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  //Test case number: 0
  /*
   * 18 covered goals:
   * Goal 1. Option.<init>(ZLjava/lang/String;I)V: root-Branch
   * Goal 2. Branch Option.<init>(ZLjava/lang/String;I)V: root-Branch in context: Option:<init>(ZLjava/lang/String;I)V
   * Goal 3. Option.<init>(ZLjava/lang/String;I)V: Line 31
   * Goal 4. Option.<init>(ZLjava/lang/String;I)V: Line 32
   * Goal 5. Option.<init>(ZLjava/lang/String;I)V: Line 33
   * Goal 6. Option.<init>(ZLjava/lang/String;I)V: Line 34
   * Goal 7. Option.<init>(ZLjava/lang/String;I)V: Line 35
   * Goal 8. Option.<init>(ZLjava/lang/String;I)V: Line 36
   * Goal 9. [METHOD] Option.<init>(ZLjava/lang/String;I)V
   * Goal 10. [METHODNOEX] Option.<init>(ZLjava/lang/String;I)V
   * Goal 11. Weak Mutation 24: Option.<init>(ZLjava/lang/String;I)V:31 - ReplaceVariable status -> status
   * Goal 12. Weak Mutation 25: Option.<init>(ZLjava/lang/String;I)V:31 - InsertUnaryOp Negation of status
   * Goal 13. Weak Mutation 26: Option.<init>(ZLjava/lang/String;I)V:31 - InsertUnaryOp IINC 1 status
   * Goal 14. Weak Mutation 27: Option.<init>(ZLjava/lang/String;I)V:31 - InsertUnaryOp IINC -1 status
   * Goal 15. Weak Mutation 28: Option.<init>(ZLjava/lang/String;I)V:32 - ReplaceVariable str -> str
   * Goal 16. Weak Mutation 30: Option.<init>(ZLjava/lang/String;I)V:35 - InsertUnaryOp Negation of prioritaet
   * Goal 17. Weak Mutation 31: Option.<init>(ZLjava/lang/String;I)V:35 - InsertUnaryOp IINC 1 prioritaet
   * Goal 18. Weak Mutation 32: Option.<init>(ZLjava/lang/String;I)V:35 - InsertUnaryOp IINC -1 prioritaet
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Option option0 = new Option(true, "", 0);
  }

  //Test case number: 1
  /*
   * 18 covered goals:
   * Goal 1. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: root-Branch
   * Goal 2. Branch Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: root-Branch in context: Option:<init>(ZLjava/lang/String;Ljava/awt/Image;I)V
   * Goal 3. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: Line 14
   * Goal 4. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: Line 15
   * Goal 5. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: Line 16
   * Goal 6. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: Line 17
   * Goal 7. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: Line 18
   * Goal 8. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: Line 19
   * Goal 9. [METHOD] Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V
   * Goal 10. [METHODNOEX] Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V
   * Goal 11. Weak Mutation 0: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:14 - ReplaceVariable status -> status
   * Goal 12. Weak Mutation 1: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:14 - InsertUnaryOp Negation of status
   * Goal 13. Weak Mutation 2: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:14 - InsertUnaryOp IINC 1 status
   * Goal 14. Weak Mutation 3: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:14 - InsertUnaryOp IINC -1 status
   * Goal 15. Weak Mutation 4: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:15 - ReplaceVariable str -> str
   * Goal 16. Weak Mutation 8: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:18 - InsertUnaryOp Negation of prioritaet
   * Goal 17. Weak Mutation 9: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:18 - InsertUnaryOp IINC 1 prioritaet
   * Goal 18. Weak Mutation 10: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:18 - InsertUnaryOp IINC -1 prioritaet
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Option option0 = new Option(true, "-+---You Lose!---+-", (Image) null, 0);
  }

  //Test case number: 2
  /*
   * 18 covered goals:
   * Goal 1. Option.<init>(ZLjava/lang/String;I)V: root-Branch
   * Goal 2. Branch Option.<init>(ZLjava/lang/String;I)V: root-Branch in context: Option:<init>(ZLjava/lang/String;I)V
   * Goal 3. Option.<init>(ZLjava/lang/String;I)V: Line 31
   * Goal 4. Option.<init>(ZLjava/lang/String;I)V: Line 32
   * Goal 5. Option.<init>(ZLjava/lang/String;I)V: Line 33
   * Goal 6. Option.<init>(ZLjava/lang/String;I)V: Line 34
   * Goal 7. Option.<init>(ZLjava/lang/String;I)V: Line 35
   * Goal 8. Option.<init>(ZLjava/lang/String;I)V: Line 36
   * Goal 9. [METHOD] Option.<init>(ZLjava/lang/String;I)V
   * Goal 10. [METHODNOEX] Option.<init>(ZLjava/lang/String;I)V
   * Goal 11. Weak Mutation 25: Option.<init>(ZLjava/lang/String;I)V:31 - InsertUnaryOp Negation of status
   * Goal 12. Weak Mutation 26: Option.<init>(ZLjava/lang/String;I)V:31 - InsertUnaryOp IINC 1 status
   * Goal 13. Weak Mutation 27: Option.<init>(ZLjava/lang/String;I)V:31 - InsertUnaryOp IINC -1 status
   * Goal 14. Weak Mutation 28: Option.<init>(ZLjava/lang/String;I)V:32 - ReplaceVariable str -> str
   * Goal 15. Weak Mutation 29: Option.<init>(ZLjava/lang/String;I)V:35 - ReplaceVariable prioritaet -> prioritaet
   * Goal 16. Weak Mutation 30: Option.<init>(ZLjava/lang/String;I)V:35 - InsertUnaryOp Negation of prioritaet
   * Goal 17. Weak Mutation 31: Option.<init>(ZLjava/lang/String;I)V:35 - InsertUnaryOp IINC 1 prioritaet
   * Goal 18. Weak Mutation 32: Option.<init>(ZLjava/lang/String;I)V:35 - InsertUnaryOp IINC -1 prioritaet
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Option option0 = new Option(false, "", (-30));
  }

  //Test case number: 3
  /*
   * 19 covered goals:
   * Goal 1. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V: root-Branch
   * Goal 2. Branch Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V: root-Branch in context: Option:<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V
   * Goal 3. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V: Line 23
   * Goal 4. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V: Line 24
   * Goal 5. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V: Line 25
   * Goal 6. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V: Line 26
   * Goal 7. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V: Line 27
   * Goal 8. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V: Line 28
   * Goal 9. [METHOD] Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V
   * Goal 10. [METHODNOEX] Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V
   * Goal 11. Weak Mutation 11: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V:23 - ReplaceVariable status -> status
   * Goal 12. Weak Mutation 12: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V:23 - InsertUnaryOp Negation of status
   * Goal 13. Weak Mutation 13: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V:23 - InsertUnaryOp IINC 1 status
   * Goal 14. Weak Mutation 14: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V:23 - InsertUnaryOp IINC -1 status
   * Goal 15. Weak Mutation 15: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V:24 - ReplaceVariable str -> str
   * Goal 16. Weak Mutation 20: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V:27 - ReplaceVariable prioritaet -> prioritaet
   * Goal 17. Weak Mutation 21: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V:27 - InsertUnaryOp Negation of prioritaet
   * Goal 18. Weak Mutation 22: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V:27 - InsertUnaryOp IINC 1 prioritaet
   * Goal 19. Weak Mutation 23: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;Ljava/awt/Image;I)V:27 - InsertUnaryOp IINC -1 prioritaet
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Option option0 = new Option(true, "I6'7ag@1v9O0}&IHhC|", (Image) null, (Image) null, (-1));
  }

  //Test case number: 4
  /*
   * 18 covered goals:
   * Goal 1. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: root-Branch
   * Goal 2. Branch Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: root-Branch in context: Option:<init>(ZLjava/lang/String;Ljava/awt/Image;I)V
   * Goal 3. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: Line 14
   * Goal 4. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: Line 15
   * Goal 5. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: Line 16
   * Goal 6. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: Line 17
   * Goal 7. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: Line 18
   * Goal 8. Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V: Line 19
   * Goal 9. [METHOD] Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V
   * Goal 10. [METHODNOEX] Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V
   * Goal 11. Weak Mutation 1: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:14 - InsertUnaryOp Negation of status
   * Goal 12. Weak Mutation 2: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:14 - InsertUnaryOp IINC 1 status
   * Goal 13. Weak Mutation 3: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:14 - InsertUnaryOp IINC -1 status
   * Goal 14. Weak Mutation 4: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:15 - ReplaceVariable str -> str
   * Goal 15. Weak Mutation 7: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:18 - ReplaceVariable prioritaet -> prioritaet
   * Goal 16. Weak Mutation 8: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:18 - InsertUnaryOp Negation of prioritaet
   * Goal 17. Weak Mutation 9: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:18 - InsertUnaryOp IINC 1 prioritaet
   * Goal 18. Weak Mutation 10: Option.<init>(ZLjava/lang/String;Ljava/awt/Image;I)V:18 - InsertUnaryOp IINC -1 prioritaet
   */

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Option option0 = new Option(false, "", (Image) null, (-30));
  }
}
