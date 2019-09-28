package edu.neu.ccs.cs5004.lab5.problem4;

public class SingleList implements List {

  /**
   * Represents a list of integers with List interface
   */
  private Integer first;
  private List rest;

  /**
   * Given a List and an integer to create a list.
   */
  public SingleList(Integer first, List rest) {
    this.first = first;
    this.rest = rest;
  }

  /**
   * Getter for property 'first'.
   *
   * @return Value for property 'first'.
   */
  public Integer getFirst() {
    return first;
  }

  /**
   * Getter for property 'rest'.
   *
   * @return Value for property 'rest'.
   */
  public List getRest() {
    return rest;
  }

  @Override
  public Integer size() {
    return (1 + this.getRest().size());
  }

  @Override
  public Boolean isEmpty() {
    if (this.size() != 0) {
      return false;
    }
    return true;
  }

  @Override
  public List add(Object element) {
    Integer curr = (Integer) element;
    return new SingleList(curr, this);
  }

  /**
   * Removes the first occurrence of the integer in	the	list.
   *
   * @param n element to be deleted if in the lists.
   */
  public List removeInteger(SingleList currList, Integer n, boolean findFlag) {
    SingleList result = new SingleList(null, null);
    while (!currList.isEmpty()) {
      Integer curr = currList.getFirst();
      if (curr != n) {
        result.add(n);
      } else if (curr == n) {
        if (findFlag == false) {
          findFlag = true;
        } else {
          result.add(n);
        }
      }
      currList = (SingleList) currList.getRest();
    }
    return result;
  }

  @Override
  public List removeAllInteger(Integer n) {
    SingleList result = new SingleList(null, null);
    SingleList currList = this;
    while (!currList.isEmpty()) {
      Integer curr = currList.getFirst();
      if (curr != n) {
        result.add(n);
      }
      currList = (SingleList) currList.getRest();
    }
    return result;
  }

  @Override
  public Integer sum() {
    Integer sum = 0;
    SingleList currList = this;
    while (!currList.isEmpty()) {
      sum += currList.getFirst();
      currList = (SingleList) currList.getRest();
    }
    return sum;
  }
}
