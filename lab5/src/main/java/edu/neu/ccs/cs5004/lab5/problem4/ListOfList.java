package edu.neu.ccs.cs5004.lab5.problem4;

public class ListOfList implements List {

  /**
   * Represents a list of list of integers with List interface
   */
  private List firstList;
  private List restList;
  private boolean findFlag;

  /**
   * Given a List and a list of lists create a list of lists.
   */
  public ListOfList(List firstList, List restList) {
    this.firstList = firstList;
    this.restList = restList;
  }

  /**
   * Getter for property 'first'.
   *
   * @return Value for property 'first'.
   */
  public List getFirst() {
    return this.firstList;
  }

  /**
   * Getter for property 'rest'.
   *
   * @return Value for property 'rest'.
   */
  public List getRest() {
    return this.restList;
  }

  @Override
  public Integer size() {
    return (1 + this.getRest().size());
  }

  @Override
  public Boolean isEmpty() {
    if (this.size() == 0) {
      return true;
    }
    return false;
  }

  @Override
  public List add(Object element) {
    List curr = (List) element;
    return new ListOfList(curr, this);
  }

  /**
   * Removes the first occurrence of the integer in	the	list.
   *
   * @param n element to be deleted if in the lists.
   */
  public List removeInteger(Integer n) {
    ListOfList result = new ListOfList(null, null);
    ListOfList currListOfList2 = this;
    while (!currListOfList2.isEmpty()) {
      SingleList currSingleList = (SingleList) currListOfList2.getFirst();
      result.add(currSingleList.removeInteger(currSingleList, n, findFlag));
      currListOfList2 = (ListOfList) currListOfList2.getRest();
    }
    return result;
  }

  @Override
  public List removeAllInteger(Integer n) {
    ListOfList result = new ListOfList(null, null);
    ListOfList currListOfList2 = this;
    while (!currListOfList2.isEmpty()) {
      result.add(((SingleList) currListOfList2.getFirst()).removeAllInteger(n));
      currListOfList2 = (ListOfList) currListOfList2.getRest();
    }
    return result;
  }

  @Override
  public Integer sum() {
    return null;
  }
}
