/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 11:08:52 GMT 2016
 */


import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SoundPlayer_ESTest2   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  //Test case number: 0
  /*
   * 14 covered goals:
   * Goal 1. SoundPlayer.<init>()V: root-Branch
   * Goal 2. SoundPlayer.getInstance()LSoundPlayer;: I3 Branch 1 IFNONNULL L12 - true
   * Goal 3. SoundPlayer.getInstance()LSoundPlayer;: I3 Branch 1 IFNONNULL L12 - false
   * Goal 4. Branch SoundPlayer.getInstance()LSoundPlayer;: I3 Branch 1 IFNONNULL L12 - true in context: 
   * Goal 5. Branch SoundPlayer.getInstance()LSoundPlayer;: I3 Branch 1 IFNONNULL L12 - false in context: 
   * Goal 6. [Output]: SoundPlayer.getInstance()LSoundPlayer;:NonNull
   * Goal 7. SoundPlayer.<init>()V: Line 7
   * Goal 8. SoundPlayer.<init>()V: Line 9
   * Goal 9. SoundPlayer.getInstance()LSoundPlayer;: Line 12
   * Goal 10. SoundPlayer.getInstance()LSoundPlayer;: Line 13
   * Goal 11. SoundPlayer.getInstance()LSoundPlayer;: Line 15
   * Goal 12. [METHOD] SoundPlayer.getInstance()LSoundPlayer;
   * Goal 13. [METHODNOEX] SoundPlayer.getInstance()LSoundPlayer;
   * Goal 14. Weak Mutation 0: SoundPlayer.getInstance()LSoundPlayer;:12 - ReplaceComparisonOperator != null -> = null
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SoundPlayer soundPlayer0 = SoundPlayer.getInstance();
      SoundPlayer soundPlayer1 = SoundPlayer.getInstance();
      assertSame(soundPlayer1, soundPlayer0);
  }

  //Test case number: 1
  /*
   * 11 covered goals:
   * Goal 1. SoundPlayer.<init>()V: root-Branch
   * Goal 2. SoundPlayer.playRogerSound()V: root-Branch
   * Goal 3. Branch SoundPlayer.<init>()V: root-Branch in context: SoundPlayer:<init>()V
   * Goal 4. Branch SoundPlayer.playRogerSound()V: root-Branch in context: SoundPlayer:playRogerSound()V
   * Goal 5. playRogerSound()V_java.lang.NoClassDefFoundError_IMPLICIT
   * Goal 6. SoundPlayer.<init>()V: Line 7
   * Goal 7. SoundPlayer.<init>()V: Line 9
   * Goal 8. SoundPlayer.playRogerSound()V: Line 42
   * Goal 9. [METHOD] SoundPlayer.<init>()V
   * Goal 10. [METHOD] SoundPlayer.playRogerSound()V
   * Goal 11. [METHODNOEX] SoundPlayer.<init>()V
   */

  

  //Test case number: 2
  /*
   * 18 covered goals:
   * Goal 1. SoundPlayer.<init>()V: root-Branch
   * Goal 2. SoundPlayer.stopSound()V: root-Branch
   * Goal 3. SoundPlayer.getInstance()LSoundPlayer;: I3 Branch 1 IFNONNULL L12 - false
   * Goal 4. Branch SoundPlayer.stopSound()V: root-Branch in context: SoundPlayer:stopSound()V
   * Goal 5. Branch SoundPlayer.getInstance()LSoundPlayer;: I3 Branch 1 IFNONNULL L12 - false in context: 
   * Goal 6. [Output]: SoundPlayer.getInstance()LSoundPlayer;:NonNull
   * Goal 7. SoundPlayer.<init>()V: Line 7
   * Goal 8. SoundPlayer.<init>()V: Line 9
   * Goal 9. SoundPlayer.getInstance()LSoundPlayer;: Line 12
   * Goal 10. SoundPlayer.getInstance()LSoundPlayer;: Line 13
   * Goal 11. SoundPlayer.getInstance()LSoundPlayer;: Line 15
   * Goal 12. SoundPlayer.stopSound()V: Line 66
   * Goal 13. SoundPlayer.stopSound()V: Line 67
   * Goal 14. [METHOD] SoundPlayer.getInstance()LSoundPlayer;
   * Goal 15. [METHOD] SoundPlayer.stopSound()V
   * Goal 16. [METHODNOEX] SoundPlayer.getInstance()LSoundPlayer;
   * Goal 17. [METHODNOEX] SoundPlayer.stopSound()V
   * Goal 18. Weak Mutation 0: SoundPlayer.getInstance()LSoundPlayer;:12 - ReplaceComparisonOperator != null -> = null
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SoundPlayer soundPlayer0 = SoundPlayer.getInstance();
      soundPlayer0.stopSound();
  }

  //Test case number: 3
  /*
   * 11 covered goals:
   * Goal 1. SoundPlayer.playMoveSound()V: root-Branch
   * Goal 2. SoundPlayer.<init>()V: root-Branch
   * Goal 3. Branch SoundPlayer.playMoveSound()V: root-Branch in context: SoundPlayer:playMoveSound()V
   * Goal 4. Branch SoundPlayer.<init>()V: root-Branch in context: SoundPlayer:<init>()V
   * Goal 5. playMoveSound()V_java.lang.NoClassDefFoundError_IMPLICIT
   * Goal 6. SoundPlayer.<init>()V: Line 7
   * Goal 7. SoundPlayer.<init>()V: Line 9
   * Goal 8. SoundPlayer.playMoveSound()V: Line 36
   * Goal 9. [METHOD] SoundPlayer.<init>()V
   * Goal 10. [METHOD] SoundPlayer.playMoveSound()V
   * Goal 11. [METHODNOEX] SoundPlayer.<init>()V
   */

  //Test case number: 4
  /*
   * 17 covered goals:
   * Goal 1. SoundPlayer.playFireSound()V: root-Branch
   * Goal 2. SoundPlayer.<init>()V: root-Branch
   * Goal 3. SoundPlayer.getInstance()LSoundPlayer;: I3 Branch 1 IFNONNULL L12 - false
   * Goal 4. Branch SoundPlayer.playFireSound()V: root-Branch in context: SoundPlayer:playFireSound()V
   * Goal 5. Branch SoundPlayer.getInstance()LSoundPlayer;: I3 Branch 1 IFNONNULL L12 - false in context: 
   * Goal 6. playFireSound()V_java.lang.NoClassDefFoundError_IMPLICIT
   * Goal 7. [Output]: SoundPlayer.getInstance()LSoundPlayer;:NonNull
   * Goal 8. SoundPlayer.<init>()V: Line 7
   * Goal 9. SoundPlayer.<init>()V: Line 9
   * Goal 10. SoundPlayer.getInstance()LSoundPlayer;: Line 12
   * Goal 11. SoundPlayer.getInstance()LSoundPlayer;: Line 13
   * Goal 12. SoundPlayer.getInstance()LSoundPlayer;: Line 15
   * Goal 13. SoundPlayer.playFireSound()V: Line 24
   * Goal 14. [METHOD] SoundPlayer.getInstance()LSoundPlayer;
   * Goal 15. [METHOD] SoundPlayer.playFireSound()V
   * Goal 16. [METHODNOEX] SoundPlayer.getInstance()LSoundPlayer;
   * Goal 17. Weak Mutation 0: SoundPlayer.getInstance()LSoundPlayer;:12 - ReplaceComparisonOperator != null -> = null
   */

  //Test case number: 5
  /*
   * 17 covered goals:
   * Goal 1. SoundPlayer.playEatSound()V: root-Branch
   * Goal 2. SoundPlayer.<init>()V: root-Branch
   * Goal 3. SoundPlayer.getInstance()LSoundPlayer;: I3 Branch 1 IFNONNULL L12 - false
   * Goal 4. Branch SoundPlayer.playEatSound()V: root-Branch in context: SoundPlayer:playEatSound()V
   * Goal 5. Branch SoundPlayer.getInstance()LSoundPlayer;: I3 Branch 1 IFNONNULL L12 - false in context: 
   * Goal 6. playEatSound()V_java.lang.NoClassDefFoundError_IMPLICIT
   * Goal 7. [Output]: SoundPlayer.getInstance()LSoundPlayer;:NonNull
   * Goal 8. SoundPlayer.<init>()V: Line 7
   * Goal 9. SoundPlayer.<init>()V: Line 9
   * Goal 10. SoundPlayer.getInstance()LSoundPlayer;: Line 12
   * Goal 11. SoundPlayer.getInstance()LSoundPlayer;: Line 13
   * Goal 12. SoundPlayer.getInstance()LSoundPlayer;: Line 15
   * Goal 13. SoundPlayer.playEatSound()V: Line 60
   * Goal 14. [METHOD] SoundPlayer.getInstance()LSoundPlayer;
   * Goal 15. [METHOD] SoundPlayer.playEatSound()V
   * Goal 16. [METHODNOEX] SoundPlayer.getInstance()LSoundPlayer;
   * Goal 17. Weak Mutation 0: SoundPlayer.getInstance()LSoundPlayer;:12 - ReplaceComparisonOperator != null -> = null
   */

  //Test case number: 6
  /*
   * 17 covered goals:
   * Goal 1. SoundPlayer.playExplodeSound()V: root-Branch
   * Goal 2. SoundPlayer.<init>()V: root-Branch
   * Goal 3. SoundPlayer.getInstance()LSoundPlayer;: I3 Branch 1 IFNONNULL L12 - false
   * Goal 4. Branch SoundPlayer.playExplodeSound()V: root-Branch in context: SoundPlayer:playExplodeSound()V
   * Goal 5. Branch SoundPlayer.getInstance()LSoundPlayer;: I3 Branch 1 IFNONNULL L12 - false in context: 
   * Goal 6. playExplodeSound()V_java.lang.NoClassDefFoundError_IMPLICIT
   * Goal 7. [Output]: SoundPlayer.getInstance()LSoundPlayer;:NonNull
   * Goal 8. SoundPlayer.<init>()V: Line 7
   * Goal 9. SoundPlayer.<init>()V: Line 9
   * Goal 10. SoundPlayer.getInstance()LSoundPlayer;: Line 12
   * Goal 11. SoundPlayer.getInstance()LSoundPlayer;: Line 13
   * Goal 12. SoundPlayer.getInstance()LSoundPlayer;: Line 15
   * Goal 13. SoundPlayer.playExplodeSound()V: Line 30
   * Goal 14. [METHOD] SoundPlayer.getInstance()LSoundPlayer;
   * Goal 15. [METHOD] SoundPlayer.playExplodeSound()V
   * Goal 16. [METHODNOEX] SoundPlayer.getInstance()LSoundPlayer;
   * Goal 17. Weak Mutation 0: SoundPlayer.getInstance()LSoundPlayer;:12 - ReplaceComparisonOperator != null -> = null
   */

  //Test case number: 7
  /*
   * 11 covered goals:
   * Goal 1. SoundPlayer.playYeahSound()V: root-Branch
   * Goal 2. SoundPlayer.<init>()V: root-Branch
   * Goal 3. Branch SoundPlayer.<init>()V: root-Branch in context: SoundPlayer:<init>()V
   * Goal 4. Branch SoundPlayer.playYeahSound()V: root-Branch in context: SoundPlayer:playYeahSound()V
   * Goal 5. playYeahSound()V_java.lang.NoClassDefFoundError_IMPLICIT
   * Goal 6. SoundPlayer.<init>()V: Line 7
   * Goal 7. SoundPlayer.<init>()V: Line 9
   * Goal 8. SoundPlayer.playYeahSound()V: Line 54
   * Goal 9. [METHOD] SoundPlayer.<init>()V
   * Goal 10. [METHOD] SoundPlayer.playYeahSound()V
   * Goal 11. [METHODNOEX] SoundPlayer.<init>()V
   */

  //Test case number: 8
  /*
   * 11 covered goals:
   * Goal 1. SoundPlayer.playYessirSound()V: root-Branch
   * Goal 2. SoundPlayer.<init>()V: root-Branch
   * Goal 3. Branch SoundPlayer.playYessirSound()V: root-Branch in context: SoundPlayer:playYessirSound()V
   * Goal 4. Branch SoundPlayer.<init>()V: root-Branch in context: SoundPlayer:<init>()V
   * Goal 5. playYessirSound()V_java.lang.NoClassDefFoundError_IMPLICIT
   * Goal 6. SoundPlayer.<init>()V: Line 7
   * Goal 7. SoundPlayer.<init>()V: Line 9
   * Goal 8. SoundPlayer.playYessirSound()V: Line 48
   * Goal 9. [METHOD] SoundPlayer.<init>()V
   * Goal 10. [METHOD] SoundPlayer.playYessirSound()V
   * Goal 11. [METHODNOEX] SoundPlayer.<init>()V
   */

  //Test case number: 9
  /*
   * 11 covered goals:
   * Goal 1. SoundPlayer.playBgSound()V: root-Branch
   * Goal 2. SoundPlayer.<init>()V: root-Branch
   * Goal 3. Branch SoundPlayer.<init>()V: root-Branch in context: SoundPlayer:<init>()V
   * Goal 4. Branch SoundPlayer.playBgSound()V: root-Branch in context: SoundPlayer:playBgSound()V
   * Goal 5. playBgSound()V_java.lang.NoClassDefFoundError_IMPLICIT
   * Goal 6. SoundPlayer.<init>()V: Line 7
   * Goal 7. SoundPlayer.<init>()V: Line 9
   * Goal 8. SoundPlayer.playBgSound()V: Line 19
   * Goal 9. [METHOD] SoundPlayer.<init>()V
   * Goal 10. [METHOD] SoundPlayer.playBgSound()V
   * Goal 11. [METHODNOEX] SoundPlayer.<init>()V
   */
}
