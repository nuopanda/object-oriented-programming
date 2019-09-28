package edu.neu.ccs.cs5004.lab5.problem1;

/**
 * Represents a ListOfList of Integers
 */
public interface List {

  /**
   * Returns the total number of elements in the list.
   *
   * @return number of elements in this list
   */
  Integer size();                                // <1>


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
  List add(Integer element);

  /**
   * Return true if element is in the list and false otherwise.
   *
   * @param element element to be checked if in the list
   * @return whether the element is in the list
   */
  Boolean contains(Integer element);

  /**
   * Return the element found at index in the list.
   *
   * @param index index of the list
   * @return the element found at index int the list
   * @throws Exception if the value of index is outside the bounds of the list
   */
  Integer elementAt(Integer index);

  /**
   * Return the last element of this list.
   *
   * @return the last element of this list.
   */
  Integer last();
}