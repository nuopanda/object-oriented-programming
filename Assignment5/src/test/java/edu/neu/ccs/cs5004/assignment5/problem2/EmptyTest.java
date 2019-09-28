package edu.neu.ccs.cs5004.assignment5.problem2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EmptyTest {

  private Empty list1;
  private Cons list2;
  private String word1 = "ABC";

  @Before
  public void setUp() throws Exception {
    this.list1 = BagOfWordsList.emptyBagOfWords();
    this.list2 = new Cons(word1, null);
  }

  @Test
  public void testEmptyBagOfWords() {
    assertTrue(this.list1.isEmpty());
  }

  @Test
  public void testGetFirst() {
    assertEquals(null, this.list1.getFirst());
  }

  @Test
  public void testGetRestOfBag() {
    assertEquals(null, this.list1.getRestOfBag());
  }

  @Test
  public void testIsEmpty() {
    assertTrue(this.list1.isEmpty());
  }

  @Test
  public void testSize() {
    assertEquals(new Integer(0), this.list1.size());
  }

  @Test
  public void testAdd() {
    assertFalse(this.list1.contains("ABC"));
    BagOfWordsList list5 = this.list1.add("ABC");
    assertTrue(list5.contains("ABC"));
    assertEquals("ABC", ((Cons) list5).getFirst());

  }

  @Test
  public void testContains() {
    assertEquals(false, this.list1.contains(word1));
  }

  @Test
  public void testToString() {
    assertEquals("Empty{}", this.list1.toString());
  }

  @Test
  public void testEquals() {
    assertFalse(this.list1.equals(list2));
    assertFalse(this.list2.equals(null));
    Empty list3 = BagOfWordsList.emptyBagOfWords();
    assertTrue(this.list1.equals(list3));
    assertTrue(this.list1.equals(this.list1));

  }

  @Test
  public void testHashCode() {
    assertFalse(list1.hashCode() == list2.hashCode());
    assertEquals(42, list1.hashCode());

  }
}
