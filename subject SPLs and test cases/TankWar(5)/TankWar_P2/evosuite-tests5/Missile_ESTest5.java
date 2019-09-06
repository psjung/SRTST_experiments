/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 22:23:04 KST 2016
 */


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Missile_ESTest5   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  @Test
  public void test00()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, 0, (-525), 0, (-326), 0, (-326), false, (-525));
      missile0.currTime = (long) (-326);
      // Undeclared exception!
      try { 
        missile0.malen();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, (-1291), (-1291), (-1291), (-1291), (-1291), (-1291), false, (-1291));
      // Undeclared exception!
      try { 
        missile0.treffenErkennen();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, (-3001), (-3001), (-3001), (-3001), (-3001), (-3001), false, (-3001));
      missile0.y_Koordinate = (-3001);
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren((-3001));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, 300, 300, 300, 300, 5, 5, false, (-3));
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren((-3665L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, 4, 4, (-1079), (-1108), 4, 459, true, (-1108));
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren((-1079));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, 3, 3, 459, 3, 3, 459, true, 3);
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren(459);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, 600, 600, 10, 10, 10, 600, true, 10);
      missile0.missileRichtung = 1;
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren(10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, 0, 0, 0, 7, 7, 7, false, 7);
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, (-2894), (-2894), 200, 200, 6, 200, false, (-2894));
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, 300, 300, 0, 0, 5, 5, false, (-3));
      missile0.init((TankManager) null, 0, 5, (-318), (-318), 0, (-3), true, 976);
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren((-3665L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, 3, 3, (-1079), 459, 3, 459, true, 459);
      missile0.init((TankManager) null, (-31), 33, (-429), 33, (-31), 459, true, 33);
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren((-1079));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, 2, 2, 459, 2, 2, 459, true, 2);
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren(459);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, (-628), 0, (-628), 2292, 1, 2292, false, 33);
  }

  @Test
  public void test13()  throws Throwable  {
      Missile missile0 = null;
      try {
        missile0 = new Missile((TankManager) null, (-92), 70, (-2166), (-2166), 70, 70, false, (-2166));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, 300, 300, 0, 0, 0, 0, false, 0);
      // Undeclared exception!
      try { 
        missile0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }
}
