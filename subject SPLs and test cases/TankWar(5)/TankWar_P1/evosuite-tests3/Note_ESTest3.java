/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 09:08:29 GMT 2016
 */


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Note_ESTest3   {
	@BeforeClass
	public static void initEvoSuiteFramework() { 
		
	}
	@AfterClass
	public static void exitEvoSuiteFramework() { 
		
	}
  //Test case number: 0
  /*
   * 27 covered goals:
   * Goal 1. Note.<init>(Ljava/lang/String;I)V: I9 Branch 1 IF_ICMPLT L11 - false
   * Goal 2. Branch Note.<init>(Ljava/lang/String;I)V: I9 Branch 1 IF_ICMPLT L11 - false in context: Note:<init>(Ljava/lang/String;I)V
   * Goal 3. Note.<init>(Ljava/lang/String;I)V: Line 11
   * Goal 4. Note.<init>(Ljava/lang/String;I)V: Line 12
   * Goal 5. Note.<init>(Ljava/lang/String;I)V: Line 13
   * Goal 6. Note.<init>(Ljava/lang/String;I)V: Line 20
   * Goal 7. Note.<init>(Ljava/lang/String;I)V: Line 21
   * Goal 8. [METHOD] Note.<init>(Ljava/lang/String;I)V
   * Goal 9. [METHODNOEX] Note.<init>(Ljava/lang/String;I)V
   * Goal 10. Weak Mutation 0: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceVariable name -> name
   * Goal 11. Weak Mutation 1: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceConstant - 7 -> 0
   * Goal 12. Weak Mutation 2: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceConstant - 7 -> 1
   * Goal 13. Weak Mutation 3: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceConstant - 7 -> -1
   * Goal 14. Weak Mutation 4: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceConstant - 7 -> 6
   * Goal 15. Weak Mutation 5: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceConstant - 7 -> 8
   * Goal 16. Weak Mutation 6: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceComparisonOperator < -> !=
   * Goal 17. Weak Mutation 9: Note.<init>(Ljava/lang/String;I)V:12 - ReplaceVariable name -> name
   * Goal 18. Weak Mutation 10: Note.<init>(Ljava/lang/String;I)V:12 - ReplaceConstant - 0 -> 1
   * Goal 19. Weak Mutation 11: Note.<init>(Ljava/lang/String;I)V:12 - ReplaceConstant - 6 -> 0
   * Goal 20. Weak Mutation 12: Note.<init>(Ljava/lang/String;I)V:12 - ReplaceConstant - 6 -> 1
   * Goal 21. Weak Mutation 13: Note.<init>(Ljava/lang/String;I)V:12 - ReplaceConstant - 6 -> -1
   * Goal 22. Weak Mutation 14: Note.<init>(Ljava/lang/String;I)V:12 - ReplaceConstant - 6 -> 5
   * Goal 23. Weak Mutation 15: Note.<init>(Ljava/lang/String;I)V:12 - ReplaceConstant - 6 -> 7
   * Goal 24. Weak Mutation 45: Note.<init>(Ljava/lang/String;I)V:20 - ReplaceVariable note -> note
   * Goal 25. Weak Mutation 46: Note.<init>(Ljava/lang/String;I)V:20 - InsertUnaryOp Negation of note
   * Goal 26. Weak Mutation 47: Note.<init>(Ljava/lang/String;I)V:20 - InsertUnaryOp IINC 1 note
   * Goal 27. Weak Mutation 48: Note.<init>(Ljava/lang/String;I)V:20 - InsertUnaryOp IINC -1 note
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Note note0 = new Note("|{@;6ZW`~:wmA3", 1766);
      assertEquals(1766, note0.note);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. <init>(Ljava/lang/String;I)V_java.lang.NullPointerException_IMPLICIT
   * Goal 2. Note.<init>(Ljava/lang/String;I)V: Line 11
   * Goal 3. [METHOD] Note.<init>(Ljava/lang/String;I)V
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Note note0 = null;
      try {
        note0 = new Note((String) null, (-920));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Note", e);
      }
  }

  //Test case number: 2
  /*
   * 27 covered goals:
   * Goal 1. Note.<init>(Ljava/lang/String;I)V: I9 Branch 1 IF_ICMPLT L11 - false
   * Goal 2. Branch Note.<init>(Ljava/lang/String;I)V: I9 Branch 1 IF_ICMPLT L11 - false in context: Note:<init>(Ljava/lang/String;I)V
   * Goal 3. Note.<init>(Ljava/lang/String;I)V: Line 11
   * Goal 4. Note.<init>(Ljava/lang/String;I)V: Line 12
   * Goal 5. Note.<init>(Ljava/lang/String;I)V: Line 13
   * Goal 6. Note.<init>(Ljava/lang/String;I)V: Line 20
   * Goal 7. Note.<init>(Ljava/lang/String;I)V: Line 21
   * Goal 8. [METHOD] Note.<init>(Ljava/lang/String;I)V
   * Goal 9. [METHODNOEX] Note.<init>(Ljava/lang/String;I)V
   * Goal 10. Weak Mutation 0: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceVariable name -> name
   * Goal 11. Weak Mutation 1: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceConstant - 7 -> 0
   * Goal 12. Weak Mutation 2: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceConstant - 7 -> 1
   * Goal 13. Weak Mutation 3: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceConstant - 7 -> -1
   * Goal 14. Weak Mutation 4: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceConstant - 7 -> 6
   * Goal 15. Weak Mutation 5: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceConstant - 7 -> 8
   * Goal 16. Weak Mutation 8: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceComparisonOperator < -> <=
   * Goal 17. Weak Mutation 9: Note.<init>(Ljava/lang/String;I)V:12 - ReplaceVariable name -> name
   * Goal 18. Weak Mutation 10: Note.<init>(Ljava/lang/String;I)V:12 - ReplaceConstant - 0 -> 1
   * Goal 19. Weak Mutation 11: Note.<init>(Ljava/lang/String;I)V:12 - ReplaceConstant - 6 -> 0
   * Goal 20. Weak Mutation 12: Note.<init>(Ljava/lang/String;I)V:12 - ReplaceConstant - 6 -> 1
   * Goal 21. Weak Mutation 13: Note.<init>(Ljava/lang/String;I)V:12 - ReplaceConstant - 6 -> -1
   * Goal 22. Weak Mutation 14: Note.<init>(Ljava/lang/String;I)V:12 - ReplaceConstant - 6 -> 5
   * Goal 23. Weak Mutation 15: Note.<init>(Ljava/lang/String;I)V:12 - ReplaceConstant - 6 -> 7
   * Goal 24. Weak Mutation 45: Note.<init>(Ljava/lang/String;I)V:20 - ReplaceVariable note -> note
   * Goal 25. Weak Mutation 46: Note.<init>(Ljava/lang/String;I)V:20 - InsertUnaryOp Negation of note
   * Goal 26. Weak Mutation 47: Note.<init>(Ljava/lang/String;I)V:20 - InsertUnaryOp IINC 1 note
   * Goal 27. Weak Mutation 48: Note.<init>(Ljava/lang/String;I)V:20 - InsertUnaryOp IINC -1 note
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Note note0 = new Note("YGVgy?;", 2817);
      assertEquals(2817, note0.note);
  }

  //Test case number: 3
  /*
   * 54 covered goals:
   * Goal 1. Note.<init>(Ljava/lang/String;I)V: I9 Branch 1 IF_ICMPLT L11 - true
   * Goal 2. Note.<init>(Ljava/lang/String;I)V: I51 Branch 2 IF_ICMPLT L15 - true
   * Goal 3. Note.<init>(Ljava/lang/String;I)V: I51 Branch 2 IF_ICMPLT L15 - false
   * Goal 4. Branch Note.<init>(Ljava/lang/String;I)V: I9 Branch 1 IF_ICMPLT L11 - true in context: Note:<init>(Ljava/lang/String;I)V
   * Goal 5. Branch Note.<init>(Ljava/lang/String;I)V: I51 Branch 2 IF_ICMPLT L15 - true in context: Note:<init>(Ljava/lang/String;I)V
   * Goal 6. Branch Note.<init>(Ljava/lang/String;I)V: I51 Branch 2 IF_ICMPLT L15 - false in context: Note:<init>(Ljava/lang/String;I)V
   * Goal 7. Note.<init>(Ljava/lang/String;I)V: Line 11
   * Goal 8. Note.<init>(Ljava/lang/String;I)V: Line 14
   * Goal 9. Note.<init>(Ljava/lang/String;I)V: Line 15
   * Goal 10. Note.<init>(Ljava/lang/String;I)V: Line 16
   * Goal 11. Note.<init>(Ljava/lang/String;I)V: Line 18
   * Goal 12. Note.<init>(Ljava/lang/String;I)V: Line 20
   * Goal 13. Note.<init>(Ljava/lang/String;I)V: Line 21
   * Goal 14. [METHOD] Note.<init>(Ljava/lang/String;I)V
   * Goal 15. [METHODNOEX] Note.<init>(Ljava/lang/String;I)V
   * Goal 16. Weak Mutation 0: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceVariable name -> name
   * Goal 17. Weak Mutation 1: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceConstant - 7 -> 0
   * Goal 18. Weak Mutation 2: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceConstant - 7 -> 1
   * Goal 19. Weak Mutation 3: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceConstant - 7 -> -1
   * Goal 20. Weak Mutation 4: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceConstant - 7 -> 6
   * Goal 21. Weak Mutation 5: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceConstant - 7 -> 8
   * Goal 22. Weak Mutation 7: Note.<init>(Ljava/lang/String;I)V:11 - ReplaceComparisonOperator < -> -2
   * Goal 23. Weak Mutation 16: Note.<init>(Ljava/lang/String;I)V:14 - ReplaceVariable name -> name
   * Goal 24. Weak Mutation 17: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceConstant - 0 -> 1
   * Goal 25. Weak Mutation 20: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceVariable i -> leng
   * Goal 26. Weak Mutation 21: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceVariable i -> note
   * Goal 27. Weak Mutation 22: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceVariable i -> leng
   * Goal 28. Weak Mutation 23: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceVariable i -> note
   * Goal 29. Weak Mutation 24: Note.<init>(Ljava/lang/String;I)V:15 - InsertUnaryOp Negation of i
   * Goal 30. Weak Mutation 25: Note.<init>(Ljava/lang/String;I)V:15 - InsertUnaryOp IINC 1 i
   * Goal 31. Weak Mutation 26: Note.<init>(Ljava/lang/String;I)V:15 - InsertUnaryOp IINC -1 i
   * Goal 32. Weak Mutation 27: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceConstant - 6 -> 0
   * Goal 33. Weak Mutation 28: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceConstant - 6 -> 1
   * Goal 34. Weak Mutation 29: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceConstant - 6 -> -1
   * Goal 35. Weak Mutation 30: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceConstant - 6 -> 5
   * Goal 36. Weak Mutation 31: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceConstant - 6 -> 7
   * Goal 37. Weak Mutation 32: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceVariable leng -> note
   * Goal 38. Weak Mutation 33: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceVariable leng -> i
   * Goal 39. Weak Mutation 34: Note.<init>(Ljava/lang/String;I)V:15 - InsertUnaryOp Negation of leng
   * Goal 40. Weak Mutation 35: Note.<init>(Ljava/lang/String;I)V:15 - InsertUnaryOp IINC 1 leng
   * Goal 41. Weak Mutation 36: Note.<init>(Ljava/lang/String;I)V:15 - InsertUnaryOp IINC -1 leng
   * Goal 42. Weak Mutation 37: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceArithmeticOperator - -> +
   * Goal 43. Weak Mutation 38: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceArithmeticOperator - -> %
   * Goal 44. Weak Mutation 39: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceArithmeticOperator - -> *
   * Goal 45. Weak Mutation 40: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceArithmeticOperator - -> /
   * Goal 46. Weak Mutation 42: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceComparisonOperator < -> -2
   * Goal 47. Weak Mutation 43: Note.<init>(Ljava/lang/String;I)V:15 - ReplaceComparisonOperator < -> <=
   * Goal 48. Weak Mutation 18: Note.<init>(Ljava/lang/String;I)V:16 - ReplaceVariable name -> name
   * Goal 49. Weak Mutation 19: Note.<init>(Ljava/lang/String;I)V:16 - ReplaceConstant -   -> 
   * Goal 50. Weak Mutation 44: Note.<init>(Ljava/lang/String;I)V:18 - ReplaceVariable name -> name
   * Goal 51. Weak Mutation 45: Note.<init>(Ljava/lang/String;I)V:20 - ReplaceVariable note -> note
   * Goal 52. Weak Mutation 46: Note.<init>(Ljava/lang/String;I)V:20 - InsertUnaryOp Negation of note
   * Goal 53. Weak Mutation 47: Note.<init>(Ljava/lang/String;I)V:20 - InsertUnaryOp IINC 1 note
   * Goal 54. Weak Mutation 48: Note.<init>(Ljava/lang/String;I)V:20 - InsertUnaryOp IINC -1 note
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Note note0 = new Note("`", 2817);
      assertEquals(2817, note0.note);
  }
}
