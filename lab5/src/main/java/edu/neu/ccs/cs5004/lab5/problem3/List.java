package edu.neu.ccs.cs5004.lab5.problem3;


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
  List add(Integer element);

  /**
   * Return true if element is in the list and false otherwise.
   *
   * @param element element to be checked if in the list
   * @return whether the element is in the list
   */
  Boolean contains(Integer element);

}