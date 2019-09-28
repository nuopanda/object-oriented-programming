package edu.neu.ccs.cs5004.assignment5.problem1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class ConsTest {

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
    PriorityQueue pq = this.twoElement.add(5, "EFG");
    assertEquals(new Integer(5), ((Cons) pq).getFirst().getPriority());
    assertEquals("EFG", ((Cons) pq).getFirst().getValue());
    PriorityQueue ppq = this.twoElement.add(0, "EFG");
    assertEquals(new Integer(2), ((Cons) ppq).getFirst().getPriority());
    assertEquals("THC", ((Cons) ppq).getFirst().getValue());
    PriorityQueue pppq = this.empty.add(0, "EGF");
    assertEquals(new Integer(0), ((Cons) pppq).getFirst().getPriority());
    assertEquals("EGF", ((Cons) pppq).getFirst().getValue());
  }

  @Test
  public void testPeek() throws Exception {
    assertEquals("THC", this.twoElement.peek());
    PriorityQueue pq = this.twoElement.add(3, "EFG");
    assertEquals("EFG", ((Cons) pq).peek());
  }

  @Test
  public void testPop() throws Exception {
    assertTrue(this.oneElement.equals(this.twoElement.pop()));
  }

  @Test
  public void testIsEmpty() {
    assertFalse(this.twoElement.isEmpty());

  }

  @Test
  public void testEquals() {
    assertTrue(this.oneElement.equals(this.oneElement));
    assertFalse(this.oneElement.equals(PriorityQueue.createEmpty()));
    assertFalse(this.oneElement.equals(null));

  }

  @Test
  public void testToString() {
    assertEquals("Cons{first=ConsNode{priority=1, value='ABC'}, rest=Empty{}}",
        this.oneElement.toString());
  }

  @Test
  public void testHashCode() {
    assertTrue(this.oneElement.hashCode() == this.oneElement.hashCode());
    assertFalse(this.oneElement.hashCode() == empty.hashCode());
  }
}
