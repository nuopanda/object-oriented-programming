package edu.neu.ccs.cs5004.assignment5.problem2;

public class Empty extends AbstractBagOfWordList {

  /**
   * Represents an empty BagOfWords.
   */
  public Empty() {

  }

  @Override
  public Boolean isEmpty() {
    return true;
  }

  @Override
  public String getFirst() {
    return null;
  }

  @Override
  public BagOfWordsList getRestOfBag() {
    return null;
  }


  @Override
  public Integer size() {
    return 0;
  }


  @Override
  public Boolean contains(String word) {
    return false;
  }

  @Override
  public String toString() {
    return "Empty{}";
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return 42;
  }

}
