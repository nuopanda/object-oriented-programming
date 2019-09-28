package edu.neu.ccs.cs5004.assignment5.problem1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class EmptyTest {

  private PriorityQueue empty;
  private PriorityQueue oneElement;
  private PriorityQueue twoElement;
  private Node one;
  private Node two;

  @Before
  public void setUp() throws Exception {
    this.one = new ConsNode(1, "ABC");
    this.two = new ConsNode(2, "THC");
    this.empty = new Empty();
    this.oneElement = new Cons(one, empty);
    this.twoElement = new Cons(two, this.oneElement);
  }


  @Test
  public void testAdd() {
    PriorityQueue pppq = this.empty.add(0, "EGF");
    assertEquals(new Integer(0), ((Cons) pppq).getFirst().getPriority());
    assertEquals("EGF", ((Cons) pppq).getFirst().getValue());
  }

  @Test
  public void testPeek() throws Exception {
    try {
      (this.empty).peek();
      fail("An exception should have been thrown");
    } catch (InvalidPeekException e) {

    }
  }

  @Test
  public void testPop() throws Exception {
    try {
      this.empty.pop();
      fail("An exception should have been thrown");
    } catch (InvalidPopException e) {

    }
  }

  @Test
  public void testIsEmpty() {
    assertTrue(this.empty.isEmpty());

  }

  @Test
  public void testEquals() {
    assertFalse(this.empty.equals(null));
    assertTrue(this.empty.equals(this.empty));
    assertFalse(this.empty.equals(this.twoElement));
  }

  @Test
  public void testToString() {
    assertEquals("Empty{}", this.empty.toString());
  }

  @Test
  public void testHashCode() {
    assertFalse(this.oneElement.hashCode() == empty.hashCode());
    assertEquals(42, this.empty.hashCode());
  }
}

