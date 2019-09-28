package edu.neu.ccs.cs5004.lab5.problem1;

/**
 * Represents the empty list of integers.
 */


public class Empty implements List {


  /**
   * {@inheritDoc}
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    } else {
      return true;
    }
  }


  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode() {
    return 42;
  }

  @Override
  public String toString() {
    return "Empty{}";
  }


  @Override
  public Integer size() {      // <2>
    return 0;
  }

  @Override
  public Boolean isEmpty() {
    return true;
  }

  @Override
  public List add(Integer element) {
    return new Cons(element, this);
  }

  @Override
  public Integer last() throws InvalidCallException {
    throw new InvalidCallException("Called last() on empty!");
  }

  @Override
  public Boolean contains(Integer element) {
    return false;
  }

  @Override
  public Integer elementAt(Integer index) throws InvalidIndexException {
    throw new InvalidIndexException("the list if empty.");
  }
}