/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 16:12:27 KST 2018
 */


import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class VendingMachine_ESTest extends VendingMachine_ESTest_scaffolding {
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
      VendingMachine vendingMachine0 = new VendingMachine();
      // Undeclared exception!
      try { 
        vendingMachine0.pour_sugar((DrinkOrder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("VendingMachine", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VendingMachine vendingMachine0 = new VendingMachine();
      // Undeclared exception!
      try { 
        vendingMachine0.pour_milk((DrinkOrder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("VendingMachine", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VendingMachine vendingMachine0 = new VendingMachine();
      // Undeclared exception!
      try { 
        vendingMachine0.display_done((DrinkOrder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("VendingMachine", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VendingMachine vendingMachine0 = new VendingMachine();
      Cappuccino cappuccino0 = new Cappuccino();
      DrinkOrder drinkOrder0 = new DrinkOrder(cappuccino0, true, 0);
      vendingMachine0.display_done(drinkOrder0);
      assertTrue(drinkOrder0.isSugar());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VendingMachine vendingMachine0 = new VendingMachine();
      Coffee coffee0 = new Coffee();
      DrinkOrder drinkOrder0 = new DrinkOrder(coffee0, false, 0);
      vendingMachine0.display_done(drinkOrder0);
      assertFalse(drinkOrder0.isSugar());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VendingMachine vendingMachine0 = new VendingMachine();
      Cappuccino cappuccino0 = new Cappuccino();
      DrinkOrder drinkOrder0 = new DrinkOrder(cappuccino0, true, 0);
      vendingMachine0.pour_milk(drinkOrder0);
      assertTrue(drinkOrder0.getMilk());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VendingMachine vendingMachine0 = new VendingMachine();
      Cappuccino cappuccino0 = new Cappuccino();
      DrinkOrder drinkOrder0 = new DrinkOrder(cappuccino0, false, 0);
      vendingMachine0.display_done(drinkOrder0);
      assertFalse(drinkOrder0.isSugar());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VendingMachine vendingMachine0 = new VendingMachine();
      DrinkOrder drinkOrder0 = new DrinkOrder((Beverages) null, true, 0);
      vendingMachine0.display_done(drinkOrder0);
      assertFalse(drinkOrder0.getMilk());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VendingMachine vendingMachine0 = new VendingMachine();
      Coffee coffee0 = new Coffee();
      DrinkOrder drinkOrder0 = new DrinkOrder(coffee0, false, 0);
      vendingMachine0.pour_sugar(drinkOrder0);
      vendingMachine0.display_done(drinkOrder0);
      assertTrue(drinkOrder0.isSugar());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VendingMachine vendingMachine0 = new VendingMachine();
      vendingMachine0.cup_taken();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VendingMachine vendingMachine0 = new VendingMachine();
      Coffee coffee0 = new Coffee();
      DrinkOrder drinkOrder0 = new DrinkOrder(coffee0, true, 4);
      // Undeclared exception!
      try { 
        vendingMachine0.initialize(drinkOrder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("DrinkOrder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VendingMachine vendingMachine0 = new VendingMachine();
      Cappuccino cappuccino0 = new Cappuccino();
      DrinkOrder drinkOrder0 = new DrinkOrder(cappuccino0, true, 0);
      // Undeclared exception!
      try { 
        vendingMachine0.makeDrink(drinkOrder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("DrinkOrder", e);
      }
  }
}