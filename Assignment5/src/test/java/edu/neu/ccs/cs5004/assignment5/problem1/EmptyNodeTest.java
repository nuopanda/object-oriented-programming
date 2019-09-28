package edu.neu.ccs.cs5004.assignment5.problem1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EmptyNodeTest {

  private Node empty;

  @Before
  public void setUp() throws Exception {
    this.empty = Node.createEmptyNode();
  }

  @Test
  public void testGetPriority() {
    assertEquals(null, this.empty.getPriority());
  }

  @Test
  public void testGetValue() {
    assertEquals(null, this.empty.getValue());
  }

  @Test
  public void testEquals() {
    Node testEmpty = Node.createEmptyNode();
    assertFalse(this.empty.equals(null));
    assertTrue(this.empty.equals(this.empty));
    assertTrue(this.empty.equals(testEmpty));
  }

  @Test
  public void testToString() {
    assertEquals("EmptyNode{}", this.empty.toString());
  }

  @Test
  public void testHashCode() {
    assertEquals(42, this.empty.hashCode());
  }
}

