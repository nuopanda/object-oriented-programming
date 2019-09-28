package edu.neu.ccs.cs5004.assignment5.problem2;

import java.util.Objects;

/**
 * Represents a Cons.
 */
public class Cons extends AbstractBagOfWordList {

  private String first;
  private BagOfWordsList restOfBag;

  /**
   * Construct a linked list of strings in the Cons, based on the provided inputs.
   *
   * @param first - a string as the first
   * @param restOfBag - a linked list containing information about the rest of the Cons
   */
  public Cons(String first, BagOfWordsList restOfBag) {
    this.first = first;
    this.restOfBag = restOfBag;
  }

  @Override
  public String getFirst() {
    return this.first;
  }

  @Override
  public BagOfWordsList getRestOfBag() {
    return this.restOfBag;
  }

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public Integer size() {
    if (this.isEmpty()) {
      return 0;
    } else {
      return 1 + ((this.getRestOfBag() == null) ? 0 : this.getRestOfBag().size());
    }
  }


  @Override
  public Boolean contains(String word) {
    if (this.isEmpty() || (!this.getFirst().equals(word) && this.getRestOfBag() == null)) {
      return false;
    } else if (this.getFirst().equals(word)) {
      return true;
    } else {
      return this.getRestOfBag().contains(word);
    }
  }

  @Override
  public String toString() {
    return "Cons{"
        + "first='" + first + '\''
        + ", restOfBag=" + restOfBag
        + '}';
  }

  @Override
  public boolean equals(Object object) {
    // The BagOfWordsList is sorted in ascending order when new String is added into it.
    // No need to override the equals() and hashcode()
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Cons cons = (Cons) object;
    return Objects.equals(first, cons.first)
        && Objects.equals(restOfBag, cons.restOfBag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, restOfBag);
  }
}
