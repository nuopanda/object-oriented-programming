package edu.neu.ccs.cs5004.assignment5.problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConsTest {

  private Empty list1;
  private Cons list2;
  private String word1 = "ABC";

  @Before
  public void setUp() throws Exception {
    this.list1 = BagOfWordsList.emptyBagOfWords();
    this.list2 = new Cons(word1, null);
  }

  @Test
  public void testGetFirst() {
    assertEquals(word1, this.list2.getFirst());
    Cons list3 = new Cons("EFG", this.list2);
    assertEquals("EFG", list3.getFirst());
  }

  @Test
  public void testGetRestOfBag() {
    assertEquals(null, this.list2.getRestOfBag());
    Cons list3 = new Cons("EFG", this.list2);
    assertEquals(this.list2, list3.getRestOfBag());
  }

  @Test
  public void testIsEmpty() {
    assertFalse(this.list2.isEmpty());
  }

  @Test
  public void testSize() {
    assertEquals(new Integer(0), this.list1.size());
    assertEquals(new Integer(1), this.list2.size());
  }

  @Test
  public void testAdd() {
    assertFalse(this.list2.contains("EFG"));
    BagOfWordsList list3 = this.list2.add("EFG");
    assertTrue(((Cons) list3).contains("EFG"));
    assertEquals("EFG", list3.getFirst());
    BagOfWordsList list4 = ((Cons) list3).add("XYZ");
    assertTrue(((Cons) list4).contains("XYZ"));
    assertEquals("XYZ", ((Cons) list4).getFirst());

  }

  @Test
  public void testContains() {
    assertEquals(true, this.list2.contains("ABC"));
    Cons list3 = new Cons("EFG", this.list2);
    assertEquals(true, list3.contains("EFG"));
    assertEquals(true, list3.contains("ABC"));
  }

  @Test
  public void testToString() {
    assertEquals("Cons{first='ABC', restOfBag=null}", this.list2.toString());
  }

  @Test
  public void testEquals() {
    BagOfWordsList list3 = this.list2.add("EFG");
    list3 = ((Cons) list3).add("LMN");
    list3 = ((Cons) list3).add("LMN");
    BagOfWordsList list4 = this.list2.add("LMN");
    list4 = ((Cons) list4).add("EFG");
    list4 = ((Cons) list4).add("LMN");
    assertTrue(((Cons) list3).equals((Cons) list4));
    assertTrue(((Cons) list4).equals((Cons) list3));

  }

  @Test
  public void testHashCode() {
    BagOfWordsList list3 = this.list2.add("EFG");
    list3 = ((Cons) list3).add("LMN");
    list3 = ((Cons) list3).add("LMN");
    BagOfWordsList list4 = this.list2.add("LMN");
    list4 = ((Cons) list4).add("EFG");
    list4 = ((Cons) list4).add("LMN");
    assertFalse(list1.hashCode() == list2.hashCode());
    assertEquals(list2.hashCode(), list2.hashCode());
    assertEquals(((Cons) list3).hashCode(), ((Cons) list4).hashCode());
  }


}
