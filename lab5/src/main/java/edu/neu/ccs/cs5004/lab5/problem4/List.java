package edu.neu.ccs.cs5004.lab5.problem4;

/**
 * Represents a ListOfList of Integers
 */
public interface List {

  /**
   * Returns the total number of elements in the list.
   *
   * @return number of elements in this list
   */
  Integer size();


  /**
   * Returns true if empty and false otherwise.
   */
  Boolean isEmpty();

  /**
   * Given a new element {@code element} prepend it to this list.
   *
   * @param element new element to add to the list
   * @return updated list with {@code element} prependeds
   */
  List add(Object element);

  /**
   * Removes the all occurrences of the integer in	the	list.
   *
   * @param n element to be deleted if in the lists.
   */
  List removeAllInteger(Integer n);

  /**
   * Returns the total number of integers in the list.
   *
   * @return number of integers in this set
   */
  Integer sum();
}