package edu.neu.ccs.cs5004.lab5.problem3;

public class Set implements List {

  /**
   * Represents a set of integers with List interface
   */
  private Integer first;
  private List rest;

  /**
   * Given an integer and an ArrayList create a set.
   */
  public Set(Integer first, List rest) {
    this.first = first;
    this.rest = rest;
  }


  public Set emptySet() {
    return new Set(null, null);
  }

  /**
   * Getter for property 'first'.
   *
   * @return Value for property 'first'.
   */
  public Integer getFirst() {
    return this.first;
  }

  /**
   * Getter for property 'rest'.
   *
   * @return Value for property 'rest'.
   */
  public List getRest() {
    return this.rest;
  }

  /**
   * Returns the total number of elements in the set.
   *
   * @return number of elements in this set
   */
  @Override
  public Integer size() {
    return 1 + this.getRest().size();
  }

  /**
   * Returns true if empty and false otherwise.
   */
  public Boolean isEmpty() {
    if (this.size() == 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Given a new element prepend it to this set.
   *
   * @param n new element to add to the set
   * @return updated set
   */
  public Set add(Integer n) {
    if (this.isEmpty()) {
      this.add(n);
    } else if (!this.contains(n)) {
      this.add(n);
    }
    return this;
  }

  /**
   * Return true if element is in the set and false otherwise.
   *
   * @param n element to be checked if in the set
   * @return whether the element is in the set
   */
  public Boolean contains(Integer n) {
    Set currSet = this;
    while (!currSet.isEmpty()) {
      Integer curr = currSet.getFirst();
      if (curr == n) {
        return true;
      }
      currSet = (Set) currSet.getRest();
    }
    return false;
  }

  /**
   * Return set with element n deleted.
   *
   * @param n element to be deleted if in the set
   * @return set with element n deleted.
   */
  public Set remove(Integer n) {
    Set result = new Set(null, null);
    if (!this.contains(n)) {
      return this;
    }
    Set currSet = this;
    while (!currSet.isEmpty()) {
      Integer curr = currSet.getFirst();
      if (curr != n) {
        result.add(n);
      }
      currSet = (Set) currSet.getRest();
    }
    return result;
  }

}
