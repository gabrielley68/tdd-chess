package com.tactfactory.monprojet.test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.junit.Test;

public class EntryPointTest {

  @Test
  public void test() {
    fail("Not yet implemented");
  }

  @Test
  public void test1() {
    Object a = new Object();
    Object b = a;
    assertEquals(a, b);
  }

  @Test
  public void test1b() {
    Object a = new Object();
    Object b = a;
    assertSame(a, b);
  }

  @Test
  public void test2() {
    Boolean a = true;
    Boolean b = false;
    assertEquals(a, b);
  }

  @Test
  public void test3() {
    Integer a = 10;
    Integer b = 10;
    assertEquals(a, b);
  }

  @Test(expected = Exception.class)
  public void test4() throws Exception {
    throw new Exception();
  }

  @Test(expected = MalformedURLException.class)
  public void test5() throws Exception {
    throw new Exception();
  }

  @Test(timeout = 1)
  public void test6() {
    Integer a = 10;
    Integer b = 10;

    for (int i = 0; i < 10000; i++) {
      a = a + i;
      b = b + i;
    }

    assertEquals(a, b);
  }
}
