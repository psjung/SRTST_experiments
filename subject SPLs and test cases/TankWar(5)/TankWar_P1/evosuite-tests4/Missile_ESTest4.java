/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 21:14:04 KST 2016
 */


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Missile_ESTest4   {
	@BeforeClass
	public static void initEvoSuiteFramework() { 
		
	}
	@AfterClass
	public static void exitEvoSuiteFramework() { 
		
	}
  @Test
  public void test00()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, 99, 99, 1315, 2, 2, 3, true, 1968);
      missile0.x_Koordinate = 850;
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren(5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, (-398), (-398), 374, 374, 4099, 4099, false, 147);
      missile0.objHeight = 2117;
      missile0.init((TankManager) null, 4099, (-875), 2, (-875), 1, (-2958), false, 3591);
  }

  @Test
  public void test02()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, (-398), (-398), 374, 374, 4099, 4099, false, 147);
      missile0.objWidth = (-2096);
      missile0.init((TankManager) null, 4099, (-875), 2, (-875), 1, (-2958), false, 3591);
  }

  @Test
  public void test03()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, 90, 90, 90, 2, 2, 90, true, 2);
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
  public void test04()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, 36, 36, 36, 36, 36, 1671, false, 36);
      // Undeclared exception!
      try { 
        missile0.init((TankManager) null, 2, (-473), 2, (-473), (-473), 70, false, 9);
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
      Missile missile0 = new Missile((TankManager) null, (-5743), (-5743), 13, 13, (-5743), 13, true, 13);
      missile0.y_Koordinate = (-5743);
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren((-5743));
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
      Missile missile0 = new Missile((TankManager) null, (-5743), (-5743), 13, 13, (-5743), 13, true, 13);
      missile0.x_Koordinate = (-1650);
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren((-5743));
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
      Missile missile0 = new Missile((TankManager) null, 99, 99, 1315, 6, 6, 6, false, 1315);
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren(1315);
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
      Missile missile0 = new Missile((TankManager) null, 5, 5, 5, 5, 5, 5, true, 5);
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren(5);
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
      Missile missile0 = new Missile((TankManager) null, (-398), (-398), 374, 374, 4099, 4099, false, 147);
      missile0.init((TankManager) null, 4099, (-2552), 2, (-2552), 1, 1, true, 1);
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren((-424L));
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
      Missile missile0 = new Missile((TankManager) null, (-398), (-398), 374, 374, 4099, 4099, false, 147);
      missile0.init((TankManager) null, 147, (-2958), (-2958), 2, 7, (-737), true, 374);
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren((-398));
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
      Missile missile0 = new Missile((TankManager) null, (-1795), (-1795), 1315, 4, 4, 4, true, 1315);
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren(4);
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
      Missile missile0 = new Missile((TankManager) null, 5, (-3495), 374, 5, 5, (-3495), true, 374);
      missile0.init((TankManager) null, (-3495), 5, 5, 1380, 3, (-5502), false, 3628);
      // Undeclared exception!
      try { 
        missile0.koordinateAktualisieren(1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Missile missile0 = null;
      try {
        missile0 = new Missile((TankManager) null, 70, (-1607), (-3075), 0, 100, 70, true, 70);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Missile$$TankWar", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Missile missile0 = new Missile((TankManager) null, (-1725), (-3071), (-3071), (-1725), (-1725), (-1725), true, (-1725));
      // Undeclared exception!
      try { 
        missile0.explodieren();
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
      Missile missile0 = new Missile((TankManager) null, 99, 99, 1315, 6, 6, 6, true, 1315);
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
