package edu.neu.ccs.cs5004.lab5.problem2;

import java.util.HashSet;
import java.util.Set;

public class ListOfString implements List {

  private String first;
  private List rest;

  public ListOfString(String first, List rest) {
    this.first = first;
    this.rest = rest;
  }

  /**
   * Getter for the first String.
   *
   * @return the first String.
   */
  public String getFirst() {
    return first;
  }

  /**
   * Getter for the rest list.
   *
   * @return the rest list.
   */
  public List getRest() {
    return rest;
  }

  @Override
  public Integer size() {
    return 1 + this.getRest().size();
  }

  @Override
  public boolean isEmpty() {
    if (this.getFirst() == null) {
      return true;
    }
    return false;
  }

  @Override
  public List add(String element) {
    return new ListOfString(element, this);
  }

  @Override
  public boolean contains(String element) {
    if (this.getFirst().equals(element)) {
      return true;
    } else {
      return this.getRest().contains(element);
    }
  }

  @Override
  public boolean containsAll(Object list) {
    ListOfString stringList = (ListOfString) list;
    if (!this.contains(stringList.getFirst())) {
      return false;
    }
    return this.containsAll(stringList.getRest());
  }

  @Override
  public List filterLargerThan(Integer length) {
    ListOfString result = new ListOfString(null, null);
    ListOfString currList = this;
    while (!currList.isEmpty()) {
      String curr = currList.getFirst();
      if (curr.length() <= length) {
        result.add(curr);
      }
      currList = (ListOfString) currList.getRest();
    }
    return currList;
  }


  @Override
  public boolean hasDuplicates() {
    Set<String> set = new HashSet<>();
    return this.hasDuplicatesHelper(set, this);
  }

  public boolean hasDuplicatesHelper(Set<String> set, List list) {
    String curr = ((ListOfString) list).getFirst();
    if (curr == null) {
      return false;
    }
    if (set.contains(curr)) {
      return true;
    } else {
      set.add(curr);
      return hasDuplicatesHelper(set, ((ListOfString) list).getRest());
    }
  }

  @Override
  public List removeDuplicates() {
    Set<String> set = new HashSet<>();
    ListOfString result = new ListOfString(null, null);
    ListOfString currList = this;
    while (!currList.isEmpty()) {
      String curr = currList.getFirst();
      if (!set.contains(curr)) {
        set.add(curr);
        result.add(curr);
      }
      currList = (ListOfString) currList.getRest();
    }
    return currList;

  }

}
