/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 17 02:44:50 GMT 2025
 */

package maven;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import maven.Money;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Money_ESTest extends Money_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Money money0 = new Money(1232, "");
      Money money1 = money0.add(money0);
      boolean boolean0 = money1.equals(money0);
      assertFalse(boolean0);
      assertFalse(money0.equals((Object)money1));
      assertEquals(1232, money0.getAmount());
      assertEquals(2464, money1.getAmount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Money money0 = new Money(3471, (String) null);
      money0.getCurrency();
      assertEquals(3471, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Money money0 = new Money((-2587), " l:L){:N9<");
      money0.getCurrency();
      assertEquals((-2587), money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Money money0 = new Money(0, "*");
      int int0 = money0.getAmount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Money money0 = new Money((-1482), (String) null);
      int int0 = money0.getAmount();
      assertEquals((-1482), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Money money0 = new Money(0, "");
      Money money1 = money0.add(money0);
      assertEquals(0, money1.getAmount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Money money0 = new Money((-131), "maven.Money");
      Money money1 = money0.add(money0);
      assertEquals((-262), money1.getAmount());
      assertEquals((-131), money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Money money0 = new Money(1232, "");
      Money money1 = new Money(1232, (String) null);
      // Undeclared exception!
      try { 
        money0.equals(money1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Money money0 = new Money(1, "");
      // Undeclared exception!
      try { 
        money0.add((Money) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("maven.Money", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Money money0 = new Money(1232, "");
      money0.getCurrency();
      assertEquals(1232, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Money money0 = new Money(1232, "");
      int int0 = money0.getAmount();
      assertEquals(1232, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Money money0 = new Money(3649, "Yh");
      Money money1 = new Money(3649, "Xh");
      boolean boolean0 = money1.equals(money0);
      assertEquals(3649, money1.getAmount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Money money0 = new Money(1232, "");
      Object object0 = new Object();
      boolean boolean0 = money0.equals(object0);
      assertFalse(boolean0);
      assertEquals(1232, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Money money0 = new Money(1232, "");
      boolean boolean0 = money0.equals(money0);
      assertTrue(boolean0);
      assertEquals(1232, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Money money0 = new Money(1232, "");
      Money money1 = money0.add(money0);
      boolean boolean0 = money0.equals(money1);
      assertFalse(boolean0);
      assertEquals(2464, money1.getAmount());
      assertFalse(money1.equals((Object)money0));
      assertEquals(1232, money0.getAmount());
  }
}
