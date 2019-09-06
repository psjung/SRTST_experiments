/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 21:01:47 KST 2016
 */


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class MapInfo_ESTest3   {
	@BeforeClass
	public static void initEvoSuiteFramework() { 
		
	}
	@AfterClass
	public static void exitEvoSuiteFramework() { 
		
	}
  @Test
  public void test0()  throws Throwable  {
      MapInfo mapInfo0 = null;
      try {
        mapInfo0 = new MapInfo((TankManager) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Wall$$TankWar", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MapInfo mapInfo0 = null;
      try {
        mapInfo0 = new MapInfo((TankManager) null, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Wall$$TankWar", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MapInfo mapInfo0 = null;
      try {
        mapInfo0 = new MapInfo((TankManager) null, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Wall$$TankWar", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      MapInfo mapInfo0 = new MapInfo((TankManager) null, 165);
      assertFalse(mapInfo0.read);
  }
}
