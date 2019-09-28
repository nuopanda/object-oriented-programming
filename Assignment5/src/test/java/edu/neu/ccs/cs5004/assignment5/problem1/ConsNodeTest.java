package edu.neu.ccs.cs5004.assignment5.problem1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ConsNodeTest {

  private Node one;
  private Node empty;

  @Before
  public void setUp() throws Exception {
    this.one = new ConsNode(1, "ABC");
    this.empty = new EmptyNode();
  }

  @Test
  public void testGetPriority() {
    assertEquals(new Integer(1), this.one.getPriority());
  }

  @Test
  public void testGetValue() {
    assertEquals("ABC", this.one.getValue());
  }

  @Test
  public void testEquals() {
    assertTrue(this.one.equals(this.one));
    assertFalse(this.one.equals(Node.createEmptyNode()));
    assertFalse(this.one.equals(null));
    ConsNode two = new ConsNode(1, "ABC");
    assertTrue(this.one.equals(two));
  }

  @Test
  public void testToString() {
    assertEquals("ConsNode{priority=1, value='ABC'}", this.one.toString());
  }

  @Test
  public void testHashCode() {
    ConsNode two = new ConsNode(1, "ABC");
    assertEquals(two.hashCode(), this.one.hashCode());
  }
}