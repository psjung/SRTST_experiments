/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 01 10:51:56 KST 2018
 */

package it.yup.screens;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.yup.xmpp.Contact;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ContactInfoScreen_ESTest2 extends ContactInfoScreen_ESTest_scaffolding2 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Contact contact0 = new Contact("", "7", "", (String[]) null);
      ContactInfoScreen contactInfoScreen0 = null;
      try {
        contactInfoScreen0 = new ContactInfoScreen(contact0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.screens.ContactInfoScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Contact contact0 = new Contact("", "", "", (String[]) null);
      ContactInfoScreen contactInfoScreen0 = null;
      try {
        contactInfoScreen0 = new ContactInfoScreen(contact0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.screens.ContactInfoScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Contact contact0 = new Contact("", "", "", (String[]) null);
      contact0.name = null;
      ContactInfoScreen contactInfoScreen0 = null;
      try {
        contactInfoScreen0 = new ContactInfoScreen(contact0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.yup.screens.ContactInfoScreen", e);
      }
  }
}
