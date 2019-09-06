/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:26:44 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class ChildReference_ESTest5 extends ChildReference_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      LN lN0 = new LN();
      byte[] byteArray0 = new byte[5];
      ChildReference childReference0 = new ChildReference((Node) lN0, byteArray0, (long) (byte)45, (byte)83);
      childReference0.getTarget();
      assertFalse(childReference0.getMigrate());
      assertEquals(45L, childReference0.getLsn());
      assertTrue(childReference0.isKnownDeleted());
  }

  @Test
  public void test01()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      byte byte0 = childReference0.getState();
      assertEquals((-1L), childReference0.getLsn());
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test02()  throws Throwable  {
      IN iN0 = new IN();
      byte[] byteArray0 = new byte[0];
      ChildReference childReference0 = new ChildReference((Node) iN0, byteArray0, 0L, (byte) (-70));
      byte byte0 = childReference0.getState();
      assertEquals((byte) (-70), byte0);
  }

  @Test
  public void test03()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      byte[] byteArray0 = new byte[5];
      ChildReference childReference0 = new ChildReference((Node) dupCountLN0, byteArray0, 0L, (byte)0);
      childReference0.getLsn();
      assertFalse(childReference0.getMigrate());
      assertFalse(childReference0.isKnownDeleted());
  }

  @Test
  public void test04()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      long long0 = childReference0.getLsn();
      assertFalse(childReference0.isKnownDeleted());
      assertEquals((-1L), long0);
  }

  @Test
  public void test05()  throws Throwable  {
      IN iN0 = new IN();
      byte[] byteArray0 = new byte[6];
      ChildReference childReference0 = new ChildReference((Node) iN0, byteArray0, (-582L), (byte) (-44));
      childReference0.getKey();
      assertEquals((-582L), childReference0.getLsn());
      assertFalse(childReference0.isKnownDeleted());
      assertTrue(childReference0.getMigrate());
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DBIN dBIN0 = new DBIN();
      ChildReference childReference0 = new ChildReference((Node) dBIN0, byteArray0, 0L, (byte)120);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      DBIN dBIN1 = (DBIN)childReference0.fetchTarget(databaseImpl0, dBIN0);
      //  // Unstable assertion: assertEquals(137L, dBIN1.getLastId());
  }

  @Test
  public void test07()  throws Throwable  {
      IN iN0 = new IN();
      byte[] byteArray0 = new byte[6];
      ChildReference childReference0 = new ChildReference((Node) iN0, byteArray0, (-582L), (byte) (-44));
      // Undeclared exception!
      try { 
        childReference0.dumpString(1000, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 1000
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      byte[] byteArray0 = new byte[8];
      childReference0.setKey(byteArray0);
      childReference0.setLsn((-1L));
      assertFalse(childReference0.isKnownDeleted());
      assertFalse(childReference0.getMigrate());
      assertEquals((-1L), childReference0.getLsn());
  }

  @Test
  public void test10()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      String string0 = childReference0.dumpString(10, false);
      assertEquals("          <lsn/>\n          <key v=\"\"/>\n          <target/>\n          <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      childReference0.setLsn(10L);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<5hdirty val=\"");
      childReference0.writeToLog(byteBuffer0);
      assertEquals(10L, childReference0.getLsn());
  }

  @Test
  public void test12()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      // Undeclared exception!
      try { 
        childReference0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<lsn/>\n<key v=\"8\u0000\uFFFD#,\uFFFDp\u0000\"/>\n<target/>\n<knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"true\"/>");
      // Undeclared exception!
      try { 
        childReference0.readFromLog(byteBuffer0, (byte)0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      byte[] byteArray0 = new byte[6];
      ChildReference childReference0 = new ChildReference((Node) mapLN0, byteArray0, (long) (byte)0, (byte)0);
      // Undeclared exception!
      try { 
        childReference0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.ChildReference", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      boolean boolean0 = childReference0.isKnownDeleted();
      assertFalse(boolean0);
      assertEquals((-1L), childReference0.getLsn());
  }

  @Test
  public void test16()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      childReference0.hook613((IN) null);
      assertEquals((-1L), childReference0.getLsn());
      assertFalse(childReference0.isKnownDeleted());
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, (long) (byte)0, (byte) (-22));
      assertFalse(childReference0.getMigrate());
      
      childReference0.setMigrate(true);
      childReference0.setMigrate(true);
      assertTrue(childReference0.getMigrate());
  }

  @Test
  public void test18()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      byte[] byteArray0 = new byte[6];
      ChildReference childReference0 = new ChildReference((Node) mapLN0, byteArray0, (long) (byte)0, (byte)0);
      childReference0.setMigrate(false);
      //  // Unstable assertion: assertEquals(96L, mapLN0.getLastId());
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      BIN bIN0 = new BIN();
      ChildReference childReference0 = new ChildReference((Node) bIN0, byteArray0, 2466L, (byte) (-1));
      boolean boolean0 = childReference0.getMigrate();
      assertEquals(2466L, childReference0.getLsn());
      assertTrue(boolean0);
      assertTrue(childReference0.isKnownDeleted());
  }

  @Test
  public void test20()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      boolean boolean0 = childReference0.getMigrate();
      assertFalse(boolean0);
      assertFalse(childReference0.isKnownDeleted());
      assertEquals((-1L), childReference0.getLsn());
  }

  @Test
  public void test21()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference((Node) nameLN0, byteArray0, (long) (byte) (-24), (byte)51);
      boolean boolean0 = childReference0.isKnownDeleted();
      //  // Unstable assertion: assertEquals(73L, nameLN0.getNodeId());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, (long) (byte)0, (byte) (-22));
      String string0 = childReference0.toString();
      assertEquals("<DbLsn val=\"0x0/0x0\"/>\n<key v=\"0 0 \"/>\n<target/>\n<knownDeleted val=\"false\"/><pendingDeleted val=\"true\"/><dirty val=\"true\"/>", string0);
  }

  @Test
  public void test23()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      try { 
        childReference0.fetchTarget((DatabaseImpl) null, (IN) null);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // fetchTarget of null lsn state=0 NULL_LSN without KnownDeleted
         //
         assertThrownBy("com.sleepycat.je.tree.ChildReference", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, (long) (byte)0, (byte) (-22));
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      IN iN0 = new IN();
      try { 
        childReference0.fetchTarget(databaseImpl0, iN0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // fetchTarget of 0x0/0x0 IN=0 state=-22 java.lang.NullPointerException
         //
         assertThrownBy("com.sleepycat.je.tree.ChildReference", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      IN iN0 = new IN();
      byte[] byteArray0 = new byte[6];
      ChildReference childReference0 = new ChildReference((Node) iN0, byteArray0, (-582L), (byte) (-44));
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      childReference0.fetchTarget(databaseImpl0, iN0);
      //  // Unstable assertion: assertEquals(33L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertEquals(33L, iN0.getLastId());
  }

  @Test
  public void test26()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      byte[] byteArray0 = new byte[5];
      ChildReference childReference0 = new ChildReference((Node) dupCountLN0, byteArray0, 0L, (byte)0);
      byte byte0 = childReference0.getState();
      assertEquals((byte)2, byte0);
  }

  @Test
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, (long) (byte)0, (byte) (-22));
      childReference0.clearTarget();
      assertFalse(childReference0.isKnownDeleted());
      assertFalse(childReference0.getMigrate());
  }

  @Test
  public void test28()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      int int0 = childReference0.getLogSize();
      assertFalse(childReference0.isKnownDeleted());
      assertEquals(13, int0);
      assertEquals((-1L), childReference0.getLsn());
  }

  @Test
  public void test29()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LN lN0 = new LN(databaseEntry0);
      byte[] byteArray0 = new byte[7];
      ChildReference childReference0 = new ChildReference((Node) lN0, byteArray0, 4L, (byte) (-2));
      long long0 = childReference0.getLsn();
      //  // Unstable assertion: assertEquals(17L, lN0.getLastId());
      //  // Unstable assertion: assertEquals(4L, long0);
  }

  @Test
  public void test30()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      DIN dIN0 = new DIN();
      childReference0.hook613(dIN0);
      assertFalse(childReference0.isKnownDeleted());
      assertEquals((-1L), childReference0.getLsn());
  }

  @Test
  public void test31()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      // Undeclared exception!
      try { 
        childReference0.readFromLog((ByteBuffer) null, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      childReference0.getTarget();
      assertEquals((-1L), childReference0.getLsn());
      assertFalse(childReference0.isKnownDeleted());
  }

  @Test
  public void test33()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      DIN dIN0 = new DIN();
      childReference0.setTarget(dIN0);
      childReference0.getTarget();
      assertEquals((-1L), childReference0.getLsn());
      assertFalse(childReference0.isKnownDeleted());
  }

  @Test
  public void test34()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      byte[] byteArray0 = new byte[6];
      ChildReference childReference0 = new ChildReference((Node) mapLN0, byteArray0, (long) (byte)0, (byte)0);
      boolean boolean0 = childReference0.logEntryIsTransactional();
      //  // Unstable assertion: assertEquals(1L, mapLN0.getLastId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test35()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      childReference0.setLsn((-3424L));
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("uAA91]7??jA");
      // Undeclared exception!
      try { 
        childReference0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test36()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      childReference0.getKey();
      assertEquals((-1L), childReference0.getLsn());
      assertFalse(childReference0.isKnownDeleted());
  }

  @Test
  public void test37()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      long long0 = childReference0.getTransactionId();
      assertFalse(childReference0.isKnownDeleted());
      assertEquals((-1L), childReference0.getLsn());
      assertEquals(0L, long0);
  }

  @Test
  public void test38()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      childReference0.dumpLog(stringBuffer0, false);
      assertEquals(102, stringBuffer0.length());
      assertFalse(childReference0.isKnownDeleted());
  }

  @Test
  public void test39()  throws Throwable  {
      LN lN0 = new LN();
      byte[] byteArray0 = new byte[9];
      ChildReference childReference0 = new ChildReference((Node) lN0, byteArray0, 4650L);
      String string0 = childReference0.toString();
      assertEquals("<DbLsn val=\"0x0/0x122a\"/>\n<key v=\"0 0 0 0 0 0 0 0 0 \"/>\n<ln>\n  <node>0</node>\n</ln>\n<knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"true\"/>", string0);
  }

  @Test
  public void test40()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      byte[] byteArray0 = new byte[0];
      childReference0.setKey(byteArray0);
      childReference0.setKey(byteArray0);
      assertFalse(childReference0.isKnownDeleted());
      assertFalse(childReference0.getMigrate());
      assertEquals((-1L), childReference0.getLsn());
  }
}
