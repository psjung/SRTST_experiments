/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:47:11 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.bind.tuple.TupleTupleMarshalledBinding;
import com.sleepycat.bind.tuple.TupleTupleMarshalledKeyCreator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class SecondaryConfig_ESTest5 extends SecondaryConfig_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      String string0 = secondaryConfig0.genSecondaryConfigMismatchMessage(secondaryConfig0, false, false, false, true, true, true, false);
      assertEquals("The following SecondaryConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n SecondaryKeyCreator\n SecondaryMultiKeyCreator\n ForeignKeyDelete\n ImmutableSecondaryKey\n", string0);
  }

  @Test
  public void test01()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      String string0 = secondaryConfig0.genSecondaryConfigMismatchMessage(secondaryConfig0, false, true, false, false, true, false, false);
      assertEquals("The following SecondaryConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n SecondaryKeyCreator\n ForeignKeyDelete\n ForeignKeyDeleteAction\n ImmutableSecondaryKey\n", string0);
  }

  @Test
  public void test02()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      String string0 = secondaryConfig0.genSecondaryConfigMismatchMessage(secondaryConfig0, false, true, true, false, false, false, false);
      assertEquals("The following SecondaryConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n SecondaryKeyCreator\n ForeignKeyDeleteAction\n ForeignKeyNullifier\n ForeignMultiKeyNullifier\n ImmutableSecondaryKey\n", string0);
  }

  @Test
  public void test03()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      // Undeclared exception!
      try { 
        secondaryConfig0.setForeignKeyDeleteAction((ForeignKeyDeleteAction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // foreignKeyDeleteAction cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      SecondaryKeyCreator secondaryKeyCreator0 = secondaryConfig0.getKeyCreator();
      assertNull(secondaryKeyCreator0);
  }

  @Test
  public void test05()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = (TupleTupleMarshalledKeyCreator)secondaryConfig0.getForeignKeyNullifier();
      assertNull(tupleTupleMarshalledKeyCreator0);
  }

  @Test
  public void test06()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      ForeignKeyDeleteAction foreignKeyDeleteAction0 = secondaryConfig0.getForeignKeyDeleteAction();
      assertNotNull(foreignKeyDeleteAction0);
  }

  @Test
  public void test07()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      SecondaryMultiKeyCreator secondaryMultiKeyCreator0 = secondaryConfig0.getMultiKeyCreator();
      assertNull(secondaryMultiKeyCreator0);
  }

  @Test
  public void test08()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      Database database0 = secondaryConfig0.getForeignKeyDatabase();
      assertNull(database0);
  }

  @Test
  public void test09()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      boolean boolean0 = secondaryConfig0.getImmutableSecondaryKey();
      assertTrue(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      ForeignMultiKeyNullifier foreignMultiKeyNullifier0 = secondaryConfig0.getForeignMultiKeyNullifier();
      assertNull(foreignMultiKeyNullifier0);
  }

  @Test
  public void test11()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      String string0 = secondaryConfig0.genSecondaryConfigMismatchMessage(secondaryConfig0, true, true, true, false, true, false, false);
      assertEquals("The following SecondaryConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n ForeignKeyDeleteAction\n ImmutableSecondaryKey\n", string0);
  }

  @Test
  public void test12()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      String string0 = secondaryConfig0.genSecondaryConfigMismatchMessage(secondaryConfig0, true, true, true, true, true, true, true);
      assertEquals("The following SecondaryConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      SecondaryConfig secondaryConfig1 = new SecondaryConfig();
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "The following SecondaryConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n SecondaryKeyCreator\n SecondaryMultiKeyCreator\n ForeignKeyDelete\n ForeignKeyDeleteAction\n ForeignKeyNullifier\n ForeignMultiKeyNullifier\n ImmutableSecondaryKey\n");
      secondaryConfig0.setForeignKeyNullifier(tupleTupleMarshalledKeyCreator0);
      try { 
        secondaryConfig0.validate(secondaryConfig1);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // The following SecondaryConfig parameters for the
         // cached Database do not match the parameters for the
         // requested Database:
         //  ForeignKeyNullifier
         //  ForeignMultiKeyNullifier
         //
         assertThrownBy("com.sleepycat.je.SecondaryConfig", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      SecondaryConfig secondaryConfig1 = new SecondaryConfig();
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "The following SecondaryConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n SecondaryKeyCreator\n SecondaryMultiKeyCreator\n ForeignKeyDelete\n ForeignKeyDeleteAction\n ForeignKeyNullifier\n ForeignMultiKeyNullifier\n");
      secondaryConfig0.setForeignKeyNullifier(tupleTupleMarshalledKeyCreator0);
      try { 
        secondaryConfig1.validate(secondaryConfig0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // The following SecondaryConfig parameters for the
         // cached Database do not match the parameters for the
         // requested Database:
         //  ForeignKeyNullifier
         //  ForeignMultiKeyNullifier
         //
         assertThrownBy("com.sleepycat.je.SecondaryConfig", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      try { 
        secondaryConfig0.validate(databaseConfig0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // The SecondaryConfig argument is null.
         //
         assertThrownBy("com.sleepycat.je.SecondaryConfig", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.setForeignKeyDatabase((Database) null);
      assertFalse(secondaryConfig0.getReadOnly());
  }

  @Test
  public void test19()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.DEFAULT.setAllowPopulate(false);
      assertFalse(secondaryConfig0.getAllowPopulate());
  }

  @Test
  public void test21()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.setImmutableSecondaryKey(true);
      assertTrue(secondaryConfig0.getImmutableSecondaryKey());
  }

  @Test
  public void test23()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      boolean boolean0 = secondaryConfig0.getAllowPopulate();
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      secondaryConfig0.genSecondaryConfigMismatchMessage(databaseConfig0, true, true, true, false, true, false, false);
      boolean boolean1 = secondaryConfig0.getAllowPopulate();
      assertTrue(boolean1 == boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.setKeyCreator((SecondaryKeyCreator) null);
      assertFalse(secondaryConfig0.getOverrideBtreeComparator());
  }

  @Test
  public void test25()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      ForeignKeyDeleteAction foreignKeyDeleteAction0 = ForeignKeyDeleteAction.NULLIFY;
      secondaryConfig0.setForeignKeyDeleteAction(foreignKeyDeleteAction0);
      //  // Unstable assertion: assertFalse(secondaryConfig0.getImmutableSecondaryKey());
  }
}
