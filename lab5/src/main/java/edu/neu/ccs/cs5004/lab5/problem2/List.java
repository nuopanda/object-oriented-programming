package edu.neu.ccs.cs5004.lab5.problem2;

public interface List {
  /**
   * Returns true if empty and false otherwise
   */
  boolean isEmpty();


  /**
   * Returns the total number of elements in the list.
   *
   * @return number of elements in this list
   */
  Integer size();

  /**
   * Return true if element is in the list and false otherwise.
   *
   * @param element element to be checked if in the list
   * @return whether the element is in the list
   */
  boolean contains(String element);
  /**
   * Given a new element  prepend it to this list.
   *
   * @param element new element to add to the list
   * @return updated list with {@code element} prependeds
   */
  List add(String element);
  /**
   * Return true if the elements of a list are all in the list and false otherwise.
   *
   * @param list all elements to be checked if in the list
   * @return whether the all elements is in the list
   */
  boolean containsAll(Object list);


  /**
   * Given a string length, return a list of elements whose length is shorter.
   *
   * @param length maximum string length
   * @return updated list with elements whose length is shorter than the given length
   */
  List filterLargerThan(Integer length);


  /**
   * Return true if the list has at least one duplicate element.
   *
   * @return true if list has duplicate element, false otherwise
   */
  boolean hasDuplicates();

  /**
   * Return the a new list with all duplicates removed.
   *
   * @return new list with all duplicates removed
   */
  List removeDuplicates();
}


