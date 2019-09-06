/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 10:31:03 GMT 2016
 */


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InfoPanel_ESTest4   {
	@BeforeClass
	public static void initEvoSuiteFramework() { 
		
	}
	@AfterClass
	public static void exitEvoSuiteFramework() { 
		
	}
  //Test case number: 0
  /*
   * 52 covered goals:
   * Goal 1. InfoPanel.<init>(LMaler;)V: root-Branch
   * Goal 2. InfoPanel.paint(Ljava/awt/Graphics;)V: I6 Branch 1 IF_ICMPEQ L26 - false
   * Goal 3. InfoPanel.paint(Ljava/awt/Graphics;)V: I11 Branch 2 IF_ICMPNE L26 - true
   * Goal 4. InfoPanel.paint(Ljava/awt/Graphics;)V: I146 Branch 4 IF_ICMPNE L49 - false
   * Goal 5. Branch InfoPanel.<init>(LMaler;)V: root-Branch in context: InfoPanel:<init>(LMaler;)V
   * Goal 6. Branch InfoPanel.paint(Ljava/awt/Graphics;)V: I11 Branch 2 IF_ICMPNE L26 - true in context: InfoPanel:paint(Ljava/awt/Graphics;)V
   * Goal 7. Branch InfoPanel.paint(Ljava/awt/Graphics;)V: I6 Branch 1 IF_ICMPEQ L26 - false in context: InfoPanel:paint(Ljava/awt/Graphics;)V
   * Goal 8. Branch InfoPanel.paint(Ljava/awt/Graphics;)V: I146 Branch 4 IF_ICMPNE L49 - false in context: InfoPanel:paint(Ljava/awt/Graphics;)V
   * Goal 9. InfoPanel.<init>(LMaler;)V: Line 18
   * Goal 10. InfoPanel.<init>(LMaler;)V: Line 19
   * Goal 11. InfoPanel.<init>(LMaler;)V: Line 20
   * Goal 12. InfoPanel.<init>(LMaler;)V: Line 21
   * Goal 13. InfoPanel.<init>(LMaler;)V: Line 22
   * Goal 14. InfoPanel.<init>(LMaler;)V: Line 23
   * Goal 15. InfoPanel.paint(Ljava/awt/Graphics;)V: Line 26
   * Goal 16. InfoPanel.paint(Ljava/awt/Graphics;)V: Line 49
   * Goal 17. InfoPanel.paint(Ljava/awt/Graphics;)V: Line 50
   * Goal 18. InfoPanel.paint(Ljava/awt/Graphics;)V: Line 53
   * Goal 19. [METHOD] InfoPanel.<init>(LMaler;)V
   * Goal 20. [METHOD] InfoPanel.paint(Ljava/awt/Graphics;)V
   * Goal 21. [METHODNOEX] InfoPanel.<init>(LMaler;)V
   * Goal 22. [METHODNOEX] InfoPanel.paint(Ljava/awt/Graphics;)V
   * Goal 23. Weak Mutation 0: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> ABORT
   * Goal 24. Weak Mutation 1: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> ALLBITS
   * Goal 25. Weak Mutation 2: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> PROPERTIES
   * Goal 26. Weak Mutation 3: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> SOMEBITS
   * Goal 27. Weak Mutation 4: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> ERROR
   * Goal 28. Weak Mutation 5: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> WIDTH
   * Goal 29. Weak Mutation 6: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> HEIGHT
   * Goal 30. Weak Mutation 7: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> FRAMEBITS
   * Goal 31. Weak Mutation 8: InfoPanel.<init>(LMaler;)V:19 - InsertUnaryOp Negation
   * Goal 32. Weak Mutation 9: InfoPanel.<init>(LMaler;)V:19 - InsertUnaryOp +1
   * Goal 33. Weak Mutation 10: InfoPanel.<init>(LMaler;)V:19 - InsertUnaryOp -1
   * Goal 34. Weak Mutation 11: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 0
   * Goal 35. Weak Mutation 12: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 1
   * Goal 36. Weak Mutation 13: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> -1
   * Goal 37. Weak Mutation 14: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 49
   * Goal 38. Weak Mutation 15: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 51
   * Goal 39. Weak Mutation 16: InfoPanel.<init>(LMaler;)V:22 - ReplaceConstant - North -> 
   * Goal 40. Weak Mutation 17: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp Negation
   * Goal 41. Weak Mutation 18: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp +1
   * Goal 42. Weak Mutation 19: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp -1
   * Goal 43. Weak Mutation 20: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 1 -> 0
   * Goal 44. Weak Mutation 21: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceComparisonOperator == -> !=
   * Goal 45. Weak Mutation 22: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp Negation
   * Goal 46. Weak Mutation 23: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp +1
   * Goal 47. Weak Mutation 24: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp -1
   * Goal 48. Weak Mutation 25: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 2 -> 0
   * Goal 49. Weak Mutation 26: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 2 -> 1
   * Goal 50. Weak Mutation 27: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 2 -> -1
   * Goal 51. Weak Mutation 28: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 2 -> 3
   * Goal 52. Weak Mutation 30: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceComparisonOperator != -> <
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      InfoPanel infoPanel0 = new InfoPanel(maler0);
      maler0.status = 3;
      infoPanel0.paint((Graphics) null);
      assertEquals(50, infoPanel0.getHeight());
      assertEquals(100, infoPanel0.getWidth());
  }

  //Test case number: 1
  /*
   * 49 covered goals:
   * Goal 1. InfoPanel.<init>(LMaler;)V: root-Branch
   * Goal 2. InfoPanel.paint(Ljava/awt/Graphics;)V: I6 Branch 1 IF_ICMPEQ L26 - false
   * Goal 3. InfoPanel.paint(Ljava/awt/Graphics;)V: I11 Branch 2 IF_ICMPNE L26 - false
   * Goal 4. Branch InfoPanel.<init>(LMaler;)V: root-Branch in context: InfoPanel:<init>(LMaler;)V
   * Goal 5. Branch InfoPanel.paint(Ljava/awt/Graphics;)V: I11 Branch 2 IF_ICMPNE L26 - false in context: InfoPanel:paint(Ljava/awt/Graphics;)V
   * Goal 6. Branch InfoPanel.paint(Ljava/awt/Graphics;)V: I6 Branch 1 IF_ICMPEQ L26 - false in context: InfoPanel:paint(Ljava/awt/Graphics;)V
   * Goal 7. paint(Ljava/awt/Graphics;)V_java.lang.NullPointerException_IMPLICIT
   * Goal 8. InfoPanel.<init>(LMaler;)V: Line 18
   * Goal 9. InfoPanel.<init>(LMaler;)V: Line 19
   * Goal 10. InfoPanel.<init>(LMaler;)V: Line 20
   * Goal 11. InfoPanel.<init>(LMaler;)V: Line 21
   * Goal 12. InfoPanel.<init>(LMaler;)V: Line 22
   * Goal 13. InfoPanel.<init>(LMaler;)V: Line 23
   * Goal 14. InfoPanel.paint(Ljava/awt/Graphics;)V: Line 26
   * Goal 15. InfoPanel.paint(Ljava/awt/Graphics;)V: Line 27
   * Goal 16. InfoPanel.paint(Ljava/awt/Graphics;)V: Line 28
   * Goal 17. [METHOD] InfoPanel.<init>(LMaler;)V
   * Goal 18. [METHOD] InfoPanel.paint(Ljava/awt/Graphics;)V
   * Goal 19. [METHODNOEX] InfoPanel.<init>(LMaler;)V
   * Goal 20. Weak Mutation 0: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> ABORT
   * Goal 21. Weak Mutation 1: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> ALLBITS
   * Goal 22. Weak Mutation 2: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> PROPERTIES
   * Goal 23. Weak Mutation 3: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> SOMEBITS
   * Goal 24. Weak Mutation 4: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> ERROR
   * Goal 25. Weak Mutation 5: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> WIDTH
   * Goal 26. Weak Mutation 6: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> HEIGHT
   * Goal 27. Weak Mutation 7: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> FRAMEBITS
   * Goal 28. Weak Mutation 8: InfoPanel.<init>(LMaler;)V:19 - InsertUnaryOp Negation
   * Goal 29. Weak Mutation 9: InfoPanel.<init>(LMaler;)V:19 - InsertUnaryOp +1
   * Goal 30. Weak Mutation 10: InfoPanel.<init>(LMaler;)V:19 - InsertUnaryOp -1
   * Goal 31. Weak Mutation 11: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 0
   * Goal 32. Weak Mutation 12: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 1
   * Goal 33. Weak Mutation 13: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> -1
   * Goal 34. Weak Mutation 14: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 49
   * Goal 35. Weak Mutation 15: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 51
   * Goal 36. Weak Mutation 16: InfoPanel.<init>(LMaler;)V:22 - ReplaceConstant - North -> 
   * Goal 37. Weak Mutation 17: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp Negation
   * Goal 38. Weak Mutation 18: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp +1
   * Goal 39. Weak Mutation 19: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp -1
   * Goal 40. Weak Mutation 20: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 1 -> 0
   * Goal 41. Weak Mutation 21: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceComparisonOperator == -> !=
   * Goal 42. Weak Mutation 22: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp Negation
   * Goal 43. Weak Mutation 23: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp +1
   * Goal 44. Weak Mutation 24: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp -1
   * Goal 45. Weak Mutation 25: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 2 -> 0
   * Goal 46. Weak Mutation 26: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 2 -> 1
   * Goal 47. Weak Mutation 27: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 2 -> -1
   * Goal 48. Weak Mutation 28: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 2 -> 3
   * Goal 49. Weak Mutation 29: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceComparisonOperator != -> -1
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      InfoPanel infoPanel0 = new InfoPanel(maler0);
      maler0.status = 2;
      // Undeclared exception!
      try { 
        infoPanel0.paint((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("InfoPanel", e);
      }
  }

  //Test case number: 2
  /*
   * 51 covered goals:
   * Goal 1. InfoPanel.<init>(LMaler;)V: root-Branch
   * Goal 2. InfoPanel.paint(Ljava/awt/Graphics;)V: I6 Branch 1 IF_ICMPEQ L26 - false
   * Goal 3. InfoPanel.paint(Ljava/awt/Graphics;)V: I11 Branch 2 IF_ICMPNE L26 - true
   * Goal 4. InfoPanel.paint(Ljava/awt/Graphics;)V: I146 Branch 4 IF_ICMPNE L49 - true
   * Goal 5. Branch InfoPanel.<init>(LMaler;)V: root-Branch in context: InfoPanel:<init>(LMaler;)V
   * Goal 6. Branch InfoPanel.paint(Ljava/awt/Graphics;)V: I11 Branch 2 IF_ICMPNE L26 - true in context: InfoPanel:paint(Ljava/awt/Graphics;)V
   * Goal 7. Branch InfoPanel.paint(Ljava/awt/Graphics;)V: I6 Branch 1 IF_ICMPEQ L26 - false in context: InfoPanel:paint(Ljava/awt/Graphics;)V
   * Goal 8. Branch InfoPanel.paint(Ljava/awt/Graphics;)V: I146 Branch 4 IF_ICMPNE L49 - true in context: InfoPanel:paint(Ljava/awt/Graphics;)V
   * Goal 9. InfoPanel.<init>(LMaler;)V: Line 18
   * Goal 10. InfoPanel.<init>(LMaler;)V: Line 19
   * Goal 11. InfoPanel.<init>(LMaler;)V: Line 20
   * Goal 12. InfoPanel.<init>(LMaler;)V: Line 21
   * Goal 13. InfoPanel.<init>(LMaler;)V: Line 22
   * Goal 14. InfoPanel.<init>(LMaler;)V: Line 23
   * Goal 15. InfoPanel.paint(Ljava/awt/Graphics;)V: Line 26
   * Goal 16. InfoPanel.paint(Ljava/awt/Graphics;)V: Line 49
   * Goal 17. InfoPanel.paint(Ljava/awt/Graphics;)V: Line 53
   * Goal 18. [METHOD] InfoPanel.<init>(LMaler;)V
   * Goal 19. [METHOD] InfoPanel.paint(Ljava/awt/Graphics;)V
   * Goal 20. [METHODNOEX] InfoPanel.<init>(LMaler;)V
   * Goal 21. [METHODNOEX] InfoPanel.paint(Ljava/awt/Graphics;)V
   * Goal 22. Weak Mutation 0: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> ABORT
   * Goal 23. Weak Mutation 1: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> ALLBITS
   * Goal 24. Weak Mutation 2: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> PROPERTIES
   * Goal 25. Weak Mutation 3: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> SOMEBITS
   * Goal 26. Weak Mutation 4: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> ERROR
   * Goal 27. Weak Mutation 5: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> WIDTH
   * Goal 28. Weak Mutation 6: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> HEIGHT
   * Goal 29. Weak Mutation 7: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> FRAMEBITS
   * Goal 30. Weak Mutation 8: InfoPanel.<init>(LMaler;)V:19 - InsertUnaryOp Negation
   * Goal 31. Weak Mutation 9: InfoPanel.<init>(LMaler;)V:19 - InsertUnaryOp +1
   * Goal 32. Weak Mutation 10: InfoPanel.<init>(LMaler;)V:19 - InsertUnaryOp -1
   * Goal 33. Weak Mutation 11: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 0
   * Goal 34. Weak Mutation 12: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 1
   * Goal 35. Weak Mutation 13: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> -1
   * Goal 36. Weak Mutation 14: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 49
   * Goal 37. Weak Mutation 15: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 51
   * Goal 38. Weak Mutation 16: InfoPanel.<init>(LMaler;)V:22 - ReplaceConstant - North -> 
   * Goal 39. Weak Mutation 17: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp Negation
   * Goal 40. Weak Mutation 18: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp +1
   * Goal 41. Weak Mutation 19: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp -1
   * Goal 42. Weak Mutation 20: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 1 -> 0
   * Goal 43. Weak Mutation 21: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceComparisonOperator == -> !=
   * Goal 44. Weak Mutation 22: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp Negation
   * Goal 45. Weak Mutation 23: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp +1
   * Goal 46. Weak Mutation 24: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp -1
   * Goal 47. Weak Mutation 25: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 2 -> 0
   * Goal 48. Weak Mutation 26: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 2 -> 1
   * Goal 49. Weak Mutation 27: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 2 -> -1
   * Goal 50. Weak Mutation 28: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 2 -> 3
   * Goal 51. Weak Mutation 31: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceComparisonOperator != -> >
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      InfoPanel infoPanel0 = new InfoPanel(maler0);
      infoPanel0.paint((Graphics) null);
      assertEquals(50, infoPanel0.getHeight());
      assertEquals(100, infoPanel0.getWidth());
  }

  //Test case number: 3
  /*
   * 39 covered goals:
   * Goal 1. InfoPanel.<init>(LMaler;)V: root-Branch
   * Goal 2. InfoPanel.paint(Ljava/awt/Graphics;)V: I6 Branch 1 IF_ICMPEQ L26 - true
   * Goal 3. Branch InfoPanel.<init>(LMaler;)V: root-Branch in context: InfoPanel:<init>(LMaler;)V
   * Goal 4. Branch InfoPanel.paint(Ljava/awt/Graphics;)V: I6 Branch 1 IF_ICMPEQ L26 - true in context: InfoPanel:paint(Ljava/awt/Graphics;)V
   * Goal 5. paint(Ljava/awt/Graphics;)V_java.lang.NullPointerException_IMPLICIT
   * Goal 6. InfoPanel.<init>(LMaler;)V: Line 18
   * Goal 7. InfoPanel.<init>(LMaler;)V: Line 19
   * Goal 8. InfoPanel.<init>(LMaler;)V: Line 20
   * Goal 9. InfoPanel.<init>(LMaler;)V: Line 21
   * Goal 10. InfoPanel.<init>(LMaler;)V: Line 22
   * Goal 11. InfoPanel.<init>(LMaler;)V: Line 23
   * Goal 12. InfoPanel.paint(Ljava/awt/Graphics;)V: Line 26
   * Goal 13. InfoPanel.paint(Ljava/awt/Graphics;)V: Line 27
   * Goal 14. InfoPanel.paint(Ljava/awt/Graphics;)V: Line 28
   * Goal 15. [METHOD] InfoPanel.<init>(LMaler;)V
   * Goal 16. [METHOD] InfoPanel.paint(Ljava/awt/Graphics;)V
   * Goal 17. [METHODNOEX] InfoPanel.<init>(LMaler;)V
   * Goal 18. Weak Mutation 0: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> ABORT
   * Goal 19. Weak Mutation 1: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> ALLBITS
   * Goal 20. Weak Mutation 2: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> PROPERTIES
   * Goal 21. Weak Mutation 3: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> SOMEBITS
   * Goal 22. Weak Mutation 4: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> ERROR
   * Goal 23. Weak Mutation 5: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> WIDTH
   * Goal 24. Weak Mutation 6: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> HEIGHT
   * Goal 25. Weak Mutation 7: InfoPanel.<init>(LMaler;)V:19 - ReplaceVariable INFO_WIDTH -> FRAMEBITS
   * Goal 26. Weak Mutation 8: InfoPanel.<init>(LMaler;)V:19 - InsertUnaryOp Negation
   * Goal 27. Weak Mutation 9: InfoPanel.<init>(LMaler;)V:19 - InsertUnaryOp +1
   * Goal 28. Weak Mutation 10: InfoPanel.<init>(LMaler;)V:19 - InsertUnaryOp -1
   * Goal 29. Weak Mutation 11: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 0
   * Goal 30. Weak Mutation 12: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 1
   * Goal 31. Weak Mutation 13: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> -1
   * Goal 32. Weak Mutation 14: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 49
   * Goal 33. Weak Mutation 15: InfoPanel.<init>(LMaler;)V:19 - ReplaceConstant - 50 -> 51
   * Goal 34. Weak Mutation 16: InfoPanel.<init>(LMaler;)V:22 - ReplaceConstant - North -> 
   * Goal 35. Weak Mutation 17: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp Negation
   * Goal 36. Weak Mutation 18: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp +1
   * Goal 37. Weak Mutation 19: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - InsertUnaryOp -1
   * Goal 38. Weak Mutation 20: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceConstant - 1 -> 0
   * Goal 39. Weak Mutation 21: InfoPanel.paint(Ljava/awt/Graphics;)V:26 - ReplaceComparisonOperator == -> !=
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      InfoPanel infoPanel0 = new InfoPanel(maler0);
      maler0.status = 1;
      // Undeclared exception!
      try { 
        infoPanel0.paint((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("InfoPanel", e);
      }
  }
}
